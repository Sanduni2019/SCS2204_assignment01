object Q2Assignment2{
	// Ticket price may be a decimal as well.
	//p is used to denote ticket price

	def noOfAttendees(p:Double) = 120+(15-p)/5*20
	def revenue(p:Double)=p*noOfAttendees(p)
	def cost(p:Double)=500+3*noOfAttendees(p)
	def profit(p:Double)=revenue(p)-cost(p)

	def main(args:Array[String]):Unit = {
	println("\nThe profit vs Ticket prices:\n")
	println("\tProfit when ticket price is 5:\t"+profit(5))
	println("\tProfit when ticket price is 10:\t"+profit(10))
	println("\tProfit when ticket price is 15:\t"+profit(15))
	println("\tProfit when ticket price is 20:\t"+profit(20))
	println("\tProfit when ticket price is 25:\t"+profit(25))
	println("\tProfit when ticket price is 30:\t"+profit(30))
	println("\tProfit when ticket price is 35:\t"+profit(35))
	println("\tProfit when ticket price is 40:\t"+profit(40))

	println("\nSelect the best ticket price...")

	

	}
}