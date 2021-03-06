package com.kde.group2.variables;

public enum County {
    ANTRIM("Antrim"),
    ARMAGH("Armagh"),
    CARLOW("Carlow"),
    CAVAN("Cavan"),
    CLARE("Clare"),
    CORK("Cork"),
    DERRY("Derry"),
    DONEGAL("Donegal"),
    DOWN("Down"),
    DUBLIN("Dublin"),
    FERMANAGH("Fermanagh"),
    GALWAY("Galway"),
    KERRY("Kerry"),
    KILDARE("Kildare"),
    KILKENNY("Kilkenny"),
    LAOIS("Laois"),
    LEITRIM("Leitrim"),
    LIMERICK("Limerick"),
    LONGFORD("Longford"),
    LOUTH("Louth"),
    MAYO("Mayo"),
    MEATH("Meath"),
    MONAGHAN("Monaghan"),
    OFFALY("Offaly"),
    ROSCOMMON("Roscommon"),
    SLIGO("Sligo"),
    TIPPERARY("Tipperary"),
    TYRONE("Tyrone"),
    WATERFORD("Waterford"),
    WESTMEATH("Westmeath"),
    WEXFORD("Wexford"),
    WICKLOW("Wicklow");

    private final String value;

    County(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
