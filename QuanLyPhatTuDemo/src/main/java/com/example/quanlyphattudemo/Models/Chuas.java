package com.example.quanlyphattudemo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "chuas")
public class Chuas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tenchua")
    private String tenChua;
    @Column(name = "ngaythanhlap")
    private LocalDate ngayThanhLap;
    @Column(name = "diachi")
    private String diaChi;
    @Column(name = "trutri")
    private String truTri;
    @Column(name = "capnhap")
    private LocalDate capNhap;
    @OneToMany(mappedBy = "chuas",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "chuas")
    @JsonBackReference
    private List<PhatTus> phatTusList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenChua() {
        return tenChua;
    }

    public void setTenChua(String tenChua) {
        this.tenChua = tenChua;
    }

    public LocalDate getNgayThanhLap() {
        return ngayThanhLap;
    }

    public void setNgayThanhLap(LocalDate ngayThanhLap) {
        this.ngayThanhLap = ngayThanhLap;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTruTri() {
        return truTri;
    }

    public void setTruTri(String truTri) {
        this.truTri = truTri;
    }

    public LocalDate getCapNhap() {
        return capNhap;
    }

    public void setCapNhap(LocalDate capNhap) {
        this.capNhap = capNhap;
    }

    public List<PhatTus> getPhatTusList() {
        return phatTusList;
    }

    public void setPhatTusList(List<PhatTus> phatTusList) {
        this.phatTusList = phatTusList;
    }
}
