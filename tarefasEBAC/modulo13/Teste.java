package tarefasEBAC.modulo13;

public class Teste {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Lucas Santos","(88) 99999-2222","modulo13@ebac.com",
                "333.555.444-88","01/01/1001","masculino");
        System.out.println(pf.toString());

        PessoaJuridica pj = new PessoaJuridica("ESTUDOS LTDA.", "(99) 88888-7777","modulo13@ebac.com",
                "11.222.333/0001-02","01/01/1001","estudar");
        System.out.println(pj.toString());

    }
}
