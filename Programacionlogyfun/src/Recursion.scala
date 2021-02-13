import scala.io.StdIn
import scala.io.StdIn.{readInt, readLine}
object Recursion {


  def uno(x:Int, n:Int):Int={
    if (n<x)
      return 0;
    else {
      return n + uno(x,n-1)
    }
  }

  def dos(x:Int):Unit={
    println(x)
    if(x>1){
      return 1
    }else{
      if(x%2 ==0){
        print(x)
      }
      return dos(x-1)
    }
  }


  def tres(x:Int):Int={
    if(x==0) {
      return 1
    } else {
      return x * tres(x-1)
    }
  }

  def cuatro(x:Int,n:Int):Int={
    if(x<n){
      return 0;
    }else{
      return 1+cuatro(x-n,n)
    }

  }


  def cinco(x:Int, n:Int):Int={
    if(x<n){
      return 0
    }else{
      return cinco((x+1)%n,n)
    }
  }

  def seis(x:Int):Unit={
    if (x<2){
      print(x)
      return
    }else{
      seis(x/2)
      print(x%2)
      return
    }
  }

  def siete(x:String,n:Int):Unit={
    var c=0
    if(n<x.length){
      val xx= x.charAt(n)
      //println(c)
      if(xx=="a"||xx=="e"||xx=="i"||xx=="o"||xx=="u"){
        println(c)
        c+=1
        return siete(x,n+1)
      }else{
        //println("no")
        return siete(x,n+1)
      }
    }else{
      return 0
    }
  }

  def main(args: Array[String]): Unit = {
    println("Ejercicio 1 Sumatorias")
    println("Dame el limite inferior:")
    var n1=0
    var n2=0
    n1=readInt()
    println("Dame el limite Superior:")
    n2=readInt()
    println(uno(n1,n2))
    println("<-------------------------------->")
    println("Ejercicio 2 Divisores")
    println("Dame el numero para sacar divisores:")
    var d=0
    d=readInt()
    //println(n1,n2)
    println(dos(d))
    println("<-------------------------------->")
    println("Ejercicio 3 Factorial")
    println("Dame un numero:")
    var f=0
    f=readInt()
    println(tres(f))
    println("<-------------------------------->")
    println("Ejercicio 4 Cociente de dos numeros")
    println("Dame el dividendo:")
    var num1=0
    var num2=0
    num1=readInt()
    println("Dame el divisor:")
    num2=readInt()
    println(cuatro(num1,num2))
    println("<-------------------------------->")
    println("Ejercicio 5 Divisores entre 2 numeros")
    println("Dame el primer numero:")
    var divi1=0
    var divi2=0
    divi1=readInt()
    println("Dame el segundo numero:")
    divi2=readInt()
    println(cuatro(num1,num2))
    println("<-------------------------------->")
    println("Ejercicio 6 Binario")
    println("Dame un numero:")
    var db=0
    db=readInt()
    seis(db)
    println("")
    println("<-------------------------------->")
    println("Ejercicio 7 Vocales")
    println("Dame una oracion:")
    var ora=""
    var cont=0
    ora=readLine()
    siete(ora,cont)





  }

}
