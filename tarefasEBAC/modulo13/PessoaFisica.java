package tarefasEBAC.modulo13;

public class PessoaFisica extends Pessoa {

        private String CPf;
        private String dataNascimento;
        private String sexo;

    public String getCPf() {
        return CPf;
    }

    public void setCPf(String CPf) {
        this.CPf = CPf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public PessoaFisica(String nome, String telefone, String email, String CPf, String dataNascimento, String sexo) {
        super(nome, telefone, email);
        this.CPf = CPf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "E-mail: " + getEmail() + "\n" +
                "CPF: " + CPf + "\n" +
                "Data de nascimento: " + dataNascimento + "\n" +
                "Sexo: " + sexo ;
    }
}
