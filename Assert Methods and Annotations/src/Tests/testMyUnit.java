package Tests;
import App.MyUnit;

import org.junit.Test;

import static org.junit.Assert.*;

public class testMyUnit {
    @Test
    public void test(){
        assertEquals(true,MyUnit.palindromeCheck("madam"));
        assertEquals(false,MyUnit.palindromeCheck("sejal"));

    }

}

