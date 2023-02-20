package com.skypro.transport;


public enum TypeCapacity {
    ESPECIALESMALL (0, 10),
    SMALL(0,25),
    AVERAGE (25, 50),
    BIG(50, 80),
    ESPECIALEBIG (80, 120);
    private int min;
    private int max;

    TypeCapacity(int min, int max) {
        this.min = min;
        this.max = max;
    }
    TypeCapacity(){
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "Вместимость: " + min + " - " + max;
    }
}
