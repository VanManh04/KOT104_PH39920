package com.example.kot104_ph39920.Lab_2

import com.example.kot104_ph39920.SinhVienModel

fun main () {
    val sv1 = SinhVienModel("Nguyen Van Long", "PH11341", 8f)

    val sv2 = SinhVienModel("Tran Tuan Anh", "PH12541", 9f)
    sv2.daTotNghiep = false
    sv2.tuoi = 22

    val sv3 = SinhVienModel("Tran Thu Phuong", "PH12533", 8.5f, false, 22)

    val listSV = mutableListOf<SinhVienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)

    do {
        println("=======================================")
        println("==============Sinh Viên================")
        println("\t \t 1. Thêm Sinh viên")
        println("\t \t 2. Xóa Sinh viên")
        println("\t \t 3. DS Sinh viên")
        println("=======================================")
        print("Chọn 1, 2 hoặc 3: ")

        val chon:String? = readLine()

        when(chon){
            "1" -> ThemSinhVien(listSV)
            "2" -> XoaSinhVien(listSV)
            "3" -> DanhSachSV(listSV)
            else ->{
                println("Lựa chọn không hợp lệ mời chọn lại !")
            }
        }

//        print("\n")
//        print("Bạn muốn kết thúc không(y/n)?: ")
//        val yn = readLine()
//        if (yn=="y")
//            break;

    }while (true)

//    listSV.removeAt(listSV.size - 1)
//    for (sinhvien in listSV) {
//        println(sinhvien.getThongTin())
//    }
//
//    for (i in listSV.indices) {
//        println("SV thu $i: \n ${listSV.get(i).getThongTin()}")
//    }
}

fun ThemSinhVien(listSinhVien: MutableList<SinhVienModel>){
    println("Nhập thông tin Sinh Viên.")
    print("Tên sinh viên: ")
    val ten: String? = readLine()
    print("Mssv: ")
    val mssv: String? = readLine()
    print("Điểm TB: ")
    val diemTB: Float? = readLine()?.toFloatOrNull()
    print("Đã tốt nghiệp (true/false): ")
    val daTotNghiep: Boolean? = readLine()?.toBoolean()
    print("Tuổi: ")
    val tuoi: Int? = readLine()?.toIntOrNull()

    if (ten != null && mssv != null && diemTB != null && daTotNghiep != null && tuoi != null) {
        listSinhVien.add(SinhVienModel(ten, mssv, diemTB, daTotNghiep, tuoi))
    } else {
        println("Thông tin nhập vào không hợp lệ.")
    }
}

fun XoaSinhVien(listSinhVien: MutableList<SinhVienModel>){
    for (i in listSinhVien.indices){
        println("SV thu $i: ${listSinhVien.get(i).getThongTin()}")
    }
    print("Chọn thứ thự SV muốn xóa: ")
    val thuTu:Int? = readLine()?.toIntOrNull()
    if(thuTu==null)
        print("Không hợp lệ !")
    else
        listSinhVien.removeAt(thuTu!!);
}

fun DanhSachSV(listSinhVien: MutableList<SinhVienModel>){
    for (i in listSinhVien.indices){
        println("SV thu $i: ${listSinhVien.get(i).getThongTin()}")
    }
}