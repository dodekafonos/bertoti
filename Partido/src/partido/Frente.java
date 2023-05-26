package partido;

import java.util.ArrayList;

public class Frente {
    private String nome;
    private ArrayList<Membro> membros = new ArrayList<>();
    public Frente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaMembro(Membro novoMembro) {
        this.membros.add(novoMembro);
    }

    public void imprimeMembros() {
        System.out.println("===================================");
        System.out.println("Militantes da frente de "+this.nome+":");
        for (Membro membro : this.membros) {
            System.out.println(membro.getNome());
        }
        System.out.println("===================================");
    }
}
