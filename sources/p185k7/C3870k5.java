package p185k7;

/* renamed from: k7.k5 */
/* loaded from: classes.dex */
public final class C3870k5 extends p185k7.AbstractC3896m5 {

    /* renamed from: c0 */
    public final byte[] f16719c0;

    /* renamed from: d0 */
    public final int f16720d0;

    /* renamed from: e0 */
    public int f16721e0;

    public C3870k5(byte[] r3, int r4, int r5) {
            r2 = this;
            r4 = 0
            r2.<init>(r4)
            int r4 = r3.length
            int r0 = r4 - r5
            r0 = r0 | r5
            r1 = 0
            if (r0 < 0) goto L12
            r2.f16719c0 = r3
            r2.f16721e0 = r1
            r2.f16720d0 = r5
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

    @Override // p185k7.AbstractC3896m5
    /* renamed from: A */
    public final void mo8763A(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.mo8764B(r1)
            r0.mo8764B(r2)
            return
    }

    @Override // p185k7.AbstractC3896m5
    /* renamed from: B */
    public final void mo8764B(int r5) {
            r4 = this;
            boolean r0 = p185k7.AbstractC3896m5.f16746b0
            if (r0 == 0) goto L6
            int r0 = p185k7.C3744b5.f16532a
        L6:
            r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L16
            byte[] r0 = r4.f16719c0     // Catch: java.lang.IndexOutOfBoundsException -> L28
            int r1 = r4.f16721e0     // Catch: java.lang.IndexOutOfBoundsException -> L28
            int r2 = r1 + 1
            r4.f16721e0 = r2     // Catch: java.lang.IndexOutOfBoundsException -> L28
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L28
            r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L28
            return
        L16:
            byte[] r0 = r4.f16719c0     // Catch: java.lang.IndexOutOfBoundsException -> L28
            int r1 = r4.f16721e0     // Catch: java.lang.IndexOutOfBoundsException -> L28
            int r2 = r1 + 1
            r4.f16721e0 = r2     // Catch: java.lang.IndexOutOfBoundsException -> L28
            r2 = r5 & 127(0x7f, float:1.78E-43)
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> L28
            r0[r1] = r2     // Catch: java.lang.IndexOutOfBoundsException -> L28
            int r5 = r5 >>> 7
            goto L6
        L28:
            r5 = move-exception
            k7.l5 r0 = new k7.l5
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.f16721e0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r4.f16720d0
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

    @Override // p185k7.AbstractC3896m5
    /* renamed from: C */
    public final void mo8765C(int r1, long r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.mo8764B(r1)
            r0.mo8766D(r2)
            return
    }

    @Override // p185k7.AbstractC3896m5
    /* renamed from: D */
    public final void mo8766D(long r13) {
            r12 = this;
            boolean r0 = p185k7.AbstractC3896m5.f16746b0
            r1 = 7
            r2 = 0
            r4 = -128(0xffffffffffffff80, double:NaN)
            if (r0 == 0) goto L45
            int r0 = r12.f16720d0
            int r6 = r12.f16721e0
            int r0 = r0 - r6
            r6 = 10
            if (r0 < r6) goto L45
        L12:
            long r6 = r13 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L2c
            byte[] r0 = r12.f16719c0
            int r1 = r12.f16721e0
            int r2 = r1 + 1
            r12.f16721e0 = r2
            long r1 = (long) r1
            int r14 = (int) r13
            byte r13 = (byte) r14
            e7.i8 r14 = p185k7.C3859j8.f16708c
            long r3 = p185k7.C3859j8.f16711f
            long r3 = r3 + r1
            r14.mo4206d(r0, r3, r13)
            return
        L2c:
            byte[] r0 = r12.f16719c0
            int r6 = r12.f16721e0
            int r7 = r6 + 1
            r12.f16721e0 = r7
            long r6 = (long) r6
            int r8 = (int) r13
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r8 = r8 | 128(0x80, float:1.8E-43)
            byte r8 = (byte) r8
            e7.i8 r9 = p185k7.C3859j8.f16708c
            long r10 = p185k7.C3859j8.f16711f
            long r10 = r10 + r6
            r9.mo4206d(r0, r10, r8)
            long r13 = r13 >>> r1
            goto L12
        L45:
            long r6 = r13 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L58
            byte[] r0 = r12.f16719c0     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            int r1 = r12.f16721e0     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            int r2 = r1 + 1
            r12.f16721e0 = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            int r14 = (int) r13     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            byte r13 = (byte) r14     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            r0[r1] = r13     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            return
        L58:
            byte[] r0 = r12.f16719c0     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            int r6 = r12.f16721e0     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            int r7 = r6 + 1
            r12.f16721e0 = r7     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            int r7 = (int) r13     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r7 = r7 | 128(0x80, float:1.8E-43)
            byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            r0[r6] = r7     // Catch: java.lang.IndexOutOfBoundsException -> L6a
            long r13 = r13 >>> r1
            goto L45
        L6a:
            r13 = move-exception
            k7.l5 r14 = new k7.l5
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            int r2 = r12.f16721e0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            int r1 = r12.f16720d0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r14.<init>(r0, r13)
            throw r14
    }

    /* renamed from: K */
    public final int m8767K() {
            r2 = this;
            int r0 = r2.f16720d0
            int r1 = r2.f16721e0
            int r0 = r0 - r1
            return r0
    }

    /* renamed from: L */
    public final void m8768L(byte[] r4, int r5, int r6) {
            r3 = this;
            r5 = 0
            byte[] r0 = r3.f16719c0     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r1 = r3.f16721e0     // Catch: java.lang.IndexOutOfBoundsException -> Le
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r4 = r3.f16721e0     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r4 = r4 + r6
            r3.f16721e0 = r4     // Catch: java.lang.IndexOutOfBoundsException -> Le
            return
        Le:
            r4 = move-exception
            k7.l5 r0 = new k7.l5
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r3.f16721e0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            r5 = 1
            int r2 = r3.f16720d0
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

    /* renamed from: M */
    public final void m8769M(byte[] r1, int r2, int r3) {
            r0 = this;
            r2 = 0
            r0.m8768L(r1, r2, r3)
            return
    }

    @Override // p185k7.AbstractC3896m5
    /* renamed from: o */
    public final void mo8770o(byte r5) {
            r4 = this;
            byte[] r0 = r4.f16719c0     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r1 = r4.f16721e0     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r4.f16721e0 = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            return
        Lb:
            r5 = move-exception
            k7.l5 r0 = new k7.l5
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.f16721e0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r4.f16720d0
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

    @Override // p185k7.AbstractC3896m5
    /* renamed from: p */
    public final void mo8771p(int r1, boolean r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.mo8764B(r1)
            r0.mo8770o(r2)
            return
    }

    @Override // p185k7.AbstractC3896m5
    /* renamed from: q */
    public final void mo8772q(int r1, p185k7.AbstractC3842i5 r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.mo8764B(r1)
            int r1 = r2.mo8520h()
            r0.mo8764B(r1)
            r2.mo8534n(r0)
            return
    }

    @Override // p185k7.AbstractC3896m5
    /* renamed from: r */
    public final void mo8773r(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 5
            r0.mo8764B(r1)
            r0.mo8774t(r2)
            return
    }

    @Override // p185k7.AbstractC3896m5
    /* renamed from: t */
    public final void mo8774t(int r5) {
            r4 = this;
            byte[] r0 = r4.f16719c0     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r4.f16721e0     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 1
            r4.f16721e0 = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r3 = r5 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r2 + 1
            r4.f16721e0 = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r3 = r5 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 1
            r4.f16721e0 = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r3 = r5 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r2 + 1
            r4.f16721e0 = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r5 = r5 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            return
        L2f:
            r5 = move-exception
            k7.l5 r0 = new k7.l5
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.f16721e0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r4.f16720d0
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

    @Override // p185k7.AbstractC3896m5
    /* renamed from: u */
    public final void mo8775u(int r1, long r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 1
            r0.mo8764B(r1)
            r0.mo8776v(r2)
            return
    }

    @Override // p185k7.AbstractC3896m5
    /* renamed from: v */
    public final void mo8776v(long r6) {
            r5 = this;
            byte[] r0 = r5.f16719c0     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r5.f16721e0     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.f16721e0 = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r3 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.f16721e0 = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 8
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.f16721e0 = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 16
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.f16721e0 = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 24
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.f16721e0 = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 32
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.f16721e0 = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 40
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.f16721e0 = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 48
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.f16721e0 = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r1 = 56
            long r6 = r6 >> r1
            int r7 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r6 = r7 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            return
        L70:
            r6 = move-exception
            k7.l5 r7 = new k7.l5
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            int r2 = r5.f16721e0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            int r1 = r5.f16720d0
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

    @Override // p185k7.AbstractC3896m5
    /* renamed from: w */
    public final void mo8777w(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.mo8764B(r1)
            if (r2 < 0) goto Lb
            r0.mo8764B(r2)
            goto Lf
        Lb:
            long r1 = (long) r2
            r0.mo8766D(r1)
        Lf:
            return
    }

    @Override // p185k7.AbstractC3896m5
    /* renamed from: x */
    public final void mo8778x(int r3) {
            r2 = this;
            if (r3 < 0) goto L6
            r2.mo8764B(r3)
            return
        L6:
            long r0 = (long) r3
            r2.mo8766D(r0)
            return
    }

    @Override // p185k7.AbstractC3896m5
    /* renamed from: y */
    public final void mo8779y(int r8, java.lang.String r9) {
            r7 = this;
            int r8 = r8 << 3
            r8 = r8 | 2
            r7.mo8764B(r8)
            int r8 = r7.f16721e0
            int r0 = r9.length()     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            int r0 = r0 * 3
            int r0 = p185k7.AbstractC3896m5.m8824m(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            int r1 = r9.length()     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            if (r1 != r0) goto L35
            int r0 = r8 + r1
            r7.f16721e0 = r0     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            byte[] r2 = r7.f16719c0     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            int r3 = r7.f16720d0     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            int r3 = r3 - r0
            int r0 = p185k7.C3899m8.m8831b(r9, r2, r0, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            r7.f16721e0 = r8     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            int r2 = r0 - r8
            int r2 = r2 - r1
            r7.mo8764B(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
        L32:
            r7.f16721e0 = r0     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            goto L6e
        L35:
            int r0 = p185k7.C3899m8.m8832c(r9)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            r7.mo8764B(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            byte[] r0 = r7.f16719c0     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            int r1 = r7.f16721e0     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            int r2 = r7.f16720d0     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            int r2 = r2 - r1
            int r0 = p185k7.C3899m8.m8831b(r9, r0, r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L48 p185k7.C3886l8 -> L4f
            goto L32
        L48:
            r8 = move-exception
            k7.l5 r9 = new k7.l5
            r9.<init>(r8)
            throw r9
        L4f:
            r0 = move-exception
            r6 = r0
            r7.f16721e0 = r8
            java.util.logging.Logger r1 = p185k7.AbstractC3896m5.f16745a0
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "com.google.protobuf.CodedOutputStream"
            java.lang.String r4 = "inefficientWriteStringNoTag"
            java.lang.String r5 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            r1.logp(r2, r3, r4, r5, r6)
            java.nio.charset.Charset r8 = p185k7.C3871k6.f16722a
            byte[] r8 = r9.getBytes(r8)
            int r9 = r8.length     // Catch: p185k7.C3883l5 -> L6f java.lang.IndexOutOfBoundsException -> L71
            r7.mo8764B(r9)     // Catch: p185k7.C3883l5 -> L6f java.lang.IndexOutOfBoundsException -> L71
            r0 = 0
            r7.m8769M(r8, r0, r9)     // Catch: p185k7.C3883l5 -> L6f java.lang.IndexOutOfBoundsException -> L71
        L6e:
            return
        L6f:
            r8 = move-exception
            throw r8
        L71:
            r8 = move-exception
            k7.l5 r9 = new k7.l5
            r9.<init>(r8)
            throw r9
    }

    @Override // p185k7.AbstractC3896m5
    /* renamed from: z */
    public final void mo8780z(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | r2
            r0.mo8764B(r1)
            return
    }
}
