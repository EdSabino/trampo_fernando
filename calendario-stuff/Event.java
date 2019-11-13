class Event {
    public int day, month, year, hour, minute;
    public boolean isAm;

    public void setIsAm(String part) {
        isAm = part == "AM";
    }
}