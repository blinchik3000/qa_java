package FelinesTest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineKittensCountTest {


    private final int kittensCount;

    public FelineKittensCountTest(int kittensCount){
        this.kittensCount=kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getCountOfKittens(){
            return new Object[][]{
            {-1},
            {0},
            {1},
        };
    }


    @Test
    public void checkFelineGetKittensCount(){
        Feline feline = new Feline();
        Assert.assertEquals("У кошачьих другое количество котят по умолчанию",kittensCount,feline.getKittens(kittensCount));
    }


}
