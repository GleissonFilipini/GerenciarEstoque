package gerenciarestoque;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GerenciarEstoque {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        GerenciarProdutos ge = new GerenciarProdutos();

        int opcao;
        int opcao2;
        int codigo, voltagem, potencia;
        String nome;
        String fabricante, eficiencia, material;
        int quantidade;
        double valor;
        boolean refrigerado;
        LocalDate validade;

        do {
            System.out.println("******** MENU ************");
            System.out.println("1- Adicionar produto");
            System.out.println("2- Remover produto");
            System.out.println("3- Buscar por código");
            System.out.println("4- Listar Eletronicos");
            System.out.println("5- Listar Pereciveis");
            System.out.println("6- Listar Moveis");
            System.out.println("7- Listar estoque menor que o valor digitado");
            System.out.println("8- Listar estoque vazio");
            System.out.println("9- Listar por fabricante");
            System.out.println("10- Listar por Data de Validade");
            System.out.println("11- Vender produto");
            System.out.println("12- Comprar produto");
            System.out.println("13- ******** SAIR ************");

            opcao = e.nextInt();

            switch (opcao) {
                case 1:
                    //Adicionado produtos
                    do {

                        System.out.println("1- Eletronico");

                        System.out.println("2- Peracivel");
                        System.out.println("3- Movel");
                        System.out.println("4- Sair");

                        opcao2 = e.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.println("Produto Eletronico");
                                System.out.println("Qual o código do produto?");
                                codigo = e.nextInt();
                                e.nextLine();
                                System.out.println("Qual o nome do produto?");
                                nome = e.nextLine();
                                System.out.println("Qual o fabricante?");
                                fabricante = e.nextLine();
                                System.out.println("Qual a quantidade?");
                                quantidade = e.nextInt();
                                System.out.println("Qual o valor unitário?");
                                valor = e.nextDouble();

                                System.out.println("Digite a voltagem do produto");
                                voltagem = e.nextInt();
                                System.out.println("Qual a potencia do produto");
                                potencia = e.nextInt();
                                e.nextLine();
                                System.out.println("Qual a eficiencia do produto?");
                                eficiencia = e.nextLine();

                                Eletronico ele = new Eletronico(voltagem, potencia, eficiencia, codigo, nome, fabricante, quantidade, valor);
                                ge.adicionar(ele);
                                break;
                            case 2:
                                System.out.println("Produto Perecivel");
                                System.out.println("Qual o código do produto?");
                                codigo = e.nextInt();
                                e.nextLine();
                                System.out.println("Qual o nome do produto?");
                                nome = e.nextLine();
                                System.out.println("Qual o fabricante?");
                                fabricante = e.nextLine();
                                System.out.println("Qual a quantidade?");
                                quantidade = e.nextInt();
                                System.out.println("Qual o valor unitário?");
                                valor = e.nextDouble();

                                System.out.println("Produto é refrigerado?");
                                refrigerado = e.nextBoolean();
                                e.nextLine();
                                System.out.println("Qual a data de validade?");
                                String validade2 = e.nextLine();

                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                                validade = LocalDate.parse(validade2, formatter);

                                Perecivel per = new Perecivel(validade, refrigerado, codigo, nome, fabricante, quantidade, valor);
                                ge.adicionar(per);
                                break;
                            case 3:
                                System.out.println("Produto Movel");
                                System.out.println("Qual o código do produto?");
                                codigo = e.nextInt();
                                e.nextLine();
                                System.out.println("Qual o nome do produto?");
                                nome = e.nextLine();
                                System.out.println("Qual o fabricante?");
                                fabricante = e.nextLine();
                                System.out.println("Qual a quantidade?");
                                quantidade = e.nextInt();
                                System.out.println("Qual o valor unitário?");
                                valor = e.nextDouble();

                                e.nextLine();
                                System.out.println("Qual o tipo do material?");
                                material = e.nextLine();

                                Movel mo = new Movel(material, codigo, nome, fabricante, quantidade, valor);
                                ge.adicionar(mo);
                                break;
                        }
                    } while (opcao2 != 4);

                case 2:
                    //Removendo produtos
                    System.out.println("Digite o código do produto");
                    int codigo2 = e.nextInt();

                    if (ge.remover(codigo2)) {
                        System.out.println("removido com sucesso");
                    } else {
                        System.out.println("não removeu");
                    }
                    break;
                case 3:

                    //Buscar por código
                    System.out.println("Digite o código do produto");
                    codigo = e.nextInt();

                    ge.buscarPorCodigo(codigo);
                    break;
                case 4:

                    //Listar eletronicos
                    System.out.println("Produtos Eletrônicos");

                    System.out.println(ge.listarEletronico());
                    break;
                case 5:

                    //Listar Pereciveis    
                    System.out.println("Produtos Pereciveis");

                    System.out.println(ge.listarPerecivel());
                    break;
                case 6:

                    //Listar Moveis
                    System.out.println("Produtos Moveis");

                    System.out.println(ge.listarMoveis());
                    break;
                case 7:

                    //Listar estoque menor que
                    System.out.println("Estoque menor que: ");
                    int quantidadeMinima = e.nextInt();

                    System.out.println(ge.listarEstoqueMenorQue(quantidadeMinima));
                    break;
                case 8:

                    //Listar estoque vazio
                    System.out.println("Estoque Vazios");

                    System.out.println(ge.listarEstoqueVazio());
                    break;
                case 9:

                    //Listar por fabricante
                    e.nextLine();
                    System.out.println("Digite o nome do Fabricante");
                    String Fabricante = e.nextLine();

                    System.out.println(ge.listarPorFabricante(Fabricante));
                    break;

                case 10:

                    //Listar por validade
                    e.nextLine();
                    System.out.println("Digite a data de validade");
                    String datavalidade = e.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate validade2 = LocalDate.parse(datavalidade, formatter);

                    System.out.println(ge.listarPorValidade(validade2));

                case 11:

                    //Vender produto
                    System.out.println("Digite o código do produto");
                    int Codigo = e.nextInt();
                    System.out.println("Digite a quantidade a ser vendida");
                    int QuantidadeVendida = e.nextInt();

                    System.out.println(ge.venderProduto(Codigo, QuantidadeVendida));
                    break;
                case 12:

                    //Comprar produto
                    System.out.println("Digite o código do produto");
                    int Codigo2 = e.nextInt();
                    System.out.println("Digite a quantidade a ser comprada");
                    int QuantidadeComprada = e.nextInt();

                    System.out.println(ge.comprarProduto(Codigo2, QuantidadeComprada));
                    break;
                case 13:
                    System.out.println("Saindo do programa");
                    break;
            }

        } while (opcao != 13);

    }

}
