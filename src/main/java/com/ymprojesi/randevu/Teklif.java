package com.ymprojesi.randevu;

import com.ymprojesi.calisan.Calisan;
import com.ymprojesi.calisan.ISGUzmani;
import com.ymprojesi.calisan.ISHekimi;
import com.ymprojesi.firma.Firma;

import java.util.List;

public class Teklif {

    private static int idSayici = 0;

    private int id;

    private Firma firma;

    private float ucret;

    private ISGUzmani isgUzmani;

    private ISHekimi isHekimi;

    private List<Calisan> asistanlar;

    private boolean tamamlandiMi;

    public Teklif(Firma firma, float ucret, ISGUzmani isgUzmani, ISHekimi isHekimi, List<Calisan> asistanlar) {
        this.id = ++idSayici;
        this.firma = firma;
        this.ucret = ucret;
        this.isgUzmani = isgUzmani;
        this.isHekimi = isHekimi;
        this.asistanlar = asistanlar;
        this.tamamlandiMi = false;
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

    public float getUcret() {
        return ucret;
    }

    public void setUcret(float ucret) {
        this.ucret = ucret;
    }

    public ISGUzmani getIsgUzmani() {
        return isgUzmani;
    }

    public void setIsgUzmani(ISGUzmani isgUzmani) {
        this.isgUzmani = isgUzmani;
    }

    public ISHekimi getIsHekimi() {
        return isHekimi;
    }

    public void setIsHekimi(ISHekimi isHekimi) {
        this.isHekimi = isHekimi;
    }

    public List<Calisan> getAsistanlar() {
        return asistanlar;
    }

    public void setAsistanlar(List<Calisan> asistanlar) {
        this.asistanlar = asistanlar;
    }

    public boolean isTamamlandiMi() {
        return tamamlandiMi;
    }

    public void setTamamlandiMi(boolean tamamlandiMi) {
        this.tamamlandiMi = tamamlandiMi;
    }
}
