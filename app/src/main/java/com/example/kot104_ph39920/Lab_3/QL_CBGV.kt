package com.example.kot104_ph39920.Lab_3

class QL_CBGV {
}

fun main(){
    val giaoVien1 = CBGV("Nguyen Van A", 35, "Hanoi", "GV001", 500f, 10f, 0.0f)
    val giaoVien2 = CBGV("Tran Thi B", 40, "HCMC", "GV002", 550f, 12f, 5f)

    val listGV = mutableListOf<CBGV>();
    listGV.add(giaoVien1)
    listGV.add(giaoVien2)

    var a=true
    do {
        println("=======================================")
        println("==============Sinh Viên================")
        println("\t \t 1. Thêm CBGV")
        println("\t \t 2. Xóa CBGV")
        println("\t \t 3. DS CBGV")
        println("\t \t 0. Dừng")
        println("=======================================")
        print("Chọn 1, 2 hoặc 3: ")
        val  chon:String? = readln()
        when(chon){
            "1" -> them(listGV)
            "2" -> Xoa(listGV)
            "3" -> DS(listGV)
            "0" -> a=false
            else -> println("Không hợp lệ")
        }
    }while (a)
}

fun them(list:MutableList<CBGV>){
    print("Nhập tên GV: ")
    val hoTen = readLine() ?: ""

    print("Nhập tuổi: ")
    val tuoi = readLine()?.toIntOrNull() ?: 0

    print("Nhập quê quán: ")
    val queQuan = readLine() ?: ""

    print("Nhập MSGV: ")
    val maSo = readLine() ?: ""

    print("Nhập lương cứng: ")
    val luongCung = readLine()?.toFloatOrNull() ?: 0.0f

    print("Nhập lương thưởng: ")
    val luongThuong = readLine()?.toFloatOrNull() ?: 0.0f

    print("Nhập tiền phạt: ")
    val tienPhat = readLine()?.toFloatOrNull() ?: 0.0f

    val cbgv = CBGV(hoTen,tuoi,queQuan,maSo,luongCung,luongThuong, tienPhat)

    list.add(cbgv)

    println("Đã thêm cán bộ giáo viên mới vào danh sách.")

}

fun Xoa(list: MutableList<CBGV>){
    DS(list)
    print("Nhập MSGV: ")
    val msgv:String? = readLine()

    val iterator = list.iterator()
    while (iterator.hasNext()) {
        val cbgv = iterator.next()
        if (cbgv.msgv == msgv) {
            iterator.remove()
            println("Đã xóa cán bộ giáo viên có mã số $msgv")
            return
        }
    }
    println("Không tìm thấy cán bộ giáo viên có mã số $msgv")
}

fun DS(list: MutableList<CBGV>){
    for (i in list.indices)
        println("GV $i: ${list.get(i).getThongTin()}")
}