package p072e7;

/* renamed from: e7.u5 */
/* loaded from: classes.dex */
public final class C1756u5 implements p072e7.InterfaceC1802z6 {

    /* renamed from: a */
    public static final p072e7.C1756u5 f7806a = null;

    static {
            e7.u5 r0 = new e7.u5
            r0.<init>()
            p072e7.C1756u5.f7806a = r0
            return
    }

    public C1756u5() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p072e7.InterfaceC1802z6
    /* renamed from: a */
    public final p072e7.InterfaceC1793y6 mo4418a(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.Class<e7.x5> r0 = p072e7.AbstractC1783x5.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L24
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "Unsupported message type: "
            int r2 = r5.length()
            if (r2 == 0) goto L1b
            java.lang.String r5 = r1.concat(r5)
            goto L20
        L1b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L20:
            r0.<init>(r5)
            throw r0
        L24:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch: java.lang.Exception -> L35
            e7.x5 r0 = p072e7.AbstractC1783x5.m4487g(r0)     // Catch: java.lang.Exception -> L35
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.mo4118e(r1, r2, r2)     // Catch: java.lang.Exception -> L35
            e7.y6 r0 = (p072e7.InterfaceC1793y6) r0     // Catch: java.lang.Exception -> L35
            return r0
        L35:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.String r2 = "Unable to get message info for "
            int r3 = r5.length()
            if (r3 == 0) goto L49
            java.lang.String r5 = r2.concat(r5)
            goto L4e
        L49:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L4e:
            r1.<init>(r5, r0)
            throw r1
    }

    @Override // p072e7.InterfaceC1802z6
    /* renamed from: b */
    public final boolean mo4419b(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<e7.x5> r0 = p072e7.AbstractC1783x5.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
