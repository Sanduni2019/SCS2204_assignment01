object Q6Assignment3{

	def fibonacciNum(n:Int):Int={
		n match{
			case x if x==0 => 0
			case x if x==1 => 1
			case x => fibonacciNum(n-1)+fibonacciNum(n-2)
		}
	}

	def fibonacciSeq(n:Int):Unit={
		if(n>0) {
			fibonacciSeq(n-1)
		}
		println("\t"+fibonacciNum(n))
		
	}
	
	def main(args:Array[String]):Unit = {
	println("First 10 fibonacci numbers are : \n")
	fibonacciSeq(10)
	}
	
}