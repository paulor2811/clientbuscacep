package io.github.paulor2811.clientbuscacep.viacep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import io.github.paulor2811.clientbuscacep.core.Address;
import io.github.paulor2811.clientbuscacep.util.Util;

public class ViaCEP {
	
	public static Address HTTPClient(Address address, String cep) throws Exception {
        String str_url = "https://viacep.com.br/ws/" + cep + "/json/";
    	int statusCode = 200;

        try {
            @SuppressWarnings("deprecation")
			URL url = new URL(str_url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            if (connection.getResponseCode() != statusCode)
                throw new RuntimeException("HTTP error code : " + connection.getResponseCode());

            BufferedReader response = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            String responseJson = Util.converteJsonEmString(response);

            Gson gson = new Gson();
            address = gson.fromJson(responseJson, Address.class);

            return address;
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}
