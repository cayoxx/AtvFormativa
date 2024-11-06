package avFormativaDesafio6;

public class Principal {

	public static void main(String[] args) {

		PessoaFisica pessoa = new PessoaFisica("Alberto", "99856-5692", "131031031-23", "2910318031");
		
		System.out.println("NOME: " + pessoa.getNome());
		System.out.println("TELEFONE: " + pessoa.getTelefone());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("RG: " + pessoa.getRg());

		
		
	}

}
