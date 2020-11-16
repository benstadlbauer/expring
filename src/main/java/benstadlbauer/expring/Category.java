package benstadlbauer.expring;

public enum Category {
	GROCERIES("Groceries"),
	LUNCH_WORK("Lunch during work"),
	FOOD("Food"),
	COFFEE("Coffee"),
	HEALTH_FITNESS("Health and fitness"),
	APARTMENT("Apartment"),
	ENTERTAINMENT("Entertainment"),
	MISC("Misc"),
	MEDICAL("Medical"),
	GIFTS("Gifts"),
	DONATION("Donation"),
	INSURANCE("Insurance"),
	RENT("Rent");

	private final String displayString;

	Category(String displayString) {
		this.displayString = displayString;
	}

	public String getDisplayString() {
		return displayString;
	}
}
