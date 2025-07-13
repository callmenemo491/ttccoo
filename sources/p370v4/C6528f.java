package p370v4;

/* renamed from: v4.f */
/* loaded from: classes.dex */
public final class C6528f implements p370v4.InterfaceC6532j {

    /* renamed from: v */
    public static final byte[] f25362v = null;

    /* renamed from: a */
    public final boolean f25363a;

    /* renamed from: b */
    public final p216m4.C4355b0 f25364b;

    /* renamed from: c */
    public final p371v5.C6571u f25365c;

    /* renamed from: d */
    public final java.lang.String f25366d;

    /* renamed from: e */
    public java.lang.String f25367e;

    /* renamed from: f */
    public p216m4.InterfaceC4381z f25368f;

    /* renamed from: g */
    public p216m4.InterfaceC4381z f25369g;

    /* renamed from: h */
    public int f25370h;

    /* renamed from: i */
    public int f25371i;

    /* renamed from: j */
    public int f25372j;

    /* renamed from: k */
    public boolean f25373k;

    /* renamed from: l */
    public boolean f25374l;

    /* renamed from: m */
    public int f25375m;

    /* renamed from: n */
    public int f25376n;

    /* renamed from: o */
    public int f25377o;

    /* renamed from: p */
    public boolean f25378p;

    /* renamed from: q */
    public long f25379q;

    /* renamed from: r */
    public int f25380r;

    /* renamed from: s */
    public long f25381s;

    /* renamed from: t */
    public p216m4.InterfaceC4381z f25382t;

    /* renamed from: u */
    public long f25383u;

    static {
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [73, 68, 51} // fill-array
            p370v4.C6528f.f25362v = r0
            return
    }

    public C6528f(boolean r5, java.lang.String r6) {
            r4 = this;
            r4.<init>()
            m4.b0 r0 = new m4.b0
            r1 = 7
            byte[] r1 = new byte[r1]
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.f25364b = r0
            v5.u r0 = new v5.u
            byte[] r1 = p370v4.C6528f.f25362v
            r2 = 10
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.<init>(r1)
            r4.f25365c = r0
            r4.m13261h()
            r0 = -1
            r4.f25375m = r0
            r4.f25376n = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.f25379q = r0
            r4.f25381s = r0
            r4.f25363a = r5
            r4.f25366d = r6
            return
    }

