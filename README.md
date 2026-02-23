# User Management API

Uma API REST robusta para gerenciamento de usuários, endereços e telefones, desenvolvida com **Spring Boot** e protegida por **JWT (JSON Web Token)**.

## 🚀 Tecnologias

- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA**
- **Spring Security**
- **SJJWT (io.jsonwebtoken)**: Para autenticação baseada em tokens.
- **Lombok**: Para código limpo e redução de boilerplate.
- **BCrypt**: Para criptografia segura de senhas.
- **Gradle**: Ferramenta de build e gestão de dependências.

## 🛠️ Funcionalidades

- **Gerenciamento de Usuários**: Cadastro, atualização, busca por e-mail e exclusão.
- **Endereços e Telefones**: Vínculo de múltiplos endereços e telefones a um único usuário.
- **Segurança**:
  - Autenticação Stateless via JWT.
  - Criptografia de senhas com BCrypt.
  - Proteção de endpoints sensíveis.
- **Conversão de Dados**: Uso de DTOs e Converters para isolar a camada de persistência da camada de API.

## 📋 Endpoints Principais

### Usuário
- `POST /usuario`: Cadastra um novo usuário.
- `POST /usuario/login`: Realiza login e retorna um Token Bearer.
- `GET /usuario?email={email}`: Busca dados de um usuário pelo e-mail.
- `PUT /usuario`: Atualiza dados do usuário logado (requer Token).
- `DELETE /usuario/{email}`: Remove um usuário por e-mail.

### Endereço e Telefone
- `POST /usuario/endereco`: Adiciona endereço ao usuário logado.
- `PUT /usuario/endereco?id={id}`: Atualiza um endereço existente.
- `POST /usuario/telefone`: Adiciona telefone ao usuário logado.
- `PUT /usuario/telefone?id={id}`: Atualiza um telefone existente.

## 🔑 Autenticação

Para acessar endpoints protegidos, inclua o token JWT no cabeçalho das requisições:
```http
Authorization: Bearer <seu_token_aqui>
```

## ⚙️ Como Executar

1. **Pré-requisitos**: JDK 17+ instalado.
2. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/usuario.git
   ```
3. **Configure o Banco de Dados**: Ajuste o arquivo `src/main/resources/application.properties` com suas credenciais.
4. **Execute a aplicação**:
   ```bash
   ./gradlew bootRun
   ```

---
*Desenvolvido por [Luizgsch](https://github.com/Luizgsch)*
