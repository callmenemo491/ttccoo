package p081ej;

/* renamed from: ej.q */
/* loaded from: classes.dex */
public class C1874q extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.C5873f f8113Y;

    /* renamed from: Z */
    public p317ri.C5897n f8114Z;

    /* renamed from: a0 */
    public p081ej.C1858a f8115a0;

    /* renamed from: b0 */
    public p317ri.C5898n0 f8116b0;

    public C1874q(p317ri.AbstractC5915t r5) {
            r4 = this;
            r4.<init>()
            int r0 = r5.size()
            r1 = 4
            if (r0 > r1) goto L85
            int r0 = r5.size()
            r2 = 3
            if (r0 < r2) goto L85
            r0 = 0
            ri.e r2 = r5.mo12277F(r0)
            if (r2 == 0) goto L56
            boolean r3 = r2 instanceof p317ri.C5873f
            if (r3 == 0) goto L1d
            goto L56
        L1d:
            boolean r3 = r2 instanceof byte[]
            if (r3 == 0) goto L3b
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Exception -> L2a
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.lang.Exception -> L2a
            ri.f r2 = (p317ri.C5873f) r2     // Catch: java.lang.Exception -> L2a
            goto L58
        L2a:
            r5 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "encoding error in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r5 = androidx.fragment.app.C0390k0.m1221a(r5, r1)
            r0.<init>(r5)
            throw r0
        L3b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "illegal object in getInstance: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L56:
            ri.f r2 = (p317ri.C5873f) r2
        L58:
            r4.f8113Y = r2
            int r2 = r5.size()
            r3 = 1
            if (r2 != r1) goto L6c
            ri.e r0 = r5.mo12277F(r3)
            ri.n r0 = p317ri.C5897n.m12249F(r0)
            r4.f8114Z = r0
            r0 = 1
        L6c:
            int r1 = r0 + 1
            ri.e r1 = r5.mo12277F(r1)
            ej.a r1 = p081ej.C1858a.m4628n(r1)
            r4.f8115a0 = r1
            int r0 = r0 + 2
            ri.e r5 = r5.mo12277F(r0)
            ri.n0 r5 = p317ri.C5898n0.m12256E(r5)
            r4.f8116b0 = r5
            return
        L85:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r5 = r5.size()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    /* renamed from: n */
    public static p081ej.C1874q m4636n(p317ri.AbstractC5928y r0, boolean r1) {
            ri.t r0 = p317ri.AbstractC5915t.m12275D(r0, r1)
            boolean r1 = r0 instanceof p081ej.C1874q
            if (r1 == 0) goto Lb
            ej.q r0 = (p081ej.C1874q) r0
            goto L19
        Lb:
            if (r0 == 0) goto L18
            ej.q r1 = new ej.q
            ri.t r0 = p317ri.AbstractC5915t.m12274C(r0)
            r1.<init>(r0)
            r0 = r1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.f r1 = r2.f8113Y
            r0.m7087h(r1)
            ri.n r1 = r2.f8114Z
            if (r1 == 0) goto L13
            r0.m7087h(r1)
        L13:
            ej.a r1 = r2.f8115a0
            r0.m7087h(r1)
            ri.n0 r1 = r2.f8116b0
            r0.m7087h(r1)
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
