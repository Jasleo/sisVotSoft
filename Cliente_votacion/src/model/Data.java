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

    public List<PersonaSelect> getListaPersonaByTexto(String texto) {

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/octet-stream");
        RequestBody body = RequestBody.create(mediaType, texto);
        System.out.println("EL TEXTO QUE LLEGA ES : " + texto);
        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/listPersona/" + texto)
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "8ab6b394-fdf2-6bf8-8bb5-531a6e366b20")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            PersonaSelect[] per;
            per = mapper.readValue(respuesta, PersonaSelect[].class);

            return Arrays.asList(per);

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

    public MostrarCandidato getCandidatosParaVotar(String rut) {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/getCandidato/" + rut)
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "315f4793-a5a3-3888-f5cb-e35be414540f")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            MostrarCandidato[] mc;
            mc = mapper.readValue(respuesta, MostrarCandidato[].class);

            List<MostrarCandidato> lista = Arrays.asList(mc);
            MostrarCandidato candidato = new MostrarCandidato();

            for (MostrarCandidato p : lista) {
                candidato = new MostrarCandidato(p.getId(), p.getRut(), p.getNombre(), p.getApellido(), p.getPartido());
            }
            return candidato;

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<CandidatoSelect> getListaCandidatos() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/listCandidato")
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "398cd408-965a-229c-b924-d435b5f922cc")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            CandidatoSelect[] par;
            par = mapper.readValue(respuesta, CandidatoSelect[].class);

            return Arrays.asList(par);

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public PersonaSelect getPersonaByRut(String rut) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/getPersona/" + rut)
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "ec606a2d-f0df-9362-8e56-bc72370a7aef")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            PersonaSelect[] per;
            per = mapper.readValue(respuesta, PersonaSelect[].class);

            List<PersonaSelect> lista = Arrays.asList(per);
            PersonaSelect persona = new PersonaSelect();

            for (PersonaSelect p : lista) {
                persona = new PersonaSelect(p.getRut(), p.getNombre(), p.getApellido(), p.getDireccion(), p.getEdad(), p.getPaisRecidencia_fk(), p.getNacionalidad_fk());
            }
            return persona;

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public int getCantidadVoto(int id) {
        int cantidad = 0;

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/getCantVotos/" + id)
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "fa7cf8f9-745b-b247-fd6b-77c4eae956cd")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            CantidadVoto[] per;
            per = mapper.readValue(respuesta, CantidadVoto[].class);

            List<CantidadVoto> lista = Arrays.asList(per);

            CantidadVoto cantidadVoto = new CantidadVoto();

            for (CantidadVoto cv : lista) {
                cantidadVoto = new CantidadVoto(id, cv.getCantVoto());
            }
            return cantidadVoto.getCantVoto();

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cantidad;
    }

    public int getCantidadVotosTotal() {
        int cantidad = 0;

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/getCantVotosTotal")
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "2e2df737-cee0-6179-2c54-786a153e0916")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            CantidadVoto[] per;
            per = mapper.readValue(respuesta, CantidadVoto[].class);

            List<CantidadVoto> lista = Arrays.asList(per);

            CantidadVoto cantidadVoto = new CantidadVoto();

            for (CantidadVoto cv : lista) {
                cantidadVoto = new CantidadVoto(cv.getCantVoto());
            }
            return cantidadVoto.getCantVoto();

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cantidad;
    }

    public Cuenta getCuentaByRut(String rut) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://localhost:8000/api/v1/getCuenta/" + rut)
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "6feac7fe-2be7-f7b8-7de4-9f7360e0b921")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String respuesta = response.body().string();

            Cuenta[] cu;
            cu = mapper.readValue(respuesta, Cuenta[].class);

            List<Cuenta> lista = Arrays.asList(cu);
            Cuenta cuenta = new Cuenta();

            for (Cuenta c : lista) {
                cuenta = new Cuenta(c.getId(), c.getRutPersona_fk(), c.getPass(), c.getPrivilegio_fk());
            }
            return cuenta;

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    //guardar en la api
    public void registrarPersona(Persona persona) {
        try {
            System.out.println("RUT : " + persona.getRut());
            System.out.println("Nombre : " + persona.getNombre());
            System.out.println("Apellido : " + persona.getApellido());
            System.out.println("Direccion : " + persona.getDireccion());
            System.out.println("Edad : " + persona.getEdad());
            System.out.println("Pais : " + persona.getPaisResidencia_fk());
            System.out.println("Nacionalida : " + persona.getNacionalidad_fk());

            //aca transformamos los datos que recibimos en un json
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, persona);
            String json = writer.toString();
            System.out.println("EL JSON : " + json);

            // mandamos los datos a la api
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
//            RequestBody body = RequestBody.create(mediaType, json);
            RequestBody body = RequestBody.create(mediaType, "{\n    \"rut\": \"" + persona.getRut() + "\",\n    \"nombre\": \"" + persona.getNombre() + "\",\n    \"apellido\": \"" + persona.getApellido() + "\",\n    \"direccion\": \"" + persona.getDireccion() + "\",\n    \"edad\":" + persona.getEdad() + ",\n    \"paisRecidencia_fk\":" + persona.getPaisResidencia_fk() + ",\n    \"nacionalidad_fk\":" + persona.getNacionalidad_fk() + "\n\t\n}");
            Request request = new Request.Builder()
                    .url("http://localhost:8000/api/v1/persona")
                    .post(body)
                    .addHeader("content-type", "application/json")
                    .addHeader("cache-control", "no-cache")
                    .addHeader("postman-token", "63ecbe34-bd97-95ab-a2d4-2d652270f773")
                    .build();

            Response response = client.newCall(request).execute();
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearCuenta(Cuenta cuenta) {
        try {
            //aca transformamos los datos que recibimos en un json
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, cuenta);
            String json = writer.toString();

            // mandamos los datos a la api
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, json);
//            RequestBody body = RequestBody.create(mediaType, "{\n    \"id\": 1,\n    \"rutPersona_fk\": \"19851578-4\",\n    \"pass\": \"admin\",\n    \"privilegio_fk\": 1\n}");
            Request request = new Request.Builder()
                    .url("http://localhost:8000/api/v1/cuenta")
                    .post(body)
                    .addHeader("content-type", "application/json")
                    .addHeader("cache-control", "no-cache")
                    .addHeader("postman-token", "12c78200-ea64-a9d0-ff52-4a9ef4ec597e")
                    .build();

            Response response = client.newCall(request).execute();
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registrarCandidato(Candidato candidato) {
        try {
            //aca transformamos los datos que recibimos en un json
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, candidato);
            String json = writer.toString();

            // mandamos los datos a la api
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, json);
//            RequestBody body = RequestBody.create(mediaType, "{\n    \"id\": 0,\n    \"partido_fk\": 3,\n    \"persona_fk\": \"16784799-8\"\n}");
            Request request = new Request.Builder()
                    .url("http://localhost:8000/api/v1/candidato")
                    .post(body)
                    .addHeader("content-type", "application/json")
                    .addHeader("cache-control", "no-cache")
                    .addHeader("postman-token", "016072f2-88e3-f136-7e2f-666029ed9399")
                    .build();

            Response response = client.newCall(request).execute();
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registrarVoto(Voto voto) {
        try {
            //aca transformamos los datos que recibimos en un json
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, voto);
            String json = writer.toString();

            // mandamos los datos a la api
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, json);
//            RequestBody body = RequestBody.create(mediaType, "{\n    \"id\": 0,\n    \"fecha_voto\": \"2018-06-24 19:18:19\",\n    \"votante_fk\": \"8072179-7\",\n    \"candidato_fk\": 1\n}");
            Request request = new Request.Builder()
                    .url("http://localhost:8000/api/v1/voto")
                    .post(body)
                    .addHeader("content-type", "application/json")
                    .addHeader("cache-control", "no-cache")
                    .addHeader("postman-token", "75736ed7-167e-ae65-536d-7d9f469ea3d1")
                    .build();

            Response response = client.newCall(request).execute();
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //listo
    public void registrarPartido(Partido partido) {
        try {
            //aca transformamos los datos que recibimos en un json
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, partido);
            String json = writer.toString();
            System.out.println("EL JSON : " + json);

            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, json);
//            RequestBody body = RequestBody.create(mediaType, "{\n\t\"id\" : 0,\n\t\"descripcion\" : \"Partido Prueba\",\n\t\"anio_fundacion\" : 2018\n\t\n}");
            Request request = new Request.Builder()
                    .url("http://localhost:8000/api/v1/partido")
                    .post(body)
                    .addHeader("content-type", "application/json")
                    .addHeader("cache-control", "no-cache")
                    .addHeader("postman-token", "5a7d31ef-e49c-db77-b212-c487ea961833")
                    .build();

            Response response = client.newCall(request).execute();
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePass(Cuenta cuenta) {
        try {
            //aca transformamos los datos que recibimos en un json
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, cuenta);
            String json = writer.toString();
            System.out.println("EL JSON : " + json);

            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                    .url("http://localhost:8000/api/v1/cuenta/" + cuenta.getId())
                    .put(body)
                    .addHeader("content-type", "application/json")
                    .addHeader("cache-control", "no-cache")
                    .addHeader("postman-token", "19455c65-9be7-8b69-7fb5-4f1d129e93d0")
                    .build();

            Response response = client.newCall(request).execute();
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePersona(Persona persona) {
        try {
            //aca transformamos los datos que recibimos en un json
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, persona);
            String json = writer.toString();
            System.out.println("EL JSON : " + json);

            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, json);
            Request request = new Request.Builder()
                    .url("http://localhost:8000/api/v1/persona/" + persona.getRut())
                    .put(body)
                    .addHeader("content-type", "application/json")
                    .addHeader("cache-control", "no-cache")
                    .addHeader("postman-token", "a8e1fb0f-f348-8762-3874-b829f16fcabb")
                    .build();

            Response response = client.newCall(request).execute();

        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
