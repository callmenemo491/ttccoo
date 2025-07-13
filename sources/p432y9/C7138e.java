package p432y9;

/* renamed from: y9.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C7138e implements p392wa.InterfaceC6823b {

    /* renamed from: a */
    public final /* synthetic */ int f27571a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f27572b;

    public /* synthetic */ C7138e(android.content.Context r2) {
            r1 = this;
            r0 = 2
            r1.f27571a = r0
            r1.<init>()
            r1.f27572b = r2
            return
    }

    public /* synthetic */ C7138e(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.f27571a = r0
            r1.<init>()
            r1.f27572b = r2
            return
    }

    public /* synthetic */ C7138e(p432y9.InterfaceC7140g r2) {
            r1 = this;
            r0 = 1
            r1.f27571a = r0
            r1.<init>()
            r1.f27572b = r2
            return
    }

    @Override // p392wa.InterfaceC6823b
    public final java.lang.Object get() {
            r9 = this;
            int r0 = r9.f27571a
            switch(r0) {
                case 0: goto Lc;
                case 1: goto L7;
                default: goto L5;
            }
        L5:
            goto L93
        L7:
            java.lang.Object r0 = r9.f27572b
            y9.g r0 = (p432y9.InterfaceC7140g) r0
            return r0
        Lc:
            java.lang.Object r0 = r9.f27572b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "Could not instantiate %s"
            java.lang.String r2 = "Could not instantiate %s."
            r3 = 1
            r4 = 0
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            java.lang.Class<y9.g> r6 = p432y9.InterfaceC7140g.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            if (r6 == 0) goto L31
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            java.lang.Object r5 = r5.newInstance(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            y9.g r5 = (p432y9.InterfaceC7140g) r5     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            goto L92
        L31:
            y9.n r5 = new y9.n     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            java.lang.String r6 = "Class %s is not an instance of %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            r7[r4] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            java.lang.String r8 = "com.google.firebase.components.ComponentRegistrar"
            r7[r3] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            r5.<init>(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
            throw r5     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.NoSuchMethodException -> L55 java.lang.InstantiationException -> L64 java.lang.IllegalAccessException -> L73 java.lang.ClassNotFoundException -> L82
        L46:
            r2 = move-exception
            y9.n r5 = new y9.n
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r0
            java.lang.String r0 = java.lang.String.format(r1, r3)
            r5.<init>(r0, r2)
            throw r5
        L55:
            r2 = move-exception
            y9.n r5 = new y9.n
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r0
            java.lang.String r0 = java.lang.String.format(r1, r3)
            r5.<init>(r0, r2)
            throw r5
        L64:
            r1 = move-exception
            y9.n r5 = new y9.n
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r0
            java.lang.String r0 = java.lang.String.format(r2, r3)
            r5.<init>(r0, r1)
            throw r5
        L73:
            r1 = move-exception
            y9.n r5 = new y9.n
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r0
            java.lang.String r0 = java.lang.String.format(r2, r3)
            r5.<init>(r0, r1)
            throw r5
        L82:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r0
            java.lang.String r0 = "Class %s is not an found."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r1 = "ComponentDiscovery"
            android.util.Log.w(r1, r0)
            r5 = 0
        L92:
            return r5
        L93:
            java.lang.Object r0 = r9.f27572b
            android.content.Context r0 = (android.content.Context) r0
            int r1 = ua.C6367b.f24835b
            ua.e r1 = ua.C6370e.f24837b
            java.lang.Class<ua.e> r1 = ua.C6370e.class
            monitor-enter(r1)
            ua.e r2 = ua.C6370e.f24837b     // Catch: java.lang.Throwable -> Lad
            if (r2 != 0) goto La9
            ua.e r2 = new ua.e     // Catch: java.lang.Throwable -> Lad
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lad
            ua.C6370e.f24837b = r2     // Catch: java.lang.Throwable -> Lad
        La9:
            ua.e r0 = ua.C6370e.f24837b     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r1)
            return r0
        Lad:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
