package tarefasEBAC.modulo15;

import tarefasEBAC.modulo15.factory.AnimalFactory;
import tarefasEBAC.modulo15.factory.CorFactory;
import tarefasEBAC.modulo15.factory.IAbstractFactory;

public class FactoryProvider {

    public static IAbstractFactory getFactory(String escolha){
        if ("Animal".equalsIgnoreCase(escolha)) {
            return new AnimalFactory();
        } else if ("Cor".equalsIgnoreCase(escolha)){
            return new CorFactory();
        }
        return null;
    }
}
