package FelinesTest;

import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionHasManeTest {
    private final String sex;

    public LionHasManeTest(String sex){
        this.sex=sex;
    }

    @Parameterized.Parameters
    public static Object[][] isLionHasMane(){
        return new Object[][]{
            {"Самец"},
            {"Самка"},
            {"Небинарная личность"},
        };
    }

    @Test
    public void checkIsLionHasMane() {
        try {Lion lion = new Lion(sex);

            if (sex.equals("Самец")){
            Assert.assertTrue(lion.doesHaveMane());
            } else if (sex.equals("Самка")) {
                Assert.assertFalse(lion.doesHaveMane());
            }

        } catch (Exception e){
            Assert.assertEquals("Ошибка не соответствует ожидаемой","java.lang.Exception:"+" Используйте допустимые значения пола животного - самец или самка",e.toString());
        }
    }





}
