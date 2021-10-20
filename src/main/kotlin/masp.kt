fun main() {
    var hooos = mutableMapOf(1 to "zaml" ,2 to "hussen" ,3 to "manal", 4 to "rahf")
    println(hooos)


    hooos.remove(key = 3)
    println(hooos)

    hooos [1]="moammed"
    println(hooos)


    //_______________________________________part 2 ___________________________________
    var hessah = mutableMapOf(1 to "ssss", 2 to "dddd", 3 to "aaaa" )
    println(hessah)


    hessah.putAll(listOf("ssss","dddd","aaaa").mapIndexed {index,Item->index to Item})

    hessah.putAll(mapOf(1 to  "ssss",2 to "dddd",3 to "aaaa"))


}