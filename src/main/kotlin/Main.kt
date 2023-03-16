fun main() {
number()

    val count = names(arrayOf("Kayinzili","Kamede","Mbagaya","Swahili","Adisa","Emmy"))
    println(count)
    serveDrinks(2)
    serveDrinks(9)
    serveDrinks(24)
   multiples()

}
fun number() {
    for (num in 1..100){
        if (num % 2==1){
            println(num)
        }
    }
}
fun names(name:Array<String>):Int{
    var count = 0
    for ( word in name){
        if(word.length>5){
            count++
        }
    }
    return count
}

fun serveDrinks(age:Int){
    when(age){
        in 0..5 -> println("Here is your glass of milk")
        in 6..14 -> println ("Here is your bottle of fanta orange")
        else -> println("Here is your bottle of coca cola")
    }
}
fun multiples() {
    for (num in 1..100) {
        when{
            num % 3 == 0 && num % 5 ==0 -> println("FizzBuzz")
           num % 3 == 0 -> println("Fizz")
            num % 5 == 0 -> println("Buzz")
            else -> println(num)
        }
    }
}
