package edu.co.icesi.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "sensor")
public class SensorModel {

    @Id
    private String id;

    private String type;

    private String scale;


    @ManyToOne
    @JoinColumn(name = "sectorid")
    @Nullable
    private SectorModel sectorId;


    public SensorModel() {
    }


    public SensorModel(String id, String type, String scale, SectorModel sector_id) {
        this.id = id;
        this.type = type;
        this.scale = scale;
        this.sectorId = sector_id;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getScale() {
        return scale;
    }


    public void setScale(String scale) {
        this.scale = scale;
    }


    public SectorModel getSector_id() {
        return sectorId;
    }


    public void setSector_id(SectorModel sector_id) {
        this.sectorId = sector_id;
    }


  


    


    
    



   

    
}
