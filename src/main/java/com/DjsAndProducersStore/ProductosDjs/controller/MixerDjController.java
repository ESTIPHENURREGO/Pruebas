
package com.DjsAndProducersStore.ProductosDjs.controller;

import com.DjsAndProducersStore.ProductosDjs.model.MixerDj;
import com.DjsAndProducersStore.ProductosDjs.services.MixerDjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mixerdj")
public class MixerDjController {
   
  @Autowired
  private MixerDjService mixerdjService;
   
  @PostMapping("/nuevo")
    public MixerDj newMixerDj(@RequestBody MixerDj newMixerDj){
    return this.mixerdjService.newMixerDj(newMixerDj);
    }
    
    @GetMapping("/mostrar")
    public Iterable<MixerDj> getAll(){
        return mixerdjService.getAll();
    }
    
    @PostMapping("/modificar")
    public MixerDj updateMixerDj(@RequestBody MixerDj mixerdj){        
      return this.mixerdjService.modifyMixerDj(mixerdj);
    }    
    
    @PostMapping(value="/{id}")
    public Boolean deleteMixerDj(@PathVariable(value="id") Long id) {      
    return this.mixerdjService.deleteMixerDj(id);
    }

} 