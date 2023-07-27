package tarefasEBAC.modulo17.carros;

public class Toyota extends Carros{

    public Toyota(String modelo, String anoFabricacao) {
        super(modelo, anoFabricacao);
    }

    @Override
    public String toString() {
        return "\n****** TOYTOTA ******" +
                "\n[Modelo: " + getModelo() + "]" +
                "\n[Ano de Fabricação: " + getAnoFabricacao() + "]";
    }
}
