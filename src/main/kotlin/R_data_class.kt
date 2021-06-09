data class User(val name:String="unknown",val id:Int?=null){
    override fun equals(other: Any?)=
        other is User && other.id==this.id//if same is,override by equaling users
}
fun main(){
    val user=User("Ricky",1)
    println(user)
    val secondUser=User("Sensei",2)
    println(secondUser)
    val thirdUser=User("Sky",3)
    println(thirdUser)

    println("user == secondUser: ${user==secondUser}")//equality is due to id
    println("user == thirdUser: ${user==thirdUser}")

    //hashCode() function
    println(user.hashCode())//matching attributes have same hashCode()
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    //copy() function
    println(user.copy())//generates new user
    println(user===user.copy())
    println(user.copy("Joan"))//new instance as user
    println(user.copy(id = 3))//copy() changes the value despite of property order

    println("name = ${user.component1()}")//invokes value in order of declaration
    println("id = ${user.component2()}")
}