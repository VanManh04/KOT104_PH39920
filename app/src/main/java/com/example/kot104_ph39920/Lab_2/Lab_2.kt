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