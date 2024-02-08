package com.blenddata.documentai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Deque;
import java.util.LinkedList;

public class DocumentAIExample {
    private static final Logger logger = LoggerFactory.getLogger(DocumentAIExample.class);


    // 1. Pre-processing Documents
    public static void preProcessDocuments() {
        // Detect image quality issues and deskew scanned documents here.
        logger.info("Pre-processing Documents");
    }

    // 2. Text Extraction and Layout Analysis
    public static void textExtractionAndLayoutAnalysis() {
        // Extract text content from various document formats (e.g., PDFs).
        // Understand the layout structure (fonts, paragraphs, tables, etc.).
        logger.info("Text Extraction and Layout Analysis");
    }

    // 3. Key-Value Pair Extraction
    public static void keyValueExtraction() {
        // Identify and extract key-value pairs from structured forms within documents.
        // Useful for capturing specific data points (e.g., invoice numbers, dates, amounts).
        logger.info("Key-Value Pair Extraction");
    }

    // 4. Document Splitting and Classification
    public static void documentSplittingAndClassification() {
        // Automatically split large documents into smaller sections based on content or type.
        // Classify documents into categories (e.g., contracts, invoices, reports).
        logger.info("Document Splitting and Classification");
    }

    // 5. Entity Extraction and Normalization
    public static void entityExtractionAndNormalization() {
        // Extract entities (names, dates, organizations) from documents.
        // Normalize extracted data for consistency and standardization.
        logger.info("Entity Extraction and Normalization");
    }

    // 6. Document Labeling and Review
    public static void documentLabelingAndReview() {
        // Annotate documents with labels or tags for further analysis.
        // Facilitate manual review and validation of extracted information.
        logger.info("Document Labeling and Review");
    }

    // Example: Using a LinkedList to store document metadata
    public static void printDocumentMetadata() {
        Deque<String> documentMetadata = new LinkedList<>();
        documentMetadata.add("Document123");
        documentMetadata.add("Invoice");
        documentMetadata.add("2023-05-15");

        // Print the extracted metadata
        logger.info("Document Metadata:");
        for (String metadata : documentMetadata) {
            logger.info(metadata);
        }
    }

    // Method to execute all functionalities
    public static void main(String[] args) {
        DocumentAIExample documentAIExample = new DocumentAIExample();
        logger.info("Start of main");
        // Call methods based on the arguments passed
        for (String methodName : args) {
            switch (methodName) {
                case "preProcessDocuments":
                    documentAIExample.preProcessDocuments();
                    break;
                case "textExtractionAndLayoutAnalysis":
                    documentAIExample.textExtractionAndLayoutAnalysis();
                    break;
                case "keyValueExtraction":
                    documentAIExample.keyValueExtraction();
                    break;
                case "documentSplittingAndClassification":
                    documentAIExample.documentSplittingAndClassification();
                    break;
                case "entityExtractionAndNormalization":
                    documentAIExample.entityExtractionAndNormalization();
                    break;
                case "documentLabelingAndReview":
                    documentAIExample.documentLabelingAndReview();
                    break;
                case "printDocumentMetadata":
                    documentAIExample.printDocumentMetadata();
                    break;
                default:
                    logger.info("Method '" + methodName + "' not found.");
            }
        }
    }

}
