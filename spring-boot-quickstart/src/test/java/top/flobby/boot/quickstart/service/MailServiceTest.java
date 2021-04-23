package top.flobby.boot.quickstart.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@Slf4j
class MailServiceTest {
    @Resource
    private MailService mailService;

    @Test
    void send() {
        String to = "2541226493@qq.com";
        String subject = "springBoot发送文本邮件";
        String content = "<h3>第一封 springboot 邮件</h3>";
        mailService.sendSimpleTextMail(to, subject, content);
    }

    @Test
    void sendHtml() throws MessagingException {
        String to = "1549823458@qq.com";
        String subject = "springBoot发送文本邮件";
        String content = "<h3>第一封 springboot 邮件</h3>";
        mailService.sendHtmlTextMail(to, subject, content);
    }

    @Test
    void file() throws MessagingException {
        String to = "1549823458@qq.com";
        String subject = "springBoot发送文本邮件";
        String content = "<h3>第一封 springboot 邮件</h3>";
        String filePath = "pom.xml";
        mailService.sendAttachmentTextMail(to, subject, content, filePath);
    }

    @Test
    void img() throws MessagingException {
        String to = "1549823458@qq.com";
        String subject = "springBoot发送文本邮件";
        String content = "<h3>第一封 springboot 邮件</h3><br/><img src=\"cid:img01\" />";
        String imgPath = "1.jpg";
        Map<String, String> imgMap = new HashMap<>();
        imgMap.put("img01", imgPath);
        mailService.sendImgMail(to, subject, content, imgMap);
    }
}