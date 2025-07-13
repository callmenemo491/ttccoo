package ac;

/* renamed from: ac.a */
/* loaded from: classes.dex */
public final class C0055a {

    /* renamed from: h */
    public static final ac.C0055a f131h = null;

    /* renamed from: i */
    public static final ac.C0055a f132i = null;

    /* renamed from: j */
    public static final ac.C0055a f133j = null;

    /* renamed from: k */
    public static final ac.C0055a f134k = null;

    /* renamed from: l */
    public static final ac.C0055a f135l = null;

    /* renamed from: m */
    public static final ac.C0055a f136m = null;

    /* renamed from: n */
    public static final ac.C0055a f137n = null;

    /* renamed from: o */
    public static final ac.C0055a f138o = null;

    /* renamed from: a */
    public final int[] f139a;

    /* renamed from: b */
    public final int[] f140b;

    /* renamed from: c */
    public final ac.C0056b f141c;

    /* renamed from: d */
    public final ac.C0056b f142d;

    /* renamed from: e */
    public final int f143e;

    /* renamed from: f */
    public final int f144f;

    /* renamed from: g */
    public final int f145g;

    static {
            ac.a r0 = new ac.a
            r1 = 4201(0x1069, float:5.887E-42)
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 1
            r0.<init>(r1, r2, r3)
            ac.C0055a.f131h = r0
            ac.a r0 = new ac.a
            r1 = 1033(0x409, float:1.448E-42)
            r2 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1, r2, r3)
            ac.C0055a.f132i = r0
            ac.a r0 = new ac.a
            r1 = 67
            r2 = 64
            r0.<init>(r1, r2, r3)
            ac.C0055a.f133j = r0
            ac.a r1 = new ac.a
            r2 = 19
            r4 = 16
            r1.<init>(r2, r4, r3)
            ac.C0055a.f134k = r1
            ac.a r1 = new ac.a
            r2 = 285(0x11d, float:4.0E-43)
            r4 = 256(0x100, float:3.59E-43)
            r5 = 0
            r1.<init>(r2, r4, r5)
            ac.C0055a.f135l = r1
            ac.a r1 = new ac.a
            r2 = 301(0x12d, float:4.22E-43)
            r1.<init>(r2, r4, r3)
            ac.C0055a.f136m = r1
            ac.C0055a.f137n = r1
            ac.C0055a.f138o = r0
            return
    }

    public C0055a(int r5, int r6, int r7) {
            r4 = this;
            r4.<init>()
            r4.f144f = r5
            r4.f143e = r6
            r4.f145g = r7
            int[] r7 = new int[r6]
            r4.f139a = r7
            int[] r7 = new int[r6]
            r4.f140b = r7
            r7 = 0
            r0 = 1
            r1 = 0
            r2 = 1
        L15:
            if (r1 >= r6) goto L25
            int[] r3 = r4.f139a
            r3[r1] = r2
            int r2 = r2 << r0
            if (r2 < r6) goto L22
            r2 = r2 ^ r5
            int r3 = r6 + (-1)
            r2 = r2 & r3
        L22:
            int r1 = r1 + 1
            goto L15
        L25:
            r5 = 0
        L26:
            int r1 = r6 + (-1)
            if (r5 >= r1) goto L35
            int[] r1 = r4.f140b
            int[] r2 = r4.f139a
            r2 = r2[r5]
            r1[r2] = r5
            int r5 = r5 + 1
            goto L26
        L35:
            ac.b r5 = new ac.b
            int[] r6 = new int[r0]
            r6[r7] = r7
            r5.<init>(r4, r6)
            r4.f141c = r5
            ac.b r5 = new ac.b
            int[] r6 = new int[r0]
            r6[r7] = r0
            r5.<init>(r4, r6)
            r4.f142d = r5
            return
    }

    /* renamed from: a */
    public ac.C0056b m78a(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L14
            if (r3 != 0) goto L7
            ac.b r2 = r1.f141c
            return r2
        L7:
            int r2 = r2 + 1
            int[] r2 = new int[r2]
            r0 = 0
            r2[r0] = r3
            ac.b r3 = new ac.b
            r3.<init>(r1, r2)
            return r3
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    /* renamed from: b */
    public int m79b(int r4) {
            r3 = this;
            if (r4 == 0) goto L10
            int[] r0 = r3.f139a
            int r1 = r3.f143e
            int[] r2 = r3.f140b
            r4 = r2[r4]
            int r1 = r1 - r4
            int r1 = r1 + (-1)
            r4 = r0[r1]
            return r4
        L10:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            r4.<init>()
            throw r4
    }

    /* renamed from: c */
    public int m80c(int r3, int r4) {
            r2 = this;
            if (r3 == 0) goto L16
            if (r4 != 0) goto L5
            goto L16
        L5:
            int[] r0 = r2.f139a
            int[] r1 = r2.f140b
            r3 = r1[r3]
            r4 = r1[r4]
            int r3 = r3 + r4
            int r4 = r2.f143e
            int r4 = r4 + (-1)
            int r3 = r3 % r4
            r3 = r0[r3]
            return r3
        L16:
            r3 = 0
            return r3
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GF(0x"
            r0.<init>(r1)
            int r1 = r3.f144f
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            int r1 = r3.f143e
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
