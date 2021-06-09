fun main(){
    println(describeString(""))
}
fun describeString(mayBeString: String?):String{//mayBeString is nullable
    if (mayBeString != null && mayBeString.isBlank()){
        return "String of length ${mayBeString.length}"
    }else{
        return "Empty or null"
    }
}