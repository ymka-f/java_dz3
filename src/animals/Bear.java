package animals;

public class Bear extends Carnivorous implements Run, Voice
{
    public Bear(String name, int satiety, CageSize animalCageSize)
    {
        super(name, satiety, animalCageSize);
    }

    @Override
    public void run()
    {
        System.out.println("Медведь бежит");
    }

    @Override
    public String voice()
    {
        return "Медведь рычит";
    }
}
