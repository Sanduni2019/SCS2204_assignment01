object Q3Assignment3{

	def addNum(n:Int):Int={
		n match{
			case 1 => n
			case _ => n+addNum(n-1)
		}
	}

	def main(args:Array[String]):Unit = {
	println("Addition of numbers from 1 to 5: "+addNum(5))
	}
	
	
}