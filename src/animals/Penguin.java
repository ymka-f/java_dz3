package animals;

public class Penguin extends Carnivorous implements Run, Swim, Voice
{
    public Penguin(String name, int satiety, CageSize animalCageSize)
    {
        super(name, satiety, animalCageSize);
    }

    @Override
    public void run()
    {
        System.out.println("Пингвин бежит");
    }

    @Override
    public void swim()
    {
        System.out.println("Пингвин плывет");
    }

    @Override
    public String voice()
    {
        return "Пингвин кричит";
    }
}
