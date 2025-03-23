package com.edu.unbosque.bosquecar.model.services.abc;

import jakarta.mail.MessagingException;

public interface IEmailService {
    void sendEmail(String to, String subject, String htmlContent) throws MessagingException;
    String loadHtmlTemplate(String filePath) throws Exception;
}
