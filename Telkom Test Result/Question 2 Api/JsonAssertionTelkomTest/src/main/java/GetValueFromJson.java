
import org.json.*;
import org.testng.Assert;


public class GetValueFromJson {
    public static class TestLocalApiRestAssured {

        public static void main(String[] args)
        {
            //constructor of the JSONObject class
        JSONObject obj = new JSONObject ("{\n" +
                "  name :\"sidik Wijaya\",\n" +
                "  orderNumber : 76542019,\n" +
                "  courier : \"JNE\",\n" +
                "  product : [\n" +
                "    {\n" +
                "      item : \"laptop Asus\",\n" +
                "      price : 12000000\n" +
                "    },\n" +
                "    {\n" +
                "      item : \"laptop acer\",\n" +
                "      price : 10000000\n" +
                "    },\n" +
                "    {\n" +
                "      item: \"Macbook pro\",\n" +
                "      price: 30000000\n" +
                "    }\n" +
                "  ],\n" +
                "  total : 20000000,\n" +
                "  code : 200,\n" +
                "  succes : true\n" +
                "\n" +
                "}");
//getting values form the JSONObject
        System.out.println(obj);

        }
    }
}
