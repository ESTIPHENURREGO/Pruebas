
package com.DjsAndProducersStore.ProductosDjs.controller;

import com.DjsAndProducersStore.ProductosDjs.model.MonitoresDj;
import com.DjsAndProducersStore.ProductosDjs.services.MonitoresDjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitoresdj")
public class MonitoresDjController {
   
  @Autowired
  private MonitoresDjService monitoresdjService;
   
  @PostMapping("/nuevo")
    public MonitoresDj newMonitoresDj(@RequestBody MonitoresDj newMonitoresDj){
    return this.monitoresdjService.newMonitoresDj(newMonitoresDj);
    }
    
    @GetMapping("/mostrar")
    public Iterable<MonitoresDj> getAll(){
        return monitoresdjService.getAll();
    }
    
    @PostMapping("/modificar")
    public MonitoresDj updateMonitoresDj(@RequestBody MonitoresDj monitoresdj){        
      return this.monitoresdjService.modifyMonitoresDj(monitoresdj);
    }    
    
    @PostMapping(value="/{id}")
    public Boolean deleteMonitoresDj(@PathVariable(value="id") Long id) {      
    return this.monitoresdjService.deleteMonitoresDj(id);
    }

} 