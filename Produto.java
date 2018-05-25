package gerenciarestoque;
public abstract class Produto {

private String nome,fabricante;
private int quantidade,codigo;
private double valorUnitario;
 

    public Produto(int codigo,String nome, String fabricante,int quantidade,double valorUnitario){
    setCodigo(codigo);
    setNome(nome);
    setFabricante(fabricante);
    setValorUnitario(valorUnitario);
    this.quantidade=quantidade;
    
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }


    public double vender(int quantidade){
    this.quantidade -= quantidade;
    
    if(quantidade <= 0){
        return -1;
    }
    return valorUnitario*quantidade;
    }
    
    public void comprar(int quantidade){
    this.quantidade += quantidade;
    
    }
    public String Imprimir(){
        return 
                "Código do produto: " +codigo+
                "\nNome do produto: " +nome+
                "\nFrabricante: " +fabricante+
                "\nQuantidade disponivel no estoque: "+quantidade+
                "\nValor unitário por produto: " +valorUnitario;
    
    }
    
}
