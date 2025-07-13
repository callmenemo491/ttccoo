package p185k7;

/* renamed from: k7.n5 */
/* loaded from: classes.dex */
public final class C3909n5 {

    /* renamed from: a */
    public final p185k7.AbstractC3896m5 f16756a;

    public C3909n5(p185k7.AbstractC3896m5 r2) {
            r1 = this;
            r1.<init>()
            java.nio.charset.Charset r0 = p185k7.C3871k6.f16722a
            r1.f16756a = r2
            r2.f16747Z = r1
            return
    }

    /* renamed from: a */
    public final void m8842a(int r3, int r4) {
            r2 = this;
            k7.m5 r0 = r2.f16756a
            int r1 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r1
            r0.mo8763A(r3, r4)
            return
    }

    /* renamed from: b */
    public final void m8843b(int r5, long r6) {
            r4 = this;
            k7.m5 r0 = r4.f16756a
            long r1 = r6 + r6
            r3 = 63
            long r6 = r6 >> r3
            long r6 = r6 ^ r1
            r0.mo8765C(r5, r6)
            return
    }

    /* renamed from: c */
    public final void m8844c(int r2, double r3) {
            r1 = this;
            k7.m5 r0 = r1.f16756a
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r0.mo8775u(r2, r3)
            return
    }

    /* renamed from: d */
    public final void m8845d(int r2, float r3) {
            r1 = this;
            k7.m5 r0 = r1.f16756a
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            r0.mo8773r(r2, r3)
            return
    }

    /* renamed from: e */
    public final void m8846e(int r3, java.lang.Object r4, p185k7.InterfaceC3950q7 r5) {
            r2 = this;
            k7.m5 r0 = r2.f16756a
            k7.f7 r4 = (p185k7.InterfaceC3802f7) r4
            r1 = 3
            r0.mo8780z(r3, r1)
            k7.n5 r1 = r0.f16747Z
            r5.mo8688g(r4, r1)
            r4 = 4
            r0.mo8780z(r3, r4)
            return
    }

    /* renamed from: f */
    public final void m8847f(int r4, java.lang.Object r5, p185k7.InterfaceC3950q7 r6) {
            r3 = this;
            k7.m5 r0 = r3.f16756a
            k7.f7 r5 = (p185k7.InterfaceC3802f7) r5
            k7.k5 r0 = (p185k7.C3870k5) r0
            int r4 = r4 << 3
            r4 = r4 | 2
            r0.mo8764B(r4)
            r4 = r5
            k7.z4 r4 = (p185k7.AbstractC4064z4) r4
            int r1 = r4.mo8497f()
            r2 = -1
            if (r1 != r2) goto L1e
            int r1 = r6.mo8686e(r4)
            r4.mo8498h(r1)
        L1e:
            r0.mo8764B(r1)
            k7.n5 r4 = r0.f16747Z
            r6.mo8688g(r5, r4)
            return
    }
}
