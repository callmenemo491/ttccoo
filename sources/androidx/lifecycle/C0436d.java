package androidx.lifecycle;

@p134hh.InterfaceC3044e(m7451c = "androidx.lifecycle.BlockRunner$maybeRun$1", m7452f = "CoroutineLiveData.kt", m7453l = {176}, m7454m = "invokeSuspend")
/* renamed from: androidx.lifecycle.d */
/* loaded from: classes.dex */
public final class C0436d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public /* synthetic */ java.lang.Object f2479c0;

    /* renamed from: d0 */
    public int f2480d0;

    /* renamed from: e0 */
    public final /* synthetic */ androidx.lifecycle.C0438e f2481e0;

    public C0436d(androidx.lifecycle.C0438e r1, p101fh.InterfaceC2172d r2) {
            r0 = this;
            r0.f2481e0 = r1
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
            androidx.lifecycle.d r0 = new androidx.lifecycle.d
            androidx.lifecycle.e r1 = r2.f2481e0
            r0.<init>(r1, r4)
            r0.f2479c0 = r3
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public final java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
            r2 = this;
            fh.d r4 = (p101fh.InterfaceC2172d) r4
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r4, r0)
            androidx.lifecycle.d r0 = new androidx.lifecycle.d
            androidx.lifecycle.e r1 = r2.f2481e0
            r0.<init>(r1, r4)
            r0.f2479c0 = r3
            ch.l r3 = ch.C0985l.f5061a
            java.lang.Object r3 = r0.mo123o(r3)
            return r3
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r5) {
            r4 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r4.f2480d0
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p074e9.C1805a.m4540y(r5)
            goto L36
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            p074e9.C1805a.m4540y(r5)
            java.lang.Object r5 = r4.f2479c0
            vh.b0 r5 = (p379vh.InterfaceC6686b0) r5
            androidx.lifecycle.a0 r1 = new androidx.lifecycle.a0
            androidx.lifecycle.e r3 = r4.f2481e0
            androidx.lifecycle.h<T> r3 = r3.f2484c
            fh.g r5 = r5.mo1407l()
            r1.<init>(r3, r5)
            androidx.lifecycle.e r5 = r4.f2481e0
            mh.p<androidx.lifecycle.z<T>, fh.d<? super ch.l>, java.lang.Object> r5 = r5.f2485d
            r4.f2480d0 = r2
            java.lang.Object r5 = r5.mo122l(r1, r4)
            if (r5 != r0) goto L36
            return r0
        L36:
            androidx.lifecycle.e r5 = r4.f2481e0
            mh.a<ch.l> r5 = r5.f2488g
            r5.mo15e()
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
