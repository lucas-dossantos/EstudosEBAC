package tarefasEBAC.modulo15.animal;

public class Gato implements IAnimal{
    @Override
    public String getAnimal() {
        return "Gato";
    }

    @Override
    public String fazSom() {
        return "Miau";
    }
}
