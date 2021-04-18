import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import  java.lang.Exception;

public class MoodAnalyseTest {
    @Test
    public void givenMessage_Whensad_shouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
        String mood = moodAnalyser.analyseMood();

        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenAny_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();

        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNull_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {

            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
          //  Assertions.assertThrows(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMoodAgain();
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }



    }

}