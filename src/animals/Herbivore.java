package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal
{

    public Herbivore(String name, int satiety, CageSize animalCageSize)
    {
        super(name, satiety, animalCageSize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException
    {
        if (food instanceof Grass)
        {
            satiety += food.getSatietyFood();
            System.out.println(getName() + " ест траву и тепер у него(неё) " + satiety + " сытости.");
        }
        else throw new WrongFoodException(getName() + " не ест мясо");
    }
}
