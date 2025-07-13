package p292qd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.media.MusicService$reloadIfEmpty$1", m7452f = "MusicService.kt", m7453l = {239}, m7454m = "invokeSuspend")
/* renamed from: qd.d */
/* loaded from: classes.dex */
public final class C5620d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f21863c0;

    /* renamed from: d0 */
    public final /* synthetic */ p292qd.ServiceC5617a f21864d0;

    public C5620d(p292qd.ServiceC5617a r1, p101fh.InterfaceC2172d<? super p292qd.C5620d> r2) {
            r0 = this;
            r0.f21864d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
            r1 = this;
            qd.d r2 = new qd.d
            qd.a r0 = r1.f21864d0
            r2.<init>(r0, r3)
            return r2
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
            r1 = this;
            vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
            fh.d r3 = (p101fh.InterfaceC2172d) r3
            qd.d r2 = new qd.d
            qd.a r0 = r1.f21864d0
            r2.<init>(r0, r3)
            ch.l r3 = ch.C0985l.f5061a
            java.lang.Object r2 = r2.mo123o(r3)
            return r2
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r5) {
            r4 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r4.f21863c0
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p074e9.C1805a.m4540y(r5)
            goto L3e
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            p074e9.C1805a.m4540y(r5)
            qd.a r5 = r4.f21864d0
            rd.c r5 = r5.f21815g0
            r1 = 0
            java.lang.String r3 = "mediaSource"
            if (r5 == 0) goto L41
            java.util.List r5 = p062dh.C1473i.m4007S(r5)
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3e
            qd.a r5 = r4.f21864d0
            rd.c r5 = r5.f21815g0
            if (r5 == 0) goto L3a
            r4.f21863c0 = r2
            java.lang.Object r5 = r5.mo2679R(r4)
            if (r5 != r0) goto L3e
            return r0
        L3a:
            p214m2.C4339q.m9713w(r3)
            throw r1
        L3e:
            ch.l r5 = ch.C0985l.f5061a
            return r5
        L41:
            p214m2.C4339q.m9713w(r3)
            throw r1
    }
}
