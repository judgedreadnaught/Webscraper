import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document website;
		String label = "";
		String number = "";
		try {
			website = Jsoup.connect("https://finance.yahoo.com/quote/AAPL?p=AAPL").get();
			Elements prices = website.getElementsByClass("Ta(end) Fw(600) lh(14px)"); //
			Elements names = website.getElementsByClass("C($primaryColor) W(51%)");
			/*for (Element x: prices) {
				System.out.println(x.text());
			}
			for (Element x: names) {
				System.out.println(x.text());
			}*/
			int counter = 0;
			while (counter < prices.size()) {
				label = names.get(counter).text();
				number = prices.get(counter).text();
				System.out.println(label.toUpperCase() + ": \t" + number);
				counter++;
			}

		} catch (java.io.IOException e) {
			System.out.println("Invalid URL Provided");
		}
	}

}
