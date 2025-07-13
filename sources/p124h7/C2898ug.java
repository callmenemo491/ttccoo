package p124h7;

/* renamed from: h7.ug */
/* loaded from: classes.dex */
public final class C2898ug implements p124h7.InterfaceC2917w {

    /* renamed from: a */
    public static final p124h7.C2898ug f11948a = null;

    static {
            h7.ug r0 = new h7.ug
            r0.<init>()
            p124h7.C2898ug.f11948a = r0
            return
    }

    public C2898ug() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2917w
    /* renamed from: a */
    public final p124h7.InterfaceC2899v mo7011a(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.Class<h7.yg> r0 = p124h7.AbstractC2970yg.class
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
            h7.yg r0 = p124h7.AbstractC2970yg.m7331j(r0)     // Catch: java.lang.Exception -> L35
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.mo6484h(r1, r2, r2)     // Catch: java.lang.Exception -> L35
            h7.v r0 = (p124h7.InterfaceC2899v) r0     // Catch: java.lang.Exception -> L35
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

    @Override // p124h7.InterfaceC2917w
    /* renamed from: b */
    public final boolean mo7012b(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<h7.yg> r0 = p124h7.AbstractC2970yg.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
