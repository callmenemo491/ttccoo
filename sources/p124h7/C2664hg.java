package p124h7;

/* renamed from: h7.hg */
/* loaded from: classes.dex */
public final class C2664hg extends p124h7.AbstractC2682ig {

    /* renamed from: e */
    public final byte[] f11591e;

    /* renamed from: f */
    public final int f11592f;

    /* renamed from: g */
    public int f11593g;

    /* renamed from: h */
    public int f11594h;

    /* renamed from: i */
    public final java.io.OutputStream f11595i;

    public C2664hg(java.io.OutputStream r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            if (r3 < 0) goto L15
            r0 = 20
            int r3 = java.lang.Math.max(r3, r0)
            byte[] r0 = new byte[r3]
            r1.f11591e = r0
            r1.f11592f = r3
            r1.f11595i = r2
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "bufferSize must be >= 0"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: D */
    public final void m6812D() {
            r4 = this;
            java.io.OutputStream r0 = r4.f11595i
            byte[] r1 = r4.f11591e
            int r2 = r4.f11593g
            r3 = 0
            r0.write(r1, r3, r2)
            r4.f11593g = r3
            return
    }

    /* renamed from: E */
    public final void m6813E(int r3) {
            r2 = this;
            int r0 = r2.f11592f
            int r1 = r2.f11593g
            int r0 = r0 - r1
            if (r0 >= r3) goto La
            r2.m6812D()
        La:
            return
    }

    /* renamed from: F */
    public final void m6814F(int r5) {
            r4 = this;
            byte[] r0 = r4.f11591e
            int r1 = r4.f11593g
            int r2 = r1 + 1
            r4.f11593g = r2
            r3 = r5 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r2 + 1
            r4.f11593g = r1
            int r3 = r5 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 1
            r4.f11593g = r2
            int r3 = r5 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r2 + 1
            r4.f11593g = r1
            int r5 = r5 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r0[r2] = r5
            int r5 = r4.f11594h
            int r5 = r5 + 4
            r4.f11594h = r5
            return
    }

    /* renamed from: G */
    public final void m6815G(long r9) {
            r8 = this;
            byte[] r0 = r8.f11591e
            int r1 = r8.f11593g
            int r2 = r1 + 1
            r8.f11593g = r2
            r3 = 255(0xff, double:1.26E-321)
            long r5 = r9 & r3
            int r6 = (int) r5
            byte r5 = (byte) r6
            r0[r1] = r5
            int r1 = r2 + 1
            r8.f11593g = r1
            r5 = 8
            long r6 = r9 >> r5
            long r6 = r6 & r3
            int r7 = (int) r6
            byte r6 = (byte) r7
            r0[r2] = r6
            int r2 = r1 + 1
            r8.f11593g = r2
            r6 = 16
            long r6 = r9 >> r6
            long r6 = r6 & r3
            int r7 = (int) r6
            byte r6 = (byte) r7
            r0[r1] = r6
            int r1 = r2 + 1
            r8.f11593g = r1
            r6 = 24
            long r6 = r9 >> r6
            long r3 = r3 & r6
            int r4 = (int) r3
            byte r3 = (byte) r4
            r0[r2] = r3
            int r2 = r1 + 1
            r8.f11593g = r2
            r3 = 32
            long r3 = r9 >> r3
            int r4 = (int) r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r2 + 1
            r8.f11593g = r1
            r3 = 40
            long r3 = r9 >> r3
            int r4 = (int) r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 1
            r8.f11593g = r2
            r3 = 48
            long r3 = r9 >> r3
            int r4 = (int) r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r2 + 1
            r8.f11593g = r1
            r1 = 56
            long r9 = r9 >> r1
            int r10 = (int) r9
            r9 = r10 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r0[r2] = r9
            int r9 = r8.f11594h
            int r9 = r9 + r5
            r8.f11594h = r9
            return
    }

    /* renamed from: H */
    public final void m6816H(int r7) {
            r6 = this;
            boolean r0 = p124h7.AbstractC2682ig.f11659d
            if (r0 == 0) goto L37
            int r0 = r6.f11593g
            long r0 = (long) r0
        L7:
            r2 = r7 & (-128(0xffffffffffffff80, float:NaN))
            if (r2 != 0) goto L23
            byte[] r2 = r6.f11591e
            int r3 = r6.f11593g
            int r4 = r3 + 1
            r6.f11593g = r4
            long r3 = (long) r3
            byte r7 = (byte) r7
            p124h7.C2577d1.m6553m(r2, r3, r7)
            int r7 = r6.f11593g
            int r2 = r6.f11594h
            long r3 = (long) r7
            long r3 = r3 - r0
            int r7 = (int) r3
            int r2 = r2 + r7
            r6.f11594h = r2
            goto L4c
        L23:
            byte[] r2 = r6.f11591e
            int r3 = r6.f11593g
            int r4 = r3 + 1
            r6.f11593g = r4
            long r3 = (long) r3
            r5 = r7 & 127(0x7f, float:1.78E-43)
            r5 = r5 | 128(0x80, float:1.8E-43)
            byte r5 = (byte) r5
            p124h7.C2577d1.m6553m(r2, r3, r5)
            int r7 = r7 >>> 7
            goto L7
        L37:
            r0 = r7 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L4d
            byte[] r0 = r6.f11591e
            int r1 = r6.f11593g
            int r2 = r1 + 1
            r6.f11593g = r2
            byte r7 = (byte) r7
            r0[r1] = r7
            int r7 = r6.f11594h
            int r7 = r7 + 1
            r6.f11594h = r7
        L4c:
            return
        L4d:
            byte[] r0 = r6.f11591e
            int r1 = r6.f11593g
            int r2 = r1 + 1
            r6.f11593g = r2
            r2 = r7 & 127(0x7f, float:1.78E-43)
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r0 = r6.f11594h
            int r0 = r0 + 1
            r6.f11594h = r0
            int r7 = r7 >>> 7
            goto L37
    }

    /* renamed from: I */
    public final void m6817I(long r12) {
            r11 = this;
            boolean r0 = p124h7.AbstractC2682ig.f11659d
            r1 = 7
            r2 = 0
            r4 = -128(0xffffffffffffff80, double:NaN)
            if (r0 == 0) goto L3f
            int r0 = r11.f11593g
            long r6 = (long) r0
        Lc:
            long r8 = r12 & r4
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L2b
            byte[] r0 = r11.f11591e
            int r1 = r11.f11593g
            int r2 = r1 + 1
            r11.f11593g = r2
            long r1 = (long) r1
            int r13 = (int) r12
            byte r12 = (byte) r13
            p124h7.C2577d1.m6553m(r0, r1, r12)
            int r12 = r11.f11593g
            int r13 = r11.f11594h
            long r0 = (long) r12
            long r0 = r0 - r6
            int r12 = (int) r0
            int r13 = r13 + r12
            r11.f11594h = r13
            goto L57
        L2b:
            byte[] r0 = r11.f11591e
            int r8 = r11.f11593g
            int r9 = r8 + 1
            r11.f11593g = r9
            long r8 = (long) r8
            int r10 = (int) r12
            r10 = r10 & 127(0x7f, float:1.78E-43)
            r10 = r10 | 128(0x80, float:1.8E-43)
            byte r10 = (byte) r10
            p124h7.C2577d1.m6553m(r0, r8, r10)
            long r12 = r12 >>> r1
            goto Lc
        L3f:
            long r6 = r12 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L58
            byte[] r0 = r11.f11591e
            int r1 = r11.f11593g
            int r2 = r1 + 1
            r11.f11593g = r2
            int r13 = (int) r12
            byte r12 = (byte) r13
            r0[r1] = r12
            int r12 = r11.f11594h
            int r12 = r12 + 1
            r11.f11594h = r12
        L57:
            return
        L58:
            byte[] r0 = r11.f11591e
            int r6 = r11.f11593g
            int r7 = r6 + 1
            r11.f11593g = r7
            int r7 = (int) r12
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r7 = r7 | 128(0x80, float:1.8E-43)
            byte r7 = (byte) r7
            r0[r6] = r7
            int r0 = r11.f11594h
            int r0 = r0 + 1
            r11.f11594h = r0
            long r12 = r12 >>> r1
            goto L3f
    }

    /* renamed from: J */
    public final void m6818J(byte[] r4, int r5, int r6) {
            r3 = this;
            int r5 = r3.f11592f
            int r0 = r3.f11593g
            int r5 = r5 - r0
            r1 = 0
            if (r5 < r6) goto L18
            byte[] r5 = r3.f11591e
            java.lang.System.arraycopy(r4, r1, r5, r0, r6)
            int r4 = r3.f11593g
            int r4 = r4 + r6
            r3.f11593g = r4
        L12:
            int r4 = r3.f11594h
            int r4 = r4 + r6
            r3.f11594h = r4
            return
        L18:
            byte[] r2 = r3.f11591e
            java.lang.System.arraycopy(r4, r1, r2, r0, r5)
            int r6 = r6 - r5
            int r0 = r3.f11592f
            r3.f11593g = r0
            int r0 = r3.f11594h
            int r0 = r0 + r5
            r3.f11594h = r0
            r3.m6812D()
            int r0 = r3.f11592f
            if (r6 > r0) goto L36
            byte[] r0 = r3.f11591e
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            r3.f11593g = r6
            goto L12
        L36:
            java.io.OutputStream r0 = r3.f11595i
            r0.write(r4, r5, r6)
            goto L12
    }

    @Override // p124h7.AbstractC2951xf
    /* renamed from: d */
    public final void mo6723d(byte[] r1, int r2, int r3) {
            r0 = this;
            r2 = 0
            r0.m6818J(r1, r2, r3)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: k */
    public final void mo6724k(byte r4) {
            r3 = this;
            int r0 = r3.f11593g
            int r1 = r3.f11592f
            if (r0 != r1) goto L9
            r3.m6812D()
        L9:
            byte[] r0 = r3.f11591e
            int r1 = r3.f11593g
            int r2 = r1 + 1
            r3.f11593g = r2
            r0[r1] = r4
            int r4 = r3.f11594h
            int r4 = r4 + 1
            r3.f11594h = r4
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: l */
    public final void mo6725l(int r3, boolean r4) {
            r2 = this;
            r0 = 11
            r2.m6813E(r0)
            int r3 = r3 << 3
            r2.m6816H(r3)
            byte[] r3 = r2.f11591e
            int r0 = r2.f11593g
            int r1 = r0 + 1
            r2.f11593g = r1
            r3[r0] = r4
            int r3 = r2.f11594h
            int r3 = r3 + 1
            r2.f11594h = r3
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: m */
    public final void mo6726m(int r1, p124h7.AbstractC2574cg r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.mo6737x(r1)
            int r1 = r2.mo6474h()
            r0.mo6737x(r1)
            r2.mo6517q(r0)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: n */
    public final void mo6727n(int r2, int r3) {
            r1 = this;
            r0 = 14
            r1.m6813E(r0)
            int r2 = r2 << 3
            r2 = r2 | 5
            r1.m6816H(r2)
            r1.m6814F(r3)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: o */
    public final void mo6728o(int r2) {
            r1 = this;
            r0 = 4
            r1.m6813E(r0)
            r1.m6814F(r2)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: p */
    public final void mo6729p(int r2, long r3) {
            r1 = this;
            r0 = 18
            r1.m6813E(r0)
            int r2 = r2 << 3
            r2 = r2 | 1
            r1.m6816H(r2)
            r1.m6815G(r3)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: q */
    public final void mo6730q(long r2) {
            r1 = this;
            r0 = 8
            r1.m6813E(r0)
            r1.m6815G(r2)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: r */
    public final void mo6731r(int r2, int r3) {
            r1 = this;
            r0 = 20
            r1.m6813E(r0)
            int r2 = r2 << 3
            r1.m6816H(r2)
            if (r3 < 0) goto L10
            r1.m6816H(r3)
            return
        L10:
            long r2 = (long) r3
            r1.m6817I(r2)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: s */
    public final void mo6732s(int r3) {
            r2 = this;
            if (r3 < 0) goto La
            r0 = 5
            r2.m6813E(r0)
            r2.m6816H(r3)
            return
        La:
            long r0 = (long) r3
            r2.mo6739z(r0)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: t */
    public final void mo6733t(int r3, p124h7.InterfaceC2935x r4, p124h7.InterfaceC2666i0 r5) {
            r2 = this;
            int r3 = r3 << 3
            r3 = r3 | 2
            r2.mo6737x(r3)
            r3 = r4
            h7.sf r3 = (p124h7.AbstractC2861sf) r3
            int r0 = r3.mo7139a()
            r1 = -1
            if (r0 != r1) goto L18
            int r0 = r5.mo6442e(r3)
            r3.mo7140b(r0)
        L18:
            r2.mo6737x(r0)
            h7.jg r3 = r2.f11660b
            r5.mo6443f(r4, r3)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: u */
    public final void mo6734u(int r5, java.lang.String r6) {
            r4 = this;
            int r5 = r5 << 3
            r5 = r5 | 2
            r4.mo6737x(r5)
            int r5 = r6.length()     // Catch: p124h7.C2613f1 -> L7b
            int r5 = r5 * 3
            int r0 = p124h7.AbstractC2682ig.m6841h(r5)     // Catch: p124h7.C2613f1 -> L7b
            int r1 = r0 + r5
            int r2 = r4.f11592f     // Catch: p124h7.C2613f1 -> L7b
            if (r1 <= r2) goto L25
            byte[] r0 = new byte[r5]     // Catch: p124h7.C2613f1 -> L7b
            r1 = 0
            int r5 = p124h7.C2631g1.m6743b(r6, r0, r1, r5)     // Catch: p124h7.C2613f1 -> L7b
            r4.mo6737x(r5)     // Catch: p124h7.C2613f1 -> L7b
            r4.m6818J(r0, r1, r5)     // Catch: p124h7.C2613f1 -> L7b
            goto L7f
        L25:
            int r5 = r4.f11593g     // Catch: p124h7.C2613f1 -> L7b
            int r2 = r2 - r5
            if (r1 <= r2) goto L2d
            r4.m6812D()     // Catch: p124h7.C2613f1 -> L7b
        L2d:
            int r5 = r6.length()     // Catch: p124h7.C2613f1 -> L7b
            int r5 = p124h7.AbstractC2682ig.m6841h(r5)     // Catch: p124h7.C2613f1 -> L7b
            int r1 = r4.f11593g     // Catch: p124h7.C2613f1 -> L7b
            if (r5 != r0) goto L51
            int r0 = r1 + r5
            r4.f11593g = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            byte[] r2 = r4.f11591e     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            int r3 = r4.f11592f     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            int r3 = r3 - r0
            int r0 = p124h7.C2631g1.m6743b(r6, r2, r0, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            r4.f11593g = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            int r2 = r0 - r1
            int r2 = r2 - r5
            r4.m6816H(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            r4.f11593g = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            goto L62
        L51:
            int r2 = p124h7.C2631g1.m6744c(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            r4.m6816H(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            byte[] r5 = r4.f11591e     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            int r0 = r4.f11593g     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            int r5 = p124h7.C2631g1.m6743b(r6, r5, r0, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            r4.f11593g = r5     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
        L62:
            int r5 = r4.f11594h     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            int r5 = r5 + r2
            r4.f11594h = r5     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L68 p124h7.C2613f1 -> L6f
            goto L7f
        L68:
            r5 = move-exception
            h7.gg r0 = new h7.gg     // Catch: p124h7.C2613f1 -> L7b
            r0.<init>(r5)     // Catch: p124h7.C2613f1 -> L7b
            throw r0     // Catch: p124h7.C2613f1 -> L7b
        L6f:
            r5 = move-exception
            int r0 = r4.f11594h     // Catch: p124h7.C2613f1 -> L7b
            int r2 = r4.f11593g     // Catch: p124h7.C2613f1 -> L7b
            int r2 = r2 - r1
            int r0 = r0 - r2
            r4.f11594h = r0     // Catch: p124h7.C2613f1 -> L7b
            r4.f11593g = r1     // Catch: p124h7.C2613f1 -> L7b
            throw r5     // Catch: p124h7.C2613f1 -> L7b
        L7b:
            r5 = move-exception
            r4.m6843j(r6, r5)
        L7f:
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: v */
    public final void mo6735v(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | r2
            r0.mo6737x(r1)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: w */
    public final void mo6736w(int r2, int r3) {
            r1 = this;
            r0 = 20
            r1.m6813E(r0)
            int r2 = r2 << 3
            r1.m6816H(r2)
            r1.m6816H(r3)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: x */
    public final void mo6737x(int r2) {
            r1 = this;
            r0 = 5
            r1.m6813E(r0)
            r1.m6816H(r2)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: y */
    public final void mo6738y(int r2, long r3) {
            r1 = this;
            r0 = 20
            r1.m6813E(r0)
            int r2 = r2 << 3
            r1.m6816H(r2)
            r1.m6817I(r3)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: z */
    public final void mo6739z(long r2) {
            r1 = this;
            r0 = 10
            r1.m6813E(r0)
            r1.m6817I(r2)
            return
    }
}
