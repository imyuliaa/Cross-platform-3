import java.util.*
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.pow

object Task_2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        var u: Double
        println("Введіть межі для x")
        val a = scanner.nextDouble()
        val b = scanner.nextDouble()
        var x = a
        val hx = (b - a) / 7
        println("Введіть межі для y")
        val c = scanner.nextDouble()
        val d = scanner.nextDouble()
        var y = c
        val hy = (d - c) / 7
        print("y\\x ")
        for (i in 0..7) System.out.printf("%8.2f", x + hx * i)
        println()
        for (i in 0..7) {
            System.out.printf("%5.2f", y)
            x = a
            for (j in 0..7) {
                u = sin(x).pow(2.0) + cos(y)
                System.out.printf("%8.2f", u)
                x += hx
            }
            println()
            y += hy
        }
    }
}
