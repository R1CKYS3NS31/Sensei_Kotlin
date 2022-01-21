import java.io.File

fun main(){
    println("hello world")
    val files=File("test.txt").listFiles()
    println(files?.size)//if not null shorthand
    println(files?.size?:"empty")//if not null else shorthand
    var a=1
    var b=3
    println("before swap $a and $b")
    a=b.also { b=a }
    println("after swap $a and $b")
}
