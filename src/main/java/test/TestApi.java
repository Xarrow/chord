package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Author ZhangJian
 * Time 2017/2/6
 */
public class TestApi {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://192.168.2.45:8070/MobileService/XJSB/XCJHDB.ashx?startTime=2016/11/4%2000:00&endTime=2016%2F11%2F09+05%3A38&area=全市&people=所有人员");
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            System.out.printf("--> " + stringBuilder);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
