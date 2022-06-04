package day11Assignment.question3;

public class IPL {
	public void homeTeamStadium(Stadium stadium) {
//		if(stadium==stadium.EDEN_GARDENS_STADIUM) {
//			System.out.println("This is the home ground of KKR");
//		}
		switch (stadium) {
		case CHIDAMBARAM_STADIUM:
			System.out.println("“This is the home ground of PSK”");
			break;
		case EDEN_GARDENS_STADIUM:
			System.out.println("“This is the home ground of KSK”");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("“This is the home ground of MSK”");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("“This is the home ground of CSK”");
			break;

		default:
			System.out.println("Enter Corrent Vlaue");
			break;
		}
	}

	public static void main(String[] args) {
		IPL ipl = new IPL();
		ipl.homeTeamStadium(Stadium.M_CHINNASWAMY_STADIUM);
	}
}
