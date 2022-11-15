package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{
     enum Grad{
        BUGOJNO("030"),
        ODZAK("031"),
        ZENICA("032"),
        SARAJEVO("033"),
        LIVNO("034"),
        TUZLA("035"),
        MOSTAR("036"),
        BIHAC("037"),
        GORAZDE("038"),
        GRUDE("039"),
        BRCKO("049");

         public final String grad;
         private Grad(String label) {
             this.grad = label;
         }

         @Override
         public String toString() {
             return "Grad{"+this.grad +"}";
         }
     }
     private Grad grad;
     private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        return grad + broj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiksniBroj that = (FiksniBroj) o;
        return grad == that.grad && Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad, broj);
    }
}
