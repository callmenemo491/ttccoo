package p238nd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.SecretToolManager$refresh$1", m7452f = "SecretToolManager.kt", m7453l = {53}, m7454m = "invokeSuspend")
/* renamed from: nd.n1 */
/* loaded from: classes.dex */
public final class C4765n1 extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f19078c0;

    /* renamed from: d0 */
    public /* synthetic */ java.lang.Object f19079d0;

    /* renamed from: e0 */
    public final /* synthetic */ p238nd.C4756k1 f19080e0;

    /* renamed from: f0 */
    public final /* synthetic */ java.util.List<java.lang.String> f19081f0;

    public C4765n1(p238nd.C4756k1 r1, java.util.List<java.lang.String> r2, p101fh.InterfaceC2172d<? super p238nd.C4765n1> r3) {
            r0 = this;
            r0.f19080e0 = r1
            r0.f19081f0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
            r3 = this;
            nd.n1 r0 = new nd.n1
            nd.k1 r1 = r3.f19080e0
            java.util.List<java.lang.String> r2 = r3.f19081f0
            r0.<init>(r1, r2, r5)
            r0.f19079d0 = r4
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
            r3 = this;
            vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
            fh.d r5 = (p101fh.InterfaceC2172d) r5
            nd.n1 r0 = new nd.n1
            nd.k1 r1 = r3.f19080e0
            java.util.List<java.lang.String> r2 = r3.f19081f0
            r0.<init>(r1, r2, r5)
            r0.f19079d0 = r4
            ch.l r4 = ch.C0985l.f5061a
            java.lang.Object r4 = r0.mo123o(r4)
            return r4
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r4) {
            r3 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r3.f19078c0
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
            goto L2b
        Ld:
            r4 = move-exception
            goto L2e
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            p074e9.C1805a.m4540y(r4)
            java.lang.Object r4 = r3.f19079d0
            vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
            nd.k1 r4 = r3.f19080e0
            java.util.List<java.lang.String> r1 = r3.f19081f0
            r3.f19078c0 = r2     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r4 = r4.m10829b(r1, r3)     // Catch: java.lang.Throwable -> Ld
            if (r4 != r0) goto L2b
            return r0
        L2b:
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> Ld
            goto L31
        L2e:
            p074e9.C1805a.m4520e(r4)
        L31:
            nd.k1 r4 = r3.f19080e0
            r0 = 0
            r4.f19063f = r0
            ch.l r4 = ch.C0985l.f5061a
            return r4
    }
}
