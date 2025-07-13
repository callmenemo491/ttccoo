package p379vh;

/* renamed from: vh.a1 */
/* loaded from: classes.dex */
public final class C6684a1 extends p379vh.AbstractC6699f1 {

    /* renamed from: c0 */
    public final /* synthetic */ int f25954c0;

    /* renamed from: d0 */
    public final mh.InterfaceC4620l<java.lang.Throwable, ch.C0985l> f25955d0;

    public C6684a1(mh.InterfaceC4620l r2) {
            r1 = this;
            r0 = 0
            r1.f25954c0 = r0
            r1.<init>()
            r1.f25955d0 = r2
            return
    }

    public C6684a1(p379vh.C6706i r2) {
            r1 = this;
            r0 = 1
            r1.f25954c0 = r0
            r1.<init>()
            r1.f25955d0 = r2
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public /* bridge */ /* synthetic */ ch.C0985l mo107b(java.lang.Throwable r2) {
            r1 = this;
            int r0 = r1.f25954c0
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.mo13549q(r2)
            ch.l r2 = ch.C0985l.f5061a
            return r2
        Le:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.mo13549q(r2)
            ch.l r2 = ch.C0985l.f5061a
            return r2
    }

    @Override // p379vh.AbstractC6745v
    /* renamed from: q */
    public void mo13549q(java.lang.Throwable r2) {
            r1 = this;
            int r0 = r1.f25954c0
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            mh.l<java.lang.Throwable, ch.l> r0 = r1.f25955d0
            mh.l r0 = (mh.InterfaceC4620l) r0
            r0.mo107b(r2)
            return
        Le:
            vh.g1 r2 = r1.m13571r()
            java.lang.Object r2 = r2.m13573C()
            boolean r0 = r2 instanceof p379vh.C6739t
            if (r0 == 0) goto L27
            mh.l<java.lang.Throwable, ch.l> r0 = r1.f25955d0
            vh.i r0 = (p379vh.C6706i) r0
            vh.t r2 = (p379vh.C6739t) r2
            java.lang.Throwable r2 = r2.f26037a
            java.lang.Object r2 = p074e9.C1805a.m4520e(r2)
            goto L2f
        L27:
            mh.l<java.lang.Throwable, ch.l> r0 = r1.f25955d0
            vh.i r0 = (p379vh.C6706i) r0
            java.lang.Object r2 = p379vh.C6705h1.m13616a(r2)
        L2f:
            r0.mo5707k(r2)
            return
    }
}
