package androidx.lifecycle;

@p134hh.InterfaceC3044e(m7451c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m7452f = "Lifecycle.kt", m7453l = {}, m7454m = "invokeSuspend")
/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public final class C0464r extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public /* synthetic */ java.lang.Object f2559c0;

    /* renamed from: d0 */
    public final /* synthetic */ androidx.lifecycle.LifecycleCoroutineScopeImpl f2560d0;

    public C0464r(androidx.lifecycle.LifecycleCoroutineScopeImpl r1, p101fh.InterfaceC2172d r2) {
            r0 = this;
            r0.f2560d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
            r2 = this;
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r4, r0)
            androidx.lifecycle.r r0 = new androidx.lifecycle.r
            androidx.lifecycle.LifecycleCoroutineScopeImpl r1 = r2.f2560d0
            r0.<init>(r1, r4)
            r0.f2559c0 = r3
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public final java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
            r2 = this;
            fh.d r4 = (p101fh.InterfaceC2172d) r4
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r4, r0)
            androidx.lifecycle.r r0 = new androidx.lifecycle.r
            androidx.lifecycle.LifecycleCoroutineScopeImpl r1 = r2.f2560d0
            r0.<init>(r1, r4)
            r0.f2559c0 = r3
            ch.l r3 = ch.C0985l.f5061a
            r0.mo123o(r3)
            return r3
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r3) {
            r2 = this;
            p074e9.C1805a.m4540y(r3)
            java.lang.Object r3 = r2.f2559c0
            vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = r2.f2560d0
            androidx.lifecycle.o r0 = r0.f2435Y
            androidx.lifecycle.w r0 = (androidx.lifecycle.C0472w) r0
            androidx.lifecycle.o$c r0 = r0.f2564c
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2547Z
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L1f
            androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = r2.f2560d0
            androidx.lifecycle.o r0 = r3.f2435Y
            r0.mo1454a(r3)
            goto L28
        L1f:
            fh.g r3 = r3.mo1407l()
            r0 = 1
            r1 = 0
            p209lh.C4304a.m9612f(r3, r1, r0, r1)
        L28:
            ch.l r3 = ch.C0985l.f5061a
            return r3
    }
}
