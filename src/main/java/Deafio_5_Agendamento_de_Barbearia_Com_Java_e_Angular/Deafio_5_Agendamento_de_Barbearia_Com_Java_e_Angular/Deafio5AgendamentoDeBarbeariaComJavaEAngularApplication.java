/* Criando um APP Full Stack de Agendamento de Barbearia com Java e Angular */

// 1. Instale o Angular CLI, caso ainda não tenha:
// npm install -g @angular/cli

// 2. Crie um novo projeto Angular:
// ng new barber-shop-ui

// 3. Navegue até a pasta do projeto:
// cd barber-shop-ui

// 4. Crie os componentes necessários:
// ng generate component components/header
// ng generate component components/footer
// ng generate component components/booking-list
// ng generate component components/booking-detail

// 5. Crie um serviço para manipular os agendamentos:
// ng generate service services/booking

// 6. Defina o modelo de agendamento em `src/app/models/booking.ts`
export interface Booking {
	id: number;
	customerName: string;
	service: string;
	date: string;
	time: string;
}

// 7. Implemente o serviço `BookingService` em `src/app/services/booking.service.ts`
import { Injectable } from '@angular/core';
		import { Booking } from '../models/booking';
		import { Observable, of } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class BookingService {
	private bookings: Booking[] = [
	{ id: 1, customerName: 'João Silva', service: 'Corte de Cabelo', date: '2025-03-12', time: '14:00' },
	{ id: 2, customerName: 'Carlos Souza', service: 'Barba Completa', date: '2025-03-13', time: '16:30' }
  ];

	getBookings(): Observable<Booking[]> {
		return of(this.bookings);
	}

	getBookingById(id: number): Observable<Booking | undefined> {
		return of(this.bookings.find(booking => booking.id === id));
	}
}

// 8. Configure o roteamento em `src/app/app-routing.module.ts`
import { NgModule } from '@angular/core';
		import { RouterModule, Routes } from '@angular/router';
		import { BookingListComponent } from './components/booking-list/booking-list.component';
		import { BookingDetailComponent } from './components/booking-detail/booking-detail.component';

		const routes: Routes = [
		{ path: '', component: BookingListComponent },
		{ path: 'booking/:id', component: BookingDetailComponent }
		];

@NgModule({
		imports: [RouterModule.forRoot(routes)],
exports: [RouterModule]
		})
export class AppRoutingModule { }

// 9. Rode o projeto localmente:
// ng serve --open
