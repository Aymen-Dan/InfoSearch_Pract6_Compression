import utils.CompressionUtils;
import utils.Dictionary;
import utils.InvertedFile;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        String resPath = "src/res";

        // Step 1: Create an instance of Dictionary
        Dictionary dictionary = new Dictionary(resPath);

        // Step 2: Create an instance of InvertedFile
        InvertedFile invertedFile = new InvertedFile("src/results/dictionary.txt", resPath);

        // Step 3: Compress the Dictionary using CompressionUtils
        String[] compressedDictionary = CompressionUtils.compressDictionary(dictionary.getVocab());

        // Step 4: Save the compressed dictionary to a file
        CompressionUtils.saveCompressedVocabularyToFile(compressedDictionary);

        // Step 5: Read compressed dictionary
        String[] readCompressedDictionary = CompressionUtils.readCompressedVocabularyFromFile();

        // Step 6: Decompress the dictionary
        String[] decompressedDictionary = CompressionUtils.decompressDictionaryArray(readCompressedDictionary);

        // Print the array
        printArray(dictionary.getVocab());
        System.out.println("\n\n");
        System.out.println(decompressedDictionary);

       /* // Check if the decompressed dictionary matches the original
        boolean dictionaryMatch = checkArraysEqual(dictionary.getVocab(), decompressedDictionary);
        System.out.println("Dictionary Compression/Decompression Match: " + dictionaryMatch);

        // Step 7: Compress the Inverted File using CompressionUtils
        byte[] compressedInvertedFile = CompressionUtils.compressInvertedFile(getDocumentIds(invertedFile.documents));

        // Step 8: Save the compressed inverted file to a file
        CompressionUtils.saveCompressedInvertedFileToFile(compressedInvertedFile, "src/results/Compressed_Inverted_File.dat");

        // Step 9: Read compressed inverted file
        byte[] readCompressedInvertedFile = CompressionUtils.readCompressedInvertedFileFromFile("src/results/Compressed_Inverted_File.dat");

        // Step 10: Decompress the inverted file
        List<Integer> decompressedInvertedFile = CompressionUtils.decompressInvertedFile(readCompressedInvertedFile);

        // Check if the decompressed inverted file matches the original
        boolean invertedFileMatch = checkListsEqual(getDocumentIds(invertedFile.documents), decompressedInvertedFile);
        System.out.println("Inverted File Compression/Decompression Match: " + invertedFileMatch);*/
    }


    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    // Helper method to get documents from a folder
    private static List<String> getDocumentsFromFolder(String folderPath) {
        // Your logic to read and return documents from the specified folder
        // For demonstration purposes, return an empty list
        return new ArrayList<>();
    }

    // Helper method to get document IDs from a list of documents
    private static List<Integer> getDocumentIds(List<String> documents) {
        // Your logic to generate and return document IDs
        // For demonstration purposes, return an empty list
        return new ArrayList<>();
    }

    // Helper method to check if two arrays are equal
    private static boolean checkArraysEqual(String[] arr1, String[] arr2) {
        return java.util.Arrays.equals(arr1, arr2);
    }

    // Helper method to check if two lists are equal
    private static <T> boolean checkListsEqual(List<T> list1, List<T> list2) {
        return list1.equals(list2);
    }
}