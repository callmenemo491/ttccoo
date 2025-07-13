package p033c3;

/* renamed from: c3.k */
/* loaded from: classes.dex */
public class C0865k implements p033c3.InterfaceC0859e, p033c3.InterfaceC0858d {

    /* renamed from: a */
    public final p033c3.InterfaceC0859e f4693a;

    /* renamed from: b */
    public final java.lang.Object f4694b;

    /* renamed from: c */
    public volatile p033c3.InterfaceC0858d f4695c;

    /* renamed from: d */
    public volatile p033c3.InterfaceC0858d f4696d;

    /* renamed from: e */
    public int f4697e;

    /* renamed from: f */
    public int f4698f;

    /* renamed from: g */
    public boolean f4699g;

    public C0865k(java.lang.Object r2, p033c3.InterfaceC0859e r3) {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.f4697e = r0
            r1.f4698f = r0
            r1.f4694b = r2
            r1.f4693a = r3
            return
    }

    @Override // p033c3.InterfaceC0859e, p033c3.InterfaceC0858d
    /* renamed from: a */
    public boolean mo2551a() {
            r2 = this;
            java.lang.Object r0 = r2.f4694b
            monitor-enter(r0)
            c3.d r1 = r2.f4696d     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.mo2551a()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L16
            c3.d r1 = r2.f4695c     // Catch: java.lang.Throwable -> L19
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
            java.lang.Object r0 = r2.f4694b
            monitor-enter(r0)
            c3.e r1 = r2.f4693a     // Catch: java.lang.Throwable -> Lf
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
            java.lang.Object r0 = r4.f4694b
            monitor-enter(r0)
            c3.e r1 = r4.f4693a     // Catch: java.lang.Throwable -> L26
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r1.mo2553c(r4)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            if (r1 == 0) goto L23
            c3.d r1 = r4.f4695c     // Catch: java.lang.Throwable -> L26
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L23
            int r5 = r4.f4697e     // Catch: java.lang.Throwable -> L26
            r1 = 2
            if (r5 == r1) goto L23
            goto L24
        L23:
            r2 = 0
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return r2
        L26:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r5
    }

