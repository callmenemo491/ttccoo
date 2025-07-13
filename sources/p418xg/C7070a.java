package p418xg;

/* renamed from: xg.a */
/* loaded from: classes.dex */
public final class C7070a implements p105g2.C2222p.a {

    /* renamed from: a */
    public final /* synthetic */ int f27389a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.String f27390b;

    /* renamed from: c */
    public final /* synthetic */ p101fh.InterfaceC2172d<java.util.List<java.lang.Object>> f27391c;

    public C7070a(java.lang.String r2, p101fh.InterfaceC2172d r3, int r4) {
            r1 = this;
            r1.f27389a = r4
            r0 = 1
            if (r4 == r0) goto L18
            r0 = 2
            if (r4 == r0) goto L10
            r1.f27390b = r2
            r1.f27391c = r3
            r1.<init>()
            return
        L10:
            r1.f27390b = r2
            r1.f27391c = r3
            r1.<init>()
            return
        L18:
            r1.f27390b = r2
            r1.f27391c = r3
            r1.<init>()
            return
    }

    @Override // p105g2.C2222p.a
    /* renamed from: a */
    public final void mo118a(p105g2.C2226t r6) {
            r5 = this;
            int r0 = r5.f27389a
            java.lang.String r1 = "CallGetTableRows"
            java.lang.String r2 = "it"
            r3 = 0
            switch(r0) {
                case 0: goto L2a;
                case 1: goto Lb;
                default: goto La;
            }
        La:
            goto L4b
        Lb:
            hk.a$b r0 = hk.C3053a.m7466a(r1)
            java.lang.String r4 = r5.f27390b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.mo7469c(r4, r3)
            hk.a$b r0 = hk.C3053a.m7466a(r1)
            r0.mo7470d(r6)
            fh.d<java.util.List<java.lang.Object>> r0 = r5.f27391c
            p214m2.C4339q.m9705j(r6, r2)
            java.lang.Object r6 = p074e9.C1805a.m4520e(r6)
            r0.mo5707k(r6)
            return
        L2a:
            java.lang.String r0 = "CallGetAtomicAssets"
            hk.a$b r1 = hk.C3053a.m7466a(r0)
            java.lang.String r4 = r5.f27390b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1.mo7469c(r4, r3)
            hk.a$b r0 = hk.C3053a.m7466a(r0)
            r0.mo7470d(r6)
            fh.d<java.util.List<java.lang.Object>> r0 = r5.f27391c
            p214m2.C4339q.m9705j(r6, r2)
            java.lang.Object r6 = p074e9.C1805a.m4520e(r6)
            r0.mo5707k(r6)
            return
        L4b:
            hk.a$b r0 = hk.C3053a.m7466a(r1)
            java.lang.String r4 = r5.f27390b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.mo7469c(r4, r3)
            hk.a$b r0 = hk.C3053a.m7466a(r1)
            r0.mo7470d(r6)
            fh.d<java.util.List<java.lang.Object>> r0 = r5.f27391c
            p214m2.C4339q.m9705j(r6, r2)
            java.lang.Object r6 = p074e9.C1805a.m4520e(r6)
            r0.mo5707k(r6)
            return
    }
}
