package com.florianhotze.langchain4j;

import dev.langchain4j.data.document.parser.apache.tika.ApacheTikaDocumentParser;
import io.quarkus.logging.Log;
import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;

import javax.xml.xpath.XPathFactory;

@Startup
@ApplicationScoped
public class Reproduce2209 {

    Reproduce2209() {
        ApacheTikaDocumentParser parser = new ApacheTikaDocumentParser();
        XPathFactory factory = XPathFactory.newInstance();
        Log.info(factory.toString());
    }

}
