package p317ri;

/* renamed from: ri.k1 */
/* loaded from: classes.dex */
public class C5890k1 extends p317ri.AbstractC5879h {
    public C5890k1(p124h7.C2839rb r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r7) {
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            ri.n r1 = r6.f22697Y
            java.lang.String r2 = "DL"
            if (r1 == 0) goto L12
            byte[] r1 = r1.m12246m(r2)
            r0.write(r1)
        L12:
            ri.k r1 = r6.f22698Z
            if (r1 == 0) goto L1d
            byte[] r1 = r1.m12246m(r2)
            r0.write(r1)
        L1d:
            ri.s r1 = r6.f22699a0
            if (r1 == 0) goto L28
            byte[] r1 = r1.m12246m(r2)
            r0.write(r1)
        L28:
            ri.d1 r1 = new ri.d1
            r3 = 1
            int r4 = r6.f22700b0
            ri.s r5 = r6.f22701c0
            r1.<init>(r3, r4, r5)
            byte[] r1 = r1.m12246m(r2)
            r0.write(r1)
            r1 = 32
            r2 = 8
            byte[] r0 = r0.toByteArray()
            r7.m12265d(r1, r2, r0)
            return
    }

    @Override // p317ri.AbstractC5879h, p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r1 = this;
            byte[] r0 = r1.m12245l()
            int r0 = r0.length
            return r0
    }
}
