package felinestest;

import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Animal animal;

    @Test
    public void checkFelineEatMeat() throws Exception {
        Feline feline = new Feline(animal);
        List<String> expectedFoodlist = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(animal.getFood("Хищник")).thenReturn(expectedFoodlist);
        Assert.assertEquals("У кошачьих другой рацион", expectedFoodlist,feline.eatMeat());
    }


    @Test
    public void checkFelineGetFamily(){
        Feline feline = new Feline(animal);
        String family = feline.getFamily();
        Assert.assertEquals("Семейство не совпадает","Кошачьи",family);
    }

    @Test
    public void checkFelineGetKittensDefault(){
        Feline feline = new Feline();
        Assert.assertEquals("У кошачьих другое количество котят по умолчанию",1,feline.getKittens());
    }


}
