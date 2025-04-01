package ser515.unittest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import inclass.HelloWorld;
public class UnitTest2 {

    @Test
    void testReturn(){
        Assertions.assertEquals(1, HelloWorld.returnOne());
    }
    @Test
    void testToHellWorld() {
        Assertions.assertEquals(1, 1);
    }




}
