fun oneMoreFunction2(){
    println("Еще функция 2")
}

fun oneMoreFun(){
    println("Еще функция")
}

fun main() {
    println("Hi!")
    println("И снова здравствуйте!")
    println("Просто для еще одного коммита")
    oneMoreFun()
    oneMoreFunction2()
    gmoChotko()
}

fun gmoChotko() =  repeat(1000) { println("Тут Был Лёва") }