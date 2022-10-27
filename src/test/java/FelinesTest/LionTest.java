package FelinesTest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
    @Test
    public void checkKittensCountDefault(){
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline);
        Assert.assertEquals("Количество котят не соответствует ожидаемому",1,lion.getKittens());
    }
    @Mock
    Feline feline1;
    @Test
    public void checkWhatLionEats() throws Exception {
        Lion lion = new Lion(feline1);
        List<String> whatLionEat= Arrays.asList("Животные","Птицы", "Рыба");
        Mockito.when(feline1.getFood("Хищник")).thenReturn(whatLionEat);
        Assert.assertEquals("Неверный рацион льва",whatLionEat,lion.getFood());
    }


}
