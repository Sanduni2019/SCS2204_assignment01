object Q4Assignment5 extends App{

	//list of 5 accounts are initialized
	val bank:List[Account]=List(new Account("972540808V" , 1001 ,25000.00),new Account("91234508V" , 1002 ,-20000.50),new Account("236540808V" , 1003 ,15000.00),new Account("258960808V" , 1004 ,10000.50),new Account("995123808V" , 1005 ,5500.00))
	
	println("bank Details : ")
	println(bank)
	
	val overdraft = (a:List[Account])=>a.filter(x=>x.balance<0)
	println("Overdraft : \n\n"+overdraft(bank))
	
	
	val interest = (a:List[Account])=>a.map( x=> 
		if(x.balance>0){ new Account(x.nic,x.accNum,x.balance*1.05)} 
		else { new Account(x.nic,x.accNum,x.balance*1.10) }
		
	println("Account Details after Interest Calculation : \n\n"+interest(bank)))
	
	
	val balance = (a:List[Account])=>a.map(x=>x.balance).reduce((x,y)=>x+y)
	println("Total of Accounts : \n\n"+balance(bank))

}

class Account(id:String,n:Int,b:Double){

	val nic:String = id
	val accNum:Int = n
	var balance:Double = b
	
	override def toString = "[ " +nic+" : "+ accNum +" : " + balance+" ]" //println
		
}

