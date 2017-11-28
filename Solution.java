/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 吉彬
 */
public class Solution {
    /*
    问题：
    大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
    */
    
    /*
    解决思路：
    递归实现不用说，说说非递归实现。
    当n为0或1时，其结果与n相同；
    当n大于1时，定义三个变量，pre记住f(1)，prepre记住f(0)，sum初始化为0；
    循环从2开始，直到等于n时结束，sum=pre+prepre;
    然后将pre和prepre向前移动，prepre指向pre，pre指向sum，直到循环结束，
    最后返回sum。
    */
        /*递归实现
    public int Fibonacci(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    */
    //非递归实现
    public int Fibonacci(int n) {
        if(n<2&&n>=0)
            return n;
        int pre = 1;
        int prepre = 0;
        int sum = 0;
        for(int i=2;i<=n;++i){
            sum = pre+prepre;
            prepre = pre;
            pre = sum;
        }
        return sum;
    }
}
