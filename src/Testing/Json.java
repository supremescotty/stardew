package Testing;

import JsonParser.json.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Json {
    public static void main(String[] args) throws IOException {
//        FileReader reader = new FileReader("GameData/Data/Crops.json");

        String data = "";

        try {
            File myObj = new File("GameData/Data/Crops.json");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine();
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject(data);
//        System.out.println(jsonObject.toString());
        System.out.println(jsonObject.get("490"));
    }
}
