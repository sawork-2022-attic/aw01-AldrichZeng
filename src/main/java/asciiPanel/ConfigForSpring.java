package asciiPanel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigForSpring {


    @Bean
    public AsciiFont getAsciiFont(){
        return AsciiFont.CP437_8x8;
    }
    @Bean
    public AsciiPanel getAsciiPanel(){
        return new AsciiPanel();

    }


}
