
public class JohnsProblemStatement {

	public static void main(String[] args) {
		
		int demArizona = 126;
		int demFlorida = 32;
		int demVermont = 230;
		int demTexas = 21;
		int demGeorgia = 200;
		
		int repArizona = 152;
		int repFlorida = 85;
		int repVermont = 121;
		int repTexas = 215;
		int repGeorgia = 13;
		
		int demVoteCount = demArizona + demFlorida + demVermont + demTexas + demGeorgia;
		int repVoteCount = repArizona + repFlorida + repVermont + repTexas + repGeorgia;
		
		if(demVoteCount > repVoteCount) {
			System.out.println("Democratic Party Won by "+(demVoteCount-repVoteCount)+" votes");
		}else {
			System.out.println("Republican Party Won by "+(repVoteCount-demVoteCount)+" votes");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		int[] demVotes = {126, 32, 230, 21, 200};
		int[] repVotes = {152, 85, 121, 215, 13};
		
		demVoteCount=0;
		repVoteCount=0;
		
		for(int i=0;i<demVotes.length;i++) {
			demVoteCount += demVotes[i];
			repVoteCount += repVotes[i];
		}

		if(demVoteCount > repVoteCount) {
			System.out.println("Democratic Party Won by "+(demVoteCount-repVoteCount)+" votes");
		}else {
			System.out.println("Republican Party Won by "+(repVoteCount-demVoteCount)+" votes");
		}
		
		
		// COVID Data :)
		int[] maharashtra = {6581677, 30251, 67167, 12111};
		
	}

}
