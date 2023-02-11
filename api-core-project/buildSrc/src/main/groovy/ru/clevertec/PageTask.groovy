package ru.clevertec

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class PageTask extends DefaultTask {
    private static final String url = "https://clevertec.ru/study/backend.html";
    private static final String endpointExtractionRegex = '"https://([^"]+)'
    @TaskAction
    def page() {
        def urlConn = new URL(url).openConnection();
        def responseCode = urlConn.getResponseCode();
        println('Response code is ' + responseCode);
        if (responseCode.equals(200)) {
            println('Here all links from page')
            print(urlConn.getInputStream().getText().findAll(endpointExtractionRegex));
        }

    }
}
