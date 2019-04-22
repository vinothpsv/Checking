object TestingObject {

    @JvmStatic
    fun main(args: Array<String>) {
        /*greetingFunction("Vinoth", 2)
        greetingFunction("Vinoth", 2)*/

        greetingFunction1("Vinoth", 2)
        greetingFunction1("Vinoth", 2)
    }

    inline fun greetingFunction(stringValue: String, intValue: Int) {
        val temp = stringValue + intValue
        println(temp)
    }

    fun greetingFunction1(stringValue: String, intValue: Int) {
        val temp = stringValue + intValue
        println(temp)
    }
}