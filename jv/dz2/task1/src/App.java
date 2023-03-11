import org.json.simple.JSONObject;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;

public class App {
public static void main(String[] args) {
    JSONParser parser = new JSONParser();
    StringBuilder sb = new StringBuilder(); 
    try {
        Object obj = parser.parse(new FileReader("src/data.json"));
        JSONObject jsonObject = (JSONObject) obj;
        String name = (String) jsonObject.get("name");
        String country = (String) jsonObject.get("country");
        String city = (String) jsonObject.get("city");
        String age = (String) jsonObject.get("age");
        String a = " and ";
        sb.append(name).append(a).append(country).append(a).append(city); 
        if (!age.equals("null")) {
            sb.append(a).append(age);
        }
        System.out.print(sb.toString());
    } catch (Exception e) {
    e.printStackTrace();
}
}
}