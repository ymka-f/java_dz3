package animals;

import food.Food;
import food.WrongFoodException;

public abstract class Animal
{
    String name;
    int satiety;
    CageSize animalCageSize;


    public abstract void eat(Food food) throws WrongFoodException;

    public Animal(String name, int satiety, CageSize animalCageSize)
    {
        this.name = name;
        this.satiety = satiety;
        this.animalCageSize = animalCageSize;
    }

    public String getName()
    {
        return name;
    }

}
