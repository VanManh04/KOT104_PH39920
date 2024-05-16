package com.example.kot104_ph39920.Lab_2

fun main(){
    do{
        println("Nhập mssv: ")
        val mssv : String? = readLine()

        //var tenSV : String = null
        var tenSV = getTenSV(mssv!!)

        println("MSSV: $mssv : $tenSV")

        print("Tiếp Không?(c/k): ")
        val s = readLine()
        if(s == "k")
            break
    }while (true)

    println("Kết thúc !")
}

val listSV:Map<String,String> = mutableMapOf("PH11341" to "Nguyen Van Long", "PH12536" to "Le The Anh",
    "PH14233" to "Tran Phuong Thao", "PH39920" to "Giap Van Manh")
fun getTenSV(mssv:String):String?{
    val tenSV = listSV.get(mssv)

    if(tenSV == null)
        return "Mã sinh viên không hợp lệ !"

    return tenSV
}


//Bài 1
//fun main() {
//    var a = 0.0
//    var b = 0.0
//    println("Nhập a:")
//    var s = readLine()
//    if (s != null) a = s.toDouble()
//    println("Nhập b:")
//    s = readLine()
//    if (s != null) b = s.toDouble()
//    if (a == 0.0 && b == 0.0) {
//        println("Phương trình vô số nghiệm")
//    } else if (a == 0.0 && b != 0.0) {
//        println("Phương trình vô nghiệm")
//    } else {
//        val x = -b / a
//        println("No x=" + x)
//    }
//}

//bài 2
//fun main() {
//    var month = 0
//    println("Nhập tháng:")
//    val s: String? = readLine()
//    if (s != null) month = s.toInt()
//    when (month) {
//        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
//        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
//        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
//        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
//        else -> println("Tháng " + month + " không hợp lệ")
//    }
//}

//bài 3
//fun main() {
//    var year = 0
//    var s: String?
//    println("Chương trình kiểm tra năm nhuần:")
//    do {
//        println("Nhập 1 năm:")
//        s = readLine()
//        while (s == null || s.toInt() < 0) {
//            println("Nhập sai năm, nhập lại:")
//            s = readLine()
//        }
//        year = s.toInt()
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            println("Năm $year là năm nhuần")
//        } else {
//            println("Năm $year không phải là năm nhuần")
//        }
//        print("Tiếp không?(c/k):")
//        s = readLine()
//        if (s == "k")
//            break;
//    } while (true)
//    println("Kết thúc chương trình")
//}