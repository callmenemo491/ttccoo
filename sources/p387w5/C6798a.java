package p387w5;

/* renamed from: w5.a */
/* loaded from: classes.dex */
public final class C6798a {

    /* renamed from: a */
    public final java.util.List<byte[]> f26396a;

    /* renamed from: b */
    public final int f26397b;

    /* renamed from: c */
    public final int f26398c;

    /* renamed from: d */
    public final int f26399d;

    /* renamed from: e */
    public final float f26400e;

    /* renamed from: f */
    public final java.lang.String f26401f;

    public C6798a(java.util.List<byte[]> r1, int r2, int r3, int r4, float r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f26396a = r1
            r0.f26397b = r2
            r0.f26398c = r3
            r0.f26399d = r4
            r0.f26400e = r5
            r0.f26401f = r6
            return
    }

    /* renamed from: a */
    public static byte[] m13826a(p371v5.C6571u r6) {
            int r0 = r6.m13423z()
            int r1 = r6.f25711b
            r6.m13397G(r0)
            byte[] r6 = r6.f25710a
            byte[] r2 = p371v5.C6554d.f25636a
            int r3 = r2.length
            int r3 = r3 + r0
            byte[] r3 = new byte[r3]
            int r4 = r2.length
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r3, r5, r4)
            int r2 = r2.length
            java.lang.System.arraycopy(r6, r1, r3, r2, r0)
            return r3
    }

    /* renamed from: b */
    public static p387w5.C6798a m13827b(p371v5.C6571u r9) {
            r0 = 4
            r9.m13397G(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            int r0 = r9.m13418u()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            r1 = 3
            r0 = r0 & r1
            int r4 = r0 + 1
            if (r4 == r1) goto L70
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            r3.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            int r0 = r9.m13418u()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            r0 = r0 & 31
            r1 = 0
            r2 = 0
        L1b:
            if (r2 >= r0) goto L27
            byte[] r5 = m13826a(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            r3.add(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            int r2 = r2 + 1
            goto L1b
        L27:
            int r2 = r9.m13418u()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            r5 = 0
        L2c:
            if (r5 >= r2) goto L38
            byte[] r6 = m13826a(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            r3.add(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            int r5 = r5 + 1
            goto L2c
        L38:
            r9 = 0
            r2 = -1
            if (r0 <= 0) goto L62
            java.lang.Object r9 = r3.get(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            byte[] r9 = (byte[]) r9     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            java.lang.Object r0 = r3.get(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            byte[] r0 = (byte[]) r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            int r9 = r9.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            v5.r$c r9 = p371v5.C6568r.m13386e(r0, r4, r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            int r0 = r9.f25694e     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            int r1 = r9.f25695f     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            float r2 = r9.f25696g     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            int r5 = r9.f25690a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            int r6 = r9.f25691b     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            int r9 = r9.f25692c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            java.lang.String r9 = p371v5.C6554d.m13338a(r5, r6, r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            r8 = r9
            r5 = r0
            r6 = r1
            r7 = r2
            goto L69
        L62:
            r0 = 1065353216(0x3f800000, float:1.0)
            r8 = r9
            r5 = -1
            r6 = -1
            r7 = 1065353216(0x3f800000, float:1.0)
        L69:
            w5.a r9 = new w5.a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            return r9
        L70:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            r9.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
            throw r9     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L76
        L76:
            r9 = move-exception
            java.lang.String r0 = "Error parsing AVC config"
            f4.s0 r9 = p088f4.C2044s0.m5407a(r0, r9)
            throw r9
    }
}
