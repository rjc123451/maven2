public class test {
    public static void main(String[] args) {
        Add s=new Add();/*实现两个数相加*/
        int sum;
        s.setA(5);
        s.setB(6);
        sum=s.add(s.getA(), s.getB());
        System.out.println(sum);
    }
}
