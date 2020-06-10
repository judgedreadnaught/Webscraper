import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document website;
		try {
			website = Jsoup.connect("https://finance.yahoo.com/quote/AAPL?p=AAPL").get();
			Elements prices = website.getElementsByClass("Ta(end) Fw(600) lh(14px)"); //
			//System.out.println(website.getElementById("96"));
			for (Element x: prices) {
				System.out.println(x.text());
			}

		} catch (java.io.IOException e) {
			System.out.println("Invalid URL Provided");
		}
	}

}
