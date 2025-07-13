package p317ri;

/* renamed from: ri.v1 */
/* loaded from: classes.dex */
public class C5923v1 {

    /* renamed from: a */
    public static final long f22753a = 0;

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.maxMemory()
            p317ri.C5923v1.f22753a = r0
            return
    }

    /* renamed from: a */
    public static int m12290a(int r2) {
            r0 = 1
            r1 = 127(0x7f, float:1.78E-43)
            if (r2 <= r1) goto L17
            r1 = 1
        L6:
            int r2 = r2 >>> 8
            if (r2 == 0) goto Ld
            int r1 = r1 + 1
            goto L6
        Ld:
            int r1 = r1 - r0
            int r1 = r1 * 8
        L10:
            if (r1 < 0) goto L17
            int r0 = r0 + 1
            int r1 = r1 + (-8)
            goto L10
        L17:
            return r0
    }

    /* renamed from: b */
    public static int m12291b(int r6) {
            r0 = 1
            r1 = 31
            if (r6 < r1) goto L1f
            r1 = 128(0x80, float:1.8E-43)
            if (r6 >= r1) goto Lb
            r0 = 2
            goto L1f
        Lb:
            r2 = 5
            byte[] r3 = new byte[r2]
            r4 = 4
        Lf:
            int r6 = r6 >> 7
            int r4 = r4 + (-1)
            r5 = r6 & 127(0x7f, float:1.78E-43)
            r5 = r5 | r1
            byte r5 = (byte) r5
            r3[r4] = r5
            r5 = 127(0x7f, float:1.78E-43)
            if (r6 > r5) goto Lf
            int r2 = r2 - r4
            int r0 = r0 + r2
        L1f:
            return r0
    }

    /* renamed from: c */
    public static int m12292c(java.io.InputStream r5) {
            boolean r0 = r5 instanceof p317ri.AbstractC5920u1
            if (r0 == 0) goto Lb
            ri.u1 r5 = (p317ri.AbstractC5920u1) r5
            int r5 = r5.mo12260a()
            return r5
        Lb:
            boolean r0 = r5 instanceof p317ri.C5885j
            if (r0 == 0) goto L14
            ri.j r5 = (p317ri.C5885j) r5
            int r5 = r5.f22706Y
            return r5
        L14:
            boolean r0 = r5 instanceof java.io.ByteArrayInputStream
            if (r0 == 0) goto L1f
            java.io.ByteArrayInputStream r5 = (java.io.ByteArrayInputStream) r5
            int r5 = r5.available()
            return r5
        L1f:
            boolean r0 = r5 instanceof java.io.FileInputStream
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r0 == 0) goto L3b
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5     // Catch: java.io.IOException -> L3a
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.io.IOException -> L3a
            if (r5 == 0) goto L33
            long r3 = r5.size()     // Catch: java.io.IOException -> L3a
            goto L34
        L33:
            r3 = r1
        L34:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L3b
            int r5 = (int) r3
            return r5
        L3a:
        L3b:
            long r3 = p317ri.C5923v1.f22753a
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L45
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        L45:
            int r5 = (int) r3
            return r5
    }
}
