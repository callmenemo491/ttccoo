package androidx.lifecycle;

/* renamed from: androidx.lifecycle.f */
/* loaded from: classes.dex */
public final class C0440f {

    /* renamed from: c */
    public static androidx.lifecycle.C0440f f2489c;

    /* renamed from: a */
    public final java.util.Map<java.lang.Class<?>, androidx.lifecycle.C0440f.a> f2490a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Class<?>, java.lang.Boolean> f2491b;

    /* renamed from: androidx.lifecycle.f$a */
    public static class a {

        /* renamed from: a */
        public final java.util.Map<androidx.lifecycle.AbstractC0458o.b, java.util.List<androidx.lifecycle.C0440f.b>> f2492a;

        /* renamed from: b */
        public final java.util.Map<androidx.lifecycle.C0440f.b, androidx.lifecycle.AbstractC0458o.b> f2493b;

        public a(java.util.Map<androidx.lifecycle.C0440f.b, androidx.lifecycle.AbstractC0458o.b> r5) {
                r4 = this;
                r4.<init>()
                r4.f2493b = r5
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r4.f2492a = r0
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L14:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L42
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                androidx.lifecycle.o$b r1 = (androidx.lifecycle.AbstractC0458o.b) r1
                java.util.Map<androidx.lifecycle.o$b, java.util.List<androidx.lifecycle.f$b>> r2 = r4.f2492a
                java.lang.Object r2 = r2.get(r1)
                java.util.List r2 = (java.util.List) r2
                if (r2 != 0) goto L3a
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Map<androidx.lifecycle.o$b, java.util.List<androidx.lifecycle.f$b>> r3 = r4.f2492a
                r3.put(r1, r2)
            L3a:
                java.lang.Object r0 = r0.getKey()
                r2.add(r0)
                goto L14
            L42:
                return
        }

        /* renamed from: a */
        public static void m1432a(java.util.List<androidx.lifecycle.C0440f.b> r6, androidx.lifecycle.InterfaceC0471v r7, androidx.lifecycle.AbstractC0458o.b r8, java.lang.Object r9) {
                if (r6 == 0) goto L52
                int r0 = r6.size()
                r1 = 1
                int r0 = r0 - r1
            L8:
                if (r0 < 0) goto L52
                java.lang.Object r2 = r6.get(r0)
                androidx.lifecycle.f$b r2 = (androidx.lifecycle.C0440f.b) r2
                java.util.Objects.requireNonNull(r2)
                int r3 = r2.f2494a     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                r4 = 0
                if (r3 == 0) goto L34
                if (r3 == r1) goto L2a
                r5 = 2
                if (r3 == r5) goto L1e
                goto L3b
            L1e:
                java.lang.reflect.Method r2 = r2.f2495b     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                r3[r4] = r7     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                r3[r1] = r8     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                r2.invoke(r9, r3)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                goto L3b
            L2a:
                java.lang.reflect.Method r2 = r2.f2495b     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                r3[r4] = r7     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                r2.invoke(r9, r3)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                goto L3b
            L34:
                java.lang.reflect.Method r2 = r2.f2495b     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
                r2.invoke(r9, r3)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.reflect.InvocationTargetException -> L45
            L3b:
                int r0 = r0 + (-1)
                goto L8
            L3e:
                r6 = move-exception
                java.lang.RuntimeException r7 = new java.lang.RuntimeException
                r7.<init>(r6)
                throw r7
            L45:
                r6 = move-exception
                java.lang.RuntimeException r7 = new java.lang.RuntimeException
                java.lang.Throwable r6 = r6.getCause()
                java.lang.String r8 = "Failed to call observer method"
                r7.<init>(r8, r6)
                throw r7
            L52:
                return
        }
    }

    /* renamed from: androidx.lifecycle.f$b */
    public static final class b {

        /* renamed from: a */
        public final int f2494a;

        /* renamed from: b */
        public final java.lang.reflect.Method f2495b;

        public b(int r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.f2494a = r1
                r0.f2495b = r2
                r1 = 1
                r2.setAccessible(r1)
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.lifecycle.C0440f.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.lifecycle.f$b r5 = (androidx.lifecycle.C0440f.b) r5
                int r1 = r4.f2494a
                int r3 = r5.f2494a
                if (r1 != r3) goto L25
                java.lang.reflect.Method r1 = r4.f2495b
                java.lang.String r1 = r1.getName()
                java.lang.reflect.Method r5 = r5.f2495b
                java.lang.String r5 = r5.getName()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L25
                goto L26
            L25:
                r0 = 0
            L26:
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f2494a
                int r0 = r0 * 31
                java.lang.reflect.Method r1 = r2.f2495b
                java.lang.String r1 = r1.getName()
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }
    }

    static {
            androidx.lifecycle.f r0 = new androidx.lifecycle.f
            r0.<init>()
            androidx.lifecycle.C0440f.f2489c = r0
            return
    }

