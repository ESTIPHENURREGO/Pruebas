
package com.DjsAndProducersStore.ProductosDjs.services;

import com.DjsAndProducersStore.ProductosDjs.model.MixerDj;
import com.DjsAndProducersStore.ProductosDjs.repository.MixerDjRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MixerDjServiceImpl implements MixerDjService{
    
    @Autowired
    private MixerDjRepository mixerdjRepository; 

    @Override
    public MixerDj newMixerDj(MixerDj newMixerDj) {
        return mixerdjRepository.save(newMixerDj);
    }

    @Override
    public Iterable<MixerDj> getAll() {
       return this.mixerdjRepository.findAll(); 
    }

    @Override
    public MixerDj modifyMixerDj(MixerDj mixerdj) {
        
        Optional<MixerDj> mixerdjEncontrado= this.mixerdjRepository.findById(mixerdj.getIduser());
        if(mixerdjEncontrado.get()!=null){
        mixerdjEncontrado.get().setGamamixer(mixerdj.getGamamixer());
        mixerdjEncontrado.get().setMarcamixer(mixerdj.getMarcamixer());
        mixerdjEncontrado.get().setModelomixer(mixerdj.getModelomixer());
         return this.newMixerDj(mixerdjEncontrado.get());
        }
            
       return null; 
    }

    @Override
    public Boolean deleteMixerDj(Long iduser) {
       this.mixerdjRepository.deleteById(iduser); 
       return true;
       
    }    
} 
