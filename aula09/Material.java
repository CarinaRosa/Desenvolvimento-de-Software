package aula09;

public class Material {

    private int codigo;
    private String titulo;
    

    public Material(){

    }

    public Material(int codigo, String titulo){
        this.titulo = titulo;
        this.codigo = codigo;
    }
    

    public int getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public String toString() {
        return String.format("Codigo: %d\nTitulo: %s\n", this.codigo, this.titulo);
    } 
}
