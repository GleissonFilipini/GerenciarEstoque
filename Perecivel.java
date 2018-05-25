package gerenciarestoque;

import java.time.LocalDate;

public class Perecivel extends Produto{
    
    private LocalDate validade;
    private boolean refrigerado;

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
    
    public boolean getRefrigerado(){
        return refrigerado;
    }
   
    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado=refrigerado;
    }

    public Perecivel(LocalDate validade, boolean refrigerado, int codigo, String nome, String fabricante, int quantidade, double valorUnitario) {
        super(codigo, nome, fabricante, quantidade, valorUnitario);
        this.validade = validade;
        this.refrigerado = refrigerado;
    }
    
    @Override
    public String Imprimir(){
        return
               "Código do produto: " +getCodigo()+
               "\nNome do produto: " +getNome()+
               "\nFrabricante: " +getFabricante()+
               "\nQuantidade disponivel no estoque: "+getQuantidade()+
               "\nValor unitário por produto: " +getValorUnitario()+
               "\nData de validade: " +validade+
               "\nProduto refrigerado? " +refrigerado;
                
    
    }
    
}
