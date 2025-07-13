package p051d5;

/* renamed from: d5.g */
/* loaded from: classes.dex */
public final class C1288g extends p427y4.AbstractC7117h {

    /* renamed from: b */
    public static final p051d5.C1288g.a f6785b = null;

    /* renamed from: a */
    public final p051d5.C1288g.a f6786a;

    /* renamed from: d5.g$a */
    public interface a {
        /* renamed from: c */
        boolean mo2144c(int r1, int r2, int r3, int r4, int r5);
    }

    /* renamed from: d5.g$b */
    public static final class b {

        /* renamed from: a */
        public final int f6787a;

        /* renamed from: b */
        public final boolean f6788b;

        /* renamed from: c */
        public final int f6789c;

        public b(int r1, boolean r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f6787a = r1
                r0.f6788b = r2
                r0.f6789c = r3
                return
        }
    }

    static {
            androidx.room.a r0 = androidx.room.C0618a.f3661k0
            p051d5.C1288g.f6785b = r0
            return
    }

    public C1288g() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6786a = r0
            return
    }

    public C1288g(p051d5.C1288g.a r1) {
            r0 = this;
            r0.<init>()
            r0.f6786a = r1
            return
    }

    /* renamed from: c */
    public static byte[] m3737c(byte[] r0, int r1, int r2) {
            if (r2 > r1) goto L5
            byte[] r0 = p371v5.C6552b0.f25629f
            return r0
        L5:
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
            return r0
    }

    /* renamed from: e */
    public static p051d5.C1282a m3738e(p371v5.C6571u r8, int r9, int r10) {
            int r0 = r8.m13418u()
            java.lang.String r1 = m3753t(r0)
            r2 = -1
            int r9 = r9 + r2
            byte[] r3 = new byte[r9]
            byte[] r4 = r8.f25710a
            int r5 = r8.f25711b
            r6 = 0
            java.lang.System.arraycopy(r4, r5, r3, r6, r9)
            int r4 = r8.f25711b
            int r4 = r4 + r9
            r8.f25711b = r4
            r8 = 2
            java.lang.String r4 = "image/"
            java.lang.String r5 = "ISO-8859-1"
            if (r10 != r8) goto L4b
            java.lang.String r10 = new java.lang.String
            r2 = 3
            r10.<init>(r3, r6, r2, r5)
            java.lang.String r10 = p185k7.C3836i.m8629n(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r2 = r10.length()
            if (r2 == 0) goto L39
            java.lang.String r10 = r4.concat(r10)
            goto L3e
        L39:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r4)
        L3e:
            java.lang.String r2 = "image/jpg"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L48
            java.lang.String r10 = "image/jpeg"
        L48:
            r2 = r10
            r10 = 2
            goto L72
        L4b:
            int r10 = m3756w(r3, r6)
            java.lang.String r7 = new java.lang.String
            r7.<init>(r3, r6, r10, r5)
            java.lang.String r5 = p185k7.C3836i.m8629n(r7)
            r6 = 47
            int r6 = r5.indexOf(r6)
            if (r6 != r2) goto L71
            int r2 = r5.length()
            if (r2 == 0) goto L6b
            java.lang.String r2 = r4.concat(r5)
            goto L72
        L6b:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L72
        L71:
            r2 = r5
        L72:
            int r4 = r10 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r10 = r10 + r8
            int r8 = m3755v(r3, r10, r0)
            java.lang.String r5 = new java.lang.String
            int r6 = r8 - r10
            r5.<init>(r3, r10, r6, r1)
            int r10 = m3752s(r0)
            int r10 = r10 + r8
            byte[] r8 = m3737c(r3, r10, r9)
            d5.a r9 = new d5.a
            r9.<init>(r2, r5, r4, r8)
            return r9
    }

    /* renamed from: f */
    public static p051d5.C1283b m3739f(p371v5.C6571u r4, int r5, java.lang.String r6) {
            byte[] r0 = new byte[r5]
            byte[] r1 = r4.f25710a
            int r2 = r4.f25711b
            r3 = 0
            java.lang.System.arraycopy(r1, r2, r0, r3, r5)
            int r1 = r4.f25711b
            int r1 = r1 + r5
            r4.f25711b = r1
            d5.b r4 = new d5.b
            r4.<init>(r6, r0)
            return r4
    }

    /* renamed from: g */
    public static p051d5.C1284c m3740g(p371v5.C6571u r15, int r16, int r17, boolean r18, int r19, p051d5.C1288g.a r20) {
            r0 = r15
            int r1 = r0.f25711b
            byte[] r2 = r0.f25710a
            int r2 = m3756w(r2, r1)
            java.lang.String r4 = new java.lang.String
            byte[] r3 = r0.f25710a
            int r5 = r2 - r1
            java.lang.String r6 = "ISO-8859-1"
            r4.<init>(r3, r1, r5, r6)
            int r2 = r2 + 1
            r15.m13396F(r2)
            int r5 = r15.m13403f()
            int r6 = r15.m13403f()
            long r2 = r15.m13419v()
            r7 = -1
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 != 0) goto L32
            r11 = r7
            goto L33
        L32:
            r11 = r2
        L33:
            long r2 = r15.m13419v()
            int r13 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r13 != 0) goto L3d
            r9 = r7
            goto L3e
        L3d:
            r9 = r2
        L3e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r1 = r1 + r16
        L45:
            int r3 = r0.f25711b
            if (r3 >= r1) goto L5b
            r3 = r17
            r7 = r18
            r8 = r19
            r13 = r20
            d5.h r14 = m3743j(r3, r15, r7, r8, r13)
            if (r14 == 0) goto L45
            r2.add(r14)
            goto L45
        L5b:
            r0 = 0
            d5.h[] r0 = new p051d5.AbstractC1289h[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            d5.h[] r0 = (p051d5.AbstractC1289h[]) r0
            d5.c r1 = new d5.c
            r3 = r1
            r7 = r11
            r11 = r0
            r3.<init>(r4, r5, r6, r7, r9, r11)
            return r1
    }

    /* renamed from: h */
    public static p051d5.C1285d m3741h(p371v5.C6571u r16, int r17, int r18, boolean r19, int r20, p051d5.C1288g.a r21) {
            r0 = r16
            int r1 = r0.f25711b
            byte[] r2 = r0.f25710a
            int r2 = m3756w(r2, r1)
            java.lang.String r3 = new java.lang.String
            byte[] r4 = r0.f25710a
            int r5 = r2 - r1
            java.lang.String r6 = "ISO-8859-1"
            r3.<init>(r4, r1, r5, r6)
            r4 = 1
            int r2 = r2 + r4
            r0.m13396F(r2)
            int r2 = r16.m13418u()
            r5 = r2 & 2
            r7 = 0
            if (r5 == 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            r2 = r2 & r4
            if (r2 == 0) goto L2b
            r2 = 1
            goto L2c
        L2b:
            r2 = 0
        L2c:
            int r8 = r16.m13418u()
            java.lang.String[] r9 = new java.lang.String[r8]
            r10 = 0
        L33:
            if (r10 >= r8) goto L4f
            int r11 = r0.f25711b
            byte[] r12 = r0.f25710a
            int r12 = m3756w(r12, r11)
            java.lang.String r13 = new java.lang.String
            byte[] r14 = r0.f25710a
            int r15 = r12 - r11
            r13.<init>(r14, r11, r15, r6)
            r9[r10] = r13
            int r12 = r12 + r4
            r0.m13396F(r12)
            int r10 = r10 + 1
            goto L33
        L4f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r1 = r1 + r17
        L56:
            int r6 = r0.f25711b
            if (r6 >= r1) goto L6c
            r6 = r18
            r8 = r19
            r10 = r20
            r11 = r21
            d5.h r12 = m3743j(r6, r0, r8, r10, r11)
            if (r12 == 0) goto L56
            r4.add(r12)
            goto L56
        L6c:
            d5.h[] r0 = new p051d5.AbstractC1289h[r7]
            java.lang.Object[] r0 = r4.toArray(r0)
            d5.h[] r0 = (p051d5.AbstractC1289h[]) r0
            d5.d r1 = new d5.d
            r16 = r1
            r17 = r3
            r18 = r5
            r19 = r2
            r20 = r9
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            return r1
    }

    /* renamed from: i */
    public static p051d5.C1286e m3742i(p371v5.C6571u r8, int r9) {
            r0 = 4
            if (r9 >= r0) goto L5
            r8 = 0
            return r8
        L5:
            int r1 = r8.m13418u()
            java.lang.String r2 = m3753t(r1)
            r3 = 3
            byte[] r4 = new byte[r3]
            byte[] r5 = r8.f25710a
            int r6 = r8.f25711b
            r7 = 0
            java.lang.System.arraycopy(r5, r6, r4, r7, r3)
            int r5 = r8.f25711b
            int r5 = r5 + r3
            r8.f25711b = r5
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4, r7, r3)
            int r9 = r9 - r0
            byte[] r0 = new byte[r9]
            byte[] r3 = r8.f25710a
            int r4 = r8.f25711b
            java.lang.System.arraycopy(r3, r4, r0, r7, r9)
            int r3 = r8.f25711b
            int r3 = r3 + r9
            r8.f25711b = r3
            int r8 = m3755v(r0, r7, r1)
            java.lang.String r9 = new java.lang.String
            r9.<init>(r0, r7, r8, r2)
            int r3 = m3752s(r1)
            int r3 = r3 + r8
            int r8 = m3755v(r0, r3, r1)
            java.lang.String r8 = m3747n(r0, r3, r8, r2)
            d5.e r0 = new d5.e
            r0.<init>(r5, r9, r8)
            return r0
    }

    /* renamed from: j */
    public static p051d5.AbstractC1289h m3743j(int r19, p371v5.C6571u r20, boolean r21, int r22, p051d5.C1288g.a r23) {
            r0 = r19
            r7 = r20
            int r8 = r20.m13418u()
            int r9 = r20.m13418u()
            int r10 = r20.m13418u()
            r12 = 3
            if (r0 < r12) goto L19
            int r1 = r20.m13418u()
            r13 = r1
            goto L1a
        L19:
            r13 = 0
        L1a:
            r14 = 4
            if (r0 != r14) goto L3c
            int r1 = r20.m13421x()
            if (r21 != 0) goto L3a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L3a:
            r15 = r1
            goto L48
        L3c:
            if (r0 != r12) goto L43
            int r1 = r20.m13421x()
            goto L3a
        L43:
            int r1 = r20.m13420w()
            goto L3a
        L48:
            if (r0 < r12) goto L50
            int r1 = r20.m13423z()
            r6 = r1
            goto L51
        L50:
            r6 = 0
        L51:
            r16 = 0
            if (r8 != 0) goto L65
            if (r9 != 0) goto L65
            if (r10 != 0) goto L65
            if (r13 != 0) goto L65
            if (r15 != 0) goto L65
            if (r6 != 0) goto L65
            int r0 = r7.f25712c
            r7.m13396F(r0)
            return r16
        L65:
            int r1 = r7.f25711b
            int r5 = r1 + r15
            int r1 = r7.f25712c
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L7a
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r4, r0)
            int r0 = r7.f25712c
            r7.m13396F(r0)
            return r16
        L7a:
            if (r23 == 0) goto L92
            r1 = r23
            r2 = r19
            r3 = r8
            r11 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.mo2144c(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L96
            r7.m13396F(r14)
            return r16
        L92:
            r11 = r4
            r14 = r5
            r18 = r6
        L96:
            r1 = 1
            if (r0 != r12) goto Lb4
            r2 = r18
            r3 = r2 & 128(0x80, float:1.8E-43)
            if (r3 == 0) goto La1
            r3 = 1
            goto La2
        La1:
            r3 = 0
        La2:
            r4 = r2 & 64
            if (r4 == 0) goto La8
            r4 = 1
            goto La9
        La8:
            r4 = 0
        La9:
            r2 = r2 & 32
            if (r2 == 0) goto Laf
            r2 = 1
            goto Lb0
        Laf:
            r2 = 0
        Lb0:
            r17 = r3
            r6 = 0
            goto Lea
        Lb4:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto Le4
            r3 = r2 & 64
            if (r3 == 0) goto Lbf
            r3 = 1
            goto Lc0
        Lbf:
            r3 = 0
        Lc0:
            r4 = r2 & 8
            if (r4 == 0) goto Lc6
            r4 = 1
            goto Lc7
        Lc6:
            r4 = 0
        Lc7:
            r5 = r2 & 4
            if (r5 == 0) goto Lcd
            r5 = 1
            goto Lce
        Lcd:
            r5 = 0
        Lce:
            r6 = r2 & 2
            if (r6 == 0) goto Ld4
            r6 = 1
            goto Ld5
        Ld4:
            r6 = 0
        Ld5:
            r2 = r2 & r1
            if (r2 == 0) goto Ldb
            r17 = 1
            goto Ldd
        Ldb:
            r17 = 0
        Ldd:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto Lea
        Le4:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        Lea:
            if (r17 != 0) goto L227
            if (r4 == 0) goto Lf0
            goto L227
        Lf0:
            if (r2 == 0) goto Lf7
            int r15 = r15 + (-1)
            r7.m13397G(r1)
        Lf7:
            if (r3 == 0) goto Lff
            int r15 = r15 + (-4)
            r1 = 4
            r7.m13397G(r1)
        Lff:
            if (r6 == 0) goto L105
            int r15 = m3757x(r7, r15)
        L105:
            r1 = 84
            r2 = 88
            r3 = 2
            if (r8 != r1) goto L11a
            if (r9 != r2) goto L11a
            if (r10 != r2) goto L11a
            if (r0 == r3) goto L114
            if (r13 != r2) goto L11a
        L114:
            d5.l r1 = m3749p(r7, r15)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L11a:
            if (r8 != r1) goto L129
            java.lang.String r1 = m3754u(r0, r8, r9, r10, r13)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            d5.l r1 = m3748o(r7, r15, r1)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L126:
            r0 = move-exception
            goto L223
        L129:
            r4 = 87
            if (r8 != r4) goto L13b
            if (r9 != r2) goto L13b
            if (r10 != r2) goto L13b
            if (r0 == r3) goto L135
            if (r13 != r2) goto L13b
        L135:
            d5.m r1 = m3751r(r7, r15)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L13b:
            if (r8 != r4) goto L147
            java.lang.String r1 = m3754u(r0, r8, r9, r10, r13)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            d5.m r1 = m3750q(r7, r15, r1)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L147:
            r2 = 73
            r4 = 80
            if (r8 != r4) goto L15d
            r5 = 82
            if (r9 != r5) goto L15d
            if (r10 != r2) goto L15d
            r5 = 86
            if (r13 != r5) goto L15d
            d5.k r1 = m3746m(r7, r15)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L15d:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L175
            r5 = 69
            if (r9 != r5) goto L175
            if (r10 != r6) goto L175
            r5 = 66
            if (r13 == r5) goto L16f
            if (r0 != r3) goto L175
        L16f:
            d5.f r1 = m3744k(r7, r15)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L175:
            r5 = 65
            r12 = 67
            if (r0 != r3) goto L182
            if (r8 != r4) goto L190
            if (r9 != r2) goto L190
            if (r10 != r12) goto L190
            goto L18a
        L182:
            if (r8 != r5) goto L190
            if (r9 != r4) goto L190
            if (r10 != r2) goto L190
            if (r13 != r12) goto L190
        L18a:
            d5.a r1 = m3738e(r7, r15, r0)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L190:
            r2 = 77
            if (r8 != r12) goto L1a1
            if (r9 != r6) goto L1a1
            if (r10 != r2) goto L1a1
            if (r13 == r2) goto L19c
            if (r0 != r3) goto L1a1
        L19c:
            d5.e r1 = m3742i(r7, r15)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L1a1:
            if (r8 != r12) goto L1bb
            r3 = 72
            if (r9 != r3) goto L1bb
            if (r10 != r5) goto L1bb
            if (r13 != r4) goto L1bb
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            d5.c r1 = m3740g(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L1bb:
            if (r8 != r12) goto L1d3
            if (r9 != r1) goto L1d3
            if (r10 != r6) goto L1d3
            if (r13 != r12) goto L1d3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            d5.d r1 = m3741h(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L1d3:
            if (r8 != r2) goto L1e2
            r2 = 76
            if (r9 != r2) goto L1e2
            if (r10 != r2) goto L1e2
            if (r13 != r1) goto L1e2
            d5.j r1 = m3745l(r7, r15)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            goto L1ea
        L1e2:
            java.lang.String r1 = m3754u(r0, r8, r9, r10, r13)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            d5.b r1 = m3739f(r7, r15, r1)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
        L1ea:
            if (r1 != 0) goto L216
            java.lang.String r0 = m3754u(r0, r8, r9, r10, r13)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            int r2 = r2 + 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            java.lang.String r2 = "Failed to decode frame: id="
            r3.append(r2)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            r3.append(r0)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            java.lang.String r0 = ", frameSize="
            r3.append(r0)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            r3.append(r15)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L126 java.io.UnsupportedEncodingException -> L21a
        L216:
            r7.m13396F(r14)
            return r1
        L21a:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r11, r0)     // Catch: java.lang.Throwable -> L126
            r7.m13396F(r14)
            return r16
        L223:
            r7.m13396F(r14)
            throw r0
        L227:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r11, r0)
            r7.m13396F(r14)
            return r16
    }

    /* renamed from: k */
    public static p051d5.C1287f m3744k(p371v5.C6571u r6, int r7) {
            int r0 = r6.m13418u()
            java.lang.String r1 = m3753t(r0)
            int r7 = r7 + (-1)
            byte[] r2 = new byte[r7]
            byte[] r3 = r6.f25710a
            int r4 = r6.f25711b
            r5 = 0
            java.lang.System.arraycopy(r3, r4, r2, r5, r7)
            int r3 = r6.f25711b
            int r3 = r3 + r7
            r6.f25711b = r3
            int r6 = m3756w(r2, r5)
            java.lang.String r3 = new java.lang.String
            java.lang.String r4 = "ISO-8859-1"
            r3.<init>(r2, r5, r6, r4)
            int r6 = r6 + 1
            int r4 = m3755v(r2, r6, r0)
            java.lang.String r6 = m3747n(r2, r6, r4, r1)
            int r5 = m3752s(r0)
            int r5 = r5 + r4
            int r4 = m3755v(r2, r5, r0)
            java.lang.String r1 = m3747n(r2, r5, r4, r1)
            int r0 = m3752s(r0)
            int r0 = r0 + r4
            byte[] r7 = m3737c(r2, r0, r7)
            d5.f r0 = new d5.f
            r0.<init>(r3, r6, r1, r7)
            return r0
    }

    /* renamed from: l */
    public static p051d5.C1291j m3745l(p371v5.C6571u r10, int r11) {
            int r1 = r10.m13423z()
            int r2 = r10.m13420w()
            int r3 = r10.m13420w()
            int r0 = r10.m13418u()
            int r4 = r10.m13418u()
            m4.b0 r5 = new m4.b0
            r5.<init>()
            byte[] r6 = r10.f25710a
            int r7 = r10.f25712c
            r5.m9771p(r6, r7)
            int r10 = r10.f25711b
            int r10 = r10 * 8
            r5.m9772q(r10)
            int r11 = r11 + (-10)
            int r11 = r11 * 8
            int r10 = r0 + r4
            int r11 = r11 / r10
            int[] r10 = new int[r11]
            int[] r6 = new int[r11]
            r7 = 0
        L33:
            if (r7 >= r11) goto L44
            int r8 = r5.m9766k(r0)
            int r9 = r5.m9766k(r4)
            r10[r7] = r8
            r6[r7] = r9
            int r7 = r7 + 1
            goto L33
        L44:
            d5.j r11 = new d5.j
            r0 = r11
            r4 = r10
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r11
    }

    /* renamed from: m */
    public static p051d5.C1292k m3746m(p371v5.C6571u r4, int r5) {
            byte[] r0 = new byte[r5]
            byte[] r1 = r4.f25710a
            int r2 = r4.f25711b
            r3 = 0
            java.lang.System.arraycopy(r1, r2, r0, r3, r5)
            int r1 = r4.f25711b
            int r1 = r1 + r5
            r4.f25711b = r1
            int r4 = m3756w(r0, r3)
            java.lang.String r1 = new java.lang.String
            java.lang.String r2 = "ISO-8859-1"
            r1.<init>(r0, r3, r4, r2)
            int r4 = r4 + 1
            byte[] r4 = m3737c(r0, r4, r5)
            d5.k r5 = new d5.k
            r5.<init>(r1, r4)
            return r5
    }

    /* renamed from: n */
    public static java.lang.String m3747n(byte[] r1, int r2, int r3, java.lang.String r4) {
            if (r3 <= r2) goto Ld
            int r0 = r1.length
            if (r3 <= r0) goto L6
            goto Ld
        L6:
            java.lang.String r0 = new java.lang.String
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3, r4)
            return r0
        Ld:
            java.lang.String r1 = ""
            return r1
    }

    /* renamed from: o */
    public static p051d5.C1293l m3748o(p371v5.C6571u r7, int r8, java.lang.String r9) {
            r0 = 0
            r1 = 1
            if (r8 >= r1) goto L5
            return r0
        L5:
            int r2 = r7.m13418u()
            java.lang.String r3 = m3753t(r2)
            int r8 = r8 - r1
            byte[] r1 = new byte[r8]
            byte[] r4 = r7.f25710a
            int r5 = r7.f25711b
            r6 = 0
            java.lang.System.arraycopy(r4, r5, r1, r6, r8)
            int r4 = r7.f25711b
            int r4 = r4 + r8
            r7.f25711b = r4
            int r7 = m3755v(r1, r6, r2)
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r6, r7, r3)
            d5.l r7 = new d5.l
            r7.<init>(r9, r0, r8)
            return r7
    }

    /* renamed from: p */
    public static p051d5.C1293l m3749p(p371v5.C6571u r6, int r7) {
            r0 = 1
            if (r7 >= r0) goto L5
            r6 = 0
            return r6
        L5:
            int r1 = r6.m13418u()
            java.lang.String r2 = m3753t(r1)
            int r7 = r7 - r0
            byte[] r0 = new byte[r7]
            byte[] r3 = r6.f25710a
            int r4 = r6.f25711b
            r5 = 0
            java.lang.System.arraycopy(r3, r4, r0, r5, r7)
            int r3 = r6.f25711b
            int r3 = r3 + r7
            r6.f25711b = r3
            int r6 = m3755v(r0, r5, r1)
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r5, r6, r2)
            int r3 = m3752s(r1)
            int r3 = r3 + r6
            int r6 = m3755v(r0, r3, r1)
            java.lang.String r6 = m3747n(r0, r3, r6, r2)
            d5.l r0 = new d5.l
            java.lang.String r1 = "TXXX"
            r0.<init>(r1, r7, r6)
            return r0
    }

    /* renamed from: q */
    public static p051d5.C1294m m3750q(p371v5.C6571u r4, int r5, java.lang.String r6) {
            byte[] r0 = new byte[r5]
            byte[] r1 = r4.f25710a
            int r2 = r4.f25711b
            r3 = 0
            java.lang.System.arraycopy(r1, r2, r0, r3, r5)
            int r1 = r4.f25711b
            int r1 = r1 + r5
            r4.f25711b = r1
            int r4 = m3756w(r0, r3)
            java.lang.String r5 = new java.lang.String
            java.lang.String r1 = "ISO-8859-1"
            r5.<init>(r0, r3, r4, r1)
            d5.m r4 = new d5.m
            r0 = 0
            r4.<init>(r6, r0, r5)
            return r4
    }

    /* renamed from: r */
    public static p051d5.C1294m m3751r(p371v5.C6571u r6, int r7) {
            r0 = 1
            if (r7 >= r0) goto L5
            r6 = 0
            return r6
        L5:
            int r1 = r6.m13418u()
            java.lang.String r2 = m3753t(r1)
            int r7 = r7 - r0
            byte[] r0 = new byte[r7]
            byte[] r3 = r6.f25710a
            int r4 = r6.f25711b
            r5 = 0
            java.lang.System.arraycopy(r3, r4, r0, r5, r7)
            int r3 = r6.f25711b
            int r3 = r3 + r7
            r6.f25711b = r3
            int r6 = m3755v(r0, r5, r1)
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r5, r6, r2)
            int r1 = m3752s(r1)
            int r1 = r1 + r6
            int r6 = m3756w(r0, r1)
            java.lang.String r2 = "ISO-8859-1"
            java.lang.String r6 = m3747n(r0, r1, r6, r2)
            d5.m r0 = new d5.m
            java.lang.String r1 = "WXXX"
            r0.<init>(r1, r7, r6)
            return r0
    }

    /* renamed from: s */
    public static int m3752s(int r1) {
            if (r1 == 0) goto L8
            r0 = 3
            if (r1 != r0) goto L6
            goto L8
        L6:
            r1 = 2
            goto L9
        L8:
            r1 = 1
        L9:
            return r1
    }

    /* renamed from: t */
    public static java.lang.String m3753t(int r1) {
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            java.lang.String r1 = "ISO-8859-1"
            return r1
        Lc:
            java.lang.String r1 = "UTF-8"
            return r1
        Lf:
            java.lang.String r1 = "UTF-16BE"
            return r1
        L12:
            java.lang.String r1 = "UTF-16"
            return r1
    }

    /* renamed from: u */
    public static java.lang.String m3754u(int r5, int r6, int r7, int r8, int r9) {
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 != r3) goto L23
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r9[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r9[r3] = r6
            java.lang.String r6 = "%c%c%c"
            java.lang.String r5 = java.lang.String.format(r5, r6, r9)
            goto L46
        L23:
            java.util.Locale r5 = java.util.Locale.US
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r4[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r4[r3] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r4[r0] = r6
            java.lang.String r6 = "%c%c%c%c"
            java.lang.String r5 = java.lang.String.format(r5, r6, r4)
        L46:
            return r5
    }

    /* renamed from: v */
    public static int m3755v(byte[] r2, int r3, int r4) {
            int r0 = m3756w(r2, r3)
            if (r4 == 0) goto L25
            r1 = 3
            if (r4 != r1) goto La
            goto L25
        La:
            int r4 = r2.length
            int r4 = r4 + (-1)
            if (r0 >= r4) goto L23
            int r4 = r0 - r3
            int r4 = r4 % 2
            if (r4 != 0) goto L1c
            int r4 = r0 + 1
            r4 = r2[r4]
            if (r4 != 0) goto L1c
            return r0
        L1c:
            int r0 = r0 + 1
            int r0 = m3756w(r2, r0)
            goto La
        L23:
            int r2 = r2.length
            return r2
        L25:
            return r0
    }

    /* renamed from: w */
    public static int m3756w(byte[] r1, int r2) {
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r1 = r1.length
            return r1
    }

    /* renamed from: x */
    public static int m3757x(p371v5.C6571u r5, int r6) {
            byte[] r0 = r5.f25710a
            int r5 = r5.f25711b
            r1 = r5
        L5:
            int r2 = r1 + 1
            int r3 = r5 + r6
            if (r2 >= r3) goto L25
            r3 = r0[r1]
            r4 = 255(0xff, float:3.57E-43)
            r3 = r3 & r4
            if (r3 != r4) goto L23
            r3 = r0[r2]
            if (r3 != 0) goto L23
            int r3 = r1 - r5
            int r1 = r1 + 2
            int r3 = r6 - r3
            int r3 = r3 + (-2)
            java.lang.System.arraycopy(r0, r1, r0, r2, r3)
            int r6 = r6 + (-1)
        L23:
            r1 = r2
            goto L5
        L25:
            return r6
    }

    /* renamed from: y */
    public static boolean m3758y(p371v5.C6571u r18, int r19, int r20, boolean r21) {
            r1 = r18
            r0 = r19
            int r2 = r1.f25711b
        L6:
            int r3 = r18.m13398a()     // Catch: java.lang.Throwable -> Lab
            r4 = 1
            r5 = r20
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r18.m13403f()     // Catch: java.lang.Throwable -> Lab
            long r8 = r18.m13419v()     // Catch: java.lang.Throwable -> Lab
            int r10 = r18.m13423z()     // Catch: java.lang.Throwable -> Lab
            goto L2a
        L20:
            int r7 = r18.m13420w()     // Catch: java.lang.Throwable -> Lab
            int r8 = r18.m13420w()     // Catch: java.lang.Throwable -> Lab
            long r8 = (long) r8
            r10 = 0
        L2a:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            r1.m13396F(r2)
            return r4
        L38:
            r7 = 4
            if (r0 != r7) goto L69
            if (r21 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L49
            r1.m13396F(r2)
            return r6
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L69:
            if (r0 != r7) goto L77
            r3 = r10 & 64
            if (r3 == 0) goto L71
            r3 = 1
            goto L72
        L71:
            r3 = 0
        L72:
            r7 = r10 & 1
            if (r7 == 0) goto L86
            goto L87
        L77:
            if (r0 != r3) goto L85
            r3 = r10 & 32
            if (r3 == 0) goto L7f
            r3 = 1
            goto L80
        L7f:
            r3 = 0
        L80:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L86
            goto L87
        L85:
            r3 = 0
        L86:
            r4 = 0
        L87:
            if (r4 == 0) goto L8b
            int r3 = r3 + 4
        L8b:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L94
            r1.m13396F(r2)
            return r6
        L94:
            int r3 = r18.m13398a()     // Catch: java.lang.Throwable -> Lab
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La1
            r1.m13396F(r2)
            return r6
        La1:
            int r3 = (int) r8
            r1.m13397G(r3)     // Catch: java.lang.Throwable -> Lab
            goto L6
        La7:
            r1.m13396F(r2)
            return r4
        Lab:
            r0 = move-exception
            r1.m13396F(r2)
            throw r0
    }

    @Override // p427y4.AbstractC7117h
    /* renamed from: b */
    public p427y4.C7110a mo33b(p427y4.C7114e r1, java.nio.ByteBuffer r2) {
            r0 = this;
            byte[] r1 = r2.array()
            int r2 = r2.limit()
            y4.a r1 = r0.m3759d(r1, r2)
            return r1
    }

    /* renamed from: d */
    public p427y4.C7110a m3759d(byte[] r13, int r14) {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            v5.u r1 = new v5.u
            r1.<init>(r13, r14)
            int r13 = r1.m13398a()
            r14 = 0
            r2 = 1
            r3 = 2
            r4 = 10
            java.lang.String r5 = "Id3Decoder"
            r6 = 4
            r7 = 0
            if (r13 >= r4) goto L1d
            java.lang.String r13 = "Data too short to be an ID3 tag"
            goto Lb7
        L1d:
            int r13 = r1.m13420w()
            r8 = 4801587(0x494433, float:6.728456E-39)
            if (r13 == r8) goto L4d
            java.lang.String r8 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r14] = r13
            java.lang.String r13 = "%06X"
            java.lang.String r13 = java.lang.String.format(r13, r9)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r9 = r13.length()
            if (r9 == 0) goto L46
            java.lang.String r13 = r8.concat(r13)
            goto Lb7
        L46:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r8)
            goto Lb7
        L4d:
            int r13 = r1.m13418u()
            r1.m13397G(r2)
            int r8 = r1.m13418u()
            int r9 = r1.m13417t()
            if (r13 != r3) goto L6a
            r10 = r8 & 64
            if (r10 == 0) goto L64
            r10 = 1
            goto L65
        L64:
            r10 = 0
        L65:
            if (r10 == 0) goto La0
            java.lang.String r13 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            goto Lb7
        L6a:
            r10 = 3
            if (r13 != r10) goto L80
            r10 = r8 & 64
            if (r10 == 0) goto L73
            r10 = 1
            goto L74
        L73:
            r10 = 0
        L74:
            if (r10 == 0) goto La0
            int r10 = r1.m13403f()
            r1.m13397G(r10)
            int r10 = r10 + r6
            int r9 = r9 - r10
            goto La0
        L80:
            if (r13 != r6) goto Laf
            r10 = r8 & 64
            if (r10 == 0) goto L88
            r10 = 1
            goto L89
        L88:
            r10 = 0
        L89:
            if (r10 == 0) goto L95
            int r10 = r1.m13417t()
            int r11 = r10 + (-4)
            r1.m13397G(r11)
            int r9 = r9 - r10
        L95:
            r10 = r8 & 16
            if (r10 == 0) goto L9b
            r10 = 1
            goto L9c
        L9b:
            r10 = 0
        L9c:
            if (r10 == 0) goto La0
            int r9 = r9 + (-10)
        La0:
            if (r13 >= r6) goto La8
            r8 = r8 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto La8
            r8 = 1
            goto La9
        La8:
            r8 = 0
        La9:
            d5.g$b r10 = new d5.g$b
            r10.<init>(r13, r8, r9)
            goto Lbb
        Laf:
            r8 = 57
            java.lang.String r9 = "Skipped ID3 tag with unsupported majorVersion="
            java.lang.String r13 = p064e.C1490d.m4039a(r8, r9, r13)
        Lb7:
            android.util.Log.w(r5, r13)
            r10 = r7
        Lbb:
            if (r10 != 0) goto Lbe
            return r7
        Lbe:
            int r13 = r1.f25711b
            int r8 = r10.f6787a
            if (r8 != r3) goto Lc5
            r4 = 6
        Lc5:
            int r3 = r10.f6789c
            boolean r8 = r10.f6788b
            if (r8 == 0) goto Lcf
            int r3 = m3757x(r1, r3)
        Lcf:
            int r13 = r13 + r3
            r1.m13395E(r13)
            int r13 = r10.f6787a
            boolean r13 = m3758y(r1, r13, r4, r14)
            if (r13 != 0) goto Lf1
            int r13 = r10.f6787a
            if (r13 != r6) goto Le7
            boolean r13 = m3758y(r1, r6, r4, r2)
            if (r13 == 0) goto Le7
            r14 = 1
            goto Lf1
        Le7:
            int r13 = r10.f6787a
            r14 = 56
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            p088f4.C1999d.m5182a(r14, r0, r13, r5)
            return r7
        Lf1:
            int r13 = r1.m13398a()
            if (r13 < r4) goto L105
            int r13 = r10.f6787a
            d5.g$a r2 = r12.f6786a
            d5.h r13 = m3743j(r13, r1, r14, r4, r2)
            if (r13 == 0) goto Lf1
            r0.add(r13)
            goto Lf1
        L105:
            y4.a r13 = new y4.a
            r13.<init>(r0)
            return r13
    }
}
