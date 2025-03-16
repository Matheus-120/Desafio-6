# APP Full Stack de Agendamento de Barbearia com Java e Angular

## Sobre o Projeto
Este projeto é um sistema completo de agendamento para barbearias, desenvolvido utilizando **Java** no back-end e **Angular** no front-end. A aplicação permite que os clientes agendem serviços, visualizem horários disponíveis e gerenciem suas marcações de forma prática e eficiente.

O projeto foi apresentado por **Matheus Ferreira**. Confira mais no GitHub: [Matheus-120](https://github.com/Matheus-120)

---

## Tecnologias Utilizadas
### **Front-end:**
- Angular  
- TypeScript  
- HTML e CSS  
- Angular CLI  

### **Back-end:**
- Java  
- Spring Boot  
- JPA/Hibernate  
- Banco de dados PostgreSQL  

### **Infraestrutura:**
- Docker (opcional)  
- Railway para deploy  
- API REST  

---

## Como Executar o Projeto
### **1. Clone o Repositório**
```sh
 git clone https://github.com/Matheus-120/barber-shop-app.git
 cd barber-shop-app
```

### **2. Configurar o Back-end (Spring Boot)**
1. Instale as dependências:
```sh
 cd backend
 mvn install
```
2. Configure o banco de dados no arquivo `application.properties`
3. Inicie o servidor:
```sh
 mvn spring-boot:run
```

### **3. Configurar o Front-end (Angular)**
1. Instale as dependências:
```sh
 cd frontend
 npm install
```
2. Inicie o servidor Angular:
```sh
 ng serve --open
```

---

## Estrutura do Projeto
```
barber-shop-app/
│
├── backend/         # API REST com Spring Boot
│   ├── src/main/java/com/barbershop
│   ├── application.properties
│   └── pom.xml
│
├── frontend/        # Interface com Angular
│   ├── src/app
│   ├── angular.json
│   └── package.json
```

---

## Funcionalidades
- [x] Listagem de horários disponíveis  
- [x] Agendamento de serviços  
- [x] Edição e cancelamento de agendamentos  
- [x] Integração entre o front-end e back-end  
- [x] Deploy na nuvem com Railway  

---

## Autor
**Matheus Ferreira**  
GitHub: [Matheus-120](https://github.com/Matheus-120)  

