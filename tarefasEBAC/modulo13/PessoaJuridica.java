package tarefasEBAC.modulo13;

import java.util.Scanner;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String dataAbertura;
    private String atividade;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public PessoaJuridica(String nome, String telefone, String email, String cnpj, String dataAbertura, String atividade) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
        this.dataAbertura = dataAbertura;
        this.atividade = atividade;
    }

    @Override
    public String toString() {
        return  "***************************" + "\n" +
                "Nome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "E-mail: " + getEmail() + "\n" +
                "CNPJ: " + getCnpj() + "\n" +
                "Data de abertura: " + getDataAbertura() + "\n" +
                "Atividade: " + getAtividade() ;
    }
}
