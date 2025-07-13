package p221m9;

/* renamed from: m9.l */
/* loaded from: classes.dex */
public final class C4466l implements p221m9.InterfaceC4498v1 {

    /* renamed from: a */
    public final p221m9.AbstractC4463k f18190a;

    public C4466l(p221m9.AbstractC4463k r2) {
            r1 = this;
            r1.<init>()
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            r1.f18190a = r2
            r2.f18184a = r1
            return
    }

    /* renamed from: a */
    public void m10180a(int r2, double r3) {
            r1 = this;
            m9.k r0 = r1.f18190a
            java.util.Objects.requireNonNull(r0)
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r0.mo10161S(r2, r3)
            return
    }

    /* renamed from: b */
    public void m10181b(int r2, float r3) {
            r1 = this;
            m9.k r0 = r1.f18190a
            java.util.Objects.requireNonNull(r0)
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            r0.mo10159Q(r2, r3)
            return
    }

    /* renamed from: c */
    public void m10182c(int r3, java.lang.Object r4, p221m9.InterfaceC4447e1 r5) {
            r2 = this;
            m9.k r0 = r2.f18190a
            m9.q0 r4 = (p221m9.InterfaceC4482q0) r4
            r1 = 3
            r0.mo10169a0(r3, r1)
            m9.l r1 = r0.f18184a
            r5.mo9987b(r4, r1)
            r4 = 4
            r0.mo10169a0(r3, r4)
            return
    }

    /* renamed from: d */
    public void m10183d(int r2, java.lang.Object r3, p221m9.InterfaceC4447e1 r4) {
            r1 = this;
            m9.k r0 = r1.f18190a
            m9.q0 r3 = (p221m9.InterfaceC4482q0) r3
            r0.mo10165W(r2, r3, r4)
            return
    }

    /* renamed from: e */
    public final void m10184e(int r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r3 instanceof p221m9.AbstractC4454h
            if (r0 == 0) goto Lc
            m9.k r0 = r1.f18190a
            m9.h r3 = (p221m9.AbstractC4454h) r3
            r0.mo10167Y(r2, r3)
            goto L13
        Lc:
            m9.k r0 = r1.f18190a
            m9.q0 r3 = (p221m9.InterfaceC4482q0) r3
            r0.mo10166X(r2, r3)
        L13:
            return
    }

    /* renamed from: f */
    public void m10185f(int r2, int r3) {
            r1 = this;
            m9.k r0 = r1.f18190a
            int r3 = p221m9.AbstractC4463k.m10136K(r3)
            r0.mo10170b0(r2, r3)
            return
    }

    /* renamed from: g */
    public void m10186g(int r2, long r3) {
            r1 = this;
            m9.k r0 = r1.f18190a
            long r3 = p221m9.AbstractC4463k.m10137L(r3)
            r0.mo10172d0(r2, r3)
            return
    }
}
