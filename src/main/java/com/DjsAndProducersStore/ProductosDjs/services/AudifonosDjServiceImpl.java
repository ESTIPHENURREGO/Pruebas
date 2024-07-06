
package com.DjsAndProducersStore.ProductosDjs.services;

import com.DjsAndProducersStore.ProductosDjs.model.AudifonosDj;
import com.DjsAndProducersStore.ProductosDjs.repository.AudifonosDjRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudifonosDjServiceImpl implements AudifonosDjService{
    
    @Autowired
    private AudifonosDjRepository audifonosdjRepository; 

    @Override
    public AudifonosDj newAudifonosDj(AudifonosDj newAudifonosDj) {
        return audifonosdjRepository.save(newAudifonosDj);
    }

    @Override
    public Iterable<AudifonosDj> getAll() {
       return this.audifonosdjRepository.findAll(); 
    }

    @Override
    public AudifonosDj modifyAudifonosDj(AudifonosDj audifonosdj) {
        
        Optional<AudifonosDj> audifonosdjEncontrado= this.audifonosdjRepository.findById(audifonosdj.getIduser());
        if(audifonosdjEncontrado.get()!=null){
        audifonosdjEncontrado.get().setGamaaudifono(audifonosdj.getGamaaudifono());
        audifonosdjEncontrado.get().setMarcaaudifono(audifonosdj.getMarcaaudifono());
         audifonosdjEncontrado.get().setModeloaudifono(audifonosdj.getModeloaudifono());
         return this.newAudifonosDj(audifonosdjEncontrado.get());
        }
            
       return null; 
    }

    @Override
    public Boolean deleteAudifonosDj(Long iduser) {
       this.audifonosdjRepository.deleteById(iduser); 
       return true;
       
    }    
}
