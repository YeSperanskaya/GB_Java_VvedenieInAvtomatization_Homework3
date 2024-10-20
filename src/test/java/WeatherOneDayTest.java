import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class WeatherOneDayTest extends AccuweatherAbstractTest{

    @Test
    @DisplayName("Получение прогноза погоды на один день для местоположения с ключом 291662")
    void getWeatherOneDay(){
        Weather weather = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/1day/291662")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000L))
                .extract()
                .body().as(Weather.class);

        Assertions.assertEquals(1, weather.getDailyForecasts().size());
    }
}
