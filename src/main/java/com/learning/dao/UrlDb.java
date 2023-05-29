package com.learning.dao;

import com.learning.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface UrlDb extends JpaRepository<Urls, String> {

    Optional<Urls> findByShortUrl(String shortUrl);

}
