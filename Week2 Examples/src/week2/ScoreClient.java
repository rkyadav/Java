package week2;

public class ScoreClient {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scores aScore = new Scores(null);
		
		double [] allScores = aScore.getScores();
		ScoresDB aScoreDB = new ScoresDB(aScore);
	}

}
