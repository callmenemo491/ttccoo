package p124h7;

/* renamed from: h7.b0 */
/* loaded from: classes.dex */
public final class C2540b0<T> implements p124h7.InterfaceC2666i0<T> {

    /* renamed from: a */
    public final p124h7.InterfaceC2935x f11390a;

    /* renamed from: b */
    public final p124h7.AbstractC2900v0<?, ?> f11391b;

    /* renamed from: c */
    public final boolean f11392c;

    /* renamed from: d */
    public final p124h7.AbstractC2772ng<?> f11393d;

    public C2540b0(p124h7.AbstractC2900v0<?, ?> r1, p124h7.AbstractC2772ng<?> r2, p124h7.InterfaceC2935x r3) {
            r0 = this;
            r0.<init>()
            r0.f11391b = r1
            boolean r1 = r2.mo7010h(r3)
            r0.f11392c = r1
            r0.f11393d = r2
            r0.f11390a = r3
            return
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: a */
    public final void mo6438a(T r4, T r5) {
            r3 = this;
            h7.v0<?, ?> r0 = r3.f11391b
            java.lang.Class<?> r1 = p124h7.C2702k0.f11686a
            java.lang.Object r1 = r0.mo7183d(r4)
            java.lang.Object r2 = r0.mo7183d(r5)
            java.lang.Object r1 = r0.mo7184e(r1, r2)
            r0.mo7194o(r4, r1)
            boolean r4 = r3.f11392c
            if (r4 != 0) goto L18
            return
        L18:
            h7.ng<?> r4 = r3.f11393d
            r4.mo7003a(r5)
            r4 = 0
            throw r4
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: b */
    public final int mo6439b(T r3) {
            r2 = this;
            h7.v0<?, ?> r0 = r2.f11391b
            java.lang.Object r0 = r0.mo7183d(r3)
            int r0 = r0.hashCode()
            boolean r1 = r2.f11392c
            if (r1 != 0) goto Lf
            return r0
        Lf:
            h7.ng<?> r0 = r2.f11393d
            r0.mo7003a(r3)
            r3 = 0
            throw r3
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: c */
    public final void mo6440c(T r2) {
            r1 = this;
            h7.v0<?, ?> r0 = r1.f11391b
            r0.mo7192m(r2)
            h7.ng<?> r0 = r1.f11393d
            r0.mo7007e(r2)
            return
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: d */
    public final T mo6441d() {
            r1 = this;
            h7.x r0 = r1.f11390a
            h7.rf r0 = r0.mo7244o()
            h7.vg r0 = (p124h7.C2916vg) r0
            h7.yg r0 = r0.m7221c()
            return r0
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: e */
    public final int mo6442e(T r3) {
            r2 = this;
            h7.v0<?, ?> r0 = r2.f11391b
            java.lang.Object r1 = r0.mo7183d(r3)
            int r0 = r0.mo7181b(r1)
            boolean r1 = r2.f11392c
            if (r1 != 0) goto Lf
            return r0
        Lf:
            h7.ng<?> r0 = r2.f11393d
            r0.mo7003a(r3)
            r3 = 0
            throw r3
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: f */
    public final void mo6443f(T r1, p124h7.C2700jg r2) {
            r0 = this;
            h7.ng<?> r2 = r0.f11393d
            r2.mo7003a(r1)
            r1 = 0
            throw r1
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: g */
    public final void mo6444g(T r11, p124h7.C2610eg r12, p124h7.C2754mg r13) {
            r10 = this;
            h7.v0<?, ?> r0 = r10.f11391b
            h7.ng<?> r1 = r10.f11393d
            java.lang.Object r2 = r0.mo7182c(r11)
            h7.rg r3 = r1.mo7004b(r11)
        Lc:
            int r4 = r12.m6675u()     // Catch: java.lang.Throwable -> L88
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L84
            int r4 = r12.f11500b     // Catch: java.lang.Throwable -> L88
            r6 = 11
            if (r4 == r6) goto L3d
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L33
            h7.x r5 = r10.f11390a     // Catch: java.lang.Throwable -> L88
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.mo7005c(r13, r5, r4)     // Catch: java.lang.Throwable -> L88
            if (r4 == 0) goto L2e
            r1.mo7008f(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L88
            goto Lc
        L2e:
            boolean r4 = r0.m7195p(r2, r12)     // Catch: java.lang.Throwable -> L88
            goto L37
        L33:
            boolean r4 = r12.m6670n()     // Catch: java.lang.Throwable -> L88
        L37:
            if (r4 != 0) goto Lc
            r0.mo7193n(r11, r2)
            return
        L3d:
            r4 = 0
            r6 = 0
            r7 = r6
        L40:
            int r8 = r12.m6675u()     // Catch: java.lang.Throwable -> L88
            if (r8 != r5) goto L47
            goto L6d
        L47:
            int r8 = r12.f11500b     // Catch: java.lang.Throwable -> L88
            r9 = 16
            if (r8 != r9) goto L58
            int r4 = r12.m6677w()     // Catch: java.lang.Throwable -> L88
            h7.x r6 = r10.f11390a     // Catch: java.lang.Throwable -> L88
            java.lang.Object r6 = r1.mo7005c(r13, r6, r4)     // Catch: java.lang.Throwable -> L88
            goto L40
        L58:
            r9 = 26
            if (r8 != r9) goto L67
            if (r6 == 0) goto L62
            r1.mo7008f(r12, r6, r13, r3)     // Catch: java.lang.Throwable -> L88
            goto L40
        L62:
            h7.cg r7 = r12.m6680z()     // Catch: java.lang.Throwable -> L88
            goto L40
        L67:
            boolean r8 = r12.m6670n()     // Catch: java.lang.Throwable -> L88
            if (r8 != 0) goto L40
        L6d:
            int r5 = r12.f11500b     // Catch: java.lang.Throwable -> L88
            r8 = 12
            if (r5 != r8) goto L7f
            if (r7 == 0) goto Lc
            if (r6 == 0) goto L7b
            r1.mo7009g(r7, r6, r13, r3)     // Catch: java.lang.Throwable -> L88
            goto Lc
        L7b:
            r0.mo7190k(r2, r4, r7)     // Catch: java.lang.Throwable -> L88
            goto Lc
        L7f:
            h7.f r12 = p124h7.C2611f.m6681a()     // Catch: java.lang.Throwable -> L88
            throw r12     // Catch: java.lang.Throwable -> L88
        L84:
            r0.mo7193n(r11, r2)
            return
        L88:
            r12 = move-exception
            r0.mo7193n(r11, r2)
            throw r12
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: h */
    public final boolean mo6445h(T r3, T r4) {
            r2 = this;
            h7.v0<?, ?> r0 = r2.f11391b
            java.lang.Object r0 = r0.mo7183d(r3)
            h7.v0<?, ?> r1 = r2.f11391b
            java.lang.Object r1 = r1.mo7183d(r4)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L14:
            boolean r0 = r2.f11392c
            if (r0 != 0) goto L1a
            r3 = 1
            return r3
        L1a:
            h7.ng<?> r0 = r2.f11393d
            r0.mo7003a(r3)
            h7.ng<?> r3 = r2.f11393d
            r3.mo7003a(r4)
            r3 = 0
            throw r3
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: i */
    public final void mo6446i(T r1, byte[] r2, int r3, int r4, p124h7.C2915vf r5) {
            r0 = this;
            r2 = r1
            h7.yg r2 = (p124h7.AbstractC2970yg) r2
            h7.x0 r3 = r2.zzc
            h7.x0 r4 = p124h7.C2936x0.f12011f
            if (r3 == r4) goto La
            goto L10
        La:
            h7.x0 r3 = p124h7.C2936x0.m7246b()
            r2.zzc = r3
        L10:
            h7.wg r1 = (p124h7.AbstractC2934wg) r1
            r1 = 0
            throw r1
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: j */
    public final boolean mo6447j(T r2) {
            r1 = this;
            h7.ng<?> r0 = r1.f11393d
            r0.mo7003a(r2)
            r2 = 0
            throw r2
    }
}
