package com.netthreads.urrms.coreapi.entity;

public enum LocationType {

    Region("Region"),
    District("District"),
    County("County"),
    SubCounty("SubCounty"),
    Parish("Parish"),
    Vilage("Vilage"),
    Settlement("Settlement");

    private String type;

    LocationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static LocationType getType(String type) {
        for (LocationType locationType : LocationType.values()) {
            if (locationType.getType().equalsIgnoreCase(type)) {
                return locationType;
            }
        }
        return null;
    }
}
