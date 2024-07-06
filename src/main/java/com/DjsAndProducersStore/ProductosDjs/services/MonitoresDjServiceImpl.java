
package com.DjsAndProducersStore.ProductosDjs.services;

import com.DjsAndProducersStore.ProductosDjs.model.MonitoresDj;
import com.DjsAndProducersStore.ProductosDjs.repository.MonitoresDjRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonitoresDjServiceImpl implements MonitoresDjService{
    
    @Autowired
    private MonitoresDjRepository monitoresdjRepository; 

    @Override
    public MonitoresDj newMonitoresDj(MonitoresDj newMonitoresDj) {
        return monitoresdjRepository.save(newMonitoresDj);
    }

    @Override
    public Iterable<MonitoresDj> getAll() {
       return this.monitoresdjRepository.findAll(); 
    }

    @Override
    public MonitoresDj modifyMonitoresDj(MonitoresDj monitoresdj) {
        
        Optional<MonitoresDj> monitoresdjEncontrado= this.monitoresdjRepository.findById(monitoresdj.getIduser());
        if(monitoresdjEncontrado.get()!=null){
        monitoresdjEncontrado.get().setGamamonitorstudio(monitoresdj.getGamamonitorstudio());
        monitoresdjEncontrado.get().setMarcamonitorstudio(monitoresdj.getMarcamonitorstudio());
        monitoresdjEncontrado.get().setModelomonitorstudio(monitoresdj.getModelomonitorstudio());
         return this.newMonitoresDj(monitoresdjEncontrado.get());
        }
            
       return null; 
    }

    @Override
    public Boolean deleteMonitoresDj(Long iduser) {
       this.monitoresdjRepository.deleteById(iduser); 
       return true;
       
    }    
} 

