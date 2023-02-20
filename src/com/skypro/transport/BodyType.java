package com.skypro.transport;


public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUF("Внедорожник"),
    CROSSOVER("Кроссовер")   ,
    PICKUP("Пикап"),
    FAN("Фургон"),
    MINIVAN("Минивэн");
    public String nameBodyType;

    BodyType(String nameBodyType) {
        this.nameBodyType = nameBodyType;
    }
    BodyType (){
    }
    public String getNameBodyType() {
        return nameBodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + nameBodyType;

    }
}


