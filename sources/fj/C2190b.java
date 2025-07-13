package fj;

/* renamed from: fj.b */
/* loaded from: classes.dex */
public class C2190b extends p317ri.AbstractC5894m implements fj.InterfaceC2196h {

    /* renamed from: Y */
    public p240nj.AbstractC4845c f10027Y;

    /* renamed from: Z */
    public byte[] f10028Z;

    /* renamed from: a0 */
    public p317ri.C5897n f10029a0;

    public C2190b(p240nj.AbstractC4845c r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f10029a0 = r0
            r1.f10027Y = r2
            byte[] r2 = p400wj.C6888a.m13951c(r3)
            r1.f10028Z = r2
            nj.c r2 = r1.f10027Y
            boolean r2 = p240nj.C4843a.m10867g(r2)
            if (r2 == 0) goto L19
            ri.n r2 = fj.InterfaceC2196h.f10048b
            goto L23
        L19:
            nj.c r2 = r1.f10027Y
            boolean r2 = p240nj.C4843a.m10866f(r2)
            if (r2 == 0) goto L26
            ri.n r2 = fj.InterfaceC2196h.f10049c
        L23:
            r1.f10029a0 = r2
            return
        L26:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "This type of ECCurve is not implemented"
            r2.<init>(r3)
            throw r2
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r4 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.n r1 = r4.f10029a0
            ri.n r2 = fj.InterfaceC2196h.f10048b
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L56
            nj.c r1 = r4.f10027Y
            nj.d r1 = r1.f19249b
            m2.q r2 = fj.C2194f.f10041Y
            int r3 = r1.mo10898f()
            int r3 = r3 + 7
            int r3 = r3 / 8
            java.math.BigInteger r1 = r1.mo10912t()
            byte[] r1 = r2.m9717r(r1, r3)
            ri.x0 r2 = new ri.x0
            r2.<init>(r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r2)
            nj.c r1 = r4.f10027Y
            nj.d r1 = r1.f19250c
            m2.q r2 = fj.C2194f.f10041Y
            int r3 = r1.mo10898f()
            int r3 = r3 + 7
            int r3 = r3 / 8
            java.math.BigInteger r1 = r1.mo10912t()
            byte[] r1 = r2.m9717r(r1, r3)
            ri.x0 r2 = new ri.x0
            r2.<init>(r1)
        L4e:
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r2)
            goto L9e
        L56:
            ri.n r1 = r4.f10029a0
            ri.n r2 = fj.InterfaceC2196h.f10049c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L9e
            nj.c r1 = r4.f10027Y
            nj.d r1 = r1.f19249b
            m2.q r2 = fj.C2194f.f10041Y
            int r3 = r1.mo10898f()
            int r3 = r3 + 7
            int r3 = r3 / 8
            java.math.BigInteger r1 = r1.mo10912t()
            byte[] r1 = r2.m9717r(r1, r3)
            ri.x0 r2 = new ri.x0
            r2.<init>(r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r2)
            nj.c r1 = r4.f10027Y
            nj.d r1 = r1.f19250c
            m2.q r2 = fj.C2194f.f10041Y
            int r3 = r1.mo10898f()
            int r3 = r3 + 7
            int r3 = r3 / 8
            java.math.BigInteger r1 = r1.mo10912t()
            byte[] r1 = r2.m9717r(r1, r3)
            ri.x0 r2 = new ri.x0
            r2.<init>(r1)
            goto L4e
        L9e:
            byte[] r1 = r4.f10028Z
            if (r1 == 0) goto Lae
            ri.n0 r2 = new ri.n0
            r2.<init>(r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r2)
        Lae:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
