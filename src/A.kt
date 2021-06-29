import java.util.*

class A {

    fun getFibonacciSeries(n: Int,fst:Int,snd:Int) {
        var firstVal = fst
        var secondVal = snd
        for (i in 0 until  n){
            print("$firstVal ")
            val sum = firstVal+secondVal
            firstVal = secondVal
            secondVal = sum
        }
    }
}