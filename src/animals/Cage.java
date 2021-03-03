package animals;

import java.util.HashMap;

public class Cage<T>
{
    private T animal;
    private CageSize cageSize;

    private HashMap<String, CageSize> animalInCage = new HashMap<>();

    public void putAnimal(Animal animal, CageSize cageSize)
    {
        if (cageSize == animal.animalCageSize)
        {
            if (animal instanceof Carnivorous)
            {
                System.out.println("Вольер для плотоядных");
            } else
            {
                System.out.println("Вольер для травоядных");
            }
            animalInCage.put(animal.name, cageSize);
        }
        else
        {
            System.out.println("Неверный размер вольера");
        }
    }
    public void removeAnimal(String name)
    {
        animalInCage.remove(name);
    }
    public CageSize getAnimal(String name)
    {
        return animalInCage.get(name);
    }
}
