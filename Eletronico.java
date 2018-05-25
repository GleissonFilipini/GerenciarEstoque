package gerenciarestoque;
public class Eletronico extends Produto{
    
    private int voltagem;
    private int potencia;
    private String eficiencia;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }

    public Eletronico(int voltagem, int potencia, String eficiencia, int codigo, String nome, String fabricante, int quantidade, double valorUnitario) {
        super(codigo, nome, fabricante, quantidade, valorUnitario);
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.eficiencia = eficiencia;
    }
    
    @Override
    public String Imprimir(){
      return 
             "Código do produto: " +getCodigo()+
                "\nNome do produto: " +getNome()+
                "\nFrabricante: " +getFabricante()+
                "\nQuantidade disponivel no estoque: "+getQuantidade()+
                "\nValor unitário por produto: " +getValorUnitario()+
                "\nVoltagem do produto: " +voltagem+
                "\nPotencia do produto: " +potencia+
                "\nEficiencia do produto: " +eficiencia;
    
    
    }



    
}
