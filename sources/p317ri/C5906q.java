package p317ri;

/* renamed from: ri.q */
/* loaded from: classes.dex */
public class C5906q {

    /* renamed from: a */
    public java.io.OutputStream f22730a;

    /* renamed from: ri.q$a */
    public class a extends p317ri.C5906q {

        /* renamed from: b */
        public boolean f22731b;

        public a(p317ri.C5906q r1, java.io.OutputStream r2) {
                r0 = this;
                r0.<init>(r2)
                r1 = 1
                r0.f22731b = r1
                return
        }

        @Override // p317ri.C5906q
        /* renamed from: c */
        public void mo12264c(int r2) {
                r1 = this;
                boolean r0 = r1.f22731b
                if (r0 == 0) goto L8
                r2 = 0
                r1.f22731b = r2
                goto Ld
            L8:
                java.io.OutputStream r0 = r1.f22730a
                r0.write(r2)
            Ld:
                return
        }
    }

    public C5906q(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>()
            r0.f22730a = r1
            return
    }

    /* renamed from: a */
    public p317ri.C5906q mo12262a() {
            r2 = this;
            ri.y0 r0 = new ri.y0
            java.io.OutputStream r1 = r2.f22730a
            r0.<init>(r1)
            return r0
    }

    /* renamed from: b */
    public p317ri.C5906q mo12263b() {
            r2 = this;
            ri.l1 r0 = new ri.l1
            java.io.OutputStream r1 = r2.f22730a
            r0.<init>(r1)
            return r0
    }

    /* renamed from: c */
    public void mo12264c(int r2) {
            r1 = this;
            java.io.OutputStream r0 = r1.f22730a
            r0.write(r2)
            return
    }

    /* renamed from: d */
    public void m12265d(int r1, int r2, byte[] r3) {
            r0 = this;
            r0.m12269i(r1, r2)
            int r1 = r3.length
            r0.m12268g(r1)
            java.io.OutputStream r1 = r0.f22730a
            r1.write(r3)
            return
    }

    /* renamed from: e */
    public void m12266e(int r1, byte[] r2) {
            r0 = this;
            r0.mo12264c(r1)
            int r1 = r2.length
            r0.m12268g(r1)
            java.io.OutputStream r1 = r0.f22730a
            r1.write(r2)
            return
    }

    /* renamed from: f */
    public void m12267f(p317ri.AbstractC5912s r3) {
            r2 = this;
            ri.q$a r0 = new ri.q$a
            java.io.OutputStream r1 = r2.f22730a
            r0.<init>(r2, r1)
            r3.mo12204p(r0)
            return
    }

    /* renamed from: g */
    public void m12268g(int r4) {
            r3 = this;
            r0 = 127(0x7f, float:1.78E-43)
            if (r4 <= r0) goto L22
            r0 = 1
            r1 = r4
            r2 = 1
        L7:
            int r1 = r1 >>> 8
            if (r1 == 0) goto Le
            int r2 = r2 + 1
            goto L7
        Le:
            r1 = r2 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r3.mo12264c(r1)
            int r2 = r2 - r0
            int r2 = r2 * 8
        L17:
            if (r2 < 0) goto L26
            int r0 = r4 >> r2
            byte r0 = (byte) r0
            r3.mo12264c(r0)
            int r2 = r2 + (-8)
            goto L17
        L22:
            byte r4 = (byte) r4
            r3.mo12264c(r4)
        L26:
            return
    }

    /* renamed from: h */
    public void mo12244h(p317ri.InterfaceC5870e r2) {
            r1 = this;
            if (r2 == 0) goto La
            ri.s r2 = r2.mo168e()
            r2.mo12204p(r1)
            return
        La:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "null object detected"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: i */
    public void m12269i(int r4, int r5) {
            r3 = this;
            r0 = 31
            if (r5 >= r0) goto L9
            r4 = r4 | r5
            r3.mo12264c(r4)
            goto L33
        L9:
            r4 = r4 | r0
            r3.mo12264c(r4)
            r4 = 128(0x80, float:1.8E-43)
            if (r5 >= r4) goto L15
            r3.mo12264c(r5)
            goto L33
        L15:
            r0 = 5
            byte[] r0 = new byte[r0]
            r1 = 4
            r2 = r5 & 127(0x7f, float:1.78E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
        L1e:
            int r5 = r5 >> 7
            int r1 = r1 + (-1)
            r2 = r5 & 127(0x7f, float:1.78E-43)
            r2 = r2 | r4
            byte r2 = (byte) r2
            r0[r1] = r2
            r2 = 127(0x7f, float:1.78E-43)
            if (r5 > r2) goto L1e
            int r4 = 5 - r1
            java.io.OutputStream r5 = r3.f22730a
            r5.write(r0, r1, r4)
        L33:
            return
    }
}
