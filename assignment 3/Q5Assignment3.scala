object Q5Assignment3{
	
	def addEven(n:Int):Int={

		n-1 match{
			case x if x==0 => 0
			case x if (x%2==0) => x+addEven(n-2)
			case x => addEven(n-1)
		}
	}
	
	def main(args:Array[String]):Unit = {
	println("Addition of all even numbers less than 10: "+addEven(10))
	println("Addition of all even numbers less than 9: "+addEven(9))
	println("Addition of all even numbers less than 8: "+addEven(8))
	}
	
}