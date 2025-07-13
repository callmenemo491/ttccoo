package androidx.lifecycle;

@p134hh.InterfaceC3044e(m7451c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m7452f = "PausingDispatcher.kt", m7453l = {162}, m7454m = "invokeSuspend")
/* renamed from: androidx.lifecycle.h0 */
/* loaded from: classes.dex */
public final class C0445h0 extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<java.lang.Object>, java.lang.Object> {

    /* renamed from: c0 */
    public /* synthetic */ java.lang.Object f2504c0;

    /* renamed from: d0 */
    public int f2505d0;

    /* renamed from: e0 */
    public final /* synthetic */ androidx.lifecycle.AbstractC0458o f2506e0;

    /* renamed from: f0 */
    public final /* synthetic */ androidx.lifecycle.AbstractC0458o.c f2507f0;

    /* renamed from: g0 */
    public final /* synthetic */ mh.InterfaceC4624p f2508g0;

    public C0445h0(androidx.lifecycle.AbstractC0458o r1, androidx.lifecycle.AbstractC0458o.c r2, mh.InterfaceC4624p r3, p101fh.InterfaceC2172d r4) {
            r0 = this;
            r0.f2506e0 = r1
            r0.f2507f0 = r2
            r0.f2508g0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r5, p101fh.InterfaceC2172d<?> r6) {
            r4 = this;
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r6, r0)
            androidx.lifecycle.h0 r0 = new androidx.lifecycle.h0
            androidx.lifecycle.o r1 = r4.f2506e0
            androidx.lifecycle.o$c r2 = r4.f2507f0
            mh.p r3 = r4.f2508g0
            r0.<init>(r1, r2, r3, r6)
            r0.f2504c0 = r5
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public final java.lang.Object mo122l(p379vh.InterfaceC6686b0 r5, p101fh.InterfaceC2172d<java.lang.Object> r6) {
            r4 = this;
            fh.d r6 = (p101fh.InterfaceC2172d) r6
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r6, r0)
            androidx.lifecycle.h0 r0 = new androidx.lifecycle.h0
            androidx.lifecycle.o r1 = r4.f2506e0
            androidx.lifecycle.o$c r2 = r4.f2507f0
            mh.p r3 = r4.f2508g0
            r0.<init>(r1, r2, r3, r6)
            r0.f2504c0 = r5
            ch.l r5 = ch.C0985l.f5061a
            java.lang.Object r5 = r0.mo123o(r5)
            return r5
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r8) {
            r7 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r7.f2505d0
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r7.f2504c0
            androidx.lifecycle.LifecycleController r0 = (androidx.lifecycle.LifecycleController) r0
            p074e9.C1805a.m4540y(r8)     // Catch: java.lang.Throwable -> L11
            goto L50
        L11:
            r8 = move-exception
            goto L56
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            p074e9.C1805a.m4540y(r8)
            java.lang.Object r8 = r7.f2504c0
            vh.b0 r8 = (p379vh.InterfaceC6686b0) r8
            fh.g r8 = r8.mo1407l()
            int r1 = p379vh.InterfaceC6687b1.f25957X
            vh.b1$b r1 = p379vh.InterfaceC6687b1.b.f25958Y
            fh.g$a r8 = r8.get(r1)
            vh.b1 r8 = (p379vh.InterfaceC6687b1) r8
            if (r8 == 0) goto L5a
            androidx.lifecycle.g0 r1 = new androidx.lifecycle.g0
            r1.<init>()
            androidx.lifecycle.LifecycleController r3 = new androidx.lifecycle.LifecycleController
            androidx.lifecycle.o r4 = r7.f2506e0
            androidx.lifecycle.o$c r5 = r7.f2507f0
            androidx.lifecycle.j r6 = r1.f2497Z
            r3.<init>(r4, r5, r6, r8)
            mh.p r8 = r7.f2508g0     // Catch: java.lang.Throwable -> L54
            r7.f2504c0 = r3     // Catch: java.lang.Throwable -> L54
            r7.f2505d0 = r2     // Catch: java.lang.Throwable -> L54
            java.lang.Object r8 = p101fh.C2174f.m5710A(r1, r8, r7)     // Catch: java.lang.Throwable -> L54
            if (r8 != r0) goto L4f
            return r0
        L4f:
            r0 = r3
        L50:
            r0.m1405a()
            return r8
        L54:
            r8 = move-exception
            r0 = r3
        L56:
            r0.m1405a()
            throw r8
        L5a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "when[State] methods should have a parent job"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }
}
