package tarefasEBAC.modulo15.factory;

import tarefasEBAC.modulo15.cor.Branco;
import tarefasEBAC.modulo15.cor.ICor;
import tarefasEBAC.modulo15.cor.Marrom;
import tarefasEBAC.modulo15.cor.Preto;

public class CorFactory implements IAbstractFactory<ICor>{
    @Override
    public ICor criar(String tipo) {
        if ("Marrom".equalsIgnoreCase(tipo)){
            return new Marrom();
        } else if ("Preto".equalsIgnoreCase(tipo)){
            return new Preto();
        } else if ("Branco".equalsIgnoreCase(tipo)){
            return new Branco();
        }
        return null;
    }
}
