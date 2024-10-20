import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class FifteenDaysOfWeatherAlarmsTest extends AccuweatherAbstractTest {


    @Test
    @DisplayName("Тестирование получения тревожных оповещений о погоде на 15 дней")
    void getFifteenDaysOfWeatherAlarms() {

        given()
                .when()
                .queryParam("apikey", getApiKey())
                .get(getBaseUrl()+"/alarms/v1/15day//290421")
                .then()
                .statusCode(401)
                .time(lessThan(2000L))
                .statusLine("HTTP/1.1 401 Unauthorized");
    }

}
