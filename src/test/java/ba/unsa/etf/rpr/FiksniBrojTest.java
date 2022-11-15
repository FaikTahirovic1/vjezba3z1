package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FiksniBrojTest {
    FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf("BUGOJNO");
    FiksniBroj.Grad grad2 = FiksniBroj.Grad.valueOf("SARAJEVO");
    String broj = "022-333";
    FiksniBroj f1 = new FiksniBroj(grad1,broj);
    FiksniBroj f2 = new FiksniBroj(grad2,broj);
@Test
    public void ispisGrada(){
    assertEquals(f1.ispisi(),"Grad{030}022-333");
}
    @Test
    public void ispisGrada2(){
        assertEquals(f2.ispisi(),"Grad{033}022-333");
    }
}
