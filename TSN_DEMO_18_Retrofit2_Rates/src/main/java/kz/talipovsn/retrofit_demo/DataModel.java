package kz.talipovsn.retrofit_demo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


// КЛАСС-МОДЕЛЬ ДАННЫХ С САЙТА  https://data.egov.kz/api/v4/valutalar_bagamdary4/v708
// Создается через сайт: http://www.jsonschema2pojo.org/
// с настройками: Java - JSON - Gson



 class Hourly {
    private List<String> time = new ArrayList<String>();
    private List<Double> pm10 = new ArrayList<Double>();
    public List<String> getTime() {
        return time;
    }
    public void setTime(List<String> time) {
        this.time = time;
    }
    public List<Double> getPm10() {
        return pm10;
    }
    public void setPm10(List<Double> pm10) {
        this.pm10 = pm10;
    }
}

class HourlyUnits {
    private String time;
    private String pm10;
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getPm10() {
        return pm10;
    }
    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }
}

public class DataModel {
    private Double latitude;
    private Double longitude;
    private Double generationtimeMs;
    private Integer utcOffsetSeconds;
    private String timezone;
    private String timezoneAbbreviation;
    private HourlyUnits hourlyUnits;
    private Hourly hourly;
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public Double getGenerationtimeMs() {
        return generationtimeMs;
    }
    public void setGenerationtimeMs(Double generationtimeMs) {
        this.generationtimeMs = generationtimeMs;
    }
    public Integer getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }
    public void setUtcOffsetSeconds(Integer utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }
    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }
    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }
    public HourlyUnits getHourlyUnits() {
        return hourlyUnits;
    }
    public void setHourlyUnits(HourlyUnits hourlyUnits) {
        this.hourlyUnits = hourlyUnits;
    }
    public Hourly getHourly() {
        return hourly;
    }
    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }
}
