object Q4Assignment5 extends App{

	val bank:List[Acccount]=List(new Account("972540808V" , 1001 ,25000.00),new Account("972540808V" , 1002 ,20000.50),new Account("972540808V" , 1003 ,15000.00),new Account("972540808V" , 1004 ,10000.50)new Account("972540808V" , 1005 ,5500.00))
	
	val find= (n:Int,b:List[Acccount])=>b.filter(x=>x.accNum.equals(n))
	
	
	println("Your Account Number Details: ")
	println(myAcc)
	
	println("Receiver's Account Number Details: ")
	println(acc)
	
	println("\nEnter ammount to Transfer: ")
	var recAmount = scala.io.StdIn.readInt()
	
	transfer(acc,recAmount)
	
} 

class Account(id:String,n:Int,b:Double){

	val nic:String = id
	val accNum:Int = n
	var balance:Double = b
	
	override def toString = "[ " +nic+" : "+ accNum +" : " + accBal+" ]" //println
	
	def transfer(a:Account,c:Double)={
		require(this.accNum>=c,"Account balance is insufficient to transtraction")
		
		myAcc.accNum = myAcc.accNum-c
		acc.accNum = acc.accNum+c
		
		println("Transaction successful")
	}
		
		
		
		
}




object Q3Assignment5 extends App{

	val myAcc = new Account("972540808V" , 1001 ,2500.50)
	val acc = new Account("915478956V", 1002 , 1500.50)
	
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

	def nic:String = id
	def accNum:Int = n
	def balance:Double = b
	
	override def toString = "[ " +nic+" : "+ accNum +" : " + balance+" ]" //println
	
	def withdraw(a:Double) = this.balance = this.balance - a
	
	def deposit(a:Double) = this.balance = this.balance + a
	
	
	def transfer(a:Account,c:Double)={
		
		this.withdraw(c)
		a.deposit(c)
		
		println("Transaction successful")
		
	}
		
}
