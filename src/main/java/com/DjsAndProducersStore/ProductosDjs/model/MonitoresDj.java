
package com.DjsAndProducersStore.ProductosDjs.model;

//clase para elaborar la entidad de la aplicacio

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class MonitoresDj {
    @Id 
    @Column
    private Long iduser;
    
    @Column
    private String marcamonitorstudio;
    
    @Column
    private String modelomonitorstudio;
    
    @Column
    private String gamamonitorstudio;
    
}
