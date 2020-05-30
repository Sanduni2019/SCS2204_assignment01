object Q2Assignment3{
	
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
	
	def primeSeq(n:Int):Unit={
		if(n==1) {
			print("\t"+n)
		}
		else if(n==2) {
			print("1\t2")
		}
		else{
			primeSeq(n-1)
			if(isPrime(n-1) == true){
			print("\t"+(n-1))
			}	
		}

	}
	
	def main(args:Array[String]):Unit = {
	println("All prime numbers less than 10 are : \n")
	primeSeq(10)
	}
}
