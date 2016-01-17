/**
* 文字列アトムを表すクラス
*/
class StringAtom extends Atom {
    private String s;

    public StringAtom(String s){
        this.s = s;
    }

    public StringAtom(){
        this("");
    }

    final public boolean isStringAtom(){ return true; }

    public String toString(){
        return "\"" + s + "\"";
    }
}
