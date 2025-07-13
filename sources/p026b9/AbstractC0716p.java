package p026b9;

/* renamed from: b9.p */
/* loaded from: classes.dex */
public abstract class AbstractC0716p<E> extends p026b9.AbstractC0710l<E> implements java.util.Set<E> {

    /* renamed from: a0 */
    public static final /* synthetic */ int f3989a0 = 0;

    /* renamed from: Z */
    public transient p026b9.AbstractC0714n<E> f3990Z;

    public AbstractC0716p() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: A */
    public static <E> p026b9.AbstractC0716p<E> m2323A(E r3, E r4, E r5) {
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            b9.p r3 = m2325q(r0, r1)
            return r3
    }

    /* renamed from: p */
    public static int m2324p(int r6) {
            r0 = 2
            int r6 = java.lang.Math.max(r6, r0)
            r0 = 1
            r1 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r6 >= r1) goto L24
            int r1 = r6 + (-1)
            int r1 = java.lang.Integer.highestOneBit(r1)
            int r0 = r1 << 1
        L13:
            double r1 = (double) r0
            r3 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r3
            double r3 = (double) r6
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L23
            int r0 = r0 << 1
            goto L13
        L23:
            return r0
        L24:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r6 >= r1) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            java.lang.String r6 = "collection too large"
            p124h7.C2939x3.m7277c(r0, r6)
            return r1
    }

    /* renamed from: q */
    public static <E> p026b9.AbstractC0716p<E> m2325q(int r13, java.lang.Object... r14) {
            if (r13 == 0) goto L75
            r0 = 0
            r1 = 1
            if (r13 == r1) goto L6d
            int r2 = m2324p(r13)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            int r7 = r2 + (-1)
            r3 = 0
            r5 = 0
            r8 = 0
        L11:
            if (r3 >= r13) goto L3b
            r4 = r14[r3]
            p185k7.C3836i.m8617b(r4, r3)
            int r9 = r4.hashCode()
            int r10 = p124h7.C2939x3.m7289o(r9)
        L20:
            r11 = r10 & r7
            r12 = r6[r11]
            if (r12 != 0) goto L2f
            int r10 = r8 + 1
            r14[r8] = r4
            r6[r11] = r4
            int r5 = r5 + r9
            r8 = r10
            goto L35
        L2f:
            boolean r11 = r12.equals(r4)
            if (r11 == 0) goto L38
        L35:
            int r3 = r3 + 1
            goto L11
        L38:
            int r10 = r10 + 1
            goto L20
        L3b:
            r3 = 0
            java.util.Arrays.fill(r14, r8, r13, r3)
            if (r8 != r1) goto L49
            r13 = r14[r0]
            b9.k0 r14 = new b9.k0
            r14.<init>(r13, r5)
            return r14
        L49:
            int r13 = m2324p(r8)
            int r2 = r2 / 2
            if (r13 >= r2) goto L56
            b9.p r13 = m2325q(r8, r14)
            return r13
        L56:
            int r13 = r14.length
            int r2 = r13 >> 1
            int r13 = r13 >> 2
            int r2 = r2 + r13
            if (r8 >= r2) goto L5f
            r0 = 1
        L5f:
            if (r0 == 0) goto L65
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r8)
        L65:
            r4 = r14
            b9.e0 r13 = new b9.e0
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        L6d:
            r13 = r14[r0]
            b9.k0 r14 = new b9.k0
            r14.<init>(r13)
            return r14
        L75:
            b9.e0<java.lang.Object> r13 = p026b9.C0697e0.f3947g0
            return r13
    }

    /* renamed from: u */
    public static <E> p026b9.AbstractC0716p<E> m2326u(java.util.Collection<? extends E> r2) {
            boolean r0 = r2 instanceof p026b9.AbstractC0716p
            if (r0 == 0) goto L12
            boolean r0 = r2 instanceof java.util.SortedSet
            if (r0 != 0) goto L12
            r0 = r2
            b9.p r0 = (p026b9.AbstractC0716p) r0
            boolean r1 = r0.mo2264m()
            if (r1 != 0) goto L12
            return r0
        L12:
            java.lang.Object[] r2 = r2.toArray()
            int r0 = r2.length
            b9.p r2 = m2325q(r0, r2)
            return r2
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: a */
    public p026b9.AbstractC0714n<E> mo2272a() {
            r1 = this;
            b9.n<E> r0 = r1.f3990Z
            if (r0 != 0) goto La
            b9.n r0 = r1.mo2271w()
            r1.f3990Z = r0
        La:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof p026b9.AbstractC0716p
            if (r0 == 0) goto L23
            boolean r0 = r2.mo2304z()
            if (r0 == 0) goto L23
            r0 = r3
            b9.p r0 = (p026b9.AbstractC0716p) r0
            boolean r0 = r0.mo2304z()
            if (r0 == 0) goto L23
            int r0 = r2.hashCode()
            int r1 = r3.hashCode()
            if (r0 == r1) goto L23
            r3 = 0
            return r3
        L23:
            boolean r3 = p026b9.C0707j0.m2298a(r2, r3)
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = p026b9.C0707j0.m2300c(r1)
            return r0
    }

    @Override // p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            b9.m0 r0 = r1.mo2270n()
            return r0
    }

    /* renamed from: w */
    public p026b9.AbstractC0714n<E> mo2271w() {
            r1 = this;
            java.lang.Object[] r0 = r1.toArray()
            b9.n r0 = p026b9.AbstractC0714n.m2308p(r0)
            return r0
    }

    /* renamed from: z */
    public boolean mo2304z() {
            r0 = this;
            boolean r0 = r0 instanceof p026b9.C0697e0
            return r0
    }
}
