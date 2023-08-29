package tarefasEBAC.modulo22;

import java.util.List;

public class Pessoas {

    private String nome;
    private String sexo;

    public Pessoas(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoas () {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Pessoas> listPessoas() {
        Pessoas p1 = new Pessoas("Naruto", "Masculino");
        Pessoas p2 = new Pessoas("Itachi", "Masculino");
        Pessoas p3 = new Pessoas("Sakura", "Feminino");
        Pessoas p4 = new Pessoas("Ino", "Feminino");

        return List.of(p1, p2, p3, p4);
    }

    @Override
    public String toString() {
        return  "NOME: " + nome +
                "  SEXO: " + sexo + "\n";
    }
}
