package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testWithEmptyString(){
      assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testUnBalancedBracketsInput(){
      assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testNotInOrderBracketsInput(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testWithBalancedBracketsInput(){
       assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
}
