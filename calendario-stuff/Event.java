class Event {
    public int day, month, year, hour, minute;
    public boolean isAm;

    public String getPartDay() {
        return this.hour > 12 ? "PM" : "AM";
    }

    public int getHour12Format() {
        if (this.hour > 12) {
            return this.hour - 12;
        }
        return this.hour;
    }

    public String getFormated() {
        return this.day + "/" + this.month + "/" + this.year 
            + " " + this.getHour12Format() + ":" + this.minute + (this.getPartDay());
    }
}