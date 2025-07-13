package p185k7;

import p185k7.C3948q5;

/* renamed from: k7.y5 */
/* loaded from: classes.dex */
public abstract class AbstractC4052y5<T extends p185k7.C3948q5> {

    /* renamed from: a */
    public static final java.util.logging.Logger f16968a = null;

    /* renamed from: b */
    public static final java.lang.String f16969b = null;

    static {
            java.lang.Class<k7.m5> r0 = p185k7.AbstractC3896m5.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p185k7.AbstractC4052y5.f16968a = r0
            java.lang.String r0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            p185k7.AbstractC4052y5.f16969b = r0
            return
    }

    public AbstractC4052y5() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: b */
    public static <T extends p185k7.C3948q5> T m9153b(java.lang.Class<T> r11) {
            java.lang.Class<k7.y5> r0 = p185k7.AbstractC4052y5.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Class<k7.q5> r2 = p185k7.C3948q5.class
            boolean r2 = r11.equals(r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L13
            java.lang.String r2 = p185k7.AbstractC4052y5.f16969b
            goto L3a
        L13:
            java.lang.Package r2 = r11.getPackage()
            java.lang.Package r5 = r0.getPackage()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto Lfe
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Package r5 = r11.getPackage()
            java.lang.String r5 = r5.getName()
            r2[r4] = r5
            java.lang.String r5 = r11.getSimpleName()
            r2[r3] = r5
            java.lang.String r5 = "%s.BlazeGenerated%sLoader"
            java.lang.String r2 = java.lang.String.format(r5, r2)
        L3a:
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r1)     // Catch: java.lang.ClassNotFoundException -> L73
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            java.lang.Object r2 = r2.newInstance(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            k7.y5 r2 = (p185k7.AbstractC4052y5) r2     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            k7.q5 r2 = r2.m9154a()     // Catch: java.lang.ClassNotFoundException -> L73
            java.lang.Object r2 = r11.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            k7.q5 r2 = (p185k7.C3948q5) r2     // Catch: java.lang.ClassNotFoundException -> L73
            return r2
        L57:
            r2 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L5e:
            r2 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L65:
            r2 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L6c:
            r2 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L73:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L80:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lbd
            java.lang.Object r2 = r0.next()     // Catch: java.util.ServiceConfigurationError -> L98
            k7.y5 r2 = (p185k7.AbstractC4052y5) r2     // Catch: java.util.ServiceConfigurationError -> L98
            k7.q5 r2 = r2.m9154a()     // Catch: java.util.ServiceConfigurationError -> L98
            java.lang.Object r2 = r11.cast(r2)     // Catch: java.util.ServiceConfigurationError -> L98
            r1.add(r2)     // Catch: java.util.ServiceConfigurationError -> L98
            goto L80
        L98:
            r2 = move-exception
            r10 = r2
            java.util.logging.Logger r5 = p185k7.AbstractC4052y5.f16968a
            java.util.logging.Level r6 = java.util.logging.Level.SEVERE
            java.lang.String r2 = r11.getSimpleName()
            java.lang.String r7 = "Unable to load "
            int r8 = r2.length()
            if (r8 == 0) goto Laf
            java.lang.String r2 = r7.concat(r2)
            goto Lb4
        Laf:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
        Lb4:
            r9 = r2
            java.lang.String r7 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            java.lang.String r8 = "load"
            r5.logp(r6, r7, r8, r9, r10)
            goto L80
        Lbd:
            int r0 = r1.size()
            if (r0 != r3) goto Lca
            java.lang.Object r11 = r1.get(r4)
            k7.q5 r11 = (p185k7.C3948q5) r11
            return r11
        Lca:
            int r0 = r1.size()
            r2 = 0
            if (r0 != 0) goto Ld2
            return r2
        Ld2:
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> Le9 java.lang.IllegalAccessException -> Lf0 java.lang.NoSuchMethodException -> Lf7
            java.lang.Class<java.util.Collection> r5 = java.util.Collection.class
            r0[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> Le9 java.lang.IllegalAccessException -> Lf0 java.lang.NoSuchMethodException -> Lf7
            java.lang.String r5 = "combine"
            java.lang.reflect.Method r11 = r11.getMethod(r5, r0)     // Catch: java.lang.reflect.InvocationTargetException -> Le9 java.lang.IllegalAccessException -> Lf0 java.lang.NoSuchMethodException -> Lf7
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> Le9 java.lang.IllegalAccessException -> Lf0 java.lang.NoSuchMethodException -> Lf7
            r0[r4] = r1     // Catch: java.lang.reflect.InvocationTargetException -> Le9 java.lang.IllegalAccessException -> Lf0 java.lang.NoSuchMethodException -> Lf7
            java.lang.Object r11 = r11.invoke(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> Le9 java.lang.IllegalAccessException -> Lf0 java.lang.NoSuchMethodException -> Lf7
            k7.q5 r11 = (p185k7.C3948q5) r11     // Catch: java.lang.reflect.InvocationTargetException -> Le9 java.lang.IllegalAccessException -> Lf0 java.lang.NoSuchMethodException -> Lf7
            return r11
        Le9:
            r11 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        Lf0:
            r11 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        Lf7:
            r11 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        Lfe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.getName()
            r0.<init>(r11)
            throw r0
    }

    /* renamed from: a */
    public abstract T m9154a();
}
