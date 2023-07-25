package tarefasEBAC.modulo15.animal;

public class Pato implements IAnimal{
    @Override
    public String getAnimal() {
        return "Pato";
    }

    @Override
    public String fazSom() {
        return "Quac";
    }
}
