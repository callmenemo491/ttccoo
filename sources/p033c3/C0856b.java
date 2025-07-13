package p033c3;

/* renamed from: c3.b */
/* loaded from: classes.dex */
public final class C0856b implements p033c3.InterfaceC0859e, p033c3.InterfaceC0858d {

    /* renamed from: a */
    public final java.lang.Object f4647a;

    /* renamed from: b */
    public final p033c3.InterfaceC0859e f4648b;

    /* renamed from: c */
    public volatile p033c3.InterfaceC0858d f4649c;

    /* renamed from: d */
    public volatile p033c3.InterfaceC0858d f4650d;

    /* renamed from: e */
    public int f4651e;

    /* renamed from: f */
    public int f4652f;

    public C0856b(java.lang.Object r2, p033c3.InterfaceC0859e r3) {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.f4651e = r0
            r1.f4652f = r0
            r1.f4647a = r2
            r1.f4648b = r3
            return
    }

    @Override // p033c3.InterfaceC0859e, p033c3.InterfaceC0858d
    /* renamed from: a */
    public boolean mo2551a() {
            r2 = this;
            java.lang.Object r0 = r2.f4647a
            monitor-enter(r0)
            c3.d r1 = r2.f4649c     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.mo2551a()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L16
            c3.d r1 = r2.f4650d     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.mo2551a()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L17
        L16:
            r1 = 1
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    @Override // p033c3.InterfaceC0859e
    /* renamed from: b */
    public p033c3.InterfaceC0859e mo2552b() {
            r2 = this;
            java.lang.Object r0 = r2.f4647a
            monitor-enter(r0)
            c3.e r1 = r2.f4648b     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Lc
            c3.e r1 = r1.mo2552b()     // Catch: java.lang.Throwable -> Lf
            goto Ld
        Lc:
            r1 = r2
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // p033c3.InterfaceC0859e
    /* renamed from: c */
    public boolean mo2553c(p033c3.InterfaceC0858d r5) {
            r4 = this;
            java.lang.Object r0 = r4.f4647a
            monitor-enter(r0)
            c3.e r1 = r4.f4648b     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r1.mo2553c(r4)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            if (r1 == 0) goto L1c
            boolean r5 = r4.m2563m(r5)     // Catch: java.lang.Throwable -> L1f
            if (r5 == 0) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r2
        L1f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    @Override // p033c3.InterfaceC0858d
    public void clear() {
            r3 = this;
            java.lang.Object r0 = r3.f4647a
            monitor-enter(r0)
            r1 = 3
            r3.f4651e = r1     // Catch: java.lang.Throwable -> L18
            c3.d r2 = r3.f4649c     // Catch: java.lang.Throwable -> L18
            r2.clear()     // Catch: java.lang.Throwable -> L18
            int r2 = r3.f4652f     // Catch: java.lang.Throwable -> L18
            if (r2 == r1) goto L16
            r3.f4652f = r1     // Catch: java.lang.Throwable -> L18
            c3.d r1 = r3.f4650d     // Catch: java.lang.Throwable -> L18
            r1.clear()     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    @Override // p033c3.InterfaceC0859e
    /* renamed from: d */
    public boolean mo2554d(p033c3.InterfaceC0858d r5) {
            r4 = this;
            java.lang.Object r0 = r4.f4647a
            monitor-enter(r0)
            c3.e r1 = r4.f4648b     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r1.mo2554d(r4)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            if (r1 == 0) goto L1c
            boolean r5 = r4.m2563m(r5)     // Catch: java.lang.Throwable -> L1f
            if (r5 == 0) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r2
        L1f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: e */
    public boolean mo2555e() {
            r3 = this;
            java.lang.Object r0 = r3.f4647a
            monitor-enter(r0)
            int r1 = r3.f4651e     // Catch: java.lang.Throwable -> L11
            r2 = 3
            if (r1 != r2) goto Le
            int r1 = r3.f4652f     // Catch: java.lang.Throwable -> L11
            if (r1 != r2) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: f */
    public boolean mo2556f(p033c3.InterfaceC0858d r4) {
            r3 = this;
            boolean r0 = r4 instanceof p033c3.C0856b
            r1 = 0
            if (r0 == 0) goto L1c
            c3.b r4 = (p033c3.C0856b) r4
            c3.d r0 = r3.f4649c
            c3.d r2 = r4.f4649c
            boolean r0 = r0.mo2556f(r2)
            if (r0 == 0) goto L1c
            c3.d r0 = r3.f4650d
            c3.d r4 = r4.f4650d
            boolean r4 = r0.mo2556f(r4)
            if (r4 == 0) goto L1c
            r1 = 1
        L1c:
            return r1
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: g */
    public void mo2557g() {
            r3 = this;
            java.lang.Object r0 = r3.f4647a
            monitor-enter(r0)
            int r1 = r3.f4651e     // Catch: java.lang.Throwable -> L11
            r2 = 1
            if (r1 == r2) goto Lf
            r3.f4651e = r2     // Catch: java.lang.Throwable -> L11
            c3.d r1 = r3.f4649c     // Catch: java.lang.Throwable -> L11
            r1.mo2557g()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // p033c3.InterfaceC0859e
    /* renamed from: h */
    public boolean mo2558h(p033c3.InterfaceC0858d r5) {
            r4 = this;
            java.lang.Object r0 = r4.f4647a
            monitor-enter(r0)
            c3.e r1 = r4.f4648b     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r1.mo2558h(r4)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            if (r1 == 0) goto L1c
            boolean r5 = r4.m2563m(r5)     // Catch: java.lang.Throwable -> L1f
            if (r5 == 0) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r2
        L1f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: i */
    public boolean mo2559i() {
            r3 = this;
            java.lang.Object r0 = r3.f4647a
            monitor-enter(r0)
            int r1 = r3.f4651e     // Catch: java.lang.Throwable -> L12
            r2 = 4
            if (r1 == r2) goto Lf
            int r1 = r3.f4652f     // Catch: java.lang.Throwable -> L12
            if (r1 != r2) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    @Override // p033c3.InterfaceC0858d
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.f4647a
            monitor-enter(r0)
            int r1 = r3.f4651e     // Catch: java.lang.Throwable -> L10
            r2 = 1
            if (r1 == r2) goto Le
            int r1 = r3.f4652f     // Catch: java.lang.Throwable -> L10
            if (r1 != r2) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: j */
    public void mo2560j() {
            r4 = this;
            java.lang.Object r0 = r4.f4647a
            monitor-enter(r0)
            int r1 = r4.f4651e     // Catch: java.lang.Throwable -> L1d
            r2 = 1
            r3 = 2
            if (r1 != r2) goto L10
            r4.f4651e = r3     // Catch: java.lang.Throwable -> L1d
            c3.d r1 = r4.f4649c     // Catch: java.lang.Throwable -> L1d
            r1.mo2560j()     // Catch: java.lang.Throwable -> L1d
        L10:
            int r1 = r4.f4652f     // Catch: java.lang.Throwable -> L1d
            if (r1 != r2) goto L1b
            r4.f4652f = r3     // Catch: java.lang.Throwable -> L1d
            c3.d r1 = r4.f4650d     // Catch: java.lang.Throwable -> L1d
            r1.mo2560j()     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    @Override // p033c3.InterfaceC0859e
    /* renamed from: k */
    public void mo2561k(p033c3.InterfaceC0858d r4) {
            r3 = this;
            java.lang.Object r0 = r3.f4647a
            monitor-enter(r0)
            c3.d r1 = r3.f4649c     // Catch: java.lang.Throwable -> L22
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L22
            r2 = 4
            if (r1 == 0) goto Lf
            r3.f4651e = r2     // Catch: java.lang.Throwable -> L22
            goto L19
        Lf:
            c3.d r1 = r3.f4650d     // Catch: java.lang.Throwable -> L22
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L19
            r3.f4652f = r2     // Catch: java.lang.Throwable -> L22
        L19:
            c3.e r4 = r3.f4648b     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L20
            r4.mo2561k(r3)     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    @Override // p033c3.InterfaceC0859e
    /* renamed from: l */
    public void mo2562l(p033c3.InterfaceC0858d r3) {
            r2 = this;
            java.lang.Object r0 = r2.f4647a
            monitor-enter(r0)
            c3.d r1 = r2.f4650d     // Catch: java.lang.Throwable -> L27
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L27
            r1 = 5
            if (r3 != 0) goto L1c
            r2.f4651e = r1     // Catch: java.lang.Throwable -> L27
            int r3 = r2.f4652f     // Catch: java.lang.Throwable -> L27
            r1 = 1
            if (r3 == r1) goto L1a
            r2.f4652f = r1     // Catch: java.lang.Throwable -> L27
            c3.d r3 = r2.f4650d     // Catch: java.lang.Throwable -> L27
            r3.mo2557g()     // Catch: java.lang.Throwable -> L27
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L1c:
            r2.f4652f = r1     // Catch: java.lang.Throwable -> L27
            c3.e r3 = r2.f4648b     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L25
            r3.mo2562l(r2)     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    /* renamed from: m */
    public final boolean m2563m(p033c3.InterfaceC0858d r3) {
            r2 = this;
            c3.d r0 = r2.f4649c
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L18
            int r0 = r2.f4651e
            r1 = 5
            if (r0 != r1) goto L16
            c3.d r0 = r2.f4650d
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L16
            goto L18
        L16:
            r3 = 0
            goto L19
        L18:
            r3 = 1
        L19:
            return r3
    }
}
