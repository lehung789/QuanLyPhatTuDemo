package com.example.quanlyphattudemo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "daotrangs")
public class DaoTrangs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "noitochuc")
    private String noiToChuc;
    @Column(name = "sothanhvienthamgia")
    private int soThanhVienThamGia;
    @Column(name = "thoigiantochuc")
    private LocalDate thoiGianToChuc;
    @Column(name = "noidung")
    private String noiDung;
    @Column(name = "daketthuc")
    private int daKetThuc;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nguoichutriid")
    @JsonIgnoreProperties(value = "daoTrangsList")
    @JsonBackReference
    private PhatTus phatTus;
    @OneToMany(mappedBy = "daoTrangs",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "daoTrangs")
    @JsonManagedReference
    private List<PhatTuDaoTrangs> phatTuDaoTrangsList;
    @OneToMany(mappedBy = "daoTrangs",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "daoTrangs")
    @JsonManagedReference
    private List<DonDangKys> donDangKysList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoiToChuc() {
        return noiToChuc;
    }

    public void setNoiToChuc(String noiToChuc) {
        this.noiToChuc = noiToChuc;
    }

    public int getSoThanhVienThamGia() {
        return soThanhVienThamGia;
    }

    public void setSoThanhVienThamGia(int soThanhVienThamGia) {
        this.soThanhVienThamGia = soThanhVienThamGia;
    }

    public LocalDate getThoiGianToChuc() {
        return thoiGianToChuc;
    }

    public void setThoiGianToChuc(LocalDate thoiGianToChuc) {
        this.thoiGianToChuc = thoiGianToChuc;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getDaKetThuc() {
        return daKetThuc;
    }

    public void setDaKetThuc(int daKetThuc) {
        this.daKetThuc = daKetThuc;
    }

    public PhatTus getPhatTus() {
        return phatTus;
    }

    public void setPhatTus(PhatTus phatTus) {
        this.phatTus = phatTus;
    }

    public List<PhatTuDaoTrangs> getPhatTuDaoTrangsList() {
        return phatTuDaoTrangsList;
    }

    public void setPhatTuDaoTrangsList(List<PhatTuDaoTrangs> phatTuDaoTrangsList) {
        this.phatTuDaoTrangsList = phatTuDaoTrangsList;
    }

    public List<DonDangKys> getDonDangKysList() {
        return donDangKysList;
    }

    public void setDonDangKysList(List<DonDangKys> donDangKysList) {
        this.donDangKysList = donDangKysList;
    }
}
