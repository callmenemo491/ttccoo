package p169jb;

/* renamed from: jb.e */
/* loaded from: classes.dex */
public class C3462e extends p169jb.AbstractC3483z<java.lang.Number> {
    public C3462e(p169jb.C3467j r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public java.lang.Number mo7919a(p290qb.C5612a r3) {
            r2 = this;
            qb.b r0 = r3.mo10414z0()
            qb.b r1 = p290qb.EnumC5613b.f21798g0
            if (r0 != r1) goto Ld
            r3.mo10411m0()
            r3 = 0
            goto L15
        Ld:
            double r0 = r3.mo10405Z()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
        L15:
            return r3
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r3, java.lang.Number r4) {
            r2 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 != 0) goto L8
            r3.mo10417R()
            goto L12
        L8:
            double r0 = r4.doubleValue()
            p169jb.C3467j.m7928b(r0)
            r3.mo10422i0(r4)
        L12:
            return
    }
}
