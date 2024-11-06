package avFormativaDesafio3;

public class PrincipalMerc {

    public static void main(String[] args) {
    	System.out.println("Compras do mês: ");
    	
        for (ListaMerc lista : ListaMerc.values()) {
            System.out.println(lista);
        }
    }
}

