package p333t1;

/* renamed from: t1.w */
/* loaded from: classes.dex */
public class C6119w {

    /* renamed from: a */
    public static java.lang.reflect.Method f23632a;

    /* renamed from: b */
    public static boolean f23633b;

    /* renamed from: c */
    public static java.lang.reflect.Field f23634c;

    /* renamed from: d */
    public static boolean f23635d;

    public C6119w() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public void mo12641a(android.view.View r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: b */
    public float mo12642b(android.view.View r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: c */
    public void mo12643c(android.view.View r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: d */
    public void mo12647d(android.view.View r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            boolean r0 = p333t1.C6119w.f23633b
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 4
            r5 = 1
            if (r0 != 0) goto L2d
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r6 = "setFrame"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L23
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L23
            r7[r3] = r8     // Catch: java.lang.NoSuchMethodException -> L23
            r7[r5] = r8     // Catch: java.lang.NoSuchMethodException -> L23
            r7[r2] = r8     // Catch: java.lang.NoSuchMethodException -> L23
            r7[r1] = r8     // Catch: java.lang.NoSuchMethodException -> L23
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L23
            p333t1.C6119w.f23632a = r0     // Catch: java.lang.NoSuchMethodException -> L23
            r0.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L23
            goto L2b
        L23:
            r0 = move-exception
            java.lang.String r6 = "ViewUtilsBase"
            java.lang.String r7 = "Failed to retrieve setFrame method"
            android.util.Log.i(r6, r7, r0)
        L2b:
            p333t1.C6119w.f23633b = r5
        L2d:
            java.lang.reflect.Method r0 = p333t1.C6119w.f23632a
            if (r0 == 0) goto L5a
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L4f java.lang.IllegalAccessException -> L5a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L4f java.lang.IllegalAccessException -> L5a
            r4[r3] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L4f java.lang.IllegalAccessException -> L5a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L4f java.lang.IllegalAccessException -> L5a
            r4[r5] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L4f java.lang.IllegalAccessException -> L5a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.reflect.InvocationTargetException -> L4f java.lang.IllegalAccessException -> L5a
            r4[r2] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L4f java.lang.IllegalAccessException -> L5a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.reflect.InvocationTargetException -> L4f java.lang.IllegalAccessException -> L5a
            r4[r1] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L4f java.lang.IllegalAccessException -> L5a
            r0.invoke(r10, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L4f java.lang.IllegalAccessException -> L5a
            goto L5a
        L4f:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.Throwable r10 = r10.getCause()
            r11.<init>(r10)
            throw r11
        L5a:
            return
    }

    /* renamed from: e */
    public void mo12644e(android.view.View r1, float r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: f */
    public void mo12648f(android.view.View r4, int r5) {
            r3 = this;
            boolean r0 = p333t1.C6119w.f23635d
            if (r0 != 0) goto L1c
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "mViewFlags"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L13
            p333t1.C6119w.f23634c = r1     // Catch: java.lang.NoSuchFieldException -> L13
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L13
            goto L1a
        L13:
            java.lang.String r1 = "ViewUtilsBase"
            java.lang.String r2 = "fetchViewFlagsField: "
            android.util.Log.i(r1, r2)
        L1a:
            p333t1.C6119w.f23635d = r0
        L1c:
            java.lang.reflect.Field r0 = p333t1.C6119w.f23634c
            if (r0 == 0) goto L2c
            int r0 = r0.getInt(r4)     // Catch: java.lang.IllegalAccessException -> L2c
            java.lang.reflect.Field r1 = p333t1.C6119w.f23634c     // Catch: java.lang.IllegalAccessException -> L2c
            r0 = r0 & (-13)
            r5 = r5 | r0
            r1.setInt(r4, r5)     // Catch: java.lang.IllegalAccessException -> L2c
        L2c:
            return
    }

    /* renamed from: g */
    public void mo12645g(android.view.View r1, android.graphics.Matrix r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: h */
    public void mo12646h(android.view.View r1, android.graphics.Matrix r2) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
