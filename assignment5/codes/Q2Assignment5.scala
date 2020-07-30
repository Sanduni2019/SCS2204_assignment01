object Q2Assignment5 extends App{
	val x = new Rational(3,4)
	val y = new Rational(5,8)
	val z = new Rational(2,7)
	val answer =x-y-z
	println(x + " - " + y + " - " + z + " = " + answer)
} 

class Rational(n:Int,d:Int){

	require(d>0,"Denominator must be greater than 0")
	
	def numer = n/gcd(Math.abs(n),d)
	def denom = d/gcd(Math.abs(n),d)
	
	def this(n:Int)=this(n,1) //Auxiliary Constructor
	
	override def toString = numer +"/"+ denom //println
	
	def -(r:Rational)=new Rational(this.numer*r.denom - this.denom*r.numer , this.denom*r.denom)	//subtraction
	
	private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b) //find GCD
	
	
	
	//private def correction(a:Int):Int=if(a<0) -a else a	//GCD correction in negative values
	
	}
