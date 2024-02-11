package com.blenddata.documentai.service;

import org.springframework.stereotype.Service;

@Service
public class DocumentAIService {

   /* public ProcessDocumentResponse processDocument(byte[] documentBytes) throws IOException {
        try (DocumentUnderstandingServiceClient client = DocumentUnderstandingServiceClient.create()) {
            // Construct the document
            ByteString content = ByteString.copyFrom(documentBytes);
            Document document = Document.newBuilder().setContent(content).build();

            // Process the document
            ProcessDocumentRequest request = ProcessDocumentRequest.newBuilder()
                    .setDocument(document)
                    .build();

            return client.processDocument(request);
        }
    }*/
}
