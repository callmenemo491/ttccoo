package p379vh;

/* renamed from: vh.e */
/* loaded from: classes.dex */
public final class C6694e extends p379vh.AbstractC6697f {

    /* renamed from: Y */
    public final /* synthetic */ int f25969Y;

    /* renamed from: Z */
    public final java.util.concurrent.Future<?> f25970Z;

    public C6694e(java.util.concurrent.Future r2) {
            r1 = this;
            r0 = 0
            r1.f25969Y = r0
            r1.<init>()
            r1.f25970Z = r2
            return
    }

    public C6694e(mh.InterfaceC4620l r2) {
            r1 = this;
            r0 = 2
            r1.f25969Y = r0
            r1.<init>()
            r1.f25970Z = r2
            return
    }

    public C6694e(p379vh.InterfaceC6719m0 r2) {
            r1 = this;
            r0 = 1
            r1.f25969Y = r0
            r1.<init>()
            r1.f25970Z = r2
            return
    }

    @Override // p379vh.AbstractC6700g
    /* renamed from: a */
    public void mo13559a(java.lang.Throwable r2) {
            r1 = this;
            int r0 = r1.f25969Y
            switch(r0) {
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L19
        L6:
            java.util.concurrent.Future<?> r2 = r1.f25970Z
            vh.m0 r2 = (p379vh.InterfaceC6719m0) r2
            r2.mo13570h()
            return
        Le:
            if (r2 == 0) goto L18
            java.util.concurrent.Future<?> r2 = r1.f25970Z
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            r0 = 0
            r2.cancel(r0)
        L18:
            return
        L19:
            java.util.concurrent.Future<?> r0 = r1.f25970Z
            mh.l r0 = (mh.InterfaceC4620l) r0
            r0.mo107b(r2)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public /* bridge */ /* synthetic */ ch.C0985l mo107b(java.lang.Throwable r2) {
            r1 = this;
            int r0 = r1.f25969Y
            switch(r0) {
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.mo13559a(r2)
            ch.l r2 = ch.C0985l.f5061a
            return r2
        Le:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.mo13559a(r2)
            ch.l r2 = ch.C0985l.f5061a
            return r2
        L16:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.mo13559a(r2)
            ch.l r2 = ch.C0985l.f5061a
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f25969Y
            r1 = 93
            switch(r0) {
                case 0: goto L21;
                case 1: goto L8;
                default: goto L7;
            }
        L7:
            goto L3a
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "DisposeOnCancel["
            r0.append(r2)
            java.util.concurrent.Future<?> r2 = r3.f25970Z
            vh.m0 r2 = (p379vh.InterfaceC6719m0) r2
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L21:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "CancelFutureOnCancel["
            r0.append(r2)
            java.util.concurrent.Future<?> r2 = r3.f25970Z
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "InvokeOnCancel["
            r0.append(r2)
            java.util.concurrent.Future<?> r2 = r3.f25970Z
            mh.l r2 = (mh.InterfaceC4620l) r2
            java.lang.String r2 = gh.C2390b.m6120j(r2)
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            java.lang.String r2 = gh.C2390b.m6121k(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
