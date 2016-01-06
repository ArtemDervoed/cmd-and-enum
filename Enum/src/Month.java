
public enum Month {
    JANUARY(31), 
    FEBRUARY(28) {
	public int isLeap(final int year) {
	    if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
		return 29;
	    }
	    return 28;
	}
    },
    MARCH(31), 
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int countOfDays; 
    private Month(int countOfDays) {
	this.countOfDays = countOfDays;
    }

    public Month next() {
	int monthCount = values().length;
	return values()[(this.ordinal() + monthCount + 1) % monthCount];
    }

  }