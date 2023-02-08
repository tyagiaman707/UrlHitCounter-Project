package com.example.UrlHitCounters.model;

public class UrlHitCounter {
    private String name;
    private int countNumber;

    public UrlHitCounter(String name, int countNumber) {
        this.name=name;
        this.countNumber=countNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    @Override
    public String toString() {
        return "UrlHitCounter{" +
                "name='" + name + '\'' +
                ", countNumber=" + countNumber +
                '}';
    }
}
