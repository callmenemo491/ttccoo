package p121h4;

/* renamed from: h4.c0 */
/* loaded from: classes.dex */
public final class C2460c0 {

    /* renamed from: a */
    public final int f10981a;

    /* renamed from: b */
    public final int f10982b;

    /* renamed from: c */
    public final float f10983c;

    /* renamed from: d */
    public final float f10984d;

    /* renamed from: e */
    public final float f10985e;

    /* renamed from: f */
    public final int f10986f;

    /* renamed from: g */
    public final int f10987g;

    /* renamed from: h */
    public final int f10988h;

    /* renamed from: i */
    public final short[] f10989i;

    /* renamed from: j */
    public short[] f10990j;

    /* renamed from: k */
    public int f10991k;

    /* renamed from: l */
    public short[] f10992l;

    /* renamed from: m */
    public int f10993m;

    /* renamed from: n */
    public short[] f10994n;

    /* renamed from: o */
    public int f10995o;

    /* renamed from: p */
    public int f10996p;

    /* renamed from: q */
    public int f10997q;

    /* renamed from: r */
    public int f10998r;

    /* renamed from: s */
    public int f10999s;

    /* renamed from: t */
    public int f11000t;

    /* renamed from: u */
    public int f11001u;

    /* renamed from: v */
    public int f11002v;

    public C2460c0(int r1, int r2, float r3, float r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f10981a = r1
            r0.f10982b = r2
            r0.f10983c = r3
            r0.f10984d = r4
            float r3 = (float) r1
            float r4 = (float) r5
            float r3 = r3 / r4
            r0.f10985e = r3
            int r3 = r1 / 400
            r0.f10986f = r3
            int r1 = r1 / 65
            r0.f10987g = r1
            int r1 = r1 * 2
            r0.f10988h = r1
            short[] r3 = new short[r1]
            r0.f10989i = r3
            int r3 = r1 * r2
            short[] r3 = new short[r3]
            r0.f10990j = r3
            int r3 = r1 * r2
            short[] r3 = new short[r3]
            r0.f10992l = r3
            int r1 = r1 * r2
            short[] r1 = new short[r1]
            r0.f10994n = r1
            return
    }

