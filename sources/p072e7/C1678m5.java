package p072e7;

/* renamed from: e7.m5 */
/* loaded from: classes.dex */
public final class C1678m5 {

    /* renamed from: a */
    public final p072e7.AbstractC1668l5 f7690a;

    public C1678m5(p072e7.AbstractC1668l5 r2) {
            r1 = this;
            r1.<init>()
            java.nio.charset.Charset r0 = p072e7.C1619g6.f7568a
            r1.f7690a = r2
            r2.f7687Z = r1
            return
    }

    /* renamed from: a */
    public final void m4340a(int r5, long r6) {
            r4 = this;
            e7.l5 r0 = r4.f7690a
            long r1 = r6 + r6
            r3 = 63
            long r6 = r6 >> r3
            long r6 = r6 ^ r1
            r0.mo4274C(r5, r6)
            return
    }

    /* renamed from: b */
    public final void m4341b(int r2, double r3) {
            r1 = this;
            e7.l5 r0 = r1.f7690a
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r0.mo4284u(r2, r3)
            return
    }

    /* renamed from: c */
    public final void m4342c(int r2, float r3) {
            r1 = this;
            e7.l5 r0 = r1.f7690a
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            r0.mo4282r(r2, r3)
            return
    }

    /* renamed from: d */
    public final void m4343d(int r3, java.lang.Object r4, p072e7.InterfaceC1670l7 r5) {
            r2 = this;
            e7.l5 r0 = r2.f7690a
            e7.a7 r4 = (p072e7.InterfaceC1560a7) r4
            r1 = 3
            r0.mo4289z(r3, r1)
            e7.m5 r1 = r0.f7687Z
            r5.mo4170g(r4, r1)
            r4 = 4
            r0.mo4289z(r3, r4)
            return
    }

    /* renamed from: e */
    public final void m4344e(int r4, java.lang.Object r5, p072e7.InterfaceC1670l7 r6) {
            r3 = this;
            e7.l5 r0 = r3.f7690a
            e7.a7 r5 = (p072e7.InterfaceC1560a7) r5
            e7.j5 r0 = (p072e7.C1648j5) r0
            int r4 = r4 << 3
            r4 = r4 | 2
            r0.mo4273B(r4)
            r4 = r5
            e7.a5 r4 = (p072e7.AbstractC1558a5) r4
            int r1 = r4.mo4120a()
            r2 = -1
            if (r1 != r2) goto L1e
            int r1 = r6.mo4168e(r4)
            r4.mo4121b(r1)
        L1e:
            r0.mo4273B(r1)
            e7.m5 r4 = r0.f7687Z
            r6.mo4170g(r5, r4)
            return
    }

    /* renamed from: f */
    public final void m4345f(int r3, int r4) {
            r2 = this;
            e7.l5 r0 = r2.f7690a
            int r1 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r1
            r0.mo4272A(r3, r4)
            return
    }
}
