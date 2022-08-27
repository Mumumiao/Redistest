import org.junit.Test;
import redis.clients.jedis.Jedis;

public class Redistest {
    @Test
    public void test(){
        Jedis jedis=new Jedis("127.0.0.1",6379);
        System.out.println(jedis.ping());
//    jedis.sadd("testset",new String[]{"jey","汤姆1","还买暖宝宝1"});
//        jedis.lrange("testset",0,jedis.scard("testset")-1).forEach(d->{
//
//            System.out.println(d);
//        });
        System.out.println(jedis.sadd("testset","je"));
        jedis.smembers("testset").forEach(d->{
            System.out.println(d+"new");
        });
    }

}
