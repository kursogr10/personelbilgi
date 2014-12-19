package com.javakurs.personelbilgi.bean;

import com.javakurs.personelbilgi.entity.Kisi;
import com.javakurs.personelbilgi.entity.Telefon;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "kayitBean")
@RequestScoped
public class KayitBean {
   
    private Kisi kisi= new Kisi();
    private Telefon cepTel = new Telefon();
    private Telefon evTel = new Telefon();

    public Telefon getCepTel() {
        return cepTel;
    }

    public void setCepTel(Telefon cepTel) {
        this.cepTel = cepTel;
    }

    public Telefon getEvTel() {
        return evTel;
    }

    public void setEvTel(Telefon evTel) {
        this.evTel = evTel;
    }    
    
    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }   
    
    public KayitBean() {
        
        
    }
    
}
