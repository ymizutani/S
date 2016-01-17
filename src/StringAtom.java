/**
* 文字列アトムを表すクラス
*/
class StringAtom extends Atom {
    private String str;

    public StringAtom(String s){
        this.str = s;
    }

    public StringAtom(){
        this("");
    }

    final public boolean isStringAtom(){ return true; }

    final public boolean equals(S s){ 
        if (s.isStringAtom()){
            StringAtom satom = (StringAtom)s;
            return str.equals(satom.str);
        }
        return false;
    }

    public String getValue(){
        return str;
    }

    public String toString(){
        return "\"" + str + "\"";
    }
}
