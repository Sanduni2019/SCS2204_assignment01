object Q3Assignment5 extends App{

	val myAcc = new account(976540808V , 1001 ,2500.50)
	val acc = new account(915478956V, 1002 , 1500.50)
	
	println("Your Account Number Details: ")
	println(myAcc)
	
	println("Receiver's Account Number Details: ")
	println(acc)
	
	println("\nEnter ammount to Transfer: ")
	var recAmount = scala.io.StdIn.readInt()
	
	transfer(recAmount)
	
	println("Updated Your Account Number Details: ")
	println(myAcc)
	
	println("Updated Receiver's Account Number Details: ")
	println(acc)
	
} 

class account(id:String,n:Int,b:Double){

	def nic:string = id
	def accNum:Int = n
	def accBal:Double = b
	
	override def toString = "[ " +nic+" : "+ accNum +" : " + accBal+" ]" //println
	
	def transfer(c:Double)={
		require(this.accNum>=c,"Account balance is insufficient to transtraction")
		
		myAcc.accNum = myAcc.accNum-c
		acc.accNum = acc.accNum+c
		
		println("Transaction successful")
	}
		
}
