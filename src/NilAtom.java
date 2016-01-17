/**
* nilを表すクラス
*/
class NilAtom extends Atom {
    NilAtom(){ }

    final public boolean isNil(){ return true; }

    final public boolean equals(S s){ 
        return s.isNil();
    }

    public String toString(){
        return "nil";
    }
}
