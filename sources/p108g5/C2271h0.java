package p108g5;

/* renamed from: g5.h0 */
/* loaded from: classes.dex */
public final class C2271h0 implements p088f4.InterfaceC2014i {

    /* renamed from: b0 */
    public static final p088f4.InterfaceC2014i.a<p108g5.C2271h0> f10371b0 = null;

    /* renamed from: Y */
    public final int f10372Y;

    /* renamed from: Z */
    public final p088f4.C2003e0[] f10373Z;

    /* renamed from: a0 */
    public int f10374a0;

    static {
            k1.d r0 = p179k1.C3646d.f16124m0
            p108g5.C2271h0.f10371b0 = r0
            return
    }

    public C2271h0(p088f4.C2003e0... r8) {
            r7 = this;
            r7.<init>()
            int r0 = r8.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            p371v5.C6549a.m13288b(r0)
            r7.f10373Z = r8
            int r0 = r8.length
            r7.f10372Y = r0
            r0 = r8[r1]
            java.lang.String r0 = r0.f8887a0
            java.lang.String r3 = "und"
            java.lang.String r4 = ""
            if (r0 == 0) goto L23
            boolean r5 = r0.equals(r3)
            if (r5 == 0) goto L24
        L23:
            r0 = r4
        L24:
            r8 = r8[r1]
            int r8 = r8.f8889c0
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L2a:
            f4.e0[] r5 = r7.f10373Z
            int r6 = r5.length
            if (r2 >= r6) goto L77
            r5 = r5[r2]
            java.lang.String r5 = r5.f8887a0
            if (r5 == 0) goto L3b
            boolean r6 = r5.equals(r3)
            if (r6 == 0) goto L3c
        L3b:
            r5 = r4
        L3c:
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L52
            f4.e0[] r8 = r7.f10373Z
            r0 = r8[r1]
            java.lang.String r0 = r0.f8887a0
            r8 = r8[r2]
            java.lang.String r8 = r8.f8887a0
            java.lang.String r1 = "languages"
            m6018a(r1, r0, r8, r2)
            goto L77
        L52:
            f4.e0[] r5 = r7.f10373Z
            r6 = r5[r2]
            int r6 = r6.f8889c0
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            if (r8 == r6) goto L74
            r8 = r5[r1]
            int r8 = r8.f8889c0
            java.lang.String r8 = java.lang.Integer.toBinaryString(r8)
            f4.e0[] r0 = r7.f10373Z
            r0 = r0[r2]
            int r0 = r0.f8889c0
            java.lang.String r0 = java.lang.Integer.toBinaryString(r0)
            java.lang.String r1 = "role flags"
            m6018a(r1, r8, r0, r2)
            goto L77
        L74:
            int r2 = r2 + 1
            goto L2a
        L77:
            return
    }

    /* renamed from: a */
    public static void m6018a(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = r4.length()
            int r1 = r1 + 78
            int r1 = p064e.C1489c.m4038a(r5, r1)
            int r1 = p064e.C1489c.m4038a(r6, r1)
            java.lang.String r2 = "Different "
            java.lang.String r3 = " combined in one TrackGroup: '"
            java.lang.StringBuilder r4 = p064e.C1491e.m4040a(r1, r2, r4, r3, r5)
            java.lang.String r5 = "' (track 0) and '"
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "' (track "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = ")"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            java.lang.String r4 = "TrackGroup"
            java.lang.String r5 = ""
            p371v5.C6565o.m13369b(r4, r5, r0)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<g5.h0> r2 = p108g5.C2271h0.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            g5.h0 r5 = (p108g5.C2271h0) r5
            int r2 = r4.f10372Y
            int r3 = r5.f10372Y
            if (r2 != r3) goto L23
            f4.e0[] r2 = r4.f10373Z
            f4.e0[] r5 = r5.f10373Z
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f10374a0
            if (r0 != 0) goto Lf
            r0 = 527(0x20f, float:7.38E-43)
            f4.e0[] r1 = r2.f10373Z
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            r2.f10374a0 = r0
        Lf:
            int r0 = r2.f10374a0
            return r0
    }
}
