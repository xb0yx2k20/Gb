
import org.json.simple.JSONObject;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;

public class App {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/data.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            String country = (String) jsonObject.get("country");
            String city = (String) jsonObject.get("city");
            String age = (String) jsonObject.get("age");
            String a = " and ";
            System.out.print(name + a + country + a + city);

            if (!age.equals("null")) {
                System.out.println(a + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
      }
   }
}