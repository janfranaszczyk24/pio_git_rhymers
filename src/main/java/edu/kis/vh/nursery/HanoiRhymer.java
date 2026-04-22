package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;
    /*
        Zwraca totalRejected
     */
    public int reportRejected() {
        return totalRejected;
    }
    /*
        dodaje liczbe pod warunkiem ze tablica nie jest pusta i ostatnia liczba to nie jest ta liczba
     */
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
