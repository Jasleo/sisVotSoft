package model;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Data {

    private final ObjectMapper mapper;

    public Data() {
        mapper = new ObjectMapper();
    }

    //obtener nacionalidades
    public List<Nacionalidad> getListaNacionalidad() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/listNacionalidad")
                .get()
                .addHeader("authorization", "Basic YXBwOjEyMw==")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "16733715-c87b-50b0-1290-14bc1db48523")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            Nacionalidad[] n;
            n = mapper.readValue(respuesta, Nacionalidad[].class);

            return Arrays.asList(n);

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    //obtener paises
    public List<Pais> getListaPais() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/listPais")
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "b3ae84f7-519a-1371-fa59-822cfc916e98")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            Pais[] pa;
            pa = mapper.readValue(respuesta, Pais[].class);

            return Arrays.asList(pa);

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<Cuenta> getListaCuentas() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/listCuenta")
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "6737a7f9-c304-44d2-b784-b7e21df6fbf5")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            Cuenta[] cu;
            cu = mapper.readValue(respuesta, Cuenta[].class);

            return Arrays.asList(cu);

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<PersonaSelect> getListaPersonas() {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/listPersona")
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "4bb4f7c2-2e16-d287-5571-bb3c9d48cb07")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            PersonaSelect[] pe;
            pe = mapper.readValue(respuesta, PersonaSelect[].class);

            return Arrays.asList(pe);

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<Voto> getListaVotos() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/listVoto")
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "83a85cd5-9a98-fd0d-52ab-f5f0cb12fff5")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            Voto[] vo;
            vo = mapper.readValue(respuesta, Voto[].class);

            return Arrays.asList(vo);

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<Partido> getListaPartidos() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/listPartido")
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "6325c05b-930f-9f4e-4cf4-f1a955d65d0b")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            Partido[] par;
            par = mapper.readValue(respuesta, Partido[].class);

            return Arrays.asList(par);

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    //guardar en la api
    public void registrarPersona(Persona persona) {
        try {
            //aca transformamos los datos que recibimos en un json
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, persona);
            String json = writer.toString();

            // mandamos los datos a la api
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/octet-stream");
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                    .url("http://localhost:8000/api/v1/persona")
                    .post(body)
                    .addHeader("cache-control", "no-cache")
                    .addHeader("postman-token", "16270694-a679-6a47-f402-9150cadc65bc")
                    .build();

            Response response = client.newCall(request).execute();
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registrarPartido(Partido partido) {
        try {
            //aca transformamos los datos que recibimos en un json
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, partido);
            String json = writer.toString();

            OkHttpClient client = new OkHttpClient();

            // mandamos los datos a la api
            MediaType mediaType = MediaType.parse("application/octet-stream");
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                    .url("http://localhost:8000/api/v1/partido")
                    .post(body)
                    .addHeader("Cache-Control", "no-cache")
                    .addHeader("Postman-Token", "2e5a4b0c-394f-4af3-9ba5-c6f2abbb8b5f")
                    .build();

            Response response = client.newCall(request).execute();
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
