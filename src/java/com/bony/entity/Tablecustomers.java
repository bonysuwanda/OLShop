/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "TABLECUSTOMERS")
@NamedQueries({
    @NamedQuery(name = "Tablecustomers.findAll", query = "SELECT t FROM Tablecustomers t")
    , @NamedQuery(name = "Tablecustomers.findById", query = "SELECT t FROM Tablecustomers t WHERE t.id = :id")
    , @NamedQuery(name = "Tablecustomers.findByEmail", query = "SELECT t FROM Tablecustomers t WHERE t.email = :email")
    , @NamedQuery(name = "Tablecustomers.findByNamalengkap", query = "SELECT t FROM Tablecustomers t WHERE t.namalengkap = :namalengkap")
    , @NamedQuery(name = "Tablecustomers.findByPassword", query = "SELECT t FROM Tablecustomers t WHERE t.password = :password")
    , @NamedQuery(name = "Tablecustomers.findByPhone", query = "SELECT t FROM Tablecustomers t WHERE t.phone = :phone")
    , @NamedQuery(name = "Tablecustomers.findByUsername", query = "SELECT t FROM Tablecustomers t WHERE t.username = :username")})
public class Tablecustomers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "NAMALENGKAP")
    private String namalengkap;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "USERNAME")
    private String username;
    @Lob
    @Column(name = "ADDRESS")
    private String address;
    @OneToMany(mappedBy = "customerId")
    private List<Tableorder> tableorderList;

    public Tablecustomers() {
    }

    public Tablecustomers(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Tableorder> getTableorderList() {
        return tableorderList;
    }

    public void setTableorderList(List<Tableorder> tableorderList) {
        this.tableorderList = tableorderList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tablecustomers)) {
            return false;
        }
        Tablecustomers other = (Tablecustomers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bony.entity.Tablecustomers[ id=" + id + " ]";
    }
    
}
