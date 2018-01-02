import java.util.Scanner;

public class BinaryTreeDriver{
  public static void main(String[] args){
    int menuOption;
    BinarySearchTree tree = new BinarySearchTree();
    Scanner userInput = new Scanner(System.in);
    do{
      dispalyMenu();
      System.out.println("Please enter a menu choice: ");
      menuOption = userInput.nextInt();

      switch(menuOption){
        case 1:
          System.out.println("Please enter a value to be put in the tree: ");
          tree.insertNode(userInput.nextInt());
          break;

        case 2:
          System.out.println("Please enter the value to search for: ");
          System.out.println(tree.findValue(userInput.nextInt()));
          break;

        case 3:
          System.out.println("Exiting!");
          break;

        case 4:
          try{
            Runtime.getRuntime().exec("clear");
          }catch(Exception e){
            System.out.println("Error clearing screen!");
            //System.out.println("\n\n\n\n\n\n\n\n");
          }
          tree.printTree();
          System.out.print("\n\nPress any key to continue.");
          userInput.nextLine();
          break;
      }

    }while(menuOption != 3);
  }

  public static void dispalyMenu(){
    System.out.println("1. Insert a value\n2. Find a value\n3. Exit\n4. Print Tree\n\n");
  }
}
