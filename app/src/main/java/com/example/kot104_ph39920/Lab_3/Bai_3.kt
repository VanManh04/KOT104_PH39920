package com.example.kot104_ph39920.Lab_3

fun main() {
    var soA: Int? = 5
    var soB: Int? = 10

    val tong = tinhTong(soA!!, soB!!)

    println("$soA - $soB = $tong")
    println("$soA - $soB = ${tinhHieu(soA!!, soB!!)}")
    println("Bình phương $soA = ${binhPhuong(soA)}")
    println("$soA / $soB = ${tinhThuong(soA.toFloat(),soB.toFloat()) ()}")
    println(inHoa("Giáp Văn Mạnh"))


//    Scope Funtion
    var tenSV = "giapVanmanh"
    var length = tenSV.let{
        val l = it.length
        l
    }
    println("Chuỗi tenSV là $length")

    var kq = soA.run{
        this*2
    }
    println("$soA * 2 = $kq")

}

var tinhTong: (Int, Int) -> Int = { soA: Int, soB: Int -> (soA + soB) }

var tinhHieu = { soA: Int, soB: Int -> (soA - soB) }

var binhPhuong : (Int) -> Int = {it * it}

var tinhThuong = {soA:Float, soB:Float ->{
        if(soB==0f)
            "Số bị chia phải khác 0."
        else
            soA/soB
    }
}

var inHoa:(String) ->String = String::uppercase