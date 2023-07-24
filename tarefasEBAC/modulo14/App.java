package tarefasEBAC.modulo14;

import tarefasEBAC.modulo14.dao.ClienteMapDAO;
import tarefasEBAC.modulo14.dao.IClienteDAO;
import tarefasEBAC.modulo14.domain.Cliente;

import javax.swing.*;


public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {

        iClienteDAO = new ClienteMapDAO();

        boolean rodando = true;// Sentinela para sair do laço de repetição;

        while (rodando) {
            String opcao = JOptionPane.showInputDialog(null, """
                    Digite para:

                    1. cadastrar cliente
                    2. consultar cliente
                    3. excluir cliente
                    4. alterar cliente
                    5. sair

                    ""","CADASTRO DE CLIENTES", JOptionPane.INFORMATION_MESSAGE);

            switch (opcao) {
                case "1" -> {
                    String dados = JOptionPane.showInputDialog(null,
                            "Informe os dados do cliente separados por vírgula, " +
                                    "conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado:",
                            "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
                    cadastrar(dados);
                }
                case "2" -> {
                    String dados = JOptionPane.showInputDialog(null,
                            "informe o CPF do cliente", "CONSULTA", JOptionPane.INFORMATION_MESSAGE);
                    consultar(dados);
                }
                case "3" -> {
                    String dados = JOptionPane.showInputDialog(null,
                            "informe o CPF do cliente", "EXCLUIR CLIENTE", JOptionPane.INFORMATION_MESSAGE);
                    excluir(dados);
                }
                case "4" -> {
                    String dados = JOptionPane.showInputDialog(null,
                            "Informe os dados do cliente separados por vírgula, " +
                                    "conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado:",
                            "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
                    alterar(dados);
                }
                case "5" -> {
                    JOptionPane.showMessageDialog(null,
                            "Até logo!", null, JOptionPane.INFORMATION_MESSAGE);
                    rodando = false;
                }
            }
        }
    }

    private static void alterar(String dados) {
        String[] dadosRecebidos = dados.split(",");
        Cliente cliente = new Cliente(dadosRecebidos[0],dadosRecebidos[1],dadosRecebidos[2],dadosRecebidos[3],
                dadosRecebidos[4],dadosRecebidos[5],dadosRecebidos[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
       iClienteDAO.excluir(Long.parseLong(dados));
       JOptionPane.showInputDialog("Cliente excluído com secesso");
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showInputDialog(cliente.toString());
        } else {
            JOptionPane.showInputDialog("Cliente não encontrado");
        }
    }

    private static void cadastrar(String dados) {
        String[] dadosRecebidos = dados.split(",");
        Cliente cliente = new Cliente(dadosRecebidos[0],dadosRecebidos[1],dadosRecebidos[2],dadosRecebidos[3],
        dadosRecebidos[4],dadosRecebidos[5],dadosRecebidos[6]);
        boolean cadastrado = iClienteDAO.cadastrar(cliente);
        if (cadastrado ) {
            JOptionPane.showMessageDialog(null,
                    "Cliente cadastrado com sucesso", null,JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cliente já cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
