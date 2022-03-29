package Tests;
import App.MyUnit;
import static org.junit.Assert.*;

import org.junit.Test;

public class testMyUnit{
    
    @Test 
    public void test(){
        assertEquals("WelcomeSejal",MyUnit.stringConcat("Welcome","Sejal"));
    }
}
