/**
* ドット対を表すクラス
*/
class Pair extends S {
    private S s1;  // car部のS式    
    private S s2;  // cdr部のS式

    final public boolean isPair(){ return true; }

    Pair(S s1, S s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public S car(){
        return s1;
    }

    public S cdr(){
        return s2;
    }

    private String toString_core(){
        if (s2.isNil()){
            return s1.toString();
        }else if (s2.isPair()){
            return s1.toString() + " " + ((Pair)s2).toString_core();
        }else{
            return s1.toString() + " . " + s2.toString();
        }
    }

    public String toString(){
        return "(" + toString_core() + ")";
    }


    /** 末尾のドット対を取得する */
    Pair tailPair(){
        Pair s = this;
        while (s.s2.isPair()){
            s = (Pair)s.s2;
        }
        return s;
    }

    /** 純リストであることを判定する */
    final public boolean isList(){
        return tailPair().s2.isNil();
    }


    final public boolean equals(S s){ 
        if (s.isPair()){
            Pair p = (Pair)s;
            return s1.equals(p.s1) && s2.equals(p.s2);
        }
        return false;
    }

}
