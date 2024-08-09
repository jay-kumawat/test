import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.*;

public class last2charSwapTest {

    last2charSwap ls = new last2charSwap();

    @Test
    public void chkwith0char(){
        assertEquals("", ls.swap2char(""));
    }

    @Test
    public void chkwith1char(){
        assertEquals("B", ls.swap2char("B"));
    }

    @Test
    public void chkwith4char(){
        assertEquals("ABDC", ls.swap2char("ABCD"));
    }

    @Test
    public void chkwith10char(){
        assertEquals("ABCDFHTERF", ls.swap2char("ABCDFHTEFR"));
    }
    @Test
    public void chkwith5char(){
        assertEquals("ABCFD", ls.swap2char("ABCDF"));
    }
    @Test
    public void chkwith6char(){
        assertEquals("ABCFD", ls.swap2char("ABCDF"));
    }

    @Test
    public void normalarraychk(){
        assertArrayEquals(new int[] {1,2,3}, ls.hi(new int[] {1,2,3}));
    }
}
