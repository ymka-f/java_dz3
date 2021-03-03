package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal
{

    public Carnivorous(String name, int satiety, CageSize animalCageSize)
    {
        super(name, satiety, animalCageSize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException
    {
        if (food instanceof Meat)
        {
            satiety += food.getSatietyFood();
            System.out.println(getName() + " ест мясо и тепер у него(неё) " + satiety + " сытости.");
        }
        else throw new WrongFoodException(getName() + " не ест траву");
    }
}
