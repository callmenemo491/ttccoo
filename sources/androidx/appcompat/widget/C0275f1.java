package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.f1 */
/* loaded from: classes.dex */
public class C0275f1 {

    /* renamed from: a */
    public static java.lang.reflect.Method f1298a;

    static {
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "computeFitSystemWindows"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L23
            r3 = 0
            java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L23
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L23
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L23
            androidx.appcompat.widget.C0275f1.f1298a = r0     // Catch: java.lang.NoSuchMethodException -> L23
            boolean r0 = r0.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L23
            if (r0 != 0) goto L2a
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0275f1.f1298a     // Catch: java.lang.NoSuchMethodException -> L23
            r0.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L23
            goto L2a
        L23:
            java.lang.String r0 = "ViewUtils"
            java.lang.String r1 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r0, r1)
        L2a:
            return
    }

    /* renamed from: a */
    public static void m723a(android.view.View r3, android.graphics.Rect r4, android.graphics.Rect r5) {
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0275f1.f1298a
            if (r0 == 0) goto L19
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L11
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L11
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L11
            r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L11
            goto L19
        L11:
            r3 = move-exception
            java.lang.String r4 = "ViewUtils"
            java.lang.String r5 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r4, r5, r3)
        L19:
            return
    }

    /* renamed from: b */
    public static boolean m724b(android.view.View r1) {
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.d.m10575d(r1)
            r0 = 1
            if (r1 != r0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
