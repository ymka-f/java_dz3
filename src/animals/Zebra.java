package animals;

public class Zebra extends Herbivore implements Run, Voice
{
    public Zebra(String name, int satiety, CageSize animalCageSize)
    {
        super(name, satiety, animalCageSize);
    }

    @Override
    public void run()
    {
        System.out.println("Зебра бежит");
    }

    @Override
    public String voice()
    {
        return "Зебра ржет";
    }
}
