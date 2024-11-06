package avFormativaDesafio7;

public class PrincipalAnimal {

    public static void main(String[] args) {
        
        Lobo lobo = new Lobo("Wolf", "M", "Sibiriano");
        System.out.println("Nome: " + lobo.getNome());
        System.out.println("Sexo: " + lobo.getSexo());
        System.out.println("Raça: " + lobo.getRaca());
        lobo.emitirSom();
        
        System.out.println("----------------------------------");
        
        Leao leao = new Leao("Mufasa", "M", "Albino");
        System.out.println("Nome: " + leao.getNome());
        System.out.println("Sexo: " + leao.getSexo());
        System.out.println("Raça: " + leao.getRaca());
        leao.emitirSom();
    }
}
