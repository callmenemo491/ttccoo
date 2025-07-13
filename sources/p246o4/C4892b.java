package p246o4;

/* renamed from: o4.b */
/* loaded from: classes.dex */
public final class C4892b implements p216m4.InterfaceC4364i {

    /* renamed from: a */
    public final byte[] f19389a;

    /* renamed from: b */
    public final p371v5.C6571u f19390b;

    /* renamed from: c */
    public final boolean f19391c;

    /* renamed from: d */
    public final p216m4.C4370o.a f19392d;

    /* renamed from: e */
    public p216m4.InterfaceC4366k f19393e;

    /* renamed from: f */
    public p216m4.InterfaceC4381z f19394f;

    /* renamed from: g */
    public int f19395g;

    /* renamed from: h */
    public p427y4.C7110a f19396h;

    /* renamed from: i */
    public p216m4.C4373r f19397i;

    /* renamed from: j */
    public int f19398j;

    /* renamed from: k */
    public int f19399k;

    /* renamed from: l */
    public p246o4.C4891a f19400l;

    /* renamed from: m */
    public int f19401m;

    /* renamed from: n */
    public long f19402n;

    static {
            k1.b r0 = p179k1.C3642b.f16061j0
            return
    }

    public C4892b(int r4) {
            r3 = this;
            r3.<init>()
            r0 = 42
            byte[] r0 = new byte[r0]
            r3.f19389a = r0
            v5.u r0 = new v5.u
            r1 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = new byte[r1]
            r2 = 0
            r0.<init>(r1, r2)
            r3.f19390b = r0
            r0 = 1
            r4 = r4 & r0
            if (r4 == 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r3.f19391c = r0
            m4.o$a r4 = new m4.o$a
            r4.<init>()
            r3.f19392d = r4
            r3.f19395g = r2
            return
    }

    /* renamed from: a */
    public final void m11031a() {
            r11 = this;
            long r0 = r11.f19402n
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            m4.r r2 = r11.f19397i
            int r3 = p371v5.C6552b0.f25624a
            int r2 = r2.f17916e
            long r2 = (long) r2
            long r5 = r0 / r2
            m4.z r4 = r11.f19394f
            r7 = 1
            int r8 = r11.f19401m
            r9 = 0
            r10 = 0
            r4.mo5971c(r5, r7, r8, r9, r10)
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r5, long r7) {
            r4 = this;
            r0 = 0
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto La
            r4.f19395g = r0
            goto L11
        La:
            o4.a r5 = r4.f19400l
            if (r5 == 0) goto L11
            r5.m9740e(r7)
        L11:
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 != 0) goto L16
            goto L18
        L16:
            r1 = -1
        L18:
            r4.f19402n = r1
            r4.f19401m = r0
            v5.u r5 = r4.f19390b
            r5.m13392B(r0)
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r3) {
            r2 = this;
            r2.f19393e = r3
            r0 = 0
            r1 = 1
            m4.z r0 = r3.mo6048l(r0, r1)
            r2.f19394f = r0
            r3.mo6043b()
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r11) {
            r10 = this;
            r0 = 0
            p216m4.C4371p.m9816a(r11, r0)
            r1 = 4
            byte[] r2 = new byte[r1]
            r11.mo9795o(r2, r0, r1)
            r11 = r2[r0]
            long r3 = (long) r11
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            r11 = 24
            long r3 = r3 << r11
            r11 = 2
            r1 = 1
            r7 = r2[r1]
            long r7 = (long) r7
            long r7 = r7 & r5
            r9 = 16
            long r7 = r7 << r9
            long r3 = r3 | r7
            r7 = 3
            r11 = r2[r11]
            long r8 = (long) r11
            long r8 = r8 & r5
            r11 = 8
            long r8 = r8 << r11
            long r3 = r3 | r8
            r11 = r2[r7]
            long r7 = (long) r11
            long r5 = r5 & r7
            long r2 = r3 | r5
            r4 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L34
            r0 = 1
        L34:
            return r0
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r27, p216m4.C4377v r28) {
            r26 = this;
            r0 = r26
            r1 = r27
            int r2 = r0.f19395g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L382
            r5 = 2
            if (r2 == r3) goto L376
            r6 = 8
            r7 = 16
            r8 = 24
            r9 = 4
            r10 = 3
            r11 = 0
            if (r2 == r5) goto L341
            r12 = 7
            r13 = 6
            if (r2 == r10) goto L1e0
            r14 = 0
            r16 = -1
            r8 = 5
            if (r2 == r9) goto L172
            if (r2 != r8) goto L16c
            m4.z r2 = r0.f19394f
            java.util.Objects.requireNonNull(r2)
            m4.r r2 = r0.f19397i
            java.util.Objects.requireNonNull(r2)
            o4.a r2 = r0.f19400l
            if (r2 == 0) goto L43
            boolean r2 = r2.m9737b()
            if (r2 == 0) goto L43
            o4.a r2 = r0.f19400l
            r3 = r28
            int r4 = r2.m9736a(r1, r3)
            goto L16b
        L43:
            long r8 = r0.f19402n
            int r2 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r2 != 0) goto L90
            m4.r r2 = r0.f19397i
            r27.mo9790h()
            r1.mo9796p(r3)
            byte[] r6 = new byte[r3]
            r1.mo9795o(r6, r4, r3)
            r6 = r6[r4]
            r6 = r6 & r3
            if (r6 != r3) goto L5d
            r6 = 1
            goto L5e
        L5d:
            r6 = 0
        L5e:
            r1.mo9796p(r5)
            if (r6 == 0) goto L64
            goto L65
        L64:
            r12 = 6
        L65:
            v5.u r5 = new v5.u
            r5.<init>(r12)
            byte[] r7 = r5.f25710a
            int r7 = p216m4.C4367l.m9809c(r1, r7, r4, r12)
            r5.m13395E(r7)
            r27.mo9790h()
            long r7 = r5.m13391A()     // Catch: java.lang.NumberFormatException -> L84
            if (r6 == 0) goto L7d
            goto L82
        L7d:
            int r1 = r2.f17913b
            long r1 = (long) r1
            long r7 = r7 * r1
        L82:
            r14 = r7
            goto L85
        L84:
            r3 = 0
        L85:
            if (r3 == 0) goto L8b
            r0.f19402n = r14
            goto L16b
        L8b:
            f4.s0 r1 = p088f4.C2044s0.m5407a(r11, r11)
            throw r1
        L90:
            v5.u r2 = r0.f19390b
            int r5 = r2.f25712c
            r6 = 32768(0x8000, float:4.5918E-41)
            if (r5 >= r6) goto Lbc
            byte[] r2 = r2.f25710a
            int r6 = r6 - r5
            int r1 = r1.mo6020b(r2, r5, r6)
            r2 = -1
            if (r1 != r2) goto La4
            goto La5
        La4:
            r3 = 0
        La5:
            if (r3 != 0) goto Lae
            v5.u r2 = r0.f19390b
            int r5 = r5 + r1
            r2.m13395E(r5)
            goto Lbd
        Lae:
            v5.u r1 = r0.f19390b
            int r1 = r1.m13398a()
            if (r1 != 0) goto Lbd
            r26.m11031a()
            r4 = -1
            goto L16b
        Lbc:
            r3 = 0
        Lbd:
            v5.u r1 = r0.f19390b
            int r2 = r1.f25711b
            int r5 = r0.f19401m
            int r6 = r0.f19398j
            if (r5 >= r6) goto Ld3
            int r6 = r6 - r5
            int r5 = r1.m13398a()
            int r5 = java.lang.Math.min(r6, r5)
            r1.m13397G(r5)
        Ld3:
            v5.u r1 = r0.f19390b
            m4.r r5 = r0.f19397i
            java.util.Objects.requireNonNull(r5)
            int r5 = r1.f25711b
        Ldc:
            int r6 = r1.f25712c
            int r6 = r6 + (-16)
            if (r5 > r6) goto Lf5
            r1.m13396F(r5)
            m4.r r6 = r0.f19397i
            int r8 = r0.f19399k
            m4.o$a r9 = r0.f19392d
            boolean r6 = p216m4.C4370o.m9814b(r1, r6, r8, r9)
            if (r6 == 0) goto Lf2
            goto L117
        Lf2:
            int r5 = r5 + 1
            goto Ldc
        Lf5:
            if (r3 == 0) goto L126
        Lf7:
            int r3 = r1.f25712c
            int r6 = r0.f19398j
            int r6 = r3 - r6
            if (r5 > r6) goto L122
            r1.m13396F(r5)
            m4.r r3 = r0.f19397i     // Catch: java.lang.IndexOutOfBoundsException -> L10d
            int r6 = r0.f19399k     // Catch: java.lang.IndexOutOfBoundsException -> L10d
            m4.o$a r8 = r0.f19392d     // Catch: java.lang.IndexOutOfBoundsException -> L10d
            boolean r3 = p216m4.C4370o.m9814b(r1, r3, r6, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L10d
            goto L10e
        L10d:
            r3 = 0
        L10e:
            int r6 = r1.f25711b
            int r8 = r1.f25712c
            if (r6 <= r8) goto L115
            r3 = 0
        L115:
            if (r3 == 0) goto L11f
        L117:
            r1.m13396F(r5)
            m4.o$a r1 = r0.f19392d
            long r5 = r1.f17909a
            goto L12b
        L11f:
            int r5 = r5 + 1
            goto Lf7
        L122:
            r1.m13396F(r3)
            goto L129
        L126:
            r1.m13396F(r5)
        L129:
            r5 = r16
        L12b:
            v5.u r1 = r0.f19390b
            int r3 = r1.f25711b
            int r3 = r3 - r2
            r1.m13396F(r2)
            m4.z r1 = r0.f19394f
            v5.u r2 = r0.f19390b
            r1.mo5972d(r2, r3)
            int r1 = r0.f19401m
            int r1 = r1 + r3
            r0.f19401m = r1
            int r1 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r1 == 0) goto L14a
            r26.m11031a()
            r0.f19401m = r4
            r0.f19402n = r5
        L14a:
            v5.u r1 = r0.f19390b
            int r1 = r1.m13398a()
            if (r1 >= r7) goto L16b
            v5.u r1 = r0.f19390b
            int r1 = r1.m13398a()
            v5.u r2 = r0.f19390b
            byte[] r3 = r2.f25710a
            int r2 = r2.f25711b
            java.lang.System.arraycopy(r3, r2, r3, r4, r1)
            v5.u r2 = r0.f19390b
            r2.m13396F(r4)
            v5.u r2 = r0.f19390b
            r2.m13395E(r1)
        L16b:
            return r4
        L16c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L172:
            r27.mo9790h()
            byte[] r2 = new byte[r5]
            r1.mo9795o(r2, r4, r5)
            r5 = r2[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r6
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r5
            int r3 = r2 >> 2
            r5 = 16382(0x3ffe, float:2.2956E-41)
            r27.mo9790h()
            if (r3 != r5) goto L1d9
            r0.f19399k = r2
            m4.k r2 = r0.f19393e
            int r3 = p371v5.C6552b0.f25624a
            long r5 = r27.mo9797q()
            long r23 = r27.mo9786a()
            m4.r r1 = r0.f19397i
            java.util.Objects.requireNonNull(r1)
            m4.r r1 = r0.f19397i
            m4.r$a r3 = r1.f17922k
            if (r3 == 0) goto L1ac
            m4.q r3 = new m4.q
            r3.<init>(r1, r5)
            goto L1d3
        L1ac:
            int r3 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r3 == 0) goto L1ca
            long r9 = r1.f17921j
            int r3 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r3 <= 0) goto L1ca
            o4.a r3 = new o4.a
            int r7 = r0.f19399k
            r18 = r3
            r19 = r1
            r20 = r7
            r21 = r5
            r18.<init>(r19, r20, r21, r23)
            r0.f19400l = r3
            m4.a$a r3 = r3.f17839a
            goto L1d3
        L1ca:
            m4.w$b r3 = new m4.w$b
            long r5 = r1.m9823d()
            r3.<init>(r5, r14)
        L1d3:
            r2.mo6044c(r3)
            r0.f19395g = r8
            return r4
        L1d9:
            java.lang.String r1 = "First frame does not start with sync code."
            f4.s0 r1 = p088f4.C2044s0.m5407a(r1, r11)
            throw r1
        L1e0:
            m4.r r2 = r0.f19397i
            r5 = 0
        L1e3:
            if (r5 != 0) goto L31c
            r27.mo9790h()
            m4.b0 r5 = new m4.b0
            byte[] r6 = new byte[r9]
            r5.<init>(r6, r3, r11)
            java.lang.Object r6 = r5.f17870b
            byte[] r6 = (byte[]) r6
            r1.mo9795o(r6, r4, r9)
            boolean r6 = r5.m9765j()
            int r7 = r5.m9766k(r12)
            int r5 = r5.m9766k(r8)
            int r5 = r5 + r9
            if (r7 != 0) goto L213
            r2 = 38
            byte[] r5 = new byte[r2]
            r1.readFully(r5, r4, r2)
            m4.r r2 = new m4.r
            r2.<init>(r5, r9)
            goto L307
        L213:
            if (r2 == 0) goto L316
            if (r7 != r10) goto L22b
            v5.u r7 = new v5.u
            r7.<init>(r5)
            byte[] r14 = r7.f25710a
            r1.readFully(r14, r4, r5)
            m4.r$a r5 = p216m4.C4371p.m9817b(r7)
            m4.r r2 = r2.m9822b(r5)
            goto L307
        L22b:
            if (r7 != r9) goto L27a
            v5.u r7 = new v5.u
            r7.<init>(r5)
            byte[] r14 = r7.f25710a
            r1.readFully(r14, r4, r5)
            r7.m13397G(r9)
            m4.d0$a r5 = p216m4.C4359d0.m9782b(r7, r4, r4)
            java.lang.String[] r5 = r5.f17880a
            java.util.List r5 = java.util.Arrays.asList(r5)
            java.util.List r7 = java.util.Collections.emptyList()
            y4.a r5 = p216m4.C4373r.m9819a(r5, r7)
            y4.a r25 = r2.m9825f(r5)
            m4.r r5 = new m4.r
            int r15 = r2.f17912a
            int r7 = r2.f17913b
            int r14 = r2.f17914c
            int r12 = r2.f17915d
            int r11 = r2.f17916e
            int r10 = r2.f17918g
            int r3 = r2.f17919h
            long r8 = r2.f17921j
            m4.r$a r2 = r2.f17922k
            r17 = r14
            r14 = r5
            r16 = r7
            r18 = r12
            r19 = r11
            r20 = r10
            r21 = r3
            r22 = r8
            r24 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r24, r25)
            goto L302
        L27a:
            if (r7 != r13) goto L304
            v5.u r3 = new v5.u
            r3.<init>(r5)
            byte[] r7 = r3.f25710a
            r1.readFully(r7, r4, r5)
            r5 = 4
            r3.m13397G(r5)
            int r15 = r3.m13403f()
            int r5 = r3.m13403f()
            java.nio.charset.Charset r7 = p010a9.C0035c.f80a
            java.lang.String r16 = r3.m13416s(r5, r7)
            int r5 = r3.m13403f()
            java.lang.String r17 = r3.m13415r(r5)
            int r18 = r3.m13403f()
            int r19 = r3.m13403f()
            int r20 = r3.m13403f()
            int r21 = r3.m13403f()
            int r5 = r3.m13403f()
            byte[] r7 = new byte[r5]
            byte[] r8 = r3.f25710a
            int r9 = r3.f25711b
            java.lang.System.arraycopy(r8, r9, r7, r4, r5)
            int r8 = r3.f25711b
            int r8 = r8 + r5
            r3.f25711b = r8
            b5.a r3 = new b5.a
            r14 = r3
            r22 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            java.util.List r5 = java.util.Collections.emptyList()
            y4.a r3 = p216m4.C4373r.m9819a(r5, r3)
            y4.a r25 = r2.m9825f(r3)
            m4.r r5 = new m4.r
            int r15 = r2.f17912a
            int r3 = r2.f17913b
            int r7 = r2.f17914c
            int r8 = r2.f17915d
            int r9 = r2.f17916e
            int r10 = r2.f17918g
            int r11 = r2.f17919h
            long r12 = r2.f17921j
            m4.r$a r2 = r2.f17922k
            r14 = r5
            r16 = r3
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r10
            r21 = r11
            r22 = r12
            r24 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r24, r25)
        L302:
            r2 = r5
            goto L307
        L304:
            r1.mo9791i(r5)
        L307:
            int r3 = p371v5.C6552b0.f25624a
            r0.f19397i = r2
            r5 = r6
            r3 = 1
            r8 = 24
            r9 = 4
            r10 = 3
            r11 = 0
            r12 = 7
            r13 = 6
            goto L1e3
        L316:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L31c:
            m4.r r1 = r0.f19397i
            java.util.Objects.requireNonNull(r1)
            m4.r r1 = r0.f19397i
            int r1 = r1.f17914c
            r2 = 6
            int r1 = java.lang.Math.max(r1, r2)
            r0.f19398j = r1
            m4.z r1 = r0.f19394f
            int r2 = p371v5.C6552b0.f25624a
            m4.r r2 = r0.f19397i
            byte[] r3 = r0.f19389a
            y4.a r5 = r0.f19396h
            f4.e0 r2 = r2.m9824e(r3, r5)
            r1.mo5973e(r2)
            r2 = 4
            r0.f19395g = r2
            return r4
        L341:
            r2 = 4
            byte[] r3 = new byte[r2]
            r1.readFully(r3, r4, r2)
            r1 = r3[r4]
            long r1 = (long) r1
            r8 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r8
            r10 = 24
            long r1 = r1 << r10
            r10 = 1
            r10 = r3[r10]
            long r10 = (long) r10
            long r10 = r10 & r8
            long r10 = r10 << r7
            long r1 = r1 | r10
            r5 = r3[r5]
            long r10 = (long) r5
            long r10 = r10 & r8
            long r5 = r10 << r6
            long r1 = r1 | r5
            r5 = 3
            r3 = r3[r5]
            long r6 = (long) r3
            long r6 = r6 & r8
            long r1 = r1 | r6
            r6 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L36e
            r0.f19395g = r5
            return r4
        L36e:
            java.lang.String r1 = "Failed to read FLAC stream marker."
            r2 = 0
            f4.s0 r1 = p088f4.C2044s0.m5407a(r1, r2)
            throw r1
        L376:
            byte[] r2 = r0.f19389a
            int r3 = r2.length
            r1.mo9795o(r2, r4, r3)
            r27.mo9790h()
            r0.f19395g = r5
            return r4
        L382:
            boolean r2 = r0.f19391c
            r3 = 1
            r2 = r2 ^ r3
            r27.mo9790h()
            long r5 = r27.mo9794n()
            y4.a r2 = p216m4.C4371p.m9816a(r1, r2)
            long r7 = r27.mo9794n()
            long r7 = r7 - r5
            int r5 = (int) r7
            r1.mo9791i(r5)
            r0.f19396h = r2
            r0.f19395g = r3
            return r4
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r0 = this;
            return
    }
}
