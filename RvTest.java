import org.junit.Test;
import static org.junit.Assert.*;

public class RvTest{
    @Test
    public <String> void StringReverse() {
        if (Reverse.methodTwo("").isEmpty()) {
            System.out.println("Empty");
        }
    }
    @Test
    public <String> void StringReverse1() {
        if (Reverse.methodTwo("*").matches("[!@#$%^&*()_+]")) {
            System.out.println("Contains Symbols");
        }
    }
    @Test
    public <String> void StringReverse2() {
        if (Reverse.methodTwo("9").matches("[0-9]")) {
            System.out.println("Contains numbers");
        }
    }
    @Test
    public <String> void StringReverse3(){
        if(Reverse.methodTwo("2.05").matches("[0.01-9.99]")){
            System.out.println("Contains Double");
        }
    }
    @Test
    public <String> void StringReverse4(){
        if(Reverse.methodTwo("-5").matches("[-0 --9]")){
            System.out.println("Contains Negative values");
        }
    }
    @Test
    public <String> void StringReverse5(){
        if(Reverse.methodTwo("|").matches("[|,:';<>? ]")){
            System.out.println("Contains Special Charecters");
        }
    }
      @Test
    public <String> void testStringrev() {
        Reverse tester = new Reverse();
        assertEquals("Enter String", "dcba", tester.methodTwo("abcd"));
    }
    @Test
    public <String>void special() {
        if(Reverse.methodTwo("0  ").matches("  ")) {
            System.out.println("Extra spaces");
        }
    }
}