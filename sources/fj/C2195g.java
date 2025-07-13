package fj;

/* renamed from: fj.g */
/* loaded from: classes.dex */
public class C2195g extends p317ri.AbstractC5894m implements fj.InterfaceC2196h {

    /* renamed from: Y */
    public p317ri.C5897n f10042Y;

    /* renamed from: Z */
    public p317ri.AbstractC5912s f10043Z;

    public C2195g(int r6, int r7, int r8, int r9) {
            r5 = this;
            r5.<init>()
            ri.n r0 = fj.InterfaceC2196h.f10049c
            r5.f10042Y = r0
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.k r2 = new ri.k
            long r3 = (long) r6
            r2.<init>(r3)
            java.lang.Object r6 = r0.f11884Z
            java.util.Vector r6 = (java.util.Vector) r6
            r6.addElement(r2)
            java.lang.String r6 = "inconsistent k values"
            if (r8 != 0) goto L3a
            if (r9 != 0) goto L34
            ri.n r6 = fj.InterfaceC2196h.f10050d
            r0.m7087h(r6)
            ri.k r6 = new ri.k
            long r7 = (long) r7
            r6.<init>(r7)
            java.lang.Object r7 = r0.f11884Z
            java.util.Vector r7 = (java.util.Vector) r7
            r7.addElement(r6)
            goto L7b
        L34:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
        L3a:
            if (r8 <= r7) goto L83
            if (r9 <= r8) goto L83
            ri.n r6 = fj.InterfaceC2196h.f10051e
            r0.m7087h(r6)
            h7.rb r6 = new h7.rb
            r6.<init>(r1)
            ri.k r1 = new ri.k
            long r2 = (long) r7
            r1.<init>(r2)
            java.lang.Object r7 = r6.f11884Z
            java.util.Vector r7 = (java.util.Vector) r7
            r7.addElement(r1)
            ri.k r7 = new ri.k
            long r1 = (long) r8
            r7.<init>(r1)
            java.lang.Object r8 = r6.f11884Z
            java.util.Vector r8 = (java.util.Vector) r8
            r8.addElement(r7)
            ri.k r7 = new ri.k
            long r8 = (long) r9
            r7.<init>(r8)
            java.lang.Object r8 = r6.f11884Z
            java.util.Vector r8 = (java.util.Vector) r8
            r8.addElement(r7)
            ri.a1 r7 = new ri.a1
            r7.<init>(r6)
            java.lang.Object r6 = r0.f11884Z
            java.util.Vector r6 = (java.util.Vector) r6
            r6.addElement(r7)
        L7b:
            ri.a1 r6 = new ri.a1
            r6.<init>(r0)
            r5.f10043Z = r6
            return
        L83:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
    }

    public C2195g(java.math.BigInteger r2) {
            r1 = this;
            r1.<init>()
            ri.n r0 = fj.InterfaceC2196h.f10048b
            r1.f10042Y = r0
            ri.k r0 = new ri.k
            r0.<init>(r2)
            r1.f10043Z = r0
            return
    }

    public C2195g(p317ri.AbstractC5915t r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            ri.e r0 = r2.mo12277F(r0)
            ri.n r0 = p317ri.C5897n.m12249F(r0)
            r1.f10042Y = r0
            r0 = 1
            ri.e r2 = r2.mo12277F(r0)
            ri.s r2 = r2.mo168e()
            r1.f10043Z = r2
            return
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.n r1 = r2.f10042Y
            r0.m7087h(r1)
            ri.s r1 = r2.f10043Z
            r0.m7087h(r1)
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
