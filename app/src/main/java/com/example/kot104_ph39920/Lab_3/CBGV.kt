package com.example.kot104_ph39920.Lab_3

class CBGV : NguoiModel {

    var msgv:String?
    var luongCung:Float?
    var luongThuong:Float?
    var luongPhat:Float?
    var luongThucLinh:Float?
        get() = (luongCung?:0f) + (luongThuong?:0f) - (luongPhat?:0f)
    constructor(
        hoten: String,
        tuoi: Int,
        quequan: String,
        msgv: String?,
        luongCung: Float?,
        luongThuong: Float?,
        luongPhat: Float?,
    ) : super(hoten, tuoi, quequan) {
        this.msgv = msgv
        this.luongCung = luongCung
        this.luongThuong = luongThuong
        this.luongPhat = luongPhat
        this.luongThucLinh = (luongCung?:0f) + (luongThuong?:0f) - (luongPhat?:0f)
    }

    override fun getThongTin(): String {
        return "MSGV: $msgv - " + super.getThongTin()+" - Lương: $luongThucLinh"
    }
    //    constructor(hoten: String, tuoi: Int, quequan: String) : super(hoten, tuoi, quequan)
}