package business

import org.junit.Assert
import org.junit.Test
import java.util.*

class `Oliver receives one question at a time - acceptance test` {
    /*
    As Oliver,
        I want to receive one question at a time,
        So that I can answer them and not be distracted by other questions.
        ## Acceptance Criteria
        Given there are questions in the quiz
        When I start the quiz
        Then I see only one question from that quiz

     */

    @Test
    fun `there should be one current question when quiz starts`() {
        // Given there are questions in the quiz

        val first = Question(
                id = UUID.randomUUID().toString(),
                title = "How to create a method with spaces in Kotlin"
        )
        val second = Question(
                id = UUID.randomUUID().toString(),
                title = "How to create JUnit4 test function in Kotlin"
        )
        var questions = listOf(first, second)
        val quiz = Quiz(questions = questions)
        // When I start the quiz
        quiz.start()

        // Then I see only one question from that quiz
        val currentQuestion = quiz.currentQuestion
        Assert.assertTrue(questions.contains(currentQuestion))

    }
}

