package p379vh;

/* renamed from: vh.u1 */
/* loaded from: classes.dex */
public final class C6744u1<T> extends p459zh.C7349o<T> {

    /* renamed from: b0 */
    public p101fh.InterfaceC2175g f26042b0;

    /* renamed from: c0 */
    public java.lang.Object f26043c0;

    public C6744u1(p101fh.InterfaceC2175g r3, p101fh.InterfaceC2172d<? super T> r4) {
            r2 = this;
            vh.v1 r0 = p379vh.C6747v1.f26045Y
            fh.g$a r1 = r3.get(r0)
            if (r1 != 0) goto Lc
            fh.g r3 = r3.plus(r0)
        Lc:
            r2.<init>(r3, r4)
            return
    }

    @Override // p459zh.C7349o, p379vh.AbstractC6682a
    /* renamed from: Y */
    public void mo13543Y(java.lang.Object r6) {
            r5 = this;
            fh.g r0 = r5.f26042b0
            r1 = 0
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.lang.Object r2 = r5.f26043c0
            p459zh.C7352r.m14436a(r0, r2)
            r5.f26042b0 = r1
            r5.f26043c0 = r1
        Lf:
            fh.d<T> r0 = r5.f28108a0
            java.lang.Object r6 = p209lh.C4304a.m9595A(r6, r0)
            fh.d<T> r0 = r5.f28108a0
            fh.g r2 = r0.mo5706c()
            java.lang.Object r3 = p459zh.C7352r.m14437b(r2, r1)
            zh.p r4 = p459zh.C7352r.f28111a
            if (r3 == r4) goto L27
            vh.u1 r1 = p379vh.C6751x.m13669b(r0, r2, r3)
        L27:
            fh.d<T> r0 = r5.f28108a0     // Catch: java.lang.Throwable -> L38
            r0.mo5707k(r6)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L34
            boolean r6 = r1.m13667b0()
            if (r6 == 0) goto L37
        L34:
            p459zh.C7352r.m14436a(r2, r3)
        L37:
            return
        L38:
            r6 = move-exception
            if (r1 == 0) goto L41
            boolean r0 = r1.m13667b0()
            if (r0 == 0) goto L44
        L41:
            p459zh.C7352r.m14436a(r2, r3)
        L44:
            throw r6
    }

    /* renamed from: b0 */
    public final boolean m13667b0() {
            r1 = this;
            fh.g r0 = r1.f26042b0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 0
            r1.f26042b0 = r0
            r1.f26043c0 = r0
            r0 = 1
            return r0
    }
}
