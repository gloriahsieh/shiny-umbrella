
public class Team {
	private String name; 
	private int score; 
	private boolean winStatus; 
	private String opponent; 
	private int rank; 
	
	public Team(String name, String opponent) {
		this.name = name;
		this.opponent = opponent; 
		this.winStatus = false;
		this.score = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getOpponent() {
		return this.opponent; 
	}
	
	public void setOpponent(String opponent) {
		this.opponent = opponent;
	}
	
	public boolean getWinStatus() {
		return winStatus; 
	}
	
	public void setWinStatus(boolean winStatus) {
		this.winStatus = winStatus;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
}
