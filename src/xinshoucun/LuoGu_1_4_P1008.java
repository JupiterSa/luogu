package xinshoucun;

public class LuoGu_1_4_P1008 {  //public class Main 洛谷测试时改类的名称

    public static void main(String[] args) {
        //Scanner cin=new Scanner(System.in);
        //int a = cin.nextInt(), b = cin.nextInt();
        /*
           题干  
             1 2 3 4 5 6 7 8 9 九位数
                  组成abc:def:ghi=1:2:3 且这三个三位数的位数不能重复
           
           解题思路
                 这九个数，能组成的最小数是123，组成的最大数是987
            abc:def:ghi=1:2:3由此规定可得 当最大数是987时，abc应为329
                 所以abc的范围是123~329
           */
        int x = 0;
        int y = 0;
        int z = 0;//代表三个三位数， x:y:z = 1:2:3
        for(int i = 123;i <= 329;i++){
            x = i;
            y = 2*i;
            z = 3*i;
            if(isDuplicate(x,y,z)) {
                System.out.println(x +" "+ y +" "+ z);
            }
        }
    }

    private static  boolean isDuplicate(int x, int y, int z) {
        
        int[] anArray = new int[10];
        int[] anArray2 = new int[10];
//        int qian =input/1000; //千位除以1000
//      int bai = input/100%10;//百位除以100%10
//      int shi = input%100/10;//十位%100/10
//      int ge  = input%10;//个位直接%10
        anArray2[1] = x%10; //x个位数
        anArray2[2] = x%100/10; //x十位数
        anArray2[3] = x/100%10; //x百位数
        
        anArray2[4] = y%10; //y个位数
        anArray2[5] = y%100/10; //y十位数
        anArray2[6] = y/100%10; //y百位数
        
        anArray2[7] = z%10; //z个位数
        anArray2[8] = z%100/10; //z十位数
        anArray2[9] = z/100%10; //z百位数
        
        for(int i = 1; i <= 9; i++) {
            anArray[anArray2[i]] = anArray[anArray2[i]] + 1;
        }
        for(int i = 1; i <= 9; i++) {
            if(anArray[i] >= 2 || anArray[i] == 0) {
               return false;
            }
        }
        return true;        
    }
}
