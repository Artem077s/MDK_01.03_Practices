import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>)
{
    //zd1
    val myAge:Int=18
    val isTeenager:Boolean = myAge >= 13 && myAge <= 19
    println(isTeenager)
    //zd1
    //zd2
    val theirAge:Int=30
    val bothTeenagers:Boolean = theirAge >= 13 && theirAge <= 19 && isTeenager
    println(bothTeenagers)
    //zd2
    //zd3
    val reader:String="SHIROKOV"
    val author:String="Richard Lucas"
    val authorIsReader:Boolean=reader==author
    println(authorIsReader)
    //zd3
    //zd4
    val readerBeforeAuthor = reader<author
    println(readerBeforeAuthor)
    //zd4
    //zd5
    val myAge2:Int=18
    if (myAge2>=13&&myAge2<=19)
        println("Подросток");
    else println("Не подросток");
    //zd5
    //zd6
    val answer = if (myAge2>=13&&myAge2<=19) "Подросток" else "Не подросток"
    println(answer)
    //zd6
    //zd7
    var counter:Int=0
    while (counter<10)
    {
        println(counter)
        counter+=1
    }
    //zd7
    //zd8
    counter=0
    var roll:Int=0
    do
    {
        roll= Random().nextInt(6)
        counter+=1
        println ("после $counter бросков, roll равен $roll");

    } while (roll!=0)
    //zd8
    //zd9
    val range = 1..10
    for (i in range)
        println (i*i)
    //zd9
    //zd10
    for (i in range)
        println(sqrt(i.toDouble()))
    //zd10
    //zd11
    var sum:Int = 0
    for (row in 1 until 8 step 2)
    {
        for (column in 0 until 8)
        {
            sum += row * column
        }
    }
    //zd11
    println("результат: $sum");
}