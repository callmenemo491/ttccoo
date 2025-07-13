package p440yi;

/* renamed from: yi.g */
/* loaded from: classes.dex */
public class C7219g extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public java.math.BigInteger f27781Y;

    /* renamed from: Z */
    public java.math.BigInteger f27782Z;

    /* renamed from: a0 */
    public java.math.BigInteger f27783a0;

    /* renamed from: b0 */
    public java.math.BigInteger f27784b0;

    /* renamed from: c0 */
    public java.math.BigInteger f27785c0;

    /* renamed from: d0 */
    public java.math.BigInteger f27786d0;

    /* renamed from: e0 */
    public java.math.BigInteger f27787e0;

    /* renamed from: f0 */
    public java.math.BigInteger f27788f0;

    /* renamed from: g0 */
    public java.math.BigInteger f27789g0;

    /* renamed from: h0 */
    public p317ri.AbstractC5915t f27790h0;

    public C7219g(p317ri.AbstractC5915t r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f27790h0 = r0
            java.util.Enumeration r4 = r4.mo12278H()
            java.lang.Object r0 = r4.nextElement()
            ri.k r0 = (p317ri.C5888k) r0
            java.math.BigInteger r0 = r0.m12243E()
            int r1 = r0.intValue()
            if (r1 == 0) goto L2a
            int r1 = r0.intValue()
            r2 = 1
            if (r1 != r2) goto L22
            goto L2a
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "wrong version for RSA private key"
            r4.<init>(r0)
            throw r4
        L2a:
            r3.f27781Y = r0
            java.lang.Object r0 = r4.nextElement()
            ri.k r0 = (p317ri.C5888k) r0
            java.math.BigInteger r0 = r0.m12243E()
            r3.f27782Z = r0
            java.lang.Object r0 = r4.nextElement()
            ri.k r0 = (p317ri.C5888k) r0
            java.math.BigInteger r0 = r0.m12243E()
            r3.f27783a0 = r0
            java.lang.Object r0 = r4.nextElement()
            ri.k r0 = (p317ri.C5888k) r0
            java.math.BigInteger r0 = r0.m12243E()
            r3.f27784b0 = r0
            java.lang.Object r0 = r4.nextElement()
            ri.k r0 = (p317ri.C5888k) r0
            java.math.BigInteger r0 = r0.m12243E()
            r3.f27785c0 = r0
            java.lang.Object r0 = r4.nextElement()
            ri.k r0 = (p317ri.C5888k) r0
            java.math.BigInteger r0 = r0.m12243E()
            r3.f27786d0 = r0
            java.lang.Object r0 = r4.nextElement()
            ri.k r0 = (p317ri.C5888k) r0
            java.math.BigInteger r0 = r0.m12243E()
            r3.f27787e0 = r0
            java.lang.Object r0 = r4.nextElement()
            ri.k r0 = (p317ri.C5888k) r0
            java.math.BigInteger r0 = r0.m12243E()
            r3.f27788f0 = r0
            java.lang.Object r0 = r4.nextElement()
            ri.k r0 = (p317ri.C5888k) r0
            java.math.BigInteger r0 = r0.m12243E()
            r3.f27789g0 = r0
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L9a
            java.lang.Object r4 = r4.nextElement()
            ri.t r4 = (p317ri.AbstractC5915t) r4
            r3.f27790h0 = r4
        L9a:
            return
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r3 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27781Y
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27782Z
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27783a0
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27784b0
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27785c0
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27786d0
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27787e0
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27788f0
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r3.f27789g0
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            ri.t r1 = r3.f27790h0
            if (r1 == 0) goto L90
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
        L90:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
