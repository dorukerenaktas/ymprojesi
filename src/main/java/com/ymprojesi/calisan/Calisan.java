package com.ymprojesi.calisan;

public class Calisan {

    private static int idSayici = 0;

    private int id;

    private String isim;

    private String telefon;

    public Calisan(String isim, String telefon) {
        this.id = ++idSayici;
        this.isim = isim;
        this.telefon = telefon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
