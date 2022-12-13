object DoAuth{
    fun takeParams(userName:String,password:String){
        println("Input Auth parameters = $userName:$password")
    }
}
fun main(){
    DoAuth.takeParams("user","pass")
}