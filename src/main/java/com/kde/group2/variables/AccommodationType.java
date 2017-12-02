package com.kde.group2.variables;

public enum AccommodationType {
    ALL("all"),
    BEDSIT("Bed-Sit"),
    CARAVAN_MOBILE_HOME("Caravan%2FMobile_home"),
    FLAT_APARTMENT("Flat%2FApartment"),
    HOUSE_BUNGALOW("House%2FBungalow"),
    NOT_STATED("not_stated");

    private final String value;

    AccommodationType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
