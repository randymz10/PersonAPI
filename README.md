# API Person

Simple RestFul API feita com spring boot que faz operações CRUD (create, read, update e delete) dentro de uma tabela num banco de dados MySQL

---

## Requisitos

- Java 8
- Maven

## Instruções

Para executar esta API deve se abrir o powershell (Windows) ou bash (linux), ir ao diretorio do projeto com `cd` e executar o seguinte comando: `./mvnw spring-boot:run`.

## Tecnologias

- Java 8
- Springboot
- MySQL
- AWS

## EndPoints

| Metodo | Rota      |  Descrição             |
|--------|-----------|------------------------|
| GET    | /api      | Lista todas as pessoas |
| GET    | /api/{id} | Detalha uma pessoa     |
| POST   | /api      | Cria uma pessoa        |
| PUT    | /api/{id} | Edita uma pessoa       |
| DELETE | /api/{id} | Deleta uma pessoa      |

## Author

[@randymz10](https://github.com/randymz10)
