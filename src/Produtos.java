public class Produtos {
    private String tipo;
    private int codigo;
    private String marca;
    private double preco;

    public Produtos(String tipo, int codigo,String marca, double preco){
        this.tipo = tipo;
        this.codigo = codigo;
        this.marca = marca;
        this.preco = preco;
    }

    public Produtos(int codigo,String marca, double preco){
        this.codigo = codigo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getTipo(){
        return this.tipo;
    };

    public int getCodigo(){
        return this.codigo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.getTipo() + "\nCodigo do Produto: " + this.getCodigo() + "\nMarca: " + this.getMarca() + "\nPreco: " + this.getPreco()+"\n";
    }

}
