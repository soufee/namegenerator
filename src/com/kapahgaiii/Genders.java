package com.kapahgaiii;


enum Genders {
    MALE, FEMALE, BOTH;

    public String getSrc() {
        switch (this) {
            case MALE:
                return "com/male_names.txt";
            case FEMALE:
                return "com/female_names.txt";
            default:
                return null;
        }
    }
}