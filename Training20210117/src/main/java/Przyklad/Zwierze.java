package Przyklad;

import lombok.Getter;
import lombok.Setter;

public class Zwierze {

    private int iloscLap;

    public Zwierze(int iloscLap) {
        this.iloscLap = iloscLap;
    }

    public int getIloscLap() {
        return iloscLap;
    }

    public void setIloscLap(int iloscLap) {
        this.iloscLap = iloscLap;
    }
}