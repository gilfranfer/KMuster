package linking.kmuster.observer

class Observer2: iObserver {
    override fun update(from:String, value:Int){
        println("Observer2: New Value from $from = $value")
    }
}