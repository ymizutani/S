
/**
  S式クラス
*/
abstract class S {

    //// 種別判定系メソッド ////////////////////////////////

    /** アトムであることを判定する． */
    public boolean isAtom(){ return false; }

    /** ドット対であることを判定する． */
    public boolean isPair(){ return false; }

    /** 整数アトムであることを判定する． */
    public boolean isIntAtom(){ return false; }

    /** 実数アトムであることを判定する． */
    public boolean isDoubleAtom(){ return false; }

    /** 文字アトムであることを判定する． */
    public boolean isCharAtom(){ return false; }

    /** 文字列アトムであることを判定する． */
    public boolean isStringAtom(){ return false; }

    /** ブールアトムであることを判定する． */
    public boolean isBoolAtom(){ return false; }

    /** trueを表すブールアトムであることを判定する． */
    public boolean isT(){ return false; }

    /** falseを表すブールアトムであることを判定する． */
    public boolean isF(){ return false; }

    /** nilであることを判定する．*/
    public boolean isNil(){ return false; }

    /** 純リストであることを判定する */
    public boolean isList(){ return false; };


    //// 種別判定系メソッドの否定 ////////////////////////////////

    /** アトムでないことを判定する． */
    final public boolean isNotAtom(){ return !isAtom(); }

    /** ドット対でないことを判定する． */
    final public boolean isNotPair(){ return !isPair(); }

    /** 整数アトムでないことを判定する． */
    final public boolean isNotIntAtom(){ return !isIntAtom(); }

    /** 実数アトムでないことを判定する． */
    final public boolean isNotDoubleAtom(){ return !isDoubleAtom(); }

    /** ブールアトムでないことを判定する． */
    final public boolean isNotBoolAtom(){ return !isBoolAtom(); }

    /** 文字アトムでないことを判定する． */
    final public boolean isNotCharAtom(){ return !isCharAtom(); }

    /** 文字列アトムであることを判定する． */
    final public boolean isNotStringAtom(){ return !isStringAtom(); }

    /** nilであることを判定する．*/
    final public boolean isNotNil(){ return !isNil(); }

    //// 等価判定系メソッド ////////////////////////////////
    abstract public boolean equals(S s);


    //// データ取得 /////////////////////////////////////////////////

    /** 整数アトムが表す整数値を取得する． */
    public int getIntValue(){
        if (this.isNotIntAtom()){
            throw new RuntimeException();
        }
        return ((IntAtom)this).getValue();
    }

    /** 実数アトムが表す整数値を取得する． */
    public double getDoubleValue(){
        if (this.isNotDoubleAtom()){
            throw new RuntimeException();
        }
        return ((DoubleAtom)this).getValue();
    }

    /** 文字列アトムが表す整数値を取得する． */
    public String getStringValue(){
        if (this.isNotStringAtom()){
            throw new RuntimeException();
        }
        return ((StringAtom)this).getValue();
    }

    /** ブールアトムが表す整数値を取得する． */
    public boolean getBoolValue(){
        if (this.isNotBoolAtom()){
            throw new RuntimeException();
        }
        return ((BoolAtom)this).getValue();
    }



    //// ドット対関連 /////////////////////////////////////////////////

    /** 引数とのドット対を返す． */
    public S cons(S s){
        return new Pair(this, s);
    }

    /** car部を返す． */
    public S car(){
        throw new RuntimeException();
    }

    /** cdr部を返す． */
    public S cdr(){
        throw new RuntimeException();
    }


    //////////// S式を生成する静的メソッド ////////////////////////////

    /** nilを表すインスタンス */
    static private S nil_instance = new NilAtom();

    /** nilを参照する */
    static public S nil(){ return nil_instance; }


    /** ブールアトムのインスタンス */
    static private S t_instance = new BoolAtom(true);
    static private S f_instance = new BoolAtom(false);

    /** trueを参照する */
    static public S t(){ return t_instance; }

    /** falseを参照する */
    static public S f(){ return f_instance; }

    /** 整数アトムを生成する */
    static public S atom(int i){
        return new IntAtom(i);
    }
    
    /** 実数アトムを生成する */
    static public S atom(double d){
        return new DoubleAtom(d);
    }
    
    /** 文字列アトムを生成する */
    static public S atom(String s){
        return new StringAtom(s);
    }

    /** nilアトムを生成する */
    static public S atom(){
        return nil();
    }

    /** ブールアトムを生成する */
    static public S atom(boolean b){
        return b ? t() : f();
    }



    /** 文字列に変換する．*/
    abstract public String toString();

}
