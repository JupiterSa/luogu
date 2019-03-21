package xinshoucun;

import java.util.Scanner;

public class Ch2P1089 {
	/**
	 * 试炼场 - 新手村 - 洛谷的第一个任务 关卡1-2，3/4 道题 P1089 津津的储蓄计划
	 * 题目描述
          津津的零花钱一直都是自己管理。
          每个月的月初妈妈给津津300300300元钱，津津会预算这个月的花销，并且总能做到实际花销和预算的相同。
	为了让津津学习如何储蓄，妈妈提出，津津可以随时把整百的钱存在她那里，到了年末她会加上20%20\%20%还给津津。
	因此津津制定了一个储蓄计划：每个月的月初，在得到妈妈给的零花钱后，
	如果她预计到这个月的月末手中还会有多于100100100元或恰好100100100元，
	她就会把整百的钱存在妈妈那里，剩余的钱留在自己手中。
	例如111111月初津津手中还有838383元，妈妈给了津津300300300元。
	津津预计111111月的花销是180180180元，那么她就会在妈妈那里存200200200元，
	自己留下183183183元。到了111111月月末，津津手中会剩下333元钱。
	津津发现这个储蓄计划的主要风险是，存在妈妈那里的钱在年末之前不能取出。
	有可能在某个月的月初，津津手中的钱加上这个月妈妈给的钱，不够这个月的原定预算。
	如果出现这种情况，津津将不得不在这个月省吃俭用，压缩预算。
	现在请你根据2004年1月到12月每个月津津的预算，判断会不会出现这种情况。
	如果不会，计算到2004年年末，妈妈将津津平常存的钱加上20％还给津津之后，津津手中会有多少钱。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("LuoGu");
		int INCOME=300;
		int budget,i,b,d; //budget:每月收到的预算;i月份
		int deposit = 0;  //jj在妈妈那里的储蓄总额
		int balance = 0;  //jj手里的余额
		Scanner sc = new Scanner(System.in);
		for(i=1;i<=12;i++){
		    budget = sc.nextInt(); //接受预算，赋给预算变量参数
		    balance = balance + INCOME - budget;//计算该月的余额=上个月余额+300-该月预算
		    if(balance < 0){
		    	System.out.println(-i);
		    	sc.close();
		    	return;
		    }
		    //该月预算充足，开始计算存钱和新的余额
		    b = balance/100;
		    balance = balance - b*100;//新的余额
		    deposit = deposit + b;//新的存款，累计
		}
		d = deposit*120 + balance;
		System.out.println(d);	
		sc.close();
		return;
	}
}
