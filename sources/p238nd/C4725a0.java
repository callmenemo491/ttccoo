package p238nd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager$1", m7452f = "EOSManager.kt", m7453l = {139}, m7454m = "invokeSuspend")
/* renamed from: nd.a0 */
/* loaded from: classes.dex */
public final class C4725a0 extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f18897c0;

    /* renamed from: d0 */
    public final /* synthetic */ p238nd.C4728b0 f18898d0;

    public C4725a0(p238nd.C4728b0 r1, p101fh.InterfaceC2172d<? super p238nd.C4725a0> r2) {
            r0 = this;
            r0.f18898d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
            r1 = this;
            nd.a0 r2 = new nd.a0
            nd.b0 r0 = r1.f18898d0
            r2.<init>(r0, r3)
            return r2
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
            r1 = this;
            vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
            fh.d r3 = (p101fh.InterfaceC2172d) r3
            nd.a0 r2 = new nd.a0
            nd.b0 r0 = r1.f18898d0
            r2.<init>(r0, r3)
            ch.l r3 = ch.C0985l.f5061a
            java.lang.Object r2 = r2.mo123o(r3)
            return r2
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r4) {
            r3 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r3.f18897c0
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p074e9.C1805a.m4540y(r4)
            goto L29
        Ld:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L15:
            p074e9.C1805a.m4540y(r4)
            nd.b0 r4 = r3.f18898d0
            io.tacocrypto.app.database.AppDatabase r4 = r4.f18907c
            hd.d r4 = r4.mo7713p()
            r3.f18897c0 = r2
            java.lang.Object r4 = r4.mo7445e(r3)
            if (r4 != r0) goto L29
            return r0
        L29:
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = p062dh.C1473i.m3996H(r4)
            id.b r4 = (id.C3131b) r4
            if (r4 == 0) goto L3a
            nd.b0 r0 = r3.f18898d0
            androidx.lifecycle.d0<id.b> r0 = r0.f18922r
            r0.mo1415j(r4)
        L3a:
            ch.l r4 = ch.C0985l.f5061a
            return r4
    }
}
