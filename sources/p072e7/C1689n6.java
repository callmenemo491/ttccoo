package p072e7;

/* renamed from: e7.n6 */
/* loaded from: classes.dex */
public final class C1689n6 extends p072e7.AbstractC1699o6 {
    public /* synthetic */ C1689n6() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p072e7.AbstractC1699o6
    /* renamed from: a */
    public final void mo4346a(java.lang.Object r1, long r2) {
            r0 = this;
            java.lang.Object r1 = p072e7.C1651j8.m4304j(r1, r2)
            e7.f6 r1 = (p072e7.InterfaceC1609f6) r1
            r1.mo4128b()
            return
    }

    @Override // p072e7.AbstractC1699o6
    /* renamed from: b */
    public final <E> void mo4347b(java.lang.Object r5, java.lang.Object r6, long r7) {
            r4 = this;
            java.lang.Object r0 = p072e7.C1651j8.m4304j(r5, r7)
            e7.f6 r0 = (p072e7.InterfaceC1609f6) r0
            java.lang.Object r6 = p072e7.C1651j8.m4304j(r6, r7)
            e7.f6 r6 = (p072e7.InterfaceC1609f6) r6
            int r1 = r0.size()
            int r2 = r6.size()
            if (r1 <= 0) goto L26
            if (r2 <= 0) goto L26
            boolean r3 = r0.mo4129c()
            if (r3 != 0) goto L23
            int r2 = r2 + r1
            e7.f6 r0 = r0.mo4197s(r2)
        L23:
            r0.addAll(r6)
        L26:
            if (r1 > 0) goto L29
            goto L2a
        L29:
            r6 = r0
        L2a:
            e7.i8 r0 = p072e7.C1651j8.f7668c
            r0.m4264N(r5, r7, r6)
            return
    }
}
