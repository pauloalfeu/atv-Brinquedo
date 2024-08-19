package atvBrinquedo;

public class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private float preco;

    //Construtores
    public Brinquedo() {
    }

    public Brinquedo(String nome, String faixaEtaria) {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
    }

    public Brinquedo(String nome, String faixaEtaria, float preco) {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
        this.preco = preco;
    }


	// Métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        switch (faixaEtaria) {
            case "0 a 2":
            case "3 a 5":
            case "6 a 10":
            case "acima de 10":
                this.faixaEtaria = faixaEtaria;
                break;
            default:
                System.out.println("Faixa etária inválida. Valores válidos: 0 a 2, 3 a 5, 6 a 10, acima de 10");
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Método para exibir as informações do brinquedo
    public void mostrar() {
        System.out.println("Brinquedo:");
        System.out.println("Nome: " + nome);
        System.out.println("Faixa etária: " + faixaEtaria);
        System.out.println("Preço: R$" + preco);
    }
}