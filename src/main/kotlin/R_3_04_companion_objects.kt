class  BigBen{
    companion object Bonger{
//        you call object members using its class name as a qualifier.
//        Consider using a package-level function instead.
        fun getBongs(nTimes:Int){
            for (i in 1..nTimes){
                print("BONG\t")
            }
        }
    }
}
fun main(){
    BigBen.getBongs(12)
}