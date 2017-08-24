package linking.kmuster.observer

class Observer3: iObserver {
    override fun update(from:String, value:Int){
        println("Observer3: New Value from $from = $value")
    }
}