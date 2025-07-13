package p405x3;

/* renamed from: x3.g */
/* loaded from: classes.dex */
public class C6925g implements p405x3.InterfaceC6922d {

    /* renamed from: a */
    public final p405x3.C6925g.a f26955a;

    /* renamed from: b */
    public final p405x3.C6923e f26956b;

    /* renamed from: c */
    public final java.util.Map<java.lang.String, p405x3.InterfaceC6926h> f26957c;

    /* renamed from: x3.g$a */
    public static class a {

        /* renamed from: a */
        public final android.content.Context f26958a;

        /* renamed from: b */
        public java.util.Map<java.lang.String, java.lang.String> f26959b;

        public a(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f26959b = r0
                r1.f26958a = r2
                return
        }

        /* renamed from: a */
        public p405x3.InterfaceC6921c m14028a(java.lang.String r15) {
                r14 = this;
                java.lang.String r0 = "Could not instantiate %s"
                java.lang.String r1 = "Could not instantiate %s."
                java.util.Map<java.lang.String, java.lang.String> r2 = r14.f26959b
                r3 = 0
                java.lang.String r4 = "BackendRegistry"
                r5 = 0
                if (r2 != 0) goto L93
                android.content.Context r2 = r14.f26958a
                android.content.pm.PackageManager r6 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
                if (r6 != 0) goto L17
                java.lang.String r2 = "Context has no PackageManager."
                goto L28
            L17:
                android.content.ComponentName r7 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
                java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r8 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
                r7.<init>(r2, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
                r2 = 128(0x80, float:1.8E-43)
                android.content.pm.ServiceInfo r2 = r6.getServiceInfo(r7, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
                if (r2 != 0) goto L2c
                java.lang.String r2 = "TransportBackendDiscovery has no service info."
            L28:
                android.util.Log.w(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
                goto L34
            L2c:
                android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
                goto L35
            L2f:
                java.lang.String r2 = "Application info not found."
                android.util.Log.w(r4, r2)
            L34:
                r2 = r3
            L35:
                if (r2 != 0) goto L41
                java.lang.String r2 = "Could not retrieve metadata, returning empty list of transport backends."
                android.util.Log.w(r4, r2)
                java.util.Map r2 = java.util.Collections.emptyMap()
                goto L91
            L41:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.util.Set r7 = r2.keySet()
                java.util.Iterator r7 = r7.iterator()
            L4e:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L90
                java.lang.Object r8 = r7.next()
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r2.get(r8)
                boolean r10 = r9 instanceof java.lang.String
                if (r10 == 0) goto L4e
                java.lang.String r10 = "backend:"
                boolean r10 = r8.startsWith(r10)
                if (r10 == 0) goto L4e
                java.lang.String r9 = (java.lang.String) r9
                r10 = -1
                java.lang.String r11 = ","
                java.lang.String[] r9 = r9.split(r11, r10)
                int r10 = r9.length
                r11 = 0
            L75:
                if (r11 >= r10) goto L4e
                r12 = r9[r11]
                java.lang.String r12 = r12.trim()
                boolean r13 = r12.isEmpty()
                if (r13 == 0) goto L84
                goto L8d
            L84:
                r13 = 8
                java.lang.String r13 = r8.substring(r13)
                r6.put(r12, r13)
            L8d:
                int r11 = r11 + 1
                goto L75
            L90:
                r2 = r6
            L91:
                r14.f26959b = r2
            L93:
                java.util.Map<java.lang.String, java.lang.String> r2 = r14.f26959b
                java.lang.Object r15 = r2.get(r15)
                java.lang.String r15 = (java.lang.String) r15
                if (r15 != 0) goto L9e
                return r3
            L9e:
                r2 = 1
                java.lang.Class r6 = java.lang.Class.forName(r15)     // Catch: java.lang.reflect.InvocationTargetException -> Lb8 java.lang.NoSuchMethodException -> Lc2 java.lang.InstantiationException -> Lcf java.lang.IllegalAccessException -> Ld9 java.lang.ClassNotFoundException -> Le3
                java.lang.Class<x3.c> r7 = p405x3.InterfaceC6921c.class
                java.lang.Class r6 = r6.asSubclass(r7)     // Catch: java.lang.reflect.InvocationTargetException -> Lb8 java.lang.NoSuchMethodException -> Lc2 java.lang.InstantiationException -> Lcf java.lang.IllegalAccessException -> Ld9 java.lang.ClassNotFoundException -> Le3
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.reflect.InvocationTargetException -> Lb8 java.lang.NoSuchMethodException -> Lc2 java.lang.InstantiationException -> Lcf java.lang.IllegalAccessException -> Ld9 java.lang.ClassNotFoundException -> Le3
                java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r7)     // Catch: java.lang.reflect.InvocationTargetException -> Lb8 java.lang.NoSuchMethodException -> Lc2 java.lang.InstantiationException -> Lcf java.lang.IllegalAccessException -> Ld9 java.lang.ClassNotFoundException -> Le3
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> Lb8 java.lang.NoSuchMethodException -> Lc2 java.lang.InstantiationException -> Lcf java.lang.IllegalAccessException -> Ld9 java.lang.ClassNotFoundException -> Le3
                java.lang.Object r6 = r6.newInstance(r7)     // Catch: java.lang.reflect.InvocationTargetException -> Lb8 java.lang.NoSuchMethodException -> Lc2 java.lang.InstantiationException -> Lcf java.lang.IllegalAccessException -> Ld9 java.lang.ClassNotFoundException -> Le3
                x3.c r6 = (p405x3.InterfaceC6921c) r6     // Catch: java.lang.reflect.InvocationTargetException -> Lb8 java.lang.NoSuchMethodException -> Lc2 java.lang.InstantiationException -> Lcf java.lang.IllegalAccessException -> Ld9 java.lang.ClassNotFoundException -> Le3
                return r6
            Lb8:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r0, r2)
                goto Lcb
            Lc2:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r0, r2)
            Lcb:
                android.util.Log.w(r4, r15, r1)
                goto Lf1
            Lcf:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r1, r2)
                goto Lee
            Ld9:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r1, r2)
                goto Lee
            Le3:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r5] = r15
                java.lang.String r15 = "Class %s is not found."
                java.lang.String r15 = java.lang.String.format(r15, r1)
            Lee:
                android.util.Log.w(r4, r15, r0)
            Lf1:
                return r3
        }
    }

    public C6925g(android.content.Context r2, p405x3.C6923e r3) {
            r1 = this;
            x3.g$a r0 = new x3.g$a
            r0.<init>(r2)
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f26957c = r2
            r1.f26955a = r0
            r1.f26956b = r3
            return
    }

    @Override // p405x3.InterfaceC6922d
    /* renamed from: a */
    public synchronized p405x3.InterfaceC6926h mo14027a(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.Map<java.lang.String, x3.h> r0 = r5.f26957c     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L13
            java.util.Map<java.lang.String, x3.h> r0 = r5.f26957c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L36
            x3.h r6 = (p405x3.InterfaceC6926h) r6     // Catch: java.lang.Throwable -> L36
            monitor-exit(r5)
            return r6
        L13:
            x3.g$a r0 = r5.f26955a     // Catch: java.lang.Throwable -> L36
            x3.c r0 = r0.m14028a(r6)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L1e
            r6 = 0
            monitor-exit(r5)
            return r6
        L1e:
            x3.e r1 = r5.f26956b     // Catch: java.lang.Throwable -> L36
            android.content.Context r2 = r1.f26948a     // Catch: java.lang.Throwable -> L36
            d4.a r3 = r1.f26949b     // Catch: java.lang.Throwable -> L36
            d4.a r1 = r1.f26950c     // Catch: java.lang.Throwable -> L36
            x3.b r4 = new x3.b     // Catch: java.lang.Throwable -> L36
            r4.<init>(r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L36
            x3.h r0 = r0.create(r4)     // Catch: java.lang.Throwable -> L36
            java.util.Map<java.lang.String, x3.h> r1 = r5.f26957c     // Catch: java.lang.Throwable -> L36
            r1.put(r6, r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r5)
            return r0
        L36:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
