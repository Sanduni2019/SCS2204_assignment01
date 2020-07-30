object Q3Assignment5 extends App{

	val myAcc = new Account("972540808V" , 1001 ,3000.50)
	val acc = new Account("915478956V", 1002 , 1200.00)
	
	println("Your Account Number Details: ")
	println(myAcc)
	
	println("Receiver's Account Number Details: ")
	println(acc)
	
	myAcc.transfer(acc,500)
	
	println("Updated Account Details : \n")
	println("Your Account Number Details: ")
	println(myAcc)
	
	println("Receiver's Account Number Details: ")
	println(acc)
	
	
} 

class Account(id:String,n:Int,b:Double){

	val nic:String = id
	val accNum:Int = n
	var balance:Double = b
	
	override def toString = "[ " +nic+" : "+ accNum +" : " + balance+" ]" //println
	
	def withdraw(a:Double) = this.balance = this.balance - a
	
	def deposit(a:Double) = this.balance = this.balance + a
	
	
	def transfer(a:Account,c:Double)={
		
		this.withdraw(c)
		a.deposit(c)
		
		println("\nTransaction successful. Transfered Amount: "+c)
		
	}
		
}
