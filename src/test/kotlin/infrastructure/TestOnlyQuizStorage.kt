package infrastructure

import business.Quiz

class TestOnlyQuizStorage(
        private val quizes: List<Quiz>) : QuizStorage {

}