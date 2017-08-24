package linking.kmuster.singleton

class Singleton private constructor() {
    init { println("This ($this) is a singleton") }

    private object Holder { val INSTANCE = Singleton() }

    companion object {
        val instance: Singleton by lazy { Holder.INSTANCE }
    }

    var value:String = "Default"
}