package androidx.lifecycle;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends androidx.lifecycle.AbstractC0462q implements androidx.lifecycle.InterfaceC0468t {

    /* renamed from: Y */
    public final androidx.lifecycle.AbstractC0458o f2435Y;

    /* renamed from: Z */
    public final p101fh.InterfaceC2175g f2436Z;

    public LifecycleCoroutineScopeImpl(androidx.lifecycle.AbstractC0458o r2, p101fh.InterfaceC2175g r3) {
            r1 = this;
            java.lang.String r0 = "coroutineContext"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f2435Y = r2
            r1.f2436Z = r3
            androidx.lifecycle.w r2 = (androidx.lifecycle.C0472w) r2
            androidx.lifecycle.o$c r2 = r2.f2564c
            androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2546Y
            if (r2 != r0) goto L18
            r2 = 0
            p209lh.C4304a.m9611e(r3, r2)
        L18:
            return
    }

    @Override // androidx.lifecycle.InterfaceC0468t
    /* renamed from: d */
    public void mo435d(androidx.lifecycle.InterfaceC0471v r2, androidx.lifecycle.AbstractC0458o.b r3) {
            r1 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r2 = "event"
            p214m2.C4339q.m9706k(r3, r2)
            androidx.lifecycle.o r2 = r1.f2435Y
            androidx.lifecycle.w r2 = (androidx.lifecycle.C0472w) r2
            androidx.lifecycle.o$c r2 = r2.f2564c
            androidx.lifecycle.o$c r3 = androidx.lifecycle.AbstractC0458o.c.f2546Y
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L2d
            androidx.lifecycle.o r2 = r1.f2435Y
            androidx.lifecycle.w r2 = (androidx.lifecycle.C0472w) r2
            java.lang.String r3 = "removeObserver"
            r2.m1461d(r3)
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r2 = r2.f2563b
            r2.mo10456l(r1)
            fh.g r2 = r1.f2436Z
            r3 = 1
            r0 = 0
            p209lh.C4304a.m9612f(r2, r0, r3, r0)
        L2d:
            return
    }

    @Override // androidx.lifecycle.AbstractC0462q
    /* renamed from: h */
    public androidx.lifecycle.AbstractC0458o mo1406h() {
            r1 = this;
            androidx.lifecycle.o r0 = r1.f2435Y
            return r0
    }

    @Override // p379vh.InterfaceC6686b0
    /* renamed from: l */
    public p101fh.InterfaceC2175g mo1407l() {
            r1 = this;
            fh.g r0 = r1.f2436Z
            return r0
    }
}
