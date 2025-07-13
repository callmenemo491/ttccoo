package p124h7;

/* renamed from: h7.zc */
/* loaded from: classes.dex */
public final class C2984zc {
    /* renamed from: a */
    public static java.lang.Object m7358a(java.lang.String r4, java.lang.reflect.Type r5) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "Json conversion failed! "
            if (r5 != r0) goto L56
            h7.ud r5 = new h7.ud     // Catch: java.lang.Exception -> L37
            r5.<init>()     // Catch: java.lang.Exception -> L37
            r5.m7178a(r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = r5.f11945Y     // Catch: java.lang.Exception -> L37
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L37
            r0 = r0 ^ 1
            if (r0 != 0) goto L34
            h7.kb r5 = new h7.kb     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = "No error message: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L37
            int r2 = r4.length()     // Catch: java.lang.Exception -> L37
            if (r2 == 0) goto L2b
            java.lang.String r4 = r0.concat(r4)     // Catch: java.lang.Exception -> L37
            goto L30
        L2b:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L37
            r4.<init>(r0)     // Catch: java.lang.Exception -> L37
        L30:
            r5.<init>(r4)     // Catch: java.lang.Exception -> L37
            throw r5     // Catch: java.lang.Exception -> L37
        L34:
            java.lang.String r4 = r5.f11945Y     // Catch: java.lang.Exception -> L37
            return r4
        L37:
            r4 = move-exception
            h7.kb r5 = new h7.kb
            java.lang.String r0 = r4.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L4d
            java.lang.String r0 = r1.concat(r0)
            goto L52
        L4d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L52:
            r5.<init>(r0, r4)
            throw r5
        L56:
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            if (r5 == r0) goto Lab
            r0 = 0
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L8f
            r3 = r5
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Exception -> L8f
            java.lang.reflect.Constructor r2 = r3.getConstructor(r2)     // Catch: java.lang.Exception -> L8f
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L8f
            java.lang.Object r0 = r2.newInstance(r0)     // Catch: java.lang.Exception -> L8f
            h7.bd r0 = (p124h7.InterfaceC2553bd) r0     // Catch: java.lang.Exception -> L8f
            r0.mo6512e(r4)     // Catch: java.lang.Exception -> L70
            return r0
        L70:
            r4 = move-exception
            h7.kb r5 = new h7.kb
            java.lang.String r0 = r4.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L86
            java.lang.String r0 = r1.concat(r0)
            goto L8b
        L86:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L8b:
            r5.<init>(r0, r4)
            throw r5
        L8f:
            r4 = move-exception
            h7.kb r0 = new h7.kb
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r1 = r5.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 38
            r2.<init>(r1)
            java.lang.String r1 = "Instantiation of JsonResponse failed! "
            java.lang.String r5 = p346u.C6269n.m12888a(r2, r1, r5)
            r0.<init>(r5, r4)
            throw r0
        Lab:
            r4 = 0
            return r4
    }
}
