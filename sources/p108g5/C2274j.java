package p108g5;

/* renamed from: g5.j */
/* loaded from: classes.dex */
public final class C2274j implements p352u5.InterfaceC6320i {

    /* renamed from: a */
    public final p352u5.InterfaceC6320i f10381a;

    /* renamed from: b */
    public final int f10382b;

    /* renamed from: c */
    public final p108g5.C2274j.a f10383c;

    /* renamed from: d */
    public final byte[] f10384d;

    /* renamed from: e */
    public int f10385e;

    /* renamed from: g5.j$a */
    public interface a {
    }

    public C2274j(p352u5.InterfaceC6320i r3, int r4, p108g5.C2274j.a r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r4 <= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            p371v5.C6549a.m13288b(r1)
            r2.f10381a = r3
            r2.f10382b = r4
            r2.f10383c = r5
            byte[] r3 = new byte[r0]
            r2.f10384d = r3
            r2.f10385e = r4
            return
    }

    @Override // p352u5.InterfaceC6314f
    /* renamed from: b */
    public int mo6020b(byte[] r17, int r18, int r19) {
            r16 = this;
            r0 = r16
            int r1 = r0.f10385e
            r2 = -1
            if (r1 != 0) goto L79
            u5.i r1 = r0.f10381a
            byte[] r3 = r0.f10384d
            r4 = 1
            r5 = 0
            int r1 = r1.mo6020b(r3, r5, r4)
            if (r1 != r2) goto L15
        L13:
            r4 = 0
            goto L71
        L15:
            byte[] r1 = r0.f10384d
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 4
            if (r1 != 0) goto L20
            goto L71
        L20:
            byte[] r3 = new byte[r1]
            r6 = r1
            r7 = 0
        L24:
            if (r6 <= 0) goto L32
            u5.i r8 = r0.f10381a
            int r8 = r8.mo6020b(r3, r7, r6)
            if (r8 != r2) goto L2f
            goto L13
        L2f:
            int r7 = r7 + r8
            int r6 = r6 - r8
            goto L24
        L32:
            if (r1 <= 0) goto L3c
            int r5 = r1 + (-1)
            r6 = r3[r5]
            if (r6 != 0) goto L3c
            r1 = r5
            goto L32
        L3c:
            if (r1 <= 0) goto L71
            g5.j$a r5 = r0.f10383c
            v5.u r6 = new v5.u
            r6.<init>(r3, r1)
            g5.y$a r5 = (p108g5.C2290y.a) r5
            boolean r1 = r5.f10492n
            if (r1 != 0) goto L4e
            long r7 = r5.f10488j
            goto L5c
        L4e:
            g5.y r1 = r5.f10493o
            java.util.Map<java.lang.String, java.lang.String> r3 = p108g5.C2290y.f10439K0
            long r7 = r1.m6051v()
            long r9 = r5.f10488j
            long r7 = java.lang.Math.max(r7, r9)
        L5c:
            r10 = r7
            int r13 = r6.m13398a()
            m4.z r9 = r5.f10491m
            java.util.Objects.requireNonNull(r9)
            r9.mo5972d(r6, r13)
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo5971c(r10, r12, r13, r14, r15)
            r5.f10492n = r4
        L71:
            if (r4 == 0) goto L78
            int r1 = r0.f10382b
            r0.f10385e = r1
            goto L79
        L78:
            return r2
        L79:
            u5.i r1 = r0.f10381a
            int r3 = r0.f10385e
            r4 = r19
            int r3 = java.lang.Math.min(r3, r4)
            r4 = r17
            r5 = r18
            int r1 = r1.mo6020b(r4, r5, r3)
            if (r1 == r2) goto L92
            int r2 = r0.f10385e
            int r2 = r2 - r1
            r0.f10385e = r2
        L92:
            return r1
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: c */
    public long mo6021c(p352u5.C6323l r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p352u5.InterfaceC6320i
    public void close() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: g */
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> mo6022g() {
            r1 = this;
            u5.i r0 = r1.f10381a
            java.util.Map r0 = r0.mo6022g()
            return r0
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: j */
    public void mo6023j(p352u5.InterfaceC6317g0 r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            u5.i r0 = r1.f10381a
            r0.mo6023j(r2)
            return
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: l */
    public android.net.Uri mo6024l() {
            r1 = this;
            u5.i r0 = r1.f10381a
            android.net.Uri r0 = r0.mo6024l()
            return r0
    }
}
