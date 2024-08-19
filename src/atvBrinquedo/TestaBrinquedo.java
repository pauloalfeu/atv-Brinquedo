package atvBrinquedo;

public class TestaBrinquedo {
    public static void main(String[] args) {
        // Criando objetos Brinquedo
        Brinquedo brinquedo1 = new Brinquedo("Boneca", "3 a 5", 50.0f);
        Brinquedo brinquedo2 = new Brinquedo("Carro", "6 a 10");

        // Exibindo informações dos brinquedos
        brinquedo1.mostrar();
        brinquedo2.mostrar();

        // Tentando setar uma faixa etária inválida
        brinquedo2.setFaixaEtaria("1 a 3"); // Imprimirá uma mensagem de erro
    }
}