/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;

/**
 *
 * @author felipe
 */
public class Cliente {

    static String token = "CAACEdEose0cBAHVnju5l4NH4RNd6IAxBFdTD4v75cZC4JxaDymtjPZBZB5cJLDFA56c5pjCyWXOZCm0KUS3m6YhMCP9zA3VCa4201ZBEooNhQnyBVZCKxABF5FQ7OehSqLNyivYC0fc2mRddgW397nI7NZCpIluDuJQQKE6JbZAQowZDZD";
    private static FacebookClient facebookClient = null;

    private Cliente() {
    }

    /**
     * retorna o Client criado de acordo com o token
     */
    public static FacebookClient getInstance() {
        if (facebookClient == null) {
            facebookClient = new DefaultFacebookClient(token);
        }
        
        return facebookClient;
    }
    
    public static void setToken(String usuario_token) {
    	token = usuario_token;
    }
}
