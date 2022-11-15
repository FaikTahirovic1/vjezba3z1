package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MobilniBrojTest {
    int mb = 60;
    String broj = "013-444";
    MobilniBroj m = new MobilniBroj(mb,broj);
    @Test
    public void TestIspisi(){
        assertEquals(m.ispisi(), "060/013-444");
    }
}
