package linking.kmuster.observer

class Observer1: iObserver {
    override fun update(from:String, value:Int){
        println("Observer1: New Value from $from = $value")
    }
}