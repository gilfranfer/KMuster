package linking.kmuster.observer

abstract class BaseSubject: iSubject {
    var observersList = ArrayList<iObserver>()

    override fun register(o: iObserver) {
        observersList.add(o)
    }
    override fun unregister(o: iObserver) {
        observersList.remove(o)
    }

    var myValue:Int = 0
        set(myValue) {
            field = myValue
            notifyObservers()
        }
}