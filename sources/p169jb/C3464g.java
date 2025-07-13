package p169jb;

/* renamed from: jb.g */
/* loaded from: classes.dex */
public class C3464g extends p169jb.AbstractC3483z<java.lang.Number> {
    public C3464g() {
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
            long r0 = r3.mo10408d0()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L15:
            return r3
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r1, java.lang.Number r2) {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 != 0) goto L8
            r1.mo10417R()
            goto Lf
        L8:
            java.lang.String r2 = r2.toString()
            r1.mo10423m0(r2)
        Lf:
            return
    }
}
