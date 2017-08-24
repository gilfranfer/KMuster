package linking.kmuster.observer

interface iSubject {
    fun notifyObservers()
    fun register(o: iObserver)
    fun unregister(o: iObserver)
}
