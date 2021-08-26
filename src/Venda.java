public class Venda {
    private int codigo;
    private String comprador;
    private Produtos produto;

    public Venda(int codigo, String comprador, Produtos produto){
        this.codigo = codigo;
        this.comprador = comprador;
        this.produto = produto;
    }

    public Produtos getProduto(){
        return this.produto;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getComprador(){
        return this.comprador;
    }

    @Override
    public String toString() {
        return "Codigo da Venda: " + this.codigo + "\nCliente: " + this.comprador + "\nDetalhes do Produto: " + "\n" + this.produto +"\n";
    }
}
