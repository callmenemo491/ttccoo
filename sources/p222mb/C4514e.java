package p222mb;

/* renamed from: mb.e */
/* loaded from: classes.dex */
public final class C4514e extends p290qb.C5612a {

    /* renamed from: s0 */
    public static final java.lang.Object f18324s0 = null;

    /* renamed from: o0 */
    public java.lang.Object[] f18325o0;

    /* renamed from: p0 */
    public int f18326p0;

    /* renamed from: q0 */
    public java.lang.String[] f18327q0;

    /* renamed from: r0 */
    public int[] f18328r0;

    /* renamed from: mb.e$a */
    public class a extends java.io.Reader {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // java.io.Reader
        public int read(char[] r1, int r2, int r3) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }
    }

    static {
            mb.e$a r0 = new mb.e$a
            r0.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p222mb.C4514e.f18324s0 = r0
            return
    }

    /* renamed from: S */
    private java.lang.String m10395S() {
            r2 = this;
            java.lang.String r0 = " at path "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.mo10401J()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p290qb.C5612a
    /* renamed from: A */
    public void mo10396A() {
            r3 = this;
            qb.b r0 = p290qb.EnumC5613b.f21793b0
            r3.m10398G0(r0)
            r3.m10400I0()
            r3.m10400I0()
            int r0 = r3.f18326p0
            if (r0 <= 0) goto L19
            int[] r1 = r3.f18328r0
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
        L19:
            return
    }

    @Override // p290qb.C5612a
    /* renamed from: E0 */
    public void mo10397E0() {
            r3 = this;
            qb.b r0 = r3.mo10414z0()
            qb.b r1 = p290qb.EnumC5613b.f21794c0
            java.lang.String r2 = "null"
            if (r0 != r1) goto L16
            r3.mo10409f0()
            java.lang.String[] r0 = r3.f18327q0
            int r1 = r3.f18326p0
            int r1 = r1 + (-2)
            r0[r1] = r2
            goto L23
        L16:
            r3.m10400I0()
            int r0 = r3.f18326p0
            if (r0 <= 0) goto L23
            java.lang.String[] r1 = r3.f18327q0
            int r0 = r0 + (-1)
            r1[r0] = r2
        L23:
            int r0 = r3.f18326p0
            if (r0 <= 0) goto L31
            int[] r1 = r3.f18328r0
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
        L31:
            return
    }

    /* renamed from: G0 */
    public final void m10398G0(p290qb.EnumC5613b r4) {
            r3 = this;
            qb.b r0 = r3.mo10414z0()
            if (r0 != r4) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " but was "
            r1.append(r4)
            qb.b r4 = r3.mo10414z0()
            r1.append(r4)
            java.lang.String r4 = r3.m10395S()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: H0 */
    public final java.lang.Object m10399H0() {
            r2 = this;
            java.lang.Object[] r0 = r2.f18325o0
            int r1 = r2.f18326p0
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    /* renamed from: I0 */
    public final java.lang.Object m10400I0() {
            r4 = this;
            java.lang.Object[] r0 = r4.f18325o0
            int r1 = r4.f18326p0
            int r1 = r1 + (-1)
            r4.f18326p0 = r1
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            return r2
    }

    @Override // p290qb.C5612a
    /* renamed from: J */
    public java.lang.String mo10401J() {
            r4 = this;
            r0 = 36
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            r1 = 0
        L7:
            int r2 = r4.f18326p0
            if (r1 >= r2) goto L4e
            java.lang.Object[] r2 = r4.f18325o0
            r3 = r2[r1]
            boolean r3 = r3 instanceof p169jb.C3470m
            if (r3 == 0) goto L2d
            int r1 = r1 + 1
            r2 = r2[r1]
            boolean r2 = r2 instanceof java.util.Iterator
            if (r2 == 0) goto L4b
            r2 = 91
            r0.append(r2)
            int[] r2 = r4.f18328r0
            r2 = r2[r1]
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            goto L4b
        L2d:
            r3 = r2[r1]
            boolean r3 = r3 instanceof p169jb.C3476s
            if (r3 == 0) goto L4b
            int r1 = r1 + 1
            r2 = r2[r1]
            boolean r2 = r2 instanceof java.util.Iterator
            if (r2 == 0) goto L4b
            r2 = 46
            r0.append(r2)
            java.lang.String[] r2 = r4.f18327q0
            r3 = r2[r1]
            if (r3 == 0) goto L4b
            r2 = r2[r1]
            r0.append(r2)
        L4b:
            int r1 = r1 + 1
            goto L7
        L4e:
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: J0 */
    public final void m10402J0(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f18326p0
            java.lang.Object[] r1 = r3.f18325o0
            int r2 = r1.length
            if (r0 != r2) goto L21
            int r0 = r0 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f18325o0 = r1
            int[] r1 = r3.f18328r0
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f18328r0 = r1
            java.lang.String[] r1 = r3.f18327q0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.f18327q0 = r0
        L21:
            java.lang.Object[] r0 = r3.f18325o0
            int r1 = r3.f18326p0
            int r2 = r1 + 1
            r3.f18326p0 = r2
            r0[r1] = r4
            return
    }

    @Override // p290qb.C5612a
    /* renamed from: Q */
    public boolean mo10403Q() {
            r2 = this;
            qb.b r0 = r2.mo10414z0()
            qb.b r1 = p290qb.EnumC5613b.f21793b0
            if (r0 == r1) goto Le
            qb.b r1 = p290qb.EnumC5613b.f21791Z
            if (r0 == r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // p290qb.C5612a
    /* renamed from: V */
    public boolean mo10404V() {
            r4 = this;
            qb.b r0 = p290qb.EnumC5613b.f21797f0
            r4.m10398G0(r0)
            java.lang.Object r0 = r4.m10400I0()
            jb.t r0 = (p169jb.C3477t) r0
            boolean r0 = r0.m7952m()
            int r1 = r4.f18326p0
            if (r1 <= 0) goto L1d
            int[] r2 = r4.f18328r0
            int r1 = r1 + (-1)
            r3 = r2[r1]
            int r3 = r3 + 1
            r2[r1] = r3
        L1d:
            return r0
    }

    @Override // p290qb.C5612a
    /* renamed from: Z */
    public double mo10405Z() {
            r5 = this;
            qb.b r0 = r5.mo10414z0()
            qb.b r1 = p290qb.EnumC5613b.f21796e0
            if (r0 == r1) goto L33
            qb.b r2 = p290qb.EnumC5613b.f21795d0
            if (r0 != r2) goto Ld
            goto L33
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " but was "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r5.m10395S()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L33:
            java.lang.Object r0 = r5.m10399H0()
            jb.t r0 = (p169jb.C3477t) r0
            java.lang.Object r1 = r0.f14969a
            boolean r1 = r1 instanceof java.lang.Number
            if (r1 == 0) goto L48
            java.lang.Number r0 = r0.m7953n()
            double r0 = r0.doubleValue()
            goto L50
        L48:
            java.lang.String r0 = r0.mo7944l()
            double r0 = java.lang.Double.parseDouble(r0)
        L50:
            boolean r2 = r5.f21776Z
            if (r2 != 0) goto L78
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L61
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 != 0) goto L61
            goto L78
        L61:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L78:
            r5.m10400I0()
            int r2 = r5.f18326p0
            if (r2 <= 0) goto L89
            int[] r3 = r5.f18328r0
            int r2 = r2 + (-1)
            r4 = r3[r2]
            int r4 = r4 + 1
            r3[r2] = r4
        L89:
            return r0
    }

    @Override // p290qb.C5612a
    /* renamed from: a */
    public void mo10406a() {
            r3 = this;
            qb.b r0 = p290qb.EnumC5613b.f21790Y
            r3.m10398G0(r0)
            java.lang.Object r0 = r3.m10399H0()
            jb.m r0 = (p169jb.C3470m) r0
            java.util.Iterator r0 = r0.iterator()
            r3.m10402J0(r0)
            int[] r0 = r3.f18328r0
            int r1 = r3.f18326p0
            int r1 = r1 + (-1)
            r2 = 0
            r0[r1] = r2
            return
    }

    @Override // p290qb.C5612a
    /* renamed from: b0 */
    public int mo10407b0() {
            r5 = this;
            qb.b r0 = r5.mo10414z0()
            qb.b r1 = p290qb.EnumC5613b.f21796e0
            if (r0 == r1) goto L33
            qb.b r2 = p290qb.EnumC5613b.f21795d0
            if (r0 != r2) goto Ld
            goto L33
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " but was "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r5.m10395S()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L33:
            java.lang.Object r0 = r5.m10399H0()
            jb.t r0 = (p169jb.C3477t) r0
            int r0 = r0.mo7941a()
            r5.m10400I0()
            int r1 = r5.f18326p0
            if (r1 <= 0) goto L4e
            int[] r2 = r5.f18328r0
            int r1 = r1 + (-1)
            r3 = r2[r1]
            int r3 = r3 + 1
            r2[r1] = r3
        L4e:
            return r0
    }

    @Override // p290qb.C5612a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r4 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r2 = p222mb.C4514e.f18324s0
            r3 = 0
            r1[r3] = r2
            r4.f18325o0 = r1
            r4.f18326p0 = r0
            return
    }

    @Override // p290qb.C5612a
    /* renamed from: d0 */
    public long mo10408d0() {
            r5 = this;
            qb.b r0 = r5.mo10414z0()
            qb.b r1 = p290qb.EnumC5613b.f21796e0
            if (r0 == r1) goto L33
            qb.b r2 = p290qb.EnumC5613b.f21795d0
            if (r0 != r2) goto Ld
            goto L33
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " but was "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r5.m10395S()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L33:
            java.lang.Object r0 = r5.m10399H0()
            jb.t r0 = (p169jb.C3477t) r0
            long r0 = r0.mo7942h()
            r5.m10400I0()
            int r2 = r5.f18326p0
            if (r2 <= 0) goto L4e
            int[] r3 = r5.f18328r0
            int r2 = r2 + (-1)
            r4 = r3[r2]
            int r4 = r4 + 1
            r3[r2] = r4
        L4e:
            return r0
    }

    @Override // p290qb.C5612a
    /* renamed from: f0 */
    public java.lang.String mo10409f0() {
            r4 = this;
            qb.b r0 = p290qb.EnumC5613b.f21794c0
            r4.m10398G0(r0)
            java.lang.Object r0 = r4.m10399H0()
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String[] r2 = r4.f18327q0
            int r3 = r4.f18326p0
            int r3 = r3 + (-1)
            r2[r3] = r1
            java.lang.Object r0 = r0.getValue()
            r4.m10402J0(r0)
            return r1
    }

    @Override // p290qb.C5612a
    /* renamed from: h */
    public void mo10410h() {
            r2 = this;
            qb.b r0 = p290qb.EnumC5613b.f21792a0
            r2.m10398G0(r0)
            java.lang.Object r0 = r2.m10399H0()
            jb.s r0 = (p169jb.C3476s) r0
            lb.r<java.lang.String, jb.p> r0 = r0.f14968a
            java.util.Set r0 = r0.entrySet()
            lb.r$b r0 = (lb.C4255r.b) r0
            lb.r$b$a r1 = new lb.r$b$a
            r1.<init>(r0)
            r2.m10402J0(r1)
            return
    }

    @Override // p290qb.C5612a
    /* renamed from: m0 */
    public void mo10411m0() {
            r3 = this;
            qb.b r0 = p290qb.EnumC5613b.f21798g0
            r3.m10398G0(r0)
            r3.m10400I0()
            int r0 = r3.f18326p0
            if (r0 <= 0) goto L16
            int[] r1 = r3.f18328r0
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
        L16:
            return
    }

    @Override // p290qb.C5612a
    /* renamed from: n */
    public void mo10412n() {
            r3 = this;
            qb.b r0 = p290qb.EnumC5613b.f21791Z
            r3.m10398G0(r0)
            r3.m10400I0()
            r3.m10400I0()
            int r0 = r3.f18326p0
            if (r0 <= 0) goto L19
            int[] r1 = r3.f18328r0
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
        L19:
            return
    }

    @Override // p290qb.C5612a
    public java.lang.String toString() {
            r1 = this;
            java.lang.Class<mb.e> r0 = p222mb.C4514e.class
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    @Override // p290qb.C5612a
    /* renamed from: x0 */
    public java.lang.String mo10413x0() {
            r5 = this;
            qb.b r0 = r5.mo10414z0()
            qb.b r1 = p290qb.EnumC5613b.f21795d0
            if (r0 == r1) goto L33
            qb.b r2 = p290qb.EnumC5613b.f21796e0
            if (r0 != r2) goto Ld
            goto L33
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " but was "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r5.m10395S()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L33:
            java.lang.Object r0 = r5.m10400I0()
            jb.t r0 = (p169jb.C3477t) r0
            java.lang.String r0 = r0.mo7944l()
            int r1 = r5.f18326p0
            if (r1 <= 0) goto L4b
            int[] r2 = r5.f18328r0
            int r1 = r1 + (-1)
            r3 = r2[r1]
            int r3 = r3 + 1
            r2[r1] = r3
        L4b:
            return r0
    }

    @Override // p290qb.C5612a
    /* renamed from: z0 */
    public p290qb.EnumC5613b mo10414z0() {
            r3 = this;
            int r0 = r3.f18326p0
            if (r0 != 0) goto L7
            qb.b r0 = p290qb.EnumC5613b.f21799h0
            return r0
        L7:
            java.lang.Object r0 = r3.m10399H0()
            boolean r1 = r0 instanceof java.util.Iterator
            if (r1 == 0) goto L3a
            java.lang.Object[] r1 = r3.f18325o0
            int r2 = r3.f18326p0
            int r2 = r2 + (-2)
            r1 = r1[r2]
            boolean r1 = r1 instanceof p169jb.C3476s
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            if (r1 == 0) goto L26
            qb.b r0 = p290qb.EnumC5613b.f21794c0
            return r0
        L26:
            java.lang.Object r0 = r0.next()
            r3.m10402J0(r0)
            qb.b r0 = r3.mo10414z0()
            return r0
        L32:
            if (r1 == 0) goto L37
            qb.b r0 = p290qb.EnumC5613b.f21793b0
            goto L39
        L37:
            qb.b r0 = p290qb.EnumC5613b.f21791Z
        L39:
            return r0
        L3a:
            boolean r1 = r0 instanceof p169jb.C3476s
            if (r1 == 0) goto L41
            qb.b r0 = p290qb.EnumC5613b.f21792a0
            return r0
        L41:
            boolean r1 = r0 instanceof p169jb.C3470m
            if (r1 == 0) goto L48
            qb.b r0 = p290qb.EnumC5613b.f21790Y
            return r0
        L48:
            boolean r1 = r0 instanceof p169jb.C3477t
            if (r1 == 0) goto L6b
            jb.t r0 = (p169jb.C3477t) r0
            java.lang.Object r0 = r0.f14969a
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L57
            qb.b r0 = p290qb.EnumC5613b.f21795d0
            return r0
        L57:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L5e
            qb.b r0 = p290qb.EnumC5613b.f21797f0
            return r0
        L5e:
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L65
            qb.b r0 = p290qb.EnumC5613b.f21796e0
            return r0
        L65:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L6b:
            boolean r1 = r0 instanceof p169jb.C3475r
            if (r1 == 0) goto L72
            qb.b r0 = p290qb.EnumC5613b.f21798g0
            return r0
        L72:
            java.lang.Object r1 = p222mb.C4514e.f18324s0
            if (r0 != r1) goto L7e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L7e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }
}
