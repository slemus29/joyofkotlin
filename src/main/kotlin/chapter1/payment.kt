package chapter1
class CreditCard(val number: Int, val cardHolder: String)
class Donut
class Payment(val creditCard: CreditCard, val amount: Int)
class Purchase(val donut: Donut, payment:Payment)
fun main() {
    val chrisCard = CreditCard(123, "Christian Lemus")
    val santyCard = CreditCard(456, "Santiago Lemus")
    val donut1 = Donut()
    println(chrisCard.number)
    println(chrisCard.cardHolder)
    println(santyCard.number)
    println(santyCard.cardHolder)
    val paymentChris = Payment(santyCard, 5000)
    val testingPurshase = Purchase(donut1, paymentChris)
    println("${paymentChris.creditCard.cardHolder} ${paymentChris.creditCard.number}")
    println(paymentChris.amount)
}