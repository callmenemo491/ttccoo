package androidx.lifecycle;

/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public class C0474y {

    /* renamed from: a */
    public static java.util.Map<java.lang.Class<?>, java.lang.Integer> f2573a;

    /* renamed from: b */
    public static java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.InterfaceC0456n>>> f2574b;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.C0474y.f2573a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.C0474y.f2574b = r0
            return
    }

    /* renamed from: a */
    public static androidx.lifecycle.InterfaceC0456n m1468a(java.lang.reflect.Constructor<? extends androidx.lifecycle.InterfaceC0456n> r2, java.lang.Object r3) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            java.lang.Object r2 = r2.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            androidx.lifecycle.n r2 = (androidx.lifecycle.InterfaceC0456n) r2     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            return r2
        Ld:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L14:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L1b:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    /* renamed from: b */
    public static java.lang.String m1469b(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "."
            java.lang.String r2 = "_"
            java.lang.String r3 = r3.replace(r1, r2)
            r0.append(r3)
            java.lang.String r3 = "_LifecycleAdapter"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* renamed from: c */
    public static int m1470c(java.lang.Class<?> r11) {
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = androidx.lifecycle.C0474y.f2573a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L11
            int r11 = r0.intValue()
            return r11
        L11:
            java.lang.Class<androidx.lifecycle.u> r0 = androidx.lifecycle.InterfaceC0470u.class
            java.lang.String r1 = r11.getCanonicalName()
            r2 = 1
            if (r1 != 0) goto L1c
            goto L127
        L1c:
            r1 = 0
            r3 = 0
            java.lang.Package r4 = r11.getPackage()     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            java.lang.String r5 = r11.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            if (r4 == 0) goto L2d
            java.lang.String r4 = r4.getName()     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            goto L2f
        L2d:
            java.lang.String r4 = ""
        L2f:
            boolean r6 = r4.isEmpty()     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            if (r6 == 0) goto L36
            goto L3f
        L36:
            int r6 = r4.length()     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            int r6 = r6 + r2
            java.lang.String r5 = r5.substring(r6)     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
        L3f:
            java.lang.String r5 = m1469b(r5)     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            boolean r6 = r4.isEmpty()     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            if (r6 == 0) goto L4a
            goto L5e
        L4a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            r6.<init>()     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            r6.append(r4)     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            java.lang.String r4 = "."
            r6.append(r4)     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            r6.append(r5)     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            java.lang.String r5 = r6.toString()     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
        L5e:
            java.lang.Class r4 = java.lang.Class.forName(r5)     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            r5[r3] = r11     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            boolean r5 = r4.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            if (r5 != 0) goto L7c
            r4.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.ClassNotFoundException -> L7b
            goto L7c
        L74:
            r11 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r11)
            throw r0
        L7b:
            r4 = r1
        L7c:
            r5 = 2
            if (r4 == 0) goto L87
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.n>>> r0 = androidx.lifecycle.C0474y.f2574b
            java.util.List r1 = java.util.Collections.singletonList(r4)
            goto L121
        L87:
            androidx.lifecycle.f r4 = androidx.lifecycle.C0440f.f2489c
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r6 = r4.f2491b
            java.lang.Object r6 = r6.get(r11)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L98
            boolean r4 = r6.booleanValue()
            goto Lbc
        L98:
            java.lang.reflect.Method[] r6 = r11.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> L133
            int r7 = r6.length
            r8 = 0
        L9e:
            if (r8 >= r7) goto Lb4
            r9 = r6[r8]
            java.lang.Class<androidx.lifecycle.f0> r10 = androidx.lifecycle.InterfaceC0441f0.class
            java.lang.annotation.Annotation r9 = r9.getAnnotation(r10)
            androidx.lifecycle.f0 r9 = (androidx.lifecycle.InterfaceC0441f0) r9
            if (r9 == 0) goto Lb1
            r4.m1429a(r11, r6)
            r4 = 1
            goto Lbc
        Lb1:
            int r8 = r8 + 1
            goto L9e
        Lb4:
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r4 = r4.f2491b
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.put(r11, r6)
            r4 = 0
        Lbc:
            if (r4 == 0) goto Lc0
            goto L127
        Lc0:
            java.lang.Class r4 = r11.getSuperclass()
            if (r4 == 0) goto Lce
            boolean r6 = r0.isAssignableFrom(r4)
            if (r6 == 0) goto Lce
            r6 = 1
            goto Lcf
        Lce:
            r6 = 0
        Lcf:
            if (r6 == 0) goto Le7
            int r1 = m1470c(r4)
            if (r1 != r2) goto Ld8
            goto L127
        Ld8:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.n>>> r6 = androidx.lifecycle.C0474y.f2574b
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r4 = r6.get(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            r1.<init>(r4)
        Le7:
            java.lang.Class[] r4 = r11.getInterfaces()
            int r6 = r4.length
            r7 = 0
        Led:
            if (r7 >= r6) goto L11d
            r8 = r4[r7]
            if (r8 == 0) goto Lfb
            boolean r9 = r0.isAssignableFrom(r8)
            if (r9 == 0) goto Lfb
            r9 = 1
            goto Lfc
        Lfb:
            r9 = 0
        Lfc:
            if (r9 != 0) goto Lff
            goto L11a
        Lff:
            int r9 = m1470c(r8)
            if (r9 != r2) goto L106
            goto L127
        L106:
            if (r1 != 0) goto L10d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L10d:
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.n>>> r9 = androidx.lifecycle.C0474y.f2574b
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r8 = r9.get(r8)
            java.util.Collection r8 = (java.util.Collection) r8
            r1.addAll(r8)
        L11a:
            int r7 = r7 + 1
            goto Led
        L11d:
            if (r1 == 0) goto L127
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.n>>> r0 = androidx.lifecycle.C0474y.f2574b
        L121:
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r11, r1)
            r2 = 2
        L127:
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = androidx.lifecycle.C0474y.f2573a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r11, r1)
            return r2
        L133:
            r11 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r0.<init>(r1, r11)
            throw r0
    }
}
