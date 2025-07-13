package p084f0;

/* renamed from: f0.f */
/* loaded from: classes.dex */
public class C1943f extends p084f0.C1948k {

    /* renamed from: b */
    public static java.lang.Class<?> f8490b = null;

    /* renamed from: c */
    public static java.lang.reflect.Constructor<?> f8491c = null;

    /* renamed from: d */
    public static java.lang.reflect.Method f8492d = null;

    /* renamed from: e */
    public static java.lang.reflect.Method f8493e = null;

    /* renamed from: f */
    public static boolean f8494f = false;

    public C1943f() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: f */
    public static boolean m4840f(java.lang.Object r3, java.lang.String r4, int r5, boolean r6) {
            m4841g()
            java.lang.reflect.Method r0 = p084f0.C1943f.f8492d     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r4 = 2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            boolean r3 = r3.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            return r3
        L24:
            r3 = move-exception
            goto L27
        L26:
            r3 = move-exception
        L27:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: g */
    public static void m4841g() {
            boolean r0 = p084f0.C1943f.f8494f
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            p084f0.C1943f.f8494f = r0
            r1 = 0
            java.lang.String r2 = "android.graphics.FontFamily"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.reflect.Constructor r4 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.String r5 = "addFontWeightStyle"
            r6 = 3
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r6[r0] = r7     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r7 = 2
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r6[r7] = r8     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.reflect.Method r5 = r2.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.Class<android.graphics.Typeface> r7 = android.graphics.Typeface.class
            java.lang.String r8 = "createFromFamiliesWithDefault"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r0[r3] = r6     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.reflect.Method r1 = r7.getMethod(r8, r0)     // Catch: java.lang.NoSuchMethodException -> L43 java.lang.ClassNotFoundException -> L45
            r0 = r1
            r1 = r4
            goto L56
        L43:
            r0 = move-exception
            goto L46
        L45:
            r0 = move-exception
        L46:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r3, r2, r0)
            r0 = r1
            r2 = r0
            r5 = r2
        L56:
            p084f0.C1943f.f8491c = r1
            p084f0.C1943f.f8490b = r2
            p084f0.C1943f.f8492d = r5
            p084f0.C1943f.f8493e = r0
            return
    }

    @Override // p084f0.C1948k
    /* renamed from: a */
    public android.graphics.Typeface mo4842a(android.content.Context r9, p065e0.C1501f.b r10, android.content.res.Resources r11, int r12) {
            r8 = this;
            m4841g()
            java.lang.reflect.Constructor<?> r12 = p084f0.C1943f.f8491c     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.InstantiationException -> L6b java.lang.IllegalAccessException -> L6d
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.InstantiationException -> L6b java.lang.IllegalAccessException -> L6d
            java.lang.Object r12 = r12.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.InstantiationException -> L6b java.lang.IllegalAccessException -> L6d
            e0.f$c[] r10 = r10.f7301a
            int r1 = r10.length
            r2 = 0
        L10:
            r3 = 0
            if (r2 >= r1) goto L46
            r4 = r10[r2]
            java.io.File r5 = p084f0.C1949l.m4860c(r9)
            if (r5 != 0) goto L1c
            return r3
        L1c:
            int r6 = r4.f7307f     // Catch: java.lang.Throwable -> L3d java.lang.RuntimeException -> L42
            boolean r6 = p084f0.C1949l.m4858a(r5, r11, r6)     // Catch: java.lang.Throwable -> L3d java.lang.RuntimeException -> L42
            if (r6 != 0) goto L28
            r5.delete()
            return r3
        L28:
            java.lang.String r6 = r5.getPath()     // Catch: java.lang.Throwable -> L3d java.lang.RuntimeException -> L42
            int r7 = r4.f7303b     // Catch: java.lang.Throwable -> L3d java.lang.RuntimeException -> L42
            boolean r4 = r4.f7304c     // Catch: java.lang.Throwable -> L3d java.lang.RuntimeException -> L42
            boolean r4 = m4840f(r12, r6, r7, r4)     // Catch: java.lang.Throwable -> L3d java.lang.RuntimeException -> L42
            r5.delete()
            if (r4 != 0) goto L3a
            return r3
        L3a:
            int r2 = r2 + 1
            goto L10
        L3d:
            r9 = move-exception
            r5.delete()
            throw r9
        L42:
            r5.delete()
            return r3
        L46:
            m4841g()
            java.lang.Class<?> r9 = p084f0.C1943f.f8490b     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            r10 = 1
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            java.lang.reflect.Array.set(r9, r0, r12)     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            java.lang.reflect.Method r11 = p084f0.C1943f.f8493e     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            r10[r0] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            java.lang.Object r9 = r11.invoke(r3, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            android.graphics.Typeface r9 = (android.graphics.Typeface) r9     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            return r9
        L60:
            r9 = move-exception
            goto L63
        L62:
            r9 = move-exception
        L63:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
        L69:
            r9 = move-exception
            goto L6e
        L6b:
            r9 = move-exception
            goto L6e
        L6d:
            r9 = move-exception
        L6e:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
    }

    @Override // p084f0.C1948k
    /* renamed from: b */
    public android.graphics.Typeface mo4843b(android.content.Context r4, android.os.CancellationSignal r5, p178k0.C3636l[] r6, int r7) {
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L6
            return r1
        L6:
            k0.l r6 = r3.mo4857e(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.f16034a     // Catch: java.io.IOException -> L84
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch: java.io.IOException -> L84
            if (r5 != 0) goto L1e
            if (r5 == 0) goto L1d
            r5.close()     // Catch: java.io.IOException -> L84
        L1d:
            return r1
        L1e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            r6.<init>()     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            java.lang.String r7 = "/proc/self/fd/"
            r6.append(r7)     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            int r7 = r5.getFd()     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            r6.append(r7)     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            android.system.StructStat r7 = android.system.Os.stat(r6)     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            int r7 = r7.st_mode     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            boolean r7 = android.system.OsConstants.S_ISREG(r7)     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            if (r7 == 0) goto L4b
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L49 android.system.ErrnoException -> L4b
            goto L4c
        L49:
            r4 = move-exception
            goto L7b
        L4b:
            r7 = r1
        L4c:
            if (r7 == 0) goto L5d
            boolean r6 = r7.canRead()     // Catch: java.lang.Throwable -> L49
            if (r6 != 0) goto L55
            goto L5d
        L55:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r7)     // Catch: java.lang.Throwable -> L49
            r5.close()     // Catch: java.io.IOException -> L84
            return r4
        L5d:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L49
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L49
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L49
            android.graphics.Typeface r4 = r3.mo4856c(r4, r6)     // Catch: java.lang.Throwable -> L71
            r6.close()     // Catch: java.lang.Throwable -> L49
            r5.close()     // Catch: java.io.IOException -> L84
            return r4
        L71:
            r4 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch: java.lang.Throwable -> L49
        L7a:
            throw r4     // Catch: java.lang.Throwable -> L49
        L7b:
            r5.close()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L7f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L84
        L83:
            throw r4     // Catch: java.io.IOException -> L84
        L84:
            return r1
    }
}
