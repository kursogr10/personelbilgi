package com.javakurs.personelbilgi.bean;

import com.javakurs.personelbilgi.entity.Kisi;
import com.javakurs.personelbilgi.entity.Telefon;
import com.javakurs.personelbilgi.service.KisiService;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "kayitBean")
@RequestScoped
public class KayitBean {
    
    @EJB
    private KisiService kisiService;
   
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
    
    public void ekle(){
        
        List<Telefon> telefonList = new ArrayList<>();
        
        telefonList.add(evTel);
        telefonList.add(cepTel);
        
        kisi.setTelefonList(telefonList);
      //  cepTel.setKisi(kisi);
      //  evTel.setKisi(kisi);
        
        kisiService.ekle(kisi);
             
        kisi=new Kisi();
        cepTel=new Telefon();
        evTel=new Telefon();
        
    }
    
}
