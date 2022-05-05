package aula09;

public class Livro extends Leitura {
    private String autor;
    private int anoPublicacao;
    private int numPaginas;
    private String isbn;

    public Livro(){

    }

    public Livro(String autor, int anoPublicacao, int numPaginas, String isbn, String titulo, int codigo, String edicao, String editora){
        super(editora, edicao, codigo, titulo);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public String getIsbn() {
        return isbn;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    

    @Override
    public String toString(){
        return super.toString() + 
        String.format("Autor: %s\nAno Publicação: %d\nNumero de Paginas: %d\nIsbn: %s\n", this.autor, this.anoPublicacao, this.numPaginas, this.isbn);
    }
}
