package Tree;

public class BinaryTree {
    private MyBinaryNode root;
    public BinaryTree(){
        // BST tree constructor
    }
    public MyBinaryNode getRoot(){
        return root;
    }
    public void insert(int val){
        this.root = addRecursive(this.root,val);
    }
    private MyBinaryNode addRecursive(MyBinaryNode root, int val){
        if (root == null){
            return new MyBinaryNode(val);
        }
        if(val < root.val){
            root.left = addRecursive(root.left, val);
        }else if (val == root.val){
            return root;
        }else {
            root.right = addRecursive(root.right, val);
        }
        return root;
    }

    public void remove(int key){
        this.root = deleteRecursive(this.root, key);
    }
    private MyBinaryNode deleteRecursive(MyBinaryNode root, int key){
        if(root == null){
            return null;
        }
        if(root.val == key){
            // no child
            if(root.right == null && root.left == null){
                return null;
            }
            // have one child
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            // have two child
            MyBinaryNode temp = findSmallestNode(root.right);
            root.val = temp.val;
            root.right = deleteRecursive(root.right, temp.val);

        }else if (key < root.val){
            root.left = deleteRecursive(root.left,key);
        }else{
            root.right = deleteRecursive(root.right,key);
        }
        return root;
    }

    public MyBinaryNode findSmallestNode(MyBinaryNode root){
        return root.left == null ? root : findSmallestNode(root.left);
    }

    public void print(){

    }// bfs

    public boolean contains(int key){
        return findRecursive(this.root,key);
    }
    private boolean findRecursive(MyBinaryNode root, int key){
        if(root == null){
            return false;
        }
        if(root.val == key){
            return true;
        }
        return key > root.val ? findRecursive(root.right,key) : findRecursive(root.left,key);
    }
    public void preorderTraversal(){
        DFS(this.root);
    }
    private void DFS(MyBinaryNode root){//
        if(root == null){
            return;
        }
        System.out.println(root.val);
        if(root.left != null){
            DFS(root.left);
        }
        // inorder process
        if(root.right != null){
            DFS(root.right);
        }
        // post order
    }

    public static void main(String[] args) {
        BinaryTree myBST = new BinaryTree();
        myBST.insert(7);
        myBST.insert(5);
        myBST.insert(6);
        myBST.insert(10);
        myBST.insert(3);
        myBST.insert(8);
        myBST.insert(9);
        System.out.println(myBST.contains(5));
        myBST.preorderTraversal();
    }
}
