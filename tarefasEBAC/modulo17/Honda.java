package tarefasEBAC.modulo17;

public class Honda extends Carros{

    public Honda(String modelo, String anoFabricacao) {
        super(modelo, anoFabricacao);
    }

    @Override
    public String toString() {
        return "****** HONDA ******" +
                "\n[Modelo: " + getModelo() + "]" +
                "\n[Ano de Fabricação: " + getAnoFabricacao() + "]";
    }
}
