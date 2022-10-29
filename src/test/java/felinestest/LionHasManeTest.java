package felinestest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionHasManeTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    private final String sex;
    @Mock
    Feline feline;

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
        Lion lion = new Lion(sex, feline);

            if (sex.equals("Самец")){
            Assert.assertTrue(lion.doesHaveMane());
            } else if (sex.equals("Самка")) {
                Assert.assertFalse(lion.doesHaveMane());
            }
    }

}
