package tarefasEBAC.modulo22;

import java.util.List;
import java.util.stream.Collectors;

public class AppList {

    public static void main(String[] args) {

        List<Pessoas> todosNomes = new Pessoas().listPessoas();

        List<Pessoas> nomesFemininos = new Pessoas().listPessoas();

        nomesFemininos = todosNomes.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());


        System.out.println("Lista com todos os nomes.");
        System.out.println(todosNomes);
        System.out.println("\nLista com nomes Femininos.");
        System.out.println(nomesFemininos);
    }
}
