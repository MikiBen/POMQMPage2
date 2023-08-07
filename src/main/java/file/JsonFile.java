package file;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonFile {

    private Page pages;

    public Page getPages() {
        return pages;
    }

    public void readFile() throws IOException{

        ObjectMapper objectMapper = new ObjectMapper();
        pages = objectMapper.readValue(new java.io.File("urlPages.json"), Page.class);
    }

    public void getName(){

        for(int i=0; i<pages.getUrlModelList().size();i++) {
            System.out.println(i + ": ");
            System.out.println(pages.getUrlModelList().get(i).getName());
            System.out.println(pages.getUrlModelList().get(i).getUrl());
        }

    }
}
