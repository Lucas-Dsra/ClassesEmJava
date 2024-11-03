package classes;

public class Moto extends veiculo{

    private boolean temSlidecar;

    public Moto(String marca, String modelo, int ano, boolean temSlidecar) {
        super(marca, modelo, ano);
        this.temSlidecar = temSlidecar;
    }

    public boolean getTemSlidecar() {
        return temSlidecar;
    }

    public void setTemSlidecar(boolean temSlidecar) {
        this.temSlidecar = temSlidecar;
    }

    @Override
    public void exibirDatalhes() {
        System.out.println("Marca:" + getMarca());
        System.out.println("Modelo:" + getModelo());
        System.out.println("Ano:" + getAno());
        System.out.println("Tem Slidecar: " + temSlidecar + "\n");
    }
}
