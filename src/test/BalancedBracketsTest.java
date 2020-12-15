package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
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

    @Test
    public void testWithNonBracketString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void testWithManyUnBalancedBracketString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch[Code]]"));
    }
    @Test
    public void testWithManyBalancedBracketString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }
    @Test
    public void testWithCurlyBracketString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("{LaunchCode}"));
    }
    @Test
    public void testWithManyTypesOfBracketInput(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("{Launch[Code]}"));
    }
    @Test
    public void testWithCurlyUnBalancedBracketInput(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("{Launch[Code]]}"));
    }
    @Test
    public void testWithSpecialCharactersInput(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch-Code"));
    }
    @Test
    public void testWithSpecialCharacterAndBracketInput(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch-Code]"));
    }


}
