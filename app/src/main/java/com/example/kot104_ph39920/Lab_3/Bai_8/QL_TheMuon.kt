package com.example.kot104_ph39920.Lab_3.Bai_8

class QL_TheMuon {
}

fun main(){
    val tm1 = TheMuon("TM1","2/5/2024","3/5/2024","SH001","Văn Hoàng",20,"P396");
    val tm2 = TheMuon("TM2","1/5/2024","3/5/2024","SH002","Văn Hiệp",18,"12D9");
    val tm3 = TheMuon("TM3","1/4/2024","3/4/2024","SH003","Đức Anh",18,"12D11");

    val listTM = mutableListOf<TheMuon>()
    listTM.add(tm1)
    listTM.add(tm2)
    listTM.add(tm3)
    var a = true
    do {
        println("=======================================")
        println("==============Sinh Viên================")
        println("\t \t 1. Thêm Phiếu Mượn")
        println("\t \t 2. Xóa Phiếu Mượn")
        println("\t \t 3. DS Phiếu Mượn")
        println("\t \t 0. Dừng")
        println("=======================================")
        print("Chọn : ")
        val chon:String? = readLine()

        when(chon){
            "1"-> them(listTM)
            "2"-> xoa(listTM)
            "3"-> danhSach(listTM)
            "0"-> a = false
            else -> println("Không hợp lệ!")
        }
    }while (a)
}

fun them(list: MutableList<TheMuon>){
    print("Nhập mã PM: ")
    val maTM:String? = readLine()

    print("Nhập ngày mượn: ")
    val ngaymuon:String? = readLine()

    print("Nhập hạn trả: ")
    val hanTra:String? = readLine()

    print("Nhập số hiệu sách: ")
    val soHieuSach:String? = readLine()

    println("Người mượn")
    print("Nhập họ tên: ")
    val hoTen:String? = readLine()

    print("Nhập tuổi: ")
    val tuoi:Int? = readLine()?.toIntOrNull()?:0

    print("Nhập lớp: ")
    val lop:String? = readLine()

    if(maTM.isNullOrEmpty() || ngaymuon.isNullOrEmpty() || hanTra.isNullOrEmpty() || soHieuSach.isNullOrEmpty() || hoTen.isNullOrEmpty()|| lop.isNullOrEmpty())
        println("Không hợp lệ")
    else{
        val TM = TheMuon(maTM!!,ngaymuon!!,hanTra!!, soHieuSach!!,hoTen!!,tuoi!!,lop!!)
        list.add(TM)
        println("Đã thêm thành công !")
    }

}

fun xoa(list: MutableList<TheMuon>){
    danhSach(list)

    print("Nhập mã phiếu mượn: ")
    val mspm:String?= readLine()

    val iterator = list.iterator()
    while (iterator.hasNext()){
        val pm = iterator.next()

        if(pm.maPM==mspm){
            iterator.remove()
            println("Xóa thành công phiếu mượn mã $mspm")
            return;
        }
    }
    println("không tìm thấy phiếu mượn mã $mspm")
}
fun danhSach(list: MutableList<TheMuon>){
    for (i in list.indices)
        println("PM ${i+1}: ${list.get(i).getThongTinSV()}")
}