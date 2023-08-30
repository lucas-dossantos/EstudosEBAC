package tarefasEBAC.modulo23;

import tarefasEBAC.modulo22.Pessoas;

import java.util.List;
import java.util.stream.Collectors;

public class AppList {

    public static void main(String[] args) {

        List<Pessoas> todosNomes = new Pessoas().listPessoas();

        List<Pessoas> nomesFemininos = new Pessoas().listPessoas();

        System.out.println("Lista com todos os nomes.");
        System.out.println(todosNomes);
        System.out.println("\nLista com nomes Femininos.");
        System.out.println(nomesFemininos);
    }

    public static List<Pessoas> filtrarNomesFemininos() {
        List<Pessoas> todosNomes = new Pessoas().listPessoas();
        return todosNomes.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());
    }
}
