package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FiksniBrojTest {
    FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf("BUGOJNO");
    String broj = "022-333";
    FiksniBroj f1 = new FiksniBroj(grad1,broj);
@Test
    public void ispisGrada(){
    assertEquals(f1.ispisi(),"Grad{030}022-333");
}
}
