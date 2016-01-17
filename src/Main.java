
class Main{
    public static void main(String[] args){
        System.out.println("Main...");

        S a = S.atom(3.14);
        System.out.println("a = " + a.toString());

        S b = S.atom();
        System.out.println("b = " + b.toString());

        S c = a.cons(b);
        System.out.println("c = " + c.toString());

        S d = c.cons(c);
        System.out.println("d = " + d.toString());

        S e = S.atom(10).cons(d);
        System.out.println("e = " + e);

        return;
    }

}
