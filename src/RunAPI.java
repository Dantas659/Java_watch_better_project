import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.watchbetter.stream.Titulos;
import br.com.watchbetter.stream.TitulosOmdb;

public class RunAPI {
    public static void main(String[] args) throws Exception { 
        
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Enter the title of the movie or series you want to search for:");
        String userTitle = inputUser.nextLine();
        inputUser.close(); 

         try {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://www.omdbapi.com/?t=" + userTitle.replace(" ", "+" ) + "&apikey=14c1e91b")) // Removed leading space in URL
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // Fixed method chaining
        var json = response.body();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();;
        TitulosOmdb myTitleOmdb = gson.fromJson(json, TitulosOmdb.class);
        System.out.println("Title: " + myTitleOmdb);

        
        
       
            Titulos myTitle = new Titulos(myTitleOmdb);
            System.out.println(myTitle);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
