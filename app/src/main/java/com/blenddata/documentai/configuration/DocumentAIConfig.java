package com.blenddata.documentai.configuration;


import org.springframework.context.annotation.Configuration;

@Configuration
public class DocumentAIConfig {

  /*  @Value("${google.cloud.credentials.file-path}")
    private String credentialsFilePath;

    @Bean
    public DocumentUnderstandingServiceClient documentUnderstandingServiceClient() throws IOException {
        Credentials credentials = GoogleCredentials.fromStream(new FileInputStream(credentialsFilePath));
        return DocumentUnderstandingServiceClient.create();
    }*/
}
