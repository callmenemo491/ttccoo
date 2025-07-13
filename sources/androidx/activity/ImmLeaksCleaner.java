package androidx.activity;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.InterfaceC0468t {

    /* renamed from: Z */
    public static int f603Z;

    /* renamed from: a0 */
    public static java.lang.reflect.Field f604a0;

    /* renamed from: b0 */
    public static java.lang.reflect.Field f605b0;

    /* renamed from: c0 */
    public static java.lang.reflect.Field f606c0;

    /* renamed from: Y */
    public android.app.Activity f607Y;

    public ImmLeaksCleaner(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.f607Y = r1
            return
    }

    @Override // androidx.lifecycle.InterfaceC0468t
    /* renamed from: d */
    public void mo435d(androidx.lifecycle.InterfaceC0471v r3, androidx.lifecycle.AbstractC0458o.b r4) {
            r2 = this;
            androidx.lifecycle.o$b r3 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY
            if (r4 == r3) goto L5
            return
        L5:
            int r3 = androidx.activity.ImmLeaksCleaner.f603Z
            r4 = 1
            if (r3 != 0) goto L38
            r3 = 2
            androidx.activity.ImmLeaksCleaner.f603Z = r3     // Catch: java.lang.NoSuchFieldException -> L37
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mServedView"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L37
            androidx.activity.ImmLeaksCleaner.f605b0 = r3     // Catch: java.lang.NoSuchFieldException -> L37
            r3.setAccessible(r4)     // Catch: java.lang.NoSuchFieldException -> L37
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mNextServedView"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L37
            androidx.activity.ImmLeaksCleaner.f606c0 = r3     // Catch: java.lang.NoSuchFieldException -> L37
            r3.setAccessible(r4)     // Catch: java.lang.NoSuchFieldException -> L37
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L37
            androidx.activity.ImmLeaksCleaner.f604a0 = r3     // Catch: java.lang.NoSuchFieldException -> L37
            r3.setAccessible(r4)     // Catch: java.lang.NoSuchFieldException -> L37
            androidx.activity.ImmLeaksCleaner.f603Z = r4     // Catch: java.lang.NoSuchFieldException -> L37
            goto L38
        L37:
        L38:
            int r3 = androidx.activity.ImmLeaksCleaner.f603Z
            if (r3 != r4) goto L79
            android.app.Activity r3 = r2.f607Y
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = androidx.activity.ImmLeaksCleaner.f604a0     // Catch: java.lang.IllegalAccessException -> L79
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.IllegalAccessException -> L79
            if (r4 != 0) goto L4f
            return
        L4f:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.f605b0     // Catch: java.lang.Throwable -> L71 java.lang.ClassCastException -> L73 java.lang.IllegalAccessException -> L75
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L71 java.lang.ClassCastException -> L73 java.lang.IllegalAccessException -> L75
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L71 java.lang.ClassCastException -> L73 java.lang.IllegalAccessException -> L75
            if (r0 != 0) goto L5c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L5c:
            boolean r0 = r0.isAttachedToWindow()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L64
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L64:
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.f606c0     // Catch: java.lang.IllegalAccessException -> L6f java.lang.Throwable -> L71
            r1 = 0
            r0.set(r3, r1)     // Catch: java.lang.IllegalAccessException -> L6f java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r3.isActive()
            goto L79
        L6f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L71:
            r3 = move-exception
            goto L77
        L73:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L75:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L77:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r3
        L79:
            return
    }
}
