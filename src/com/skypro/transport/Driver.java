package com.skypro.transport;

public abstract class Driver {
    private static String name;
    private Boolean license;
    private Integer experience;

    public Driver (String name, Boolean license, Integer experience) {
        this.name = validateDriverParameters(name);
        this.license = !license;
        this.experience = validateInteger(experience, 0);
    }
    private int validateInteger(Integer value, int i) {
        return value == null || value <= 1 ? 0 : value;
    }

    private String validateDriverParameters(String value) {
        return value == null ? "не указано" : value;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getLicense() {
        return license;
    }

    public void setLicense(Boolean license) {
        this.license = license;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return  "name: " + name +
                ", license: " + license +
                ", experience: " + experience;

    }
}
