package oop;

public class Program {
    public static void main(String[] args) {
        Ablak becsukva = new Ablak();
        becsukva.kilincsSzam = 1;
        becsukva.sotetitettE = true;
        becsukva.szin = "fehér";
        becsukva.allapot = "becsukva";
        
        Ablak kinyitva = new Ablak();
        kinyitva.kilincsSzam = 1;
        kinyitva.sotetitettE = true;
        kinyitva.szin = "fehér";
        kinyitva.allapot = "kinyitva";
    }
}
