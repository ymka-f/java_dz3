package animals;

public class Lion extends Carnivorous implements Run, Voice
{
    public Lion(String name, int satiety, CageSize animalCageSize)
    {
        super(name, satiety, animalCageSize);
    }

    @Override
    public void run()
    {
        System.out.println("Лев бежит");
    }

    @Override
    public String voice()
    {
        return "Лев рычит";
    }
}
