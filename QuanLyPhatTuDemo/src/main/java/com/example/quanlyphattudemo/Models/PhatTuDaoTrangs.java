package com.example.quanlyphattudemo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "phattudaotrangs")
public class PhatTuDaoTrangs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "dathamgia")
    private int daThamGia;
    @Column(name = "lydokhongthamgia")
    private String lyDoKhongThamGia;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "daotrangid")
    @JsonIgnoreProperties(value = "phatTuDaoTrangsList")
    @JsonBackReference
    private DaoTrangs daoTrangs;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "phattuid")
    @JsonIgnoreProperties(value = "phatTuDaoTrangsList")
    @JsonBackReference
    private PhatTus phatTus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaThamGia() {
        return daThamGia;
    }

    public void setDaThamGia(int daThamGia) {
        this.daThamGia = daThamGia;
    }

    public String getLyDoKhongThamGia() {
        return lyDoKhongThamGia;
    }

    public void setLyDoKhongThamGia(String lyDoKhongThamGia) {
        this.lyDoKhongThamGia = lyDoKhongThamGia;
    }

    public DaoTrangs getDaoTrangs() {
        return daoTrangs;
    }

    public void setDaoTrangs(DaoTrangs daoTrangs) {
        this.daoTrangs = daoTrangs;
    }

    public PhatTus getPhatTus() {
        return phatTus;
    }

    public void setPhatTus(PhatTus phatTus) {
        this.phatTus = phatTus;
    }
}
