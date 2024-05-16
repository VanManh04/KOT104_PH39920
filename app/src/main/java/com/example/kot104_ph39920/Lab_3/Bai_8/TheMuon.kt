package com.example.kot104_ph39920.Lab_3.Bai_8

class TheMuon : SinhVien{
    var maPM: String?
    var ngayMuon:String?
    var hanTra: String?
    var soHieuSach:String?

    constructor(
        maPM: String?,
        ngayMuon: String?,
        hanTra: String?,
        soHieuSach: String?,
        hoTen: String,
        tuoi: Int,
        lop: String
    ) : super(hoTen, tuoi, lop) {
        this.maPM = maPM
        this.ngayMuon = ngayMuon
        this.hanTra = hanTra
        this.soHieuSach = soHieuSach
    }

    override fun getThongTinSV(): String {
        return "Mã phiếu mượn: $maPM" +
                " - Ngày mượn: $ngayMuon" +
                " - Hạn trả: $hanTra" +
                " - Số hiệu sách: $soHieuSach" +
                " - Thông tin sinh viên: " +super.getThongTinSV()
    }
}