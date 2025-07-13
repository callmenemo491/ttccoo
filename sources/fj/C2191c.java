package fj;

/* renamed from: fj.c */
/* loaded from: classes.dex */
public class C2191c extends p317ri.AbstractC5894m implements fj.InterfaceC2196h {

    /* renamed from: e0 */
    public static final java.math.BigInteger f10030e0 = null;

    /* renamed from: Y */
    public fj.C2195g f10031Y;

    /* renamed from: Z */
    public p240nj.AbstractC4845c f10032Z;

    /* renamed from: a0 */
    public fj.C2193e f10033a0;

    /* renamed from: b0 */
    public java.math.BigInteger f10034b0;

    /* renamed from: c0 */
    public java.math.BigInteger f10035c0;

    /* renamed from: d0 */
    public byte[] f10036d0;

    static {
            r0 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            fj.C2191c.f10030e0 = r0
            return
    }

    public C2191c(p240nj.AbstractC4845c r7, fj.C2193e r8, java.math.BigInteger r9, java.math.BigInteger r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public C2191c(p240nj.AbstractC4845c r2, fj.C2193e r3, java.math.BigInteger r4, java.math.BigInteger r5, byte[] r6) {
            r1 = this;
            r1.<init>()
            r1.f10032Z = r2
            r1.f10033a0 = r3
            r1.f10034b0 = r4
            r1.f10035c0 = r5
            byte[] r3 = p400wj.C6888a.m13951c(r6)
            r1.f10036d0 = r3
            boolean r3 = p240nj.C4843a.m10867g(r2)
            if (r3 == 0) goto L25
            fj.g r3 = new fj.g
            sj.a r2 = r2.f19248a
            java.math.BigInteger r2 = r2.mo12528c()
            r3.<init>(r2)
        L22:
            r1.f10031Y = r3
            goto L67
        L25:
            boolean r3 = p240nj.C4843a.m10866f(r2)
            if (r3 == 0) goto L70
            sj.a r2 = r2.f19248a
            sj.e r2 = (sj.InterfaceC6084e) r2
            sj.c r2 = r2.mo12530a()
            int[] r2 = r2.f23446a
            r3 = 0
            if (r2 != 0) goto L3a
            r2 = 0
            goto L42
        L3a:
            int r4 = r2.length
            int[] r4 = new int[r4]
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r3, r4, r3, r5)
            r2 = r4
        L42:
            int r4 = r2.length
            r5 = 1
            r6 = 2
            r0 = 3
            if (r4 != r0) goto L54
            fj.g r4 = new fj.g
            r6 = r2[r6]
            r2 = r2[r5]
            r4.<init>(r6, r2, r3, r3)
            r1.f10031Y = r4
            goto L67
        L54:
            int r3 = r2.length
            r4 = 5
            if (r3 != r4) goto L68
            fj.g r3 = new fj.g
            r4 = 4
            r4 = r2[r4]
            r5 = r2[r5]
            r6 = r2[r6]
            r2 = r2[r0]
            r3.<init>(r4, r5, r6, r2)
            goto L22
        L67:
            return
        L68:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Only trinomial and pentomial curves are supported"
            r2.<init>(r3)
            throw r2
        L70:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "'curve' is of an unsupported type"
            r2.<init>(r3)
            throw r2
    }

