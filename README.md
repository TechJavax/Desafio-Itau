
# <API REST ITAU>

## 📘 Sobre a Aplicação

O projeto **<API REST ITAU>** consiste em uma API RESTful desenvolvida com foco em simular a criação de transações bancárias dentro do App Itau Banking: ex. gerenciamento de transações financeiras, criação e deleção de transações, estatísticas dessas transações. Esta aplicação implementa funcionalidades essenciais de um sistema CRUD, incluindo:

- `POST /transactions`: criação de novas transações.
- `DELETE /transactions`: remoção de todas as transações.
- `GET /statistics`: consulta de estatísticas agregadas das transações armazenadas.

A aplicação foi desenvolvida utilizando a tecnologia **Spring Boot**, com o objetivo de fornecer uma arquitetura limpa, escalável e de fácil manutenção, adequada para ambientes corporativos ou acadêmicos.

---

## 🔧 Pré-requisitos

Antes de executar a aplicação, certifique-se de que os seguintes requisitos estejam instalados em seu ambiente local:

- **JDK 17**
- **Maven 3.2+**
- **Docker** (opcional, para execução containerizada)

#### Obs: Durante o desenvolvimento da aplicação não foi utilizado nem um banco de dados pois o intuito da aplicação era a demonstração de como ficaria a implementação dessa API.

---

## 🧪 Instalação e Execução

### Clonagem do Projeto

```bash
git clone <URL_DO_REPOSITORIO>
cd <PASTA_DO_PROJETO>
```

### Build e Execução

```bash
mvn clean install
mvn spring-boot:run
```

### Docker (opcional)

```bash
docker build -t <nome-da-imagem> .
docker run -p 8080:8080 <nome-da-imagem>
```

---

## 🚀 Exemplos de Requisição (Postman)

### 1. Criar Transação

- **Método:** `POST`
- **URL:** `http://localhost:8080/transactions`
- **Body (JSON):**
```json
{
  "amount": 100.50,
  "timestamp": "2025-05-27T14:30:00Z"
}
```

---

### 2. Limpar Transações

- **Método:** `DELETE`
- **URL:** `http://localhost:8080/transactions`

---

### 3. Obter Estatísticas

- **Método:** `GET`
- **URL:** `http://localhost:8080/statistics`

- **Resposta esperada:**
```json
{
  "sum": 250.75,
  "avg": 125.38,
  "max": 150.25,
  "min": 100.50,
  "count": 2
}
```

---

## 🛠️ Tecnologias Utilizadas

- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- Docker

---

## 🤝 Como Contribuir

1. Faça um fork do projeto
2. Crie uma branch com sua feature (`git checkout -b minha-feature`)
3. Commit suas alterações (`git commit -m 'feat: minha nova feature'`)
4. Faça push para a sua branch (`git push origin minha-feature`)
5. Abra um Pull Request
