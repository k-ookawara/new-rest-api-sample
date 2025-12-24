package jp.co.saunz.spring.trace.newrestapi.example;

import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

import java.time.LocalDate;
import java.util.List;
import java.util.TimeZone;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record Forecast(
        Double latitude,
        Double longitude,
        Double generationtimeMs,
        Integer utc_offset_seconds,
        TimeZone timezone,
        TimeZone timezoneAbbreviation,
        Double elevation,
        DailyUnits dailyUnits,
        Daily daily
) {

    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public record DailyUnits(String time, String weatherCode) {
    }

    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public record Daily(List<LocalDate> time, List<WeatherCode> weatherCode) {

    }
}
