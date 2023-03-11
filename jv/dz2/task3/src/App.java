import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;

public class App {
public static void main(String[] args) {
    JSONParser parser = new JSONParser();
    StringBuilder sb = new StringBuilder(); 
    try {
        Object obj = parser.parse(new FileReader("src/data.json"));
        JSONArray jsonArray = (JSONArray) obj;
        for (Object o : jsonArray) {
            JSONObject jsonObject = (JSONObject) o;
            String name = (String) jsonObject.get("фамилия");
            String mark = (String) jsonObject.get("оценка");
            String city = (String) jsonObject.get("предмет");
            sb.append("Студент ").append(name).append(" получил ").append(mark).append(" по предмету ").append(city).append("\n"); 
        }
        
        System.out.print(sb.toString());
    } catch (Exception e) {
    e.printStackTrace();
}
}
}