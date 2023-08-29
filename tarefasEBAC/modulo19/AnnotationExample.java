package tarefasEBAC.modulo19;

@Tabela(value = "Tarefa EBAC")
public class AnnotationExample {

    public static void main(String[] args) {
        Class<?> clazz = AnnotationExample.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = clazz.getAnnotation(Tabela.class);
            String nomeTabela = tabelaAnnotation.value();
            System.out.println("Nome da Tabela: " + nomeTabela);
        } else {
            System.out.println("A anotação @Tabela não está presente na classe.");
        }
    }
}
