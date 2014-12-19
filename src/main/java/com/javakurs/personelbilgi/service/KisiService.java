package com.javakurs.personelbilgi.service;

import com.javakurs.personelbilgi.entity.Kisi;
import com.javakurs.personelbilgi.facade.KisiFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class KisiService {
    
    @EJB
    private KisiFacade kisiFacade;
    
    public void ekle(Kisi kisi){
        
        kisiFacade.create(kisi);
        
    }
    
    
}
