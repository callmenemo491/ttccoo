package ve;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.bcbrawlers.heal.HealBrawlersDialogViewModel$refresh$1", m7452f = "HealBrawlersDialogViewModel.kt", m7453l = {63}, m7454m = "invokeSuspend")
/* renamed from: ve.b */
/* loaded from: classes.dex */
public final class C6653b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f25875c0;

    /* renamed from: d0 */
    public /* synthetic */ java.lang.Object f25876d0;

    /* renamed from: e0 */
    public final /* synthetic */ ve.C6654c f25877e0;

    public C6653b(ve.C6654c r1, p101fh.InterfaceC2172d<? super ve.C6653b> r2) {
            r0 = this;
            r0.f25877e0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
            r2 = this;
            ve.b r0 = new ve.b
            ve.c r1 = r2.f25877e0
            r0.<init>(r1, r4)
            r0.f25876d0 = r3
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
            r2 = this;
            vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
            fh.d r4 = (p101fh.InterfaceC2172d) r4
            ve.b r0 = new ve.b
            ve.c r1 = r2.f25877e0
            r0.<init>(r1, r4)
            r0.f25876d0 = r3
            ch.l r3 = ch.C0985l.f5061a
            java.lang.Object r3 = r0.mo123o(r3)
            return r3
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r8) {
            r7 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r7.f25875c0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r7.f25876d0
            ve.c r0 = (ve.C6654c) r0
            p074e9.C1805a.m4540y(r8)     // Catch: java.lang.Throwable -> L12
            goto L34
        L12:
            r8 = move-exception
            goto L7d
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            p074e9.C1805a.m4540y(r8)
            java.lang.Object r8 = r7.f25876d0
            vh.b0 r8 = (p379vh.InterfaceC6686b0) r8
            ve.c r8 = r7.f25877e0
            nd.b0 r1 = r8.f25878c     // Catch: java.lang.Throwable -> L12
            r7.f25876d0 = r8     // Catch: java.lang.Throwable -> L12
            r7.f25875c0 = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = p238nd.C4728b0.m10789e(r1, r2, r7, r3)     // Catch: java.lang.Throwable -> L12
            if (r1 != r0) goto L32
            return r0
        L32:
            r0 = r8
            r8 = r1
        L34:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L12
        L3a:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L65
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L12
            r4 = r1
            od.b0 r4 = (p255od.C5194b0) r4     // Catch: java.lang.Throwable -> L12
            java.lang.String r5 = r4.getCurrency()     // Catch: java.lang.Throwable -> L12
            java.lang.String r6 = "BRWL"
            boolean r5 = p214m2.C4339q.m9702c(r5, r6)     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L61
            java.lang.String r4 = r4.getContract()     // Catch: java.lang.Throwable -> L12
            java.lang.String r5 = "brawlertoken"
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)     // Catch: java.lang.Throwable -> L12
            if (r4 == 0) goto L61
            r4 = 1
            goto L62
        L61:
            r4 = 0
        L62:
            if (r4 == 0) goto L3a
            r2 = r1
        L65:
            od.b0 r2 = (p255od.C5194b0) r2     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L6e
            double r1 = r2.getAmount()     // Catch: java.lang.Throwable -> L12
            goto L70
        L6e:
            r1 = 0
        L70:
            androidx.lifecycle.d0<java.lang.Double> r8 = r0.f25882g     // Catch: java.lang.Throwable -> L12
            java.lang.Double r0 = new java.lang.Double     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
            r8.mo1415j(r0)     // Catch: java.lang.Throwable -> L12
            ch.l r8 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L12
            goto L81
        L7d:
            java.lang.Object r8 = p074e9.C1805a.m4520e(r8)
        L81:
            ve.c r0 = r7.f25877e0
            java.lang.Throwable r8 = ch.C0979f.m2690b(r8)
            if (r8 == 0) goto La0
            java.lang.String r8 = vg.C6672m.m13514a(r8)
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f25881f
            vg.b r1 = new vg.b
            ah.a r2 = new ah.a
            zg.d r3 = p458zg.EnumC7332d.f28068Z
            java.lang.String r4 = "Error"
            r2.<init>(r4, r8, r3)
            r1.<init>(r2)
            r0.mo1415j(r1)
        La0:
            ve.c r8 = r7.f25877e0
            androidx.lifecycle.d0<java.lang.Boolean> r8 = r8.f25879d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.mo1415j(r0)
            ch.l r8 = ch.C0985l.f5061a
            return r8
    }
}
