package aula13.exemploList;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        //Instanciar um List de Pessoas
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        //adicionar objetos na lista
        pessoas.add(new Pessoa("João", 25, 78, 1.76));
        pessoas.add(new Pessoa("Pedro", 40, 120, 1.73));
        pessoas.add(new Pessoa("Francielli", 33, 65, 1.68));
        pessoas.add(new Pessoa("Diogo", 15, 54, 1.63));
        pessoas.add(new Pessoa("Natasha", 23, 53, 1.56));

        //Foreach + print
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
