package jpackage;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Page {
	private Anchor anchor;
	private String PageHash;
	private int anchorParseStatus;
	private int emailParseStatus;
	
	private Document document;
	
	public Page(Anchor anchor) {
		this.anchor = anchor;
	}
	private void getWebDocument() {
		Document doc;
		try {
			document = Jsoup.connect(anchor.getAnchorUrl()).get();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}


	}
	
	}

