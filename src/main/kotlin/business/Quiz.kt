package business

class Quiz(private val questions: List<Question>) {
    var currentQuestion: Question? = null

    fun start() {
        currentQuestion = questions.first()
    }

}