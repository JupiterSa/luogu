package xinshoucun;

import java.util.Scanner;

public class Ch2P1085 {
	/**
	 * 试炼场 - 新手村 - 洛谷的第一个任务 关卡1-2，2/4 道题 P1085 不高兴的津津
	 * 题目描述
          津津上初中了。妈妈认为津津应该更加用功学习，所以津津除了上学之外，还要参加妈妈为她报名的各科复习班。
          另外每周妈妈还会送她去学习朗诵、舞蹈和钢琴。
          但是津津如果一天上课超过八个小时就会不高兴，而且上得越久就会越不高兴。
          假设津津不会因为其它事不高兴，并且她的不高兴不会持续到第二天。
          请你帮忙检查一下津津下周的日程安排，看看下周她会不会不高兴；如果会的话，哪天最不高兴。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("LuoGu");
		int a = 0,b = 0,sum = 0,max = 0,counter = 0,arrayDay = 0,i = 0; 
		//a,b为接受参数的变量，jj上课时间和妈妈让jj上课时间；sum每天上课总和；
        //max保存该周最高上课时间纪录；arrayday该周上课时间最多那天的日期；
        //counter纪录上课超过的天数变量
		//System.out.print("输入");
		Scanner sc = new Scanner(System.in);
        for(i=1;i<=7;i++){                             //一周七天，循环处理
    	   a = sc.nextInt();                           	//接受参数
    	   b = sc.nextInt();
    	   sum=a+b;                                    //获取该天的上课时间总和
    	   if(sum>8){                                  //第一层IF，如果改天上课时间>8，进行下一步处理
    		   counter=counter+1;                      //超过的天数增加1
    		   if(max<sum){                            //第二层IF，如果这一天的sum，比最高纪录大
    			   max=sum;                            //则替换max最高纪录
    			   arrayDay=i;                         //替换最高纪录天数
    		   }
    	   }
         }
         if(counter==0){
    	     System.out.print(0);
         }else{
    	   System.out.print(arrayDay);
         }
         sc.close();
         return;
	}
}
