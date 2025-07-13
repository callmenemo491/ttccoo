package p182k4;

/* renamed from: k4.d */
/* loaded from: classes.dex */
public final class C3689d extends p088f4.AbstractC2031n1 {

    /* renamed from: e0 */
    public static final p182k4.C3689d f16323e0 = null;

    /* renamed from: Z */
    public final android.util.SparseIntArray f16324Z;

    /* renamed from: a0 */
    public final int[] f16325a0;

    /* renamed from: b0 */
    public final long[] f16326b0;

    /* renamed from: c0 */
    public final long[] f16327c0;

    /* renamed from: d0 */
    public final boolean[] f16328d0;

    /* renamed from: k4.d$a */
    public static final class a {

        /* renamed from: d */
        public static final p182k4.C3689d.a f16329d = null;

        /* renamed from: a */
        public final long f16330a;

        /* renamed from: b */
        public final long f16331b;

        /* renamed from: c */
        public final boolean f16332c;

        static {
                k4.d$a r6 = new k4.d$a
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r5 = 0
                r0 = r6
                r0.<init>(r1, r3, r5)
                p182k4.C3689d.a.f16329d = r6
                return
        }

        public a(long r1, long r3, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.f16330a = r1
                r0.f16331b = r3
                r0.f16332c = r5
                return
        }
    }

    static {
            k4.d r0 = new k4.d
            r1 = 0
            int[] r1 = new int[r1]
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.<init>(r1, r2)
            p182k4.C3689d.f16323e0 = r0
            return
    }

