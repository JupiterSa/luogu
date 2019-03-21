package xinshoucun;

import java.util.Scanner;

public class Ch2P1909 {
	/** 知识点
	 * 1.Math.floor
       floor，英文原意：地板。 
       Math.floor 函数是求一个浮点数的地板，就是 向下 求一个最接近它的整数，它的值肯定会小于或等于这个浮点数。
       2.Math.ceil
       ceil，英文原意：天花板。 
       Math.ceil 函数执行的是 向上 取接近的整数，它返回的肯定会大于或等于函数参数。
       3.Math.rint
       Math.rint 函数返回最接近参数的整数，如果有2个数同样接近，则会返回偶数的那个。
       4.Math.round
       round 方法，我们通常会说这个方法表示”四舍五入”，但是当参数为负数时，就不太好理解。 
                 所以，以源码的计算方式来理解会比较准确。
                 即将原来的数字加上0.5后再向下取整。 
	 */
	
	/** 题干
	 * 试炼场 - 新手村 - 洛谷的第一个任务 关卡1-2，4/4 道题 P1909 买铅笔
	 *  题目描述
	  P老师需要去商店买n支铅笔作为小朋友们参加NOIP的礼物。
	    她发现商店一共有 333种包装的铅笔，不同包装内的铅笔数量有可能不同，
	    价格也有可能不同。为了公平起 见，P老师决定只买同一种包装的铅笔。
	    商店不允许将铅笔的包装拆开，因此P老师可能需要购买超过nnn支铅笔才够给小朋 友们发礼物。
	    现在P老师想知道，在商店每种包装的数量都足够的情况下，要买够至少nnn支铅笔最少需要花费多少钱。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("LuoGu");
		int n,a,b,price;//n需要购买的铅笔数量，a包装数，b价格,price总价格
		int[] arrayPen = new int[3];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		//循环获得三种组合的购买价格
		for(int i = 0;i < 3;i++){
		    a = sc.nextInt();
            b = sc.nextInt();
            price = b * ((int)Math.floor(n/a) +1);
		    arrayPen[i] = price;
		}
		//排序数组中的价格并输出最小的一个
		int min = arrayPen[0];  
		int temp = 0;
		for(int j = 0;j < 3;j++){
		    temp = arrayPen[j]; //每个价格放入临时变量
		    if(temp < min){     //将最小数一直更替变换,直到找到最小的一个
		        min = temp;
		    }
		}
		System.out.println(min);
		sc.close();
		return ;
	}
}
