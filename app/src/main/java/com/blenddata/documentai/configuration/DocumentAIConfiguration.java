package com.blenddata.documentai.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DocumentAIConfiguration {

   /* @Bean
    public DocumentUnderstandingServiceSettings documentUnderstandingServiceSettings() throws IOException {
        // Load the credentials file
        ClassPathResource resource = new ClassPathResource("your-credentials-file.json");
        GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream(resource.getFile()));

        // Create and return Document AI settings
        return DocumentUnderstandingServiceSettings.newBuilder()
                .setCredentialsProvider(() -> credentials)
                .build();
    }*/
}
