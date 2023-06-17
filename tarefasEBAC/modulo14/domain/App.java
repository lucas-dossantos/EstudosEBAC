package tarefasEBAC.modulo14.domain;

import tarefasEBAC.modulo14.dao.ClienteSetDAO;
import tarefasEBAC.modulo14.dao.IClienteDAO;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {

        iClienteDAO = new ClienteSetDAO();

        String opcao = JOptionPane.showInputDialog(null,"Digite para:\n\n" +
                "1. cadastrar cliente\n" +
                "2. consultar cliente\n" +
                "3. excluir cliente\n" +
                "4. alterar cliente\n" +
                "5. sair\n\n","CADASTRO DE CLIENTES", JOptionPane.INFORMATION_MESSAGE);

        while (isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,"Digite para:\n\n" +
                    "1. cadastrar cliente\n" +
                    "2. consultar cliente\n" +
                    "3. excluir cliente\n" +
                    "4. alterar cliente\n" +
                    "5. sair\n\n","CADASTRO DE CLIENTES", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)){
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,"Informe os dados do cliente separados por vírgula, " +
                     "conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado:", "CADASTRO",JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)){
                String dados = JOptionPane.showInputDialog(null,"informe o CPF do cliente", "CONSULTA",JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExlusao(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF do cliente", "EXCLUSÃO", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(null,"Informe os dados do cliente separados por vírgula, " +
                        "conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado:", "CADASTRO",JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }
            opcao = JOptionPane.showInputDialog(null,"Digite para:\n\n" +
                    "1. cadastrar cliente\n" +
                    "2. consultar cliente\n" +
                    "3. excluir cliente\n" +
                    "4. alterar cliente\n" +
                    "5. sair\n\n","CADASTRO DE CLIENTES", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: ", null,JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isExlusao(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void consultar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", null,JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }


    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", null,JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        String clientesCadastrados = "";
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
            clientesCadastrados += cliente.toString() + "\n";
        }
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }
}

