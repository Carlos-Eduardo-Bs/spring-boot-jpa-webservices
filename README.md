# Spring Boot JPA Web Services

## 📌 Descrição

Este projeto é uma **API REST desenvolvida com Java e Spring Boot**, utilizando **Spring Data JPA e Hibernate** para persistência de dados.

A aplicação simula um sistema de pedidos contendo **usuários, produtos, categorias e pedidos**, permitindo operações de CRUD e gerenciamento de relacionamentos entre entidades.

O objetivo do projeto é praticar conceitos importantes do desenvolvimento **backend com Java**, como:

* criação de APIs REST
* arquitetura em camadas
* modelagem de entidades
* relacionamentos JPA
* tratamento de exceções

---

# 🚀 Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* H2 Database
* REST API

---

# 🏗 Arquitetura do projeto

O projeto segue uma **arquitetura em camadas**, separando responsabilidades e facilitando a manutenção do código.

```
Controller (Resources)
↓
Service
↓
Repository
↓
Database
```

### Camadas

**Controller (Resources)**
Responsável por receber as requisições HTTP da API.

**Service**
Contém as regras de negócio da aplicação.

**Repository**
Responsável pelo acesso e manipulação dos dados no banco.

**Entities**
Representam as entidades do sistema e seus relacionamentos.

---

# 📊 Modelo de domínio

O sistema possui as seguintes entidades:

* User
* Order
* Product
* Category
* OrderItem
* Payment

### Relacionamentos utilizados

O projeto utiliza diferentes tipos de relacionamentos com JPA:

* One-to-Many
* Many-to-One
* Many-to-Many
* Many-to-Many com entidade intermediária
* One-to-One

### Exemplos

User → Orders
Order → OrderItems
Product → Categories
Order → Payment

---

# ⚙ Funcionalidades da API

A API permite realizar operações de CRUD para usuários.

### Endpoints

```
GET /users
GET /users/{id}

POST /users

PUT /users/{id}

DELETE /users/{id}
```

Esses endpoints permitem:

* listar usuários
* buscar usuário por ID
* criar usuário
* atualizar usuário
* deletar usuário

---

# ⚠ Tratamento de exceções

O projeto possui tratamento de exceções para evitar erros inesperados na API.

Exceções utilizadas:

**ResourceNotFoundException**

Lançada quando um recurso não é encontrado no banco de dados.

**DatabaseException**

Lançada quando ocorre erro de integridade no banco de dados.

Essas exceções são tratadas na camada de serviço para retornar respostas HTTP apropriadas.

---

# 💾 Banco de dados

O projeto utiliza **H2 Database em memória** para ambiente de teste.

Ao iniciar a aplicação, alguns dados são carregados automaticamente para facilitar testes da API.

### Console do banco H2

```
http://localhost:8080/h2-console
```

Configuração padrão:

```
JDBC URL: jdbc:h2:mem:testdb
User: sa
Password: (vazio)
```

---

# ▶ Como executar o projeto

### Pré-requisitos

* Java 17 ou superior
* Maven

### 1️⃣ Clonar o repositório

```
git clone https://github.com/seu-usuario/spring-boot-jpa-webservices.git
```

### 2️⃣ Entrar na pasta do projeto

```
cd spring-boot-jpa-webservices
```

### 3️⃣ Executar a aplicação

```
mvn spring-boot:run
```

A aplicação iniciará em:

```
http://localhost:8080
```

---

# 🎯 Objetivo do projeto

Este projeto foi desenvolvido com fins educacionais para praticar:

* desenvolvimento de APIs REST com Spring Boot
* persistência de dados com JPA/Hibernate
* modelagem de entidades
* relacionamentos entre tabelas
* arquitetura em camadas
* tratamento de exceções
