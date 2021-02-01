package Kata4.main;


import Kata4.model.Histogram;
import Kata4.model.Mail;
import Kata4.view.HistogramDisplay;
import Kata4.view.MailHistogramBuildder;
import Kata4.view.MailListReader;

import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuildder.build(mailList);

        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM...", histogram);
        histogramDisplay.execute();

    }

}
