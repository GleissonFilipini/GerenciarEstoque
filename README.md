# GerenciarEstoque
Algoritmo que Gerencia estoque de 3 tipos de Produtos.

Usamos o conceito de herança(extends) nas classes:

•	Eletrônico
•	Perecível
•	Móvel

Estas 3 classes herdaram da superclasse Produto, seus principais atributos, e cada uma delas foi incluído novos atributos conforme seu tipo de produto. 

	A superclasse produto, foi atribuído o conceito de classe abstrata(Abstract) por não haver chamadas de métodos,

Nas classes usamos o conceito Private, com somente variáveis privadas, por consequência fora usado os métodos de Getters e Setters.
E para cada uma delas fora atribuído um único construtor sendo passado todas as variáveis da classe de produto em específica, puxando os métodos da classe de Herança <Produto>.
  
Utilizamos o método imprimir para todas as classes incluindo <Produto>.
  
Foi criada a classe Gerenciadora, classe <GerenciarProdutos>
  
Nesta classe utilizamos o conceito do Arraylist, onde usamos comandos da própria classe que seria o. add e o. remove.

Para o método de. add usado para adicionar produtos para o nosso gerenciador, usamos o conceito de instanceof, para instanciar uma outra classe do produto, assim adicionando um produto para a classe pedida.

Com a ajuda do Arraylist foi criado os métodos de busca, e os métodos de listagem de produtos. 
Outro conceito utilizado foi o LocalDate, pois o produto perecível necessitava de data de validade, usamos a entrada de teclado como um String e depois a transformando em LocalDate.

Main

Na main iniciamos o <GerenciarProdutos> para poder chamar todos os métodos de validações.
Usamos o conceito do Switch para fazer o menu do nosso sistema, dentro dele colocamos as opções disponíveis, adicionar, remover, buscar, listar.... entre outros
