package tarefasEBAC.modulo17;

import java.util.ArrayList;
import java.util.List;

public abstract class Carros {

    private String modelo;
    private String anoFabricacao;

    public Carros(String modelo, String anoFabricacao) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "modelo='" + modelo + '\'' +
                ", anoFabricacao='" + anoFabricacao + '\'' +
                '}';
    }
}
