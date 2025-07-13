package p008a7;

/* renamed from: a7.b */
/* loaded from: classes.dex */
public final class C0028b {

    /* renamed from: a */
    public static android.content.SharedPreferences f67a;

    /* renamed from: a */
    public static android.content.SharedPreferences m34a(android.content.Context r2) {
            java.lang.Class<android.content.SharedPreferences> r0 = android.content.SharedPreferences.class
            monitor-enter(r0)
            android.content.SharedPreferences r1 = p008a7.C0028b.f67a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L14
            a7.c r1 = new a7.c     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = p165j7.C3450c.m7911a(r1)     // Catch: java.lang.Throwable -> L18
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch: java.lang.Throwable -> L18
            p008a7.C0028b.f67a = r2     // Catch: java.lang.Throwable -> L18
        L14:
            android.content.SharedPreferences r2 = p008a7.C0028b.f67a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
    }
}
