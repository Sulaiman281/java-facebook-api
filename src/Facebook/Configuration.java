/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import org.scribe.model.Token;

/**
 *
 * @author Tamojit9
 */
public class Configuration {

    static final String NETWORK_NAME = "Facebook";
    static final String PROTECTED_RESOURCE_URL = "https://graph.facebook.com/";
    //static String query = "/me?fields=picture.width(500).height(500)";
    public static volatile String token = "";
    static String apiKey = "240198346146978";
    static String apiSecret = "ee5d3e003357eb331825ae068ad297c7";
    static String redirectUrl = "https://www.facebook.com/connect/login_success.html";
    static String scopes = "";
    public static volatile Token accessToken;
}
