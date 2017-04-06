/*
class First{
	var A:Int = 0
	var B:Int = 0
	}
	
var XYZ = new First()
XYZ.A = 10
XYZ.B = 15
println(XYZ.A + XYZ.B)
*/

/*
class Second{
	var Name : String = ""
	def Welcome()  {
		println("Welcome: " + Name)
	}
}
var T = new Second()
T.Name = "SHAFEEQ"
T.Welcome()
*/

/*
class Math{
	var A : Double = 0;
	var B : Double = 0;
	
	def Add(x : Double,y : Double) : Double = {
		x + y;
	}
	
	def Sub(x : Double )
	def Mult(x : Double, y : Double) : Double = {
		x * y;
	}
	
	def Div(x : Double, y : Double) : Double = {
		x / y;
	}
}

var A = new Math()
A.A = 10
A.B = 5

println(A.Add(A.A,A.B))
println(A.Mult(A.A,A.B))
println(A.Div(A.A,A.B))
*/

/*
class Math2(A:Double, B:Double){
	
	def Add() : Double = {
		println(A + B);
		A+B;
	}
	
	def Sub() : Double = {
		println(A - B);
		A-B;
	}
	
	def Mult() : Double = {
		println(A * B);
		A*B;
	}
	
	def Div() : Double = {
		println(A / B);
		A/B;
	}
}

var A = new Math2(10,6);
A.Add();
A.Sub();
A.Mult();
A.Div();
*/

/*
class ONE(var A:Int){
	var MaxMark:Int = 0
	println("A")
	
	def this(x:Int, y:Int) = {
		this(15)
		println("B")
	}

	def this(x:Int, y:String) = {
		this(1,2)
		print("C")
	}	
}

var test1 = new ONE(7, "Something")
test1
*/

//Result ----------------------------------------
/*

class Result(){
	private var Phy:Int = 0
	private var Che:Int = 0
	private var Mat:Int = 0
	private var Fail:Int = 0
	
	def Failed = Fail
	
	def Physics = Phy
	def Physics_=(Mark:Int){		
		if (Mark >= 0 & Mark <= 150){
			Phy = Mark
			
			if (Phy < 90){
				Fail += 1
			}
		}
					
	}
	
	def Chemistry = Che
	def Chemistry_=(Mark:Int){		
		if (Mark >= 0 & Mark <= 150){
			Che = Mark
			
			if (Che < 90){
				Fail += 1
			}
		}					
	}
	
	def Math = Mat
	def Math_=(Mark:Int){		
		if (Mark >= 0 & Mark <= 150){
			Mat = Mark
			
			if (Mat < 90){
				Fail += 1
			}
		}
		
	}	
}
//var Score:String = "0"
//var ScoreI:Int = 0
//ScoreI = Score.toInt

//var user_name = scala.io.StdIn.readLine("Name: ")

class Run(){
	var Correct:Boolean = false
	var Creating:Boolean = true

	while (Creating == true){
		//var user_name:String = ""
		//user_name = scala.io.StdIn.readLine("Name: ")
		//input.toInt
		var Score:Int = 0
		
		var A = new Result()
		
		while (Correct == false){
			Score = scala.io.StdIn.readLine("Physics Score: ").toInt		
			if (Score >= 0 && Score <= 150){
				A.Physics = Score
				Correct = true
				//break
			}
			else{
				println("Sorry please input a number between 0 and 150")
			}
		}
		
		Correct = false
		
		while (Correct == false){
			Score = scala.io.StdIn.readLine("Chemistry Score: ").toInt		
			if (Score >= 0 && Score <= 150){
				A.Chemistry = Score
				Correct = true
				//break
			}
			else{
				println("Sorry please input a number between 0 and 150")
			}
		}
		
		Correct = false

		while (Correct == false){
			Score = scala.io.StdIn.readLine("Math Score: ").toInt		
			if (Score >= 0 && Score <= 150){
				A.Math = Score
				Correct = true
				//break
			}
			else{
				println("Sorry please input a number between 0 and 150")
			}
		}

		Correct = false
		
		if(A.Failed == 0){
			println("Total =", (A.Physics + A.Chemistry + A.Math))
			println("Percentage = " + ((A.Physics + A.Chemistry + A.Math)/4.5F) + "%")
		}
		
		else if (A.Failed == 1){
			println("Please repeat the exam.")
		}
		else if (A.Failed == 2){
			println("Please retake the course.")
		}
		else{
			println("Go home.")
		}
		var Again:String = scala.io.StdIn.readLine("Again? Y/N: ")
		if ( Again == "N"){
			Creating = false
		}
	}
}
var ABC = new Run()
ABC

*/

// One ----------------------------------------------------------------------

/*
class One{
	def Message1() = {
		println("ABC")
	}
	
	println("Hello1")
}

class Two extends One{
	println("Hello2")
	def Message2() = {
		println("XYZ")
	}
}

var REF:One = new Two()
REF.Message1()
//REF.Message2()

var REF1:Two = new Two()
REF1.Message1()
REF1.Message2()

*/

/*
class Bank{		
	var Dollar:Double = 1.5
	
	def SetDollar(A:Double) = {
		Dollar = A
	}
	
	def Converstion(A:Double) = {
		println("Amount: " + (A * Dollar))
	}
}

var HSBC = new Bank
		var NatWest = new Bank
		
		HSBC.Converstion(100)
		NatWest.Converstion(100)
		NatWest.SetDollar(1.6)
		HSBC.Converstion(100)
		NatWest.Converstion(100)
		HSBC.SetDollar(1.7)
		HSBC.Converstion(100)
		NatWest.Converstion(100)
*/

/*
class Bank{
	Bank.What()
	
	def SetDollar(A:Double) = {
		Bank.Dollar = A
	}
	
	def Converstion(A:Double) = {
		println("Amount: " + (A * Bank.Dollar))
	}
}

object Bank{
	var Dollar:Double = 1.5
	
	def What() = {
		println("Hello World")
	}
	
	def main(args:Array[String]) = {
		var HSBC = new Bank
		var NatWest = new Bank
		
		HSBC.Converstion(100)
		NatWest.Converstion(100)
		NatWest.SetDollar(1.6)
		HSBC.Converstion(100)
		NatWest.Converstion(100)
		HSBC.SetDollar(1.7)
		HSBC.Converstion(100)
		NatWest.Converstion(100)
	}
}

*/

/*
def MyFunc ( F:(Int, Int) => Int) = {
	println(F(3,3))
}

MyFunc((A:Int, B:Int) => A+B)
MyFunc((A:Int, B:Int) => A*B)
MyFunc((A:Int, B:Int) => {
	//A +=10
	//B +=10
	(A+1) * (B+1)
	}
)

def MyFunc1 ( F:(Int, Int) => Int, A:Int, B:Int) = {
	println(F(A,B))
}

var X = scala.io.StdIn.readLine("Input Int!!!: ").toInt
var Y = scala.io.StdIn.readLine("Input Int!!!: ").toInt
MyFunc1((A:Int, B:Int) => A+B, X,Y)
//MyFunc((A:Int, B:Int) => A*B)
//MyFunc((A:Int, B:Int) => {
//	(A+1) * (B+1)
//	}
//)
*/

def QA():(Int, Int) => String = {
	(A:Int, B:Int) => "The result is: " + (A+B)
	
}

var X:Int = 

var F = QA()
println(F(1,2))































