object DoAuth{
//     it will be created once when the object is accessed. Otherwise, it won't even be created.
//     in Java this is Singleton pattern:
//     it ensures you that only one instance of that class is created even if 2 threads try to create it.
    fun takeParams(userName:String,password:String){
        println("Input Auth parameters = $userName:$password")
    }
}
fun main(){
    DoAuth.takeParams("user","pass")
}