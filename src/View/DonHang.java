/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.Serializable;

/**
 *
 * @author ThuyVT
 */
public class DonHang implements Serializable {

    private String mon;
    private int soLuong;
    private String topping;
    private String ghiChu;
    private boolean thanhToan;

    public DonHang(String mon, int soLuong, String topping, String ghiChu, boolean thanhToan) {
        this.mon = mon;
        this.soLuong = soLuong;
        this.topping = topping;
        this.ghiChu = ghiChu;
        this.thanhToan = thanhToan;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public boolean isThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(boolean thanhToan) {
        this.thanhToan = thanhToan;
    }
    
    
}
