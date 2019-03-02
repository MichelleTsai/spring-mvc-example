package jenkins.test;

public class Holiday {
	static String[] weekend = { "Sat", "Sun" };

	public Boolean isHoliday(String today) {
		for (String day : weekend) {
			if (today == day)
				return true;
		}
		return false;
	}
}
