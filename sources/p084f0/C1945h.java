package p084f0;

/* renamed from: f0.h */
/* loaded from: classes.dex */
public class C1945h extends p084f0.C1943f {

    /* renamed from: g */
    public final java.lang.Class<?> f8499g;

    /* renamed from: h */
    public final java.lang.reflect.Constructor<?> f8500h;

    /* renamed from: i */
    public final java.lang.reflect.Method f8501i;

    /* renamed from: j */
    public final java.lang.reflect.Method f8502j;

    /* renamed from: k */
    public final java.lang.reflect.Method f8503k;

    /* renamed from: l */
    public final java.lang.reflect.Method f8504l;

    /* renamed from: m */
    public final java.lang.reflect.Method f8505m;

    public C1945h() {
            r9 = this;
            r9.<init>()
            r0 = 0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.ClassNotFoundException -> L33
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.ClassNotFoundException -> L33
            java.lang.reflect.Constructor r3 = r1.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.ClassNotFoundException -> L33
            java.lang.reflect.Method r4 = r9.m4853n(r1)     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.ClassNotFoundException -> L33
            java.lang.reflect.Method r5 = r9.m4854o(r1)     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.ClassNotFoundException -> L33
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.ClassNotFoundException -> L33
            java.lang.String r7 = "freeze"
            java.lang.reflect.Method r6 = r1.getMethod(r7, r6)     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.ClassNotFoundException -> L33
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.ClassNotFoundException -> L33
            java.lang.String r7 = "abortCreation"
            java.lang.reflect.Method r2 = r1.getMethod(r7, r2)     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.ClassNotFoundException -> L33
            java.lang.reflect.Method r0 = r9.mo4855p(r1)     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.ClassNotFoundException -> L33
            r8 = r1
            r1 = r0
            r0 = r8
            goto L54
        L31:
            r1 = move-exception
            goto L34
        L33:
            r1 = move-exception
        L34:
            java.lang.String r2 = "Unable to collect necessary methods for class "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r3, r2, r1)
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L54:
            r9.f8499g = r0
            r9.f8500h = r3
            r9.f8501i = r4
            r9.f8502j = r5
            r9.f8503k = r6
            r9.f8504l = r2
            r9.f8505m = r1
            return
    }

    /* renamed from: m */
    private java.lang.Object m4846m() {
            r2 = this;
            java.lang.reflect.Constructor<?> r0 = r2.f8500h     // Catch: java.lang.Throwable -> La
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // p084f0.C1943f, p084f0.C1948k
    /* renamed from: a */
    public android.graphics.Typeface mo4842a(android.content.Context r11, p065e0.C1501f.b r12, android.content.res.Resources r13, int r14) {
            r10 = this;
            boolean r0 = r10.m4852l()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r11 = super.mo4842a(r11, r12, r13, r14)
            return r11
        Lb:
            java.lang.Object r13 = r10.m4846m()
            r14 = 0
            if (r13 != 0) goto L13
            return r14
        L13:
            e0.f$c[] r12 = r12.f7301a
            int r8 = r12.length
            r0 = 0
            r9 = 0
        L18:
            if (r9 >= r8) goto L3a
            r0 = r12[r9]
            java.lang.String r3 = r0.f7302a
            int r4 = r0.f7306e
            int r5 = r0.f7303b
            boolean r6 = r0.f7304c
            java.lang.String r0 = r0.f7305d
            android.graphics.fonts.FontVariationAxis[] r7 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r0)
            r0 = r10
            r1 = r11
            r2 = r13
            boolean r0 = r0.m4849i(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L37
            r10.m4848h(r13)
            return r14
        L37:
            int r9 = r9 + 1
            goto L18
        L3a:
            boolean r11 = r10.m4851k(r13)
            if (r11 != 0) goto L41
            return r14
        L41:
            android.graphics.Typeface r11 = r10.mo4850j(r13)
            return r11
    }

    @Override // p084f0.C1943f, p084f0.C1948k
    /* renamed from: b */
    public android.graphics.Typeface mo4843b(android.content.Context r12, android.os.CancellationSignal r13, p178k0.C3636l[] r14, int r15) {
            r11 = this;
            int r0 = r14.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            boolean r0 = r11.m4852l()
            if (r0 != 0) goto L4c
            k0.l r14 = r11.mo4857e(r14, r15)
            android.content.ContentResolver r12 = r12.getContentResolver()
            android.net.Uri r15 = r14.f16034a     // Catch: java.io.IOException -> L4b
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r15, r0, r13)     // Catch: java.io.IOException -> L4b
            if (r12 != 0) goto L24
            if (r12 == 0) goto L23
            r12.close()     // Catch: java.io.IOException -> L4b
        L23:
            return r2
        L24:
            android.graphics.Typeface$Builder r13 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L41
            java.io.FileDescriptor r15 = r12.getFileDescriptor()     // Catch: java.lang.Throwable -> L41
            r13.<init>(r15)     // Catch: java.lang.Throwable -> L41
            int r15 = r14.f16036c     // Catch: java.lang.Throwable -> L41
            android.graphics.Typeface$Builder r13 = r13.setWeight(r15)     // Catch: java.lang.Throwable -> L41
            boolean r14 = r14.f16037d     // Catch: java.lang.Throwable -> L41
            android.graphics.Typeface$Builder r13 = r13.setItalic(r14)     // Catch: java.lang.Throwable -> L41
            android.graphics.Typeface r13 = r13.build()     // Catch: java.lang.Throwable -> L41
            r12.close()     // Catch: java.io.IOException -> L4b
            return r13
        L41:
            r13 = move-exception
            r12.close()     // Catch: java.lang.Throwable -> L46
            goto L4a
        L46:
            r12 = move-exception
            r13.addSuppressed(r12)     // Catch: java.io.IOException -> L4b
        L4a:
            throw r13     // Catch: java.io.IOException -> L4b
        L4b:
            return r2
        L4c:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = r14.length
            r4 = 0
            r5 = 0
        L54:
            if (r5 >= r3) goto L70
            r6 = r14[r5]
            int r7 = r6.f16038e
            if (r7 == 0) goto L5d
            goto L6d
        L5d:
            android.net.Uri r6 = r6.f16034a
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L66
            goto L6d
        L66:
            java.nio.ByteBuffer r7 = p084f0.C1949l.m4861d(r12, r13, r6)
            r0.put(r6, r7)
        L6d:
            int r5 = r5 + 1
            goto L54
        L70:
            java.util.Map r12 = java.util.Collections.unmodifiableMap(r0)
            java.lang.Object r13 = r11.m4846m()
            if (r13 != 0) goto L7b
            return r2
        L7b:
            int r0 = r14.length
            r3 = 0
            r5 = 0
        L7e:
            if (r3 >= r0) goto Lc7
            r6 = r14[r3]
            android.net.Uri r7 = r6.f16034a
            java.lang.Object r7 = r12.get(r7)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            if (r7 != 0) goto L8d
            goto Lc4
        L8d:
            int r5 = r6.f16035b
            int r8 = r6.f16036c
            boolean r6 = r6.f16037d
            java.lang.reflect.Method r9 = r11.f8502j     // Catch: java.lang.Throwable -> Lbc
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> Lbc
            r10[r4] = r7     // Catch: java.lang.Throwable -> Lbc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lbc
            r10[r1] = r5     // Catch: java.lang.Throwable -> Lbc
            r5 = 2
            r10[r5] = r2     // Catch: java.lang.Throwable -> Lbc
            r5 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lbc
            r10[r5] = r7     // Catch: java.lang.Throwable -> Lbc
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lbc
            r10[r5] = r6     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r5 = r9.invoke(r13, r10)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lbc
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Lbc
            goto Lbd
        Lbc:
            r5 = 0
        Lbd:
            if (r5 != 0) goto Lc3
            r11.m4848h(r13)
            return r2
        Lc3:
            r5 = 1
        Lc4:
            int r3 = r3 + 1
            goto L7e
        Lc7:
            if (r5 != 0) goto Lcd
            r11.m4848h(r13)
            return r2
        Lcd:
            boolean r12 = r11.m4851k(r13)
            if (r12 != 0) goto Ld4
            return r2
        Ld4:
            android.graphics.Typeface r12 = r11.mo4850j(r13)
            if (r12 != 0) goto Ldb
            return r2
        Ldb:
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r15)
            return r12
    }

    @Override // p084f0.C1948k
    /* renamed from: d */
    public android.graphics.Typeface mo4847d(android.content.Context r9, android.content.res.Resources r10, int r11, java.lang.String r12, int r13) {
            r8 = this;
            boolean r0 = r8.m4852l()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r9 = super.mo4847d(r9, r10, r11, r12, r13)
            return r9
        Lb:
            java.lang.Object r10 = r8.m4846m()
            r11 = 0
            if (r10 != 0) goto L13
            return r11
        L13:
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            boolean r9 = r0.m4849i(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L25
            r8.m4848h(r10)
            return r11
        L25:
            boolean r9 = r8.m4851k(r10)
            if (r9 != 0) goto L2c
            return r11
        L2c:
            android.graphics.Typeface r9 = r8.mo4850j(r10)
            return r9
    }

    /* renamed from: h */
    public final void m4848h(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f8504l     // Catch: java.lang.Throwable -> L8
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L8
            r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    /* renamed from: i */
    public final boolean m4849i(android.content.Context r4, java.lang.Object r5, java.lang.String r6, int r7, int r8, int r9, android.graphics.fonts.FontVariationAxis[] r10) {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.f8501i     // Catch: java.lang.Throwable -> L3f
            r2 = 8
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3f
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L3f
            r2[r0] = r4     // Catch: java.lang.Throwable -> L3f
            r4 = 1
            r2[r4] = r6     // Catch: java.lang.Throwable -> L3f
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3f
            r2[r4] = r6     // Catch: java.lang.Throwable -> L3f
            r4 = 3
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3f
            r2[r4] = r6     // Catch: java.lang.Throwable -> L3f
            r4 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L3f
            r2[r4] = r6     // Catch: java.lang.Throwable -> L3f
            r4 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L3f
            r2[r4] = r6     // Catch: java.lang.Throwable -> L3f
            r4 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3f
            r2[r4] = r6     // Catch: java.lang.Throwable -> L3f
            r4 = 7
            r2[r4] = r10     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r4 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L3f
            return r4
        L3f:
            return r0
    }

    /* renamed from: j */
    public android.graphics.Typeface mo4850j(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            java.lang.Class<?> r1 = r5.f8499g     // Catch: java.lang.Throwable -> L28
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L28
            r3 = 0
            java.lang.reflect.Array.set(r1, r3, r6)     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r6 = r5.f8505m     // Catch: java.lang.Throwable -> L28
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L28
            r4[r3] = r1     // Catch: java.lang.Throwable -> L28
            r1 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L28
            r4[r2] = r3     // Catch: java.lang.Throwable -> L28
            r2 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L28
            r4[r2] = r1     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r6.invoke(r0, r4)     // Catch: java.lang.Throwable -> L28
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6     // Catch: java.lang.Throwable -> L28
            return r6
        L28:
            return r0
    }

    /* renamed from: k */
    public final boolean m4851k(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.f8503k     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L10
            java.lang.Object r4 = r1.invoke(r4, r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L10
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L10
            return r4
        L10:
            return r0
    }

    /* renamed from: l */
    public final boolean m4852l() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f8501i
            if (r0 != 0) goto Lb
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            java.lang.String r1 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        Lb:
            java.lang.reflect.Method r0 = r2.f8501i
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    /* renamed from: n */
    public java.lang.reflect.Method m4853n(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 8
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.res.AssetManager> r2 = android.content.res.AssetManager.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 2
            r0[r2] = r1
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r3 = 3
            r0[r3] = r2
            r2 = 4
            r0[r2] = r1
            r2 = 5
            r0[r2] = r1
            r2 = 6
            r0[r2] = r1
            r1 = 7
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r2 = android.graphics.fonts.FontVariationAxis[].class
            r0[r1] = r2
            java.lang.String r1 = "addFontFromAssetManager"
            java.lang.reflect.Method r5 = r5.getMethod(r1, r0)
            return r5
    }

    /* renamed from: o */
    public java.lang.reflect.Method m4854o(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 5
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.nio.ByteBuffer> r2 = java.nio.ByteBuffer.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 1
            r0[r2] = r1
            r2 = 2
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r3 = android.graphics.fonts.FontVariationAxis[].class
            r0[r2] = r3
            r2 = 3
            r0[r2] = r1
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = "addFontFromBuffer"
            java.lang.reflect.Method r5 = r5.getMethod(r1, r0)
            return r5
    }

    /* renamed from: p */
    public java.lang.reflect.Method mo4855p(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 1
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r0)
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class r5 = r5.getClass()
            r3 = 0
            r2[r3] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r2[r0] = r5
            r3 = 2
            r2[r3] = r5
            java.lang.String r5 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r2)
            r5.setAccessible(r0)
            return r5
    }
}
