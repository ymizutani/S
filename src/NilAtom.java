/**
* nilを表すクラス
*/
class NilAtom extends Atom {
    NilAtom(){ }

    final public boolean isNil(){ return true; }

    final public boolean equals(SExpr s){ 
        return s.isNil();
    }

    public String toString(){
        return "nil";
    }
}
