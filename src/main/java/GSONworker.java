import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import entity.Currency;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class GSONworker {
    public GSONworker() {
    }

    public List<Currency> getListFromURL(String url) throws IOException {
        Reader reader = new InputStreamReader(new URL(url).openStream()); //Read the json output
        Gson gson = new GsonBuilder().create();
        List<Currency> obj = Arrays.asList(gson.fromJson(reader, Currency[].class));


        return obj;
    }
    public void readFromFile (File file) throws IOException {

        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(file));
        Currency[] list = gson.fromJson(reader,Currency[].class);
        List<Currency> nList = Arrays.asList(list);
        System.out.println(nList);
    }




}
