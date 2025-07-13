package p292qd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.media.MusicService$reload$1", m7452f = "MusicService.kt", m7453l = {232}, m7454m = "invokeSuspend")
/* renamed from: qd.c */
/* loaded from: classes.dex */
public final class C5619c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f21861c0;

    /* renamed from: d0 */
    public final /* synthetic */ p292qd.ServiceC5617a f21862d0;

    public C5619c(p292qd.ServiceC5617a r1, p101fh.InterfaceC2172d<? super p292qd.C5619c> r2) {
            r0 = this;
            r0.f21862d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
            r1 = this;
            qd.c r2 = new qd.c
            qd.a r0 = r1.f21862d0
            r2.<init>(r0, r3)
            return r2
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
            r1 = this;
            vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
            fh.d r3 = (p101fh.InterfaceC2172d) r3
            qd.c r2 = new qd.c
            qd.a r0 = r1.f21862d0
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
            int r1 = r3.f21861c0
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p074e9.C1805a.m4540y(r4)
            goto L27
        Ld:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L15:
            p074e9.C1805a.m4540y(r4)
            qd.a r4 = r3.f21862d0
            rd.c r4 = r4.f21815g0
            if (r4 == 0) goto L2a
            r3.f21861c0 = r2
            java.lang.Object r4 = r4.mo2679R(r3)
            if (r4 != r0) goto L27
            return r0
        L27:
            ch.l r4 = ch.C0985l.f5061a
            return r4
        L2a:
            java.lang.String r4 = "mediaSource"
            p214m2.C4339q.m9713w(r4)
            r4 = 0
            throw r4
    }
}
