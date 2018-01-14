import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Util {

    public static void printYoutubeJSON(String path) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Youtube youtube = objectMapper.readValue(new File(path), Youtube.class);
            System.out.println(youtube);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
