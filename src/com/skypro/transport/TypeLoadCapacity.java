package com.skypro.transport;

public enum TypeLoadCapacity {
    N1 (0, 3.5f),
    N2 ( 3.5f, 12),
    N3 (12, 20);
    private float min;
    private float max;

    TypeLoadCapacity(float min, float max) {
        this.min = min;
        this.max = max;
    }
    TypeLoadCapacity(){
    }

    public float getMin() {
        return min;
    }

    public float getMax() {
        return max;
    }


    @Override
    public String toString() {
        return"Грузоподъемность: от " + min + " тонн " +
                " до " + max + " тонн";

    }
}
