package p370v4;

/* renamed from: v4.i */
/* loaded from: classes.dex */
public final class C6531i implements p370v4.InterfaceC6532j {

    /* renamed from: a */
    public final java.util.List<p370v4.InterfaceC6525d0.a> f25397a;

    /* renamed from: b */
    public final p216m4.InterfaceC4381z[] f25398b;

    /* renamed from: c */
    public boolean f25399c;

    /* renamed from: d */
    public int f25400d;

    /* renamed from: e */
    public int f25401e;

    /* renamed from: f */
    public long f25402f;

    public C6531i(java.util.List<p370v4.InterfaceC6525d0.a> r3) {
            r2 = this;
            r2.<init>()
            r2.f25397a = r3
            int r3 = r3.size()
            m4.z[] r3 = new p216m4.InterfaceC4381z[r3]
            r2.f25398b = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25402f = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r2 = this;
            r0 = 0
            r2.f25399c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25402f = r0
            return
    }

    /* renamed from: b */
    public final boolean m13266b(p371v5.C6571u r3, int r4) {
            r2 = this;
            int r0 = r3.m13398a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r3 = r3.m13418u()
            if (r3 == r4) goto L10
            r2.f25399c = r1
        L10:
            int r3 = r2.f25400d
            int r3 = r3 + (-1)
            r2.f25400d = r3
            boolean r3 = r2.f25399c
            return r3
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r7) {
            r6 = this;
            boolean r0 = r6.f25399c
            if (r0 == 0) goto L3a
            int r0 = r6.f25400d
            r1 = 2
            if (r0 != r1) goto L12
            r0 = 32
            boolean r0 = r6.m13266b(r7, r0)
            if (r0 != 0) goto L12
            return
        L12:
            int r0 = r6.f25400d
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1f
            boolean r0 = r6.m13266b(r7, r1)
            if (r0 != 0) goto L1f
            return
        L1f:
            int r0 = r7.f25711b
            int r2 = r7.m13398a()
            m4.z[] r3 = r6.f25398b
            int r4 = r3.length
        L28:
            if (r1 >= r4) goto L35
            r5 = r3[r1]
            r7.m13396F(r0)
            r5.mo5972d(r7, r2)
            int r1 = r1 + 1
            goto L28
        L35:
            int r7 = r6.f25401e
            int r7 = r7 + r2
            r6.f25401e = r7
        L3a:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r6, p370v4.InterfaceC6525d0.d r7) {
            r5 = this;
            r0 = 0
        L1:
            m4.z[] r1 = r5.f25398b
            int r1 = r1.length
            if (r0 >= r1) goto L43
            java.util.List<v4.d0$a> r1 = r5.f25397a
            java.lang.Object r1 = r1.get(r0)
            v4.d0$a r1 = (p370v4.InterfaceC6525d0.a) r1
            r7.m13253a()
            int r2 = r7.m13255c()
            r3 = 3
            m4.z r2 = r6.mo6048l(r2, r3)
            f4.e0$b r3 = new f4.e0$b
            r3.<init>()
            java.lang.String r4 = r7.m13254b()
            r3.f8917a = r4
            java.lang.String r4 = "application/dvbsubs"
            r3.f8927k = r4
            byte[] r4 = r1.f25339b
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r3.f8929m = r4
            java.lang.String r1 = r1.f25338a
            r3.f8919c = r1
            f4.e0 r1 = r3.m5193a()
            r2.mo5973e(r1)
            m4.z[] r1 = r5.f25398b
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1
        L43:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: e */
    public void mo13244e() {
            r12 = this;
            boolean r0 = r12.f25399c
            if (r0 == 0) goto L27
            long r0 = r12.f25402f
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L25
            m4.z[] r0 = r12.f25398b
            int r1 = r0.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L25
            r5 = r0[r2]
            long r6 = r12.f25402f
            r8 = 1
            int r9 = r12.f25401e
            r10 = 0
            r11 = 0
            r5.mo5971c(r6, r8, r9, r10, r11)
            int r2 = r2 + 1
            goto L14
        L25:
            r12.f25399c = r4
        L27:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: f */
    public void mo13245f(long r3, int r5) {
            r2 = this;
            r5 = r5 & 4
            if (r5 != 0) goto L5
            return
        L5:
            r5 = 1
            r2.f25399c = r5
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L13
            r2.f25402f = r3
        L13:
            r3 = 0
            r2.f25401e = r3
            r3 = 2
            r2.f25400d = r3
            return
    }
}
