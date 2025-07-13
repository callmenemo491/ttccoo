package p238nd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager$removeWallet$1", m7452f = "EOSManager.kt", m7453l = {2272, 2274}, m7454m = "invokeSuspend")
/* renamed from: nd.t0 */
/* loaded from: classes.dex */
public final class C4777t0 extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f19113c0;

    /* renamed from: d0 */
    public final /* synthetic */ p238nd.C4728b0 f19114d0;

    /* renamed from: e0 */
    public final /* synthetic */ id.C3131b f19115e0;

    public C4777t0(p238nd.C4728b0 r1, id.C3131b r2, p101fh.InterfaceC2172d<? super p238nd.C4777t0> r3) {
            r0 = this;
            r0.f19114d0 = r1
            r0.f19115e0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
            r2 = this;
            nd.t0 r3 = new nd.t0
            nd.b0 r0 = r2.f19114d0
            id.b r1 = r2.f19115e0
            r3.<init>(r0, r1, r4)
            return r3
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
            r2 = this;
            vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
            fh.d r4 = (p101fh.InterfaceC2172d) r4
            nd.t0 r3 = new nd.t0
            nd.b0 r0 = r2.f19114d0
            id.b r1 = r2.f19115e0
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
            int r1 = r6.f19113c0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            p074e9.C1805a.m4540y(r7)
            goto L48
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            p074e9.C1805a.m4540y(r7)
            goto L37
        L1c:
            p074e9.C1805a.m4540y(r7)
            nd.b0 r7 = r6.f19114d0
            io.tacocrypto.app.database.AppDatabase r7 = r7.f18907c
            hd.d r7 = r7.mo7713p()
            id.b[] r1 = new id.C3131b[r3]
            r4 = 0
            id.b r5 = r6.f19115e0
            r1[r4] = r5
            r6.f19113c0 = r3
            java.lang.Object r7 = r7.mo7444d(r1, r6)
            if (r7 != r0) goto L37
            return r0
        L37:
            nd.b0 r7 = r6.f19114d0
            io.tacocrypto.app.database.AppDatabase r7 = r7.f18907c
            hd.d r7 = r7.mo7713p()
            r6.f19113c0 = r2
            java.lang.Object r7 = r7.mo7445e(r6)
            if (r7 != r0) goto L48
            return r0
        L48:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = p062dh.C1473i.m3996H(r7)
            id.b r7 = (id.C3131b) r7
            if (r7 == 0) goto L59
            nd.b0 r0 = r6.f19114d0
            androidx.lifecycle.d0<id.b> r0 = r0.f18922r
            r0.mo1415j(r7)
        L59:
            ch.l r7 = ch.C0985l.f5061a
            return r7
    }
}
