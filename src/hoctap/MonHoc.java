/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoctap;

/**
 *
 * @author HAVIETTRANG
 */
public class MonHoc {

    private String maMon;
    private String tenMon;
    private double trongSo;
    private int soTinChi;
    private String maKhoaVien;
    private String[] maHpdk;

    public MonHoc() {
    }

    public MonHoc(String maMon, String tenMon, double trongSo, int soTinChi, String maKhoaVien, String[] maHpdk) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.trongSo = trongSo;
        this.soTinChi = soTinChi;
        this.maKhoaVien = maKhoaVien;
        this.maHpdk = maHpdk;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public double getTrongSo() {
        return trongSo;
    }

    public void setTrongSo(double trongSo) {
        this.trongSo = trongSo;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getMaKhoaVien() {
        return maKhoaVien;
    }

    public void setMaKhoaVien(String maKhoaVien) {
        this.maKhoaVien = maKhoaVien;
    }

    public String[] getMaHpdk() {
        return maHpdk;
    }

    public void setMaHpdk(String[] maHpdk) {
        this.maHpdk = maHpdk;
    }

}
