package partido;

import java.util.ArrayList;

public class Partido {
    private String nome;
    private String criadoEm;
    private ArrayList<Membro> membros;
    private ArrayList<Frente> frentes;

    public Partido(String nome, String criadoEm) {
        this.nome = nome;
        this.criadoEm = criadoEm;
        frentes = new ArrayList<>();
        membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCriadoEm() {
        return "Fundado em " + criadoEm;
    }

    public ArrayList<Membro> getMembros() {
        return membros;
    }

    public ArrayList<Frente> getFrentes() {
        return frentes;
    }
    public void novaFrente(Frente novaFrente) {
        this.frentes.add(novaFrente);
    }

    public void imprimeFrentes() {
        System.out.println("-------------------------------");
        System.out.println("Frentes de atuação do partido:");
        for (Frente frente : frentes) {
            System.out.println(frente.getNome());
        }
        System.out.println("-------------------------------");
    }
}
