package com.example.quanlyphattudemo.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kieuthanhviens")
public class KieuThanhViens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    @Column(name = "tenkieu")
    private String tenKieu;
    @OneToMany(mappedBy = "kieuThanhViens",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "kieuThanhViens")
    @JsonManagedReference
    private List<PhatTus> phatTusList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTenKieu() {
        return tenKieu;
    }

    public void setTenKieu(String tenKieu) {
        this.tenKieu = tenKieu;
    }

    public List<PhatTus> getPhatTusList() {
        return phatTusList;
    }

    public void setPhatTusList(List<PhatTus> phatTusList) {
        this.phatTusList = phatTusList;
    }
}
