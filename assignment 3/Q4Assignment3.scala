object Q4Assignment3{

	def isEven(n:Int):Boolean= n match{
			case 0 => true
			case _ => isOdd(n-1)
	}

	def isOdd(n:Int):Boolean= !(isEven(n))
	
	def main(args:Array[String]):Unit = {
	println("Is 5 is an even number: "+isEven(5))
	println("Is 5 is an odd number: "+isOdd(5))
	}
	
}