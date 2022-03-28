package meleha_Selenium.Java.Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class TwoWayToItreate {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("How", "To", "Iterate", "In", "Java");
        //System.out.println(collection);
        Iterator<String>iterator = collection.iterator();

    }
}
