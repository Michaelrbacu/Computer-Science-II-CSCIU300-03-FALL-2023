//********************************************************************
//  Question.java       Author: Lewis/Loftus
//
//  Represents a question (and its answer).
//********************************************************************

import java.util.Scanner;

public class Question implements Complexity, Comparable<Question> {
    private String question, answer;
    private int complexityLevel;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the question with a default complexity.
    //-----------------------------------------------------------------
    public Question(String query, String result) {
        question = query;
        answer = result;
        complexityLevel = 1;
    }

    //-----------------------------------------------------------------
    //  Sets the complexity level for this question.
    //-----------------------------------------------------------------
    public void setComplexity(int level) {
        complexityLevel = level;
    }

    //-----------------------------------------------------------------
    //  Returns the complexity level for this question.
    //-----------------------------------------------------------------
    public int getComplexity() {
        return complexityLevel;
    }

    //-----------------------------------------------------------------
    //  Returns the question.
    //-----------------------------------------------------------------
    public String getQuestion() {
        return question;
    }

    //-----------------------------------------------------------------
    //  Returns the answer to this question.
    //-----------------------------------------------------------------
    public String getAnswer() {
        return answer;
    }

    //-----------------------------------------------------------------
    //  Returns true if the candidate answer matches the answer.
    //-----------------------------------------------------------------
    public boolean answerCorrect(String candidateAnswer) {
        return answer.equals(candidateAnswer);
    }

    //-----------------------------------------------------------------
    //  Returns this question (and its answer) as a string.
    //-----------------------------------------------------------------
    public String toString() {
        return question + "\n" + answer;
    }

    //-----------------------------------------------------------------
    //  Compare questions based on complexity.
    //-----------------------------------------------------------------
    public int compareTo(Question other) {
        if (this.complexityLevel == other.complexityLevel) {
            return 0; // Both questions have the same complexity
        } else if (this.complexityLevel > other.complexityLevel) {
            return 1; // This question is more complex
        } else {
            return -1; // This question is less complex
        }
    }
}