# RestAssured Serverest - API


![Java](https://img.shields.io/badge/Java-23-blue)
![Maven](https://img.shields.io/badge/Maven-3.9.9-blue)
![RestAssured](https://img.shields.io/badge/RestAssured-3.8.1-blue)
![JUnit](https://img.shields.io/badge/JUnit-5-blue)


## Descrição

Projeto de testes automatizados de API utilizando **Java + RestAssured** para testar endpoints da [Serverest](https://serverest.dev/).


## Tecnologias Utilizadas

- **Java SDK 23.0.2** - Linguagem de programação
- **Maven 3.9.9** - Gerenciamento de dependências
- **JUnit 5.3.2** - Framework de testes unitários
- **RestAssured 3.8.1** - Biblioteca para testes de API
- **Maven Surefire Plugin 3.0.0-M7** - Execução dos testes e relatórios

## Pré-requisitos
Antes de executar o projeto, certifique-se de ter os seguintes requisitos instalados:

- **Java SDK 23.0.2** ou superior
- **Maven 3.9.9** ou superior
- **IDE** (Utilizei o IntelliJ) 

### Como Instalar as Ferramentas

#### **Instalar o Java JDK 17**
Baixe e instale o JDK 23 pelo site oficial:
[Download Java JDK 23](https://www.oracle.com/java/technologies/downloads/)

Após a instalação, verifique se o Java está corretamente configurado:
```sh
javac -version
```

#### **Instalar o Maven**
Baixe e instale o Maven pelo site oficial:
[Download Apache Maven](https://maven.apache.org/download.cgi)

Após a instalação, verifique se o Maven está configurado corretamente:
```sh
mvn -version
```

## Configuração do Ambiente

Para rodar o projeto, você precisará:

1. **Java SDK 23.0.2** instalado e configurado no `JAVA_HOME`.
2. **Maven 3.9.9** instalado.
3. Clonar este repositório:

```sh
 git clone https://github.com/uebersantos/restassured-serverest.git
```

4. Acessar o diretório do projeto:

```sh
 cd restassured-serverest
```

## Execução dos Testes

Os testes podem ser executados via Maven:

```sh
 mvn clean test
```

### Gerando Relatório Surefire

Após a execução dos testes, o relatório estará disponível em:

```sh
 target/site/surefire-report.html
```

Abra o arquivo `surefire-report.html` no navegador para visualizar os resultados.

## Estrutura do Projeto

```
restassured-serverest/
│── src/
│   ├── main/ 
│   ├── test/
│   │   ├── java/
│   │   │   ├── LoginTest.java
│── pom.xml (Configuração do Maven e dependências)
│── .gitignore (Arquivos ignorados pelo Git)
│── README.md (Documentação do projeto)
```

___

Este projeto foi desenvolvido por [Ueber](https://br.linkedin.com/in/uebersyemmer).

