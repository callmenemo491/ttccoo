package p319s;

/* renamed from: s.d */
/* loaded from: classes.dex */
public class C5937d {

    /* renamed from: a */
    public static final int[] f22775a = null;

    /* renamed from: b */
    public static final long[] f22776b = null;

    /* renamed from: c */
    public static final java.lang.Object[] f22777c = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            p319s.C5937d.f22775a = r1
            long[] r1 = new long[r0]
            p319s.C5937d.f22776b = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            p319s.C5937d.f22777c = r0
            return
    }

    /* renamed from: a */
    public static int m12314a(int[] r3, int r4, int r5) {
            int r4 = r4 + (-1)
            r0 = 0
        L3:
            if (r0 > r4) goto L18
            int r1 = r0 + r4
            int r1 = r1 >>> 1
            r2 = r3[r1]
            if (r2 >= r5) goto L11
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L11:
            if (r2 <= r5) goto L17
            int r1 = r1 + (-1)
            r4 = r1
            goto L3
        L17:
            return r1
        L18:
            int r3 = ~r0
            return r3
    }

    /* renamed from: b */
    public static int m12315b(long[] r5, int r6, long r7) {
            int r6 = r6 + (-1)
            r0 = 0
        L3:
            if (r0 > r6) goto L1a
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            r2 = r5[r1]
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L13
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L13:
            if (r4 <= 0) goto L19
            int r1 = r1 + (-1)
            r6 = r1
            goto L3
        L19:
            return r1
        L1a:
            int r5 = ~r0
            return r5
    }

    /* renamed from: c */
    public static boolean m12316c(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    /* renamed from: d */
    public static int m12317d(int r2) {
            r0 = 4
        L1:
            r1 = 32
            if (r0 >= r1) goto Lf
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto Lc
            return r1
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            return r2
    }

    /* renamed from: e */
    public static int m12318e(int r0) {
            int r0 = r0 * 4
            int r0 = m12317d(r0)
            int r0 = r0 / 4
            return r0
    }

    /* renamed from: f */
    public static int m12319f(int r0) {
            int r0 = r0 * 8
            int r0 = m12317d(r0)
            int r0 = r0 / 8
            return r0
    }
}
