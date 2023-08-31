package tarefasEBAC.modulo24.teste;

import org.junit.Assert;
import org.junit.Test;
import tarefasEBAC.modulo24.dao.ContratoDao;
import tarefasEBAC.modulo24.dao.IContratoDao;
import tarefasEBAC.modulo24.service.ContratoService;
import tarefasEBAC.modulo24.service.IContratoService;


public class ContratoExceptionTest {

    @Test(expected = UnsupportedOperationException.class)
    public void erroSalvarTeste() {
        IContratoDao contratoDao = new ContratoDao();
        IContratoService contratoService = new ContratoService(contratoDao);
        String retorno = contratoService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroBuscarTeste() {
        IContratoDao contratoDao = new ContratoDao();
        IContratoService contratoService = new ContratoService(contratoDao);
        String retorno = contratoService.buscar();
        Assert.assertEquals("Buscando contrato", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroAtulalizarTeste() {
        IContratoDao contratoDao = new ContratoDao();
        IContratoService contratoService = new ContratoService(contratoDao);
        String retorno = contratoService.atualizar();
        Assert.assertEquals("Contrato atulalizado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroExcluirTeste() {
        IContratoDao contratoDao = new ContratoDao();
        IContratoService contratoService = new ContratoService(contratoDao);
        String retorno =contratoService.excluir();
        Assert.assertEquals("Contrato excluído", retorno);
    }

}
