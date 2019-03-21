package xinshoucun;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch2P1422 {
	/**
	 * 试炼场 - 新手村 - 洛谷的第一个任务 关卡1-2，1/4 道题 P1422 小玉家的电费
	 * 题目描述
          夏天到了，各家各户的用电量都增加了许多，相应的电费也交的更多了。
          小玉家今天收到了一份电费通知单。小玉看到上面写：
          据闽价电[2006]27号规定，月用电量在150千瓦时及以下部分按每千瓦时0.4463元执行，
          月用电量在151~400千瓦时的部分按每千瓦时0.4663元执行，
          月用电量在401千瓦时及以上部分按每千瓦时0.5663元执行;小玉想自己验证一下，
          电费通知单上应交电费的数目到底是否正确呢。
          请编写一个程序，已知用电总计，根据电价规定，计算出应交的电费应该是多少。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter:");
		Scanner sc = new Scanner(System.in); //开启输入
        double electricCharge = 0;  //
        int n = sc.nextInt();
        if (n <= 150)
            electricCharge += n * 0.4463;
        else

        {
            n -= 150;
            electricCharge += 150 * 0.4463;
            if (n <= 250)
                electricCharge += n * 0.4663;
            else
            {
                n -= 250;
                electricCharge += 250 * 0.4663;
                electricCharge += n * 0.5663;
            }
        }
        DecimalFormat df = new DecimalFormat(".0");
        System.out.println(df.format(electricCharge));
        sc.close();
        return;
	}
}
