package p072e7;

/* renamed from: e7.r3 */
/* loaded from: classes.dex */
public final class C1726r3 {

    /* renamed from: a */
    public static final p123h6.C2489b f7765a = null;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "CastDynamiteModule"
            r0.<init>(r1)
            p072e7.C1726r3.f7765a = r0
            return
    }

    /* renamed from: a */
    public static p072e7.InterfaceC1775w6 m4430a(android.content.Context r2) {
            com.google.android.gms.dynamite.DynamiteModule$b r0 = com.google.android.gms.dynamite.DynamiteModule.f5640j     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L27
            java.lang.String r1 = "com.google.android.gms.cast.framework.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r2 = com.google.android.gms.dynamite.DynamiteModule.m3108c(r2, r0, r1)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L27
            java.lang.String r0 = "com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"
            android.os.IBinder r2 = r2.m3118b(r0)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L27
            if (r2 != 0) goto L12
            r2 = 0
            goto L26
        L12:
            java.lang.String r0 = "com.google.android.gms.cast.framework.internal.ICastDynamiteModule"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L27
            boolean r1 = r0 instanceof p072e7.InterfaceC1775w6     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L27
            if (r1 == 0) goto L20
            r2 = r0
            e7.w6 r2 = (p072e7.InterfaceC1775w6) r2     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L27
            goto L26
        L20:
            e7.z5 r0 = new e7.z5     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L27
            r0.<init>(r2)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L27
            r2 = r0
        L26:
            return r2
        L27:
            r2 = move-exception
            d6.y r0 = new d6.y
            r0.<init>(r2)
            throw r0
    }
}
