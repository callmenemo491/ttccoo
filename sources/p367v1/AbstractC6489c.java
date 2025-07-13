package p367v1;

/* renamed from: v1.c */
/* loaded from: classes.dex */
public abstract class AbstractC6489c {

    /* renamed from: a */
    public final p319s.C5934a<java.lang.String, java.lang.reflect.Method> f25164a;

    /* renamed from: b */
    public final p319s.C5934a<java.lang.String, java.lang.reflect.Method> f25165b;

    /* renamed from: c */
    public final p319s.C5934a<java.lang.String, java.lang.Class> f25166c;

    public AbstractC6489c(p319s.C5934a<java.lang.String, java.lang.reflect.Method> r1, p319s.C5934a<java.lang.String, java.lang.reflect.Method> r2, p319s.C5934a<java.lang.String, java.lang.Class> r3) {
            r0 = this;
            r0.<init>()
            r0.f25164a = r1
            r0.f25165b = r2
            r0.f25166c = r3
            return
    }

    /* renamed from: a */
    public abstract void mo13183a();

    /* renamed from: b */
    public abstract p367v1.AbstractC6489c mo13184b();

    /* renamed from: c */
    public final java.lang.Class m13185c(java.lang.Class<? extends p367v1.InterfaceC6491e> r5) {
            r4 = this;
            s.a<java.lang.String, java.lang.Class> r0 = r4.f25166c
            java.lang.String r1 = r5.getName()
            r2 = 0
            java.lang.Object r0 = r0.getOrDefault(r1, r2)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L3b
            java.lang.Package r0 = r5.getPackage()
            java.lang.String r0 = r0.getName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            java.lang.String r3 = r5.getSimpleName()
            r1[r0] = r3
            java.lang.String r0 = "%s.%sParcelizer"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.ClassLoader r1 = r5.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)
            s.a<java.lang.String, java.lang.Class> r1 = r4.f25166c
            java.lang.String r5 = r5.getName()
            r1.put(r5, r0)
        L3b:
            return r0
    }

    /* renamed from: d */
    public final java.lang.reflect.Method m13186d(java.lang.String r5) {
            r4 = this;
            java.lang.Class<v1.c> r0 = p367v1.AbstractC6489c.class
            s.a<java.lang.String, java.lang.reflect.Method> r1 = r4.f25164a
            r2 = 0
            java.lang.Object r1 = r1.getOrDefault(r5, r2)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L29
            java.lang.System.currentTimeMillis()
            java.lang.ClassLoader r1 = r0.getClassLoader()
            r2 = 1
            java.lang.Class r1 = java.lang.Class.forName(r5, r2, r1)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "read"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r0, r2)
            s.a<java.lang.String, java.lang.reflect.Method> r0 = r4.f25164a
            r0.put(r5, r1)
        L29:
            return r1
    }

    /* renamed from: e */
    public final java.lang.reflect.Method m13187e(java.lang.Class r5) {
            r4 = this;
            s.a<java.lang.String, java.lang.reflect.Method> r0 = r4.f25165b
            java.lang.String r1 = r5.getName()
            r2 = 0
            java.lang.Object r0 = r0.getOrDefault(r1, r2)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L30
            java.lang.Class r0 = r4.m13185c(r5)
            java.lang.System.currentTimeMillis()
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r5
            r2 = 1
            java.lang.Class<v1.c> r3 = p367v1.AbstractC6489c.class
            r1[r2] = r3
            java.lang.String r2 = "write"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)
            s.a<java.lang.String, java.lang.reflect.Method> r1 = r4.f25165b
            java.lang.String r5 = r5.getName()
            r1.put(r5, r0)
        L30:
            return r0
    }

    /* renamed from: f */
    public abstract boolean mo13188f();

    /* renamed from: g */
    public abstract byte[] mo13189g();

    /* renamed from: h */
    public abstract java.lang.CharSequence mo13190h();

    /* renamed from: i */
    public abstract boolean mo13191i(int r1);

    /* renamed from: j */
    public abstract int mo13192j();

    /* renamed from: k */
    public int m13193k(int r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo13191i(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            int r1 = r0.mo13192j()
            return r1
    }

    /* renamed from: l */
    public abstract <T extends android.os.Parcelable> T mo13194l();

    /* renamed from: m */
    public <T extends android.os.Parcelable> T m13195m(T r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo13191i(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            android.os.Parcelable r1 = r0.mo13194l()
            return r1
    }

    /* renamed from: n */
    public abstract java.lang.String mo13196n();

    /* renamed from: o */
    public <T extends p367v1.InterfaceC6491e> T m13197o() {
            r5 = this;
            java.lang.String r0 = r5.mo13196n()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            v1.c r2 = r5.mo13184b()
            java.lang.reflect.Method r0 = r5.m13186d(r0)     // Catch: java.lang.ClassNotFoundException -> L1d java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L47
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.ClassNotFoundException -> L1d java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L47
            r4 = 0
            r3[r4] = r2     // Catch: java.lang.ClassNotFoundException -> L1d java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L47
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L1d java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L47
            v1.e r0 = (p367v1.InterfaceC6491e) r0     // Catch: java.lang.ClassNotFoundException -> L1d java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L47
            return r0
        L1d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered ClassNotFoundException"
            r1.<init>(r2, r0)
            throw r1
        L26:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered NoSuchMethodException"
            r1.<init>(r2, r0)
            throw r1
        L2f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L3f
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L3f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered InvocationTargetException"
            r1.<init>(r2, r0)
            throw r1
        L47:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered IllegalAccessException"
            r1.<init>(r2, r0)
            throw r1
    }

    /* renamed from: p */
    public abstract void mo13198p(int r1);

    /* renamed from: q */
    public abstract void mo13199q(boolean r1);

    /* renamed from: r */
    public abstract void mo13200r(byte[] r1);

    /* renamed from: s */
    public abstract void mo13201s(java.lang.CharSequence r1);

    /* renamed from: t */
    public abstract void mo13202t(int r1);

    /* renamed from: u */
    public abstract void mo13203u(android.os.Parcelable r1);

    /* renamed from: v */
    public abstract void mo13204v(java.lang.String r1);

    /* renamed from: w */
    public void m13205w(p367v1.InterfaceC6491e r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L7
            r5.mo13204v(r0)
            return
        L7:
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.ClassNotFoundException -> L65
            java.lang.Class r1 = r5.m13185c(r1)     // Catch: java.lang.ClassNotFoundException -> L65
            java.lang.String r1 = r1.getName()
            r5.mo13204v(r1)
            v1.c r1 = r5.mo13184b()
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.NoSuchMethodException -> L3b java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L5c
            java.lang.reflect.Method r2 = r5.m13187e(r2)     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.NoSuchMethodException -> L3b java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L5c
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.NoSuchMethodException -> L3b java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L5c
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.NoSuchMethodException -> L3b java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L5c
            r6 = 1
            r3[r6] = r1     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.NoSuchMethodException -> L3b java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L5c
            r2.invoke(r0, r3)     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.NoSuchMethodException -> L3b java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L5c
            r1.mo13183a()
            return
        L32:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered ClassNotFoundException"
            r0.<init>(r1, r6)
            throw r0
        L3b:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered NoSuchMethodException"
            r0.<init>(r1, r6)
            throw r0
        L44:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L54
            java.lang.Throwable r6 = r6.getCause()
            java.lang.RuntimeException r6 = (java.lang.RuntimeException) r6
            throw r6
        L54:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered InvocationTargetException"
            r0.<init>(r1, r6)
            throw r0
        L5c:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered IllegalAccessException"
            r0.<init>(r1, r6)
            throw r0
        L65:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r2.append(r6)
            java.lang.String r6 = " does not have a Parcelizer"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6, r0)
            throw r1
    }
}
