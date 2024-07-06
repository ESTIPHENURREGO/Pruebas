
package com.DjsAndProducersStore.ProductosDjs.services;

import com.DjsAndProducersStore.ProductosDjs.model.MonitoresDj;


public interface MonitoresDjService {
    MonitoresDj newMonitoresDj (MonitoresDj newMonitoresDj);
    Iterable<MonitoresDj> getAll();
    MonitoresDj modifyMonitoresDj (MonitoresDj monitoresdj);
    Boolean deleteMonitoresDj (Long iduser);
            
}
