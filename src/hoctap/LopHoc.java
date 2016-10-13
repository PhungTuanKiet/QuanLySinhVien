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
public class LopHoc {

    private String maLop;
    private String tenLop;
    private String giaoVienCN;
    private String maMonHoc;

    public LopHoc() {
    }

    public LopHoc(String maLop, String tenLop, String giaoVienCN, String maMonHoc) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.giaoVienCN = giaoVienCN;
        this.maMonHoc = maMonHoc;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getGiaoVienCN() {
        return giaoVienCN;
    }

    public void setGiaoVienCN(String giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }
}
