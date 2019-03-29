package week2;

public class ScoreClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scores aScore = new Scores();
		
		//double [] allScores = aScore.getScores();
		aScore.printScores();
		
		ScoresDB aScoreDB = new ScoresDB(aScore);

	}

}
