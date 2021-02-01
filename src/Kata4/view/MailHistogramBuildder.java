package Kata4.view;


import Kata4.model.Histogram;
import Kata4.model.Mail;

import java.util.List;

public class MailHistogramBuildder {

    public static Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram<>();

        for (Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }

        return histogram;
    }

}

