package infrastructure

import business.Question

class StartQuizService(private val quizStorage: QuizStorage) {
    fun startQuiz(): Question {
        return Question(id = "", title = "")
    }

}