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

    public String getEdicao() {
        return edicao;
    }
    public String getEditora() {
        return editora;
    }


    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    

    @Override
    public String toString(){
        return super.toString() + 
        String.format("Editora: %s\nEdição: %s\n", this.editora,  this.edicao);
    }
}
