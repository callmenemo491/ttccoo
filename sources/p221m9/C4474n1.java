package p221m9;

/* renamed from: m9.n1 */
/* loaded from: classes.dex */
public final class C4474n1 {

    /* renamed from: f */
    public static final p221m9.C4474n1 f18195f = null;

    /* renamed from: a */
    public int f18196a;

    /* renamed from: b */
    public int[] f18197b;

    /* renamed from: c */
    public java.lang.Object[] f18198c;

    /* renamed from: d */
    public int f18199d;

    /* renamed from: e */
    public boolean f18200e;

    static {
            m9.n1 r0 = new m9.n1
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            p221m9.C4474n1.f18195f = r0
            return
    }

    public C4474n1() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r3 = 1
            r4.<init>(r2, r1, r0, r3)
            return
    }

    public C4474n1(int r2, int[] r3, java.lang.Object[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f18199d = r0
            r1.f18196a = r2
            r1.f18197b = r3
            r1.f18198c = r4
            r1.f18200e = r5
            return
    }

    /* renamed from: b */
    public static p221m9.C4474n1 m10217b() {
            m9.n1 r0 = new m9.n1
            r1 = 8
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r4 = 1
            r0.<init>(r3, r2, r1, r4)
            return r0
    }

    /* renamed from: d */
    public static void m10218d(int r3, java.lang.Object r4, p221m9.InterfaceC4498v1 r5) {
            int r0 = r3 >>> 3
            r3 = r3 & 7
            if (r3 == 0) goto L56
            r1 = 1
            if (r3 == r1) goto L48
            r1 = 2
            if (r3 == r1) goto L3e
            r1 = 3
            if (r3 == r1) goto L2a
            r1 = 5
            if (r3 != r1) goto L20
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r4 = r5.f18190a
            r4.mo10159Q(r0, r3)
            goto L63
        L20:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            m9.a0$a r4 = p221m9.C4434a0.m9898d()
            r3.<init>(r4)
            throw r3
        L2a:
            r3 = r5
            m9.l r3 = (p221m9.C4466l) r3
            m9.k r2 = r3.f18190a
            r2.mo10169a0(r0, r1)
            m9.n1 r4 = (p221m9.C4474n1) r4
            r4.m10221e(r5)
            m9.k r3 = r3.f18190a
            r4 = 4
            r3.mo10169a0(r0, r4)
            goto L63
        L3e:
            m9.h r4 = (p221m9.AbstractC4454h) r4
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r3 = r5.f18190a
            r3.mo10158P(r0, r4)
            goto L63
        L48:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10161S(r0, r3)
            goto L63
        L56:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10172d0(r0, r3)
        L63:
            return
    }

    /* renamed from: a */
    public int m10219a() {
            r6 = this;
            int r0 = r6.f18199d
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            r1 = 0
        L8:
            int r2 = r6.f18196a
            if (r0 >= r2) goto L7c
            int[] r2 = r6.f18197b
            r2 = r2[r0]
            int r3 = r2 >>> 3
            r2 = r2 & 7
            if (r2 == 0) goto L69
            r4 = 1
            if (r2 == r4) goto L5a
            r4 = 2
            if (r2 == r4) goto L4f
            r5 = 3
            if (r2 == r5) goto L3b
            r4 = 5
            if (r2 != r4) goto L31
            java.lang.Object[] r2 = r6.f18198c
            r2 = r2[r0]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = p221m9.AbstractC4463k.m10143o(r3, r2)
            goto L77
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            m9.a0$a r1 = p221m9.C4434a0.m9898d()
            r0.<init>(r1)
            throw r0
        L3b:
            int r2 = p221m9.AbstractC4463k.m10131F(r3)
            int r2 = r2 * 2
            java.lang.Object[] r3 = r6.f18198c
            r3 = r3[r0]
            m9.n1 r3 = (p221m9.C4474n1) r3
            int r3 = r3.m10219a()
            int r3 = r3 + r2
            int r3 = r3 + r1
            r1 = r3
            goto L79
        L4f:
            java.lang.Object[] r2 = r6.f18198c
            r2 = r2[r0]
            m9.h r2 = (p221m9.AbstractC4454h) r2
            int r2 = p221m9.AbstractC4463k.m10139k(r3, r2)
            goto L77
        L5a:
            java.lang.Object[] r2 = r6.f18198c
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = p221m9.AbstractC4463k.m10144p(r3, r4)
            goto L77
        L69:
            java.lang.Object[] r2 = r6.f18198c
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = p221m9.AbstractC4463k.m10134I(r3, r4)
        L77:
            int r2 = r2 + r1
            r1 = r2
        L79:
            int r0 = r0 + 1
            goto L8
        L7c:
            r6.f18199d = r1
            return r1
    }

    /* renamed from: c */
    public void m10220c(int r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r3.f18200e
            if (r0 == 0) goto L31
            int r0 = r3.f18196a
            int[] r1 = r3.f18197b
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
            r3.f18197b = r1
            java.lang.Object[] r1 = r3.f18198c
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f18198c = r0
        L22:
            int[] r0 = r3.f18197b
            int r1 = r3.f18196a
            r0[r1] = r4
            java.lang.Object[] r4 = r3.f18198c
            r4[r1] = r5
            int r1 = r1 + 1
            r3.f18196a = r1
            return
        L31:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    /* renamed from: e */
    public void m10221e(p221m9.InterfaceC4498v1 r4) {
            r3 = this;
            int r0 = r3.f18196a
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Objects.requireNonNull(r4)
            r0 = 0
        L9:
            int r1 = r3.f18196a
            if (r0 >= r1) goto L1b
            int[] r1 = r3.f18197b
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.f18198c
            r2 = r2[r0]
            m10218d(r1, r2, r4)
            int r0 = r0 + 1
            goto L9
        L1b:
            return
    }

    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 != 0) goto L8
            return r1
        L8:
            boolean r2 = r9 instanceof p221m9.C4474n1
            if (r2 != 0) goto Ld
            return r1
        Ld:
            m9.n1 r9 = (p221m9.C4474n1) r9
            int r2 = r8.f18196a
            int r3 = r9.f18196a
            if (r2 != r3) goto L47
            int[] r3 = r8.f18197b
            int[] r4 = r9.f18197b
            r5 = 0
        L1a:
            if (r5 >= r2) goto L27
            r6 = r3[r5]
            r7 = r4[r5]
            if (r6 == r7) goto L24
            r2 = 0
            goto L28
        L24:
            int r5 = r5 + 1
            goto L1a
        L27:
            r2 = 1
        L28:
            if (r2 == 0) goto L47
            java.lang.Object[] r2 = r8.f18198c
            java.lang.Object[] r9 = r9.f18198c
            int r3 = r8.f18196a
            r4 = 0
        L31:
            if (r4 >= r3) goto L42
            r5 = r2[r4]
            r6 = r9[r4]
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3f
            r9 = 0
            goto L43
        L3f:
            int r4 = r4 + 1
            goto L31
        L42:
            r9 = 1
        L43:
            if (r9 != 0) goto L46
            goto L47
        L46:
            return r0
        L47:
            return r1
    }

    public int hashCode() {
            r8 = this;
            int r0 = r8.f18196a
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int[] r2 = r8.f18197b
            r3 = 0
            r4 = 17
            r5 = 0
            r6 = 17
        Lf:
            if (r5 >= r0) goto L19
            int r6 = r6 * 31
            r7 = r2[r5]
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto Lf
        L19:
            int r1 = r1 + r6
            int r1 = r1 * 31
            java.lang.Object[] r0 = r8.f18198c
            int r2 = r8.f18196a
        L20:
            if (r3 >= r2) goto L2e
            int r4 = r4 * 31
            r5 = r0[r3]
            int r5 = r5.hashCode()
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L20
        L2e:
            int r1 = r1 + r4
            return r1
    }
}
