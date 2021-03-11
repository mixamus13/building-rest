package com.mixamus.buildingrest;

public class OurApplication {
    private static String staticString = "Static String";
    private String instanceString;

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000_000; i++) {
            OurApplication app = new OurApplication(i);
            System.out.println(app.instanceString);
        }
    }

    public OurApplication(int index) {
        this.instanceString = buildInstanceString(index);
    }

    public String buildInstanceString(int number) {
        return number + ". Instance String !";
    }
}