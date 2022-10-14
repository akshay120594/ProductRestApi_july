package task5;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class TestingURL {
	
	public static void main(String[] args) throws Exception {
		
		Document doc = Jsoup.connect("https://javabykiran.com/about-sir/").get();
		String title = doc.title();
		
		System.out.println(title);
	}

}
