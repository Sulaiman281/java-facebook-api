
import Facebook.Permissions;
import Facebook.Photo;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tamojit9
 */
public class testing {
     /*static void scribeTest() {
        buildService();

        System.out.println("Now we're going to access a protected resource...");
        OAuthRequest request = new OAuthRequest(Verb.GET, PROTECTED_RESOURCE_URL + query);
        service.signRequest(getToken(), request);
        Response response = request.send();
        System.out.println("Got it! Lets see what we found...");
        System.out.println();
        System.out.println(response.getBody());
        
        JsonParser parser = new JsonParser();
        JsonObject authData = parser.parse(response.getBody()).getAsJsonObject();
        /*try {
            BufferedImage img = ImageIO.read(new URL(authData.get("picture").getAsJsonObject().get("data").getAsJsonObject().get("url").getAsString()));
            new NewJFrame().setVisible(true);
            NewJFrame.load.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            Logger.getLogger(FacebookExample.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    /*    System.out.println("Thats it man! Go and build something awesome with Scribe! :)");
    }

    static void parseAndGenerateFile() throws FileNotFoundException {
        try {
            File toParse = new File("D:\\test.txt");
            BufferedReader br = new BufferedReader(new FileReader(toParse));
            String l = "", source_code = "package Persistent; \n\npublic class Permissions {";
            while(br.ready()) {
                l = br.readLine();
                source_code += "\n public static String " + l.trim().toUpperCase() + " = \"" + l.trim() + "\";";
            }
            
            source_code += "\n}";
            System.out.println(source_code);
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Tamojit9\\Documents\\NetBeansProjects\\Design Pattern\\src\\Persistent\\Permissions.java")));
            bw.write(source_code);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(FacebookExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    static String getNext(String  s) {
        return s.split("until=")[1];
    }
    
    public static void main(String[] args) throws Exception {
        try {
            Facebook.Facebook.setAppId("240198346146978");
            Facebook.Facebook.setAppSecret("ee5d3e003357eb331825ae068ad297c7");
            Facebook.Facebook.setRedirectUrl("https://www.facebook.com/connect/login_success.html");
            Facebook.Facebook.appPermissions(new String[]{Permissions.USER_PHOTOS});
            Facebook.Facebook.setSerializeToFile(new File("D:\\token.out"));
            Facebook.Facebook.getSerializableOAuthToken().getToken();
            //Photo.setType(Photo.TYPE_TAGGED);
            Iterator<URL> it = Photo.getURLIterator();
            ImagePanel ip = new ImagePanel(25);
            ArrayList<URL> urls = new ArrayList<>();
            ArrayList<image> imgs = new ArrayList<>();
            ip.setVisible(true);
            while(it.hasNext()) {
                //System.out.println("Enters before URL");
                URL add = it.next();
                //System.out.println("exits after URL");
                System.out.println(add);
                urls.add(add);
                imgs.add(ip.add());
                //System.out.println("exits");
           }
            System.out.println("Enters");
           int i = 0;
           for(image c : (imgs)) {
               c.setImg(urls.get(i++).toString());
           }
        } catch (Exception ex) {
            System.out.println("Enters");
            Facebook.Facebook.setSerialize(Boolean.TRUE);
            Facebook.Facebook.login();
        }
    }
}
