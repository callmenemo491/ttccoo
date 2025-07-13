package p072e7;

/* renamed from: e7.i8 */
/* loaded from: classes.dex */
public abstract class AbstractC1641i8 {

    /* renamed from: a */
    public final /* synthetic */ int f7653a;

    /* renamed from: b */
    public final sun.misc.Unsafe f7654b;

    public AbstractC1641i8(sun.misc.Unsafe r2, int r3) {
            r1 = this;
            r1.f7653a = r3
            r0 = 1
            if (r3 == r0) goto L14
            r0 = 2
            if (r3 == r0) goto Le
            r1.<init>()
            r1.f7654b = r2
            return
        Le:
            r1.<init>()
            r1.f7654b = r2
            return
        L14:
            r1.<init>()
            r1.f7654b = r2
            return
    }

    /* renamed from: A */
    private final long m4234A(java.lang.reflect.Field r3) {
            r2 = this;
            sun.misc.Unsafe r0 = r2.f7654b
            long r0 = r0.objectFieldOffset(r3)
            return r0
    }

    /* renamed from: C */
    private final java.lang.Object m4235C(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            java.lang.Object r2 = r0.getObject(r2, r3)
            return r2
    }

    /* renamed from: D */
    private final java.lang.Object m4236D(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            java.lang.Object r2 = r0.getObject(r2, r3)
            return r2
    }

    /* renamed from: E */
    private final java.lang.Object m4237E(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            java.lang.Object r2 = r0.getObject(r2, r3)
            return r2
    }

