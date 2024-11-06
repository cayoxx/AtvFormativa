package avFormativaDesafio7;

public abstract class Animal {
    private String nome;
    private String sexo;
    private String raca;

    public Animal(String nome, String sexo, String raca) {
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRaca() {
        return raca;
    }

    public abstract void emitirSom();
}
