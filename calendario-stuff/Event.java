class Event {
    public int day, month, year, hour, minute;
    public boolean isAm;

    public void setIsAm(String part) {
        isAm = part == "AM";
    }
    
     public int setDia(int d){
	if(d <= 0 || d >= 31) return 0;
	this.day = d;
    }

    public int setMes(int m){
	if(m <= 0 || m >= 12) return 0;
	this.month = m;
    }
}
