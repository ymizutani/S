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

    public String toString(){
        return String.valueOf(i);
    }
}
