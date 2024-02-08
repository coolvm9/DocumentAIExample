package com.blenddata.documentai.controller;
import com.blenddata.documentai.dto.DocumentProcessResponse;
import com.blenddata.documentai.dto.DocumentUploadResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/document")
public class DocumentAIController {

    private static final Logger logger = LoggerFactory.getLogger(DocumentAIController.class);

    @PostMapping("/upload")
    public ResponseEntity<DocumentUploadResponse> uploadDocument(@RequestParam("file") MultipartFile file) {
        try {
            // Check if the file is empty
            if (file.isEmpty()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(new DocumentUploadResponse(false, "Failed to upload document: File is empty"));
            }

            // Logic to handle the uploaded document
            // Here you can call methods from DocumentAIExample class
            // For example:
            // DocumentAIExample.preProcessDocuments();
            // DocumentAIExample.textExtractionAndLayoutAnalysis();
            // DocumentAIExample.keyValueExtraction();
            // DocumentAIExample.documentSplittingAndClassification();
            // DocumentAIExample.entityExtractionAndNormalization();
            // DocumentAIExample.documentLabelingAndReview();
            // DocumentAIExample.printDocumentMetadata();

            return ResponseEntity.ok(new DocumentUploadResponse(true, "Document uploaded successfully"));
        } catch (Exception e) {
            logger.error("Failed to upload document", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new DocumentUploadResponse(false, "Failed to upload document: " + e.getMessage()));
        }
    }

    @PostMapping("/key-value-extraction")
    public ResponseEntity<DocumentProcessResponse> keyValueExtraction(@RequestParam("file") MultipartFile file) {
        try {
            // Check if the file is empty
            if (file.isEmpty()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(new DocumentProcessResponse(false, "Failed to process document: File is empty"));
            }
            // Logic to handle the key-value extraction
            // For demonstration purposes, we're just returning a success response
            return ResponseEntity.ok(new DocumentProcessResponse(true, "Key-value extraction completed successfully"));
        } catch (Exception e) {
            logger.error("Failed to process document", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new DocumentProcessResponse(false, "Failed to process document: " + e.getMessage()));
        }
    }
}
