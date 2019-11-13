class Event {
    public int day, month, year, hour, minute;

    public String partOfTheDay() {
        if (hour > 12) {
            return 'PM';
        } else {
            return 'AM';
        }
    }
}