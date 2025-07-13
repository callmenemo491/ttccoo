package p327s7;

/* renamed from: s7.q */
/* loaded from: classes.dex */
public final class C5993q<TResult> extends p327s7.AbstractC5985i<TResult> {

    /* renamed from: a */
    public final java.lang.Object f23096a;

    /* renamed from: b */
    public final p445z2.C7240n f23097b;

    /* renamed from: c */
    public boolean f23098c;

    /* renamed from: d */
    public volatile boolean f23099d;

    /* renamed from: e */
    public TResult f23100e;

    /* renamed from: f */
    public java.lang.Exception f23101f;

    public C5993q() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f23096a = r0
            z2.n r0 = new z2.n
            r1 = 1
            r0.<init>(r1)
            r2.f23097b = r0
            return
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: a */
    public final p327s7.AbstractC5985i<TResult> mo12443a(java.util.concurrent.Executor r4, p327s7.InterfaceC5979c r5) {
            r3 = this;
            z2.n r0 = r3.f23097b
            s7.n r1 = new s7.n
            int r2 = p327s7.C5994r.f23102a
            r1.<init>(r4, r5)
            r0.m14310g(r1)
            r3.m12476u()
            return r3
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: b */
    public final p327s7.AbstractC5985i<TResult> mo12444b(p327s7.InterfaceC5980d<TResult> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = p327s7.C5987k.f23076a
            r1.m12471p(r0, r2)
            return r1
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: c */
    public final p327s7.AbstractC5985i<TResult> mo12445c(java.util.concurrent.Executor r4, p327s7.InterfaceC5981e r5) {
            r3 = this;
            z2.n r0 = r3.f23097b
            s7.n r1 = new s7.n
            int r2 = p327s7.C5994r.f23102a
            r1.<init>(r4, r5)
            r0.m14310g(r1)
            r3.m12476u()
            return r3
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: d */
    public final p327s7.AbstractC5985i<TResult> mo12446d(java.util.concurrent.Executor r4, p327s7.InterfaceC5982f<? super TResult> r5) {
            r3 = this;
            z2.n r0 = r3.f23097b
            s7.n r1 = new s7.n
            int r2 = p327s7.C5994r.f23102a
            r1.<init>(r4, r5)
            r0.m14310g(r1)
            r3.m12476u()
            return r3
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: e */
    public final <TContinuationResult> p327s7.AbstractC5985i<TContinuationResult> mo12447e(java.util.concurrent.Executor r5, p327s7.InterfaceC5977a<TResult, TContinuationResult> r6) {
            r4 = this;
            s7.q r0 = new s7.q
            r0.<init>()
            z2.n r1 = r4.f23097b
            s7.m r2 = new s7.m
            int r3 = p327s7.C5994r.f23102a
            r3 = 0
            r2.<init>(r5, r6, r0, r3)
            r1.m14310g(r2)
            r4.m12476u()
            return r0
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: f */
    public final <TContinuationResult> p327s7.AbstractC5985i<TContinuationResult> mo12448f(p327s7.InterfaceC5977a<TResult, TContinuationResult> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = p327s7.C5987k.f23076a
            s7.i r2 = r1.mo12447e(r0, r2)
            return r2
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: g */
    public final <TContinuationResult> p327s7.AbstractC5985i<TContinuationResult> mo12449g(java.util.concurrent.Executor r5, p327s7.InterfaceC5977a<TResult, p327s7.AbstractC5985i<TContinuationResult>> r6) {
            r4 = this;
            s7.q r0 = new s7.q
            r0.<init>()
            z2.n r1 = r4.f23097b
            s7.m r2 = new s7.m
            int r3 = p327s7.C5994r.f23102a
            r3 = 1
            r2.<init>(r5, r6, r0, r3)
            r1.m14310g(r2)
            r4.m12476u()
            return r0
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: h */
    public final java.lang.Exception mo12450h() {
            r2 = this;
            java.lang.Object r0 = r2.f23096a
            monitor-enter(r0)
            java.lang.Exception r1 = r2.f23101f     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: i */
    public final TResult mo12451i() {
            r3 = this;
            java.lang.Object r0 = r3.f23096a
            monitor-enter(r0)
            boolean r1 = r3.f23098c     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "Task is not yet complete"
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r2)     // Catch: java.lang.Throwable -> L26
            boolean r1 = r3.f23099d     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L1e
            java.lang.Exception r1 = r3.f23101f     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L16
            TResult r1 = r3.f23100e     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return r1
        L16:
            s7.g r1 = new s7.g     // Catch: java.lang.Throwable -> L26
            java.lang.Exception r2 = r3.f23101f     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            throw r1     // Catch: java.lang.Throwable -> L26
        L1e:
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "Task is already canceled."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            throw r1     // Catch: java.lang.Throwable -> L26
        L26:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: j */
    public final <X extends java.lang.Throwable> TResult mo12452j(java.lang.Class<X> r4) {
            r3 = this;
            java.lang.Object r0 = r3.f23096a
            monitor-enter(r0)
            boolean r1 = r3.f23098c     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "Task is not yet complete"
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r2)     // Catch: java.lang.Throwable -> L37
            boolean r1 = r3.f23099d     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L2f
            java.lang.Exception r1 = r3.f23101f     // Catch: java.lang.Throwable -> L37
            boolean r1 = r4.isInstance(r1)     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L26
            java.lang.Exception r4 = r3.f23101f     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L1e
            TResult r4 = r3.f23100e     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r4
        L1e:
            s7.g r4 = new s7.g     // Catch: java.lang.Throwable -> L37
            java.lang.Exception r1 = r3.f23101f     // Catch: java.lang.Throwable -> L37
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L26:
            java.lang.Exception r1 = r3.f23101f     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r4.cast(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L2f:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "Task is already canceled."
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L37:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: k */
    public final boolean mo12453k() {
            r1 = this;
            boolean r0 = r1.f23099d
            return r0
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: l */
    public final boolean mo12454l() {
            r2 = this;
            java.lang.Object r0 = r2.f23096a
            monitor-enter(r0)
            boolean r1 = r2.f23098c     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: m */
    public final boolean mo12455m() {
            r2 = this;
            java.lang.Object r0 = r2.f23096a
            monitor-enter(r0)
            boolean r1 = r2.f23098c     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L11
            boolean r1 = r2.f23099d     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L11
            java.lang.Exception r1 = r2.f23101f     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: n */
    public final <TContinuationResult> p327s7.AbstractC5985i<TContinuationResult> mo12456n(java.util.concurrent.Executor r5, p327s7.InterfaceC5984h<TResult, TContinuationResult> r6) {
            r4 = this;
            s7.q r0 = new s7.q
            r0.<init>()
            z2.n r1 = r4.f23097b
            s7.n r2 = new s7.n
            int r3 = p327s7.C5994r.f23102a
            r2.<init>(r5, r6, r0)
            r1.m14310g(r2)
            r4.m12476u()
            return r0
    }

    @Override // p327s7.AbstractC5985i
    /* renamed from: o */
    public final <TContinuationResult> p327s7.AbstractC5985i<TContinuationResult> mo12457o(p327s7.InterfaceC5984h<TResult, TContinuationResult> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = p327s7.C5987k.f23076a
            s7.i r2 = r1.mo12456n(r0, r2)
            return r2
    }

    /* renamed from: p */
    public final p327s7.AbstractC5985i<TResult> m12471p(java.util.concurrent.Executor r4, p327s7.InterfaceC5980d<TResult> r5) {
            r3 = this;
            z2.n r0 = r3.f23097b
            s7.n r1 = new s7.n
            int r2 = p327s7.C5994r.f23102a
            r1.<init>(r4, r5)
            r0.m14310g(r1)
            r3.m12476u()
            return r3
    }

    /* renamed from: q */
    public final void m12472q(java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "Exception must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r3, r0)
            java.lang.Object r0 = r2.f23096a
            monitor-enter(r0)
            r2.m12475t()     // Catch: java.lang.Throwable -> L17
            r1 = 1
            r2.f23098c = r1     // Catch: java.lang.Throwable -> L17
            r2.f23101f = r3     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            z2.n r3 = r2.f23097b
            r3.m14309f(r2)
            return
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    /* renamed from: r */
    public final void m12473r(TResult r3) {
            r2 = this;
            java.lang.Object r0 = r2.f23096a
            monitor-enter(r0)
            r2.m12475t()     // Catch: java.lang.Throwable -> L12
            r1 = 1
            r2.f23098c = r1     // Catch: java.lang.Throwable -> L12
            r2.f23100e = r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            z2.n r3 = r2.f23097b
            r3.m14309f(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    /* renamed from: s */
    public final boolean m12474s() {
            r2 = this;
            java.lang.Object r0 = r2.f23096a
            monitor-enter(r0)
            boolean r1 = r2.f23098c     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto La
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r1
        La:
            r1 = 1
            r2.f23098c = r1     // Catch: java.lang.Throwable -> L16
            r2.f23099d = r1     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            z2.n r0 = r2.f23097b
            r0.m14309f(r2)
            return r1
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    /* renamed from: t */
    public final void m12475t() {
            r5 = this;
            boolean r0 = r5.f23098c
            if (r0 == 0) goto L6a
            int r0 = p327s7.C5978b.f23074Y
            boolean r0 = r5.mo12454l()
            if (r0 == 0) goto L62
            java.lang.Exception r0 = r5.mo12450h()
            if (r0 == 0) goto L15
            java.lang.String r1 = "failure"
            goto L46
        L15:
            boolean r1 = r5.mo12455m()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r5.mo12451i()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = r2 + 7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "result "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L46
        L3b:
            boolean r1 = r5.mo12453k()
            if (r1 == 0) goto L44
            java.lang.String r1 = "cancellation"
            goto L46
        L44:
            java.lang.String r1 = "unknown issue"
        L46:
            s7.b r2 = new s7.b
            java.lang.String r3 = "Complete with: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L59
            java.lang.String r1 = r3.concat(r1)
            goto L5e
        L59:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L5e:
            r2.<init>(r1, r0)
            goto L69
        L62:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "DuplicateTaskCompletionException can only be created from completed Task."
            r2.<init>(r0)
        L69:
            throw r2
        L6a:
            return
    }

    /* renamed from: u */
    public final void m12476u() {
            r2 = this;
            java.lang.Object r0 = r2.f23096a
            monitor-enter(r0)
            boolean r1 = r2.f23098c     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            z2.n r0 = r2.f23097b
            r0.m14309f(r2)
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }
}
