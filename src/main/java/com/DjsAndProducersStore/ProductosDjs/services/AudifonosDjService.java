
package com.DjsAndProducersStore.ProductosDjs.services;

import com.DjsAndProducersStore.ProductosDjs.model.AudifonosDj;


public interface AudifonosDjService {
    AudifonosDj newAudifonosDj (AudifonosDj newAudifonosDj);
    Iterable<AudifonosDj> getAll();
    AudifonosDj modifyAudifonosDj (AudifonosDj audifonosdj);
    Boolean deleteAudifonosDj (Long iduser);
            
}
