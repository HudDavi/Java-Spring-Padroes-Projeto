# Projeto Spring Boot com Spring Cloud e Feign

Este é um projeto de exemplo de um aplicativo Spring Boot que utiliza o Spring Cloud e o Feign para se comunicar com um serviço externo para buscar informações de endereço com base no CEP. Ele inclui configurações de dependência e classes de serviço para demonstrar como o Spring Boot pode ser usado em conjunto com o Spring Cloud e o Feign para criar aplicativos de serviço.

## Visão Geral

Neste projeto de exemplo, são demonstradas as seguintes funcionalidades:

1. **Comunicação com o Serviço de Endereço Externo**: O projeto utiliza o Feign para se comunicar com um serviço externo (ViaCEP) e buscar informações de endereço com base no CEP fornecido.

2. **Persistência de Cliente com Endereço**: O projeto demonstra como salvar informações do cliente, incluindo um relacionamento com um modelo de endereço. Ele ilustra a criação, atualização, exclusão e busca de clientes.

## Configuração e Dependências

O projeto utiliza as seguintes dependências principais:

- **Spring Boot Starter Data JPA**: Para persistência de dados.
- **Spring Boot Starter Web**: Para criar um aplicativo da web.
- **Spring Cloud Starter OpenFeign**: Para comunicação com o serviço externo.
- **Springdoc OpenAPI Starter**: Para gerar documentação da API.

## Executando o Projeto

Para executar este projeto:

1. Clone ou faça o download deste repositório para a sua máquina local.
2. Importe o projeto em sua IDE Java preferida.
3. Execute a classe `App` para iniciar o aplicativo Spring Boot.

## Estrutura do Projeto

A estrutura do projeto é organizada em pacotes:

- **`padroes.projeto.app`**: Contém a classe principal do aplicativo e as configurações.
- **`padroes.projeto.app.controller.cliente`**: Contém o controlador do cliente para manipulação de solicitações relacionadas a clientes.
- **`padroes.projeto.app.model.cliente`**: Define o modelo de dados do cliente.
- **`padroes.projeto.app.model.endereco`**: Define o modelo de dados do endereço.
- **`padroes.projeto.app.service.cliente`**: Contém o serviço de cliente que lida com operações de cliente, incluindo salvar, buscar, atualizar e excluir.
- **`padroes.projeto.app.service.endereco`**: Contém o serviço de endereço que se comunica com o serviço externo (ViaCEP) para buscar informações de endereço com base no CEP fornecido.

## Uso

O aplicativo é uma API RESTful e oferece endpoints para manipular informações de cliente e obter informações de endereço com base no CEP fornecido. Você pode testar esses endpoints com um cliente REST (por exemplo, Postman ou cURL).

## Documentação da API

A documentação da API é gerada automaticamente e pode ser acessada na seguinte URL: [http://localhost:8080/openapi/swagger-ui.html](http://localhost:8080/openapi/swagger-ui.html)

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

## Autor

- Hudson Silva