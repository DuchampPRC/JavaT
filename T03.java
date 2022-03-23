package com.nufe.jsvs;

/**
 * @author DUCHAMP
 */
public class T03 {
    public static void main(String[] args) {
        boolean[] a = new boolean[101];
        int[] b = new int[101];
        int[] c = new int[101];
        Num.num(b, c);


        for (int i : c) {
            if (i > 1 && i != 0&&i<=100) {
                //System.out.println(i);
                for (int j = 2; j <=100; j++) {
                    if (j % i == 0 & j != i) {
                        //System.out.println(j);//筛选出倍数
                        a[j] = true;
                    }
                }
            }
        }

        int x=0;
        for(boolean q:a){
            //System.out.println(q);
            if(!q&&x>1) {
                System.out.println(x);
            }
            x++;
        }
    }
}


class Num {
    public static void num(int[] aa,int [] b) {
        int k=2,t=0;
        while(t<101)
        {
            for(int i=1; i<aa.length; i++) //将不是素数的数筛出
            {
                if(i%k==0&&i!=k) aa[i]=1;
            }
            for(int i=1; i<aa.length; i++) //将筛选后的第一个数当做新的筛子
            {
                if(i>k&&aa[i]==0)
                {
                    k=i;
                    break;
                }
            }
            t++;
        }
        for(int i=1,j=0; i<aa.length; i++)
            if(aa[i]==0){
                b[j]=i;
                j++;//筛法完成
            }
    }
}