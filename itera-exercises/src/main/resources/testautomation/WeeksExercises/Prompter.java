package testautomation.WeeksExercises;

public class Prompter {
    public void pressAnyKey() {
		try {
			System.out.println("Press any key to continue...");
			System.in.read();
		} catch (Exception e) {
			;
		}
    }
}
