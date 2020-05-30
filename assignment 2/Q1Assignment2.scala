object Q1Assignment2{
	def wage(h:Int)=h*150
	def OTpayment(h:Int)=h*75
	def tax(t:Int)=t*0.1
	def totalIncome(h1:Int,h2:Int)=wage(h1)+OTpayment(h2)
	def takeHomesalary(h1:Int,h2:Int)=totalIncome(h1,h2)-tax(totalIncome(h1,h2))

	def main(args:Array[String]):Unit = {
	println("Calculating The take home salary of an employee per week\n\n")
	println("Enter the normal working hours: ")
	var n = scala.io.StdIn.readInt();	
	println("Enter the OT hours: ")
	var m = scala.io.StdIn.readInt();
	println("\nThe take home salary of employee per week: "+takeHomesalary(n,m))
	}
}