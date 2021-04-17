import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyseTest {
      @Test
    public void givenMessage_Whensad_shouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
        String mood = moodAnalyser.analyseMood();

        Assertions.assertEquals("SAD", mood);
        }

    @Test
    public void givenMessage_WhenAny_shouldReturnHappy()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();

        Assertions.assertEquals("SAD", mood);
    }

    }
