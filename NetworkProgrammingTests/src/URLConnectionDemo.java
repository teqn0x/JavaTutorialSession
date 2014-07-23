import java.net.*;
import java.io.*;

class URLConnectionDemo{

    public static void main(String[] args){
	try{
	    URL url = new URL(args[0]);
	    URLConnection urlConnection = url.openConnection();
	    HttpURLConnection connection = null;
	    if(urlConnection instanceof HttpURLConnection){
		connection = (HttpURLConnection) urlConnection;
	    }
	    else {
		System.err.println("Please enter an HTTP URL.");
		return;
	    }
	    
	    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	    String urlString = "";
	    String current;
	    
	    while((current = in.readLine())!=null){
		urlString+=(current+"\n");
	    }
	    System.out.println(urlString);
	} catch( IOException e){
	    e.printStackTrace();
	}
    }
}
	     
