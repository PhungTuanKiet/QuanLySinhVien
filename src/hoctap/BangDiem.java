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
public class BangDiem {
    private String maSv;
    private String maMon;
    private double diemQuaTrinh;
    private double diemCuoiKi;
    private double diemTongKet;
    private double trongSo;

    public BangDiem(String maSv, String maMon, double diemQuaTrinh, double diemCuoiKi, double diemTongKet, double trongSo) {
        this.maSv = maSv;
        this.maMon = maMon;
        this.diemQuaTrinh = diemQuaTrinh;
        this.diemCuoiKi = diemCuoiKi;
        this.diemTongKet = diemTongKet;
        this.trongSo = trongSo;
    }

    public BangDiem() {
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public double getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(double diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public double getDiemCuoiKi() {
        return diemCuoiKi;
    }

    public void setDiemCuoiKi(double diemCuoiKi) {
        this.diemCuoiKi = diemCuoiKi;
    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    public double getTrongSo() {
        return trongSo;
    }

    public void setTrongSo(double trongSo) {
        this.trongSo = trongSo;
    }
    
    void tinhDiem() {
        this.diemTongKet = this.diemQuaTrinh * (1 - this.trongSo) + this.diemCuoiKi * this.trongSo;
    }
}
