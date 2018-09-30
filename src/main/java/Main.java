import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        GSONworker gsoNworker =  new GSONworker();
        //Get data from URL
        List list = gsoNworker.getListFromURL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
        Service service = new Service();
        //Create file "Currency.json"
        service.writeActualinFile(list,new ArrayList<String>(Arrays.asList("USD","RUB","EUR")));
        //Read from file
        gsoNworker.readFromFile(new File("Currency.json"));
    }
}
