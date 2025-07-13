package cc;

/* renamed from: cc.b */
/* loaded from: classes.dex */
public final class C0943b {

    /* renamed from: a */
    public static final char[] f4917a = null;

    /* renamed from: b */
    public static final char[] f4918b = null;

    /* renamed from: c */
    public static final char[] f4919c = null;

    /* renamed from: d */
    public static final char[] f4920d = null;

    /* renamed from: e */
    public static final char[] f4921e = null;

    static {
            r0 = 40
            char[] r1 = new char[r0]
            r1 = {x0026: FILL_ARRAY_DATA , data: [42, 42, 42, 32, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90} // fill-array
            cc.C0943b.f4917a = r1
            r1 = 27
            char[] r1 = new char[r1]
            r1 = {x0052: FILL_ARRAY_DATA , data: [33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 64, 91, 92, 93, 94, 95} // fill-array
            cc.C0943b.f4918b = r1
            char[] r0 = new char[r0]
            r0 = {x0072: FILL_ARRAY_DATA , data: [42, 42, 42, 32, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122} // fill-array
            cc.C0943b.f4919c = r0
            cc.C0943b.f4920d = r1
            r0 = 32
            char[] r0 = new char[r0]
            r0 = {x009e: FILL_ARRAY_DATA , data: [96, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 123, 124, 125, 126, 127} // fill-array
            cc.C0943b.f4921e = r0
            return
    }

    /* renamed from: a */
    public static void m2664a(int r2, int r3, int[] r4) {
            int r2 = r2 << 8
            int r2 = r2 + r3
            r3 = 1
            int r2 = r2 - r3
            int r0 = r2 / 1600
            r1 = 0
            r4[r1] = r0
            int r0 = r0 * 1600
            int r2 = r2 - r0
            int r0 = r2 / 40
            r4[r3] = r0
            int r0 = r0 * 40
            int r2 = r2 - r0
            r3 = 2
            r4[r3] = r2
            return
    }

    /* renamed from: b */
    public static int m2665b(int r0, int r1) {
            int r1 = r1 * 149
            int r1 = r1 % 255
            int r1 = r1 + 1
            int r0 = r0 - r1
            if (r0 < 0) goto La
            return r0
        La:
            int r0 = r0 + 256
            return r0
    }
}