    /* renamed from: g */
    public static boolean m13259g(int r1) {
            r0 = 65526(0xfff6, float:9.1821E-41)
            r1 = r1 & r0
            r0 = 65520(0xfff0, float:9.1813E-41)
            if (r1 != r0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25381s = r0
            r0 = 0
            r2.f25374l = r0
            r2.m13261h()
            return
    }

    /* renamed from: b */
    public final boolean m13260b(p371v5.C6571u r5, byte[] r6, int r7) {
            r4 = this;
            int r0 = r5.m13398a()
            int r1 = r4.f25371i
            int r1 = r7 - r1
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r4.f25371i
            byte[] r2 = r5.f25710a
            int r3 = r5.f25711b
            java.lang.System.arraycopy(r2, r3, r6, r1, r0)
            int r6 = r5.f25711b
            int r6 = r6 + r0
            r5.f25711b = r6
            int r5 = r4.f25371i
            int r5 = r5 + r0
            r4.f25371i = r5
            if (r5 != r7) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            return r5
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            m4.z r2 = r0.f25368f
            java.util.Objects.requireNonNull(r2)
            int r2 = p371v5.C6552b0.f25624a
        Lb:
            int r2 = r18.m13398a()
            if (r2 <= 0) goto L2eb
            int r2 = r0.f25370h
            r3 = 13
            r4 = -1
            r5 = 7
            r6 = 3
            r7 = 0
            r8 = 4
            r9 = 2
            r10 = 1
            if (r2 == 0) goto L19f
            if (r2 == r10) goto L161
            r4 = 10
            if (r2 == r9) goto L133
            if (r2 == r6) goto L67
            if (r2 != r8) goto L61
            int r2 = r18.m13398a()
            int r3 = r0.f25380r
            int r4 = r0.f25371i
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            m4.z r3 = r0.f25382t
            r3.mo5972d(r1, r2)
            int r3 = r0.f25371i
            int r3 = r3 + r2
            r0.f25371i = r3
            int r8 = r0.f25380r
            if (r3 != r8) goto Lb
            long r5 = r0.f25381s
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 == 0) goto L5d
            m4.z r4 = r0.f25382t
            r7 = 1
            r9 = 0
            r10 = 0
            r4.mo5971c(r5, r7, r8, r9, r10)
            long r2 = r0.f25381s
            long r4 = r0.f25383u
            long r2 = r2 + r4
            r0.f25381s = r2
        L5d:
            r17.m13261h()
            goto Lb
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L67:
            boolean r2 = r0.f25373k
            r11 = 5
            if (r2 == 0) goto L6e
            r2 = 7
            goto L6f
        L6e:
            r2 = 5
        L6f:
            m4.b0 r12 = r0.f25364b
            java.lang.Object r12 = r12.f17870b
            byte[] r12 = (byte[]) r12
            boolean r2 = r0.m13260b(r1, r12, r2)
            if (r2 == 0) goto Lb
            m4.b0 r2 = r0.f25364b
            r2.m9772q(r7)
            boolean r2 = r0.f25378p
            if (r2 != 0) goto L10b
            m4.b0 r2 = r0.f25364b
            int r2 = r2.m9766k(r9)
            int r2 = r2 + r10
            if (r2 == r9) goto Lab
            r4 = 61
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r4)
            java.lang.String r4 = "Detected audio object type: "
            r12.append(r4)
            r12.append(r2)
            java.lang.String r2 = ", but assuming AAC LC."
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            java.lang.String r4 = "AdtsReader"
            android.util.Log.w(r4, r2)
            r2 = 2
        Lab:
            m4.b0 r4 = r0.f25364b
            r4.m9775t(r11)
            m4.b0 r4 = r0.f25364b
            int r4 = r4.m9766k(r6)
            int r12 = r0.f25376n
            byte[] r13 = new byte[r9]
            int r2 = r2 << r6
            r2 = r2 & 248(0xf8, float:3.48E-43)
            int r14 = r12 >> 1
            r14 = r14 & r5
            r2 = r2 | r14
            byte r2 = (byte) r2
            r13[r7] = r2
            int r2 = r12 << 7
            r2 = r2 & 128(0x80, float:1.8E-43)
            int r4 = r4 << r6
            r4 = r4 & 120(0x78, float:1.68E-43)
            r2 = r2 | r4
            byte r2 = (byte) r2
            r13[r10] = r2
            h4.a$b r2 = p121h4.C2455a.m6236c(r13)
            f4.e0$b r4 = new f4.e0$b
            r4.<init>()
            java.lang.String r5 = r0.f25367e
            r4.f8917a = r5
            java.lang.String r5 = "audio/mp4a-latm"
            r4.f8927k = r5
            java.lang.String r5 = r2.f10958c
            r4.f8924h = r5
            int r5 = r2.f10957b
            r4.f8940x = r5
            int r2 = r2.f10956a
            r4.f8941y = r2
            java.util.List r2 = java.util.Collections.singletonList(r13)
            r4.f8929m = r2
            java.lang.String r2 = r0.f25366d
            r4.f8919c = r2
            f4.e0 r2 = r4.m5193a()
            r4 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r6 = r2.f8910x0
            long r12 = (long) r6
            long r4 = r4 / r12
            r0.f25379q = r4
            m4.z r4 = r0.f25368f
            r4.mo5973e(r2)
            r0.f25378p = r10
            goto L110
        L10b:
            m4.b0 r2 = r0.f25364b
            r2.m9775t(r4)
        L110:
            m4.b0 r2 = r0.f25364b
            r2.m9775t(r8)
            m4.b0 r2 = r0.f25364b
            int r2 = r2.m9766k(r3)
            int r2 = r2 - r9
            int r2 = r2 - r11
            boolean r3 = r0.f25373k
            if (r3 == 0) goto L123
            int r2 = r2 + (-2)
        L123:
            m4.z r3 = r0.f25368f
            long r4 = r0.f25379q
            r0.f25370h = r8
            r0.f25371i = r7
            r0.f25382t = r3
            r0.f25383u = r4
            r0.f25380r = r2
            goto Lb
        L133:
            v5.u r2 = r0.f25365c
            byte[] r2 = r2.f25710a
            boolean r2 = r0.m13260b(r1, r2, r4)
            if (r2 == 0) goto Lb
            m4.z r2 = r0.f25369g
            v5.u r3 = r0.f25365c
            r2.mo5972d(r3, r4)
            v5.u r2 = r0.f25365c
            r3 = 6
            r2.m13396F(r3)
            m4.z r2 = r0.f25369g
            v5.u r3 = r0.f25365c
            int r3 = r3.m13417t()
            int r3 = r3 + r4
            r0.f25370h = r8
            r0.f25371i = r4
            r0.f25382t = r2
            r4 = 0
            r0.f25383u = r4
            r0.f25380r = r3
            goto Lb
        L161:
            int r2 = r18.m13398a()
            if (r2 != 0) goto L169
            goto Lb
        L169:
            m4.b0 r2 = r0.f25364b
            java.lang.Object r3 = r2.f17870b
            byte[] r3 = (byte[]) r3
            byte[] r5 = r1.f25710a
            int r11 = r1.f25711b
            r5 = r5[r11]
            r3[r7] = r5
            r2.m9772q(r9)
            m4.b0 r2 = r0.f25364b
            int r2 = r2.m9766k(r8)
            int r3 = r0.f25376n
            if (r3 == r4) goto L18d
            if (r2 == r3) goto L18d
            r0.f25374l = r7
            r17.m13261h()
            goto Lb
        L18d:
            boolean r3 = r0.f25374l
            if (r3 != 0) goto L199
            r0.f25374l = r10
            int r3 = r0.f25377o
            r0.f25375m = r3
            r0.f25376n = r2
        L199:
            r0.f25370h = r6
            r0.f25371i = r7
            goto Lb
        L19f:
            byte[] r2 = r1.f25710a
            int r11 = r1.f25711b
            int r12 = r1.f25712c
        L1a5:
            if (r11 >= r12) goto L2e6
            int r13 = r11 + 1
            r11 = r2[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r14 = r0.f25372j
            r15 = 512(0x200, float:7.17E-43)
            if (r14 != r15) goto L298
            byte r14 = (byte) r11
            r14 = r14 & 255(0xff, float:3.57E-43)
            r16 = 65280(0xff00, float:9.1477E-41)
            r14 = r14 | r16
            boolean r14 = m13259g(r14)
            if (r14 == 0) goto L298
            boolean r14 = r0.f25374l
            if (r14 != 0) goto L27a
            int r14 = r13 + (-2)
            int r15 = r14 + 1
            r1.m13396F(r15)
            m4.b0 r15 = r0.f25364b
            java.lang.Object r15 = r15.f17870b
            byte[] r15 = (byte[]) r15
            boolean r15 = r0.m13262i(r1, r15, r10)
            if (r15 != 0) goto L1da
            goto L277
        L1da:
            m4.b0 r15 = r0.f25364b
            r15.m9772q(r8)
            m4.b0 r15 = r0.f25364b
            int r15 = r15.m9766k(r10)
            int r7 = r0.f25375m
            if (r7 == r4) goto L1ed
            if (r15 == r7) goto L1ed
            goto L277
        L1ed:
            int r7 = r0.f25376n
            if (r7 == r4) goto L215
            m4.b0 r7 = r0.f25364b
            java.lang.Object r7 = r7.f17870b
            byte[] r7 = (byte[]) r7
            boolean r7 = r0.m13262i(r1, r7, r10)
            if (r7 != 0) goto L1ff
            goto L275
        L1ff:
            m4.b0 r7 = r0.f25364b
            r7.m9772q(r9)
            m4.b0 r7 = r0.f25364b
            int r7 = r7.m9766k(r8)
            int r9 = r0.f25376n
            if (r7 == r9) goto L210
            goto L277
        L210:
            int r7 = r14 + 2
            r1.m13396F(r7)
        L215:
            m4.b0 r7 = r0.f25364b
            java.lang.Object r7 = r7.f17870b
            byte[] r7 = (byte[]) r7
            boolean r7 = r0.m13262i(r1, r7, r8)
            if (r7 != 0) goto L222
            goto L275
        L222:
            m4.b0 r7 = r0.f25364b
            r9 = 14
            r7.m9772q(r9)
            m4.b0 r7 = r0.f25364b
            int r7 = r7.m9766k(r3)
            if (r7 >= r5) goto L232
            goto L277
        L232:
            byte[] r9 = r1.f25710a
            int r3 = r1.f25712c
            int r14 = r14 + r7
            if (r14 < r3) goto L23a
            goto L275
        L23a:
            r7 = r9[r14]
            if (r7 != r4) goto L257
            int r14 = r14 + 1
            if (r14 != r3) goto L243
            goto L275
        L243:
            r3 = r9[r14]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r16
            boolean r3 = m13259g(r3)
            if (r3 == 0) goto L277
            r3 = r9[r14]
            r3 = r3 & 8
            int r3 = r3 >> r6
            if (r3 != r15) goto L277
            goto L275
        L257:
            r7 = r9[r14]
            r15 = 73
            if (r7 == r15) goto L25e
            goto L277
        L25e:
            int r7 = r14 + 1
            if (r7 != r3) goto L263
            goto L275
        L263:
            r7 = r9[r7]
            r15 = 68
            if (r7 == r15) goto L26a
            goto L277
        L26a:
            int r14 = r14 + 2
            if (r14 != r3) goto L26f
            goto L275
        L26f:
            r3 = r9[r14]
            r7 = 51
            if (r3 != r7) goto L277
        L275:
            r3 = 1
            goto L278
        L277:
            r3 = 0
        L278:
            if (r3 == 0) goto L298
        L27a:
            r2 = r11 & 8
            int r2 = r2 >> r6
            r0.f25377o = r2
            r2 = r11 & 1
            if (r2 != 0) goto L285
            r2 = 1
            goto L286
        L285:
            r2 = 0
        L286:
            r0.f25373k = r2
            boolean r2 = r0.f25374l
            if (r2 != 0) goto L292
            r0.f25370h = r10
            r2 = 0
            r0.f25371i = r2
            goto L2cb
        L292:
            r2 = 0
            r0.f25370h = r6
            r0.f25371i = r2
            goto L2cb
        L298:
            int r3 = r0.f25372j
            r7 = r11 | r3
            r9 = 329(0x149, float:4.61E-43)
            if (r7 == r9) goto L2da
            r9 = 511(0x1ff, float:7.16E-43)
            if (r7 == r9) goto L2d5
            r9 = 836(0x344, float:1.171E-42)
            if (r7 == r9) goto L2d0
            r9 = 1075(0x433, float:1.506E-42)
            if (r7 == r9) goto L2bb
            r7 = 256(0x100, float:3.59E-43)
            if (r3 == r7) goto L2b8
            r0.f25372j = r7
            int r13 = r13 + (-1)
            r11 = r13
            r3 = 2
            r7 = 0
            goto L2e1
        L2b8:
            r3 = 2
            r7 = 0
            goto L2e0
        L2bb:
            r3 = 2
            r0.f25370h = r3
            byte[] r2 = p370v4.C6528f.f25362v
            int r2 = r2.length
            r0.f25371i = r2
            r7 = 0
            r0.f25380r = r7
            v5.u r2 = r0.f25365c
            r2.m13396F(r7)
        L2cb:
            r1.m13396F(r13)
            goto Lb
        L2d0:
            r3 = 2
            r7 = 0
            r15 = 1024(0x400, float:1.435E-42)
            goto L2de
        L2d5:
            r3 = 2
            r7 = 0
            r15 = 512(0x200, float:7.17E-43)
            goto L2de
        L2da:
            r3 = 2
            r7 = 0
            r15 = 768(0x300, float:1.076E-42)
        L2de:
            r0.f25372j = r15
        L2e0:
            r11 = r13
        L2e1:
            r3 = 13
            r9 = 2
            goto L1a5
        L2e6:
            r1.m13396F(r11)
            goto Lb
        L2eb:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r3, p370v4.InterfaceC6525d0.d r4) {
            r2 = this;
            r4.m13253a()
            java.lang.String r0 = r4.m13254b()
            r2.f25367e = r0
            int r0 = r4.m13255c()
            r1 = 1
            m4.z r0 = r3.mo6048l(r0, r1)
            r2.f25368f = r0
            r2.f25382t = r0
            boolean r0 = r2.f25363a
            if (r0 == 0) goto L3f
            r4.m13253a()
            int r0 = r4.m13255c()
            r1 = 5
            m4.z r3 = r3.mo6048l(r0, r1)
            r2.f25369g = r3
            f4.e0$b r0 = new f4.e0$b
            r0.<init>()
            java.lang.String r4 = r4.m13254b()
            r0.f8917a = r4
            java.lang.String r4 = "application/id3"
            r0.f8927k = r4
            f4.e0 r4 = r0.m5193a()
            r3.mo5973e(r4)
            goto L46
        L3f:
            m4.h r3 = new m4.h
            r3.<init>()
            r2.f25369g = r3
        L46:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: e */
    public void mo13244e() {
            r0 = this;
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: f */
    public void mo13245f(long r3, int r5) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto Lb
            r2.f25381s = r3
        Lb:
            return
    }

    /* renamed from: h */
    public final void m13261h() {
            r1 = this;
            r0 = 0
            r1.f25370h = r0
            r1.f25371i = r0
            r0 = 256(0x100, float:3.59E-43)
            r1.f25372j = r0
            return
    }

    /* renamed from: i */
    public final boolean m13262i(p371v5.C6571u r4, byte[] r5, int r6) {
            r3 = this;
            int r0 = r4.m13398a()
            r1 = 0
            if (r0 >= r6) goto L8
            return r1
        L8:
            byte[] r0 = r4.f25710a
            int r2 = r4.f25711b
            java.lang.System.arraycopy(r0, r2, r5, r1, r6)
            int r5 = r4.f25711b
            int r5 = r5 + r6
            r4.f25711b = r5
            r4 = 1
            return r4
    }
}
