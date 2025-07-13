package p072e7;

/* renamed from: e7.g5 */
/* loaded from: classes.dex */
public final class C1618g5 extends p052d6.AbstractC1309h {

    /* renamed from: d */
    public final p052d6.C1297b f7566d;

    /* renamed from: e */
    public final p072e7.BinderC1592e f7567e;

    public C1618g5(android.content.Context r7, p052d6.C1297b r8, p072e7.BinderC1592e r9) {
            r6 = this;
            java.util.List r0 = r8.m3765X()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "com.google.android.gms.cast.CATEGORY_CAST"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "applicationId cannot be null"
            if (r0 == 0) goto L20
            java.lang.String r0 = r8.f6817Y
            if (r0 == 0) goto L1a
            r4 = 0
            java.lang.String r0 = p036c6.C0881e.m2596a(r1, r0, r4, r3, r2)
            goto L2e
        L1a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r4)
            throw r7
        L20:
            java.lang.String r0 = r8.f6817Y
            java.util.List r5 = r8.m3765X()
            if (r0 == 0) goto L3e
            if (r5 == 0) goto L36
            java.lang.String r0 = p036c6.C0881e.m2596a(r1, r0, r5, r3, r2)
        L2e:
            r6.<init>(r7, r0)
            r6.f7566d = r8
            r6.f7567e = r9
            return
        L36:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "namespaces cannot be null"
            r7.<init>(r8)
            throw r7
        L3e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r4)
            throw r7
    }

    @Override // p052d6.AbstractC1309h
    /* renamed from: a */
    public final p052d6.AbstractC1303e mo3797a(java.lang.String r9) {
            r8 = this;
            com.google.android.gms.cast.framework.a r6 = new com.google.android.gms.cast.framework.a
            android.content.Context r1 = r8.f6840a
            java.lang.String r2 = r8.f6841b
            d6.b r4 = r8.f7566d
            f6.l r5 = new f6.l
            android.content.Context r0 = r8.f6840a
            d6.b r3 = r8.f7566d
            e7.e r7 = r8.f7567e
            r5.<init>(r0, r3, r7)
            r0 = r6
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // p052d6.AbstractC1309h
    /* renamed from: b */
    public final boolean mo3798b() {
            r1 = this;
            d6.b r0 = r1.f7566d
            boolean r0 = r0.f6821c0
            return r0
    }
}
