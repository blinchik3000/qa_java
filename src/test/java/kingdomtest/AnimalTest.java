package kingdomtest;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AnimalTest {

    @Test
    public void checkAnimalPredatorGetFood() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals("Рацион хищника не соответствует ожидаемому",List.of("Животные", "Птицы", "Рыба"),animal.getFood("Хищник"));
    }

    @Test
    public void checkAnimalHerbivoreGetFood() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals("Рацион травоядного не соответствует ожидаемому",List.of("Трава", "Различные растения"),animal.getFood("Травоядное"));
    }


    @Test(expected = Exception.class)
    public void checkAnimalOmnivorousGetFood() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Всеядное");
    }

    @Test
    public void checkAnimalGetFamily(){
        Animal animal = new Animal();

        Assert.assertEquals("Список семейств отличается от ожидаемого","Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",animal.getFamily());
    }

}
