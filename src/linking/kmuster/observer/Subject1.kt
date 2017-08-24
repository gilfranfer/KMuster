package linking.kmuster.observer

internal class Subject1: BaseSubject() {
    override fun notifyObservers() {
        println("Subject1: Starting notification to Observers")
        observersList.forEach { o -> o.update("Subject1", this.myValue) }
    }
}

