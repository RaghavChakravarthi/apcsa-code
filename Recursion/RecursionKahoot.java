public class RecursionKahoot {
    // mystery0(0)
    public static String mystery0(int a) {
	return mystery0(a) + "";
    }

    // mystery1(0)
    public static String mystery1(int a) {
	return mystery1(a - 1) + "";
    }

    // mystery2(0)
    // mystery2(1)
    public static String mystery2(int a) {
	if (a == 0) {
	    return "0";
	}
	return a + mystery2(a - 1); // remove
    }

    // mystery3(0)
    // mystery3(1)
    // mystery3(3)
    // mystery3(-1)
    public static String mystery3(int a) {
	if (a == 0) {
	    return "0";
	}
	return a + mystery3(a - 1);
    }

    // mystery4(0)
    public static String mystery4(int a) {
	return mystery4(a - 1) + a + mystery4(a - 1);
    }

    // mystery5(0)
    // mystery5(2)
    // mystery5(1)
    // mystery5(2)
    // mystery5(-1)
    public static String mystery5(int a) {
	if (a == 0) {
	    return "0";
	}
	return mystery5(a - 1) + a + mystery5(a - 1);
    }

    // mystery6(-1)
    public static String mystery6(int a) {
	if (a <= 0) {
	    return "0";
	}
	return mystery6(a - 1) + a + mystery6(a - 1);
    }

    // mystery7(0)
    // mystery7(2)
    // mystery7(1)
    // mystery7(2)
    public static String mystery7(int a) {
	if (a <= 0) {
	    return "0";
	}
	return mystery7(a - 2) + a + mystery7(a - 1);
    }
}