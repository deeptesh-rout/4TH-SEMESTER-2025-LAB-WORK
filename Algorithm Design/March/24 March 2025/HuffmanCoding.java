import java.util.*;

// Node class for Huffman Tree
class Node {
    char character;
    int frequency;
    Node left, right;

    Node(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        left = right = null;
    }
}

public class HuffmanCoding {

    // Comparator for sorting nodes by frequency
    static class NodeComparator implements Comparator<Node> {
        public int compare(Node n1, Node n2) {
            return n1.frequency - n2.frequency;
        }
    }

    // Function to build the Huffman Tree and generate codes
    public static void buildHuffmanTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(new NodeComparator());

        // Step 1: Create a priority queue of nodes
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Step 2: Build the Huffman Tree
        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            Node internalNode = new Node('\0', left.frequency + right.frequency);
            internalNode.left = left;
            internalNode.right = right;
            priorityQueue.add(internalNode);
        }

        Node root = priorityQueue.poll();

        // Step 3: Generate Huffman Codes
        Map<Character, String> huffmanCodes = new HashMap<>();
        generateHuffmanCodes(root, "", huffmanCodes);

        // Print Huffman Codes
        System.out.println("Character Huffman Codes:");
        for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Recursive function to generate Huffman codes
    private static void generateHuffmanCodes(Node node, String code, Map<Character, String> huffmanCodes) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            huffmanCodes.put(node.character, code);
        }

        generateHuffmanCodes(node.left, code + '0', huffmanCodes);
        generateHuffmanCodes(node.right, code + '1', huffmanCodes);
    }

    public static void main(String[] args) {
        // Example input
        String text = "this is an example for huffman encoding";

        // Step 1: Calculate frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Build Huffman Tree and generate codes
        buildHuffmanTree(frequencyMap);
    }
}
