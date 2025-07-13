package p459zh;

/* renamed from: zh.e */
/* loaded from: classes.dex */
public final class C7339e<T> extends p379vh.AbstractC6710j0<T> implements p134hh.InterfaceC3043d, p101fh.InterfaceC2172d<T> {

    /* renamed from: f0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f28084f0 = null;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation;

    /* renamed from: b0 */
    public final p379vh.AbstractC6755z f28085b0;

    /* renamed from: c0 */
    public final p101fh.InterfaceC2172d<T> f28086c0;

    /* renamed from: d0 */
    public java.lang.Object f28087d0;

    /* renamed from: e0 */
    public final java.lang.Object f28088e0;

    static {
            java.lang.Class<zh.e> r0 = p459zh.C7339e.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_reusableCancellableContinuation"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            p459zh.C7339e.f28084f0 = r0
            return
    }

    public C7339e(p379vh.AbstractC6755z r2, p101fh.InterfaceC2172d<? super T> r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.f28085b0 = r2
            r1.f28086c0 = r3
            zh.p r2 = p459zh.C7340f.f28089a
            r1.f28087d0 = r2
            fh.g r2 = r1.mo5706c()
            zh.p r3 = p459zh.C7352r.f28111a
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            zh.r$a r0 = p459zh.C7352r.a.f28112Z
            java.lang.Object r2 = r2.fold(r3, r0)
            p214m2.C4339q.m9704i(r2)
            r1.f28088e0 = r2
            r2 = 0
            r1._reusableCancellableContinuation = r2
            return
    }

    @Override // p379vh.AbstractC6710j0
    /* renamed from: a */
    public void mo13622a(java.lang.Object r2, java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r2 instanceof p379vh.C6742u
            if (r0 == 0) goto Lb
            vh.u r2 = (p379vh.C6742u) r2
            mh.l<java.lang.Throwable, ch.l> r2 = r2.f26040b
            r2.mo107b(r3)
        Lb:
            return
    }

    @Override // p379vh.AbstractC6710j0
    /* renamed from: b */
    public p101fh.InterfaceC2172d<T> mo13623b() {
            r0 = this;
            return r0
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: c */
    public p101fh.InterfaceC2175g mo5706c() {
            r1 = this;
            fh.d<T> r0 = r1.f28086c0
            fh.g r0 = r0.mo5706c()
            return r0
    }

    @Override // p379vh.AbstractC6710j0
    /* renamed from: i */
    public java.lang.Object mo13626i() {
            r2 = this;
            java.lang.Object r0 = r2.f28087d0
            zh.p r1 = p459zh.C7340f.f28089a
            r2.f28087d0 = r1
            return r0
    }

    @Override // p134hh.InterfaceC3043d
    /* renamed from: j */
    public p134hh.InterfaceC3043d mo5742j() {
            r2 = this;
            fh.d<T> r0 = r2.f28086c0
            boolean r1 = r0 instanceof p134hh.InterfaceC3043d
            if (r1 == 0) goto L9
            hh.d r0 = (p134hh.InterfaceC3043d) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: k */
    public void mo5707k(java.lang.Object r7) {
            r6 = this;
            fh.d<T> r0 = r6.f28086c0
            fh.g r0 = r0.mo5706c()
            r1 = 0
            java.lang.Object r2 = p209lh.C4304a.m9604J(r7, r1)
            vh.z r3 = r6.f28085b0
            boolean r3 = r3.mo1433y0(r0)
            r4 = 0
            if (r3 == 0) goto L1e
            r6.f28087d0 = r2
            r6.f26003a0 = r4
            vh.z r7 = r6.f28085b0
            r7.mo156x0(r0, r6)
            goto L5b
        L1e:
            vh.s1 r0 = p379vh.C6738s1.f26034a
            vh.o0 r0 = p379vh.C6738s1.m13665a()
            boolean r3 = r0.m13646D0()
            if (r3 == 0) goto L32
            r6.f28087d0 = r2
            r6.f26003a0 = r4
            r0.m13644B0(r6)
            goto L5b
        L32:
            r2 = 1
            r0.m13645C0(r2)
            fh.g r3 = r6.mo5706c()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r6.f28088e0     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = p459zh.C7352r.m14437b(r3, r4)     // Catch: java.lang.Throwable -> L54
            fh.d<T> r5 = r6.f28086c0     // Catch: java.lang.Throwable -> L4f
            r5.mo5707k(r7)     // Catch: java.lang.Throwable -> L4f
            p459zh.C7352r.m14436a(r3, r4)     // Catch: java.lang.Throwable -> L54
        L48:
            boolean r7 = r0.m13647E0()     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L48
            goto L58
        L4f:
            r7 = move-exception
            p459zh.C7352r.m14436a(r3, r4)     // Catch: java.lang.Throwable -> L54
            throw r7     // Catch: java.lang.Throwable -> L54
        L54:
            r7 = move-exception
            r6.m13638h(r7, r1)     // Catch: java.lang.Throwable -> L5c
        L58:
            r0.m13648z0(r2)
        L5b:
            return
        L5c:
            r7 = move-exception
            r0.m13648z0(r2)
            throw r7
    }

    /* renamed from: l */
    public final boolean m14413l() {
            r1 = this;
            java.lang.Object r0 = r1._reusableCancellableContinuation
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: n */
    public final boolean m14414n(java.lang.Throwable r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._reusableCancellableContinuation
            zh.p r1 = p459zh.C7340f.f28090b
            boolean r2 = p214m2.C4339q.m9702c(r0, r1)
            r3 = 1
            if (r2 == 0) goto L14
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p459zh.C7339e.f28084f0
            boolean r0 = r0.compareAndSet(r4, r1, r5)
            if (r0 == 0) goto L0
            return r3
        L14:
            boolean r1 = r0 instanceof java.lang.Throwable
            if (r1 == 0) goto L19
            return r3
        L19:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7339e.f28084f0
            r2 = 0
            boolean r0 = r1.compareAndSet(r4, r0, r2)
            if (r0 == 0) goto L0
            r5 = 0
            return r5
    }

    /* renamed from: o */
    public final void m14415o() {
            r2 = this;
            java.lang.Object r0 = r2._reusableCancellableContinuation
            boolean r1 = r0 instanceof p379vh.C6706i
            if (r1 == 0) goto L9
            vh.i r0 = (p379vh.C6706i) r0
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Ld
            goto L10
        Ld:
            r0.m13630s()
        L10:
            return
    }

    /* renamed from: s */
    public final java.lang.Throwable m14416s(p379vh.InterfaceC6703h<?> r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._reusableCancellableContinuation
            zh.p r1 = p459zh.C7340f.f28090b
            r2 = 0
            if (r0 != r1) goto L10
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p459zh.C7339e.f28084f0
            boolean r0 = r0.compareAndSet(r3, r1, r4)
            if (r0 == 0) goto L0
            return r2
        L10:
            boolean r4 = r0 instanceof java.lang.Throwable
            if (r4 == 0) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p459zh.C7339e.f28084f0
            boolean r4 = r4.compareAndSet(r3, r0, r2)
            if (r4 == 0) goto L1f
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L1f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L2b:
            java.lang.String r4 = "Inconsistent state "
            java.lang.String r4 = p214m2.C4339q.m9711u(r4, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DispatchedContinuation["
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            vh.z r1 = r2.f28085b0
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            fh.d<T> r1 = r2.f28086c0
            java.lang.String r1 = gh.C2390b.m6136z(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
