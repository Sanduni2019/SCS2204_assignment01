object Q1Assignment3{

	def GCD(a:Int,b:Int):Int=b match{
			case 0=>a
			case x if(x>a) => GCD(x,a)
			case x => GCD(x,a%x)	
	}

	def isPrime(p:Int,n:Int=2):Boolean=n match {
		case x if(p==x) => true
		case x if GCD(p,x)>1 => false
    	case x => isPrime(p, x+1)
	}
	
	def main(args:Array[String]):Unit = {
		println("Is 2 an prime number: "+isPrime(2))
		println("Is 5 an prime number: "+isPrime(5))
		println("Is 8 an prime number: "+isPrime(8))
	}
}
