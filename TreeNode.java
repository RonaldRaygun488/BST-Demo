public class TreeNode{
  private int value;
  private TreeNode leftChild;
  private TreeNode rightChild;

  TreeNode(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }

  public void setLeftChild(TreeNode leftNode){
    this.leftChild = leftNode;
  }

  public void setRightChild(TreeNode rightNode){
    this.rightChild = rightNode;
  }

  public TreeNode getLeftChild(){
    return this.leftChild;
  }

  public TreeNode getRightChild(){
    return this.rightChild;
  }
}