    /* renamed from: G */
    private final void m4238G(java.lang.Object r2, long r3, int r5) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            r0.putInt(r2, r3, r5)
            return
    }

    /* renamed from: H */
    private final void m4239H(java.lang.Object r2, long r3, int r5) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            r0.putInt(r2, r3, r5)
            return
    }

    /* renamed from: I */
    private final void m4240I(java.lang.Object r2, long r3, int r5) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            r0.putInt(r2, r3, r5)
            return
    }

    /* renamed from: K */
    private final void m4241K(java.lang.Object r7, long r8, long r10) {
            r6 = this;
            sun.misc.Unsafe r0 = r6.f7654b
            r1 = r7
            r2 = r8
            r4 = r10
            r0.putLong(r1, r2, r4)
            return
    }

    /* renamed from: L */
    private final void m4242L(java.lang.Object r7, long r8, long r10) {
            r6 = this;
            sun.misc.Unsafe r0 = r6.f7654b
            r1 = r7
            r2 = r8
            r4 = r10
            r0.putLong(r1, r2, r4)
            return
    }

    /* renamed from: M */
    private final void m4243M(java.lang.Object r7, long r8, long r10) {
            r6 = this;
            sun.misc.Unsafe r0 = r6.f7654b
            r1 = r7
            r2 = r8
            r4 = r10
            r0.putLong(r1, r2, r4)
            return
    }

    /* renamed from: O */
    private final void m4244O(java.lang.Object r2, long r3, java.lang.Object r5) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            r0.putObject(r2, r3, r5)
            return
    }

    /* renamed from: P */
    private final void m4245P(java.lang.Object r2, long r3, java.lang.Object r5) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            r0.putObject(r2, r3, r5)
            return
    }

    /* renamed from: Q */
    private final void m4246Q(java.lang.Object r2, long r3, java.lang.Object r5) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            r0.putObject(r2, r3, r5)
            return
    }

    /* renamed from: i */
    private final int m4247i(java.lang.Class<?> r2) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            int r2 = r0.arrayBaseOffset(r2)
            return r2
    }

    /* renamed from: j */
    private final int m4248j(java.lang.Class<?> r2) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            int r2 = r0.arrayBaseOffset(r2)
            return r2
    }

    /* renamed from: k */
    private final int m4249k(java.lang.Class<?> r2) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            int r2 = r0.arrayBaseOffset(r2)
            return r2
    }

    /* renamed from: m */
    private final int m4250m(java.lang.Class<?> r2) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            int r2 = r0.arrayIndexScale(r2)
            return r2
    }

    /* renamed from: n */
    private final int m4251n(java.lang.Class<?> r2) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            int r2 = r0.arrayIndexScale(r2)
            return r2
    }

    /* renamed from: o */
    private final int m4252o(java.lang.Class<?> r2) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            int r2 = r0.arrayIndexScale(r2)
            return r2
    }

    /* renamed from: q */
    private final int m4253q(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            int r2 = r0.getInt(r2, r3)
            return r2
    }

    /* renamed from: r */
    private final int m4254r(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            int r2 = r0.getInt(r2, r3)
            return r2
    }

    /* renamed from: s */
    private final int m4255s(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            int r2 = r0.getInt(r2, r3)
            return r2
    }

    /* renamed from: u */
    private final long m4256u(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            long r2 = r0.getLong(r2, r3)
            return r2
    }

    /* renamed from: v */
    private final long m4257v(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            long r2 = r0.getLong(r2, r3)
            return r2
    }

    /* renamed from: w */
    private final long m4258w(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.f7654b
            long r2 = r0.getLong(r2, r3)
            return r2
    }

    /* renamed from: y */
    private final long m4259y(java.lang.reflect.Field r3) {
            r2 = this;
            sun.misc.Unsafe r0 = r2.f7654b
            long r0 = r0.objectFieldOffset(r3)
            return r0
    }

    /* renamed from: z */
    private final long m4260z(java.lang.reflect.Field r3) {
            r2 = this;
            sun.misc.Unsafe r0 = r2.f7654b
            long r0 = r0.objectFieldOffset(r3)
            return r0
    }

    /* renamed from: B */
    public final java.lang.Object m4261B(java.lang.Object r2, long r3) {
            r1 = this;
            int r0 = r1.f7653a
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r1.m4237E(r2, r3)
            return r2
        La:
            java.lang.Object r2 = r1.m4236D(r2, r3)
            return r2
        Lf:
            java.lang.Object r2 = r1.m4235C(r2, r3)
            return r2
    }

    /* renamed from: F */
    public final void m4262F(java.lang.Object r2, long r3, int r5) {
            r1 = this;
            int r0 = r1.f7653a
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            r1.m4240I(r2, r3, r5)
            return
        L9:
            r1.m4239H(r2, r3, r5)
            return
        Ld:
            r1.m4238G(r2, r3, r5)
            return
    }

    /* renamed from: J */
    public final void m4263J(java.lang.Object r2, long r3, long r5) {
            r1 = this;
            int r0 = r1.f7653a
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            r1.m4243M(r2, r3, r5)
            return
        L9:
            r1.m4242L(r2, r3, r5)
            return
        Ld:
            r1.m4241K(r2, r3, r5)
            return
    }

    /* renamed from: N */
    public final void m4264N(java.lang.Object r2, long r3, java.lang.Object r5) {
            r1 = this;
            int r0 = r1.f7653a
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            r1.m4246Q(r2, r3, r5)
            return
        L9:
            r1.m4245P(r2, r3, r5)
            return
        Ld:
            r1.m4244O(r2, r3, r5)
            return
    }

    /* renamed from: a */
    public abstract double mo4203a(java.lang.Object r1, long r2);

    /* renamed from: b */
    public abstract float mo4204b(java.lang.Object r1, long r2);

    /* renamed from: c */
    public abstract void mo4205c(java.lang.Object r1, long r2, boolean r4);

    /* renamed from: d */
    public abstract void mo4206d(java.lang.Object r1, long r2, byte r4);

    /* renamed from: e */
    public abstract void mo4207e(java.lang.Object r1, long r2, double r4);

    /* renamed from: f */
    public abstract void mo4208f(java.lang.Object r1, long r2, float r4);

    /* renamed from: g */
    public abstract boolean mo4209g(java.lang.Object r1, long r2);

    /* renamed from: h */
    public final int m4265h(java.lang.Class r2) {
            r1 = this;
            int r0 = r1.f7653a
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            int r2 = r1.m4249k(r2)
            return r2
        La:
            int r2 = r1.m4248j(r2)
            return r2
        Lf:
            int r2 = r1.m4247i(r2)
            return r2
    }

    /* renamed from: l */
    public final int m4266l(java.lang.Class r2) {
            r1 = this;
            int r0 = r1.f7653a
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            int r2 = r1.m4252o(r2)
            return r2
        La:
            int r2 = r1.m4251n(r2)
            return r2
        Lf:
            int r2 = r1.m4250m(r2)
            return r2
    }

    /* renamed from: p */
    public final int m4267p(java.lang.Object r2, long r3) {
            r1 = this;
            int r0 = r1.f7653a
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            int r2 = r1.m4255s(r2, r3)
            return r2
        La:
            int r2 = r1.m4254r(r2, r3)
            return r2
        Lf:
            int r2 = r1.m4253q(r2, r3)
            return r2
    }

    /* renamed from: t */
    public final long m4268t(java.lang.Object r2, long r3) {
            r1 = this;
            int r0 = r1.f7653a
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            long r2 = r1.m4258w(r2, r3)
            return r2
        La:
            long r2 = r1.m4257v(r2, r3)
            return r2
        Lf:
            long r2 = r1.m4256u(r2, r3)
            return r2
    }

    /* renamed from: x */
    public final long m4269x(java.lang.reflect.Field r3) {
            r2 = this;
            int r0 = r2.f7653a
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            long r0 = r2.m4234A(r3)
            return r0
        La:
            long r0 = r2.m4260z(r3)
            return r0
        Lf:
            long r0 = r2.m4259y(r3)
            return r0
    }
}