    /* renamed from: e */
    public static void m6249e(int r8, int r9, short[] r10, int r11, short[] r12, int r13, short[] r14, int r15) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r9) goto L28
            int r2 = r11 * r9
            int r2 = r2 + r1
            int r3 = r15 * r9
            int r3 = r3 + r1
            int r4 = r13 * r9
            int r4 = r4 + r1
            r5 = 0
        Le:
            if (r5 >= r8) goto L25
            short r6 = r12[r4]
            int r7 = r8 - r5
            int r7 = r7 * r6
            short r6 = r14[r3]
            int r6 = r6 * r5
            int r6 = r6 + r7
            int r6 = r6 / r8
            short r6 = (short) r6
            r10[r2] = r6
            int r2 = r2 + r9
            int r4 = r4 + r9
            int r3 = r3 + r9
            int r5 = r5 + 1
            goto Le
        L25:
            int r1 = r1 + 1
            goto L2
        L28:
            return
    }

    /* renamed from: a */
    public final void m6250a(short[] r4, int r5, int r6) {
            r3 = this;
            short[] r0 = r3.f10992l
            int r1 = r3.f10993m
            short[] r0 = r3.m6252c(r0, r1, r6)
            r3.f10992l = r0
            int r1 = r3.f10982b
            int r5 = r5 * r1
            int r2 = r3.f10993m
            int r2 = r2 * r1
            int r1 = r1 * r6
            java.lang.System.arraycopy(r4, r5, r0, r2, r1)
            int r4 = r3.f10993m
            int r4 = r4 + r6
            r3.f10993m = r4
            return
    }

    /* renamed from: b */
    public final void m6251b(short[] r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.f10988h
            int r0 = r0 / r9
            int r1 = r6.f10982b
            int r9 = r9 * r1
            int r8 = r8 * r1
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L24
            r3 = 0
            r4 = 0
        Lf:
            if (r3 >= r9) goto L1b
            int r5 = r2 * r9
            int r5 = r5 + r8
            int r5 = r5 + r3
            short r5 = r7[r5]
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto Lf
        L1b:
            int r4 = r4 / r9
            short[] r3 = r6.f10989i
            short r4 = (short) r4
            r3[r2] = r4
            int r2 = r2 + 1
            goto Lb
        L24:
            return
    }

    /* renamed from: c */
    public final short[] m6252c(short[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r3.length
            int r1 = r2.f10982b
            int r0 = r0 / r1
            int r4 = r4 + r5
            if (r4 > r0) goto L8
            return r3
        L8:
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + r5
            int r0 = r0 * r1
            short[] r3 = java.util.Arrays.copyOf(r3, r0)
            return r3
    }

    /* renamed from: d */
    public final int m6253d(short[] r10, int r11, int r12, int r13) {
            r9 = this;
            int r0 = r9.f10982b
            int r11 = r11 * r0
            r0 = 1
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
        La:
            if (r12 > r13) goto L35
            r5 = 0
            r6 = 0
        Le:
            if (r5 >= r12) goto L22
            int r7 = r11 + r5
            short r7 = r10[r7]
            int r8 = r11 + r12
            int r8 = r8 + r5
            short r8 = r10[r8]
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto Le
        L22:
            int r5 = r6 * r3
            int r7 = r0 * r12
            if (r5 >= r7) goto L2a
            r3 = r12
            r0 = r6
        L2a:
            int r5 = r6 * r2
            int r7 = r4 * r12
            if (r5 <= r7) goto L32
            r2 = r12
            r4 = r6
        L32:
            int r12 = r12 + 1
            goto La
        L35:
            int r0 = r0 / r3
            r9.f11001u = r0
            int r4 = r4 / r2
            r9.f11002v = r4
            return r3
    }

    /* renamed from: f */
    public final void m6254f() {
            r20 = this;
            r0 = r20
            int r1 = r0.f10993m
            float r2 = r0.f10983c
            float r3 = r0.f10984d
            float r2 = r2 / r3
            float r4 = r0.f10985e
            float r4 = r4 * r3
            double r5 = (double) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r7 = 1
            r8 = 0
            r9 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 > 0) goto L30
            r9 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 >= 0) goto L25
            goto L30
        L25:
            short[] r2 = r0.f10990j
            int r5 = r0.f10991k
            r0.m6250a(r2, r8, r5)
            r0.f10991k = r8
            goto L186
        L30:
            int r9 = r0.f10991k
            int r10 = r0.f10988h
            if (r9 >= r10) goto L38
            goto L184
        L38:
            r10 = 0
        L39:
            int r11 = r0.f10998r
            if (r11 <= 0) goto L50
            int r12 = r0.f10988h
            int r11 = java.lang.Math.min(r12, r11)
            short[] r12 = r0.f10990j
            r0.m6250a(r12, r10, r11)
            int r12 = r0.f10998r
            int r12 = r12 - r11
            r0.f10998r = r12
            int r10 = r10 + r11
            goto L16f
        L50:
            short[] r11 = r0.f10990j
            int r12 = r0.f10981a
            r13 = 4000(0xfa0, float:5.605E-42)
            if (r12 <= r13) goto L5b
            int r12 = r12 / 4000
            goto L5c
        L5b:
            r12 = 1
        L5c:
            int r13 = r0.f10982b
            if (r13 != r7) goto L6b
            if (r12 != r7) goto L6b
            int r12 = r0.f10986f
            int r13 = r0.f10987g
            int r11 = r0.m6253d(r11, r10, r12, r13)
            goto La1
        L6b:
            r0.m6251b(r11, r10, r12)
            short[] r13 = r0.f10989i
            int r14 = r0.f10986f
            int r14 = r14 / r12
            int r15 = r0.f10987g
            int r15 = r15 / r12
            int r13 = r0.m6253d(r13, r8, r14, r15)
            if (r12 == r7) goto La0
            int r13 = r13 * r12
            int r12 = r12 * 4
            int r14 = r13 - r12
            int r13 = r13 + r12
            int r12 = r0.f10986f
            if (r14 >= r12) goto L88
            r14 = r12
        L88:
            int r12 = r0.f10987g
            if (r13 <= r12) goto L8d
            r13 = r12
        L8d:
            int r12 = r0.f10982b
            if (r12 != r7) goto L96
            int r11 = r0.m6253d(r11, r10, r14, r13)
            goto La1
        L96:
            r0.m6251b(r11, r10, r7)
            short[] r11 = r0.f10989i
            int r11 = r0.m6253d(r11, r8, r14, r13)
            goto La1
        La0:
            r11 = r13
        La1:
            int r12 = r0.f11001u
            int r13 = r0.f11002v
            if (r12 == 0) goto Lbc
            int r14 = r0.f10999s
            if (r14 != 0) goto Lac
            goto Lbc
        Lac:
            int r14 = r12 * 3
            if (r13 <= r14) goto Lb1
            goto Lbc
        Lb1:
            int r13 = r12 * 2
            int r14 = r0.f11000t
            int r14 = r14 * 3
            if (r13 > r14) goto Lba
            goto Lbc
        Lba:
            r13 = 1
            goto Lbd
        Lbc:
            r13 = 0
        Lbd:
            if (r13 == 0) goto Lc3
            int r13 = r0.f10999s
            r15 = r13
            goto Lc4
        Lc3:
            r15 = r11
        Lc4:
            r0.f11000t = r12
            r0.f10999s = r11
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r13 = 1073741824(0x40000000, float:2.0)
            int r14 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r14 <= 0) goto L119
            short[] r14 = r0.f10990j
            int r11 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r11 < 0) goto Ldd
            float r11 = (float) r15
            float r12 = r2 - r3
            float r11 = r11 / r12
            int r11 = (int) r11
            r13 = r11
            goto Le8
        Ldd:
            float r11 = (float) r15
            float r13 = r13 - r2
            float r13 = r13 * r11
            float r11 = r2 - r3
            float r13 = r13 / r11
            int r11 = (int) r13
            r0.f10998r = r11
            r13 = r15
        Le8:
            short[] r11 = r0.f10992l
            int r12 = r0.f10993m
            short[] r12 = r0.m6252c(r11, r12, r13)
            r0.f10992l = r12
            int r11 = r0.f10982b
            int r7 = r0.f10993m
            int r18 = r10 + r15
            r16 = r11
            r11 = r13
            r17 = r12
            r12 = r16
            r19 = r13
            r13 = r17
            r17 = r14
            r14 = r7
            r7 = r15
            r15 = r17
            r16 = r10
            m6249e(r11, r12, r13, r14, r15, r16, r17, r18)
            int r11 = r0.f10993m
            int r11 = r11 + r19
            r0.f10993m = r11
            int r15 = r7 + r19
            int r15 = r15 + r10
            r10 = r15
            goto L16f
        L119:
            r7 = r15
            short[] r15 = r0.f10990j
            r11 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 >= 0) goto L12c
            float r11 = (float) r7
            float r11 = r11 * r2
            float r12 = r3 - r2
            float r11 = r11 / r12
            int r11 = (int) r11
            r19 = r11
            goto L13a
        L12c:
            float r11 = (float) r7
            float r13 = r13 * r2
            float r13 = r13 - r3
            float r13 = r13 * r11
            float r11 = r3 - r2
            float r13 = r13 / r11
            int r11 = (int) r13
            r0.f10998r = r11
            r19 = r7
        L13a:
            short[] r11 = r0.f10992l
            int r12 = r0.f10993m
            int r14 = r7 + r19
            short[] r11 = r0.m6252c(r11, r12, r14)
            r0.f10992l = r11
            int r12 = r0.f10982b
            int r13 = r10 * r12
            int r3 = r0.f10993m
            int r3 = r3 * r12
            int r12 = r12 * r7
            java.lang.System.arraycopy(r15, r13, r11, r3, r12)
            int r12 = r0.f10982b
            short[] r13 = r0.f10992l
            int r3 = r0.f10993m
            int r3 = r3 + r7
            int r16 = r10 + r7
            r11 = r19
            r7 = r14
            r14 = r3
            r3 = r15
            r17 = r3
            r18 = r10
            m6249e(r11, r12, r13, r14, r15, r16, r17, r18)
            int r3 = r0.f10993m
            int r3 = r3 + r7
            r0.f10993m = r3
            int r10 = r10 + r19
        L16f:
            int r3 = r0.f10988h
            int r3 = r3 + r10
            if (r3 <= r9) goto L24d
            int r2 = r0.f10991k
            int r2 = r2 - r10
            short[] r3 = r0.f10990j
            int r5 = r0.f10982b
            int r10 = r10 * r5
            int r5 = r5 * r2
            java.lang.System.arraycopy(r3, r10, r3, r8, r5)
            r0.f10991k = r2
        L184:
            r3 = 1065353216(0x3f800000, float:1.0)
        L186:
            int r2 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r2 == 0) goto L24c
            int r2 = r0.f10993m
            if (r2 != r1) goto L190
            goto L24c
        L190:
            int r2 = r0.f10981a
            float r3 = (float) r2
            float r3 = r3 / r4
            int r3 = (int) r3
        L195:
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r4) goto L245
            if (r2 <= r4) goto L19d
            goto L245
        L19d:
            int r4 = r0.f10993m
            int r4 = r4 - r1
            short[] r5 = r0.f10994n
            int r6 = r0.f10995o
            short[] r5 = r0.m6252c(r5, r6, r4)
            r0.f10994n = r5
            short[] r6 = r0.f10992l
            int r7 = r0.f10982b
            int r9 = r1 * r7
            int r10 = r0.f10995o
            int r10 = r10 * r7
            int r7 = r7 * r4
            java.lang.System.arraycopy(r6, r9, r5, r10, r7)
            r0.f10993m = r1
            int r1 = r0.f10995o
            int r1 = r1 + r4
            r0.f10995o = r1
            r1 = 0
        L1c1:
            int r4 = r0.f10995o
            int r5 = r4 + (-1)
            if (r1 >= r5) goto L230
        L1c7:
            int r4 = r0.f10996p
            r5 = 1
            int r4 = r4 + r5
            int r6 = r4 * r3
            int r7 = r0.f10997q
            int r9 = r7 * r2
            if (r6 <= r9) goto L21c
            short[] r4 = r0.f10992l
            int r6 = r0.f10993m
            short[] r4 = r0.m6252c(r4, r6, r5)
            r0.f10992l = r4
            r4 = 0
        L1de:
            int r5 = r0.f10982b
            if (r4 >= r5) goto L210
            short[] r6 = r0.f10992l
            int r7 = r0.f10993m
            int r7 = r7 * r5
            int r7 = r7 + r4
            short[] r9 = r0.f10994n
            int r10 = r1 * r5
            int r10 = r10 + r4
            short r11 = r9[r10]
            int r10 = r10 + r5
            short r5 = r9[r10]
            int r9 = r0.f10997q
            int r9 = r9 * r2
            int r10 = r0.f10996p
            int r12 = r10 * r3
            r13 = 1
            int r10 = r10 + r13
            int r10 = r10 * r3
            int r9 = r10 - r9
            int r10 = r10 - r12
            int r11 = r11 * r9
            int r9 = r10 - r9
            int r9 = r9 * r5
            int r9 = r9 + r11
            int r9 = r9 / r10
            short r5 = (short) r9
            r6[r7] = r5
            int r4 = r4 + 1
            goto L1de
        L210:
            int r4 = r0.f10997q
            r11 = 1
            int r4 = r4 + r11
            r0.f10997q = r4
            int r4 = r0.f10993m
            int r4 = r4 + r11
            r0.f10993m = r4
            goto L1c7
        L21c:
            r11 = 1
            r0.f10996p = r4
            if (r4 != r2) goto L22d
            r0.f10996p = r8
            if (r7 != r3) goto L227
            r5 = 1
            goto L228
        L227:
            r5 = 0
        L228:
            p371v5.C6549a.m13291e(r5)
            r0.f10997q = r8
        L22d:
            int r1 = r1 + 1
            goto L1c1
        L230:
            if (r5 != 0) goto L233
            goto L24c
        L233:
            short[] r1 = r0.f10994n
            int r2 = r0.f10982b
            int r3 = r5 * r2
            int r4 = r4 - r5
            int r4 = r4 * r2
            java.lang.System.arraycopy(r1, r3, r1, r8, r4)
            int r1 = r0.f10995o
            int r1 = r1 - r5
            r0.f10995o = r1
            goto L24c
        L245:
            r11 = 1
            int r3 = r3 / 2
            int r2 = r2 / 2
            goto L195
        L24c:
            return
        L24d:
            r3 = 1065353216(0x3f800000, float:1.0)
            r7 = 1
            goto L39
    }
}
