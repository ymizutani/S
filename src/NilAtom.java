/**
* nilを表すクラス
*/
class NilAtom extends Atom {
    NilAtom(){ }

    final public boolean isNil(){ return true; }

    public String toString(){
        return "nil";
    }
}
