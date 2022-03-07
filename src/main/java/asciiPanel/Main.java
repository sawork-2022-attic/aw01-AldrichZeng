package asciiPanel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 以注解方式
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigForSpring.class);
        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);
//    assertEquals(asciiPanel.getAsciiFont(), AsciiFont.CP437_8x8);
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
        System.out.println(asciiPanel.getHeight());
        System.out.println(asciiPanel.getWidth());
        context.close();
    }
}
