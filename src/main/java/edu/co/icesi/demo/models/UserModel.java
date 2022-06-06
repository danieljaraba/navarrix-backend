package edu.co.icesi.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;


@Entity
@Table(name = "user")
public class UserModel {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "roleid")
    private RoleModel role;
    private String name;
    private String usertxt;
    private String password;

    @ManyToOne
    @JoinColumn(name = "sectorid")
    @Nullable
    private SectorModel sectorId;

    public UserModel(){

    }

    public UserModel(String id,RoleModel role, String name, String user, String password, SectorModel sectorId) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.usertxt = user;
        this.password = password;
        this.sectorId = sectorId;
    }



    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public RoleModel getRole() {
        return role;
    }
    public void setRole(RoleModel role) {
        this.role = role;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUser() {
        return usertxt;
    }
    public void setUser(String username) {
        this.usertxt = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public SectorModel getSectorId() {
        return sectorId;
    }
    public void setSectorId(SectorModel sectorId) {
        this.sectorId = sectorId;
    }


    public String toString(){
        return "UserModel{" +
                "id='" + id + '\'' +
                ", role=" + role.getId() +
                ", name='" + name + '\'' +
                ", user='" + usertxt + '\'' +
                ", password='" + password + '\'' +
                ", sectorId=" + sectorId +
                '}';
    }


    


    

 
    
}
