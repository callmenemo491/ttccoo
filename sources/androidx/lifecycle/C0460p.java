package androidx.lifecycle;

@p134hh.InterfaceC3044e(m7451c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m7452f = "Lifecycle.kt", m7453l = {87}, m7454m = "invokeSuspend")
/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public final class C0460p extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f2556c0;

    /* renamed from: d0 */
    public final /* synthetic */ androidx.lifecycle.AbstractC0462q f2557d0;

    /* renamed from: e0 */
    public final /* synthetic */ mh.InterfaceC4624p f2558e0;

    public C0460p(androidx.lifecycle.AbstractC0462q r1, mh.InterfaceC4624p r2, p101fh.InterfaceC2172d r3) {
            r0 = this;
            r0.f2557d0 = r1
            r0.f2558e0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
            r2 = this;
            java.lang.String r3 = "completion"
            p214m2.C4339q.m9706k(r4, r3)
            androidx.lifecycle.p r3 = new androidx.lifecycle.p
            androidx.lifecycle.q r0 = r2.f2557d0
            mh.p r1 = r2.f2558e0
            r3.<init>(r0, r1, r4)
            return r3
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public final java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
            r2 = this;
            fh.d r4 = (p101fh.InterfaceC2172d) r4
            java.lang.String r3 = "completion"
            p214m2.C4339q.m9706k(r4, r3)
            androidx.lifecycle.p r3 = new androidx.lifecycle.p
            androidx.lifecycle.q r0 = r2.f2557d0
            mh.p r1 = r2.f2558e0
            r3.<init>(r0, r1, r4)
            ch.l r4 = ch.C0985l.f5061a
            java.lang.Object r3 = r3.mo123o(r4)
            return r3
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r7) {
            r6 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r6.f2556c0
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p074e9.C1805a.m4540y(r7)
            goto L39
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            p074e9.C1805a.m4540y(r7)
            androidx.lifecycle.q r7 = r6.f2557d0
            androidx.lifecycle.o r7 = r7.mo1406h()
            mh.p r1 = r6.f2558e0
            r6.f2556c0 = r2
            androidx.lifecycle.o$c r2 = androidx.lifecycle.AbstractC0458o.c.f2549b0
            vh.z r3 = p379vh.C6716l0.f26007a
            vh.k1 r3 = p459zh.C7346l.f28106a
            vh.k1 r3 = r3.mo13640z0()
            androidx.lifecycle.h0 r4 = new androidx.lifecycle.h0
            r5 = 0
            r4.<init>(r7, r2, r1, r5)
            java.lang.Object r7 = p101fh.C2174f.m5710A(r3, r4, r6)
            if (r7 != r0) goto L39
            return r0
        L39:
            ch.l r7 = ch.C0985l.f5061a
            return r7
    }
}
