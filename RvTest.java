import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class RvTest{
    @Test
    public <String> void StringReverse() {
        if (Rv.method("").isEmpty()) {
            System.out.println("Empty");
        }
    }
    @Test
    public <String>void special() {
        if (Rv.method("  ").endsWith(" ")) {
            System.out.println("Extra spaces");
        }
        System.out.println("running");
    }
    @Test
    public <String> void StringReverse1() {
        if (Rv.method("*").matches("[!@#$%^&*()_+]")) {
            System.out.println("Contains Symbols");
        }
    }

    @Test
    public <String> void StringReverse2() {
        if (Rv.method("9").matches("[0-9]")) {
            System.out.println("Contains numbers");
        }
    }
}