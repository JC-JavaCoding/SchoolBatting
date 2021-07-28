package Experimenting.WebScraping;

import java.io.IOException;//the exception thrown by the jsoup class connecting to a network

//for website retrieving information, import:
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class F1_Attempt_Acc_LIVE_TIMING
{
   public static void main(String [] args)
   {
      try
      {
         Document doc = Jsoup.connect("https://www.formula1.com/en/f1-live.html").get();

         System.out.println("Before loop");
         
         int i = 0;
         for (Element driverInfo : doc.select("div.SP_leaderboardTable") )//element "productList" holds all div limits(of temp)
         {
            i++;
            
            System.out.println("This loop works");
            final String laptime = driverInfo.select("tr.interactive.SP_Table_Row_Hl").text();
            System.out.println(laptime);
            
            
         }
         System.out.println("After loop");
      }
      
      catch(IOException e)
      {
         System.out.println("A prooblem :(");
         e.printStackTrace();
      }
   }
}