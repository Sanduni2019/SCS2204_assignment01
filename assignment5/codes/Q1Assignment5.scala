object Q1Assignment5 extends App{

	
	val x = new Rational(3,4)
	val y = new Rational(-2,7)
	
	println("Negative value of "+x+" = "+x.neg)
	println("Negative value of "+y+" = "+y.neg)
} 

class Rational(n:Int,d:Int){
	require(d>0,"Denominator must be greater than 0")
	def numer = n
	def denom = d 
	
	
	def this(n:Int)=this(n,1) //Auxiliary Constructor
	
	def neg = new Rational(-this.numer,this.denom)
			
	override def toString = numer +"/"+ denom
	
	}
