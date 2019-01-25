package com.example.lap.demo;

public class DataShop {
    private int mHinhAnh;
    private String mTen;

    public DataShop(int mHinhAnh, String ten) {
        this.mHinhAnh = mHinhAnh;
        mTen = ten;
    }

    public int getmHinhAnh() {
        return mHinhAnh;
    }

    public void setmHinhAnh(int mHinhAnh) {
        this.mHinhAnh = mHinhAnh;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }
}
