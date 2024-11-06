package avFormativaDesafio1;

public class Objeto extends Pessoa {
	
	public static void main(String[] args) {

	// CRIAR OBJETO	
	Pessoa pessoa1 = new Pessoa();
	Pessoa pessoa2 = new Pessoa();
	
	
	//INCREMENTAR OS DADOS (EM SET)
	pessoa1.setNome("Roberto");
	pessoa1.setIdade(40);
	pessoa1.setEndereco("California");
	pessoa1.setProfissao("Ator");

	pessoa2.setNome("Fernando");
	pessoa2.setIdade(90);
	pessoa2.setEndereco("México");
	pessoa2.setProfissao("Chaves");
	
	
	//MOSTRA DE FORMA LIMPA OS DADOS COLETADOS (EM GET)
	System.out.println("PESSOA 1:");
	System.out.println("Nome: " + pessoa1.getNome());
	System.out.println("Idade: " + pessoa1.getIdade());
	System.out.println("Endereço: " + pessoa1.getEndereco());
	System.out.println("Profissão: " + pessoa1.getProfissao());
	
	
	System.out.println("--------------------------");


	System.out.println("PESSOA 2:");
	System.out.println("Nome: " + pessoa2.getNome());
	System.out.println("Idade: " + pessoa2.getIdade());
	System.out.println("Endereço: " + pessoa2.getEndereco());
	System.out.println("Profissão: " + pessoa2.getProfissao());
	
	}
}