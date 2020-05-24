object SCS_2204_assignment01{
	def tempConverter(temp:Double):Double=(temp*1.8)+32
	def volumeCalculator(r:Double):Double=(4/3)*(22/7)*r*r*r
	def costCalculator(n:Int):Double=24.95*n*0.6+(3*50)+0.75*(n-50)
	
	def main(args:Array[String]):Unit = {
	println("Temperaure Conversion from 35 celcius to fahrenhite: "+tempConverter(35))
	println("Volume of sphere with radius 5 is: "+volumeCalculator(5))
	println("Total whole sale cost for 60 books are : "+costCalculator(60))
	}
}

