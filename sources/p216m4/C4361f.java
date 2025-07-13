package p216m4;

/* renamed from: m4.f */
/* loaded from: classes.dex */
public final class C4361f implements p216m4.InterfaceC4365j {

    /* renamed from: a */
    public final byte[] f17896a;

    /* renamed from: b */
    public final p352u5.InterfaceC6314f f17897b;

    /* renamed from: c */
    public final long f17898c;

    /* renamed from: d */
    public long f17899d;

    /* renamed from: e */
    public byte[] f17900e;

    /* renamed from: f */
    public int f17901f;

    /* renamed from: g */
    public int f17902g;

    static {
            java.lang.String r0 = "goog.exo.extractor"
            p088f4.C1997c0.m5181a(r0)
            return
    }

    public C4361f(p352u5.InterfaceC6314f r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.f17897b = r1
            r0.f17899d = r2
            r0.f17898c = r4
            r1 = 65536(0x10000, float:9.1835E-41)
            byte[] r1 = new byte[r1]
            r0.f17900e = r1
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
            r0.f17896a = r1
            return
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: a */
    public long mo9786a() {
            r2 = this;
            long r0 = r2.f17898c
            return r0
    }

    @Override // p216m4.InterfaceC4365j, p352u5.InterfaceC6314f
    /* renamed from: b */
    public int mo6020b(byte[] r9, int r10, int r11) {
            r8 = this;
            int r0 = r8.f17902g
            r1 = 0
            if (r0 != 0) goto L6
            goto L13
        L6:
            int r0 = java.lang.Math.min(r0, r11)
            byte[] r2 = r8.f17900e
            java.lang.System.arraycopy(r2, r1, r9, r10, r0)
            r8.m9801u(r0)
            r1 = r0
        L13:
            if (r1 != 0) goto L1f
            r6 = 0
            r7 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            int r1 = r2.m9800t(r3, r4, r5, r6, r7)
        L1f:
            r8.m9798r(r1)
            return r1
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: d */
    public int mo9787d(int r8) {
            r7 = this;
            int r0 = r7.f17902g
            int r0 = java.lang.Math.min(r0, r8)
            r7.m9801u(r0)
            if (r0 != 0) goto L1a
            byte[] r2 = r7.f17896a
            r3 = 0
            int r0 = r2.length
            int r4 = java.lang.Math.min(r8, r0)
            r5 = 0
            r6 = 1
            r1 = r7
            int r0 = r1.m9800t(r2, r3, r4, r5, r6)
        L1a:
            r7.m9798r(r0)
            return r0
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: e */
    public boolean mo9788e(byte[] r9, int r10, int r11, boolean r12) {
            r8 = this;
            int r0 = r8.f17902g
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto L13
        L7:
            int r0 = java.lang.Math.min(r0, r11)
            byte[] r2 = r8.f17900e
            java.lang.System.arraycopy(r2, r1, r9, r10, r0)
            r8.m9801u(r0)
        L13:
            r6 = r0
        L14:
            r0 = -1
            if (r6 >= r11) goto L23
            if (r6 == r0) goto L23
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r12
            int r6 = r2.m9800t(r3, r4, r5, r6, r7)
            goto L14
        L23:
            r8.m9798r(r6)
            if (r6 == r0) goto L29
            r1 = 1
        L29:
            return r1
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: f */
    public int mo9789f(byte[] r8, int r9, int r10) {
            r7 = this;
            r7.m9799s(r10)
            int r0 = r7.f17902g
            int r3 = r7.f17901f
            int r0 = r0 - r3
            if (r0 != 0) goto L1e
            byte[] r2 = r7.f17900e
            r5 = 0
            r6 = 1
            r1 = r7
            r4 = r10
            int r10 = r1.m9800t(r2, r3, r4, r5, r6)
            r0 = -1
            if (r10 != r0) goto L18
            return r0
        L18:
            int r0 = r7.f17902g
            int r0 = r0 + r10
            r7.f17902g = r0
            goto L22
        L1e:
            int r10 = java.lang.Math.min(r10, r0)
        L22:
            byte[] r0 = r7.f17900e
            int r1 = r7.f17901f
            java.lang.System.arraycopy(r0, r1, r8, r9, r10)
            int r8 = r7.f17901f
            int r8 = r8 + r10
            r7.f17901f = r8
            return r10
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: h */
    public void mo9790h() {
            r1 = this;
            r0 = 0
            r1.f17901f = r0
            return
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: i */
    public void mo9791i(int r8) {
            r7 = this;
            int r0 = r7.f17902g
            int r0 = java.lang.Math.min(r0, r8)
            r7.m9801u(r0)
            r5 = r0
        La:
            r0 = -1
            if (r5 >= r8) goto L21
            if (r5 == r0) goto L21
            byte[] r0 = r7.f17896a
            int r0 = r0.length
            int r0 = r0 + r5
            int r4 = java.lang.Math.min(r8, r0)
            byte[] r2 = r7.f17896a
            int r3 = -r5
            r6 = 0
            r1 = r7
            int r5 = r1.m9800t(r2, r3, r4, r5, r6)
            goto La
        L21:
            r7.m9798r(r5)
            return
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: k */
    public boolean mo9792k(int r8, boolean r9) {
            r7 = this;
            r7.m9799s(r8)
            int r0 = r7.f17902g
            int r1 = r7.f17901f
            int r0 = r0 - r1
            r5 = r0
        L9:
            if (r5 >= r8) goto L21
            byte[] r2 = r7.f17900e
            int r3 = r7.f17901f
            r1 = r7
            r4 = r8
            r6 = r9
            int r5 = r1.m9800t(r2, r3, r4, r5, r6)
            r0 = -1
            if (r5 != r0) goto L1b
            r8 = 0
            return r8
        L1b:
            int r0 = r7.f17901f
            int r0 = r0 + r5
            r7.f17902g = r0
            goto L9
        L21:
            int r9 = r7.f17901f
            int r9 = r9 + r8
            r7.f17901f = r9
            r8 = 1
            return r8
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: m */
    public boolean mo9793m(byte[] r2, int r3, int r4, boolean r5) {
            r1 = this;
            boolean r5 = r1.mo9792k(r4, r5)
            if (r5 != 0) goto L8
            r2 = 0
            return r2
        L8:
            byte[] r5 = r1.f17900e
            int r0 = r1.f17901f
            int r0 = r0 - r4
            java.lang.System.arraycopy(r5, r0, r2, r3, r4)
            r2 = 1
            return r2
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: n */
    public long mo9794n() {
            r4 = this;
            long r0 = r4.f17899d
            int r2 = r4.f17901f
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: o */
    public void mo9795o(byte[] r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.mo9793m(r2, r3, r4, r0)
            return
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: p */
    public void mo9796p(int r2) {
            r1 = this;
            r0 = 0
            r1.mo9792k(r2, r0)
            return
    }

    @Override // p216m4.InterfaceC4365j
    /* renamed from: q */
    public long mo9797q() {
            r2 = this;
            long r0 = r2.f17899d
            return r0
    }

    /* renamed from: r */
    public final void m9798r(int r5) {
            r4 = this;
            r0 = -1
            if (r5 == r0) goto L9
            long r0 = r4.f17899d
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.f17899d = r0
        L9:
            return
    }

    @Override // p216m4.InterfaceC4365j
    public void readFully(byte[] r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.mo9788e(r2, r3, r4, r0)
            return
    }

    /* renamed from: s */
    public final void m9799s(int r4) {
            r3 = this;
            int r0 = r3.f17901f
            int r0 = r0 + r4
            byte[] r4 = r3.f17900e
            int r1 = r4.length
            if (r0 <= r1) goto L1d
            int r4 = r4.length
            int r4 = r4 * 2
            r1 = 65536(0x10000, float:9.1835E-41)
            int r1 = r1 + r0
            r2 = 524288(0x80000, float:7.34684E-40)
            int r0 = r0 + r2
            int r4 = p371v5.C6552b0.m13315h(r4, r1, r0)
            byte[] r0 = r3.f17900e
            byte[] r4 = java.util.Arrays.copyOf(r0, r4)
            r3.f17900e = r4
        L1d:
            return
    }

    /* renamed from: t */
    public final int m9800t(byte[] r2, int r3, int r4, int r5, boolean r6) {
            r1 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L1e
            u5.f r0 = r1.f17897b
            int r3 = r3 + r5
            int r4 = r4 - r5
            int r2 = r0.mo6020b(r2, r3, r4)
            r3 = -1
            if (r2 != r3) goto L1c
            if (r5 != 0) goto L16
            if (r6 == 0) goto L16
            return r3
        L16:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L1c:
            int r5 = r5 + r2
            return r5
        L1e:
            java.io.InterruptedIOException r2 = new java.io.InterruptedIOException
            r2.<init>()
            throw r2
    }

    /* renamed from: u */
    public final void m9801u(int r6) {
            r5 = this;
            int r0 = r5.f17902g
            int r0 = r0 - r6
            r5.f17902g = r0
            r1 = 0
            r5.f17901f = r1
            byte[] r2 = r5.f17900e
            int r3 = r2.length
            r4 = 524288(0x80000, float:7.34684E-40)
            int r3 = r3 - r4
            if (r0 >= r3) goto L16
            r3 = 65536(0x10000, float:9.1835E-41)
            int r3 = r3 + r0
            byte[] r3 = new byte[r3]
            goto L17
        L16:
            r3 = r2
        L17:
            java.lang.System.arraycopy(r2, r6, r3, r1, r0)
            r5.f17900e = r3
            return
    }
}
