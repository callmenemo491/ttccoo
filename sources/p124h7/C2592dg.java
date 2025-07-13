package p124h7;

/* renamed from: h7.dg */
/* loaded from: classes.dex */
public final class C2592dg {

    /* renamed from: a */
    public int f11468a;

    /* renamed from: b */
    public p124h7.C2610eg f11469b;

    /* renamed from: c */
    public final byte[] f11470c;

    /* renamed from: d */
    public int f11471d;

    /* renamed from: e */
    public int f11472e;

    /* renamed from: f */
    public int f11473f;

    /* renamed from: g */
    public int f11474g;

    /* renamed from: h */
    public int f11475h;

    public /* synthetic */ C2592dg(byte[] r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.f11475h = r0
            r1.f11470c = r2
            r1.f11471d = r3
            r2 = 0
            r1.f11473f = r2
            return
    }

    /* renamed from: n */
    public static int m6618n(int r1) {
            int r0 = r1 >>> 1
            r1 = r1 & 1
            int r1 = -r1
            r1 = r1 ^ r0
            return r1
    }

    /* renamed from: o */
    public static long m6619o(long r4) {
            r0 = 1
            long r0 = r4 >>> r0
            r2 = 1
            long r4 = r4 & r2
            long r4 = -r4
            long r4 = r4 ^ r0
            return r4
    }

    /* renamed from: a */
    public final byte m6620a() {
            r3 = this;
            int r0 = r3.f11473f
            int r1 = r3.f11471d
            if (r0 == r1) goto Lf
            byte[] r1 = r3.f11470c
            int r2 = r0 + 1
            r3.f11473f = r2
            r0 = r1[r0]
            return r0
        Lf:
            h7.f r0 = p124h7.C2611f.m6687g()
            throw r0
    }

    /* renamed from: b */
    public final int m6621b(int r2) {
            r1 = this;
            if (r2 < 0) goto L1b
            int r0 = r1.f11473f
            int r2 = r2 + r0
            if (r2 < 0) goto L16
            int r0 = r1.f11475h
            if (r2 > r0) goto L11
            r1.f11475h = r2
            r1.m6633p()
            return r0
        L11:
            h7.f r2 = p124h7.C2611f.m6687g()
            throw r2
        L16:
            h7.f r2 = p124h7.C2611f.m6686f()
            throw r2
        L1b:
            h7.f r2 = p124h7.C2611f.m6685e()
            throw r2
    }

