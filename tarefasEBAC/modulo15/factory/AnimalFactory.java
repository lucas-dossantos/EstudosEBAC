package tarefasEBAC.modulo15.factory;

import tarefasEBAC.modulo15.animal.Cachorro;
import tarefasEBAC.modulo15.animal.Gato;
import tarefasEBAC.modulo15.animal.IAnimal;
import tarefasEBAC.modulo15.animal.Pato;

public class AnimalFactory implements IAbstractFactory<IAnimal>{
    @Override
    public IAnimal criar(String tipo) {
        if("Cachorro".equalsIgnoreCase(tipo)){
            return new Cachorro();
        } else if ("Gato".equalsIgnoreCase(tipo)){
            return new Gato();
        } else if ("Pato".equalsIgnoreCase(tipo)){
            return new Pato();
        }
        return null;
    }
}
