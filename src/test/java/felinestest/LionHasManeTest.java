package felinestest;

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
        };
    }

    @Test
    public void checkIsLionHasMane() throws Exception {
        Lion lion = new Lion(sex);

            if (sex.equals("Самец")){
            Assert.assertTrue(lion.doesHaveMane());
            } else if (sex.equals("Самка")) {
                Assert.assertFalse(lion.doesHaveMane());
            }
    }

}
