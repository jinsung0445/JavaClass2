package org.dimigo.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class NaverSearch {
    private static void parseBook(String json) throws Exception {
        Map<String, Object> map = new ObjectMapper().readValue(json, Map.class);
        List<Map<String, String>> list = (List<Map<String, String>>) map.get("items");

        int i = 0;
        for (Map<String, String> movie : list) {
            // 정규표현식을 사용하여 특수문자를 없애기
            String title = movie.get("title").replaceAll("\\<.*?>","");
            String author = movie.get("author");
            String price = movie.get("price");
            System.out.printf("%d. 제목:%s, 저자:%s, 가격:%s원\n", ++i, title, author, price);
        }
    }

    public static void main(String[] args) {
        String clientId = "vVkO5azq9tCRjW804i3m";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "sZFBMcvtKk";//애플리케이션 클라이언트 시크릿값";
        try {
            String text = URLEncoder.encode("스타워즈", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/book.json?query="+ text; // json 결과
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            String inputLine;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
            parseBook(response.toString());   // 여기서 호출
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
