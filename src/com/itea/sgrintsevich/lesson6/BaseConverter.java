package com.itea.sgrintsevich.lesson6;

public class BaseConverter {
    Double tamprValue;
    String convertType;

    public BaseConverter() {

    }

    public BaseConverter(Double tamorValue, String convertType) {
        this.tamprValue = tamorValue;
        this.convertType = convertType;
    }

    public Double Convert(Double tamorValue, String convertType) {
        this.tamprValue = tamorValue;
        this.convertType = convertType;
        Double convertRez;

        if (this.convertType.toUpperCase().equals("F")) {
            convertRez = this.tamprValue * 1.8 + 32;
        } else if (this.convertType.toUpperCase().equals("K")) {
            convertRez = this.tamprValue + 273.15;
        } else {
            System.out.println("Error, we don't know how to convert '" + this.convertType + "'!");
            convertRez = 0.0;
        }
        return convertRez;
    }
}
