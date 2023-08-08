package file;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

@Getter
public class JsonFile {

    private Page pages;

    public void readFile() throws IOException{

        ObjectMapper objectMapper = new ObjectMapper();
        pages = objectMapper.readValue(new java.io.File("urlPages.json"), Page.class);
    }

}
