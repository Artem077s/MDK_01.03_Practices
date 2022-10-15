import java.util.*
fun main(args: Array<String>) {
    //zd1
    val age1 = 42
    val age2 = 21
    //zd1
    //zd2
    val avg1 = (age1 + age2) / 2
    //zd2
    //zd3
    val avg2 = (age1.toDouble() + age2.toDouble()) / 2
    //zd3
    //zd4
    val firstName = "Artem"
    val lastName = "Shirokov"
    //zd4
    //zd5
    val fullName = "$firstName $lastName"
    //zd5
    //zd6
    val myDetails = "Привет, меня зовут $fullName"
    //zd6
    //zd7
    val date = Triple(6, 23, 2001)
    //zd7
    //zd8
    var month = date.first
    var day =  date.second
    var year = date.third
    //zd8
    //zd9
    println("$month \n$year")
    //zd9
    //zd10
    month = 7
    val updatedDate = Pair(month, year)
    println("$updatedDate")
    //zd10

}