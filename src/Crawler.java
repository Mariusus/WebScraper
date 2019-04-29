import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Crawler {

	public static void main(String[] args) {
		
		Document doc;
		try {
			doc = Jsoup.connect("http://en.wikipedia.org/").get();
			org.jsoup.select.Elements 
			links = doc.select("a");
			for(Element e : links)
			{
				System.out.println(e.attr("abs:href"));
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}


	}

}
