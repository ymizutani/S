/**
* 実数アトムを表すクラス
*/
class DoubleAtom extends Atom {
    private double d;

    public DoubleAtom(double d){
        this.d = d;
    }

    public DoubleAtom(){
        this(0);
    }

    final public boolean isDoubleAtom(){ return true; }

    final public boolean equals(S s){ 
        if (s.isDoubleAtom()){
            return this.d == ((DoubleAtom)s).d;
        }
        return false;
    }

    public double getValue(){
        return d;
    }

    public String toString(){
        return String.valueOf(d);
    }
}
