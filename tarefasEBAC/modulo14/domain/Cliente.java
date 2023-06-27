package tarefasEBAC.modulo14.domain;

import java.util.Objects;

public class Cliente {

    private String nome;
    private Long cpf;
    private Long telefone;
    private String endereco;
    private Integer numeroEnd;
    private String cidade;
    private String estado;

    public Cliente(String nome, String cpf, String telefone, String endereco, String numeroEnd, String cidade, String estado) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf.trim());
        this.telefone = Long.valueOf(telefone.trim());
        this.endereco = endereco;
        this.numeroEnd = Integer.valueOf(numeroEnd.trim());
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumeroEnd() {
        return numeroEnd;
    }

    public void setNumeroEnd(Integer numeroEnd) {
        this.numeroEnd = numeroEnd;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Cliente cliente = (Cliente) o;
//        return Objects.equals(cpf, cliente.cpf);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(cpf);
//    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
