package p440yi;

/* renamed from: yi.h */
/* loaded from: classes.dex */
public class C7220h extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public java.math.BigInteger f27791Y;

    /* renamed from: Z */
    public java.math.BigInteger f27792Z;

    public C7220h(java.math.BigInteger r1, java.math.BigInteger r2) {
            r0 = this;
            r0.<init>()
            r0.f27791Y = r1
            r0.f27792Z = r2
            return
    }

    public C7220h(p317ri.AbstractC5915t r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.size()
            r1 = 2
            if (r0 != r1) goto L2b
            java.util.Enumeration r3 = r3.mo12278H()
            java.lang.Object r0 = r3.nextElement()
            ri.k r0 = p317ri.C5888k.m12240C(r0)
            java.math.BigInteger r0 = r0.m12242D()
            r2.f27791Y = r0
            java.lang.Object r3 = r3.nextElement()
            ri.k r3 = p317ri.C5888k.m12240C(r3)
            java.math.BigInteger r3 = r3.m12242D()
            r2.f27792Z = r3
            return
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r3 = r3.size()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r3 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27791Y
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27792Z
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
