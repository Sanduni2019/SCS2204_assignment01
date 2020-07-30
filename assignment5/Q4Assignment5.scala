object Q4Assignment5 extends App{

	//list of 5 accounts are initialized
	val bank:List[Account]=List(new Account("972540808V" , 1001 ,25000.00),new Account("91234508V" , 1002 ,-20000.50),new Account("236540808V" , 1003 ,15000.00),new Account("258960808V" , 1004 ,10000.50),new Account("995123808V" , 1005 ,5500.00))
	
	println("\n\nInitial Bank Details : \n\t")
	println(bank)
	
	val overdraft = (a:List[Account])=>a.filter(x=>x.balance<0)
	println("\n\nOverdraft : \n\t"+overdraft(bank))
	
	
	val balance = (a:List[Account])=>a.map(x=>x.balance).reduce((x,y)=>x+y) // first map the account balances and then get the total
	println("\n\nTotal of Accounts : \n\t"+balance(bank))
	
	val interest = (a:List[Account])=>a.map( x=> 
		if(x.balance>0){ new Account(x.nic,x.accNum,x.balance*1.05)} 
		else { new Account(x.nic,x.accNum,x.balance*1.10) })
	
	val bankNew = interest(bank)
		
	println("\n\nAccount Details after Interest Calculation : \n\t"+bankNew)
	
	println("\n\nUpdated Total of Accounts : \n\t"+balance(bankNew))


}

class Account(id:String,n:Int,b:Double){

	val nic:String = id
	val accNum:Int = n
	var balance:Double = b
	
	override def toString = "[ " +nic+" : "+ accNum +" : " + balance+" ]" //println
		
}

