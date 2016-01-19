/**
* 整数アトムを表すクラス
*/
class IntAtom extends Atom {
    private int i;

    public IntAtom(int i){
        this.i = i;
    }

    public IntAtom(){
        this(0);
    }

    final public boolean isIntAtom(){ return true; }

    final public boolean equals(SExpr s){
        if (s.isIntAtom()){
            return this.i == ((IntAtom)s).i;
        }
        return false;
    }

    public int getValue(){
        return i;
    }

    public String toString(){
        return String.valueOf(i);
    }
}
