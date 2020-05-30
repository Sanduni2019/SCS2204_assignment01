object Q5Assignment3{
	
	def addEven(n:Int):Int={

		n-1 match{
			case x if x==0 => 0
			case x if (x%2==0) => x+addEven(n-2)
			case x => addEven(n-1)
		}
	}
	
	def main(args:Array[String]):Unit = {
	println("Checking Addition of all even numbers less than a number")
	println("Enter the number : ")
	var n = scala.io.StdIn.readInt();
	println("Addition of all even numbers less than it: "+addEven(n))
	}
	
}