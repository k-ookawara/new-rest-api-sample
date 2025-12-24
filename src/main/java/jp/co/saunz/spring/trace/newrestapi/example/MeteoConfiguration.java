package jp.co.saunz.spring.trace.newrestapi.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.restclient.RestClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(MeteoClient.class)
class MeteoConfiguration implements RestClientCustomizer {

    @Value("${meteo.api.accept-lang}")
    private String acceptLang;

    @Override
    public void customize(RestClient.Builder restClientBuilder) {
        restClientBuilder.defaultHeader("Accept-Language", acceptLang);
    }
}
