package ba.unsa.etf.rpr;

import java.util.*;

public class Imenik {
    HashMap<String, TelefonskiBroj> brojevi;



    public Imenik() {
        this.brojevi = new HashMap<String,TelefonskiBroj>();
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        brojevi.put(ime, broj);

    }

    public String dajBroj(String ime) {
        return brojevi.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> pom : brojevi.entrySet()) {
            if (pom.getValue().equals(broj)) return pom.getKey();
        }
        return "Nepostojeci";
    }

    public String naSlovo(char s) {
        String pom = "";
        int br = 1;
        for (Map.Entry<String, TelefonskiBroj> p : brojevi.entrySet()) {
            if (p.getKey().startsWith(String.valueOf(s))) {
                pom += br + p.getKey() + p.getValue().ispisi();
                br++;
            }
        }
        return pom;
    }

    public Set<String> izGrada(FiksniBroj.Grad g) {
        SortedSet<String> s = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj> p : brojevi.entrySet()) {
            if (p.getValue().ispisi().contains(g.toString())) s.add(p.getKey());
        }
        return s;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        SortedSet<TelefonskiBroj> s = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj> p : brojevi.entrySet()) {
            if (p.getValue().ispisi().contains((g.toString()))) s.add(p.getValue());
        }
        return s;
    }

    public String ispisiSve() {
        String pom = "";
        int br = 1;
        for (Map.Entry<String, TelefonskiBroj> p : brojevi.entrySet()) {
            pom += br +" "+ p.getKey()+" " + p.getValue().ispisi() +"\n";
            br++;
        }return pom;

    }
}
