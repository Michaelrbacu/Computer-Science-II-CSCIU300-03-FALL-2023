/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aic
 */
// ********************************************************************
// Question.java Author: Lewis/Loftus
//
// Represents a question (and its answer).
// ********************************************************************
public class Question implements Complexity, Comparable<Question> {
    private String question, answer;
    private int complexityLevel;

    // -----------------------------------------------------------------
    // Constructor: Sets up the question with a default complexity.
    // -----------------------------------------------------------------
    public Question(String query, String result) {
        question = query;
        answer = result;
        complexityLevel = 1;
    }

    // -----------------------------------------------------------------
    // Sets the complexity level for this question.
    // -----------------------------------------------------------------
    public void setComplexity(int level) {
        complexityLevel = level;
    }

    // -----------------------------------------------------------------
    // Returns the complexity level for this question.
    // -----------------------------------------------------------------
    public int getComplexity() {
        return complexityLevel;
    }

    // -----------------------------------------------------------------
    // Returns the question.
    // -----------------------------------------------------------------
    public String getQuestion() {
        return question;
    }

    // -----------------------------------------------------------------
    // Returns the answer to this question.
    // -----------------------------------------------------------------
    public String getAnswer() {
        return answer;
    }

    // -----------------------------------------------------------------
    // Returns true if the candidate answer matches the answer.
    // -----------------------------------------------------------------
    public boolean answerCorrect(String candidateAnswer) {
        return answer.equals(candidateAnswer);
    }

    // -----------------------------------------------------------------
    // Returns this question (and its answer) as a string.
    // -----------------------------------------------------------------
    public String toString() {
        return question + "\n" + answer;
    }

    // added by Chunyu Ai
    // Compare the current question with the other based on complexity level
    public int compareTo(Question other) {
        if (complexityLevel > other.getComplexity()) // current is bigger
            return 1;
        else if (complexityLevel == other.getComplexity()) // same
            return 0;
        else // current is smaller
            return -1;
    }
}
