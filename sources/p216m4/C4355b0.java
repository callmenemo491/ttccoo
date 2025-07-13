package p216m4;

/* renamed from: m4.b0 */
/* loaded from: classes.dex */
public final class C4355b0 {

    /* renamed from: a */
    public final /* synthetic */ int f17869a;

    /* renamed from: b */
    public java.lang.Object f17870b;

    /* renamed from: c */
    public int f17871c;

    /* renamed from: d */
    public int f17872d;

    /* renamed from: e */
    public int f17873e;

    public C4355b0() {
            r1 = this;
            r0 = 1
            r1.f17869a = r0
            r1.<init>()
            byte[] r0 = p371v5.C6552b0.f25629f
            r1.f17870b = r0
            return
    }

    public C4355b0(int r6, int r7) {
            r5 = this;
            r0 = 3
            r5.f17869a = r0
            r5.<init>()
            r4.g[] r1 = new p304r4.C5786g[r6]
            r5.f17870b = r1
            r1 = 0
        Lb:
            if (r1 >= r6) goto L21
            java.lang.Object r2 = r5.f17870b
            r4.g[] r2 = (p304r4.C5786g[]) r2
            r4.g r3 = new r4.g
            int r4 = r7 + 4
            int r4 = r4 * 17
            int r4 = r4 + 1
            r3.<init>(r4, r0)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lb
        L21:
            int r7 = r7 * 17
            r5.f17873e = r7
            r5.f17872d = r6
            r6 = -1
            r5.f17871c = r6
            return
    }

    public C4355b0(byte[] r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f17869a = r0
            r1.<init>()
            r1.f17870b = r2
            r1.f17873e = r3
            return
    }

    public C4355b0(byte[] r2, int r3, int r4) {
            r1 = this;
            r0 = 2
            r1.f17869a = r0
            r1.<init>()
            r1.f17870b = r2
            r1.f17872d = r3
            r1.f17871c = r4
            r2 = 0
            r1.f17873e = r2
            r1.m9756a()
            return
    }

    public C4355b0(byte[] r1, int r2, p139i1.C3058a r3) {
            r0 = this;
            r0.f17869a = r2
            r3 = 1
            if (r2 == r3) goto Le
            r0.<init>()
            r0.f17870b = r1
            int r1 = r1.length
            r0.f17871c = r1
            return
        Le:
            int r2 = r1.length
            r0.f17869a = r3
            r0.<init>()
            r0.f17870b = r1
            r0.f17873e = r2
            return
    }

