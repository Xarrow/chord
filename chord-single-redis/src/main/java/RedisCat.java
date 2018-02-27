import com.alibaba.fastjson.JSON;
import redis.clients.jedis.Jedis;

/**
 * Author ZhangJian
 * Time 2017/2/16
 */
public class RedisCat {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.hset("web", "google", "www.google.com");
        System.out.printf("redis ping:" + jedis.ping());
        System.out.printf("-->" + jedis.hget("web", "google"));
        System.out.printf("\n-->" + JSON.toJSON(jedis.hgetAll("web")));
    }
}
