package felinestest;

import com.example.Feline;
import com.example.Lion;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void checkAlexHasMane() throws Exception {
        Lion alex = new LionAlex(feline);
        Assert.assertTrue("пол Алекса отличается от ожидаемого",alex.doesHaveMane());
    }

    @Test
    public void checkAlexFriends() throws Exception {
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals("Список друзей Алекса отличается от ожидаемого", List.of("зебра Марти", "бегемотиха Глории","жираф Мелм"),alex.getFriends());
    }

    @Test
    public void checkAlexPlace() throws Exception {
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals("Место рождения Алекса отличается от ожидаемого", "Нью-Йоркский зоопарк",alex.getPlaceOfLiving());
    }

    @Test
    public void checkAlexKittensCount() throws Exception {
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals("Количество котят Алекса отличается от ожидаемого", 0,alex.getKittens());
    }
}
