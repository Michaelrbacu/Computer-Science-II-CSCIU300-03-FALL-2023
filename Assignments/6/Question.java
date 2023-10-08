//********************************************************************
//  Question.java       Author: Lewis/Loftus
//
//  Represents a question (and its answer).
//********************************************************************

/*
 * Modify the attached Question class to make it override equals.
 * equals does comparison based on question and complexityLevel.
 * In other words, return true only if both question and complexityLevel are the same.
 */
public class Question 
{
    private String question, answer;
    private int complexityLevel;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the question with a default complexity.
    //-----------------------------------------------------------------
    public Question(String query, String result)
    {
        
        question = query;
        answer = result;
        complexityLevel = 1;

    }

    //-----------------------------------------------------------------
    //  Sets the complexity level for this question.
    //-----------------------------------------------------------------
    public void setComplexity(int level)
    {
        complexityLevel = level;
    }

        @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Question other = (Question) obj;
        return question.equals(other.question) && complexityLevel == other.complexityLevel;
    }

    //-----------------------------------------------------------------
    //  Returns the complexity level for this question.
    //-----------------------------------------------------------------
    public int getComplexity()
    {
        return complexityLevel;
    }

    //-----------------------------------------------------------------
    //  Returns the question.
    //-----------------------------------------------------------------
    public String getQuestion()
    {
        return question;
    }

    //-----------------------------------------------------------------
    //  Returns the answer to this question.
    //-----------------------------------------------------------------
    public String getAnswer()
    {
        return answer;
    }

    //-----------------------------------------------------------------
    //  Returns true if the candidate answer matches the answer.
    //-----------------------------------------------------------------
    public boolean answerCorrect(String candidateAnswer)
    {
        return answer.equals(candidateAnswer);
    }

    //-----------------------------------------------------------------
    //  Returns this question (and its answer) as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return question + "\n" + answer;
    } 



}
    
