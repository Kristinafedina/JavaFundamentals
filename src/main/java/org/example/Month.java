package org.example;

public enum Month {


    JANUARY( "january"),
    FEBRYARY( "february"),
    MARCH( "march"),
    APRIL( "april"),
    MAY( "may"),
    JUNE( "june"),
    JULY( "july"),
    AUGUST( "august"),
    SEPTEMBER( "september"),
    OKROBER("oktober"),
    NOVEMBER( "november"),
    DECEMBER( "december");

    private final String nameOfMonth;

    Month(String nameOfMonth) {
        this.nameOfMonth = nameOfMonth;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }
}