    public C0440f() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2490a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2491b = r0
            return
    }

    /* renamed from: a */
    public final androidx.lifecycle.C0440f.a m1429a(java.lang.Class<?> r12, java.lang.reflect.Method[] r13) {
            r11 = this;
            java.lang.Class r0 = r12.getSuperclass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r0 == 0) goto L16
            androidx.lifecycle.f$a r0 = r11.m1430b(r0)
            if (r0 == 0) goto L16
            java.util.Map<androidx.lifecycle.f$b, androidx.lifecycle.o$b> r0 = r0.f2493b
            r1.putAll(r0)
        L16:
            java.lang.Class[] r0 = r12.getInterfaces()
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L1d:
            if (r4 >= r2) goto L4e
            r5 = r0[r4]
            androidx.lifecycle.f$a r5 = r11.m1430b(r5)
            java.util.Map<androidx.lifecycle.f$b, androidx.lifecycle.o$b> r5 = r5.f2493b
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L2f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            androidx.lifecycle.f$b r7 = (androidx.lifecycle.C0440f.b) r7
            java.lang.Object r6 = r6.getValue()
            androidx.lifecycle.o$b r6 = (androidx.lifecycle.AbstractC0458o.b) r6
            r11.m1431c(r1, r7, r6, r12)
            goto L2f
        L4b:
            int r4 = r4 + 1
            goto L1d
        L4e:
            if (r13 == 0) goto L51
            goto L55
        L51:
            java.lang.reflect.Method[] r13 = r12.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> Ld7
        L55:
            int r0 = r13.length
            r2 = 0
            r4 = 0
        L58:
            if (r2 >= r0) goto Lc3
            r5 = r13[r2]
            java.lang.Class<androidx.lifecycle.f0> r6 = androidx.lifecycle.InterfaceC0441f0.class
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r6)
            androidx.lifecycle.f0 r6 = (androidx.lifecycle.InterfaceC0441f0) r6
            r7 = 1
            if (r6 != 0) goto L68
            goto Lb8
        L68:
            java.lang.Class[] r4 = r5.getParameterTypes()
            int r8 = r4.length
            if (r8 <= 0) goto L83
            r8 = r4[r3]
            java.lang.Class<androidx.lifecycle.v> r9 = androidx.lifecycle.InterfaceC0471v.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L7b
            r8 = 1
            goto L84
        L7b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "invalid parameter type. Must be one and instanceof LifecycleOwner"
            r12.<init>(r13)
            throw r12
        L83:
            r8 = 0
        L84:
            androidx.lifecycle.o$b r6 = r6.value()
            int r9 = r4.length
            r10 = 2
            if (r9 <= r7) goto Lac
            r8 = r4[r7]
            java.lang.Class<androidx.lifecycle.o$b> r9 = androidx.lifecycle.AbstractC0458o.b.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto La4
            androidx.lifecycle.o$b r8 = androidx.lifecycle.AbstractC0458o.b.ON_ANY
            if (r6 != r8) goto L9c
            r8 = 2
            goto Lac
        L9c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Second arg is supported only for ON_ANY value"
            r12.<init>(r13)
            throw r12
        La4:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "invalid parameter type. second arg must be an event"
            r12.<init>(r13)
            throw r12
        Lac:
            int r4 = r4.length
            if (r4 > r10) goto Lbb
            androidx.lifecycle.f$b r4 = new androidx.lifecycle.f$b
            r4.<init>(r8, r5)
            r11.m1431c(r1, r4, r6, r12)
            r4 = 1
        Lb8:
            int r2 = r2 + 1
            goto L58
        Lbb:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "cannot have more than 2 params"
            r12.<init>(r13)
            throw r12
        Lc3:
            androidx.lifecycle.f$a r13 = new androidx.lifecycle.f$a
            r13.<init>(r1)
            java.util.Map<java.lang.Class<?>, androidx.lifecycle.f$a> r0 = r11.f2490a
            r0.put(r12, r13)
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r0 = r11.f2491b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.put(r12, r1)
            return r13
        Ld7:
            r12 = move-exception
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r13.<init>(r0, r12)
            throw r13
    }

    /* renamed from: b */
    public androidx.lifecycle.C0440f.a m1430b(java.lang.Class<?> r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, androidx.lifecycle.f$a> r0 = r1.f2490a
            java.lang.Object r0 = r0.get(r2)
            androidx.lifecycle.f$a r0 = (androidx.lifecycle.C0440f.a) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r0 = 0
            androidx.lifecycle.f$a r2 = r1.m1429a(r2, r0)
            return r2
    }

    /* renamed from: c */
    public final void m1431c(java.util.Map<androidx.lifecycle.C0440f.b, androidx.lifecycle.AbstractC0458o.b> r3, androidx.lifecycle.C0440f.b r4, androidx.lifecycle.AbstractC0458o.b r5, java.lang.Class<?> r6) {
            r2 = this;
            java.lang.Object r0 = r3.get(r4)
            androidx.lifecycle.o$b r0 = (androidx.lifecycle.AbstractC0458o.b) r0
            if (r0 == 0) goto L40
            if (r5 != r0) goto Lb
            goto L40
        Lb:
            java.lang.reflect.Method r3 = r4.f2495b
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Method "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " in "
            r1.append(r3)
            java.lang.String r3 = r6.getName()
            r1.append(r3)
            java.lang.String r3 = " already declared with different @OnLifecycleEvent value: previous value "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ", new value "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        L40:
            if (r0 != 0) goto L45
            r3.put(r4, r5)
        L45:
            return
    }
}
