package p216m4;

/* renamed from: m4.q */
/* loaded from: classes.dex */
public final class C4372q implements p216m4.InterfaceC4378w {

    /* renamed from: a */
    public final p216m4.C4373r f17910a;

    /* renamed from: b */
    public final long f17911b;

    public C4372q(p216m4.C4373r r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f17910a = r1
            r0.f17911b = r2
            return
    }

    /* renamed from: b */
    public final p216m4.C4379x m9818b(long r3, long r5) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            m4.r r0 = r2.f17910a
            int r0 = r0.f17916e
            long r0 = (long) r0
            long r3 = r3 / r0
            long r0 = r2.f17911b
            long r0 = r0 + r5
            m4.x r5 = new m4.x
            r5.<init>(r3, r0)
            return r5
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: d */
    public boolean mo9742d() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: g */
    public p216m4.InterfaceC4378w.a mo9743g(long r10) {
            r9 = this;
            m4.r r0 = r9.f17910a
            m4.r$a r0 = r0.f17922k
            p371v5.C6549a.m13292f(r0)
            m4.r r0 = r9.f17910a
            m4.r$a r1 = r0.f17922k
            long[] r2 = r1.f17924a
            long[] r1 = r1.f17925b
            long r3 = r0.m9826g(r10)
            r0 = 1
            r5 = 0
            int r3 = p371v5.C6552b0.m13312e(r2, r3, r0, r5)
            r4 = 0
            r6 = -1
            if (r3 != r6) goto L20
            r7 = r4
            goto L22
        L20:
            r7 = r2[r3]
        L22:
            if (r3 != r6) goto L25
            goto L27
        L25:
            r4 = r1[r3]
        L27:
            m4.x r4 = r9.m9818b(r7, r4)
            long r5 = r4.f17940a
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 == 0) goto L45
            int r10 = r2.length
            int r10 = r10 - r0
            if (r3 != r10) goto L36
            goto L45
        L36:
            int r3 = r3 + r0
            r10 = r2[r3]
            r0 = r1[r3]
            m4.x r10 = r9.m9818b(r10, r0)
            m4.w$a r11 = new m4.w$a
            r11.<init>(r4, r10)
            return r11
        L45:
            m4.w$a r10 = new m4.w$a
            r10.<init>(r4)
            return r10
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: h */
    public long mo9744h() {
            r2 = this;
            m4.r r0 = r2.f17910a
            long r0 = r0.m9823d()
            return r0
    }
}
