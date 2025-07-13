package p280q0;

/* renamed from: q0.c */
/* loaded from: classes.dex */
public final class C5536c {

    /* renamed from: a */
    public static java.lang.reflect.Field f21569a;

    /* renamed from: b */
    public static boolean f21570b;

    /* renamed from: a */
    public static android.graphics.drawable.Drawable m11804a(android.widget.CompoundButton r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.graphics.drawable.Drawable r4 = r4.getButtonDrawable()
            return r4
        Lb:
            boolean r0 = p280q0.C5536c.f21570b
            java.lang.String r1 = "CompoundButtonCompat"
            if (r0 != 0) goto L28
            r0 = 1
            java.lang.Class<android.widget.CompoundButton> r2 = android.widget.CompoundButton.class
            java.lang.String r3 = "mButtonDrawable"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L20
            p280q0.C5536c.f21569a = r2     // Catch: java.lang.NoSuchFieldException -> L20
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L20
            goto L26
        L20:
            r2 = move-exception
            java.lang.String r3 = "Failed to retrieve mButtonDrawable field"
            android.util.Log.i(r1, r3, r2)
        L26:
            p280q0.C5536c.f21570b = r0
        L28:
            java.lang.reflect.Field r0 = p280q0.C5536c.f21569a
            r2 = 0
            if (r0 == 0) goto L3c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L34
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: java.lang.IllegalAccessException -> L34
            return r4
        L34:
            r4 = move-exception
            java.lang.String r0 = "Failed to get button drawable via reflection"
            android.util.Log.i(r1, r0, r4)
            p280q0.C5536c.f21569a = r2
        L3c:
            return r2
    }
}
