package p381w;

/* renamed from: w.i */
/* loaded from: classes.dex */
public class C6768i extends p381w.C6765f {

    /* renamed from: H0 */
    public float f26233H0;

    /* renamed from: I0 */
    public int f26234I0;

    /* renamed from: J0 */
    public int f26235J0;

    /* renamed from: K0 */
    public p381w.C6763d f26236K0;

    /* renamed from: L0 */
    public int f26237L0;

    /* renamed from: M0 */
    public boolean f26238M0;

    public C6768i() {
            r4 = this;
            r4.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.f26233H0 = r0
            r0 = -1
            r4.f26234I0 = r0
            r4.f26235J0 = r0
            w.d r0 = r4.f26116G
            r4.f26236K0 = r0
            r0 = 0
            r4.f26237L0 = r0
            java.util.ArrayList<w.d> r1 = r4.f26125O
            r1.clear()
            java.util.ArrayList<w.d> r1 = r4.f26125O
            w.d r2 = r4.f26236K0
            r1.add(r2)
            w.d[] r1 = r4.f26124N
            int r1 = r1.length
        L22:
            if (r0 >= r1) goto L2d
            w.d[] r2 = r4.f26124N
            w.d r3 = r4.f26236K0
            r2[r0] = r3
            int r0 = r0 + 1
            goto L22
        L2d:
            return
    }

    @Override // p381w.C6765f
    /* renamed from: C */
    public boolean mo13670C() {
            r1 = this;
            boolean r0 = r1.f26238M0
            return r0
    }

    @Override // p381w.C6765f
    /* renamed from: D */
    public boolean mo13671D() {
            r1 = this;
            boolean r0 = r1.f26238M0
            return r0
    }

    @Override // p381w.C6765f
    /* renamed from: R */
    public void mo13706R(p365v.C6477d r3, boolean r4) {
            r2 = this;
            w.f r4 = r2.f26128R
            if (r4 != 0) goto L5
            return
        L5:
            w.d r4 = r2.f26236K0
            int r3 = r3.m13137o(r4)
            int r4 = r2.f26237L0
            r0 = 1
            r1 = 0
            if (r4 != r0) goto L22
            r2.f26133W = r3
            r2.f26134X = r1
            w.f r3 = r2.f26128R
            int r3 = r3.m13715o()
            r2.m13699K(r3)
            r2.m13704P(r1)
            goto L32
        L22:
            r2.f26133W = r1
            r2.f26134X = r3
            w.f r3 = r2.f26128R
            int r3 = r3.m13721u()
            r2.m13704P(r3)
            r2.m13699K(r1)
        L32:
            return
    }

    /* renamed from: S */
    public void m13739S(int r2) {
            r1 = this;
            w.d r0 = r1.f26236K0
            r0.f26087b = r2
            r2 = 1
            r0.f26088c = r2
            r1.f26238M0 = r2
            return
    }

    /* renamed from: T */
    public void m13740T(int r4) {
            r3 = this;
            int r0 = r3.f26237L0
            if (r0 != r4) goto L5
            return
        L5:
            r3.f26237L0 = r4
            java.util.ArrayList<w.d> r4 = r3.f26125O
            r4.clear()
            int r4 = r3.f26237L0
            r0 = 1
            if (r4 != r0) goto L14
            w.d r4 = r3.f26114F
            goto L16
        L14:
            w.d r4 = r3.f26116G
        L16:
            r3.f26236K0 = r4
            java.util.ArrayList<w.d> r4 = r3.f26125O
            w.d r0 = r3.f26236K0
            r4.add(r0)
            w.d[] r4 = r3.f26124N
            int r4 = r4.length
            r0 = 0
        L23:
            if (r0 >= r4) goto L2e
            w.d[] r1 = r3.f26124N
            w.d r2 = r3.f26236K0
            r1[r0] = r2
            int r0 = r0 + 1
            goto L23
        L2e:
            return
    }

