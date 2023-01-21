import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Register;
import entities.User;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.next();
        File file = new File(filePath);
        Set<Register> registerSet = requestRegisterSet(file);
        System.out.println("Registers: ");
        for (Register register : registerSet) {
            System.out.println(register);
        }
        System.out.println("Total Users: " + registerSet.size());
        scanner.close();
    }

    public static Set<Register> requestRegisterSet(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            Set<Register> registerSet = new HashSet<>();
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                String[] fieldsFromCurrentLine = currentLine.split(" ");
                User user = new User(fieldsFromCurrentLine[0]);
                LocalDateTime date = LocalDateTime.parse(fieldsFromCurrentLine[1]);
                Register register = new Register(user, date);
                registerSet.add(register);
                currentLine = bufferedReader.readLine();
            }
            return registerSet;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    } 
}
