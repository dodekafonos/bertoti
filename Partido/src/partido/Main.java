package partido;

public class Main {
    public static void main(String[] args) {

        Membro membro_01 = new Membro("José Paulo Netto", 74, "Pesquisador", "Formação");

        Frente frente_1 = new Frente("Habitação");

        Frente frente_2 = new Frente("Formação");
        frente_2.adicionaMembro(membro_01);

        Partido partido = new Partido("PCB - Partido Comunista Brasileiro", "25/03/1922");
        partido.novaFrente(frente_1);
        partido.novaFrente(frente_2);

        System.out.println(partido.getNome());
        System.out.println(partido.getCriadoEm());
        partido.imprimeFrentes();
        frente_2.imprimeMembros();

        membro_01.saudacao();
    }
}