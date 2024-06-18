
# Aplicação Spring Boot Multi-Tenant com PostgreSQL

## Visão Geral
Este projeto é uma aplicação Spring Boot que demonstra uma arquitetura multi-tenant usando PostgreSQL. A aplicação é projetada para suportar múltiplos tenants, mantendo bancos de dados separados para cada um. Ela fornece uma base para construir aplicações multi-tenant escaláveis, de fácil manutenção e seguras.

### Funcionalidades
* Suporte a Multi-Tenant: Bancos de dados separados para cada tenant.
* Integração com PostgreSQL: Utiliza o PostgreSQL como banco de dados principal.
* Troca Dinâmica de Banco de Dados: Muda dinamicamente o banco de dados com base no tenant.
* Segurança e Isolamento de Dados: Identificação segura dos tenants e isolamento de dados.
* API RESTful: Endpoints para gerenciamento de dados dos tenants.

### Tecnologias Utilizadas
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Hibernate
* Maven