package jp.co.saunz.spring.trace.newrestapi.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public record Forecast(
        Double latitude,
        Double longitude,
        @JsonProperty("generationtime_ms") Double generationtimeMs,
        Integer utc_offset_seconds,
        TimeZone timezone,
        @JsonProperty("timezone_abbreviation") TimeZone timezoneAbbreviation,
        Double elevation,
        @JsonProperty("daily_units") DailyUnits dailyUnits,
        Daily daily
) {

    public record DailyUnits(String time, @JsonProperty("weather_code") String weatherCode) {
    }


    public record Daily(List<LocalDate> time, @JsonProperty("weather_code") List<WeatherCode> weatherCode) {

    }
}
