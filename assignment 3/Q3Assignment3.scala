object Q3Assignment3{

	def addNum(n:Int):Int={
		n match{
			case 1 => n
			case _ => n+addNum(n-1)
		}
	}

	def main(args:Array[String]):Unit = {
	println("Checking for Addition of numbers of all numbers up to a number")
	println("Enter the number : ")
	var n = scala.io.StdIn.readInt();
	println("Addition of numbers : "+addNum(n))
	}
	
	
}