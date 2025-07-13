package p124h7;

/* renamed from: h7.l */
/* loaded from: classes.dex */
public final class C2719l extends p124h7.AbstractC2737m {
    public /* synthetic */ C2719l() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.AbstractC2737m
    /* renamed from: a */
    public final <L> java.util.List<L> mo6884a(java.lang.Object r3, long r4) {
            r2 = this;
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r3, r4)
            h7.c r0 = (p124h7.InterfaceC2557c) r0
            boolean r1 = r0.mo6520c()
            if (r1 != 0) goto L1f
            int r1 = r0.size()
            if (r1 != 0) goto L15
            r1 = 10
            goto L16
        L15:
            int r1 = r1 + r1
        L16:
            h7.c r0 = r0.mo6521k(r1)
            e7.i8 r1 = p124h7.C2577d1.f11435c
            r1.m4264N(r3, r4, r0)
        L1f:
            return r0
    }

    @Override // p124h7.AbstractC2737m
    /* renamed from: b */
    public final void mo6885b(java.lang.Object r1, long r2) {
            r0 = this;
            java.lang.Object r1 = p124h7.C2577d1.m6550j(r1, r2)
            h7.c r1 = (p124h7.InterfaceC2557c) r1
            r1.mo6519b()
            return
    }

    @Override // p124h7.AbstractC2737m
    /* renamed from: c */
    public final <E> void mo6886c(java.lang.Object r5, java.lang.Object r6, long r7) {
            r4 = this;
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r5, r7)
            h7.c r0 = (p124h7.InterfaceC2557c) r0
            java.lang.Object r6 = p124h7.C2577d1.m6550j(r6, r7)
            h7.c r6 = (p124h7.InterfaceC2557c) r6
            int r1 = r0.size()
            int r2 = r6.size()
            if (r1 <= 0) goto L26
            if (r2 <= 0) goto L26
            boolean r3 = r0.mo6520c()
            if (r3 != 0) goto L23
            int r2 = r2 + r1
            h7.c r0 = r0.mo6521k(r2)
        L23:
            r0.addAll(r6)
        L26:
            if (r1 > 0) goto L29
            goto L2a
        L29:
            r6 = r0
        L2a:
            e7.i8 r0 = p124h7.C2577d1.f11435c
            r0.m4264N(r5, r7, r6)
            return
    }
}
