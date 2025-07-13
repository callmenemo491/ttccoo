package p370v4;

/* renamed from: v4.o */
/* loaded from: classes.dex */
public final class C6537o implements p370v4.InterfaceC6532j {

    /* renamed from: a */
    public final p371v5.C6571u f25527a;

    /* renamed from: b */
    public p216m4.InterfaceC4381z f25528b;

    /* renamed from: c */
    public boolean f25529c;

    /* renamed from: d */
    public long f25530d;

    /* renamed from: e */
    public int f25531e;

    /* renamed from: f */
    public int f25532f;

    public C6537o() {
            r2 = this;
            r2.<init>()
            v5.u r0 = new v5.u
            r1 = 10
            r0.<init>(r1)
            r2.f25527a = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25530d = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r2 = this;
            r0 = 0
            r2.f25529c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25530d = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r8) {
            r7 = this;
            m4.z r0 = r7.f25528b
            p371v5.C6549a.m13292f(r0)
            boolean r0 = r7.f25529c
            if (r0 != 0) goto La
            return
        La:
            int r0 = r8.m13398a()
            int r1 = r7.f25532f
            r2 = 10
            if (r1 >= r2) goto L6b
            int r1 = 10 - r1
            int r1 = java.lang.Math.min(r0, r1)
            byte[] r3 = r8.f25710a
            int r4 = r8.f25711b
            v5.u r5 = r7.f25527a
            byte[] r5 = r5.f25710a
            int r6 = r7.f25532f
            java.lang.System.arraycopy(r3, r4, r5, r6, r1)
            int r3 = r7.f25532f
            int r3 = r3 + r1
            if (r3 != r2) goto L6b
            v5.u r1 = r7.f25527a
            r3 = 0
            r1.m13396F(r3)
            r1 = 73
            v5.u r4 = r7.f25527a
            int r4 = r4.m13418u()
            if (r1 != r4) goto L61
            r1 = 68
            v5.u r4 = r7.f25527a
            int r4 = r4.m13418u()
            if (r1 != r4) goto L61
            r1 = 51
            v5.u r4 = r7.f25527a
            int r4 = r4.m13418u()
            if (r1 == r4) goto L51
            goto L61
        L51:
            v5.u r1 = r7.f25527a
            r3 = 3
            r1.m13397G(r3)
            v5.u r1 = r7.f25527a
            int r1 = r1.m13417t()
            int r1 = r1 + r2
            r7.f25531e = r1
            goto L6b
        L61:
            java.lang.String r8 = "Id3Reader"
            java.lang.String r0 = "Discarding invalid ID3 tag"
            android.util.Log.w(r8, r0)
            r7.f25529c = r3
            return
        L6b:
            int r1 = r7.f25531e
            int r2 = r7.f25532f
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            m4.z r1 = r7.f25528b
            r1.mo5972d(r8, r0)
            int r8 = r7.f25532f
            int r8 = r8 + r0
            r7.f25532f = r8
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r3, p370v4.InterfaceC6525d0.d r4) {
            r2 = this;
            r4.m13253a()
            int r0 = r4.m13255c()
            r1 = 5
            m4.z r3 = r3.mo6048l(r0, r1)
            r2.f25528b = r3
            f4.e0$b r0 = new f4.e0$b
            r0.<init>()
            java.lang.String r4 = r4.m13254b()
            r0.f8917a = r4
            java.lang.String r4 = "application/id3"
            r0.f8927k = r4
            f4.e0 r4 = r0.m5193a()
            r3.mo5973e(r4)
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: e */
    public void mo13244e() {
            r8 = this;
            m4.z r0 = r8.f25528b
            p371v5.C6549a.m13292f(r0)
            boolean r0 = r8.f25529c
            if (r0 == 0) goto L28
            int r5 = r8.f25531e
            if (r5 == 0) goto L28
            int r0 = r8.f25532f
            if (r0 == r5) goto L12
            goto L28
        L12:
            long r2 = r8.f25530d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L25
            m4.z r1 = r8.f25528b
            r4 = 1
            r6 = 0
            r7 = 0
            r1.mo5971c(r2, r4, r5, r6, r7)
        L25:
            r0 = 0
            r8.f25529c = r0
        L28:
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
            r2.f25529c = r5
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L13
            r2.f25530d = r3
        L13:
            r3 = 0
            r2.f25531e = r3
            r2.f25532f = r3
            return
    }
}
