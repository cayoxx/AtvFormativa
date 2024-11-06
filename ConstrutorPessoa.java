package avFormativa5;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Messi",36);
		
		
		System.out.println("Nome: "+pessoa2.getNome());
		System.out.println("Idade: "+pessoa2.getIdade());
	}

}
