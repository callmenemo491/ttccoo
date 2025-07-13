package p124h7;

/* renamed from: h7.fg */
/* loaded from: classes.dex */
public final class C2628fg extends p124h7.AbstractC2682ig {

    /* renamed from: e */
    public final byte[] f11519e;

    /* renamed from: f */
    public final int f11520f;

    /* renamed from: g */
    public int f11521g;

    public C2628fg(byte[] r3, int r4, int r5) {
            r2 = this;
            r4 = 0
            r2.<init>(r4)
            int r4 = r3.length
            int r0 = r4 - r5
            r0 = r0 | r5
            r1 = 0
            if (r0 < 0) goto L12
            r2.f11519e = r3
            r2.f11521g = r1
            r2.f11520f = r5
            return
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.String r4 = "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: D */
    public final int m6722D() {
            r2 = this;
            int r0 = r2.f11520f
            int r1 = r2.f11521g
            int r0 = r0 - r1
            return r0
    }

    @Override // p124h7.AbstractC2951xf
    /* renamed from: d */
    public final void mo6723d(byte[] r4, int r5, int r6) {
            r3 = this;
            r5 = 0
            byte[] r0 = r3.f11519e     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r1 = r3.f11521g     // Catch: java.lang.IndexOutOfBoundsException -> Le
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r4 = r3.f11521g     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r4 = r4 + r6
            r3.f11521g = r4     // Catch: java.lang.IndexOutOfBoundsException -> Le
            return
        Le:
            r4 = move-exception
            h7.gg r0 = new h7.gg
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r3.f11521g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            r5 = 1
            int r2 = r3.f11520f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r5] = r6
            java.lang.String r5 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r5 = java.lang.String.format(r5, r1)
            r0.<init>(r5, r4)
            throw r0
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: k */
    public final void mo6724k(byte r5) {
            r4 = this;
            byte[] r0 = r4.f11519e     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r1 = r4.f11521g     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r4.f11521g = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            return
        Lb:
            r5 = move-exception
            h7.gg r0 = new h7.gg
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.f11521g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r4.f11520f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r5)
            throw r0
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: l */
    public final void mo6725l(int r1, boolean r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.mo6737x(r1)
            r0.mo6724k(r2)
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
    public final void mo6727n(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 5
            r0.mo6737x(r1)
            r0.mo6728o(r2)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: o */
    public final void mo6728o(int r5) {
            r4 = this;
            byte[] r0 = r4.f11519e     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r4.f11521g     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 1
            r4.f11521g = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r3 = r5 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r2 + 1
            r4.f11521g = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r3 = r5 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 1
            r4.f11521g = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r3 = r5 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r2 + 1
            r4.f11521g = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r5 = r5 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            return
        L2f:
            r5 = move-exception
            h7.gg r0 = new h7.gg
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.f11521g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r4.f11520f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r5)
            throw r0
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: p */
    public final void mo6729p(int r1, long r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 1
            r0.mo6737x(r1)
            r0.mo6730q(r2)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: q */
    public final void mo6730q(long r6) {
            r5 = this;
            byte[] r0 = r5.f11519e     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r5.f11521g     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.f11521g = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r3 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.f11521g = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 8
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.f11521g = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 16
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.f11521g = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 24
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.f11521g = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 32
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.f11521g = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 40
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.f11521g = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 48
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.f11521g = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r1 = 56
            long r6 = r6 >> r1
            int r7 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r6 = r7 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            return
        L70:
            r6 = move-exception
            h7.gg r7 = new h7.gg
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            int r2 = r5.f11521g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            int r1 = r5.f11520f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0, r6)
            throw r7
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: r */
    public final void mo6731r(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.mo6737x(r1)
            if (r2 < 0) goto Lb
            r0.mo6737x(r2)
            goto Lf
        Lb:
            long r1 = (long) r2
            r0.mo6739z(r1)
        Lf:
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: s */
    public final void mo6732s(int r3) {
            r2 = this;
            if (r3 < 0) goto L6
            r2.mo6737x(r3)
            return
        L6:
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
            int r5 = r4.f11521g
            int r0 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            int r0 = r0 * 3
            int r0 = p124h7.AbstractC2682ig.m6841h(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            int r1 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            if (r1 != r0) goto L35
            int r0 = r5 + r1
            r4.f11521g = r0     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            byte[] r2 = r4.f11519e     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            int r3 = r4.f11520f     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            int r3 = r3 - r0
            int r0 = p124h7.C2631g1.m6743b(r6, r2, r0, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            r4.f11521g = r5     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            int r2 = r0 - r5
            int r2 = r2 - r1
            r4.mo6737x(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
        L32:
            r4.f11521g = r0     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            goto L55
        L35:
            int r0 = p124h7.C2631g1.m6744c(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            r4.mo6737x(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            byte[] r0 = r4.f11519e     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            int r1 = r4.f11521g     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            int r2 = r4.f11520f     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            int r2 = r2 - r1
            int r0 = p124h7.C2631g1.m6743b(r6, r0, r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p124h7.C2613f1 -> L4f
            goto L32
        L48:
            r5 = move-exception
            h7.gg r6 = new h7.gg
            r6.<init>(r5)
            throw r6
        L4f:
            r0 = move-exception
            r4.f11521g = r5
            r4.m6843j(r6, r0)
        L55:
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
    public final void mo6736w(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.mo6737x(r1)
            r0.mo6737x(r2)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: x */
    public final void mo6737x(int r5) {
            r4 = this;
            boolean r0 = p124h7.AbstractC2682ig.f11659d
            if (r0 == 0) goto L6
            int r0 = p124h7.C2897uf.f11947a
        L6:
            r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L16
            byte[] r0 = r4.f11519e     // Catch: java.lang.IndexOutOfBoundsException -> L28
            int r1 = r4.f11521g     // Catch: java.lang.IndexOutOfBoundsException -> L28
            int r2 = r1 + 1
            r4.f11521g = r2     // Catch: java.lang.IndexOutOfBoundsException -> L28
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L28
            r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L28
            return
        L16:
            byte[] r0 = r4.f11519e     // Catch: java.lang.IndexOutOfBoundsException -> L28
            int r1 = r4.f11521g     // Catch: java.lang.IndexOutOfBoundsException -> L28
            int r2 = r1 + 1
            r4.f11521g = r2     // Catch: java.lang.IndexOutOfBoundsException -> L28
            r2 = r5 & 127(0x7f, float:1.78E-43)
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> L28
            r0[r1] = r2     // Catch: java.lang.IndexOutOfBoundsException -> L28
            int r5 = r5 >>> 7
            goto L6
        L28:
            r5 = move-exception
            h7.gg r0 = new h7.gg
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.f11521g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r4.f11520f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r5)
            throw r0
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: y */
    public final void mo6738y(int r1, long r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.mo6737x(r1)
            r0.mo6739z(r2)
            return
    }

    @Override // p124h7.AbstractC2682ig
    /* renamed from: z */
    public final void mo6739z(long r10) {
            r9 = this;
            boolean r0 = p124h7.AbstractC2682ig.f11659d
            r1 = 7
            r2 = 0
            r4 = -128(0xffffffffffffff80, double:NaN)
            if (r0 == 0) goto L3b
            int r0 = r9.f11520f
            int r6 = r9.f11521g
            int r0 = r0 - r6
            r6 = 10
            if (r0 < r6) goto L3b
        L12:
            long r6 = r10 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L27
            byte[] r0 = r9.f11519e
            int r1 = r9.f11521g
            int r2 = r1 + 1
            r9.f11521g = r2
            long r1 = (long) r1
            int r11 = (int) r10
            byte r10 = (byte) r11
            p124h7.C2577d1.m6553m(r0, r1, r10)
            return
        L27:
            byte[] r0 = r9.f11519e
            int r6 = r9.f11521g
            int r7 = r6 + 1
            r9.f11521g = r7
            long r6 = (long) r6
            int r8 = (int) r10
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r8 = r8 | 128(0x80, float:1.8E-43)
            byte r8 = (byte) r8
            p124h7.C2577d1.m6553m(r0, r6, r8)
            long r10 = r10 >>> r1
            goto L12
        L3b:
            long r6 = r10 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L4e
            byte[] r0 = r9.f11519e     // Catch: java.lang.IndexOutOfBoundsException -> L60
            int r1 = r9.f11521g     // Catch: java.lang.IndexOutOfBoundsException -> L60
            int r2 = r1 + 1
            r9.f11521g = r2     // Catch: java.lang.IndexOutOfBoundsException -> L60
            int r11 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L60
            byte r10 = (byte) r11     // Catch: java.lang.IndexOutOfBoundsException -> L60
            r0[r1] = r10     // Catch: java.lang.IndexOutOfBoundsException -> L60
            return
        L4e:
            byte[] r0 = r9.f11519e     // Catch: java.lang.IndexOutOfBoundsException -> L60
            int r6 = r9.f11521g     // Catch: java.lang.IndexOutOfBoundsException -> L60
            int r7 = r6 + 1
            r9.f11521g = r7     // Catch: java.lang.IndexOutOfBoundsException -> L60
            int r7 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L60
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r7 = r7 | 128(0x80, float:1.8E-43)
            byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L60
            r0[r6] = r7     // Catch: java.lang.IndexOutOfBoundsException -> L60
            long r10 = r10 >>> r1
            goto L3b
        L60:
            r10 = move-exception
            h7.gg r11 = new h7.gg
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            int r2 = r9.f11521g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            int r1 = r9.f11520f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r11.<init>(r0, r10)
            throw r11
    }
}