    public C2191c(p317ri.AbstractC5915t r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            r16.<init>()
            r2 = 0
            ri.e r3 = r1.mo12277F(r2)
            boolean r3 = r3 instanceof p317ri.C5888k
            if (r3 == 0) goto L1a0
            ri.e r3 = r1.mo12277F(r2)
            ri.k r3 = (p317ri.C5888k) r3
            java.math.BigInteger r3 = r3.m12243E()
            java.math.BigInteger r4 = fj.C2191c.f10030e0
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1a0
            r3 = 4
            ri.e r3 = r1.mo12277F(r3)
            ri.k r3 = (p317ri.C5888k) r3
            java.math.BigInteger r3 = r3.m12243E()
            r0.f10034b0 = r3
            int r3 = r17.size()
            r4 = 6
            if (r3 != r4) goto L43
            r3 = 5
            ri.e r3 = r1.mo12277F(r3)
            ri.k r3 = (p317ri.C5888k) r3
            java.math.BigInteger r3 = r3.m12243E()
            r0.f10035c0 = r3
        L43:
            r3 = 1
            ri.e r4 = r1.mo12277F(r3)
            boolean r5 = r4 instanceof fj.C2195g
            r6 = 0
            if (r5 == 0) goto L50
            fj.g r4 = (fj.C2195g) r4
            goto L5e
        L50:
            if (r4 == 0) goto L5d
            fj.g r5 = new fj.g
            ri.t r4 = p317ri.AbstractC5915t.m12274C(r4)
            r5.<init>(r4)
            r4 = r5
            goto L5e
        L5d:
            r4 = r6
        L5e:
            java.math.BigInteger r14 = r0.f10034b0
            java.math.BigInteger r15 = r0.f10035c0
            r5 = 2
            ri.e r7 = r1.mo12277F(r5)
            ri.t r13 = p317ri.AbstractC5915t.m12274C(r7)
            ri.n r7 = r4.f10042Y
            ri.n r8 = fj.InterfaceC2196h.f10048b
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto Laa
            ri.s r4 = r4.f10043Z
            ri.k r4 = (p317ri.C5888k) r4
            java.math.BigInteger r8 = r4.m12243E()
            java.math.BigInteger r9 = new java.math.BigInteger
            ri.e r2 = r13.mo12277F(r2)
            ri.o r2 = p317ri.AbstractC5900o.m12258C(r2)
            byte[] r2 = r2.mo12219E()
            r9.<init>(r3, r2)
            java.math.BigInteger r10 = new java.math.BigInteger
            ri.e r2 = r13.mo12277F(r3)
            ri.o r2 = p317ri.AbstractC5900o.m12258C(r2)
            byte[] r2 = r2.mo12219E()
            r10.<init>(r3, r2)
            nj.c$f r2 = new nj.c$f
            r7 = r2
            r11 = r14
            r12 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            r4 = r13
            goto L156
        Laa:
            ri.n r8 = fj.InterfaceC2196h.f10049c
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L198
            ri.s r4 = r4.f10043Z
            ri.t r4 = p317ri.AbstractC5915t.m12274C(r4)
            ri.e r7 = r4.mo12277F(r2)
            ri.k r7 = (p317ri.C5888k) r7
            java.math.BigInteger r7 = r7.m12243E()
            int r8 = r7.intValue()
            ri.e r7 = r4.mo12277F(r3)
            ri.n r7 = (p317ri.C5897n) r7
            ri.n r9 = fj.InterfaceC2196h.f10050d
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto Le8
            ri.e r4 = r4.mo12277F(r5)
            ri.k r4 = p317ri.C5888k.m12240C(r4)
            java.math.BigInteger r4 = r4.m12243E()
            int r4 = r4.intValue()
            r9 = r4
            r10 = 0
            r11 = 0
            goto L12b
        Le8:
            ri.n r9 = fj.InterfaceC2196h.f10051e
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L190
            ri.e r4 = r4.mo12277F(r5)
            ri.t r4 = p317ri.AbstractC5915t.m12274C(r4)
            ri.e r7 = r4.mo12277F(r2)
            ri.k r7 = p317ri.C5888k.m12240C(r7)
            java.math.BigInteger r7 = r7.m12243E()
            int r7 = r7.intValue()
            ri.e r9 = r4.mo12277F(r3)
            ri.k r9 = p317ri.C5888k.m12240C(r9)
            java.math.BigInteger r9 = r9.m12243E()
            int r9 = r9.intValue()
            ri.e r4 = r4.mo12277F(r5)
            ri.k r4 = p317ri.C5888k.m12240C(r4)
            java.math.BigInteger r4 = r4.m12243E()
            int r4 = r4.intValue()
            r11 = r4
            r10 = r9
            r9 = r7
        L12b:
            java.math.BigInteger r12 = new java.math.BigInteger
            ri.e r2 = r13.mo12277F(r2)
            ri.o r2 = p317ri.AbstractC5900o.m12258C(r2)
            byte[] r2 = r2.mo12219E()
            r12.<init>(r3, r2)
            java.math.BigInteger r2 = new java.math.BigInteger
            ri.e r4 = r13.mo12277F(r3)
            ri.o r4 = p317ri.AbstractC5900o.m12258C(r4)
            byte[] r4 = r4.mo12219E()
            r2.<init>(r3, r4)
            nj.c$e r3 = new nj.c$e
            r7 = r3
            r4 = r13
            r13 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = r3
        L156:
            int r3 = r4.size()
            r7 = 3
            if (r3 != r7) goto L16b
            ri.e r3 = r4.mo12277F(r5)
            ri.n0 r3 = (p317ri.C5898n0) r3
            byte[] r3 = r3.m12210D()
            byte[] r6 = p400wj.C6888a.m13951c(r3)
        L16b:
            r0.f10032Z = r2
            ri.e r1 = r1.mo12277F(r7)
            boolean r2 = r1 instanceof fj.C2193e
            if (r2 == 0) goto L17a
            fj.e r1 = (fj.C2193e) r1
            r0.f10033a0 = r1
            goto L189
        L17a:
            fj.e r2 = new fj.e
            nj.c r3 = r0.f10032Z
            ri.o r1 = (p317ri.AbstractC5900o) r1
            byte[] r1 = r1.mo12219E()
            r2.<init>(r3, r1)
            r0.f10033a0 = r2
        L189:
            byte[] r1 = p400wj.C6888a.m13951c(r6)
            r0.f10036d0 = r1
            return
        L190:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "This type of EC basis is not implemented"
            r1.<init>(r2)
            throw r1
        L198:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "This type of ECCurve is not implemented"
            r1.<init>(r2)
            throw r1
        L1a0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "bad version in X9ECParameters"
            r1.<init>(r2)
            throw r1
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r4 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = fj.C2191c.f10030e0
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            fj.g r1 = r4.f10031Y
            r0.m7087h(r1)
            fj.b r1 = new fj.b
            nj.c r2 = r4.f10032Z
            byte[] r3 = r4.f10036d0
            r1.<init>(r2, r3)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            fj.e r1 = r4.f10033a0
            r0.m7087h(r1)
            ri.k r1 = new ri.k
            java.math.BigInteger r2 = r4.f10034b0
            r1.<init>(r2)
            java.lang.Object r2 = r0.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            r2.addElement(r1)
            java.math.BigInteger r1 = r4.f10035c0
            if (r1 == 0) goto L4d
            ri.k r2 = new ri.k
            r2.<init>(r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r2)
        L4d:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }

    /* renamed from: n */
    public p240nj.AbstractC4848f m5781n() {
            r3 = this;
            fj.e r0 = r3.f10033a0
            monitor-enter(r0)
            nj.f r1 = r0.f10040a0     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L19
            nj.c r1 = r0.f10039Z     // Catch: java.lang.Throwable -> L1d
            ri.o r2 = r0.f10038Y     // Catch: java.lang.Throwable -> L1d
            byte[] r2 = r2.mo12219E()     // Catch: java.lang.Throwable -> L1d
            nj.f r1 = r1.m10876i(r2)     // Catch: java.lang.Throwable -> L1d
            nj.f r1 = r1.m10934o()     // Catch: java.lang.Throwable -> L1d
            r0.f10040a0 = r1     // Catch: java.lang.Throwable -> L1d
        L19:
            nj.f r1 = r0.f10040a0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return r1
        L1d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
