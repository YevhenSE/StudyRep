package exc3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyDictionary<Type1, Type2> {

    private Type1 type1;
    private Type2 type2;

    public MyDictionary(Type1 type1, Type2 type2) {
        this.type1 = type1;
        this.type2 = type2;

    }

    public Type1 getType1() {
        return type1;
    }

    public void setType1(Type1 type1) {
        this.type1 = type1;
    }

    public Type2 getType2() {
        return type2;
    }

    public void setType2(Type2 type2) {
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return " [" + type1 + " " + type2 +
                ']';
    }
}
