package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MobilniBrojTest {
    int mb = 60;
    String broj = "013-444";
    MobilniBroj m = new MobilniBroj(mb,broj);
    //MobilniBroj m2 = new MobilniBroj(79,broj);

    public MobilniBrojTest() throws NeispravnaMobilnaMreza {
    }

    @Test
    public void TestIspisi(){
        assertEquals(m.ispisi(), "060/013-444");
    }
    @Test
    public void TestIspisi2(){
        assertThrows(NeispravnaMobilnaMreza.class,() -> {new MobilniBroj(79,broj);});
    }

}
