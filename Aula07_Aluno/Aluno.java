public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int RGM;
    private String nome;
    private int anoIngresso;

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno(int RGM, String nome, int anoIngresso)
    {
        // inicializa variáveis de instância
        this.RGM = RGM;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
    }

    // getters e setters
    public int getRGM(){
        return this.RGM;
    }

    public String getnome(){
        return this.nome;
    }

    public int getanoIngresso(){
        return this.anoIngresso;
    }

    public void setRGM(int RGM){
        this.RGM = RGM;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public void setanoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }

    @Override
    public String toString(){
        return super.toString() + ":\n"
        + String.format("RGM: %d\nNome: %s\nAnoIngresso: %d", this.RGM, this.nome, this.anoIngresso);
    }
}
