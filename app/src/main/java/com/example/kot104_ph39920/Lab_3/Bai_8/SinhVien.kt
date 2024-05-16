package com.example.kot104_ph39920.Lab_3.Bai_8

open class SinhVien{
    var hoTen:String
    var tuoi:Int
    var lop:String

    constructor(hoTen: String, tuoi: Int, lop: String) {
        this.hoTen = hoTen
        this.tuoi = tuoi
        this.lop = lop
    }

    open fun getThongTinSV():String{
        return "Họ tên: $hoTen - Tuối: $tuoi - Lớp: $lop"
    }
}