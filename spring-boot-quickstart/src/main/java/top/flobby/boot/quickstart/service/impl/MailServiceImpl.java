package top.flobby.boot.quickstart.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import top.flobby.boot.quickstart.service.MailService;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Map;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/23
 * @description :
 */
@Service
@Slf4j
public class MailServiceImpl implements MailService {
    /**
     * 读入配置文件中的邮箱发送者设置
     */
    @Value("${spring.mail.username}")
    private String from;
    @Resource
    private JavaMailSender mailSender;

    @Override
    public void sendSimpleTextMail(String to, String subject, String content){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        message.setFrom(from);
        mailSender.send(message);
        log.info("文本邮件发送成功！ to={}", to);
    }

    @Override
    public void sendHtmlTextMail(String to, String subject, String content) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, true);
        mimeMessageHelper.setTo(to);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(content, true);
        mimeMessageHelper.setFrom(from);
        mailSender.send(message);
        log.info("html文本邮件发送成功！ to={}", to);
    }

    @Override
    public void sendAttachmentTextMail(String to, String subject, String content, String... fileArr) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, true);
        mimeMessageHelper.setTo(to);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(content, true);
        mimeMessageHelper.setFrom(from);
//        添加附件
        for (String filePath : fileArr) {
            FileSystemResource fileSystemResource = new FileSystemResource(new File(filePath));
            if (fileSystemResource.exists()) {
                String fileName = fileSystemResource.getFilename();
                assert fileName != null;
                mimeMessageHelper.addAttachment(fileName, fileSystemResource);
            }
        }
        mailSender.send(message);
        log.info("附件邮件发送成功！ to={}", to);
    }

    @Override
    public void sendImgMail(String to, String subject, String content, Map<String, String> imgMap) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, true);
        mimeMessageHelper.setTo(to);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(content, true);
        mimeMessageHelper.setFrom(from);
        // 添加图片
        for (Map.Entry<String, String> entry : imgMap.entrySet()) {
            FileSystemResource fileResource = new FileSystemResource(new File(entry.getValue()));
            if (fileResource.exists()) {
                mimeMessageHelper.addInline(entry.getKey(), fileResource);
            }
        }
        mailSender.send(message);
        log.info("图片邮件发送成功！ to={}", to);

    }
}
