package partido;

public class Membro {

    private String nome;
    private int idade;
    private String trabalho;
    private String frente;

    public Membro(String nome, int idade, String trabalho, String frente) {
        this.nome = nome;
        this.idade = idade;
        this.trabalho = trabalho;
        this.frente = frente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public String getFrente() {
        return frente;
    }

    public void setFrente(String frente) {
        this.frente = frente;
    }

    public void saudacao() {
        System.out.println("Saudações camarada! Paz entre nós, guerra aos senhores.");
    }
}
