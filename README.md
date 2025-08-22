# Sistemas Web 2 — Venda de Ingressos 🎟️

Este repositório contém os códigos e atividades desenvolvidos durante a disciplina **Sistemas Web 2**, do curso de **Sistemas de Informação** da Universidade Federal de Ouro Preto (UFOP). O projeto consiste em uma aplicação completa para **venda de ingressos**, construída com uma arquitetura de **microsserviços**, visando separação de responsabilidades, escalabilidade e manutenibilidade.

O backend foi desenvolvido em conjunto com o professor, abordando conceitos práticos de aplicações web modernas com **Java 17 e Spring Boot**, enquanto o frontend foi desenvolvido individualmente como parte do trabalho prático 2 em **React + TypeScript**, consumindo os serviços do backend e oferecendo uma interface rica e funcional.

---

## 🏛️ Arquitetura

A aplicação segue uma **arquitetura de microsserviços**, com os seguintes componentes principais:

- **Gateway Service:** Ponto de entrada único para todas as requisições do frontend, responsável pelo roteamento para os microsserviços apropriados.
- **Name Server (Eureka):** Implementa **Service Discovery**, permitindo que os microsserviços se registrem e se descubram dinamicamente.
- **Users Service:** Gerencia operações relacionadas a usuários, como cadastro, autenticação e gerenciamento de dados.
- **Sales Service:** Responsável pela lógica de negócios de eventos e vendas de ingressos, incluindo criação de eventos, registro de vendas e atualização de status.
- **Notifications Service:** Encarregado de enviar notificações aos usuários sobre eventos importantes.
- **Frontend:** Interface de usuário em React + TypeScript para interação com o sistema.

---

## ✨ Funcionalidades Principais

A plataforma oferece funcionalidades completas para **administração e gerenciamento de vendas de ingressos**:

- **Dashboard:** Visão geral com estatísticas de vendas, eventos ativos e ingressos vendidos.
- **Gerenciamento de Eventos:**  
  - Criação, visualização, atualização e exclusão de eventos.  
  - Definição de tipos de evento (Show, Teatro, Palestra, Curso).
- **Gerenciamento de Vendas:**  
  - Registro de novas vendas associadas a usuários e eventos.  
  - Visualização e filtragem de vendas por status (Pago, Em Aberto, Cancelado, Estornado).  
  - Atualização do status de cada venda.
- **Relatórios:**  
  - Análise de performance de vendas e eventos.  
  - Visualização da receita total, ingressos vendidos e clientes únicos.  
  - Exportação de relatórios em CSV.

---

## 🧰 Tecnologias Utilizadas

**Backend:**

- Java 17  
- Spring Boot 3  
- Spring Cloud: Gateway, Netflix Eureka, OpenFeign  
- Spring Data JPA (Hibernate)  
- Maven  
- PostgreSQL  

**Frontend:**

- React 19  
- TypeScript  
- Vite  
- React Router DOM  

**Infraestrutura:**

- Docker & Docker Compose (orquestração de serviços e banco de dados)

---

## 🚀 Como Executar o Projeto Localmente

### 1️⃣ Pré-requisitos

- Docker e Docker Compose  
- Java 17 ou superior  
- Node.js 18+ e npm  
- Maven  

---

### 2️⃣ Configuração da Infraestrutura (Backend)

O ambiente de banco de dados é gerenciado via Docker Compose:

```bash
cd Codes/ticket
docker-compose -f docker-compose-dev.yaml up -d
```
Isso criará os bancos e usuários necessários para cada microsserviço.

---

### 3️⃣ Executando os Microsserviços (Backend)
A ordem recomendada de execução:

Name Server:

```bash
cd Codes/ticket/nameserver
mvn spring-boot:run
```
Users Service:

```bash
cd Codes/ticket/user
mvn spring-boot:run
```
Sales Service:

```bash
cd Codes/ticket/sales
mvn spring-boot:run
```
Notifications Service:

```bash
cd Codes/ticket/notifications/notifications
mvn spring-boot:run
```
Gateway Service:

```bash
cd Codes/ticket/gateway
mvn spring-boot:run
```
Verifique o registro dos serviços no Eureka: http://localhost:8761

---

### 4️⃣ Executando o Frontend
```bash
cd frontend
npm install
npm run dev
```
Acesse a aplicação em: http://localhost:5173

### 📚 Estrutura do Repositório
```bash
├─ Codes/           # Microsserviços e backend
│  ├─ gateway/
│  ├─ nameserver/
│  ├─ user/
│  ├─ sales/
│  └─ notifications/
├─ frontend/        # Aplicação React + TypeScript
├─ Assignments/     # Atividades e exercícios da disciplina
├─ Docs/            # Documentos auxiliares e anotações
├─ LectureNotes/    # Notas de aula
└─ .vscode/         # Configurações do VS Code
```
### ✅ Boas práticas e contribuições
- Commits claros: feat(users): endpoint GET /users
- Branches: feat/*, fix/*, docs/*
- Pull Requests: descreva problema, solução e validação
- Code style: siga padrões do projeto (formatter IDE, ESLint/Prettier no frontend)

### 🧭 Roadmap sugerido
 Documentar endpoints de cada serviço (README por pasta)

 Criar docker-compose.yml completo para orquestrar todos os microsserviços

 Automatizar build/test via GitHub Actions

 Publicar collection do Postman/Insomnia em Docs/

 Adicionar testes end-to-end (Playwright/Cypress)

### 🔒 Licença
Nenhuma licença definida. Todo o código é protegido por direitos autorais.

### 👤 Créditos
Projeto acadêmico desenvolvido na UFOP na disciplina Sistemas Web 2, com colaboração do professor e desenvolvimento de frontend pelo autor do repositório.
