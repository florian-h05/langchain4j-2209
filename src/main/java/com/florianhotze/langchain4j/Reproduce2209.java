package com.florianhotze.langchain4j;

import io.quarkus.logging.Log;
import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;

import javax.xml.xpath.XPathFactory;

@Startup
@ApplicationScoped
public class Reproduce2209 {

    Reproduce2209() {
        XPathFactory factory = XPathFactory.newInstance();
        Log.info(factory.toString());
    }

}
