import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Company company = (Company) mapper.readValue(new FileImageInputStream(new File("example3.json")),Company.class);
        List<Company> list = new ArrayList<>();
        list = Arrays.asList(mapper.readValue("example3.json", Company.class));
        System.out.println(list);
        System.out.println(company.toString());
    }
}
