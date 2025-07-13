package p222mb;

/* renamed from: mb.f */
/* loaded from: classes.dex */
public final class C4515f extends p290qb.C5614c {

    /* renamed from: m0 */
    public static final java.io.Writer f18329m0 = null;

    /* renamed from: n0 */
    public static final p169jb.C3477t f18330n0 = null;

    /* renamed from: j0 */
    public final java.util.List<p169jb.AbstractC3473p> f18331j0;

    /* renamed from: k0 */
    public java.lang.String f18332k0;

    /* renamed from: l0 */
    public p169jb.AbstractC3473p f18333l0;

    /* renamed from: mb.f$a */
    public class a extends java.io.Writer {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // java.io.Writer
        public void write(char[] r1, int r2, int r3) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }
    }

    static {
            mb.f$a r0 = new mb.f$a
            r0.<init>()
            p222mb.C4515f.f18329m0 = r0
            jb.t r0 = new jb.t
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            p222mb.C4515f.f18330n0 = r0
            return
    }

    public C4515f() {
            r1 = this;
            java.io.Writer r0 = p222mb.C4515f.f18329m0
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f18331j0 = r0
            jb.r r0 = p169jb.C3475r.f14967a
            r1.f18333l0 = r0
            return
    }

    @Override // p290qb.C5614c
    /* renamed from: A */
    public p290qb.C5614c mo10415A() {
            r2 = this;
            java.util.List<jb.p> r0 = r2.f18331j0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            java.lang.String r0 = r2.f18332k0
            if (r0 != 0) goto L26
            jb.p r0 = r2.m10426y0()
            boolean r0 = r0 instanceof p169jb.C3476s
            if (r0 == 0) goto L20
            java.util.List<jb.p> r0 = r2.f18331j0
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return r2
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // p290qb.C5614c
    /* renamed from: L */
    public p290qb.C5614c mo10416L(java.lang.String r2) {
            r1 = this;
            java.util.List<jb.p> r0 = r1.f18331j0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.lang.String r0 = r1.f18332k0
            if (r0 != 0) goto L1d
            jb.p r0 = r1.m10426y0()
            boolean r0 = r0 instanceof p169jb.C3476s
            if (r0 == 0) goto L17
            r1.f18332k0 = r2
            return r1
        L17:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
        L1d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
    }

    @Override // p290qb.C5614c
    /* renamed from: R */
    public p290qb.C5614c mo10417R() {
            r1 = this;
            jb.r r0 = p169jb.C3475r.f14967a
            r1.m10427z0(r0)
            return r1
    }

    @Override // p290qb.C5614c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.util.List<jb.p> r0 = r2.f18331j0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            java.util.List<jb.p> r0 = r2.f18331j0
            jb.t r1 = p222mb.C4515f.f18330n0
            r0.add(r1)
            return
        L10:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Incomplete document"
            r0.<init>(r1)
            throw r0
    }

    @Override // p290qb.C5614c
    /* renamed from: d0 */
    public p290qb.C5614c mo10418d0(long r2) {
            r1 = this;
            jb.t r0 = new jb.t
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.<init>(r2)
            r1.m10427z0(r0)
            return r1
    }

    @Override // p290qb.C5614c
    /* renamed from: f0 */
    public p290qb.C5614c mo10419f0(java.lang.Boolean r2) {
            r1 = this;
            if (r2 != 0) goto L8
            jb.r r2 = p169jb.C3475r.f14967a
            r1.m10427z0(r2)
            return r1
        L8:
            jb.t r0 = new jb.t
            r0.<init>(r2)
            r1.m10427z0(r0)
            return r1
    }

    @Override // p290qb.C5614c, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    @Override // p290qb.C5614c
    /* renamed from: h */
    public p290qb.C5614c mo10420h() {
            r2 = this;
            jb.m r0 = new jb.m
            r0.<init>()
            r2.m10427z0(r0)
            java.util.List<jb.p> r1 = r2.f18331j0
            r1.add(r0)
            return r2
    }

    @Override // p290qb.C5614c
    /* renamed from: i */
    public p290qb.C5614c mo10421i() {
            r2 = this;
            jb.s r0 = new jb.s
            r0.<init>()
            r2.m10427z0(r0)
            java.util.List<jb.p> r1 = r2.f18331j0
            r1.add(r0)
            return r2
    }

    @Override // p290qb.C5614c
    /* renamed from: i0 */
    public p290qb.C5614c mo10422i0(java.lang.Number r4) {
            r3 = this;
            if (r4 != 0) goto L8
            jb.r r4 = p169jb.C3475r.f14967a
            r3.m10427z0(r4)
            return r3
        L8:
            boolean r0 = r3.f21808d0
            if (r0 != 0) goto L34
            double r0 = r4.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L1d
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 != 0) goto L1d
            goto L34
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "JSON forbids NaN and infinities: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L34:
            jb.t r0 = new jb.t
            r0.<init>(r4)
            r3.m10427z0(r0)
            return r3
    }

    @Override // p290qb.C5614c
    /* renamed from: m0 */
    public p290qb.C5614c mo10423m0(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L8
            jb.r r2 = p169jb.C3475r.f14967a
            r1.m10427z0(r2)
            return r1
        L8:
            jb.t r0 = new jb.t
            r0.<init>(r2)
            r1.m10427z0(r0)
            return r1
    }

    @Override // p290qb.C5614c
    /* renamed from: n */
    public p290qb.C5614c mo10424n() {
            r2 = this;
            java.util.List<jb.p> r0 = r2.f18331j0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            java.lang.String r0 = r2.f18332k0
            if (r0 != 0) goto L26
            jb.p r0 = r2.m10426y0()
            boolean r0 = r0 instanceof p169jb.C3470m
            if (r0 == 0) goto L20
            java.util.List<jb.p> r0 = r2.f18331j0
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return r2
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // p290qb.C5614c
    /* renamed from: s0 */
    public p290qb.C5614c mo10425s0(boolean r2) {
            r1 = this;
            jb.t r0 = new jb.t
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.<init>(r2)
            r1.m10427z0(r0)
            return r1
    }

    /* renamed from: y0 */
    public final p169jb.AbstractC3473p m10426y0() {
            r2 = this;
            java.util.List<jb.p> r0 = r2.f18331j0
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            jb.p r0 = (p169jb.AbstractC3473p) r0
            return r0
    }

    /* renamed from: z0 */
    public final void m10427z0(p169jb.AbstractC3473p r3) {
            r2 = this;
            java.lang.String r0 = r2.f18332k0
            if (r0 == 0) goto L1d
            boolean r0 = r3 instanceof p169jb.C3475r
            if (r0 == 0) goto Lc
            boolean r0 = r2.f21811g0
            if (r0 == 0) goto L19
        Lc:
            jb.p r0 = r2.m10426y0()
            jb.s r0 = (p169jb.C3476s) r0
            java.lang.String r1 = r2.f18332k0
            lb.r<java.lang.String, jb.p> r0 = r0.f14968a
            r0.put(r1, r3)
        L19:
            r3 = 0
            r2.f18332k0 = r3
            goto L37
        L1d:
            java.util.List<jb.p> r0 = r2.f18331j0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L28
            r2.f18333l0 = r3
            goto L37
        L28:
            jb.p r0 = r2.m10426y0()
            boolean r1 = r0 instanceof p169jb.C3470m
            if (r1 == 0) goto L38
            jb.m r0 = (p169jb.C3470m) r0
            java.util.List<jb.p> r0 = r0.f14966Y
            r0.add(r3)
        L37:
            return
        L38:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }
}
