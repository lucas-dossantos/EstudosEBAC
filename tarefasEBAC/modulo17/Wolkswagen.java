package tarefasEBAC.modulo17;

public class Wolkswagen extends Carros{

    public Wolkswagen(String modelo, String anoFabricacao) {
        super(modelo, anoFabricacao);
    }

    @Override
    public String toString() {
        return "\n****** WOLKSWAGEN ******" +
                "\n[Modelo: " + getModelo() + "]" +
                "\n[Ano de Fabricação: " + getAnoFabricacao() + "]";
    }
}
