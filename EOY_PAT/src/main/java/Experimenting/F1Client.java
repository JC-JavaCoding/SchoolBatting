package Experimenting;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;

public class F1Client {

	public static void main(String[] args) 
	{
		//Create a new RedditClient and log us in!
		RedditClient client = new RedditClient("jjaaccoobs@gmail.com", "DJJ1029384756");
		client.login();
		
		//Let's scrape our messages, information behind a login.
		//https://www.reddit.com/message/messages/ is the URL where messages are located.
		String page = client.get("https://www.formula1.com/en/f1-live.html");
	
//		       Scanner docPage = new Scanner(webPage);
//		       
//		       System.out.println(webPage);
		//"div.md" selects all divs with the class name "md", that's where message
		//bodies are stored. You'll find "<div class="md">" before each message.
		Elements messages = Jsoup.parse(page).select("tr.SP_Table_Row_Hl.interactive");
		
		//For each message in messages, let's print out message and a new line.
		for(Element message : messages)
		{
			System.out.println(message.text() + "\n");
		}

	}

}
