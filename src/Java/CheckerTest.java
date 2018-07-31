package Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckerTest {
    Checker checker = new Checker();


    @Test
    public void testCompare(){
        Player playerA = new Player("a", 2);
        Player playerB = new Player("b", 6);
        assertEquals(checker.compare(playerA, playerB), 4);
    }

}