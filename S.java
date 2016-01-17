
/**
  S式クラス
*/
abstract class S {
    /**
        アトムの判定
    */
    public boolean isAtom(){
        return false;
    }

    /**
        ペアの判定
    */
    public boolean isPair(){
        return false;
    }

    /**
        整数アトムの判定
    */
    public boolean isIntAtom(){
        return false;
    }

    /**
        実数アトムの判定
    */
    public boolean isDoubleAtom(){
        return false;
    }

    /**
        文字列アトムの判定
    */
    public boolean isStringAtom(){
        return false;
    }

    /**
        nilの判定
    */
    public boolean isNil(){
        return false;
    }
}
