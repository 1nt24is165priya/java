public class Bit_Manipulation{

    public static void Odd_Even(int n){
        int bitMask = 1;

        if((n&bitMask) == 0){
            System.out.println( n + " is even number");
        }

        else{
            System.out.println(n + " is odd number");
        }
    }

    public static int SetIthBit(int n, int i){
        int bitMask=1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int getIthBit(int n, int i){
        int bitMask=1<<i;
        
            return n|bitMask;
        
    }


    public static int clearIthBit(int n, int i){
        int bitMask=~(1<<i);
        
            return n&bitMask;
        
    }


public static int updateIthBit(int n, int i, int newBit){

// if(newBit==0){
//     return clearIthBit(n,i);
// }
// else{
//     return SetIthBit(n,i);
// }

int x= clearIthBit(n,i);
int BitMask = newBit<<i;
return x|BitMask;
}

public static int clear_LastIthBit(int n, int i){
    int BitMask = (~0<<i);
    return n&BitMask;
}


public static int clearRange_ofBits(int n, int i, int j){
    int a = ((~0) << (j+1));
    int b = (1<<i)-1;
    int bitMask = a|b;
    return n & bitMask;
}




    public static void main(String args[]){
        //XOR Operation
        System.out.println(~5);
        System.out.println(~0);

        //Binary left shift
        System.out.println(5<<2);
        System.out.println(4<<3);

        //Binary Right Shift
        System.out.println(6>>1);
        System.out.println(7>>2);

        Odd_Even(3);
        Odd_Even(4);
        Odd_Even(19);

        System.out.println(SetIthBit(14,2));
        System.out.println(getIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println("after updating " + updateIthBit(10,2,1));
        System.out.println("After clearing last bits:" + clear_LastIthBit(15,2));
        System.out.println(clearRange_ofBits(10,2,4));








    }
}