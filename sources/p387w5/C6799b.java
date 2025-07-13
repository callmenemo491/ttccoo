package p387w5;

/* renamed from: w5.b */
/* loaded from: classes.dex */
public final class C6799b implements p088f4.InterfaceC2014i {

    /* renamed from: d0 */
    public static final p088f4.InterfaceC2014i.a<p387w5.C6799b> f26402d0 = null;

    /* renamed from: Y */
    public final int f26403Y;

    /* renamed from: Z */
    public final int f26404Z;

    /* renamed from: a0 */
    public final int f26405a0;

    /* renamed from: b0 */
    public final byte[] f26406b0;

    /* renamed from: c0 */
    public int f26407c0;

    static {
            k1.b r0 = p179k1.C3642b.f16066o0
            p387w5.C6799b.f26402d0 = r0
            return
    }

    public C6799b(int r1, int r2, int r3, byte[] r4) {
            r0 = this;
            r0.<init>()
            r0.f26403Y = r1
            r0.f26404Z = r2
            r0.f26405a0 = r3
            r0.f26406b0 = r4
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: a */
    public static int m13828a(int r2) {
            r0 = 1
            if (r2 == r0) goto L18
            r0 = 9
            r1 = 6
            if (r2 == r0) goto L17
            r0 = 4
            if (r2 == r0) goto L15
            r0 = 5
            if (r2 == r0) goto L15
            if (r2 == r1) goto L15
            r0 = 7
            if (r2 == r0) goto L15
            r2 = -1
            return r2
        L15:
            r2 = 2
            return r2
        L17:
            return r1
        L18:
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: b */
    public static int m13829b(int r3) {
            r0 = 1
            if (r3 == r0) goto L15
            r0 = 16
            r1 = 6
            if (r3 == r0) goto L14
            r0 = 18
            r2 = 7
            if (r3 == r0) goto L13
            if (r3 == r1) goto L15
            if (r3 == r2) goto L15
            r3 = -1
            return r3
        L13:
            return r2
        L14:
            return r1
        L15:
            r3 = 3
            return r3
    }

    /* renamed from: c */
    public static java.lang.String m13830c(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L31
            java.lang.Class<w5.b> r2 = p387w5.C6799b.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L31
        L10:
            w5.b r5 = (p387w5.C6799b) r5
            int r2 = r4.f26403Y
            int r3 = r5.f26403Y
            if (r2 != r3) goto L2f
            int r2 = r4.f26404Z
            int r3 = r5.f26404Z
            if (r2 != r3) goto L2f
            int r2 = r4.f26405a0
            int r3 = r5.f26405a0
            if (r2 != r3) goto L2f
            byte[] r2 = r4.f26406b0
            byte[] r5 = r5.f26406b0
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L2f
            goto L30
        L2f:
            r0 = 0
        L30:
            return r0
        L31:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f26407c0
            if (r0 != 0) goto L1e
            r0 = 527(0x20f, float:7.38E-43)
            int r1 = r2.f26403Y
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f26404Z
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f26405a0
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte[] r1 = r2.f26406b0
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            r2.f26407c0 = r1
        L1e:
            int r0 = r2.f26407c0
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.f26403Y
            int r1 = r6.f26404Z
            int r2 = r6.f26405a0
            byte[] r3 = r6.f26406b0
            if (r3 == 0) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r4 = 55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "ColorInfo("
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = ", "
            r5.append(r0)
            r5.append(r1)
            r5.append(r0)
            r5.append(r2)
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = ")"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
    }
}
