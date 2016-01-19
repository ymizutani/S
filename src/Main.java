
class Main{
    static SExpr sexpr(int i){
        return SExpr.atom(i);
    }

    public static void main(String[] args){
        System.out.println("Main...");

        SExpr a = SExpr.atom(3.14);
        System.out.println("a = " + a.toString());

        SExpr b = SExpr.nil();
        System.out.println("b = " + b.toString());

        SExpr c = a.cons(b);
        System.out.println("c = " + c.toString());

        SExpr d = c.cons(c);
        System.out.println("d = " + d.toString());

        SExpr e = sexpr(10).cons(d);
        System.out.println("e = " + e);


        return;
    }

}
