package com.learning.BitlyShortUrlWithSpringMVC.dao;

import com.learning.BitlyShortUrlWithSpringMVC.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface UrlDb extends JpaRepository<Urls, String> {

    Optional<Urls> findByShortUrl(String shortUrl);

}
