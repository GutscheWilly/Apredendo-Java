import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer stackSize = scanner.nextInt();

        while (stackSize != 0) {
            gameMatch(stackSize);
            stackSize = scanner.nextInt();
        }

        scanner.close();
    }

    public static void gameMatch(Integer stackSize) {
        Stack stack = requestStack(stackSize);
        List<Node> discartedNodes = new ArrayList<>();

        while (stack.getSize() > 1) {
            discartedNodes.add(operation(stack));
        }
        
        System.out.println("Discarted Nodes: " + discartedNodes.toString());
        System.out.println("Remaining card: " + stack.toString());
    }

    public static Stack requestStack(Integer size) {
        Stack stack = new Stack();

        for (int i = size ; i > 0 ; i--) {
            stack.push(new Node(i));
        }

        return stack;
    }

    public static Node operation(Stack stack) {
        Node removedNode = stack.pop();

        if (stack.getSize() > 1) {
            Node nodePlacedAtbase = stack.pop();
            stack.changeBase(nodePlacedAtbase);
        }

        return removedNode;
    }
}
