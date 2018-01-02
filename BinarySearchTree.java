public class BinarySearchTree{
  private TreeNode root;

  BinarySearchTree(){
    this.root = null;
  }

  public void insertNode(int valueToInsert){
    boolean nodeInserted = false;
    TreeNode rootNode = this.root;

    if(findValue(valueToInsert)) //If the value already exists in the tree, don't add it again
      return;

    if(rootNode == null){
      this.root = new TreeNode(valueToInsert);
      return;
    }

    do{
      if(valueToInsert < rootNode.getValue()){
        if(rootNode.getLeftChild() == null){
          rootNode.setLeftChild(new TreeNode(valueToInsert));
          nodeInserted = true;
        }else{
          rootNode = rootNode.getLeftChild();
        }
      }else if(valueToInsert > rootNode.getValue()){
        if(rootNode.getRightChild() == null){
          rootNode.setRightChild(new TreeNode(valueToInsert));
          nodeInserted = true;
        }else{
          rootNode = rootNode.getRightChild();
        }
      }
    }while(!nodeInserted);
  }

  public boolean findValue(int valueToFind){
    TreeNode rootNode = this.root;

    do{
      if(valueToFind == rootNode.getValue()){
        return true;
      }else if(valueToFind < rootNode.getValue()){
        rootNode = rootNode.getLeftChild();
      }else if(valueToFind > rootNode.getValue()){
        rootNode = rootNode.getRightChild();
      }
    }while(rootNode != null);
    return false;
  }

  public void printTree(){
    TreeNode currentNode;
    SimpleQueue<TreeNode> printList = new SimpleQueue<TreeNode>();
    printList.add(this.root);
    while(printList.hasNext()){

      currentNode = printList.remove();

      System.out.print(currentNode.getValue() + " ");

      if(currentNode.getLeftChild() != null)
        printList.add(currentNode.getLeftChild());
      if(currentNode.getRightChild() != null)
        printList.add(currentNode.getRightChild());
    }
  }
}
