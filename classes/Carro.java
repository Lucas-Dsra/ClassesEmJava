package classes;

public class Carro extends veiculo{

    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }


    @Override
    public void exibirDatalhes(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Numero de portas:" + this.numeroPortas + "\n");
    }
}
