object Assignment6 extends App{
	
	println("Enter two point with x and y co-ordinates respectively.: ")
	
	println("Enter co ordinates of first point: ")
	var a = scala.io.StdIn.readInt()
	val b = scala.io.StdIn.readInt()
	val p1 = new Point(a,b)
	
	println("Enter co ordinates of second point: ")
	val c = scala.io.StdIn.readInt()
	val d = scala.io.StdIn.readInt()
	val p2 = new Point(c,d)
	println("\nEntered Points: "+p1+" and "+p2 )
	
	val p3 = p1+p2
	println("\nAddition of"+p1+" and "+p2+" : "+p3)
	
	println("\nDistance between "+p1+" and "+p2+" : "+ p1.distance(p2))
	
	println("\nInversion of"+p1+" : "+p1.invert)
	println("Inversion of"+p2+" : "+p2.invert)
	
	println("\nEnter the distance you want to move:")
	println("Enter dx and dy respectively:") 
	val dx = scala.io.StdIn.readInt()
	val dy = scala.io.StdIn.readInt()
	println(p1+" Shifted "+dx+" and "+dy+" : "+p1.move(dx,dy))
	println(p2+" Shifted "+dx+" and "+dy+" : "+p2.move(dx,dy))
	
	
}

case class Point(a:Int , b:Int){
	
		def x: Int = a
		def y: Int = b
	
	def +(n:Point)=Point(this.x+n.x, this.y+n.y)
	
	def move(dx:Int, dy:Int)=Point(this.x+dx, this.y+dy)
	
	def invert()=Point(this.y,this.x)

	def distance(a:Point):Double={
		val xDif = (this.x-a.x).abs
		val yDif = (this.y-a.y).abs
		
		return Math.sqrt((xDif*xDif)+(yDif*yDif))
		//return sqrt((xDif*xDif)+(yDif*yDif))
	}
}