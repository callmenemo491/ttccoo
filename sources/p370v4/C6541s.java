package p370v4;

/* renamed from: v4.s */
/* loaded from: classes.dex */
public final class C6541s implements p370v4.InterfaceC6546x {

    /* renamed from: a */
    public p088f4.C2003e0 f25571a;

    /* renamed from: b */
    public p371v5.C6576z f25572b;

    /* renamed from: c */
    public p216m4.InterfaceC4381z f25573c;

    public C6541s(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            f4.e0$b r0 = new f4.e0$b
            r0.<init>()
            r0.f8927k = r2
            f4.e0 r2 = r0.m5193a()
            r1.f25571a = r2
            return
    }

    @Override // p370v4.InterfaceC6546x
    /* renamed from: b */
    public void mo13247b(p371v5.C6576z r1, p216m4.InterfaceC4366k r2, p370v4.InterfaceC6525d0.d r3) {
            r0 = this;
            r0.f25572b = r1
            r3.m13253a()
            int r1 = r3.m13255c()
            r3 = 5
            m4.z r1 = r2.mo6048l(r1, r3)
            r0.f25573c = r1
            f4.e0 r2 = r0.f25571a
            r1.mo5973e(r2)
            return
    }

    @Override // p370v4.InterfaceC6546x
    /* renamed from: c */
    public void mo13248c(p371v5.C6571u r13) {
            r12 = this;
            v5.z r0 = r12.f25572b
            p371v5.C6549a.m13292f(r0)
            int r0 = p371v5.C6552b0.f25624a
            v5.z r0 = r12.f25572b
            monitor-enter(r0)
            long r1 = r0.f25728c     // Catch: java.lang.Throwable -> L59
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L19
            long r5 = r0.f25727b     // Catch: java.lang.Throwable -> L59
            long r1 = r1 + r5
            goto L1d
        L19:
            long r1 = r0.m13445c()     // Catch: java.lang.Throwable -> L59
        L1d:
            r6 = r1
            monitor-exit(r0)
            v5.z r0 = r12.f25572b
            long r0 = r0.m13446d()
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L58
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L2e
            goto L58
        L2e:
            f4.e0 r2 = r12.f25571a
            long r3 = r2.f8900n0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L47
            f4.e0$b r2 = r2.m5191a()
            r2.f8931o = r0
            f4.e0 r0 = r2.m5193a()
            r12.f25571a = r0
            m4.z r1 = r12.f25573c
            r1.mo5973e(r0)
        L47:
            int r9 = r13.m13398a()
            m4.z r0 = r12.f25573c
            r0.mo5972d(r13, r9)
            m4.z r5 = r12.f25573c
            r8 = 1
            r10 = 0
            r11 = 0
            r5.mo5971c(r6, r8, r9, r10, r11)
        L58:
            return
        L59:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
    }
}
