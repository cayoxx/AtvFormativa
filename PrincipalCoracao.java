package avFormativaDesafio8;

public class PrincipalCoracao {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("João", 72);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Batimentos do Coração: " + pessoa1.getCoracao().getBatimentos() + " bpm");
    }
}
