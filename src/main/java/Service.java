import com.google.gson.Gson;
import entity.Currency;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service {
    public File writeActualinFile(List<Currency> currencyList, ArrayList<String> listCC) throws IOException {
       File file = new File("Currency.json");
       file.createNewFile();
       FileWriter fileWriter= new FileWriter(file);
       Gson gson = new Gson();
       List<Currency> gList = new ArrayList<Currency>();
        for (Currency c:currencyList) {
            if(listCC.contains(c.getCc())){
                gList.add(c);
            }
        }
        fileWriter.write(gson.toJson(gList));
        fileWriter.flush();
        fileWriter.close();

return file;
    }


}
