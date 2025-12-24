package jp.co.saunz.spring.trace.newrestapi.example;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.TimeZone;

@HttpExchange(url = "https://api.open-meteo.com/v1/forecast")
public interface MeteoClient {

    @GetExchange
    Forecast getForecast(@RequestParam String latitude, @RequestParam String longitude, @RequestParam String daily, @RequestParam String timezone);
}
