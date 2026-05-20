# 🚀 TaskManager API

API REST desenvolvida com Spring Boot para gerenciamento de tarefas com autenticação JWT.

## 📌 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Security
- JWT Authentication
- Gradle
- H2 Database
- Swagger/OpenAPI
- JPA / Hibernate

---

## 🔐 Funcionalidades

✅ Cadastro de usuários  
✅ Login com JWT  
✅ Proteção de rotas  
✅ CRUD de tarefas  
✅ API RESTful  
✅ Tratamento global de exceções  

---

## 📂 Estrutura do Projeto

```bash
src/main/java
 ├── controller
 ├── service
 ├── repository
 ├── model
 ├── dto
 ├── security
 └── exception

🔑 Autenticação JWT

Após login:
POST /auth/login

A API retorna um token JWT.

Use o token nas rotas protegidas:
Authorization: Bearer seu_token

📌 Endpoints principais
Auth
Método	Endpoint
POST	/auth/register
POST	/auth/login
Tasks
Método	Endpoint
GET	/tasks
POST	/tasks
PUT	/tasks/{id}
DELETE	/tasks/{id}

▶️ Como executar o projeto
git clone https://github.com/diegosilva636/taskmanager-api.git

cd taskmanager-api

./gradlew bootRun

bootRun
📘 Swagger

Acesse:
http://localhost:8080/swagger-ui/index.html

👨‍💻 Autor

Desenvolvido por Diego Silva 🚀
