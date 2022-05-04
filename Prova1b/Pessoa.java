public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char genero;
    private int gostaViajar;
    private int gostaCozinhar;
    private int gostaCinema;
    private int gostaBalada;
    private int gostaFicarEmCasa;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, char genero, int gostaViajar, int gostaCozinhar, int gostaCinema, int gostaBalada, int gostaFicarEmCasa){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.gostaViajar = gostaViajar;
        this.gostaCozinhar = gostaCozinhar;
        this.gostaCinema = gostaCinema;
        this.gostaBalada = gostaBalada;
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public char getGenero(){
        return genero;
    }

    public int getGostaViajar(){
        return gostaViajar;
    }

    public int getGostaCozinhar(){
        return gostaCozinhar;
    }

    public int getGostaCinema(){
        return gostaCinema;
    }

    public int getGostaBalada(){
        return gostaBalada;
    }

    public int getGostaFicarEmCasa(){
        return gostaFicarEmCasa;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    public void setGostaViajar(int gostaViajar){
        this.gostaViajar = gostaViajar;
    }

    public void setGostaCozinhar(int gostaCozinhar){
        this.gostaCozinhar = gostaCozinhar;
    }

    public void setGostaCinema(int gostaCinema){
        this.gostaCinema = gostaCinema;
    }

    public void setGostaBalada(int gostaBalada){
        this.gostaBalada = gostaBalada;
    }

    public void setGostaFicarEmCasa(int gostaFicarEmCasa){
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }

    // @Override
    // public String toString(){
    //     return super.toString() + ":\n" + String.format("Nome: %s\nIdade: %d\nGenero: %c\nGosta de Viajar: %d\nGosta de Cozinhar: %d\nGosta de Cinema: %d\nGosta de Balada: %d\nGosta  de Ficar em Casa: %d", this.nome, this.idade, this.genero, this.gostaViajar, this.gostaCozinhar, this.gostaCinema, this.gostaBalada, this.gostaFicarEmCasa);
    // }

    @Override
    public String toString(){
        return String.format("Nome: %s\nIdade: %d\nGenero: %c\nGosta de Viajar: %d\nGosta de Cozinhar: %d\nGosta de Cinema: %d\nGosta de Balada: %d\nGosta  de Ficar em Casa: %d", this.nome, this.idade, this.genero, this.gostaViajar, this.gostaCozinhar, this.gostaCinema, this.gostaBalada, this.gostaFicarEmCasa);
    }

    // public double calcularCompatibilidade(Pessoa pessoa){
    //     return Math.sqrt(Math.pow(this.gostaViajar - pessoa.gostaViajar, 2) + Math.pow(this.gostaCozinhar - pessoa.gostaCozinhar, 2) + Math.pow(this.gostaCinema - pessoa.gostaCinema, 2) + Math.pow(this.gostaBalada - pessoa.gostaBalada, 2) + Math.pow(this.gostaFicarEmCasa - pessoa.gostaFicarEmCasa, 2));
    // }

    public double calcularCompatibilidade(Pessoa pessoa){
        return Math.sqrt(
            Math.pow(pessoa.gostaViajar - this.gostaViajar, 2) + 
            Math.pow(pessoa.gostaCozinhar - this.gostaCozinhar, 2) + 
            Math.pow(pessoa.gostaCinema - this.gostaCinema, 2) + 
            Math.pow(pessoa.gostaBalada - this.gostaBalada, 2) + 
            Math.pow(pessoa.gostaFicarEmCasa - this.gostaFicarEmCasa, 2));
    }


}
