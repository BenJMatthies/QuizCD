
/**
 * Write a description of Grade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grade {

    private int _numQuestions;
    private int _numCorrect;
    
    public Grade(int numQuestions, int numCorrect)
    {
        _numQuestions = numQuestions;
        _numCorrect = numCorrect;
    }
    
    public double getPercentScore()
    {
        return (double)_numCorrect / (double)_numQuestions * 100;
    }
}
