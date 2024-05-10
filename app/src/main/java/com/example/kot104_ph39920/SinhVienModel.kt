package com.example.kot104_ph39920

class SinhVienModel(var tenSV: String, var mssv: String, var diemTB: Float) {

    var daTotNghiep: Boolean? = null
    var tuoi: Int? = null

    constructor(tenSV: String, mssv: String, diemTB: Float, datotnghiep: Boolean?, tuoi: Int?) : this(tenSV, mssv, diemTB) {
        this.daTotNghiep = daTotNghiep
        this.tuoi = tuoi
    }

    fun getThongTin () : String {

        var sDatotNghiep : String

        if(daTotNghiep==null)
            sDatotNghiep = "Chưa có dữ liệu !"
        else{
            if (daTotNghiep!!)
               sDatotNghiep = "Đã tốt nghiệp."
            else
                sDatotNghiep = "Chưa tốt nghiệp."
        }

        var sTuoi : String
        if(tuoi == null)
            sTuoi = "Chưa có dữ liệu."
        else
            sTuoi = tuoi.toString()

        return "Tên: $tenSV - MSSV: $mssv - Điểm TB: $diemTB - Tốt nghiệp: $sDatotNghiep - Tuổi: $sTuoi"
    }
}