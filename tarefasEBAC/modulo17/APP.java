package tarefasEBAC.modulo17;

import tarefasEBAC.modulo17.carros.Carros;
import tarefasEBAC.modulo17.carros.Honda;
import tarefasEBAC.modulo17.carros.Toyota;
import tarefasEBAC.modulo17.carros.Wolkswagen;

import java.util.ArrayList;
import java.util.List;

public class APP {

    public static void main(String[] args) {

        // fazendo a instanciação de todas as classes.
        Honda honda = new Honda("Civic", "2022");
        Toyota toyota = new Toyota("Corolla", "2023");
        Wolkswagen wolkswagen = new Wolkswagen("Jetta", "2015");

        // criando um ArrayList do tipo Carros, onde serão listado todas as instâncias.
        List<Carros> list = new ArrayList<>();

        // fazendo a adição dde cada um dos objetos e seus atrubutos dentro do ArrayList
        list.add(honda);
        list.add(toyota);
        list.add(wolkswagen);

        // exibindo o conteúdo do ArrayList
        System.out.println(list.toString());
    }

}
