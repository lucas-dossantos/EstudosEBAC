package tarefasEBAC.modulo24.service;

import tarefasEBAC.modulo24.dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao iContratoDao;

    public ContratoService(IContratoDao iContratoDao) {
        this.iContratoDao = iContratoDao;
    }

    @Override
    public String salvar() {
        iContratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        iContratoDao.buscar();
        return "Buscando contrato";
    }

    @Override
    public String atualizar() {
        iContratoDao.atualizar();
        return "Contrato atulalizado";
    }

    @Override
    public String excluir() {
        iContratoDao.excluir();
        return "Contrato excluído";
    }
}
