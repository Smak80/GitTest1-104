fun oneMoreFun(){
    println("Еще функция")
}

fun secondFun(){
    println("Функция 2")
}

fun main() {
    println("Hi!")
    println("И снова здравствуйте!")
    println("Просто для еще одного коммита")
    oneMoreFun()
    secondFun()
    gmoChotko()
}

fun gmoChotko() =  repeat(1000) { println("Тут Был Лёва") }