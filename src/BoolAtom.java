/**
* 真偽値を表すクラス
*/
class BoolAtom extends Atom {
    private boolean b;

    BoolAtom(boolean b){
        this.b = b;
    }

    final public boolean isBool(){ return true; }
    final public boolean isT(){ return this.b == true; }
    final public boolean isF(){ return this.b == false; }

    public String toString(){
        return b ? "#t" : "#f";
    }
}
