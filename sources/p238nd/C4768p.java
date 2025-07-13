package p238nd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.CurrencyManager$refresh$1", m7452f = "CurrencyManager.kt", m7453l = {66}, m7454m = "invokeSuspend")
/* renamed from: nd.p */
/* loaded from: classes.dex */
public final class C4768p extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f19084c0;

    /* renamed from: d0 */
    public /* synthetic */ java.lang.Object f19085d0;

    public C4768p(p101fh.InterfaceC2172d<? super p238nd.C4768p> r2) {
            r1 = this;
            r0 = 2
            r1.<init>(r0, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
            r1 = this;
            nd.p r0 = new nd.p
            r0.<init>(r3)
            r0.f19085d0 = r2
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
            r1 = this;
            vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
            fh.d r3 = (p101fh.InterfaceC2172d) r3
            nd.p r0 = new nd.p
            r0.<init>(r3)
            r0.f19085d0 = r2
            ch.l r2 = ch.C0985l.f5061a
            java.lang.Object r2 = r0.mo123o(r2)
            return r2
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r4) {
            r3 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r3.f19084c0
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> L37
            goto L34
        Ld:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L15:
            p074e9.C1805a.m4540y(r4)
            java.lang.Object r4 = r3.f19085d0
            vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
            nd.b0$a r4 = p238nd.C4728b0.f18900D     // Catch: java.lang.Throwable -> L37
            nd.b0 r1 = r4.m10809a()     // Catch: java.lang.Throwable -> L37
            java.lang.Double r1 = r1.f18926v     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L34
            nd.b0 r4 = r4.m10809a()     // Catch: java.lang.Throwable -> L37
            r3.f19084c0 = r2     // Catch: java.lang.Throwable -> L37
            r1 = 0
            java.lang.Object r4 = r4.m10797j(r1, r3)     // Catch: java.lang.Throwable -> L37
            if (r4 != r0) goto L34
            return r0
        L34:
            ch.l r4 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r4 = move-exception
            java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
        L3c:
            java.lang.Throwable r4 = ch.C0979f.m2690b(r4)
            if (r4 == 0) goto L47
            hk.a$b r0 = hk.C3053a.f12282b
            r0.mo7468b(r4)
        L47:
            ch.l r4 = ch.C0985l.f5061a
            return r4
    }
}
