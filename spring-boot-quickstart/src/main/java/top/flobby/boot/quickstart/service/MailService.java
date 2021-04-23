package top.flobby.boot.quickstart.service;

import javax.mail.MessagingException;
import java.util.Map;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/23
 * @description :
 */

public interface MailService {
    /**
     * 发送简单文本邮件
     *
     * @param to to
     * @param subject subject
     * @param content content
     */
    void sendSimpleTextMail(String to, String subject, String content);

    /**
     * 发送html文本邮件
     *
     * @param to to
     * @param subject subject
     * @param content content
     * @throws MessagingException MessagingException
     */
    void sendHtmlTextMail(String to, String subject, String content) throws MessagingException;

    /**
     * 发送附件邮件
     *
     * @param to to
     * @param subject subject
     * @param content content
     * @param fileArr 文件
     * @throws MessagingException MessagingException
     */
    void sendAttachmentTextMail(String to, String subject, String content, String... fileArr) throws MessagingException;

    /**
     * 发送图片邮件
     * @param to to
     * @param subject subject
     * @param content content
     * @param imgMap img
     * @throws MessagingException MessagingException
     */
    void sendImgMail(String to, String subject, String content, Map<String, String> imgMap) throws MessagingException;
}
