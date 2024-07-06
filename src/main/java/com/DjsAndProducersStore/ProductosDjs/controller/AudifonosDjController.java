
package com.DjsAndProducersStore.ProductosDjs.controller;

import com.DjsAndProducersStore.ProductosDjs.model.AudifonosDj;
import com.DjsAndProducersStore.ProductosDjs.services.AudifonosDjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audifonosdj")
public class AudifonosDjController {
   
  @Autowired
  private AudifonosDjService audifononosdjService;
   
  @PostMapping("/nuevo")
    public AudifonosDj newAudifonosDj(@RequestBody AudifonosDj newAudifonosDj){
    return this.audifononosdjService.newAudifonosDj(newAudifonosDj);
    }
    
    @GetMapping("/mostrar")
    public Iterable<AudifonosDj> getAll(){
        return audifononosdjService.getAll();
    }
    
    @PostMapping("/modificar")
    public AudifonosDj updateAudifonosDj(@RequestBody AudifonosDj audifonosdj){        
      return this.audifononosdjService.modifyAudifonosDj(audifonosdj);
    }    
    
    @PostMapping(value="/{id}")
    public Boolean deleteAudifonosDj(@PathVariable(value="id") Long id) {      
    return this.audifononosdjService.deleteAudifonosDj(id);
    }

}