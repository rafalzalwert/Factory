import com.zoo.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalFactoryTest {
    private static AnimalFactory animalFactory;
    private static Sound sound;

    @BeforeClass
    public static void setUp() {
        animalFactory = new AnimalFactory();
    }

    @Test
    public void ReturnCow() {
        sound = animalFactory.getSound(Animals.Cow);
        assertTrue(sound instanceof Cow);
        assertEquals(sound.makeSound(), "Muuuuu");
    }

    @Test
    public void ReturnCat() {
        sound = animalFactory.getSound(Animals.Cat);
        assertTrue(sound instanceof Cat);
        assertEquals(sound.makeSound(), "Miauuu Miauuuu");
    }

    @Test
    public void ReturnDog() {
        sound = animalFactory.getSound(Animals.Dog);
        assertTrue(sound instanceof Dog);
        assertEquals(sound.makeSound(), "Hooow Hooow");
    }
}