    @Override // p033c3.InterfaceC0858d
    public void clear() {
            r2 = this;
            java.lang.Object r0 = r2.f4694b
            monitor-enter(r0)
            r1 = 0
            r2.f4699g = r1     // Catch: java.lang.Throwable -> L17
            r1 = 3
            r2.f4697e = r1     // Catch: java.lang.Throwable -> L17
            r2.f4698f = r1     // Catch: java.lang.Throwable -> L17
            c3.d r1 = r2.f4696d     // Catch: java.lang.Throwable -> L17
            r1.clear()     // Catch: java.lang.Throwable -> L17
            c3.d r1 = r2.f4695c     // Catch: java.lang.Throwable -> L17
            r1.clear()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    @Override // p033c3.InterfaceC0859e
    /* renamed from: d */
    public boolean mo2554d(p033c3.InterfaceC0858d r5) {
            r4 = this;
            java.lang.Object r0 = r4.f4694b
            monitor-enter(r0)
            c3.e r1 = r4.f4693a     // Catch: java.lang.Throwable -> L27
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r1.mo2554d(r4)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            if (r1 == 0) goto L24
            c3.d r1 = r4.f4695c     // Catch: java.lang.Throwable -> L27
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L24
            boolean r5 = r4.mo2551a()     // Catch: java.lang.Throwable -> L27
            if (r5 != 0) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return r2
        L27:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r5
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: e */
    public boolean mo2555e() {
            r3 = this;
            java.lang.Object r0 = r3.f4694b
            monitor-enter(r0)
            int r1 = r3.f4697e     // Catch: java.lang.Throwable -> Ld
            r2 = 3
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: f */
    public boolean mo2556f(p033c3.InterfaceC0858d r4) {
            r3 = this;
            boolean r0 = r4 instanceof p033c3.C0865k
            r1 = 0
            if (r0 == 0) goto L2e
            c3.k r4 = (p033c3.C0865k) r4
            c3.d r0 = r3.f4695c
            if (r0 != 0) goto L10
            c3.d r0 = r4.f4695c
            if (r0 != 0) goto L2e
            goto L1a
        L10:
            c3.d r0 = r3.f4695c
            c3.d r2 = r4.f4695c
            boolean r0 = r0.mo2556f(r2)
            if (r0 == 0) goto L2e
        L1a:
            c3.d r0 = r3.f4696d
            if (r0 != 0) goto L23
            c3.d r4 = r4.f4696d
            if (r4 != 0) goto L2e
            goto L2d
        L23:
            c3.d r0 = r3.f4696d
            c3.d r4 = r4.f4696d
            boolean r4 = r0.mo2556f(r4)
            if (r4 == 0) goto L2e
        L2d:
            r1 = 1
        L2e:
            return r1
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: g */
    public void mo2557g() {
            r5 = this;
            java.lang.Object r0 = r5.f4694b
            monitor-enter(r0)
            r1 = 1
            r5.f4699g = r1     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            int r3 = r5.f4697e     // Catch: java.lang.Throwable -> L2a
            r4 = 4
            if (r3 == r4) goto L17
            int r3 = r5.f4698f     // Catch: java.lang.Throwable -> L2a
            if (r3 == r1) goto L17
            r5.f4698f = r1     // Catch: java.lang.Throwable -> L2a
            c3.d r3 = r5.f4696d     // Catch: java.lang.Throwable -> L2a
            r3.mo2557g()     // Catch: java.lang.Throwable -> L2a
        L17:
            boolean r3 = r5.f4699g     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L26
            int r3 = r5.f4697e     // Catch: java.lang.Throwable -> L2a
            if (r3 == r1) goto L26
            r5.f4697e = r1     // Catch: java.lang.Throwable -> L2a
            c3.d r1 = r5.f4695c     // Catch: java.lang.Throwable -> L2a
            r1.mo2557g()     // Catch: java.lang.Throwable -> L2a
        L26:
            r5.f4699g = r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return
        L2a:
            r1 = move-exception
            r5.f4699g = r2     // Catch: java.lang.Throwable -> L2e
            throw r1     // Catch: java.lang.Throwable -> L2e
        L2e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r1
    }

    @Override // p033c3.InterfaceC0859e
    /* renamed from: h */
    public boolean mo2558h(p033c3.InterfaceC0858d r5) {
            r4 = this;
            java.lang.Object r0 = r4.f4694b
            monitor-enter(r0)
            c3.e r1 = r4.f4693a     // Catch: java.lang.Throwable -> L26
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r1.mo2558h(r4)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            if (r1 == 0) goto L23
            c3.d r1 = r4.f4695c     // Catch: java.lang.Throwable -> L26
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L26
            if (r5 != 0) goto L24
            int r5 = r4.f4697e     // Catch: java.lang.Throwable -> L26
            r1 = 4
            if (r5 == r1) goto L23
            goto L24
        L23:
            r2 = 0
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return r2
        L26:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r5
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: i */
    public boolean mo2559i() {
            r3 = this;
            java.lang.Object r0 = r3.f4694b
            monitor-enter(r0)
            int r1 = r3.f4697e     // Catch: java.lang.Throwable -> Ld
            r2 = 4
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // p033c3.InterfaceC0858d
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.f4694b
            monitor-enter(r0)
            int r1 = r3.f4697e     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            if (r1 != r2) goto L9
            goto La
        L9:
            r2 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r2
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: j */
    public void mo2560j() {
            r3 = this;
            java.lang.Object r0 = r3.f4694b
            monitor-enter(r0)
            int r1 = r3.f4698f     // Catch: java.lang.Throwable -> L24
            boolean r1 = p365v.C6480g.m13152e(r1)     // Catch: java.lang.Throwable -> L24
            r2 = 2
            if (r1 != 0) goto L13
            r3.f4698f = r2     // Catch: java.lang.Throwable -> L24
            c3.d r1 = r3.f4696d     // Catch: java.lang.Throwable -> L24
            r1.mo2560j()     // Catch: java.lang.Throwable -> L24
        L13:
            int r1 = r3.f4697e     // Catch: java.lang.Throwable -> L24
            boolean r1 = p365v.C6480g.m13152e(r1)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L22
            r3.f4697e = r2     // Catch: java.lang.Throwable -> L24
            c3.d r1 = r3.f4695c     // Catch: java.lang.Throwable -> L24
            r1.mo2560j()     // Catch: java.lang.Throwable -> L24
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r1
    }

    @Override // p033c3.InterfaceC0859e
    /* renamed from: k */
    public void mo2561k(p033c3.InterfaceC0858d r3) {
            r2 = this;
            java.lang.Object r0 = r2.f4694b
            monitor-enter(r0)
            c3.d r1 = r2.f4696d     // Catch: java.lang.Throwable -> L28
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L28
            r1 = 4
            if (r3 == 0) goto L10
            r2.f4698f = r1     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L10:
            r2.f4697e = r1     // Catch: java.lang.Throwable -> L28
            c3.e r3 = r2.f4693a     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L19
            r3.mo2561k(r2)     // Catch: java.lang.Throwable -> L28
        L19:
            int r3 = r2.f4698f     // Catch: java.lang.Throwable -> L28
            boolean r3 = p365v.C6480g.m13152e(r3)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L26
            c3.d r3 = r2.f4696d     // Catch: java.lang.Throwable -> L28
            r3.clear()     // Catch: java.lang.Throwable -> L28
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r3
    }

    @Override // p033c3.InterfaceC0859e
    /* renamed from: l */
    public void mo2562l(p033c3.InterfaceC0858d r3) {
            r2 = this;
            java.lang.Object r0 = r2.f4694b
            monitor-enter(r0)
            c3.d r1 = r2.f4695c     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1b
            r1 = 5
            if (r3 != 0) goto L10
            r2.f4698f = r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L10:
            r2.f4697e = r1     // Catch: java.lang.Throwable -> L1b
            c3.e r3 = r2.f4693a     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L19
            r3.mo2562l(r2)     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }
}
