import java.time.LocalDateTime;
import java.time.Duration;

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
    
    public int setDia(int d){
        if(d <= 0 || d >= 31) return 0;
        this.day = d;
    }

    public int setMes(int m){
        if(m <= 0 || m >= 12) return 0;
        this.month = m;
    }

    public LocalDateTime asLocalDateTime() {
        return LocalDateTime.of(year, month, day, hour, minute);
    }

    public int difference(Event otherEvent) {
        return Duration.between(this.asLocalDateTime(), otherEvent.asLocalDateTime()).getSeconds();
    }
}
