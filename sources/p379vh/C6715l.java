package p379vh;

/* renamed from: vh.l */
/* loaded from: classes.dex */
public final class C6715l extends p379vh.AbstractC6693d1 {

    /* renamed from: c0 */
    public final p379vh.C6706i<?> f26006c0;

    public C6715l(p379vh.C6706i<?> r1) {
            r0 = this;
            r0.<init>()
            r0.f26006c0 = r1
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public /* bridge */ /* synthetic */ ch.C0985l mo107b(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.mo13549q(r1)
            ch.l r1 = ch.C0985l.f5061a
            return r1
    }

    @Override // p379vh.AbstractC6745v
    /* renamed from: q */
    public void mo13549q(java.lang.Throwable r3) {
            r2 = this;
            vh.i<?> r3 = r2.f26006c0
            vh.g1 r0 = r2.m13571r()
            java.lang.Throwable r0 = r3.mo13599v(r0)
            boolean r1 = r3.m13617A()
            if (r1 != 0) goto L12
            r1 = 0
            goto L1a
        L12:
            fh.d<T> r1 = r3.f25997b0
            zh.e r1 = (p459zh.C7339e) r1
            boolean r1 = r1.m14414n(r0)
        L1a:
            if (r1 == 0) goto L1d
            goto L23
        L1d:
            r3.mo13611m(r0)
            r3.m13631t()
        L23:
            return
    }
}
