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

    static String token = "CAACEdEose0cBAPWowBe57hIoHPFhHOGFSB7Gxz6MXHYu8glYeqTGu7ljDsWInKIXnh4AiMcK6lwrpHoHDZCqJ0cUsstvzJsbTHpZBlsLKsaSiIeh1j350wvhZAEiAJsSJ11sF4zLHyrR9CqP0Xj4PTciJNdbCygmi3knwfdvgZDZD";
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
