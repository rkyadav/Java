package week2;

public class ScoresDB {
	Scores [] scoresObjects = new Scores[5];
	int count = -1;
	public ScoresDB(Scores aScore) {
		
		scoresObjects [++count] = aScore;
		
	}
	
	public void addScores (Scores aScore) {
		scoresObjects[++count] = aScore;
	}
	
	public Scores getScore(double aValue) {
		
		for(int i = 0; i < scoresObjects.length; i++) {
			if(scoresObjects[i].getScores()[0] == aValue)
				return scoresObjects[i];
		}
		
		return null;
	}

}
