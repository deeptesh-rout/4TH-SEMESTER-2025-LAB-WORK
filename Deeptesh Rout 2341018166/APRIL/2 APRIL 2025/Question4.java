/*Design a Java program to manage country data using a binary search tree (BST). 
Create a class Country with members for name and population, along with a 
constructor and necessary methods. Define a class BNode to store a Country object and 
maintain references to its left and right children. Implement a class BSTCountry with 
a root node, a constructor, and a method to insert countries into the tree based on their 
population. Extend the BST by adding methods for in-order traversal, finding the 
country with the maximum population (findMax), and finding the country with the 
minimum population (findMin). Finally, develop a main method to create a BST, 
insert country nodes, and invoke these methods to display the results.  */


class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{name='" + name + "', population=" + population + "}";
    }
}

class BNode {
    Country country; 
    BNode left, right; 

    public BNode(Country country) {
        this.country = country;
        left = right = null;
    }
}

class BSTCountry {
    BNode rootNode;

    public BSTCountry() {
        rootNode = null;
    }

    public void insert(Country country) {
        rootNode = insertRec(rootNode, country);
    }

    private BNode insertRec(BNode root, Country country) {
        if (root == null) {
            return new BNode(country); 
        }
        if (country.population < root.country.population) {
            root.left = insertRec(root.left, country); 
        } else if (country.population > root.country.population) {
            root.right = insertRec(root.right, country); 
        }
        return root; 
    }

    public void inOrderTraversal(BNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.country);
            inOrderTraversal(node.right);
        }
    }

    public Country findMax() {
        if (rootNode == null) {
            return null; 
        }
        BNode current = rootNode;
        while (current.right != null) { 
            current = current.right;
        }
        return current.country; 
    }

    public Country findMin() {
        if (rootNode == null) {
            return null; 
        }
        BNode current = rootNode;
        while (current.left != null) { 
            current = current.left;
        }
        return current.country; 
    }
}

public class Question4 {
    public static void main(String[] args) {
        BSTCountry tree = new BSTCountry();

        tree.insert(new Country("India", 1400000000));
        tree.insert(new Country("USA", 331000000));
        tree.insert(new Country("China", 1440000000));
        tree.insert(new Country("Japan", 126000000));
        tree.insert(new Country("Germany", 83000000));

        System.out.println("In-order Traversal of Countries:");
        tree.inOrderTraversal(tree.rootNode);

        System.out.println("\nCountry with Maximum Population:");
        System.out.println(tree.findMax());

        System.out.println("\nCountry with Minimum Population:");
        System.out.println(tree.findMin());
    }
}



