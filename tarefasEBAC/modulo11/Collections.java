package tarefasEBAC.modulo11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections {

    public static void main(String[] args) {

        List<String> nomesMasculinos = new ArrayList<>();// lista para armazenar nomes masculinos
        List<String> nomesFemininos = new ArrayList<>();// lista para armazenar nomes femininos

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Informe o nome e o sexo separados por hífen(ou 'exit' para sair):");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("exit")){
                break;
            }

            String[] partes = entrada.split("-");

            if (partes.length == 2) {
                String nome = partes[0];
                String sexo = partes[1];

                if (sexo.equalsIgnoreCase("masculino")) {
                    nomesMasculinos.add(nome);
                } else if (sexo.equalsIgnoreCase("feminino")){
                    nomesFemininos.add(nome);
                }else {
                    System.out.println("\nSexo inválido.\n");
                }
            }
        }

        System.out.println("Nomes masculino: " + nomesMasculinos);
        System.out.println("Nomes femininos: " + nomesFemininos);

    }
}
