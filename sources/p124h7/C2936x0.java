package p124h7;

/* renamed from: h7.x0 */
/* loaded from: classes.dex */
public final class C2936x0 {

    /* renamed from: f */
    public static final p124h7.C2936x0 f12011f = null;

    /* renamed from: a */
    public int f12012a;

    /* renamed from: b */
    public int[] f12013b;

    /* renamed from: c */
    public java.lang.Object[] f12014c;

    /* renamed from: d */
    public int f12015d;

    /* renamed from: e */
    public boolean f12016e;

    static {
            h7.x0 r0 = new h7.x0
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            p124h7.C2936x0.f12011f = r0
            return
    }

    public C2936x0() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r3 = 1
            r4.<init>(r2, r1, r0, r3)
            return
    }

    public C2936x0(int r2, int[] r3, java.lang.Object[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f12015d = r0
            r1.f12012a = r2
            r1.f12013b = r3
            r1.f12014c = r4
            r1.f12016e = r5
            return
    }

    /* renamed from: b */
    public static p124h7.C2936x0 m7246b() {
            h7.x0 r0 = new h7.x0
            r1 = 8
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r4 = 1
            r0.<init>(r3, r2, r1, r4)
            return r0
    }

    /* renamed from: a */
    public final int m7247a() {
            r6 = this;
            int r0 = r6.f12015d
            r1 = -1
            if (r0 != r1) goto L9b
            r0 = 0
            r1 = 0
        L7:
            int r2 = r6.f12012a
            if (r0 >= r2) goto L98
            int[] r2 = r6.f12013b
            r2 = r2[r0]
            int r3 = r2 >>> 3
            r2 = r2 & 7
            if (r2 == 0) goto L7d
            r4 = 1
            if (r2 == r4) goto L69
            r4 = 2
            if (r2 == r4) goto L50
            r4 = 3
            if (r2 == r4) goto L40
            r4 = 5
            if (r2 != r4) goto L33
            java.lang.Object[] r2 = r6.f12014c
            r2 = r2[r0]
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.intValue()
            int r2 = r3 << 3
            int r2 = p124h7.AbstractC2682ig.m6841h(r2)
            int r2 = r2 + 4
            goto L7a
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = p124h7.C2611f.f11503Y
            h7.e r1 = new h7.e
            r1.<init>()
            r0.<init>(r1)
            throw r0
        L40:
            int r2 = p124h7.AbstractC2682ig.m6840g(r3)
            int r2 = r2 + r2
            java.lang.Object[] r3 = r6.f12014c
            r3 = r3[r0]
            h7.x0 r3 = (p124h7.C2936x0) r3
            int r3 = r3.m7247a()
            goto L91
        L50:
            java.lang.Object[] r2 = r6.f12014c
            r2 = r2[r0]
            h7.cg r2 = (p124h7.AbstractC2574cg) r2
            int r3 = r3 << 3
            int r3 = p124h7.AbstractC2682ig.m6841h(r3)
            int r2 = r2.mo6474h()
            int r4 = p124h7.AbstractC2682ig.m6841h(r2)
            int r4 = r4 + r2
            int r4 = r4 + r3
            int r4 = r4 + r1
            r1 = r4
            goto L94
        L69:
            java.lang.Object[] r2 = r6.f12014c
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            r2.longValue()
            int r2 = r3 << 3
            int r2 = p124h7.AbstractC2682ig.m6841h(r2)
            int r2 = r2 + 8
        L7a:
            int r2 = r2 + r1
            r1 = r2
            goto L94
        L7d:
            java.lang.Object[] r2 = r6.f12014c
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = r3 << 3
            int r2 = p124h7.AbstractC2682ig.m6841h(r2)
            int r3 = p124h7.AbstractC2682ig.m6842i(r4)
        L91:
            int r3 = r3 + r2
            int r3 = r3 + r1
            r1 = r3
        L94:
            int r0 = r0 + 1
            goto L7
        L98:
            r6.f12015d = r1
            return r1
        L9b:
            return r0
    }

    /* renamed from: c */
    public final void m7248c(int r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r3.f12016e
            if (r0 == 0) goto L31
            int r0 = r3.f12012a
            int[] r1 = r3.f12013b
            int r2 = r1.length
            if (r0 != r2) goto L22
            r2 = 4
            if (r0 >= r2) goto L11
            r2 = 8
            goto L13
        L11:
            int r2 = r0 >> 1
        L13:
            int r0 = r0 + r2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f12013b = r1
            java.lang.Object[] r1 = r3.f12014c
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f12014c = r0
        L22:
            int[] r0 = r3.f12013b
            int r1 = r3.f12012a
            r0[r1] = r4
            java.lang.Object[] r4 = r3.f12014c
            r4[r1] = r5
            int r1 = r1 + 1
            r3.f12012a = r1
            return
        L31:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    /* renamed from: d */
    public final void m7249d(p124h7.C2700jg r6) {
            r5 = this;
            int r0 = r5.f12012a
            if (r0 == 0) goto L6f
            r0 = 0
        L5:
            int r1 = r5.f12012a
            if (r0 >= r1) goto L6f
            int[] r1 = r5.f12013b
            r1 = r1[r0]
            java.lang.Object[] r2 = r5.f12014c
            r2 = r2[r0]
            int r3 = r1 >>> 3
            r1 = r1 & 7
            if (r1 == 0) goto L61
            r4 = 1
            if (r1 == r4) goto L55
            r4 = 2
            if (r1 == r4) goto L4d
            r4 = 3
            if (r1 == r4) goto L3c
            r4 = 5
            if (r1 != r4) goto L2f
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            h7.ig r2 = r6.f11684a
            r2.mo6727n(r3, r1)
            goto L6c
        L2f:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            int r0 = p124h7.C2611f.f11503Y
            h7.e r0 = new h7.e
            r0.<init>()
            r6.<init>(r0)
            throw r6
        L3c:
            h7.ig r1 = r6.f11684a
            r1.mo6735v(r3, r4)
            h7.x0 r2 = (p124h7.C2936x0) r2
            r2.m7249d(r6)
            h7.ig r1 = r6.f11684a
            r2 = 4
            r1.mo6735v(r3, r2)
            goto L6c
        L4d:
            h7.cg r2 = (p124h7.AbstractC2574cg) r2
            h7.ig r1 = r6.f11684a
            r1.mo6726m(r3, r2)
            goto L6c
        L55:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            h7.ig r4 = r6.f11684a
            r4.mo6729p(r3, r1)
            goto L6c
        L61:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            h7.ig r4 = r6.f11684a
            r4.mo6738y(r3, r1)
        L6c:
            int r0 = r0 + 1
            goto L5
        L6f:
            return
    }

    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 != 0) goto L8
            return r1
        L8:
            boolean r2 = r9 instanceof p124h7.C2936x0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            h7.x0 r9 = (p124h7.C2936x0) r9
            int r2 = r8.f12012a
            int r3 = r9.f12012a
            if (r2 != r3) goto L3d
            int[] r3 = r8.f12013b
            int[] r4 = r9.f12013b
            r5 = 0
        L1a:
            if (r5 >= r2) goto L26
            r6 = r3[r5]
            r7 = r4[r5]
            if (r6 == r7) goto L23
            goto L3d
        L23:
            int r5 = r5 + 1
            goto L1a
        L26:
            java.lang.Object[] r2 = r8.f12014c
            java.lang.Object[] r9 = r9.f12014c
            int r3 = r8.f12012a
            r4 = 0
        L2d:
            if (r4 >= r3) goto L3c
            r5 = r2[r4]
            r6 = r9[r4]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3d
            int r4 = r4 + 1
            goto L2d
        L3c:
            return r0
        L3d:
            return r1
    }

    public final int hashCode() {
            r8 = this;
            int r0 = r8.f12012a
            int r1 = r0 + 527
            int r1 = r1 * 31
            int[] r2 = r8.f12013b
            r3 = 0
            r4 = 17
            r5 = 0
            r6 = 17
        Le:
            if (r5 >= r0) goto L18
            int r6 = r6 * 31
            r7 = r2[r5]
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto Le
        L18:
            int r1 = r1 + r6
            int r1 = r1 * 31
            java.lang.Object[] r0 = r8.f12014c
            int r2 = r8.f12012a
        L1f:
            if (r3 >= r2) goto L2d
            int r4 = r4 * 31
            r5 = r0[r3]
            int r5 = r5.hashCode()
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L1f
        L2d:
            int r1 = r1 + r4
            return r1
    }
}
