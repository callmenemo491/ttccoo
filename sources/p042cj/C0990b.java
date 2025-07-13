package p042cj;

/* renamed from: cj.b */
/* loaded from: classes.dex */
public class C0990b extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.AbstractC5921v f5074Y;

    public C0990b(p317ri.AbstractC5921v r1) {
            r0 = this;
            r0.<init>()
            r0.f5074Y = r1
            return
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r1 = this;
            ri.v r0 = r1.f5074Y
            return r0
    }

    /* renamed from: n */
    public p042cj.C0989a m2722n() {
            r2 = this;
            ri.v r0 = r2.f5074Y
            int r0 = r0.size()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            ri.v r0 = r2.f5074Y
            r1 = 0
            ri.e r0 = r0.m12287F(r1)
            cj.a r0 = p042cj.C0989a.m2721n(r0)
            return r0
    }

    /* renamed from: p */
    public p042cj.C0989a[] m2723p() {
            r4 = this;
            ri.v r0 = r4.f5074Y
            int r0 = r0.size()
            cj.a[] r1 = new p042cj.C0989a[r0]
            r2 = 0
        L9:
            if (r2 == r0) goto L1a
            ri.v r3 = r4.f5074Y
            ri.e r3 = r3.m12287F(r2)
            cj.a r3 = p042cj.C0989a.m2721n(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L1a:
            return r1
    }

    /* renamed from: q */
    public boolean m2724q() {
            r2 = this;
            ri.v r0 = r2.f5074Y
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }
}
