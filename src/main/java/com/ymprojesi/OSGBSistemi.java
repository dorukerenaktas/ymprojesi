package com.ymprojesi;

import com.ymprojesi.calisan.Calisan;
import com.ymprojesi.calisan.ISGUzmani;
import com.ymprojesi.calisan.ISHekimi;
import com.ymprojesi.firma.Firma;
import com.ymprojesi.randevu.Randevu;
import com.ymprojesi.randevu.Teklif;

import java.util.ArrayList;
import java.util.List;

public class OSGBSistemi {

    private final List<Randevu> randevuListesi;

    private final List<Teklif> teklifListesi;

    public OSGBSistemi() {
        this.randevuListesi = new ArrayList<>();
        this.teklifListesi = new ArrayList<>();
    }

    public void YeniRandevuIstegi(String firmaAdi, String firmaAdresi, int calisanSayisi, String ad, String telefon, String mail) {
        randevuListesi.add(new Randevu(new Firma(firmaAdi, firmaAdresi, calisanSayisi), ad, telefon, mail));
    }

    public List<Randevu> RandevuIstekleri() {
        return randevuListesi;
    }

    public void RandevuTamamlandi(int id) {
        randevuListesi.forEach(randevu -> {
            if (randevu.getId() == id) {
                randevu.tamamlandi();
            }
        });
    }

    public void YeniTeklifKaydi(Firma firma, float ucret, ISGUzmani isgUzmani, ISHekimi isHekimi, List<Calisan> asistanlar) {
        teklifListesi.add(new Teklif(firma, ucret, isgUzmani, isHekimi, asistanlar));
    }

    public List<Teklif> Teklifler() {
        return teklifListesi;
    }
}
