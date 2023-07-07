package com.example.quanlyphattudemo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dondangkys")
public class DonDangKys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "trangthaidon")
    private int trangThaiDon;
    @Column(name = "ngayguidon")
    private LocalDate ngayGuiDon;
    @Column(name = "ngayxuly")
    private LocalDate ngayXuLy;
    @Column(name = "nguoixulyid")
    private int nguoiXuLyId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phattuid")
    @JsonIgnoreProperties(value = "donDangKysList")
    @JsonBackReference
    private PhatTus phatTus;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "daotrangid")
    @JsonIgnoreProperties(value = "donDangKysList")
    @JsonBackReference
    private DaoTrangs daoTrangs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrangThaiDon() {
        return trangThaiDon;
    }

    public void setTrangThaiDon(int trangThaiDon) {
        this.trangThaiDon = trangThaiDon;
    }

    public LocalDate getNgayGuiDon() {
        return ngayGuiDon;
    }

    public void setNgayGuiDon(LocalDate ngayGuiDon) {
        this.ngayGuiDon = ngayGuiDon;
    }



    public PhatTus getPhatTus() {
        return phatTus;
    }

    public void setPhatTus(PhatTus phatTus) {
        this.phatTus = phatTus;
    }

    public LocalDate getNgayXuLy() {
        return ngayXuLy;
    }

    public void setNgayXuLy(LocalDate ngayXuLy) {
        this.ngayXuLy = ngayXuLy;
    }

    public int getNguoiXuLyId() {
        return nguoiXuLyId;
    }

    public void setNguoiXuLyId(int nguoiXuLyId) {
        this.nguoiXuLyId = nguoiXuLyId;
    }

    public DaoTrangs getDaoTrangs() {
        return daoTrangs;
    }

    public void setDaoTrangs(DaoTrangs daoTrangs) {
        this.daoTrangs = daoTrangs;
    }
}
