package pl.emgie.java11.http2client;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

//Java 11 features http2 client
public class AsyncHttp2Client {

    public static void main(String[] args) throws URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://www.google.com/"))
                .GET()
                .build();

        HttpResponse.BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();

        HttpClient httpClient = HttpClient.newHttpClient();

        CompletableFuture<HttpResponse<String>> completableFuture = httpClient.sendAsync(request, bodyHandler);
        completableFuture.thenApply(e -> e.body()).thenAccept(System.out::println).join();
    }
}
