package c19;

import net.mindview.util.Enums;

/**
 * Created by susong on 16/4/24.
 */
public enum Exercise3 {
    STOCK(Stock.class), BOND(Bond.class);
    Enum[] values;

    Exercise3(Class<? extends Enum> kind) {
        values = kind.getEnumConstants();
    }

    enum Stock {SHORT, LONG, MARGIN}

    enum Bond {MUNICIPAL, JUNK}


    public Enum randomSelection() {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Exercise3 category =
                    Enums.random(Exercise3.class);
            System.out.println(category + ": " +
                    category.randomSelection());
        }
    }

}
