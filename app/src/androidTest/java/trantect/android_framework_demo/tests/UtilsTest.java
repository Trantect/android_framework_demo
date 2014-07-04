package trantect.android_framework_demo.tests;


import android.test.AndroidTestCase;

import trantect.android_framework_demo.util.Utils;

public class UtilsTest extends AndroidTestCase {
    public void testMax() {
        assertEquals(2, Utils.Max(1, 2));
    }
}
