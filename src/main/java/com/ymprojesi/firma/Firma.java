package com.ymprojesi.firma;

public class Firma {

    private static int idSayici = 0;

    private int id;

    private String isim;

    private String adres;

    private int calisanSayisi;

    public Firma(String isim, String adres, int calisanSayisi) {
        this.id = ++idSayici;
        this.isim = isim;
        this.adres = adres;
        this.calisanSayisi = calisanSayisi;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getCalisanSayisi() {
        return calisanSayisi;
    }

    public void setCalisanSayisi(int calisanSayisi) {
        this.calisanSayisi = calisanSayisi;
    }
}
