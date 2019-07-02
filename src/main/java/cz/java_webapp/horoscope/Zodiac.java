package cz.java_webapp.horoscope;

public class Zodiac {

    private String horoscope;

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String newValue) {
        horoscope = newValue;
    }

    public Zodiac(String horoscope) {
        this.horoscope = horoscope;
    }

    @Override
    public String toString() {
        return horoscope;
    }
}
