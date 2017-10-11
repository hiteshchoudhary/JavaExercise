import java.net.MalformedURLException;
import java.net.URL;



public class MalUrl {

    public static void main(String[] args){

        try{
            URL url = new URL("https://google.com");
            System.out.println("URL PROTOCOL: " + url.getProtocol());
        }
        catch (MalformedURLException e){
            System.out.println("Correct the protocol. " + e);
        }






    }


}
