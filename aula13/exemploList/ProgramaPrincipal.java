package aula13.exemploList;

import java.util.ArrayList;
import java.util.Collections;
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

        //Ordenação 

        System.out.println("\n---------------ORDENAÇÃO---------------\n");
        Collections.sort(pessoas);

        //Foreach + print

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        //criar nova pessoa

        Pessoa p = new Pessoa("Gustavo", 38, 80.5, 1.76);
        p.getTelefones().put("Residencial", "41 3264-3273");
        p.getTelefones().put("Comercial", "41 3763-4755");
        p.getTelefones().put("Celular", "41 99861-5310");

        System.out.printf("Telefone Celular: %s", p.getTelefones().get("Celular"));
    }
}
