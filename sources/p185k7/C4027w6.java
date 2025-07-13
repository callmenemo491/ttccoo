package p185k7;

/* renamed from: k7.w6 */
/* loaded from: classes.dex */
public final class C4027w6 implements p185k7.InterfaceC3788e7 {

    /* renamed from: a */
    public final p185k7.InterfaceC3788e7[] f16928a;

    public C4027w6(p185k7.InterfaceC3788e7... r1) {
            r0 = this;
            r0.<init>()
            r0.f16928a = r1
            return
    }

    @Override // p185k7.InterfaceC3788e7
    /* renamed from: a */
    public final p185k7.InterfaceC3774d7 mo8523a(java.lang.Class<?> r5) {
            r4 = this;
            k7.e7[] r0 = r4.f16928a
            r1 = 0
        L3:
            r2 = 2
            if (r1 >= r2) goto L16
            r2 = r0[r1]
            boolean r3 = r2.mo8524b(r5)
            if (r3 == 0) goto L13
            k7.d7 r5 = r2.mo8523a(r5)
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

    @Override // p185k7.InterfaceC3788e7
    /* renamed from: b */
    public final boolean mo8524b(java.lang.Class<?> r5) {
            r4 = this;
            k7.e7[] r0 = r4.f16928a
            r1 = 0
            r2 = 0
        L4:
            r3 = 2
            if (r2 >= r3) goto L14
            r3 = r0[r2]
            boolean r3 = r3.mo8524b(r5)
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
