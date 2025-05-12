import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class RunAPI {
    public static void main(String[] args) throws Exception { // Add 'throws Exception' to handle errors
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Enter the title of the movie or series you want to search for:");
        String userTitle = inputUser.nextLine();
        inputUser.close(); 

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://www.omdbapi.com/?t=" + userTitle + "&apikey=14c1e91b")) // Removed leading space in URL
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // Fixed method chaining
        System.out.println(response.body()); // Print the response body
    }
}
