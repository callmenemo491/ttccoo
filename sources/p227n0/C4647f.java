package p227n0;

/* renamed from: n0.f */
/* loaded from: classes.dex */
public class C4647f {

    /* renamed from: a */
    public static boolean f18554a = false;

    /* renamed from: b */
    public static java.lang.reflect.Method f18555b = null;

    /* renamed from: c */
    public static boolean f18556c = false;

    /* renamed from: d */
    public static java.lang.reflect.Field f18557d;

    /* renamed from: n0.f$a */
    public interface a {
        /* renamed from: i */
        boolean mo2470i(android.view.KeyEvent r1);
    }

    /* renamed from: a */
    public static boolean m10501a(android.view.View r4, android.view.KeyEvent r5) {
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 28
            if (r0 < r2) goto La
            goto L78
        La:
            java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = p227n0.C4661t.r.f18584d
            r0 = 2131362663(0x7f0a0367, float:1.8345113E38)
            java.lang.Object r2 = r4.getTag(r0)
            n0.t$r r2 = (p227n0.C4661t.r) r2
            if (r2 != 0) goto L1f
            n0.t$r r2 = new n0.t$r
            r2.<init>()
            r4.setTag(r0, r2)
        L1f:
            java.lang.ref.WeakReference<android.view.KeyEvent> r4 = r2.f18587c
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L2a
            goto L78
        L2a:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r5)
            r2.f18587c = r4
            r4 = 0
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r2.f18586b
            if (r0 != 0) goto L3d
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.f18586b = r0
        L3d:
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r2.f18586b
            int r3 = r5.getAction()
            if (r3 != r1) goto L58
            int r3 = r5.getKeyCode()
            int r3 = r0.indexOfKey(r3)
            if (r3 < 0) goto L58
            java.lang.Object r4 = r0.valueAt(r3)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            r0.removeAt(r3)
        L58:
            if (r4 != 0) goto L64
            int r4 = r5.getKeyCode()
            java.lang.Object r4 = r0.get(r4)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
        L64:
            if (r4 == 0) goto L78
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L79
            boolean r0 = p227n0.C4661t.f.m10587b(r4)
            if (r0 == 0) goto L79
            r2.m10666b(r4, r5)
            goto L79
        L78:
            r1 = 0
        L79:
            return r1
    }

    /* renamed from: b */
    public static boolean m10502b(p227n0.C4647f.a r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.mo2470i(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L80
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L63
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L63
            if (r8 == 0) goto L63
            boolean r1 = p227n0.C4647f.f18554a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            p227n0.C4647f.f18555b = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            p227n0.C4647f.f18554a = r3
        L4c:
            java.lang.reflect.Method r1 = p227n0.C4647f.f18555b
            if (r1 == 0) goto L60
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5f
            r4[r0] = r10     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L5f
            goto L60
        L5f:
        L60:
            if (r0 == 0) goto L63
            goto L7f
        L63:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6a
            goto L7f
        L6a:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = p227n0.C4661t.m10530f(r7, r10)
            if (r8 == 0) goto L75
            goto L7f
        L75:
            if (r7 == 0) goto L7b
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7b:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L7f:
            return r3
        L80:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld3
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = p227n0.C4647f.f18556c
            if (r7 != 0) goto L99
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L97
            p227n0.C4647f.f18557d = r7     // Catch: java.lang.NoSuchFieldException -> L97
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L97
        L97:
            p227n0.C4647f.f18556c = r3
        L99:
            java.lang.reflect.Field r7 = p227n0.C4647f.f18557d
            if (r7 == 0) goto La4
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La4
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La4
            goto La5
        La4:
            r7 = r2
        La5:
            if (r7 == 0) goto Lb2
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb2
            goto Ld2
        Lb2:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbd
            goto Ld2
        Lbd:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = p227n0.C4661t.m10530f(r7, r10)
            if (r8 == 0) goto Lc8
            goto Ld2
        Lc8:
            if (r7 == 0) goto Lce
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lce:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld2:
            return r3
        Ld3:
            if (r8 == 0) goto Ldb
            boolean r8 = p227n0.C4661t.m10530f(r8, r10)
            if (r8 != 0) goto Le1
        Ldb:
            boolean r7 = r7.mo2470i(r10)
            if (r7 == 0) goto Le2
        Le1:
            r0 = 1
        Le2:
            return r0
    }
}
