package infrastructure

import business.Question
import business.Quiz
import java.util.*

class `Load Questions from Quiz Storage` {
    /*
    As Oliver,
        I want to start a quiz that is loaded from somewhere,
        So that there is an actual quiz with questions to answer
        ## Acceptance Criteria
        Given there is a Quiz with a few Questions in the Quiz Storage
        When I start the Quiz
        Then I see a Question from that Quiz
     */
    // Given there is a Quiz with a few Questions in the Quiz Storage
    val first = Question(
            id = UUID.randomUUID().toString(),
            title = "How to create a method with spaces in Kotlin?")
    val second = Question(
            id = UUID.randomUUID().toString(),
            title = "How to create JUnit4 test function in Kotlin?")
    val questions = listOf(first, second)
    val quiz = Quiz(questions = questions)

    val quizStorage = TestOnlyQuizStorage(
            quizes = listOf(quiz))

    val startQuizService = StartQuizService(quizStorage)

    // When I start the Quiz
    val result = startQuizService.startQuiz()

    // Then I see a Question from that Quiz
    //Assert.assertTrue(questions.contains(result))
    Assert.assertTrue(questions.contains(result))

}

