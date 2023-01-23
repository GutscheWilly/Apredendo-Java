import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) throws Exception {
        Map<String, Integer> voteMap = new HashMap<>();
        String filePath = "c:\\temp\\in.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                String[] currentLineSplited = currentLine.split(",");
                String candidateName = currentLineSplited[0];
                Integer quantityOfVotes = Integer.parseInt(currentLineSplited[1]);
                if (voteMap.containsKey(candidateName)) {
                    voteMap.put(candidateName, voteMap.get(candidateName) + quantityOfVotes);
                } else {
                    voteMap.put(candidateName, quantityOfVotes);
                }
                currentLine = bufferedReader.readLine();
            }
            for (String cantidateName : voteMap.keySet()) {
                System.out.println(cantidateName + ": " + voteMap.get(cantidateName));
            }
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
