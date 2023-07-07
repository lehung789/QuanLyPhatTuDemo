package com.example.quanlyphattudemo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "phattus")
public class PhatTus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ho;
    @Column(name = "tendem")
    private String tenDem;
    private String ten;
    @Column(name = "phapdanh")
    private String phapDanh;
    @Column(name = "anhchup")
    private String anhChup;
    @Column(name = "sodienthoai")
    private String soDienThoai;
    @NotNull
    private String email;
    @Column(name = "matkhau")
    private String matKhau;
    @Column(name = "ngaysinh")
    private LocalDate ngaySinh;
    @Column(name = "ngayxuatgia")
    private LocalDate ngayXuatGia;
    @Column(name = "dahoantuc")
    private int daHoanTuc;
    @Column(name = "ngayhoantuc")
    private LocalDate ngayHoanTuc;
    @Column(name = "gioitinh")
    private int gioiTinh;
    @Column(name = "ngaycapnhap")
    private LocalDate ngayCapNhap;
    private int online;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kieuthanhvienid")
    @JsonIgnoreProperties(value = "phatTusList")
    @JsonBackReference
    private KieuThanhViens kieuThanhViens;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chuaid")
    @JsonIgnoreProperties(value = "phatTusList")
    @JsonBackReference
    private Chuas chuas;
    @OneToMany(mappedBy = "phatTus",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "phatTus")
    @JsonManagedReference
    private List<DaoTrangs> daoTrangsList;
    @OneToMany(mappedBy = "phatTus",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "phatTus")
    @JsonManagedReference
    private List<PhatTuDaoTrangs> phatTuDaoTrangsList;
    @OneToMany(mappedBy = "phatTus",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "phatTus")
    @JsonManagedReference
    private List<DonDangKys> donDangKysList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhapDanh() {
        return phapDanh;
    }

    public void setPhapDanh(String phapDanh) {
        this.phapDanh = phapDanh;
    }

    public String getAnhChup() {
        return anhChup;
    }

    public void setAnhChup(String anhChup) {
        this.anhChup = anhChup;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public LocalDate getNgayXuatGia() {
        return ngayXuatGia;
    }

    public void setNgayXuatGia(LocalDate ngayXuatGia) {
        this.ngayXuatGia = ngayXuatGia;
    }

    public int getDaHoanTuc() {
        return daHoanTuc;
    }

    public void setDaHoanTuc(int daHoanTuc) {
        this.daHoanTuc = daHoanTuc;
    }

    public LocalDate getNgayHoanTuc() {
        return ngayHoanTuc;
    }

    public void setNgayHoanTuc(LocalDate ngayHoanTuc) {
        this.ngayHoanTuc = ngayHoanTuc;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgayCapNhap() {
        return ngayCapNhap;
    }

    public void setNgayCapNhap(LocalDate ngayCapNhap) {
        this.ngayCapNhap = ngayCapNhap;
    }

    public KieuThanhViens getKieuThanhViens() {
        return kieuThanhViens;
    }

    public void setKieuThanhViens(KieuThanhViens kieuThanhViens) {
        this.kieuThanhViens = kieuThanhViens;
    }

    public Chuas getChuas() {
        return chuas;
    }

    public void setChuas(Chuas chuas) {
        this.chuas = chuas;
    }

    public List<DaoTrangs> getDaoTrangsList() {
        return daoTrangsList;
    }

    public void setDaoTrangsList(List<DaoTrangs> daoTrangsList) {
        this.daoTrangsList = daoTrangsList;
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

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }
}
