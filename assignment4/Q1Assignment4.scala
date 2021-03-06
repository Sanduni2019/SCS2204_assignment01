object Q1Assignment4{

	def main(args:Array[String]):Unit = {
	
		println("The Caesar cipher technique")
		
		val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		
		var s = scala.io.StdIn.readLine("Enter the text : ")
		
		println("Enter the number of keys you want to shift : ")
		var k = scala.io.StdIn.readInt()
		
		
		val Encryption = (c:Char,key:Int,a:String)=> if(c==' ') ' ' else a((a.indexOf(c.toUpper)+key)%(a.size))
		val Decryption = (c:Char,key:Int,a:String)=> if(c==' ') ' ' else a((a.indexOf(c.toUpper)-key)%(a.size))
		
		val caesarCipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

		val encryptedText = caesarCipher(Encryption,s,k,alphabet)
		println("Encrypted Text : "+encryptedText)
		
		val decryptedText = caesarCipher(Decryption,encryptedText,k,alphabet)
		println("Decrypted Text : "+decryptedText)


	}
}

// code alphabet concentrated to Capital letters and the spaces are identified and maintained in the space in enccrypted and decrypted texts.