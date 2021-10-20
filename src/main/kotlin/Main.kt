fun main(){
    //--------------------------------------
    val  result= aaaa(10,30)
    println(result)
    val result2= aaaa2(7,4)
//----------------------oprator----------------------------------
    var peverage = readLine()!!.capitalize()
    //   peverage = null
    println (peverage)


//-----------------Exception--------------------------------


    try{
        var num = 5/0
        println("num")
    }
    catch (ex:ArithmeticException){
        println(ex.message)
        if (ex.message=="/ by zero"){
            println("لاتقسم على الصفر ")
        }
        else{
            println(ex.message)
        }
    }
    finally {
        println("true")
    }
//------------------------------------------------


}

val aaaa = fun (x: Int,Y:Int):Int{
    return x+Y
}
//----------------------------------------
val aaaa2 = fun (t:Int, a:Int)= t-a

//--------------------------------------------------------