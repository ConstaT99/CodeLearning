package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyBinaryNode {
    int val;
    MyBinaryNode left;
    MyBinaryNode right;
    public MyBinaryNode(){}
    public MyBinaryNode(int val){
        this.val = val;
    }
    public MyBinaryNode(int val, MyBinaryNode left, MyBinaryNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public void DFS(MyBinaryNode root){//
        if(root == null){
            return;
        }
        // preorder process
        if(root.left != null){
            DFS(root.left);
        }
        // inorder process
        if(root.right != null){
            DFS(root.right);
        }
        // post order
    }
    public void DFS_Iter(MyBinaryNode root){
        if(root == null){
            return;
        }
        Stack<MyBinaryNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        while (!nodeStack.isEmpty()){
            MyBinaryNode node = nodeStack.pop();
            // process
            if(node.right != null){
                nodeStack.push(node);
            }
            if(node.left != null){
                nodeStack.push(node);
            }
        }
    }

    public void BFS(MyBinaryNode root){
        if(root == null) {
            return;
        }
        Queue<MyBinaryNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()){
            MyBinaryNode node = nodeQueue.poll();
            // process something
            if(node.left != null){
                nodeQueue.add(node.left);
            }
            if(node.right != null){
                nodeQueue.add(node.right);
            }
        }
    }
    public int getVal() {
        return val;
    }
}
