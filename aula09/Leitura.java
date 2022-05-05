package aula09;

public class Leitura extends Material {
    private String editora;
    private String edicao;

    public Leitura(){

    }

    public Leitura(String editora, String edicao, int codigo, String titulo){
        super(codigo, titulo);
        this.edicao = edicao;
        this.editora = editora;
    }
}
