package com.example.kot104_ph39920.Lab_3

open class NguoiModel {
    lateinit var hoten:String
    var tuoi:Int
    var quequan:String

    constructor(hoten: String, tuoi: Int, quequan: String) {
        this.hoten = hoten
        this.tuoi = tuoi
        this.quequan = quequan
    }

    open fun getThongTin():String{
        return "- Họ tên: $hoten - Tuổi: $tuoi - Quê Quán: $quequan"
    }
}