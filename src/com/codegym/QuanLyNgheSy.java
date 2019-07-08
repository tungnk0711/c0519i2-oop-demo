package com.codegym;

public class QuanLyNgheSy {
    private NgheSy[] danhSachNgheSy = new NgheSy[10];
    private int count = 0;

    public void themNgheSy(NgheSy ngheSy) {
        danhSachNgheSy[count] = ngheSy;
        count++;
    }

    public NgheSy[] traVe() {
        return this.danhSachNgheSy;
    }
}
