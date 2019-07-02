package cz.java_webapp.horoscope;

import javafx.beans.binding.*;

public class Sign {

    private TypeOFZodiac type;

    public static enum TypeOFZodiac {
        aries, taurus, gemini, cancer, leo, virgo, libra, scorpio, sagittarius, capricorn, aquarius, pisces
    }

    public TypeOFZodiac getType() {
        return type;
    }

    public Sign(TypeOFZodiac type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
