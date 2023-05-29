package com.learning.BitlyShortUrlWithSpringMVC.service;

import com.learning.BitlyShortUrlWithSpringMVC.dao.*;
import com.learning.BitlyShortUrlWithSpringMVC.model.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class UrlService {

    @Autowired
    UrlDb db;

    public String generateUrl(String url) {
        String charsSeq =url.replaceAll("[^a-zA-Z0-9]", "");
        final String prefix="http://bit.ly/";
        String surl;

        int urlSize=10;
        int index;
        char urlChar;
        int count=0;

        // Check if it already exists in database
        if(db.findById(url).isPresent()){
            surl =db.findById(url).get().getShortUrl();
            return prefix + surl;
        }

        Random random = new Random();
        StringBuilder sb;

        do {
            if(count == Math.pow(charsSeq.length(), urlSize)){
                surl="Reached the maximum combinations of url generation";
                return surl;
            }
            sb = new StringBuilder();
            for(int i=1; i<=urlSize; i++){
                index = random.nextInt(charsSeq.length());
                urlChar = charsSeq.charAt(index);
                sb.append(urlChar);
            }
            surl = sb.toString();
            count++;
        } while(db.findByShortUrl(surl).isPresent());

        db.save(new Urls(url, surl));

        return prefix + surl;
    }
}