    public C3689d(int[] r8, android.util.SparseArray<p182k4.C3689d.a> r9) {
            r7 = this;
            r7.<init>()
            int r0 = r8.length
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>(r0)
            r7.f16324Z = r1
            int[] r8 = java.util.Arrays.copyOf(r8, r0)
            r7.f16325a0 = r8
            long[] r8 = new long[r0]
            r7.f16326b0 = r8
            long[] r8 = new long[r0]
            r7.f16327c0 = r8
            boolean[] r8 = new boolean[r0]
            r7.f16328d0 = r8
            r8 = 0
        L1e:
            int[] r0 = r7.f16325a0
            int r1 = r0.length
            if (r8 >= r1) goto L52
            r0 = r0[r8]
            android.util.SparseIntArray r1 = r7.f16324Z
            r1.put(r0, r8)
            k4.d$a r1 = p182k4.C3689d.a.f16329d
            java.lang.Object r0 = r9.get(r0, r1)
            k4.d$a r0 = (p182k4.C3689d.a) r0
            long[] r1 = r7.f16326b0
            long r2 = r0.f16330a
            r1[r8] = r2
            long[] r1 = r7.f16327c0
            long r2 = r0.f16331b
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r2 = 0
        L47:
            r1[r8] = r2
            boolean[] r1 = r7.f16328d0
            boolean r0 = r0.f16332c
            r1[r8] = r0
            int r8 = r8 + 1
            goto L1e
        L52:
            return
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: c */
    public int mo5086c(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Integer
            r1 = -1
            if (r0 == 0) goto L11
            android.util.SparseIntArray r0 = r2.f16324Z
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r1 = r0.get(r3, r1)
        L11:
            return r1
    }

    @Override // p088f4.AbstractC2031n1
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p182k4.C3689d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k4.d r5 = (p182k4.C3689d) r5
            int[] r1 = r4.f16325a0
            int[] r3 = r5.f16325a0
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L35
            long[] r1 = r4.f16326b0
            long[] r3 = r5.f16326b0
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L35
            long[] r1 = r4.f16327c0
            long[] r3 = r5.f16327c0
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L35
            boolean[] r1 = r4.f16328d0
            boolean[] r5 = r5.f16328d0
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L35
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: h */
    public p088f4.AbstractC2031n1.b mo5089h(int r11, p088f4.AbstractC2031n1.b r12, boolean r13) {
            r10 = this;
            int[] r13 = r10.f16325a0
            r13 = r13[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            long[] r13 = r10.f16326b0
            r4 = r13[r11]
            java.util.Objects.requireNonNull(r12)
            h5.a r8 = p122h5.C2486a.f11231e0
            r6 = 0
            r9 = 0
            r0 = r12
            r3 = r11
            r0.m5351g(r1, r2, r3, r4, r6, r8, r9)
            return r12
    }

    @Override // p088f4.AbstractC2031n1
    public int hashCode() {
            r2 = this;
            int[] r0 = r2.f16325a0
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 * 31
            long[] r1 = r2.f16326b0
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            long[] r0 = r2.f16327c0
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean[] r1 = r2.f16328d0
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: j */
    public int mo5179j() {
            r1 = this;
            int[] r0 = r1.f16325a0
            int r0 = r0.length
            return r0
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: n */
    public java.lang.Object mo5092n(int r2) {
            r1 = this;
            int[] r0 = r1.f16325a0
            r2 = r0[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: p */
    public p088f4.AbstractC2031n1.d mo5093p(int r36, p088f4.AbstractC2031n1.d r37, long r38) {
            r35 = this;
            r0 = r35
            long[] r1 = r0.f16326b0
            r16 = r1[r36]
            r1 = 0
            r2 = 1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r5 != 0) goto L13
            r12 = 1
            goto L14
        L13:
            r12 = 0
        L14:
            r24 = 0
            r20 = 0
            f4.j0$d$a r3 = new f4.j0$d$a
            r3.<init>()
            f4.j0$f$a r4 = new f4.j0$f$a
            r5 = 0
            r4.<init>(r5)
            java.util.List r23 = java.util.Collections.emptyList()
            b9.n<java.lang.Object> r25 = p026b9.C0693c0.f3898c0
            f4.j0$g$a r6 = new f4.j0$g$a
            r6.<init>()
            android.net.Uri r19 = android.net.Uri.EMPTY
            int[] r7 = r0.f16325a0
            r7 = r7[r36]
            java.lang.Integer r26 = java.lang.Integer.valueOf(r7)
            android.net.Uri r7 = r4.f9007b
            if (r7 == 0) goto L40
            java.util.UUID r7 = r4.f9006a
            if (r7 == 0) goto L41
        L40:
            r1 = 1
        L41:
            p371v5.C6549a.m13291e(r1)
            if (r19 == 0) goto L62
            f4.j0$i r1 = new f4.j0$i
            java.util.UUID r2 = r4.f9006a
            if (r2 == 0) goto L54
            f4.j0$f r2 = new f4.j0$f
            r2.<init>(r4, r5)
            r21 = r2
            goto L56
        L54:
            r21 = r5
        L56:
            r22 = 0
            r27 = 0
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r31 = r1
            goto L64
        L62:
            r31 = r5
        L64:
            f4.j0 r4 = new f4.j0
            f4.j0$e r30 = r3.m5265a()
            java.util.Objects.requireNonNull(r6)
            f4.j0$g r1 = new f4.j0$g
            r1.<init>(r6, r5)
            f4.k0 r33 = p088f4.C2021k0.f9094F0
            r34 = 0
            java.lang.String r29 = ""
            r28 = r4
            r32 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34)
            int[] r1 = r0.f16325a0
            r1 = r1[r36]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = r12 ^ 1
            boolean[] r1 = r0.f16328d0
            boolean r1 = r1[r36]
            if (r1 == 0) goto La3
            f4.j0$g r1 = r4.f8972a0
            r13 = r1
            goto La4
        La3:
            r13 = r5
        La4:
            long[] r1 = r0.f16327c0
            r14 = r1[r36]
            r20 = 0
            r1 = r37
            r3 = r4
            r4 = r6
            r5 = r7
            r7 = r9
            r9 = r18
            r18 = r36
            r19 = r36
            r1.m5356e(r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r18, r19, r20)
            return r37
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: q */
    public int mo5180q() {
            r1 = this;
            int[] r0 = r1.f16325a0
            int r0 = r0.length
            return r0
    }
}
