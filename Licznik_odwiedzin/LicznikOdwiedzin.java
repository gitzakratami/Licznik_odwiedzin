package com.mycompany.projekt8.resources;

import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named
@SessionScoped
public class LicznikOdwiedzin implements Serializable {

    private int licznik;

    // Konstruktor
    public LicznikOdwiedzin() {
        licznik = 0; // Inicjalizacja licznika na 0
    }

    // Getter dla licznika
    public int getLicznik() {
        return licznik; // Zwracamy aktualną wartość licznika
    }

    // Metoda zwiększająca licznik
    public void zwiekszLicznik() {
        licznik++;
    }

    // Metoda resetująca licznik
    public String resetuj() {
        licznik = 0; // Resetujemy licznik do 0
        return "index?faces-redirect=true"; // Przekierowanie na stronę główną
    }
}