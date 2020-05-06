package com.ymprojesi.randevu;

import com.ymprojesi.firma.Firma;

public class Randevu {

    private static int idSayici = 0;

    private int id;

    private Firma firma;

    private String ad;

    private String telefon;

    private String mail;

    private boolean tamamLandiMi;

    public Randevu(Firma firma, String ad, String telefon, String mail) {
        this.id = ++idSayici;
        this.firma = firma;
        this.ad = ad;
        this.telefon = telefon;
        this.mail = mail;
        this.tamamLandiMi = false;
    }

    public void tamamlandi() {
        setTamamlandiMi(true);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isTamamlandiMi() {
        return tamamLandiMi;
    }

    public void setTamamlandiMi(boolean tamamLandiMi) {
        this.tamamLandiMi = tamamLandiMi;
    }
}
