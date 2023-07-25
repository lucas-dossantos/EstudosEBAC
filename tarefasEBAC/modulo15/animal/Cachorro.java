package tarefasEBAC.modulo15.animal;

public class Cachorro implements IAnimal{
    @Override
    public String getAnimal() {
        return "Cachorro";
    }

    @Override
    public String fazSom() {
        return "Au Au";
    }
}
