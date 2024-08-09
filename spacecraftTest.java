import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.*;



public class spacecraftTest {
    
    @Test
    public void TestMoveForward(){
        spacecraft sc = new spacecraft(0,0,0, "N");
        sc.processCommand(new char[] {'f'});
        assertArrayEquals(new int[] {0,1,0}, sc.getPosition());
    }

    @Test
    public void TestMoveBackward(){
        spacecraft sc = new spacecraft(0, 1, 0, "U");
        sc.processCommand(new char[] {'b'});
        assertArrayEquals(new int[] {0,1,-1}, sc.getPosition());
    }

    @Test
    public void CheckComplex(){
        spacecraft sc =  new spacecraft(0, 0, 0, "N");
        sc.processCommand(new char[] {'f', 'r', 'u', 'b', 'l'});
        // assertArrayEquals(new int[] {0,1,-1}, sc.getPosition());
        assertEquals("N", sc.getDirection());
    }

}
