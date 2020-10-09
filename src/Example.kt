
fun main(){


//    val a = A()
//    a.myFun()
    B.myFun()
    B.x
    A.myFun()
    A.x


}

class A{
   companion object{
       val x: Int = 78
       fun myFun(){
           println("My Fun")
       }
   }
}

object B{
    val x: Int = 0
    fun myFun(){
        println("My Fun")
    }
}











