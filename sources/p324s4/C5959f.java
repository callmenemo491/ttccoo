package p324s4;

/* renamed from: s4.f */
/* loaded from: classes.dex */
public final class C5959f implements p324s4.InterfaceC5958e {

    /* renamed from: a */
    public final long[] f22908a;

    /* renamed from: b */
    public final long[] f22909b;

    /* renamed from: c */
    public final long f22910c;

    /* renamed from: d */
    public final long f22911d;

    public C5959f(long[] r1, long[] r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.f22908a = r1
            r0.f22909b = r2
            r0.f22910c = r3
            r0.f22911d = r5
            return
    }

    @Override // p324s4.InterfaceC5958e
    /* renamed from: a */
    public long mo12394a() {
            r2 = this;
            long r0 = r2.f22911d
            return r0
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: d */
    public boolean mo9742d() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p324s4.InterfaceC5958e
    /* renamed from: e */
    public long mo12395e(long r4) {
            r3 = this;
            long[] r0 = r3.f22908a
            long[] r1 = r3.f22909b
            r2 = 1
            int r4 = p371v5.C6552b0.m13312e(r1, r4, r2, r2)
            r4 = r0[r4]
            return r4
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: g */
    public p216m4.InterfaceC4378w.a mo9743g(long r10) {
            r9 = this;
            long[] r0 = r9.f22908a
            r1 = 1
            int r0 = p371v5.C6552b0.m13312e(r0, r10, r1, r1)
            m4.x r2 = new m4.x
            long[] r3 = r9.f22908a
            r4 = r3[r0]
            long[] r6 = r9.f22909b
            r7 = r6[r0]
            r2.<init>(r4, r7)
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 >= 0) goto L2d
            int r10 = r3.length
            int r10 = r10 - r1
            if (r0 != r10) goto L1d
            goto L2d
        L1d:
            m4.x r10 = new m4.x
            int r0 = r0 + r1
            r4 = r3[r0]
            r0 = r6[r0]
            r10.<init>(r4, r0)
            m4.w$a r11 = new m4.w$a
            r11.<init>(r2, r10)
            return r11
        L2d:
            m4.w$a r10 = new m4.w$a
            r10.<init>(r2)
            return r10
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: h */
    public long mo9744h() {
            r2 = this;
            long r0 = r2.f22910c
            return r0
    }
}
