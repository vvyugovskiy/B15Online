package practice;

import java.io.File;

public class GetFileExtensionTest {

    public static void main(String[] args) {

        String extension = getFileExtension(new File("C:/Users/FaRAoN/Desktop/INTERVIEW QUESTIONS.docx"));
        System.out.println("File extension :: " + extension);
        extension = getFileExtension(new File("C:/Users/FaRAoN/Desktop/Mentoring6_14.pptx"));
        System.out.println("File extension :: " + extension);
    }

    public static String getFileExtension(File file) {

        String extension = "";
        try {
            if (file != null && file.exists()) {
                String name = file.getName();
                extension = name.substring(name.lastIndexOf(".") + 1);
            }
        } catch (Exception e) {
            extension = "";
        }

        return extension;
    }
}
