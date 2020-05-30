object Q4Assignment3{

	def isEven(n:Int):Boolean= n match{
			case 0 => true
			case _ => isOdd(n-1)
	}

	def isOdd(n:Int):Boolean= !(isEven(n))
	
	def main(args:Array[String]):Unit = {

	println("Checking a number is odd")
	println("Enter the number : ")
	var n = scala.io.StdIn.readInt();
	println("Is it is an odd number: "+isOdd(n))
	println("Checking a number is even")
	println("Enter the number : ")
	var m = scala.io.StdIn.readInt();
	println("Is it is an even number: "+isEven(m))
	
	}
	
}