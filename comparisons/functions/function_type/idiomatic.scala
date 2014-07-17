def makeIncrementer: Int => Int = 
    (number: Int) => 1 + number

var increment = makeIncrementer
increment(7)
