package p370v4;

/* renamed from: v4.c */
/* loaded from: classes.dex */
public final class C6522c implements p216m4.InterfaceC4364i {

    /* renamed from: a */
    public final p370v4.C6524d f25296a;

    /* renamed from: b */
    public final p371v5.C6571u f25297b;

    /* renamed from: c */
    public boolean f25298c;

    static {
            k1.d r0 = p179k1.C3646d.f16122k0
            return
    }

    public C6522c() {
            r2 = this;
            r2.<init>()
            v4.d r0 = new v4.d
            r1 = 0
            r0.<init>(r1)
            r2.f25296a = r0
            v5.u r0 = new v5.u
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2.f25297b = r0
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r1, long r3) {
            r0 = this;
            r1 = 0
            r0.f25298c = r1
            v4.d r1 = r0.f25296a
            r1.mo13241a()
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r6) {
            r5 = this;
            v4.d r0 = r5.f25296a
            java.lang.String r1 = ""
            int r2 = r1.length()
            int r2 = r2 + 11
            r3 = 0
            java.lang.String r1 = p064e.C1490d.m4039a(r2, r1, r3)
            r0.f25328d = r1
            r1 = 1
            m4.z r1 = r6.mo6048l(r3, r1)
            r0.f25329e = r1
            r6.mo6043b()
            m4.w$b r0 = new m4.w$b
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r0.<init>(r1, r3)
            r6.mo6044c(r0)
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r15) {
            r14 = this;
            v5.u r0 = new v5.u
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f25710a
            r15.mo9795o(r4, r2, r1)
            r0.m13396F(r2)
            int r4 = r0.m13420w()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L8e
            r15.mo9790h()
            r15.mo9796p(r3)
            r4 = r3
        L22:
            r1 = 0
        L23:
            byte[] r5 = r0.f25710a
            r7 = 7
            r15.mo9795o(r5, r2, r7)
            r0.m13396F(r2)
            int r5 = r0.m13423z()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L4a
            if (r5 == r9) goto L4a
            r15.mo9790h()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L46
            return r2
        L46:
            r15.mo9796p(r4)
            goto L22
        L4a:
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 < r10) goto L50
            return r8
        L50:
            byte[] r8 = r0.f25710a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L58
            r11 = -1
            goto L85
        L58:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L7f
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L80
        L7f:
            r7 = 4
        L80:
            if (r5 != r9) goto L84
            int r7 = r7 + 2
        L84:
            int r11 = r11 + r7
        L85:
            if (r11 != r12) goto L88
            return r2
        L88:
            int r11 = r11 + (-7)
            r15.mo9796p(r11)
            goto L23
        L8e:
            r0.m13397G(r6)
            int r4 = r0.m13417t()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.mo9796p(r4)
            goto L9
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r5, p216m4.C4377v r6) {
            r4 = this;
            v5.u r6 = r4.f25297b
            byte[] r6 = r6.f25710a
            r0 = 16384(0x4000, float:2.2959E-41)
            r1 = 0
            int r5 = r5.mo6020b(r6, r1, r0)
            r6 = -1
            if (r5 != r6) goto Lf
            return r6
        Lf:
            v5.u r6 = r4.f25297b
            r6.m13396F(r1)
            v5.u r6 = r4.f25297b
            r6.m13395E(r5)
            boolean r5 = r4.f25298c
            if (r5 != 0) goto L28
            v4.d r5 = r4.f25296a
            r2 = 0
            r6 = 4
            r5.mo13245f(r2, r6)
            r5 = 1
            r4.f25298c = r5
        L28:
            v4.d r5 = r4.f25296a
            v5.u r6 = r4.f25297b
            r5.mo13242c(r6)
            return r1
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r0 = this;
            return
    }
}
