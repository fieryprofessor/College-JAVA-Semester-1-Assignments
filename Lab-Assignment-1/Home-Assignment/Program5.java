
public class Program5 {
  public static void main(String args[]){
    //with using temporary variables
    int W=2,G=3,K=4,A=5;
    System.out.println("Before swapping");
    System.out.println("W is= "+W+" ,G is= "+G+" ,K is= "+K+" and A is= "+A);
    int X,Y,Z;
    X=W;
    Y=A;
    Z=K;
    W=G;
    A=X;
    K=Y;
    G=Z;
    System.out.println("Before swapping");
    System.out.println("W is= "+W+" ,G is= "+G+" ,K is= "+K+" and A is= "+A);
  } 
}
