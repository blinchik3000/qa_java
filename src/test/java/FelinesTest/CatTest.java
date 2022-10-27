package FelinesTest;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Test
    public void checkCatGetSound() {
        Cat cat = new Cat(new Feline());
        String catSound = cat.getSound();
        Assert.assertEquals("Кошка говорит неверно", "Мяу", catSound);
    }

    @Mock
    Feline predator;

    @Test
    public void checkCatGetFood() throws Exception {
        Cat cat = new Cat(predator);
        List<String> whatCatEat = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(whatCatEat);
        Assert.assertEquals("Неверный рацион кошек", whatCatEat, cat.getFood());

    }
}
