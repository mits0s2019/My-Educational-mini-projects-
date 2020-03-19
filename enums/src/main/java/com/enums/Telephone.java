package com.enums;

import java.util.Arrays;
import java.util.List;

public enum Telephone {

    MOBILE("69","003069" ),
    PHONE("210","0030210");

    private final String prefix10;
    private final String prefix14;

    Telephone(String prefix10,String prefix14) {
        this.prefix10 = prefix10;
        this.prefix14 = prefix14;
    }

    public List<String> getPrefix() {
        return Arrays.asList(prefix10,prefix14);
    }

}
