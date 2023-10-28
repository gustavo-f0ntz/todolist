# Todolist

## Introdução

O Aplicativo Todolist é uma aplicação de gerenciamento de tarefas desenvolvida em Java com o uso do framework Spring Boot. Esta aplicação permite que os usuários criem, atualizem, visualizem e excluam tarefas em suas listas de afazeres. Esta documentação fornece uma visão geral do aplicativo, suas funcionalidades e instruções sobre como executá-lo localmente.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal usada para desenvolver o aplicativo.
- **Spring Boot**: Um framework que simplifica o desenvolvimento de aplicativos Java com configuração mínima.
- **Spring Data JPA**: Parte do projeto Spring Data, que facilita a implementação de repositórios baseados em JPA.
- **Banco de Dados H2**: Um banco de dados em memória usado para armazenar dados durante o desenvolvimento.
- **Docker**: Uma plataforma de containerização usada para empacotar o aplicativo e suas dependências.

## Funcionalidades

O Aplicativo Todolist oferece as seguintes funcionalidades:

- **Criação de Tarefas**: Os usuários podem criar novas tarefas com um título, descrição e data de vencimento.
- **Listagem de Tarefas**: Os usuários podem ver a lista de tarefas existentes.
- **Atualização de Tarefas**: As tarefas podem ser atualizadas, permitindo que os usuários modifiquem o título, a descrição e a data de vencimento.
- **Exclusão de Tarefas**: Os usuários têm a capacidade de excluir tarefas que não são mais necessárias.
- **Armazenamento em Banco de Dados**: As tarefas são armazenadas em um banco de dados H2 em memória.
- **Implantação com Docker**: O aplicativo pode ser empacotado em um contêiner Docker para facilitar a implantação.

## Instalação e Uso

Para executar o Aplicativo Todolist localmente, siga as etapas a seguir:

1. Clone o repositório para o seu ambiente de desenvolvimento:

   ```bash
   git clone https://github.com/gustavo-f0ntz/todolist.git

1- Abra o projeto em seu ambiente de desenvolvimento Java.

2- Compile e execute o aplicativo usando o Maven:
```bash
mvn spring-boot:run
```

3- Acesse o aplicativo no seu navegador em http://localhost:8080

## Implantação Com Docker

Para implantar o Aplicativo Todolist usando Docker, siga as etapas abaixo:

 1. Construa a imagem Docker a partir do diretório raiz do projeto:

 ```bash
 docker build -t todolist-app .
 ```

 2. Execute um contêiner Docker a partir da imagem construída:

 ```bash
 docker run -p 8080:8080 todolist-app
 ```

 3. Acesse o aplicativo implantado no seu navegador em http://localhost:8080

## Contribuições

Contribuições para o Aplicativo Todolist são bem-vindas. Consulte o repositório do projeto para diretrizes de contribuição e código de conduta.

## Licença

O Aplicativo Todolist é de código aberto e licenciado sob a Licença MIT. Consulte o arquivo LICENSE no repositório para obter detalhes.

## Agradecimentos

Agradeço à comunidade Spring Boot e ao Curso de Java da Rocketseat por fornecer ensinamentos valiosos que contribuíram para o desenvolvimento desta aplicação.

## Histórico de Versões

. Versão 1.0 (Data): Lançamento inicial com funcionalidades básicas de gerenciamento de tarefas.











