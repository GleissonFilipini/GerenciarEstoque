package gerenciarestoque;

import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciarProdutos {

    private ArrayList<Produto> produto;

    public GerenciarProdutos() {
        produto = new ArrayList<>();

    }

    public void adicionar(Produto p) {
        System.out.println("Produto adicionado com sucesso " + produto.add(p));

    }

    public boolean remover(int codigo) {
        for (int i = 0; i < produto.size(); i++) {
  
            if (produto.get(i).getCodigo() == codigo) {
                System.out.println("Produto removido com sucesso " +produto.remove(i));
                return true;
            }
        }
        System.out.println("Produto não removido");
        return false;
    }

    public Produto buscarPorCodigo(int codigo) {
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getCodigo() == codigo) {
                System.out.println(codigo);
                System.out.println(produto.get(i).Imprimir());
            }

        }
        return null;
    }

    public String listarEletronico() {
        String resultado = "";
        for (int i = 0; i < produto.size(); i++) {
            //if (Eletronico.class.cast(i).getVoltagem() > 0) {
            if (produto.get(i) instanceof Eletronico) {
                resultado += (produto.get(i)).Imprimir() + "\n";

            }
        }
        return resultado;
    }

    public String listarPerecivel() {
        String resultado = "";
        for (int i = 0; i < produto.size(); i++) {
            //if (Perecivel.class.cast(i).getRefrigerado() == true) 
            if (produto.get(i) instanceof Perecivel) {
                //return "\nProdutos pereciveis: " + Perecivel.class.cast(i).Imprimir();
                resultado += produto.get(i).Imprimir() + "\n";
            }
        }
        return resultado;
    }

    public String listarMoveis() {
        String resultado = "";
        for (int i = 0; i < produto.size(); i++) {
            //if (!Movel.class.cast(i).getTipoMaterial().isEmpty()) 
            if (produto.get(i) instanceof Movel) {
                //return "\nProduto Moveis: " + Movel.class.cast(i).Imprimir();
                resultado += produto.get(i).Imprimir() + "\n";
            }
        }
        return resultado;
    }

    public String listarEstoqueMenorQue(int quantidadeMinima) {
        String resultado = "";
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getQuantidade() <= quantidadeMinima) {
                resultado += produto.get(i).Imprimir() + "\n";
            }
        }
        return resultado;

    }

    public String listarEstoqueVazio() {
        String resultado = "";
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getQuantidade() == 0) {
                resultado += produto.get(i).Imprimir() + "\n";
            }
        }
        return resultado;

    }

    public String listarPorFabricante(String fabricante) {
        String resultado = "";
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getFabricante().equalsIgnoreCase(fabricante)) {
                resultado += produto.get(i).Imprimir() + "\n";
            }

        }
        return resultado;
    }

    public String listarPorValidade(LocalDate validade) {
        String resultado = "";
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i) instanceof Perecivel) {
                Perecivel per = (Perecivel) produto.get(i);
                if (per.getValidade() == validade) {
                    resultado += produto.get(i).Imprimir() + "\n";
                }
            }
        }
        return resultado;
    }

    public double venderProduto(int codigo, int quantidade) {
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getCodigo() == codigo) {
                System.out.println("quantidade vendida" + quantidade);
                produto.get(i).vender(quantidade);
                return quantidade * produto.get(i).getValorUnitario();
            }
        }
        return -1;
    }

    public boolean comprarProduto(int codigo, int quantidade) {
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getCodigo() == codigo) {
                System.out.println("quantidade comprada: " + quantidade);

                produto.get(i).comprar(quantidade);

                int quantidadecomprada = produto.get(i).getQuantidade();

                return true;
            }
        }
        return false;
    }

    public String listarTudo() {
        String resultado = "";
        for (int i = 0; i < produto.size(); i++) {
            if(produto.get(i) instanceof Produto){
            resultado += produto.get(i).Imprimir();
            }     
        }
        return resultado;
    }

}
