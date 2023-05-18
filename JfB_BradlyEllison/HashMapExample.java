import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> countriesContinents = new HashMap<String, String>();
        countriesContinents.put("Europe", "England");
        countriesContinents.put("North America", "USA");
        countriesContinents.put("Asia","Japan");
        System.out.println(countriesContinents);
        countriesContinents.get("Asia");
        countriesContinents.remove("Europe");
        countriesContinents.size();
        countriesContinents.clear();
    }
}
