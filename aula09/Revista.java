package aula09;

import java.util.Date;

public class Revista extends Leitura{
    
    private Date data;
    private String editorial;
    private String reportagemCapa;

    public Revista(){

    }

    public Revista( String titulo, int codigo, String edicao, String editora, Date data, String editorial, String reportagemCapa){
        super(editora, edicao, codigo, titulo);
        this.data = data;
        this.editorial = editorial;
        this.reportagemCapa = reportagemCapa;
    }

    public Date getData() {
        return data;
    }
    public String getEditorial() {
        return editorial;
    }
    public String getReportagemCapa() {
        return reportagemCapa;
    }


    public void setData(Date data) {
        this.data = data;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setReportagemCapa(String reportagemCapa) {
        this.reportagemCapa = reportagemCapa;
    }
    

    @Override
    public String toString(){
        return super.toString() + 
        String.format("Data: %t\nEditorial: %s\nReportagem Capa: %s\n", this.data, this.editorial, this.reportagemCapa);
    }
}
