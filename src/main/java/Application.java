import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

/**
 * Created by RENT on 2017-08-25.
 */
public class Application {

    private static final Logger log = (Logger) LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }

}
