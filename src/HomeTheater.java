public class HomeTheater extends Produtos{
    private String tipo = "Home Theater";
    private double bass = 20.0;
    private double volumeMaximo;

    public HomeTheater(int codigo, String marca, double preco, int volumeMaximo){
        super(codigo,marca, preco);
        this.volumeMaximo = volumeMaximo;
    }

    public HomeTheater(int codigo, String marca, double preco, double volumeMaximo, double bass){
        super(codigo, marca, preco);
        this.volumeMaximo = volumeMaximo;
        this.bass = bass;
    }

    @Override
    public String getTipo(){
        return this.tipo;
    }

    public double getBass(){
        return this.bass;
    }

    public void setBass(double bass){
        this.bass = bass;
    }

    public double getVolumeMaximo(){
        return this.volumeMaximo;
    }

    public void setVolumeMaximo(double volumeMaximo){
        this.volumeMaximo = volumeMaximo;
    }

    
}
