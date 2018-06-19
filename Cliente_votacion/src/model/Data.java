package model;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Data {
    private List<Nacionalidad> listaNacionalidad;
    
    public List<Nacionalidad> getNacionalidad(){
        
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
          .url("http://localhost:8000/api/nacionalidad")
          .get()
          .addHeader("authorization", "Basic YXBwOjEyMw==")
          .addHeader("cache-control", "no-cache")
          .addHeader("postman-token", "16733715-c87b-50b0-1290-14bc1db48523")
          .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();
            
            ObjectMapper mapper = new ObjectMapper();
            
            Nacionalidad[] n;
            n = mapper.readValue(respuesta, Nacionalidad[].class);
            return Arrays.asList(n);
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}