package aula13.exemploList;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s; Idade: %d; Peso: %.2f; Altura: %.2f", nome, idade, peso, altura);
    }

    @Override
    public int compareTo(Pessoa o) {
        //Comparação com base na idade
        if (this.idade < o.idade) {
            return -1;
        }
        if (this.idade > o.idade) {
            return 1;
        }
        return 0;
    }
}