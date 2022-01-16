package com.itea.sgrintsevich.lesson9;

public enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay() {
        if (this == MONDAY || this == TUESDAY || this == WEDNESDAY || this == THURSDAY || this == FRIDAY) {
            return true;
        } else if (this == SATURDAY || this == SUNDAY) {
            return false;
        } else {
            throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }

    public boolean isHoliDay() {
        if (this == SATURDAY || this == SUNDAY) {
            return true;
        } else if (this == MONDAY || this == TUESDAY || this == WEDNESDAY || this == THURSDAY || this == FRIDAY) {
            return false;
        } else {
            throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }

    public String dayType() {
        if (isWeekDay()==true){
            return "WeekDay";
        } else{
            return "HoliDay";
        }
    }

}