    @Override // p381w.C6765f
    /* renamed from: f */
    public void mo13674f(p365v.C6477d r8, boolean r9) {
            r7 = this;
            w.f$a r9 = p381w.C6765f.a.f26190Z
            w.f r0 = r7.f26128R
            w.g r0 = (p381w.C6766g) r0
            if (r0 != 0) goto L9
            return
        L9:
            w.d$a r1 = p381w.C6763d.a.f26095Y
            w.d r1 = r0.mo13712l(r1)
            w.d$a r2 = p381w.C6763d.a.f26097a0
            w.d r2 = r0.mo13712l(r2)
            w.f r3 = r7.f26128R
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L23
            w.f$a[] r3 = r3.f26127Q
            r3 = r3[r5]
            if (r3 != r9) goto L23
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            int r6 = r7.f26237L0
            if (r6 != 0) goto L41
            w.d$a r1 = p381w.C6763d.a.f26096Z
            w.d r1 = r0.mo13712l(r1)
            w.d$a r2 = p381w.C6763d.a.f26098b0
            w.d r2 = r0.mo13712l(r2)
            w.f r0 = r7.f26128R
            if (r0 == 0) goto L3f
            w.f$a[] r0 = r0.f26127Q
            r0 = r0[r4]
            if (r0 != r9) goto L3f
            goto L40
        L3f:
            r4 = 0
        L40:
            r3 = r4
        L41:
            boolean r9 = r7.f26238M0
            r0 = -1
            r4 = 5
            if (r9 == 0) goto L7d
            w.d r9 = r7.f26236K0
            boolean r6 = r9.f26088c
            if (r6 == 0) goto L7d
            v.h r9 = r8.m13134l(r9)
            w.d r6 = r7.f26236K0
            int r6 = r6.m13680c()
            r8.m13127e(r9, r6)
            int r6 = r7.f26234I0
            if (r6 == r0) goto L68
            if (r3 == 0) goto L7a
            v.h r0 = r8.m13134l(r2)
        L64:
            r8.m13128f(r0, r9, r5, r4)
            goto L7a
        L68:
            int r6 = r7.f26235J0
            if (r6 == r0) goto L7a
            if (r3 == 0) goto L7a
            v.h r0 = r8.m13134l(r2)
            v.h r1 = r8.m13134l(r1)
            r8.m13128f(r9, r1, r5, r4)
            goto L64
        L7a:
            r7.f26238M0 = r5
            return
        L7d:
            int r9 = r7.f26234I0
            r6 = 8
            if (r9 == r0) goto L9c
            w.d r9 = r7.f26236K0
            v.h r9 = r8.m13134l(r9)
            v.h r0 = r8.m13134l(r1)
            int r1 = r7.f26234I0
            r8.m13126d(r9, r0, r1, r6)
            if (r3 == 0) goto Ldf
            v.h r0 = r8.m13134l(r2)
        L98:
            r8.m13128f(r0, r9, r5, r4)
            goto Ldf
        L9c:
            int r9 = r7.f26235J0
            if (r9 == r0) goto Lba
            w.d r9 = r7.f26236K0
            v.h r9 = r8.m13134l(r9)
            v.h r0 = r8.m13134l(r2)
            int r2 = r7.f26235J0
            int r2 = -r2
            r8.m13126d(r9, r0, r2, r6)
            if (r3 == 0) goto Ldf
            v.h r1 = r8.m13134l(r1)
            r8.m13128f(r9, r1, r5, r4)
            goto L98
        Lba:
            float r9 = r7.f26233H0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 == 0) goto Ldf
            w.d r9 = r7.f26236K0
            v.h r9 = r8.m13134l(r9)
            v.h r1 = r8.m13134l(r2)
            float r2 = r7.f26233H0
            v.b r3 = r8.m13135m()
            v.b$a r4 = r3.f25073d
            r4.mo13091c(r9, r0)
            v.b$a r9 = r3.f25073d
            r9.mo13091c(r1, r2)
            r8.m13125c(r3)
        Ldf:
            return
    }

    @Override // p381w.C6765f
    /* renamed from: g */
    public boolean mo13675g() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p381w.C6765f
    /* renamed from: i */
    public void mo13676i(p381w.C6765f r1, java.util.HashMap<p381w.C6765f, p381w.C6765f> r2) {
            r0 = this;
            super.mo13676i(r1, r2)
            w.i r1 = (p381w.C6768i) r1
            float r2 = r1.f26233H0
            r0.f26233H0 = r2
            int r2 = r1.f26234I0
            r0.f26234I0 = r2
            int r2 = r1.f26235J0
            r0.f26235J0 = r2
            int r1 = r1.f26237L0
            r0.m13740T(r1)
            return
    }

    @Override // p381w.C6765f
    /* renamed from: l */
    public p381w.C6763d mo13712l(p381w.C6763d.a r3) {
            r2 = this;
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L17;
                case 1: goto Lf;
                case 2: goto L8;
                case 3: goto Lf;
                case 4: goto L8;
                case 5: goto L17;
                case 6: goto L17;
                case 7: goto L17;
                case 8: goto L17;
                default: goto L7;
            }
        L7:
            goto L19
        L8:
            int r0 = r2.f26237L0
            if (r0 != 0) goto L19
            w.d r3 = r2.f26236K0
            return r3
        Lf:
            int r0 = r2.f26237L0
            r1 = 1
            if (r0 != r1) goto L19
            w.d r3 = r2.f26236K0
            return r3
        L17:
            r3 = 0
            return r3
        L19:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r3 = r3.name()
            r0.<init>(r3)
            throw r0
    }
}
