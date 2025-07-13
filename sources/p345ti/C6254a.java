package p345ti;

/* renamed from: ti.a */
/* loaded from: classes.dex */
public class C6254a extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.C5897n f24243Y;

    /* renamed from: Z */
    public p317ri.InterfaceC5870e f24244Z;

    public C6254a(p317ri.AbstractC5915t r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.size()
            r1 = 1
            if (r0 < r1) goto L3e
            int r0 = r4.size()
            r2 = 2
            if (r0 > r2) goto L3e
            r0 = 0
            ri.e r0 = r4.mo12277F(r0)
            ri.n r0 = (p317ri.C5897n) r0
            r3.f24243Y = r0
            int r0 = r4.size()
            if (r0 <= r1) goto L3d
            ri.e r4 = r4.mo12277F(r1)
            ri.y r4 = (p317ri.AbstractC5928y) r4
            boolean r0 = r4.f22756Z
            if (r0 == 0) goto L35
            int r0 = r4.f22755Y
            if (r0 != 0) goto L35
            ri.s r4 = r4.m12294D()
            r3.f24244Z = r4
            goto L3d
        L35:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad tag for 'content'"
            r4.<init>(r0)
            throw r4
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r4 = r4.size()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r4 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.n r1 = r4.f24243Y
            r0.m7087h(r1)
            ri.e r1 = r4.f24244Z
            if (r1 == 0) goto L1d
            ri.j0 r2 = new ri.j0
            r3 = 0
            r2.<init>(r3, r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r2)
        L1d:
            ri.f0 r1 = new ri.f0
            r1.<init>(r0)
            return r1
    }
}
