package p185k7;

/* renamed from: k7.s6 */
/* loaded from: classes.dex */
public final class C3975s6 extends p185k7.AbstractC3988t6 {
    public /* synthetic */ C3975s6() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.AbstractC3988t6
    /* renamed from: a */
    public final void mo8922a(java.lang.Object r1, long r2) {
            r0 = this;
            java.lang.Object r1 = p185k7.C3859j8.m8736j(r1, r2)
            k7.j6 r1 = (p185k7.InterfaceC3857j6) r1
            r1.mo8198b()
            return
    }

    @Override // p185k7.AbstractC3988t6
    /* renamed from: b */
    public final <E> void mo8923b(java.lang.Object r5, java.lang.Object r6, long r7) {
            r4 = this;
            java.lang.Object r0 = p185k7.C3859j8.m8736j(r5, r7)
            k7.j6 r0 = (p185k7.InterfaceC3857j6) r0
            java.lang.Object r6 = p185k7.C3859j8.m8736j(r6, r7)
            k7.j6 r6 = (p185k7.InterfaceC3857j6) r6
            int r1 = r0.size()
            int r2 = r6.size()
            if (r1 <= 0) goto L26
            if (r2 <= 0) goto L26
            boolean r3 = r0.mo8199c()
            if (r3 != 0) goto L23
            int r2 = r2 + r1
            k7.j6 r0 = r0.mo8299k(r2)
        L23:
            r0.addAll(r6)
        L26:
            if (r1 > 0) goto L29
            goto L2a
        L29:
            r6 = r0
        L2a:
            e7.i8 r0 = p185k7.C3859j8.f16708c
            r0.m4264N(r5, r7, r6)
            return
    }
}
