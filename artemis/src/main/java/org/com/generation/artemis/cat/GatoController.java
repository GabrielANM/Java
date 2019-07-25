package org.com.generation.artemis.cat;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class GatoController {

    private static final Logger logger = LoggerFactory.getLogger(GatoController.class);

    /*@GetMapping("/gatos/{statusCode}")
    public String getStatusCode(@PathVariable Integer statusCode) {

        String retorno = null;

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://http.cat/" + statusCode)
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            retorno = response.body().toString();
        } catch (IOException e) {
            logger.info("Ocorreu um erro na hora de consuir a API de gatinhos");
        }
        return retorno;

    } */

        /*@Autowired
        private GatoService gatoService;

        @GetMapping("/gatos/{statusCode}")
        public String obtemGatoDoCodigoDeStatus(@PathVariable Integer statusCode) {

        }*/
}




