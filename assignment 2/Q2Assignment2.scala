object Q2Assignment2{
	// Ticket price may be a decimal as well.
	//p is used to denote ticket price

	def noOfAttendees(p:Double) = 120+(15-p)/5*20
	def revenue(p:Double)=p*noOfAttendees(p)
	def cost(p:Double)=500+3*noOfAttendees(p)
	def profit(p:Double)=revenue(p)-cost(p)

	def main(args:Array[String]):Unit = {
	println("Calculating Relationship between Ticket price and Profit\n\n")
	println("Enter the Average Ticket price: ")
	var n = scala.io.StdIn.readInt();
	println("\tProfit for given ticket price is:\t"+profit(n))

	println("\n\nThe profit vs Ticket prices:\n")
	println("\tProfit for given ticket price is :\t"+profit(n-20))
	println("\tProfit for given ticket price is :\t"+profit(n-15))
	println("\tProfit for given ticket price is:\t"+profit(n-10))
	println("\tProfit for given ticket price is:\t"+profit(n-5))
	println("\tProfit for given ticket price is:\t"+profit(n))
	println("\tProfit for given ticket price is:\t"+profit(n+5))
	println("\tProfit for given ticket price is:\t"+profit(n+10))
	println("\tProfit for given ticket price is:\t"+profit(n+15))
	println("\tProfit for given ticket price is:\t"+profit(n+20))

	println("\nSelect the best ticket price...")

	

	}
}