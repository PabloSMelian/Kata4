package Kata4.view;

import Kata4.model.Mail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MailListReader {

    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(new File(fileName)));
            while(true){
                String line = reader.readLine();
                if(line == null) break;

                if(Mail.isMail(line)){
                    list.add(new Mail(line));
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: File " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error: IO " + ex.getMessage());
        }
        return list;
    }

}