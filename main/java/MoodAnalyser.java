public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message){
        this.message = message;
    }
    public String analyseMood()  {
        try {
            return analyseMoodAgain();
        } catch (MoodAnalysisException e) {
            return "HAPPY";
        }
    }


    public String analyseMoodAgain() throws MoodAnalysisException {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e){
            throw new MoodAnalysisException("Please Enter proper message");
        }
    }
}