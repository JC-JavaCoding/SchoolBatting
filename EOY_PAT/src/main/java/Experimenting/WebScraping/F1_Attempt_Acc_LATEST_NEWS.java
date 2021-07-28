package Experimenting.WebScraping;

import java.io.IOException;//the exception thrown by the jsoup class connecting to a network

//for website retrieving information, import:
import org.jsoup.*;// 
// import org.jsoup.nodes.Document;
// import org.jsoup.nodes.Element;
// import org.jsoup.select.Elements;

public class F1_Attempt_Acc_LATEST_NEWS
{
   public static void main(String [] args)
   {
      try
      {
         Document doc = Jsoup.connect("https://www.formula1.com/en/latest.html").get();

         System.out.println("Before loop");
         
         int i = 0;
         for (Element driverInfo : doc.select("div.f1-cc--caption p") )//element "productList" holds all div limits(of temp)
         {
            i++;
            
            final String laptime = driverInfo.select("p.f1--s.no-margin").text();
            System.out.println(laptime);
            
            
            System.out.println("This loop works");
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