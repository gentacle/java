package jobkorea;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainApp {

	private static String URL = "http://www.jobkorea.co.kr/Search/?";
	
	public static void main(String[] args) throws IOException {
		String KEY_WORD = "java";
	
		//1Document 가져오기.
		Document doc = Jsoup.connect(URL + getParameter(KEY_WORD, 3)).get();
		
		//2목록 가져오기.
		//System.out.println("" + doc.toString());
		
		Elements elements = doc.select("#smGiList .detailList li");
		
		//배열에서 정보정리
		int idx = 0;
		for(Element element : elements) {
			System.out.println(++idx + " : " + element.text());
			System.out.println("==============================================\n\n");
			
		}
		
	}
	
	/**
	 * URL 완성
	 * @param KEY_WORD
	 * @param PAGE
	 * @return
	 */
	public static String getParameter(String KEY_WORD, int PAGE) {
		return  "stext=" + KEY_WORD + ""
				+"&pageType=GI"
				+"&stext=java"
				+"&pageSize=30"
				+"&ord=1"
				+"&IsCoInfoSC=false"
				+"&IsRecruit=false"
				+"&page="+PAGE
				+"&Order: 1"
				;
	}
}
