package linking.kmuster.observer

class Subject2: BaseSubject() {
    override fun notifyObservers() {
        println("Subject2: Starting notification to Observers")
        observersList.forEach { o -> o.update("Subject2", this.myValue) }
    }
}