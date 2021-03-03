package animals;

public class Fish extends Herbivore implements Swim
{
    public Fish(String name, int satiety, CageSize animalCageSize)
    {
        super(name, satiety, animalCageSize);
    }

    @Override
    public void swim()
    {
        System.out.println("Рыбка плывет");
    }
}
