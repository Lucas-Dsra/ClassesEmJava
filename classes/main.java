package classes;

public class main {
    public static void main(String[] args) {

        Carro novoCarro = new Carro("Chevrolet", "Prisma", 2024, 4);
        Moto novoMoto = new Moto("Honda", "Cg 125cc", 2015, false);

        novoMoto.exibirDatalhes();
        novoCarro.exibirDatalhes();


    }
}
