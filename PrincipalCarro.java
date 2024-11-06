package avFormativaDesafio9;

public class PrincipalCarro {

    public static void main(String[] args) {
        
    	Motor motor1 = new Motor("V8");
        
        Carro carro1 = new Carro("Mustang", motor1);
        
        carro1.exibirDetalhes();
    }
}
