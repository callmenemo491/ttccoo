package p083f;

/* renamed from: f.u */
/* loaded from: classes.dex */
public class C1934u {

    /* renamed from: a */
    public static java.lang.reflect.Field f8426a;

    /* renamed from: b */
    public static boolean f8427b;

    /* renamed from: c */
    public static java.lang.Class<?> f8428c;

    /* renamed from: d */
    public static boolean f8429d;

    /* renamed from: e */
    public static java.lang.reflect.Field f8430e;

    /* renamed from: f */
    public static boolean f8431f;

    /* renamed from: g */
    public static java.lang.reflect.Field f8432g;

    /* renamed from: h */
    public static boolean f8433h;

    /* renamed from: a */
    public static void m4795a(java.lang.Object r4) {
            boolean r0 = p083f.C1934u.f8429d
            r1 = 1
            java.lang.String r2 = "ResourcesFlusher"
            if (r0 != 0) goto L18
            java.lang.String r0 = "android.content.res.ThemedResourceCache"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L10
            p083f.C1934u.f8428c = r0     // Catch: java.lang.ClassNotFoundException -> L10
            goto L16
        L10:
            r0 = move-exception
            java.lang.String r3 = "Could not find ThemedResourceCache class"
            android.util.Log.e(r2, r3, r0)
        L16:
            p083f.C1934u.f8429d = r1
        L18:
            java.lang.Class<?> r0 = p083f.C1934u.f8428c
            if (r0 != 0) goto L1d
            return
        L1d:
            boolean r3 = p083f.C1934u.f8431f
            if (r3 != 0) goto L35
            java.lang.String r3 = "mUnthemedEntries"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L2d
            p083f.C1934u.f8430e = r0     // Catch: java.lang.NoSuchFieldException -> L2d
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L2d
            goto L33
        L2d:
            r0 = move-exception
            java.lang.String r3 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
            android.util.Log.e(r2, r3, r0)
        L33:
            p083f.C1934u.f8431f = r1
        L35:
            java.lang.reflect.Field r0 = p083f.C1934u.f8430e
            if (r0 != 0) goto L3a
            return
        L3a:
            r1 = 0
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L43
            android.util.LongSparseArray r4 = (android.util.LongSparseArray) r4     // Catch: java.lang.IllegalAccessException -> L43
            r1 = r4
            goto L49
        L43:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
            android.util.Log.e(r2, r0, r4)
        L49:
            if (r1 == 0) goto L4e
            r1.clear()
        L4e:
            return
    }
}
