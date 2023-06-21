package tarefasEBAC.modulo14.dao;

import tarefasEBAC.modulo14.domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CienteSetDAO implements IClienteDAO {

    private Set<Cliente> set;

    public void ClienteSetDAO() {
        this.set = new HashSet<>();
    }


    @Override
    public boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }


    @Override
    public void excluir(Long cpf) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : this.set) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        if (clienteEncontrado != null) {
            this.set.remove(clienteEncontrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteCadastrado : this.set) {
                if (clienteCadastrado.equals(cliente)) {
                    clienteCadastrado.setNome(cliente.getNome());
                    clienteCadastrado.setCpf(cliente.getCpf());
                    clienteCadastrado.setTelefone(cliente.getTelefone());
                    clienteCadastrado.setEndereco(cliente.getEndereco());
                    clienteCadastrado.setNumeroEnd(cliente.getNumeroEnd());
                    clienteCadastrado.setCidade(cliente.getCidade());
                    clienteCadastrado.setEstado(cliente.getEstado());
                    break;
                }
            }
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente clienteCadastrado : this.set) {
            if (clienteCadastrado.getCpf().equals(cpf)) {
                return clienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}
