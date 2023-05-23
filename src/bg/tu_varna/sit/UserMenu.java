package bg.tu_varna.sit;

import java.util.Scanner;

public class UserMenu {
    private ImageEditor imageEditor;

    public UserMenu() {
        imageEditor = new ImageEditor();
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.print("Enter a command: ");
            command = scanner.nextLine();

            String[] commandParts = command.split(" ");
            String operation = commandParts[0];

            if ("open".equals(operation)) {
                if (commandParts.length >= 2) {
                    String filePath = commandParts[1];
                    imageEditor.openImage(filePath);
                } else {
                    System.out.println("Invalid command. Usage: open <file>");
                }
            } else if ("close".equals(operation)) {
                imageEditor.closeImage();
            } else if ("save".equals(operation)) {
                imageEditor.saveImage();
            } else if ("grayscale".equals(operation)) {
                imageEditor.applyGrayscaleTransformation();
            } else if ("exit".equals(operation)) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid command.");
            }
        } while (!command.equals("exit"));
    }

    // Допълнителни методи...
}

