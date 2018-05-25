package gerenciarestoque;
public class Movel extends Produto{
    
    private String tipoMaterial;

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public Movel(String tipoMaterial, int codigo, String nome, String fabricante, int quantidade, double valorUnitario) {
        super(codigo, nome, fabricante, quantidade, valorUnitario);
        this.tipoMaterial = tipoMaterial;
    }

    
    @Override
    public String Imprimir(){
        return 
             "Código do produto: " +getCodigo()+
             "\nNome do produto: " +getNome()+
             "\nFrabricante: " +getFabricante()+
             "\nQuantidade disponivel no estoque: "+getQuantidade()+
             "\nValor unitário por produto: " +getValorUnitario()+
             "\nTipo de material: " +tipoMaterial;
    
    }
}
