package p081ej;

/* renamed from: ej.n */
/* loaded from: classes.dex */
public class C1871n extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p081ej.C1872o f8099Y;

    /* renamed from: Z */
    public p081ej.C1870m f8100Z;

    /* renamed from: a0 */
    public p081ej.C1874q f8101a0;

    /* renamed from: b0 */
    public int f8102b0;

    public C1871n(p317ri.AbstractC5915t r7) {
            r6 = this;
            r6.<init>()
            r0 = 1
            r6.f8102b0 = r0
            int r1 = r7.size()
            r2 = 3
            if (r1 > r2) goto L4c
            r1 = 0
            r2 = 0
        Lf:
            int r3 = r7.size()
            if (r2 == r3) goto L49
            ri.e r3 = r7.mo12277F(r2)
            ri.y r3 = p317ri.AbstractC5928y.m12293C(r3)
            int r4 = r3.f22755Y
            if (r4 == 0) goto L40
            if (r4 == r0) goto L35
            r5 = 2
            if (r4 != r5) goto L2d
            ej.q r3 = p081ej.C1874q.m4636n(r3, r1)
            r6.f8101a0 = r3
            goto L46
        L2d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown tag in Holder"
            r7.<init>(r0)
            throw r7
        L35:
            ri.t r3 = p317ri.AbstractC5915t.m12275D(r3, r1)
            ej.m r3 = p081ej.C1870m.m4632n(r3)
            r6.f8100Z = r3
            goto L46
        L40:
            ej.o r3 = p081ej.C1872o.m4633n(r3, r1)
            r6.f8099Y = r3
        L46:
            int r2 = r2 + 1
            goto Lf
        L49:
            r6.f8102b0 = r0
            return
        L4c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r7 = r7.size()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public C1871n(p317ri.AbstractC5928y r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f8102b0 = r0
            int r1 = r3.f22755Y
            if (r1 == 0) goto L1f
            if (r1 != r0) goto L17
            ri.t r3 = p317ri.AbstractC5915t.m12275D(r3, r0)
            ej.m r3 = p081ej.C1870m.m4632n(r3)
            r2.f8100Z = r3
            goto L25
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown tag in Holder"
            r3.<init>(r0)
            throw r3
        L1f:
            ej.o r3 = p081ej.C1872o.m4633n(r3, r0)
            r2.f8099Y = r3
        L25:
            r3 = 0
            r2.f8102b0 = r3
            return
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r5 = this;
            int r0 = r5.f8102b0
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L44
            h7.rb r0 = new h7.rb
            r3 = 25
            r0.<init>(r3)
            ej.o r3 = r5.f8099Y
            if (r3 == 0) goto L1d
            ri.d1 r4 = new ri.d1
            r4.<init>(r1, r1, r3)
            java.lang.Object r3 = r0.f11884Z
            java.util.Vector r3 = (java.util.Vector) r3
            r3.addElement(r4)
        L1d:
            ej.m r3 = r5.f8100Z
            if (r3 == 0) goto L2d
            ri.d1 r4 = new ri.d1
            r4.<init>(r1, r2, r3)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r4)
        L2d:
            ej.q r2 = r5.f8101a0
            if (r2 == 0) goto L3e
            ri.d1 r3 = new ri.d1
            r4 = 2
            r3.<init>(r1, r4, r2)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r3)
        L3e:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
        L44:
            ej.m r0 = r5.f8100Z
            if (r0 == 0) goto L4e
            ri.d1 r1 = new ri.d1
            r1.<init>(r2, r2, r0)
            return r1
        L4e:
            ri.d1 r0 = new ri.d1
            ej.o r3 = r5.f8099Y
            r0.<init>(r2, r1, r3)
            return r0
    }
}
