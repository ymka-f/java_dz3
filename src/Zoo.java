import animals.*;
import animals.Cage;
import animals.CageSize;
import food.*;

public class Zoo
{
    public static void main(String[] args) throws WrongFoodException
    {
        Animal bear = new Bear("Миша", 8, CageSize.size4);
        Animal duck = new Duck("Утя", 8, CageSize.size2);
        Animal fish = new Fish("Немо", 8, CageSize.size1);
        Animal lion = new Lion("Алекс", 8, CageSize.size3);
        Animal penguin = new Penguin("Рико", 8, CageSize.size2);
        Animal zebra = new Zebra("Мартин", 8, CageSize.size3);

        Food grass = new Grass();
        Food meat = new Meat();

        Worker worker = new Worker();

        Cage<Carnivorous> cagesForCarnivorous = new Cage<>();
        Cage<Herbivore> cagesForHerbivore = new Cage<>();

        cagesForCarnivorous.putAnimal(bear, CageSize.size4);
        System.out.println(cagesForCarnivorous.getAnimal("Миша"));

        cagesForHerbivore.putAnimal(duck, CageSize.size2);
        System.out.println(cagesForHerbivore.getAnimal("Утя"));

        worker.feed(duck, grass);
        worker.feed(bear, grass);

    }
}
