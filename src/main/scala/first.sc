val hello: String = "Hola"

var helloThere: String = hello

helloThere = hello + "There"
println(helloThere)


if (1 < 3) {
  println("teste")
}

val number = 22

number match {
  case 1 => println("One")
  case 2 => println("Two")
  case _ => println("Somenthing else")
}

for (x <- 0 to 4){
  val square = x * x
  println(square)
}

{val x = 10;x+20}


def square(x:Int) :Int ={
  x *x
}



var helloThere: String = hello

helloThere = hello + "There"
println(helloThere)


if (1 < 3) {
  println("teste")
}

val number = 22

number match {
  case 1 => println("One")
  case 2 => println("Two")
  case _ => println("Somenthing else")
}

for (x <- 0 to 4){
  val square = x * x
  println(square)
}

{val x = 10;x+20}


def square(x:Int) :Int ={
  x *x
}


def getNextNum(num: Long): Long = {
  if (num <= 1) {
    num
  } else {
    getNextNum(num - 1) + getNextNum(num - 2)
  }
}

F(4) == F(3) + F(2) = 2 + 1 = 3
F(3) == F(2) + F(1) = 1 + 1 = 2
F(2) == F(1) + F(0) = 1 + 0 = 1
F(1) == 1
F(0) == 0

println(getNextNum(4))

for (x <- 0 to 10){
  println(getNextNum(x))
}