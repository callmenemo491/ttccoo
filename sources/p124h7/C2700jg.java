package p124h7;

/* renamed from: h7.jg */
/* loaded from: classes.dex */
public final class C2700jg {

    /* renamed from: a */
    public final p124h7.AbstractC2682ig f11684a;

    public C2700jg(p124h7.AbstractC2682ig r2) {
            r1 = this;
            r1.<init>()
            java.nio.charset.Charset r0 = p124h7.C2575d.f11429a
            r1.f11684a = r2
            r2.f11660b = r1
            return
    }

    /* renamed from: a */
    public final void m6877a(int r3, int r4) {
            r2 = this;
            h7.ig r0 = r2.f11684a
            int r1 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r1
            r0.mo6736w(r3, r4)
            return
    }

    /* renamed from: b */
    public final void m6878b(int r5, long r6) {
            r4 = this;
            h7.ig r0 = r4.f11684a
            long r1 = r6 + r6
            r3 = 63
            long r6 = r6 >> r3
            long r6 = r6 ^ r1
            r0.mo6738y(r5, r6)
            return
    }

    /* renamed from: c */
    public final void m6879c(int r2, double r3) {
            r1 = this;
            h7.ig r0 = r1.f11684a
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r0.mo6729p(r2, r3)
            return
    }

    /* renamed from: d */
    public final void m6880d(int r2, float r3) {
            r1 = this;
            h7.ig r0 = r1.f11684a
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            r0.mo6727n(r2, r3)
            return
    }

    /* renamed from: e */
    public final void m6881e(int r3, java.lang.Object r4, p124h7.InterfaceC2666i0 r5) {
            r2 = this;
            h7.ig r0 = r2.f11684a
            h7.x r4 = (p124h7.InterfaceC2935x) r4
            r1 = 3
            r0.mo6735v(r3, r1)
            h7.jg r1 = r0.f11660b
            r5.mo6443f(r4, r1)
            r4 = 4
            r0.mo6735v(r3, r4)
            return
    }

    /* renamed from: f */
    public final void m6882f(int r2, java.lang.Object r3, p124h7.InterfaceC2666i0 r4) {
            r1 = this;
            h7.ig r0 = r1.f11684a
            h7.x r3 = (p124h7.InterfaceC2935x) r3
            r0.mo6733t(r2, r3, r4)
            return
    }
}
