package br.com.tap4mobile.libteste

class Sum {

    companion object {
        @JvmStatic
        fun sum(vararg numbers: Double): Double {
            return numbers.sum()
        }
    }

}
