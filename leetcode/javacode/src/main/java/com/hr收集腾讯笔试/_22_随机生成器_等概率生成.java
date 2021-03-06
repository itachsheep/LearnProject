package com.hr收集腾讯笔试;

public class _22_随机生成器_等概率生成 {

    /**
     * https://www.cnblogs.com/lfri/p/12427656.html
     *
     * 问题一：有一个随机数生成器，能以p概率生成0，1-p概率生成1。利用这个生成器等概率生成0-6。
     *
     *
     * 让该随机数生成器生成两个数，那么序列是00,01,10,11
     *  概率分别为 p*p,p(1-p),(1-p)p,(1-p)*(1-p)
     *  这四种情况中存在两个独立的事件概率是相等。也就是01和10，
     *  那么我把01看成是0,10看成是1，那么他们输出的概率均为p(1-p)，
     *  其他的情况舍弃。这样就得到了0和1均等生成的随机器了。
     *
     *  例如n=3,让该随机数生成器生成3个数，有8中情况000,001,010,011,100,101,110,111，
     *  其中001,010,100的概率都是p^2*(1-p)。
     *
     *  这种解法可以推广到n个数的情况，我们知道，取n个随机数发生器，
     *  存在n个概率相同的独立事件，我们只使用这n个事件就得到1/n的概率了。
     *
     */

    /**
     *
     *问题二：已知有个rand7()的函数，返回1到7随机自然数，
     * 让利用这个rand7()构造rand10() 随机1~10。
     *
     * 如果能够得到一组等概率的数，不管是什么数，只要等概率而且个数大于10，那么问题就可以解决了。
     *
     * 发现(rand7()-1)*7+rand7(),可以等概率的生成1到49。
     *
     * 呵呵，这不就得了，只要把11-49砍掉就可以了。不过这样的效率比较低。
     * 可以砍掉41-49，然后在把1-40映射到1-10（例如模10），那么问题也就解决了。
     *
     *
     *
     */

    /**
     *
     * 问题三：调用RANDOM(0, 1)实现RANDOM(a, b)
     *
     * 解决方案：这里的RANDOM(0, 1)是指等概率产生0或1，
     * 显然，RANDOM(a, b) = a + RANDOM(0, b-a)
     */
}
