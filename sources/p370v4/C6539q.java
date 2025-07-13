package p370v4;

/* renamed from: v4.q */
/* loaded from: classes.dex */
public final class C6539q implements p370v4.InterfaceC6532j {

    /* renamed from: a */
    public final p371v5.C6571u f25554a;

    /* renamed from: b */
    public final p121h4.C2485z.a f25555b;

    /* renamed from: c */
    public final java.lang.String f25556c;

    /* renamed from: d */
    public p216m4.InterfaceC4381z f25557d;

    /* renamed from: e */
    public java.lang.String f25558e;

    /* renamed from: f */
    public int f25559f;

    /* renamed from: g */
    public int f25560g;

    /* renamed from: h */
    public boolean f25561h;

    /* renamed from: i */
    public boolean f25562i;

    /* renamed from: j */
    public long f25563j;

    /* renamed from: k */
    public int f25564k;

    /* renamed from: l */
    public long f25565l;

    public C6539q(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f25559f = r0
            v5.u r1 = new v5.u
            r2 = 4
            r1.<init>(r2)
            r3.f25554a = r1
            byte[] r1 = r1.f25710a
            r2 = -1
            r1[r0] = r2
            h4.z$a r0 = new h4.z$a
            r0.<init>()
            r3.f25555b = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f25565l = r0
            r3.f25556c = r4
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r2 = this;
            r0 = 0
            r2.f25559f = r0
            r2.f25560g = r0
            r2.f25562i = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25565l = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r11) {
            r10 = this;
            m4.z r0 = r10.f25557d
            p371v5.C6549a.m13292f(r0)
        L5:
            int r0 = r11.m13398a()
            if (r0 <= 0) goto L11d
            int r0 = r10.f25559f
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto Ldc
            if (r0 == r3) goto L57
            if (r0 != r1) goto L51
            int r0 = r11.m13398a()
            int r1 = r10.f25564k
            int r3 = r10.f25560g
            int r1 = r1 - r3
            int r0 = java.lang.Math.min(r0, r1)
            m4.z r1 = r10.f25557d
            r1.mo5972d(r11, r0)
            int r1 = r10.f25560g
            int r1 = r1 + r0
            r10.f25560g = r1
            int r7 = r10.f25564k
            if (r1 >= r7) goto L32
            goto L5
        L32:
            long r4 = r10.f25565l
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L4c
            m4.z r3 = r10.f25557d
            r6 = 1
            r8 = 0
            r9 = 0
            r3.mo5971c(r4, r6, r7, r8, r9)
            long r0 = r10.f25565l
            long r3 = r10.f25563j
            long r0 = r0 + r3
            r10.f25565l = r0
        L4c:
            r10.f25560g = r2
            r10.f25559f = r2
            goto L5
        L51:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        L57:
            int r0 = r11.m13398a()
            int r4 = r10.f25560g
            r5 = 4
            int r4 = 4 - r4
            int r0 = java.lang.Math.min(r0, r4)
            v5.u r4 = r10.f25554a
            byte[] r4 = r4.f25710a
            int r6 = r10.f25560g
            r11.m13402e(r4, r6, r0)
            int r4 = r10.f25560g
            int r4 = r4 + r0
            r10.f25560g = r4
            if (r4 >= r5) goto L75
            goto L5
        L75:
            v5.u r0 = r10.f25554a
            r0.m13396F(r2)
            h4.z$a r0 = r10.f25555b
            v5.u r4 = r10.f25554a
            int r4 = r4.m13403f()
            boolean r0 = r0.m6357a(r4)
            if (r0 != 0) goto L8e
            r10.f25560g = r2
            r10.f25559f = r3
            goto L5
        L8e:
            h4.z$a r0 = r10.f25555b
            int r4 = r0.f11226c
            r10.f25564k = r4
            boolean r4 = r10.f25561h
            if (r4 != 0) goto Lcc
            r6 = 1000000(0xf4240, double:4.940656E-318)
            int r4 = r0.f11230g
            long r8 = (long) r4
            long r8 = r8 * r6
            int r4 = r0.f11227d
            long r6 = (long) r4
            long r8 = r8 / r6
            r10.f25563j = r8
            f4.e0$b r6 = new f4.e0$b
            r6.<init>()
            java.lang.String r7 = r10.f25558e
            r6.f8917a = r7
            java.lang.String r7 = r0.f11225b
            r6.f8927k = r7
            r7 = 4096(0x1000, float:5.74E-42)
            r6.f8928l = r7
            int r0 = r0.f11228e
            r6.f8940x = r0
            r6.f8941y = r4
            java.lang.String r0 = r10.f25556c
            r6.f8919c = r0
            f4.e0 r0 = r6.m5193a()
            m4.z r4 = r10.f25557d
            r4.mo5973e(r0)
            r10.f25561h = r3
        Lcc:
            v5.u r0 = r10.f25554a
            r0.m13396F(r2)
            m4.z r0 = r10.f25557d
            v5.u r2 = r10.f25554a
            r0.mo5972d(r2, r5)
            r10.f25559f = r1
            goto L5
        Ldc:
            byte[] r0 = r11.f25710a
            int r4 = r11.f25711b
            int r5 = r11.f25712c
        Le2:
            if (r4 >= r5) goto L118
            r6 = r0[r4]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto Led
            r6 = 1
            goto Lee
        Led:
            r6 = 0
        Lee:
            boolean r7 = r10.f25562i
            if (r7 == 0) goto Lfb
            r7 = r0[r4]
            r8 = 224(0xe0, float:3.14E-43)
            r7 = r7 & r8
            if (r7 != r8) goto Lfb
            r7 = 1
            goto Lfc
        Lfb:
            r7 = 0
        Lfc:
            r10.f25562i = r6
            if (r7 == 0) goto L115
            int r5 = r4 + 1
            r11.m13396F(r5)
            r10.f25562i = r2
            v5.u r2 = r10.f25554a
            byte[] r2 = r2.f25710a
            r0 = r0[r4]
            r2[r3] = r0
            r10.f25560g = r1
            r10.f25559f = r3
            goto L5
        L115:
            int r4 = r4 + 1
            goto Le2
        L118:
            r11.m13396F(r5)
            goto L5
        L11d:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r2, p370v4.InterfaceC6525d0.d r3) {
            r1 = this;
            r3.m13253a()
            java.lang.String r0 = r3.m13254b()
            r1.f25558e = r0
            int r3 = r3.m13255c()
            r0 = 1
            m4.z r2 = r2.mo6048l(r3, r0)
            r1.f25557d = r2
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
            r2.f25565l = r3
        Lb:
            return
    }
}
