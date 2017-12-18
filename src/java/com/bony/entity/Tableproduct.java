/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "TABLEPRODUCT")
@NamedQueries({
    @NamedQuery(name = "Tableproduct.findAll", query = "SELECT t FROM Tableproduct t")
    , @NamedQuery(name = "Tableproduct.findById", query = "SELECT t FROM Tableproduct t WHERE t.id = :id")
    , @NamedQuery(name = "Tableproduct.findByHarga", query = "SELECT t FROM Tableproduct t WHERE t.harga = :harga")
    , @NamedQuery(name = "Tableproduct.findByProductNama", query = "SELECT t FROM Tableproduct t WHERE t.productNama = :productNama")
    , @NamedQuery(name = "Tableproduct.findByStok", query = "SELECT t FROM Tableproduct t WHERE t.stok = :stok")})
public class Tableproduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HARGA")
    private Double harga;
    @Column(name = "PRODUCT_NAMA")
    private String productNama;
    @Column(name = "STOK")
    private Integer stok;
    @JoinColumn(name = "CART_ID", referencedColumnName = "ID")
    @ManyToOne
    private Tableorder cartId;

    public Tableproduct() {
    }

    public Tableproduct(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getProductNama() {
        return productNama;
    }

    public void setProductNama(String productNama) {
        this.productNama = productNama;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public Tableorder getCartId() {
        return cartId;
    }

    public void setCartId(Tableorder cartId) {
        this.cartId = cartId;
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
        if (!(object instanceof Tableproduct)) {
            return false;
        }
        Tableproduct other = (Tableproduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bony.entity.Tableproduct[ id=" + id + " ]";
    }
    
}
