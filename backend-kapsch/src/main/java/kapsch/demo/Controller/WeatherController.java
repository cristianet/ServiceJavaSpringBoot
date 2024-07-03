package kapsch.demo.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kapsch.demo.Entities.WeatherRequest;
import kapsch.demo.Services.WeatherService;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
    	 this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public ResponseEntity<String> getWeather(@RequestParam double latitude, @RequestParam double longitude) {
        try {
            String weatherForecast = weatherService.getWeatherForecast(latitude, longitude);
            return ResponseEntity.ok(weatherForecast);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Error: Parámetros incorrectos - " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno del servidor - " + e.getMessage());
        }
    }
    
    @GetMapping("/weather-requests")
    public ResponseEntity<List<WeatherRequest>> getAllWeatherRequests() {
        List<WeatherRequest> weatherRequests = weatherService.getAllWeatherRequests();
        return ResponseEntity.ok(weatherRequests);
    }
}