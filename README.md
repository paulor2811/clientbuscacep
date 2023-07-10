# BuscaCEP

O BuscaCEP é um aplicativo simples em Java que permite buscar informações de endereço com base em um CEP fornecido pelo usuário. Ele usa a API ViaCEP para obter os dados de endereço.

## Pré-requisitos

- Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.

## Instalação e Execução

1. Clone o repositório do BuscaCEP em seu ambiente local.
2. Abra o projeto em sua IDE Java preferida.
3. Certifique-se de que as bibliotecas externas estejam configuradas corretamente. No diretório `lib`, você encontrará o arquivo `gson-2.8.2.jar`, que é a biblioteca Gson necessária para analisar os dados JSON.
4. Compile e execute o projeto.

## Uso

1. Na interface do BuscaCEP, insira um CEP no campo de texto.
2. Clique no botão "Buscar".
3. O aplicativo enviará uma solicitação à API ViaCEP para obter os dados do endereço correspondentes ao CEP fornecido.
4. Os detalhes do endereço serão exibidos em uma caixa de diálogo.

## Estrutura do Projeto

O projeto BuscaCEP consiste nos seguintes pacotes e classes:

- `io.github.paulor2811.clientbuscacep.Main`: Classe principal que inicia o aplicativo.
- `io.github.paulor2811.clientbuscacep.core`:
  - `Address`: Classe que representa os atributos do endereço, como CEP, logradouro, bairro, cidade, estado, etc. Ela possui os métodos getters e setters correspondentes para cada atributo.
  - `ClientBuscaCEP`: Classe responsável pela lógica do aplicativo. Ela cria a interface do usuário, lida com os eventos do botão e chama o ViaCEP para obter os dados do endereço.
- `io.github.paulor2811.clientbuscacep.viacep`:
  - `ViaCEP`: Classe responsável por enviar a solicitação HTTP à API ViaCEP e obter os dados do endereço correspondentes ao CEP fornecido.
- `io.github.paulor2811.clientbuscacep.ui`:
  - `UI`: Classe responsável por criar a interface do usuário e gerenciar os componentes gráficos.
  - `UILabel`: Classe responsável por criar e posicionar o rótulo de texto "Insira o CEP".
  - `UITextField`: Classe responsável por criar e posicionar o campo de texto para inserir o CEP.
  - `UIButton`: Classe responsável por criar e posicionar o botão "Buscar".
- `io.github.paulor2811.clientbuscacep.util`:
  - `Util`: Classe de utilitário que contém métodos auxiliares, como a conversão de dados JSON em String.

## Dependências

O projeto utiliza a biblioteca Gson (Google JSON) para analisar os dados JSON retornados pela API ViaCEP. A biblioteca Gson está incluída no diretório `lib` como `gson-2.8.2.jar`. Certifique-se de que essa biblioteca esteja configurada corretamente em seu ambiente de desenvolvimento.

## Contribuição

O BuscaCEP é um projeto simples e atualmente não há planos para adicionar novos recursos ou funcionalidades. No entanto, se você tiver alguma sugestão ou encontrar algum problema, sinta-se à vontade para abrir uma issue no repositório do projeto.

## Licença

Este projeto é licenciado sob a licença MIT. Consulte o arquivo LICENSE para obter mais detalhes.
