package p084f0;

/* renamed from: f0.g */
/* loaded from: classes.dex */
public class C1944g extends p084f0.C1948k {

    /* renamed from: b */
    public static final java.lang.Class<?> f8495b = null;

    /* renamed from: c */
    public static final java.lang.reflect.Constructor<?> f8496c = null;

    /* renamed from: d */
    public static final java.lang.reflect.Method f8497d = null;

    /* renamed from: e */
    public static final java.lang.reflect.Method f8498e = null;

    static {
            r0 = 0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.reflect.Constructor r3 = r1.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.String r4 = "addFontWeightStyle"
            r5 = 5
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            r5[r2] = r6     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r8 = 2
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r5[r8] = r9     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r8 = 3
            r5[r8] = r6     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r6 = 4
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r5[r6] = r8     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r7)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.Class<android.graphics.Typeface> r6 = android.graphics.Typeface.class
            java.lang.String r8 = "createFromFamiliesWithDefault"
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r7[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            java.lang.reflect.Method r0 = r6.getMethod(r8, r7)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.ClassNotFoundException -> L46
            r2 = r0
            r0 = r3
            goto L57
        L44:
            r1 = move-exception
            goto L47
        L46:
            r1 = move-exception
        L47:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi24Impl"
            android.util.Log.e(r3, r2, r1)
            r1 = r0
            r2 = r1
            r4 = r2
        L57:
            p084f0.C1944g.f8496c = r0
            p084f0.C1944g.f8495b = r1
            p084f0.C1944g.f8497d = r4
            p084f0.C1944g.f8498e = r2
            return
    }

    public C1944g() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: f */
    public static boolean m4844f(java.lang.Object r3, java.nio.ByteBuffer r4, int r5, int r6, boolean r7) {
            r0 = 0
            java.lang.reflect.Method r1 = p084f0.C1944g.f8497d     // Catch: java.lang.Throwable -> L2c
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2c
            r2[r0] = r4     // Catch: java.lang.Throwable -> L2c
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2c
            r2[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 2
            r5 = 0
            r2[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2c
            r2[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L2c
            r2[r4] = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r3 = r1.invoke(r3, r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L2c
            return r3
        L2c:
            return r0
    }

    /* renamed from: g */
    public static android.graphics.Typeface m4845g(java.lang.Object r4) {
            r0 = 0
            java.lang.Class<?> r1 = p084f0.C1944g.f8495b     // Catch: java.lang.Throwable -> L19
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L19
            r3 = 0
            java.lang.reflect.Array.set(r1, r3, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Method r4 = p084f0.C1944g.f8498e     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L19
            r2[r3] = r1     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r4.invoke(r0, r2)     // Catch: java.lang.Throwable -> L19
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L19
            return r4
        L19:
            return r0
    }

    @Override // p084f0.C1948k
    /* renamed from: a */
    public android.graphics.Typeface mo4842a(android.content.Context r17, p065e0.C1501f.b r18, android.content.res.Resources r19, int r20) {
            r16 = this;
            r0 = 0
            r1 = 0
            java.lang.reflect.Constructor<?> r2 = p084f0.C1944g.f8496c     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 != 0) goto Lf
            return r1
        Lf:
            r3 = r18
            e0.f$c[] r3 = r3.f7301a
            int r4 = r3.length
            r5 = 0
        L15:
            if (r5 >= r4) goto L70
            r6 = r3[r5]
            int r0 = r6.f7307f
            java.io.File r7 = p084f0.C1949l.m4860c(r17)
            r8 = r19
            if (r7 != 0) goto L24
            goto L2d
        L24:
            boolean r0 = p084f0.C1949l.m4858a(r7, r8, r0)     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L2f
            r7.delete()
        L2d:
            r0 = r1
            goto L58
        L2f:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
            r9.<init>(r7)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L48
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L48
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L48
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L48
            r9.close()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
            goto L55
        L48:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L4e
            goto L53
        L4e:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
        L53:
            throw r10     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
        L54:
            r0 = r1
        L55:
            r7.delete()
        L58:
            if (r0 != 0) goto L5b
            return r1
        L5b:
            int r7 = r6.f7306e
            int r9 = r6.f7303b
            boolean r6 = r6.f7304c
            boolean r0 = m4844f(r2, r0, r7, r9, r6)
            if (r0 != 0) goto L68
            return r1
        L68:
            int r5 = r5 + 1
            goto L15
        L6b:
            r0 = move-exception
            r7.delete()
            throw r0
        L70:
            android.graphics.Typeface r0 = m4845g(r2)
            return r0
    }

    @Override // p084f0.C1948k
    /* renamed from: b */
    public android.graphics.Typeface mo4843b(android.content.Context r10, android.os.CancellationSignal r11, p178k0.C3636l[] r12, int r13) {
            r9 = this;
            r0 = 0
            r1 = 0
            java.lang.reflect.Constructor<?> r2 = p084f0.C1944g.f8496c     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 != 0) goto Lf
            return r1
        Lf:
            s.h r3 = new s.h
            r3.<init>()
            int r4 = r12.length
        L15:
            if (r0 >= r4) goto L3d
            r5 = r12[r0]
            android.net.Uri r6 = r5.f16034a
            java.lang.Object r7 = r3.get(r6)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            if (r7 != 0) goto L2a
            java.nio.ByteBuffer r7 = p084f0.C1949l.m4861d(r10, r11, r6)
            r3.put(r6, r7)
        L2a:
            if (r7 != 0) goto L2d
            return r1
        L2d:
            int r6 = r5.f16035b
            int r8 = r5.f16036c
            boolean r5 = r5.f16037d
            boolean r5 = m4844f(r2, r7, r6, r8, r5)
            if (r5 != 0) goto L3a
            return r1
        L3a:
            int r0 = r0 + 1
            goto L15
        L3d:
            android.graphics.Typeface r10 = m4845g(r2)
            if (r10 != 0) goto L44
            return r1
        L44:
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r13)
            return r10
    }
}
