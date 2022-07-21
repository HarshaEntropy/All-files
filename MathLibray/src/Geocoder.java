
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import static java.net.http.HttpClient.*;

public class Geocoder {
    private static final String GEOCODING_RESOURCE = "https://maps.googleapis.com/maps/api/geocode/";

//    https://maps.googleapis.com/maps/api/geocode/json?place_id=ChIJeRpOeF67j4AR9ydy_PIzPuM&key=YOUR_API_KEY

//    https://maps.googleapis.com/maps/api/geocode/json?address=high+st+hasting&components=country:GB&key=YOUR_API_KEY

    private static final String API_KEY = "";

    public Object GeocodeSync(String query) throws IOException, InterruptedException {

        HttpClient httpClient = newHttpClient();

        String encodedQuery = URLEncoder.encode(query,"UTF-8");
//        String requestUri = GEOCODING_RESOURCE + "?apiKey=" + API_KEY + "&q=" + encodedQuery;

        String requestUri = GEOCODING_RESOURCE + "json?address="+ encodedQuery +":GB&key="+ API_KEY;

        HttpRequest geocodingRequest = HttpRequest.newBuilder().GET().uri(URI.create(requestUri))
                .timeout(Duration.ofMillis(2000)).build();

        HttpResponse geocodingResponse = httpClient.send(geocodingRequest,
                HttpResponse.BodyHandlers.ofString());

        return geocodingResponse.body();
    }
}