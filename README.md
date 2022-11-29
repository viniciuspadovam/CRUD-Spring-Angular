# Projeto

Projeto criado para estudar, além das tecnologias usadas, o padrão MVC e todas as operações de um CRUD padrão.      
Operações do CRUD realizadas com a entidade `Products`.

## Tecnologias usadas 📚

- Frontend
    - Angular
    - Angular Material
    - TypeScript

- Backend (Java)
    - Spring Boot
    - Spring Data (Hibernate e MySQL)
    - Spring MVC (Tomcat)
    - Spring Security (CORS)
    - Maven
    - Lombok

## Como Configurar o Projeto 🛠


### Backend 🗜

**Instalação**   
Este projeto foi criado com Maven, então basta importar para sua IDE e fazer o build.

**Configuração do banco de dados**   
Crie um banco de dados chamado `lojinha` e adicione as configurações abaixo em `/resources/application.properties` alterando as credenciais do seu banco.

```
spring.datasource.url=jdbc:mysql://localhost:3306/lojinha
spring.datasource.username=root
spring.datasource.password=12345
 
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
```

**Como iniciar**  
Inicie o projeto pela IDE e acesse <http://localhost:8080/api> no navegador.

---

### Frontend 💻

**Instalação**   
`npm install -g @angular/cli` para instalar o Angular (global).   
`npm install` para instalar todos os pacotes do Node.

**Como Iniciar**   
Execute `npm start` no cmd e acesse <http://localhost:4200> no navegador.

## Redes Sociais 🖖

[Linkedin](http://www.linkedin.com/in/viniciuspadovam)
