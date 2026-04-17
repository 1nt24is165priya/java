public class Hallow_Rectangle{

    public static void  Hallow_Rectangle(int totalrows,int totalcol){
        for(int i=1;i<=totalrows;i++){
            for(int j=1;j<=totalcol;j++){
                if(i==1 || i==totalrows || j == 1 || j==totalcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Hallow_Rectangle(8,5);
    }
}