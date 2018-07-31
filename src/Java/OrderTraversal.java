//import java.util.Scanner;
//
//class Node3{
//    Node3 left,right;
//    int data;
//    Node3(int data){
//        this.data=data;
//        left=right=null;
//    }
//}
//
//
//
//
//    public class OrderTraversal {
//        static void levelOrder(Node3 root){
//            if (root == null){
//                System.out.print(root.data);
//            } else{
//                if (root.left.data != null){
//
//                }
//            }
//
//        }
//
//    public static Node3 insert(Node3 root,int data){
//        if(root==null){
//            return new Node3(data);
//        }
//        else{
//            Node3 cur;
//            if(data<=root.data){
//                cur=insert(root.left,data);
//                root.left=cur;
//            }
//            else{
//                cur=insert(root.right,data);
//                root.right=cur;
//            }
//            return root;
//        }
//    }
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt();
//        Node3 root=null;
//        while(T-->0){
//            int data=sc.nextInt();
//            root=insert(root,data);
//        }
//        levelOrder(root);
//    }
//}
//
