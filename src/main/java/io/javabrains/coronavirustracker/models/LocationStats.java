package io.javabrains.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private String latestTotal;

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getLatestTotal() {
        return latestTotal;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatestTotal(String latestTotal) {
        this.latestTotal = latestTotal;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotal=" + latestTotal +
                '}';
    }
}
