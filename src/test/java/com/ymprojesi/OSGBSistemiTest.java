package com.ymprojesi;

import com.ymprojesi.calisan.ISGUzmani;
import com.ymprojesi.calisan.ISHekimi;
import com.ymprojesi.randevu.Randevu;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OSGBSistemiTest {

    @Test
    public void YeniRandevuIstegi_randevuyuListeyeEklemeli() {
        OSGBSistemi osgbSistemi = new OSGBSistemi();
        osgbSistemi.YeniRandevuIstegi("firmaAdi", "firmaAdresi", 12, "ad", "tel", "mail");
        assertEquals(1, osgbSistemi.RandevuIstekleri().size());
    }

    @Test
    public void RandevuTamamlandi_randevuyuTamamlandiOlarakIsaretlemeli() {
        OSGBSistemi osgbSistemi = new OSGBSistemi();
        osgbSistemi.YeniRandevuIstegi("firmaAdi", "firmaAdresi", 12, "ad", "tel", "mail");
        Randevu randevu = osgbSistemi.RandevuIstekleri().get(0);
        osgbSistemi.RandevuTamamlandi(randevu.getId());
        assertTrue(osgbSistemi.RandevuIstekleri().get(0).isTamamlandiMi());
    }

    @Test
    public void YeniTeklifKaydi_teklifiListeyeEklemeli() {
        OSGBSistemi osgbSistemi = new OSGBSistemi();
        osgbSistemi.YeniRandevuIstegi("firmaAdi", "firmaAdresi", 12, "ad", "telefon", "mail");
        Randevu randevu = osgbSistemi.RandevuIstekleri().get(0);
        osgbSistemi.YeniTeklifKaydi(randevu.getFirma(), 123, new ISGUzmani("isim", "tel"), new ISHekimi("isim", "tel"), new ArrayList<>());
        assertEquals(1, osgbSistemi.Teklifler().size());
    }
}
