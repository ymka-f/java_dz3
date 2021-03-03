import animals.Animal;
import animals.Voice;
import food.Food;
import food.WrongFoodException;

public class Worker
{
    public void feed(Animal animal, Food food) throws WrongFoodException
    {
        animal.eat(food);
    }
    public void makeVoice(Animal animal)
    {
        Voice voiceAnimal = (Voice) animal;
        System.out.println(voiceAnimal.voice());
    }
}
