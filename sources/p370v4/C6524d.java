package p370v4;

/* renamed from: v4.d */
/* loaded from: classes.dex */
public final class C6524d implements p370v4.InterfaceC6532j {

    /* renamed from: a */
    public final p216m4.C4355b0 f25325a;

    /* renamed from: b */
    public final p371v5.C6571u f25326b;

    /* renamed from: c */
    public final java.lang.String f25327c;

    /* renamed from: d */
    public java.lang.String f25328d;

    /* renamed from: e */
    public p216m4.InterfaceC4381z f25329e;

    /* renamed from: f */
    public int f25330f;

    /* renamed from: g */
    public int f25331g;

    /* renamed from: h */
    public boolean f25332h;

    /* renamed from: i */
    public boolean f25333i;

    /* renamed from: j */
    public long f25334j;

    /* renamed from: k */
    public p088f4.C2003e0 f25335k;

    /* renamed from: l */
    public int f25336l;

    /* renamed from: m */
    public long f25337m;

    public C6524d(java.lang.String r5) {
            r4 = this;
            r4.<init>()
            m4.b0 r0 = new m4.b0
            r1 = 16
            byte[] r1 = new byte[r1]
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.f25325a = r0
            v5.u r1 = new v5.u
            java.lang.Object r0 = r0.f17870b
            byte[] r0 = (byte[]) r0
            r1.<init>(r0)
            r4.f25326b = r1
            r0 = 0
            r4.f25330f = r0
            r4.f25331g = r0
            r4.f25332h = r0
            r4.f25333i = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.f25337m = r0
            r4.f25327c = r5
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r2 = this;
            r0 = 0
            r2.f25330f = r0
            r2.f25331g = r0
            r2.f25332h = r0
            r2.f25333i = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25337m = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r11) {
            r10 = this;
            m4.z r0 = r10.f25329e
            p371v5.C6549a.m13292f(r0)
        L5:
            int r0 = r11.m13398a()
            if (r0 <= 0) goto L130
            int r0 = r10.f25330f
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto Le1
            if (r0 == r3) goto L4f
            if (r0 == r1) goto L17
            goto L5
        L17:
            int r0 = r11.m13398a()
            int r1 = r10.f25336l
            int r3 = r10.f25331g
            int r1 = r1 - r3
            int r0 = java.lang.Math.min(r0, r1)
            m4.z r1 = r10.f25329e
            r1.mo5972d(r11, r0)
            int r1 = r10.f25331g
            int r1 = r1 + r0
            r10.f25331g = r1
            int r7 = r10.f25336l
            if (r1 != r7) goto L5
            long r4 = r10.f25337m
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L4c
            m4.z r3 = r10.f25329e
            r6 = 1
            r8 = 0
            r9 = 0
            r3.mo5971c(r4, r6, r7, r8, r9)
            long r0 = r10.f25337m
            long r3 = r10.f25334j
            long r0 = r0 + r3
            r10.f25337m = r0
        L4c:
            r10.f25330f = r2
            goto L5
        L4f:
            v5.u r0 = r10.f25326b
            byte[] r0 = r0.f25710a
            int r4 = r11.m13398a()
            int r5 = r10.f25331g
            r6 = 16
            int r5 = 16 - r5
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r10.f25331g
            byte[] r7 = r11.f25710a
            int r8 = r11.f25711b
            java.lang.System.arraycopy(r7, r8, r0, r5, r4)
            int r0 = r11.f25711b
            int r0 = r0 + r4
            r11.f25711b = r0
            int r0 = r10.f25331g
            int r0 = r0 + r4
            r10.f25331g = r0
            if (r0 != r6) goto L77
            goto L78
        L77:
            r3 = 0
        L78:
            if (r3 == 0) goto L5
            m4.b0 r0 = r10.f25325a
            r0.m9772q(r2)
            m4.b0 r0 = r10.f25325a
            h4.c$b r0 = p121h4.C2459c.m6248b(r0)
            f4.e0 r3 = r10.f25335k
            java.lang.String r4 = "audio/ac4"
            if (r3 == 0) goto L9d
            int r5 = r3.f8909w0
            if (r1 != r5) goto L9d
            int r5 = r0.f10978a
            int r7 = r3.f8910x0
            if (r5 != r7) goto L9d
            java.lang.String r3 = r3.f8896j0
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto Lbd
        L9d:
            f4.e0$b r3 = new f4.e0$b
            r3.<init>()
            java.lang.String r5 = r10.f25328d
            r3.f8917a = r5
            r3.f8927k = r4
            r3.f8940x = r1
            int r4 = r0.f10978a
            r3.f8941y = r4
            java.lang.String r4 = r10.f25327c
            r3.f8919c = r4
            f4.e0 r3 = r3.m5193a()
            r10.f25335k = r3
            m4.z r4 = r10.f25329e
            r4.mo5973e(r3)
        Lbd:
            int r3 = r0.f10979b
            r10.f25336l = r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = r0.f10980c
            long r7 = (long) r0
            long r7 = r7 * r3
            f4.e0 r0 = r10.f25335k
            int r0 = r0.f8910x0
            long r3 = (long) r0
            long r7 = r7 / r3
            r10.f25334j = r7
            v5.u r0 = r10.f25326b
            r0.m13396F(r2)
            m4.z r0 = r10.f25329e
            v5.u r2 = r10.f25326b
            r0.mo5972d(r2, r6)
            r10.f25330f = r1
            goto L5
        Le1:
            int r0 = r11.m13398a()
            r4 = 65
            r5 = 64
            if (r0 <= 0) goto L115
            boolean r0 = r10.f25332h
            r6 = 172(0xac, float:2.41E-43)
            if (r0 != 0) goto Lfd
            int r0 = r11.m13418u()
            if (r0 != r6) goto Lf9
            r0 = 1
            goto Lfa
        Lf9:
            r0 = 0
        Lfa:
            r10.f25332h = r0
            goto Le1
        Lfd:
            int r0 = r11.m13418u()
            if (r0 != r6) goto L105
            r6 = 1
            goto L106
        L105:
            r6 = 0
        L106:
            r10.f25332h = r6
            if (r0 == r5) goto L10c
            if (r0 != r4) goto Le1
        L10c:
            if (r0 != r4) goto L110
            r0 = 1
            goto L111
        L110:
            r0 = 0
        L111:
            r10.f25333i = r0
            r0 = 1
            goto L116
        L115:
            r0 = 0
        L116:
            if (r0 == 0) goto L5
            r10.f25330f = r3
            v5.u r0 = r10.f25326b
            byte[] r0 = r0.f25710a
            r6 = -84
            r0[r2] = r6
            boolean r2 = r10.f25333i
            if (r2 == 0) goto L127
            goto L129
        L127:
            r4 = 64
        L129:
            byte r2 = (byte) r4
            r0[r3] = r2
            r10.f25331g = r1
            goto L5
        L130:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r2, p370v4.InterfaceC6525d0.d r3) {
            r1 = this;
            r3.m13253a()
            java.lang.String r0 = r3.m13254b()
            r1.f25328d = r0
            int r3 = r3.m13255c()
            r0 = 1
            m4.z r2 = r2.mo6048l(r3, r0)
            r1.f25329e = r2
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
            r2.f25337m = r3
        Lb:
            return
    }
}
