
package com.DjsAndProducersStore.ProductosDjs.services;

import com.DjsAndProducersStore.ProductosDjs.model.MixerDj;


public interface MixerDjService {
    MixerDj newMixerDj (MixerDj newMixerDj);
    Iterable<MixerDj> getAll();
    MixerDj modifyMixerDj (MixerDj mixerdj);
    Boolean deleteMixerDj (Long iduser);
            
}
