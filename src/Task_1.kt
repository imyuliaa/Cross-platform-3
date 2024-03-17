import java.util.*
import kotlin.math.abs
import kotlin.math.pow

object Task_1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        var u: Double
        var s = 1.0
        val eps = 0.00001
        println("Введіть значення x")
        val x = scanner.nextDouble()
        u = x / 3
        var n = 2
        while (abs(u) > eps) {
            s += u
            u *= x * (3 * n - 4) / (3 * n)
            n++
        }
        System.out.printf("Значення суми s = %.6f\n", s)
        System.out.printf(
            "Значення функції: %.6f\n",
            (1 + x).pow(-1.0 / 3.0)
        )
        println("Кількість доданків " + (n - 1))
        scanner.close()
    }
}