    /* renamed from: c */
    public final int m6622c() {
            r4 = this;
            int r0 = r4.f11473f
            int r1 = r4.f11471d
            int r1 = r1 - r0
            r2 = 4
            if (r1 < r2) goto L2e
            byte[] r1 = r4.f11470c
            int r2 = r0 + 4
            r4.f11473f = r2
            r2 = r1[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 + 1
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = r0 + 2
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 | r3
            int r0 = r0 + 3
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | r2
            return r0
        L2e:
            h7.f r0 = p124h7.C2611f.m6687g()
            throw r0
    }

    /* renamed from: d */
    public final int m6623d() {
            r5 = this;
            int r0 = r5.f11473f
            int r1 = r5.f11471d
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f11470c
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f11473f = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.f11473f = r1
            return r0
        L6c:
            long r0 = r5.m6627h()
            int r1 = (int) r0
            return r1
    }

    /* renamed from: e */
    public final int m6624e() {
            r2 = this;
            boolean r0 = r2.m6630k()
            if (r0 == 0) goto La
            r0 = 0
            r2.f11474g = r0
            return r0
        La:
            int r0 = r2.m6623d()
            r2.f11474g = r0
            int r1 = r0 >>> 3
            if (r1 == 0) goto L15
            return r0
        L15:
            h7.f r0 = p124h7.C2611f.m6682b()
            throw r0
    }

    /* renamed from: f */
    public final long m6625f() {
            r9 = this;
            int r0 = r9.f11473f
            int r1 = r9.f11471d
            int r1 = r1 - r0
            r2 = 8
            if (r1 < r2) goto L5b
            byte[] r1 = r9.f11470c
            int r3 = r0 + 8
            r9.f11473f = r3
            r3 = r1[r0]
            long r3 = (long) r3
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r7 = r0 + 1
            r7 = r1[r7]
            long r7 = (long) r7
            long r7 = r7 & r5
            long r7 = r7 << r2
            long r2 = r3 | r7
            int r4 = r0 + 2
            r4 = r1[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 16
            long r7 = r7 << r4
            long r2 = r2 | r7
            int r4 = r0 + 3
            r4 = r1[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 24
            long r7 = r7 << r4
            long r2 = r2 | r7
            int r4 = r0 + 4
            r4 = r1[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 32
            long r7 = r7 << r4
            long r2 = r2 | r7
            int r4 = r0 + 5
            r4 = r1[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 40
            long r7 = r7 << r4
            long r2 = r2 | r7
            int r4 = r0 + 6
            r4 = r1[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 48
            long r7 = r7 << r4
            long r2 = r2 | r7
            int r0 = r0 + 7
            r0 = r1[r0]
            long r0 = (long) r0
            long r0 = r0 & r5
            r4 = 56
            long r0 = r0 << r4
            long r0 = r0 | r2
            return r0
        L5b:
            h7.f r0 = p124h7.C2611f.m6687g()
            throw r0
    }

    /* renamed from: g */
    public final long m6626g() {
            r11 = this;
            int r0 = r11.f11473f
            int r1 = r11.f11471d
            if (r1 != r0) goto L8
            goto Lb7
        L8:
            byte[] r2 = r11.f11470c
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L14
            r11.f11473f = r3
            long r0 = (long) r0
            return r0
        L14:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto Lb7
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L27
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
        L24:
            long r2 = (long) r0
            goto Lb4
        L27:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L38
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
        L33:
            r9 = r0
            r1 = r3
            r2 = r9
            goto Lb4
        L38:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L46
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L24
        L46:
            int r3 = r1 + 1
            long r4 = (long) r0
            r0 = r2[r1]
            long r0 = (long) r0
            r6 = 28
            long r0 = r0 << r6
            long r0 = r0 ^ r4
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L5b
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
        L59:
            long r0 = r0 ^ r4
            goto L33
        L5b:
            int r6 = r3 + 1
            r3 = r2[r3]
            long r7 = (long) r3
            r3 = 35
            long r7 = r7 << r3
            long r0 = r0 ^ r7
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L70
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L6d:
            long r2 = r2 ^ r0
        L6e:
            r1 = r6
            goto Lb4
        L70:
            int r3 = r6 + 1
            r6 = r2[r6]
            long r6 = (long) r6
            r8 = 42
            long r6 = r6 << r8
            long r0 = r0 ^ r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L83
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L59
        L83:
            int r6 = r3 + 1
            r3 = r2[r3]
            long r7 = (long) r3
            r3 = 49
            long r7 = r7 << r3
            long r0 = r0 ^ r7
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L96
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L6d
        L96:
            int r3 = r6 + 1
            r6 = r2[r6]
            long r6 = (long) r6
            r8 = 56
            long r6 = r6 << r8
            long r0 = r0 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r0 = r0 ^ r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L33
            int r6 = r3 + 1
            r2 = r2[r3]
            long r2 = (long) r2
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto Lb7
            r2 = r0
            goto L6e
        Lb4:
            r11.f11473f = r1
            return r2
        Lb7:
            long r0 = r11.m6627h()
            return r0
    }

    /* renamed from: h */
    public final long m6627h() {
            r6 = this;
            r0 = 0
            r2 = 0
        L3:
            r3 = 64
            if (r2 >= r3) goto L18
            byte r3 = r6.m6620a()
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r2
            long r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L15
            return r0
        L15:
            int r2 = r2 + 7
            goto L3
        L18:
            h7.f r0 = p124h7.C2611f.m6684d()
            throw r0
    }

    /* renamed from: i */
    public final void m6628i(int r2) {
            r1 = this;
            int r0 = r1.f11474g
            if (r0 != r2) goto L5
            return
        L5:
            h7.f r2 = p124h7.C2611f.m6681a()
            throw r2
    }

    /* renamed from: j */
    public final void m6629j(int r3) {
            r2 = this;
            if (r3 < 0) goto Le
            int r0 = r2.f11471d
            int r1 = r2.f11473f
            int r0 = r0 - r1
            if (r3 <= r0) goto La
            goto Le
        La:
            int r1 = r1 + r3
            r2.f11473f = r1
            return
        Le:
            if (r3 >= 0) goto L15
            h7.f r3 = p124h7.C2611f.m6685e()
            throw r3
        L15:
            h7.f r3 = p124h7.C2611f.m6687g()
            throw r3
    }

    /* renamed from: k */
    public final boolean m6630k() {
            r2 = this;
            int r0 = r2.f11473f
            int r1 = r2.f11471d
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* renamed from: l */
    public final boolean m6631l() {
            r5 = this;
            long r0 = r5.m6626g()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* renamed from: m */
    public final boolean m6632m(int r6) {
            r5 = this;
            r0 = r6 & 7
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L42
            if (r0 == r2) goto L3c
            r3 = 2
            if (r0 == r3) goto L34
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L21
            if (r0 == r3) goto L20
            r6 = 5
            if (r0 != r6) goto L18
            r5.m6629j(r3)
            return r2
        L18:
            int r6 = p124h7.C2611f.f11503Y
            h7.e r6 = new h7.e
            r6.<init>()
            throw r6
        L20:
            return r1
        L21:
            int r0 = r5.m6624e()
            if (r0 == 0) goto L2d
            boolean r0 = r5.m6632m(r0)
            if (r0 != 0) goto L21
        L2d:
            int r6 = r6 >>> r4
            int r6 = r6 << r4
            r6 = r6 | r3
            r5.m6628i(r6)
            return r2
        L34:
            int r6 = r5.m6623d()
            r5.m6629j(r6)
            return r2
        L3c:
            r6 = 8
            r5.m6629j(r6)
            return r2
        L42:
            int r6 = r5.f11471d
            int r0 = r5.f11473f
            int r6 = r6 - r0
            r0 = 10
            if (r6 < r0) goto L62
        L4b:
            if (r1 >= r0) goto L5d
            byte[] r6 = r5.f11470c
            int r3 = r5.f11473f
            int r4 = r3 + 1
            r5.f11473f = r4
            r6 = r6[r3]
            if (r6 < 0) goto L5a
            goto L6d
        L5a:
            int r1 = r1 + 1
            goto L4b
        L5d:
            h7.f r6 = p124h7.C2611f.m6684d()
            throw r6
        L62:
            if (r1 >= r0) goto L6e
            byte r6 = r5.m6620a()
            if (r6 >= 0) goto L6d
            int r1 = r1 + 1
            goto L62
        L6d:
            return r2
        L6e:
            h7.f r6 = p124h7.C2611f.m6684d()
            throw r6
    }

    /* renamed from: p */
    public final void m6633p() {
            r2 = this;
            int r0 = r2.f11471d
            int r1 = r2.f11472e
            int r0 = r0 + r1
            r2.f11471d = r0
            int r1 = r2.f11475h
            if (r0 <= r1) goto L13
            int r1 = r0 - r1
            r2.f11472e = r1
            int r0 = r0 - r1
            r2.f11471d = r0
            return
        L13:
            r0 = 0
            r2.f11472e = r0
            return
    }
}
