package p081ej;

/* renamed from: ej.w */
/* loaded from: classes.dex */
public class C1880w extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p081ej.C1870m f8130Y;

    /* renamed from: Z */
    public p081ej.C1872o f8131Z;

    /* renamed from: a0 */
    public p081ej.C1874q f8132a0;

    public C1880w(p317ri.AbstractC5915t r6) {
            r5 = this;
            r5.<init>()
            int r0 = r6.size()
            r1 = 3
            if (r0 > r1) goto L5b
            r0 = 0
            ri.e r1 = r6.mo12277F(r0)
            boolean r1 = r1 instanceof p317ri.AbstractC5928y
            r2 = 1
            if (r1 != 0) goto L20
            ri.e r1 = r6.mo12277F(r0)
            ej.m r1 = p081ej.C1870m.m4632n(r1)
            r5.f8130Y = r1
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            int r3 = r6.size()
            if (r1 == r3) goto L5a
            ri.e r3 = r6.mo12277F(r1)
            ri.y r3 = p317ri.AbstractC5928y.m12293C(r3)
            int r4 = r3.f22755Y
            if (r4 != 0) goto L3a
            ej.o r3 = p081ej.C1872o.m4633n(r3, r0)
            r5.f8131Z = r3
            goto L42
        L3a:
            if (r4 != r2) goto L45
            ej.q r3 = p081ej.C1874q.m4636n(r3, r0)
            r5.f8132a0 = r3
        L42:
            int r1 = r1 + 1
            goto L21
        L45:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad tag number: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f22755Y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L5a:
            return
        L5b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r6 = r6.size()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    /* renamed from: n */
    public static p081ej.C1880w m4639n(java.lang.Object r1) {
            boolean r0 = r1 instanceof p081ej.C1880w
            if (r0 == 0) goto L7
            ej.w r1 = (p081ej.C1880w) r1
            return r1
        L7:
            if (r1 == 0) goto L13
            ej.w r0 = new ej.w
            ri.t r1 = p317ri.AbstractC5915t.m12274C(r1)
            r0.<init>(r1)
            return r0
        L13:
            r1 = 0
            return r1
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r5 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ej.m r1 = r5.f8130Y
            if (r1 == 0) goto Le
            r0.m7087h(r1)
        Le:
            ej.o r1 = r5.f8131Z
            r2 = 0
            if (r1 == 0) goto L1f
            ri.d1 r3 = new ri.d1
            r3.<init>(r2, r2, r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r3)
        L1f:
            ej.q r1 = r5.f8132a0
            if (r1 == 0) goto L30
            ri.d1 r3 = new ri.d1
            r4 = 1
            r3.<init>(r2, r4, r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r3)
        L30:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
