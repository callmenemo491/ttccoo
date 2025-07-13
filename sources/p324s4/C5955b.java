package p324s4;

/* renamed from: s4.b */
/* loaded from: classes.dex */
public final class C5955b implements p324s4.InterfaceC5958e {

    /* renamed from: a */
    public final long f22880a;

    /* renamed from: b */
    public final p304r4.C5786g f22881b;

    /* renamed from: c */
    public final p304r4.C5786g f22882c;

    /* renamed from: d */
    public long f22883d;

    public C5955b(long r3, long r5, long r7) {
            r2 = this;
            r2.<init>()
            r2.f22883d = r3
            r2.f22880a = r7
            r4.g r3 = new r4.g
            r4 = 1
            r3.<init>(r4)
            r2.f22881b = r3
            r4.g r7 = new r4.g
            r7.<init>(r4)
            r2.f22882c = r7
            r0 = 0
            r3.m12135a(r0)
            r7.m12135a(r5)
            return
    }

    @Override // p324s4.InterfaceC5958e
    /* renamed from: a */
    public long mo12394a() {
            r2 = this;
            long r0 = r2.f22880a
            return r0
    }

    /* renamed from: b */
    public boolean m12396b(long r5) {
            r4 = this;
            r4.g r0 = r4.f22881b
            int r1 = r0.f22417b
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.m12136b(r1)
            long r5 = r5 - r0
            r0 = 100000(0x186a0, double:4.94066E-319)
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 >= 0) goto L13
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
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
    public long mo12395e(long r3) {
            r2 = this;
            r4.g r0 = r2.f22882c
            r1 = 1
            int r3 = p371v5.C6552b0.m13310c(r0, r3, r1, r1)
            r4.g r4 = r2.f22881b
            long r3 = r4.m12136b(r3)
            return r3
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: g */
    public p216m4.InterfaceC4378w.a mo9743g(long r8) {
            r7 = this;
            r4.g r0 = r7.f22881b
            r1 = 1
            int r0 = p371v5.C6552b0.m13310c(r0, r8, r1, r1)
            m4.x r2 = new m4.x
            r4.g r3 = r7.f22881b
            long r3 = r3.m12136b(r0)
            r4.g r5 = r7.f22882c
            long r5 = r5.m12136b(r0)
            r2.<init>(r3, r5)
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 == 0) goto L3a
            r4.g r8 = r7.f22881b
            int r9 = r8.f22417b
            int r9 = r9 - r1
            if (r0 != r9) goto L24
            goto L3a
        L24:
            m4.x r9 = new m4.x
            int r0 = r0 + r1
            long r3 = r8.m12136b(r0)
            r4.g r8 = r7.f22882c
            long r0 = r8.m12136b(r0)
            r9.<init>(r3, r0)
            m4.w$a r8 = new m4.w$a
            r8.<init>(r2, r9)
            return r8
        L3a:
            m4.w$a r8 = new m4.w$a
            r8.<init>(r2)
            return r8
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: h */
    public long mo9744h() {
            r2 = this;
            long r0 = r2.f22883d
            return r0
    }
}
