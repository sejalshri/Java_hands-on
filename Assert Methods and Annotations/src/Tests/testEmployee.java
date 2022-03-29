package Tests;
import App.Employee;
import java.util.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class testEmployee {
    @Test
    public void test(){
        ArrayList<String> list=new ArrayList<>(){
            {
                add("Sejal");
                add("Suhani");
                add("Gungun");
            }
        };
        assertEquals("NOT FOUND",Employee.findName(list,"Neha"));
        assertEquals("FOUND", Employee.findName(list, "Gungun"));
    }

}
