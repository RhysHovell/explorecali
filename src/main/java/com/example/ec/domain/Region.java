package com.example.ec.domain;

public enum Region {
    Central_Coast("Central_Coast"), Southern_California("Southern_California"),Northern_California("Northern_California"),Varies("Varies");
    private String label;
    Region(String label) {this.label = label;}
    public static Region findByLabel(String byLabel) {
        for(Region r:Region.values()) {
            if (r.label.equalsIgnoreCase(byLabel))
                return r;

        }
        return null;
    }
}
