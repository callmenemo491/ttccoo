package p124h7;

/* renamed from: h7.p */
/* loaded from: classes.dex */
public final class C2791p implements p124h7.InterfaceC2917w {

    /* renamed from: a */
    public final p124h7.InterfaceC2917w[] f11817a;

    public C2791p(p124h7.InterfaceC2917w... r1) {
            r0 = this;
            r0.<init>()
            r0.f11817a = r1
            return
    }

    @Override // p124h7.InterfaceC2917w
    /* renamed from: a */
    public final p124h7.InterfaceC2899v mo7011a(java.lang.Class<?> r5) {
            r4 = this;
            h7.w[] r0 = r4.f11817a
            r1 = 0
        L3:
            r2 = 2
            if (r1 >= r2) goto L16
            r2 = r0[r1]
            boolean r3 = r2.mo7012b(r5)
            if (r3 == 0) goto L13
            h7.v r5 = r2.mo7011a(r5)
            return r5
        L13:
            int r1 = r1 + 1
            goto L3
        L16:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "No factory is available for message type: "
            int r2 = r5.length()
            if (r2 == 0) goto L29
            java.lang.String r5 = r1.concat(r5)
            goto L2e
        L29:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L2e:
            r0.<init>(r5)
            throw r0
    }

    @Override // p124h7.InterfaceC2917w
    /* renamed from: b */
    public final boolean mo7012b(java.lang.Class<?> r5) {
            r4 = this;
            h7.w[] r0 = r4.f11817a
            r1 = 0
            r2 = 0
        L4:
            r3 = 2
            if (r2 >= r3) goto L14
            r3 = r0[r2]
            boolean r3 = r3.mo7012b(r5)
            if (r3 == 0) goto L11
            r5 = 1
            return r5
        L11:
            int r2 = r2 + 1
            goto L4
        L14:
            return r1
    }
}
