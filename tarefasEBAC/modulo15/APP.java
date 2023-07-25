package tarefasEBAC.modulo15;

import tarefasEBAC.modulo15.animal.IAnimal;
import tarefasEBAC.modulo15.cor.ICor;
import tarefasEBAC.modulo15.factory.IAbstractFactory;

public class APP {

    public static void main(String[] args) {
        IAbstractFactory iAbstractFactory;

        // criando um cachorro da cor preta
        iAbstractFactory = FactoryProvider.getFactory("Animal");
        IAnimal animal = (IAnimal) iAbstractFactory.criar("Cachorro");

        iAbstractFactory = FactoryProvider.getFactory("Cor");
        ICor iCor = (ICor) iAbstractFactory.criar("Preto");

        String resultado = String.format("Um %s de cor %s faz %s", animal.getAnimal(), iCor.getCor(), animal.fazSom());

        System.out.println(resultado);
    }
}
