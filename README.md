# 🛠️ Atendimento CLI - Gerenciador de Atendimentos em Java

Este é um projeto simples desenvolvido em Java puro com foco em praticar os fundamentos da linguagem, estruturação em camadas (model, repository, service, cli) e boas práticas de programação orientada a objetos. Trata-se de um sistema de **CRUD para gerenciamento de atendimentos**, executado diretamente pelo terminal (CLI).

## 📌 Objetivo

O objetivo deste projeto é consolidar o aprendizado em Java e preparar a base para, futuramente, evoluir este sistema para uma aplicação web com **Spring Boot**, **JPA** e **banco de dados relacional** (MySQL ou PostgreSQL).

---

## 🚀 Funcionalidades

- ✅ Criar novo atendimento
- ✅ Listar todos os atendimentos
- ✅ Buscar atendimento por ID
- ✅ Buscar atendimentos por nome do cliente
- ✅ Atualizar dados de um atendimento existente
- ✅ Remover um atendimento
- ✅ Validação de status com opções fixas:
    - `Aberto`
    - `Em andamento`
    - `Concluído`

---

## 🧑‍💻 Como Executar o Projeto

### Pré-requisitos

- Java 17 ou superior
- Um IDE como IntelliJ, Eclipse ou VS Code com extensão para Java
- Git (opcional)

### Passo a passo

1. Clone o repositório (ou baixe como .zip)

```bash
git clone https://github.com/ppablolds/gerenciamento-de-atendimentos.git
cd gerenciamento-de-atendimentos/src
```

2. Abra o projeto na sua IDE favorita.
3. Compile e execute o arquivo Main.java.
```bash
javac Main.java
java Main.java
```
4. Use o menu interativo no terminal para manipular os atendimentos.

---

## 🧠 Exemplos de uso

### Criando um novo atendimento

Nome do cliente: João Silva<br />
Tipo de atendimento: Suporte Técnico<br />
Descrição: Erro ao acessar o sistema

### Atualizando um atendimento

ID do atendimento a atualizar: 1<br />
Novo nome do cliente: João Silva<br />
Novo tipo de atendimento: Suporte Técnico<br />
Nova descrição: Atualização pendente<br />
Novo status: Em andamento

---

## 🌱 Próximos passos

 - Migrar para aplicação web com Spring Boot 
 - Persistência com banco de dados (MySQL)
 - Testes unitários com JUnit 
 - Documentação com Swagger 
 - Deploy na nuvem com Render ou Railway

---

### 👨‍🎓 Autor

Desenvolvido por Pablo Silva — projeto de prática para reforço de conhecimentos em Java.
Se quiser bater um papo ou dar feedback, me chama no [LinkedIn](https://www.linkedin.com/in/ppablolds/)! 😊

---

### 📄 Licença

Este projeto está sob a [licença](LICENSE) MIT. Sinta-se livre para usar e contribuir!