package tarefasEBAC.modulo24.teste;

import org.junit.Assert;
import org.junit.Test;
import tarefasEBAC.modulo24.dao.IContratoDao;
import tarefasEBAC.modulo24.mock.ContratoDaoMock;
import tarefasEBAC.modulo24.service.ContratoService;
import tarefasEBAC.modulo24.service.IContratoService;

import javax.swing.*;

public class ContratoTest {

    @Test
    public void salvarTeste() {
        IContratoDao contratoDao = new ContratoDaoMock();
        IContratoService contratoService = new ContratoService(contratoDao);
        String retorno = contratoService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTeste() {
        IContratoDao contratoDao = new ContratoDaoMock();
        IContratoService contratoService = new ContratoService(contratoDao);
        String retorno = contratoService.buscar();
        Assert.assertEquals("Buscando contrato", retorno);
    }

    @Test
    public void atulizarTeste() {
        IContratoDao contratoDao = new ContratoDaoMock();
        IContratoService contratoService = new ContratoService(contratoDao);
        String retorno = contratoService.atualizar();
        Assert.assertEquals("Contrato atulalizado", retorno);
    }

    @Test
    public void excluirTeste() {
        IContratoDao contratoDao = new ContratoDaoMock();
        IContratoService contratoService = new ContratoService(contratoDao);
        String retorno = contratoService.excluir();
        Assert.assertEquals("Contrato excluído", retorno);
    }
}
