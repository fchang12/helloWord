import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by oliver on 3/9/17.
 */
class MainTest {
    @Test
    public void test() {
        int k = 1;
        Main a = new Main();
        k = a.add(k);
        assertEquals(k, 2);
    }

}