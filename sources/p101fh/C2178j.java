package p101fh;

/* renamed from: fh.j */
/* loaded from: classes.dex */
public final class C2178j<T> implements p101fh.InterfaceC2172d<T>, p134hh.InterfaceC3043d {

    /* renamed from: Z */
    @java.lang.Deprecated
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p101fh.C2178j<?>, java.lang.Object> f9919Z = null;

    /* renamed from: Y */
    public final p101fh.InterfaceC2172d<T> f9920Y;
    private volatile java.lang.Object result;

    static {
            java.lang.Class<fh.j> r0 = p101fh.C2178j.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "result"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            p101fh.C2178j.f9919Z = r0
            return
    }

    public C2178j(p101fh.InterfaceC2172d<? super T> r2) {
            r1 = this;
            gh.a r0 = gh.EnumC2389a.f10765Z
            r1.<init>()
            r1.f9920Y = r2
            r1.result = r0
            return
    }

    /* renamed from: a */
    public final java.lang.Object m5741a() {
            r3 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            java.lang.Object r1 = r3.result
            gh.a r2 = gh.EnumC2389a.f10765Z
            if (r1 != r2) goto L13
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<fh.j<?>, java.lang.Object> r1 = p101fh.C2178j.f9919Z
            boolean r1 = r1.compareAndSet(r3, r2, r0)
            if (r1 == 0) goto L11
            return r0
        L11:
            java.lang.Object r1 = r3.result
        L13:
            gh.a r2 = gh.EnumC2389a.f10766a0
            if (r1 != r2) goto L18
            goto L1d
        L18:
            boolean r0 = r1 instanceof ch.C0979f.a
            if (r0 != 0) goto L1e
            r0 = r1
        L1d:
            return r0
        L1e:
            ch.f$a r1 = (ch.C0979f.a) r1
            java.lang.Throwable r0 = r1.f5053Y
            throw r0
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: c */
    public p101fh.InterfaceC2175g mo5706c() {
            r1 = this;
            fh.d<T> r0 = r1.f9920Y
            fh.g r0 = r0.mo5706c()
            return r0
    }

    @Override // p134hh.InterfaceC3043d
    /* renamed from: j */
    public p134hh.InterfaceC3043d mo5742j() {
            r2 = this;
            fh.d<T> r0 = r2.f9920Y
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
    public void mo5707k(java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.result
            gh.a r1 = gh.EnumC2389a.f10765Z
            if (r0 != r1) goto Lf
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<fh.j<?>, java.lang.Object> r0 = p101fh.C2178j.f9919Z
            boolean r0 = r0.compareAndSet(r3, r1, r4)
            if (r0 == 0) goto L0
            return
        Lf:
            gh.a r1 = gh.EnumC2389a.f10764Y
            if (r0 != r1) goto L23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<fh.j<?>, java.lang.Object> r0 = p101fh.C2178j.f9919Z
            gh.a r2 = gh.EnumC2389a.f10766a0
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            fh.d<T> r0 = r3.f9920Y
            r0.mo5707k(r4)
            return
        L23:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r4.<init>(r0)
            throw r4
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "SafeContinuation for "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            fh.d<T> r1 = r2.f9920Y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