    /* renamed from: a */
    public void m9756a() {
            r4 = this;
            int r0 = r4.f17869a
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L8;
                default: goto L7;
            }
        L7:
            goto L2e
        L8:
            int r0 = r4.f17871c
            if (r0 < 0) goto L17
            int r3 = r4.f17873e
            if (r0 < r3) goto L16
            if (r0 != r3) goto L17
            int r0 = r4.f17872d
            if (r0 != 0) goto L17
        L16:
            r1 = 1
        L17:
            p371v5.C6549a.m13291e(r1)
            return
        L1b:
            int r0 = r4.f17872d
            if (r0 < 0) goto L2a
            int r3 = r4.f17871c
            if (r0 < r3) goto L29
            if (r0 != r3) goto L2a
            int r0 = r4.f17873e
            if (r0 != 0) goto L2a
        L29:
            r1 = 1
        L2a:
            p371v5.C6549a.m13291e(r1)
            return
        L2e:
            int r0 = r4.f17872d
            if (r0 < 0) goto L3d
            int r3 = r4.f17871c
            if (r0 < r3) goto L3c
            if (r0 != r3) goto L3d
            int r0 = r4.f17873e
            if (r0 != 0) goto L3d
        L3c:
            r1 = 1
        L3d:
            p371v5.C6549a.m13291e(r1)
            return
    }

    /* renamed from: b */
    public int m9757b() {
            r2 = this;
            int r0 = r2.f17873e
            int r1 = r2.f17871c
            int r0 = r0 - r1
            int r0 = r0 * 8
            int r1 = r2.f17872d
            int r0 = r0 - r1
            return r0
    }

    /* renamed from: c */
    public void m9758c() {
            r1 = this;
            int r0 = r1.f17872d
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1.f17872d = r0
            int r0 = r1.f17871c
            int r0 = r0 + 1
            r1.f17871c = r0
            r1.m9756a()
            return
    }

    /* renamed from: d */
    public boolean m9759d(int r5) {
            r4 = this;
            int r0 = r4.f17872d
            int r1 = r5 / 8
            int r2 = r0 + r1
            int r3 = r4.f17873e
            int r3 = r3 + r5
            int r1 = r1 * 8
            int r3 = r3 - r1
            r5 = 7
            if (r3 <= r5) goto L13
            int r2 = r2 + 1
            int r3 = r3 + (-8)
        L13:
            r5 = 1
        L14:
            int r0 = r0 + r5
            if (r0 > r2) goto L26
            int r1 = r4.f17871c
            if (r2 >= r1) goto L26
            boolean r1 = r4.m9773r(r0)
            if (r1 == 0) goto L14
            int r2 = r2 + 1
            int r0 = r0 + 2
            goto L14
        L26:
            int r0 = r4.f17871c
            if (r2 < r0) goto L30
            if (r2 != r0) goto L2f
            if (r3 != 0) goto L2f
            goto L30
        L2f:
            r5 = 0
        L30:
            return r5
    }

    /* renamed from: e */
    public boolean m9760e() {
            r7 = this;
            int r0 = r7.f17872d
            int r1 = r7.f17873e
            r2 = 0
            r3 = 0
        L6:
            int r4 = r7.f17872d
            int r5 = r7.f17871c
            if (r4 >= r5) goto L15
            boolean r4 = r7.m9765j()
            if (r4 != 0) goto L15
            int r3 = r3 + 1
            goto L6
        L15:
            int r4 = r7.f17872d
            int r5 = r7.f17871c
            r6 = 1
            if (r4 != r5) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r7.f17872d = r0
            r7.f17873e = r1
            if (r4 != 0) goto L2f
            int r3 = r3 * 2
            int r3 = r3 + r6
            boolean r0 = r7.m9759d(r3)
            if (r0 == 0) goto L2f
            r2 = 1
        L2f:
            return r2
    }

    /* renamed from: f */
    public int m9761f() {
            r1 = this;
            int r0 = r1.f17872d
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            p371v5.C6549a.m13291e(r0)
            int r0 = r1.f17871c
            return r0
    }

    /* renamed from: g */
    public p304r4.C5786g m9762g() {
            r2 = this;
            java.lang.Object r0 = r2.f17870b
            r4.g[] r0 = (p304r4.C5786g[]) r0
            int r1 = r2.f17871c
            r0 = r0[r1]
            return r0
    }

    /* renamed from: h */
    public int m9763h() {
            r2 = this;
            int r0 = r2.f17869a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            int r0 = r2.f17872d
            int r0 = r0 * 8
            int r1 = r2.f17873e
        Lc:
            int r0 = r0 + r1
            return r0
        Le:
            int r0 = r2.f17871c
            int r0 = r0 * 8
            int r1 = r2.f17872d
            goto Lc
    }

    /* renamed from: i */
    public byte[][] m9764i(int r13, int r14) {
            r12 = this;
            int r0 = r12.f17872d
            int r0 = r0 * r14
            int r1 = r12.f17873e
            int r1 = r1 * r13
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 1
            r2[r3] = r1
            r1 = 0
            r2[r1] = r0
            java.lang.Class<byte> r0 = byte.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            byte[][] r0 = (byte[][]) r0
            int r2 = r12.f17872d
            int r2 = r2 * r14
            r4 = 0
        L1e:
            if (r4 >= r2) goto L49
            int r5 = r2 - r4
            int r5 = r5 - r3
            java.lang.Object r6 = r12.f17870b
            r4.g[] r6 = (p304r4.C5786g[]) r6
            int r7 = r4 / r14
            r6 = r6[r7]
            java.lang.Object r7 = r6.f22416a
            byte[] r7 = (byte[]) r7
            int r7 = r7.length
            int r7 = r7 * r13
            byte[] r8 = new byte[r7]
            r9 = 0
        L35:
            if (r9 >= r7) goto L44
            java.lang.Object r10 = r6.f22416a
            byte[] r10 = (byte[]) r10
            int r11 = r9 / r13
            r10 = r10[r11]
            r8[r9] = r10
            int r9 = r9 + 1
            goto L35
        L44:
            r0[r5] = r8
            int r4 = r4 + 1
            goto L1e
        L49:
            return r0
    }

    /* renamed from: j */
    public boolean m9765j() {
            r5 = this;
            int r0 = r5.f17869a
            r1 = 1
            r2 = 128(0x80, float:1.8E-43)
            r3 = 0
            switch(r0) {
                case 0: goto L1e;
                case 1: goto La;
                default: goto L9;
            }
        L9:
            goto L33
        La:
            java.lang.Object r0 = r5.f17870b
            byte[] r0 = (byte[]) r0
            int r4 = r5.f17871c
            r0 = r0[r4]
            int r4 = r5.f17872d
            int r2 = r2 >> r4
            r0 = r0 & r2
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            r5.m9774s()
            return r1
        L1e:
            java.lang.Object r0 = r5.f17870b
            byte[] r0 = (byte[]) r0
            int r2 = r5.f17872d
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r5.f17873e
            int r0 = r0 >> r2
            r0 = r0 & r1
            if (r0 != r1) goto L2f
            r3 = 1
        L2f:
            r5.m9775t(r1)
            return r3
        L33:
            java.lang.Object r0 = r5.f17870b
            byte[] r0 = (byte[]) r0
            int r4 = r5.f17872d
            r0 = r0[r4]
            int r4 = r5.f17873e
            int r2 = r2 >> r4
            r0 = r0 & r2
            if (r0 == 0) goto L42
            goto L43
        L42:
            r1 = 0
        L43:
            r5.m9774s()
            return r1
    }

    /* renamed from: k */
    public int m9766k(int r11) {
            r10 = this;
            int r0 = r10.f17869a
            r1 = 0
            r2 = 8
            r3 = 1
            r4 = -1
            r5 = 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L4e;
                case 1: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L82
        Le:
            if (r11 != 0) goto L11
            goto L4d
        L11:
            int r0 = r10.f17872d
            int r0 = r0 + r11
            r10.f17872d = r0
            r0 = 0
        L17:
            int r6 = r10.f17872d
            if (r6 <= r2) goto L30
            int r6 = r6 + (-8)
            r10.f17872d = r6
            java.lang.Object r7 = r10.f17870b
            byte[] r7 = (byte[]) r7
            int r8 = r10.f17871c
            int r9 = r8 + 1
            r10.f17871c = r9
            r7 = r7[r8]
            r7 = r7 & r5
            int r6 = r7 << r6
            r0 = r0 | r6
            goto L17
        L30:
            java.lang.Object r7 = r10.f17870b
            byte[] r7 = (byte[]) r7
            int r8 = r10.f17871c
            r7 = r7[r8]
            r5 = r5 & r7
            int r7 = 8 - r6
            int r5 = r5 >> r7
            r0 = r0 | r5
            int r11 = 32 - r11
            int r11 = r4 >>> r11
            r11 = r11 & r0
            if (r6 != r2) goto L49
            r10.f17872d = r1
            int r8 = r8 + r3
            r10.f17871c = r8
        L49:
            r10.m9756a()
            r1 = r11
        L4d:
            return r1
        L4e:
            int r0 = r10.f17872d
            int r1 = r10.f17873e
            int r2 = r2 - r1
            int r1 = java.lang.Math.min(r11, r2)
            java.lang.Object r2 = r10.f17870b
            byte[] r2 = (byte[]) r2
            int r3 = r0 + 1
            r0 = r2[r0]
            r0 = r0 & r5
            int r2 = r10.f17873e
            int r0 = r0 >> r2
            int r2 = 8 - r1
            int r2 = r5 >> r2
            r0 = r0 & r2
        L68:
            if (r1 >= r11) goto L79
            java.lang.Object r2 = r10.f17870b
            byte[] r2 = (byte[]) r2
            int r6 = r3 + 1
            r2 = r2[r3]
            r2 = r2 & r5
            int r2 = r2 << r1
            r0 = r0 | r2
            int r1 = r1 + 8
            r3 = r6
            goto L68
        L79:
            int r1 = 32 - r11
            int r1 = r4 >>> r1
            r0 = r0 & r1
            r10.m9775t(r11)
            return r0
        L82:
            int r0 = r10.f17873e
            int r0 = r0 + r11
            r10.f17873e = r0
            r0 = 0
        L88:
            int r6 = r10.f17873e
            r7 = 2
            if (r6 <= r2) goto Lab
            int r6 = r6 + (-8)
            r10.f17873e = r6
            java.lang.Object r8 = r10.f17870b
            byte[] r8 = (byte[]) r8
            int r9 = r10.f17872d
            r8 = r8[r9]
            r8 = r8 & r5
            int r6 = r8 << r6
            r0 = r0 | r6
            int r6 = r9 + 1
            boolean r6 = r10.m9773r(r6)
            if (r6 == 0) goto La6
            goto La7
        La6:
            r7 = 1
        La7:
            int r9 = r9 + r7
            r10.f17872d = r9
            goto L88
        Lab:
            java.lang.Object r8 = r10.f17870b
            byte[] r8 = (byte[]) r8
            int r9 = r10.f17872d
            r8 = r8[r9]
            r5 = r5 & r8
            int r8 = 8 - r6
            int r5 = r5 >> r8
            r0 = r0 | r5
            int r11 = 32 - r11
            int r11 = r4 >>> r11
            r11 = r11 & r0
            if (r6 != r2) goto Lcd
            r10.f17873e = r1
            int r0 = r9 + 1
            boolean r0 = r10.m9773r(r0)
            if (r0 == 0) goto Lca
            r3 = 2
        Lca:
            int r9 = r9 + r3
            r10.f17872d = r9
        Lcd:
            r10.m9756a()
            return r11
    }

    /* renamed from: l */
    public void m9767l(byte[] r8, int r9, int r10) {
            r7 = this;
            int r0 = r10 >> 3
            int r0 = r0 + r9
        L3:
            r1 = 255(0xff, float:3.57E-43)
            r2 = 8
            if (r9 >= r0) goto L2c
            java.lang.Object r3 = r7.f17870b
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r5 = r7.f17871c
            int r6 = r5 + 1
            r7.f17871c = r6
            r4 = r4[r5]
            int r5 = r7.f17872d
            int r4 = r4 << r5
            byte r4 = (byte) r4
            r8[r9] = r4
            r4 = r8[r9]
            byte[] r3 = (byte[]) r3
            r3 = r3[r6]
            r1 = r1 & r3
            int r2 = r2 - r5
            int r1 = r1 >> r2
            r1 = r1 | r4
            byte r1 = (byte) r1
            r8[r9] = r1
            int r9 = r9 + 1
            goto L3
        L2c:
            r9 = r10 & 7
            if (r9 != 0) goto L31
            return
        L31:
            r10 = r8[r0]
            int r3 = r1 >> r9
            r10 = r10 & r3
            byte r10 = (byte) r10
            r8[r0] = r10
            int r10 = r7.f17872d
            int r3 = r10 + r9
            if (r3 <= r2) goto L56
            r3 = r8[r0]
            java.lang.Object r4 = r7.f17870b
            byte[] r4 = (byte[]) r4
            int r5 = r7.f17871c
            int r6 = r5 + 1
            r7.f17871c = r6
            r4 = r4[r5]
            r4 = r4 & r1
            int r4 = r4 << r10
            r3 = r3 | r4
            byte r3 = (byte) r3
            r8[r0] = r3
            int r10 = r10 - r2
            r7.f17872d = r10
        L56:
            int r10 = r7.f17872d
            int r10 = r10 + r9
            r7.f17872d = r10
            java.lang.Object r3 = r7.f17870b
            byte[] r3 = (byte[]) r3
            int r4 = r7.f17871c
            r3 = r3[r4]
            r1 = r1 & r3
            int r3 = 8 - r10
            int r1 = r1 >> r3
            r3 = r8[r0]
            int r9 = 8 - r9
            int r9 = r1 << r9
            byte r9 = (byte) r9
            r9 = r9 | r3
            byte r9 = (byte) r9
            r8[r0] = r9
            if (r10 != r2) goto L7b
            r8 = 0
            r7.f17872d = r8
            int r4 = r4 + 1
            r7.f17871c = r4
        L7b:
            r7.m9756a()
            return
    }

    /* renamed from: m */
    public void m9768m(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.f17872d
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            p371v5.C6549a.m13291e(r0)
            java.lang.Object r0 = r2.f17870b
            byte[] r0 = (byte[]) r0
            int r1 = r2.f17871c
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.f17871c
            int r3 = r3 + r5
            r2.f17871c = r3
            r2.m9756a()
            return
    }

    /* renamed from: n */
    public int m9769n() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            boolean r2 = r4.m9765j()
            if (r2 != 0) goto Lb
            int r1 = r1 + 1
            goto L2
        Lb:
            r2 = 1
            int r3 = r2 << r1
            int r3 = r3 - r2
            if (r1 <= 0) goto L15
            int r0 = r4.m9766k(r1)
        L15:
            int r3 = r3 + r0
            return r3
    }

    /* renamed from: o */
    public int m9770o() {
            r3 = this;
            int r0 = r3.m9769n()
            int r1 = r0 % 2
            r2 = 1
            if (r1 != 0) goto Lb
            r1 = -1
            goto Lc
        Lb:
            r1 = 1
        Lc:
            int r0 = r0 + r2
            int r0 = r0 / 2
            int r0 = r0 * r1
            return r0
    }

    /* renamed from: p */
    public void m9771p(byte[] r1, int r2) {
            r0 = this;
            r0.f17870b = r1
            r1 = 0
            r0.f17871c = r1
            r0.f17872d = r1
            r0.f17873e = r2
            return
    }

    /* renamed from: q */
    public void m9772q(int r2) {
            r1 = this;
            int r0 = r2 / 8
            r1.f17871c = r0
            int r0 = r0 * 8
            int r2 = r2 - r0
            r1.f17872d = r2
            r1.m9756a()
            return
    }

    /* renamed from: r */
    public boolean m9773r(int r5) {
            r4 = this;
            r0 = 1
            r1 = 2
            if (r1 > r5) goto L23
            int r1 = r4.f17871c
            if (r5 >= r1) goto L23
            java.lang.Object r1 = r4.f17870b
            r2 = r1
            byte[] r2 = (byte[]) r2
            r2 = r2[r5]
            r3 = 3
            if (r2 != r3) goto L23
            r2 = r1
            byte[] r2 = (byte[]) r2
            int r3 = r5 + (-2)
            r2 = r2[r3]
            if (r2 != 0) goto L23
            byte[] r1 = (byte[]) r1
            int r5 = r5 - r0
            r5 = r1[r5]
            if (r5 != 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    /* renamed from: s */
    public void m9774s() {
            r4 = this;
            int r0 = r4.f17869a
            r1 = 1
            r2 = 0
            r3 = 8
            switch(r0) {
                case 1: goto La;
                default: goto L9;
            }
        L9:
            goto L1c
        La:
            int r0 = r4.f17872d
            int r0 = r0 + r1
            r4.f17872d = r0
            if (r0 != r3) goto L18
            r4.f17872d = r2
            int r0 = r4.f17871c
            int r0 = r0 + r1
            r4.f17871c = r0
        L18:
            r4.m9756a()
            return
        L1c:
            int r0 = r4.f17873e
            int r0 = r0 + r1
            r4.f17873e = r0
            if (r0 != r3) goto L33
            r4.f17873e = r2
            int r0 = r4.f17872d
            int r2 = r0 + 1
            boolean r2 = r4.m9773r(r2)
            if (r2 == 0) goto L30
            r1 = 2
        L30:
            int r0 = r0 + r1
            r4.f17872d = r0
        L33:
            r4.m9756a()
            return
    }

    /* renamed from: t */
    public void m9775t(int r7) {
            r6 = this;
            int r0 = r6.f17869a
            r1 = 7
            r2 = 1
            switch(r0) {
                case 0: goto L25;
                case 1: goto L9;
                default: goto L7;
            }
        L7:
            goto L7e
        L9:
            int r0 = r7 / 8
            int r3 = r6.f17871c
            int r3 = r3 + r0
            r6.f17871c = r3
            int r4 = r6.f17872d
            int r0 = r0 * 8
            int r7 = r7 - r0
            int r7 = r7 + r4
            r6.f17872d = r7
            if (r7 <= r1) goto L21
            int r3 = r3 + r2
            r6.f17871c = r3
            int r7 = r7 + (-8)
            r6.f17872d = r7
        L21:
            r6.m9756a()
            return
        L25:
            int r3 = r7 / 8
            int r4 = r6.f17872d
            int r4 = r4 + r3
            r6.f17872d = r4
            int r5 = r6.f17873e
            int r3 = r3 * 8
            int r7 = r7 - r3
            int r7 = r7 + r5
            r6.f17873e = r7
            if (r7 <= r1) goto L3d
            int r4 = r4 + r2
            r6.f17872d = r4
            int r7 = r7 + (-8)
            r6.f17873e = r7
        L3d:
            r7 = 0
            switch(r0) {
                case 0: goto L56;
                case 1: goto L42;
                default: goto L41;
            }
        L41:
            goto L6a
        L42:
            int r0 = r6.f17871c
            if (r0 < 0) goto L51
            int r1 = r6.f17873e
            if (r0 < r1) goto L52
            if (r0 != r1) goto L51
            int r0 = r6.f17872d
            if (r0 != 0) goto L51
            goto L52
        L51:
            r2 = 0
        L52:
            p371v5.C6549a.m13291e(r2)
            goto L7d
        L56:
            int r0 = r6.f17872d
            if (r0 < 0) goto L65
            int r1 = r6.f17871c
            if (r0 < r1) goto L66
            if (r0 != r1) goto L65
            int r0 = r6.f17873e
            if (r0 != 0) goto L65
            goto L66
        L65:
            r2 = 0
        L66:
            p371v5.C6549a.m13291e(r2)
            goto L7d
        L6a:
            int r0 = r6.f17872d
            if (r0 < 0) goto L79
            int r1 = r6.f17871c
            if (r0 < r1) goto L7a
            if (r0 != r1) goto L79
            int r0 = r6.f17873e
            if (r0 != 0) goto L79
            goto L7a
        L79:
            r2 = 0
        L7a:
            p371v5.C6549a.m13291e(r2)
        L7d:
            return
        L7e:
            int r0 = r6.f17872d
            int r3 = r7 / 8
            int r4 = r0 + r3
            r6.f17872d = r4
            int r5 = r6.f17873e
            int r3 = r3 * 8
            int r7 = r7 - r3
            int r7 = r7 + r5
            r6.f17873e = r7
            if (r7 <= r1) goto L97
            int r4 = r4 + r2
            r6.f17872d = r4
            int r7 = r7 + (-8)
            r6.f17873e = r7
        L97:
            int r0 = r0 + r2
            int r7 = r6.f17872d
            if (r0 > r7) goto Laa
            boolean r7 = r6.m9773r(r0)
            if (r7 == 0) goto L97
            int r7 = r6.f17872d
            int r7 = r7 + r2
            r6.f17872d = r7
            int r0 = r0 + 2
            goto L97
        Laa:
            r6.m9756a()
            return
    }

    /* renamed from: u */
    public void m9776u(int r2) {
            r1 = this;
            int r0 = r1.f17872d
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            p371v5.C6549a.m13291e(r0)
            int r0 = r1.f17871c
            int r0 = r0 + r2
            r1.f17871c = r0
            r1.m9756a()
            return
    }
}
