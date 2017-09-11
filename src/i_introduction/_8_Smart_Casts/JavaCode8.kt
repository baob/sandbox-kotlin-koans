package i_introduction._8_Smart_Casts

import util.JavaCode

class JavaCode8 : JavaCode() {
    fun eval(expr: Expr): Int {
        if (expr is Num) {
            return expr.value
        }
        if (expr is Sum) {
            val sum = expr
            return eval(sum.left) + eval(sum.right)
        }
        throw IllegalArgumentException("Unknown expression")
    }
}
