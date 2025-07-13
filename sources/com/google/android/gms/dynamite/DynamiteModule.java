package com.google.android.gms.dynamite;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: b */
    public static java.lang.Boolean f5632b = null;

    /* renamed from: c */
    public static p429y6.InterfaceC7123d f5633c = null;

    /* renamed from: d */
    public static p429y6.InterfaceC7125f f5634d = null;

    /* renamed from: e */
    public static java.lang.String f5635e = null;

    /* renamed from: f */
    public static int f5636f = -1;

    /* renamed from: g */
    public static final java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule.C1104c> f5637g = null;

    /* renamed from: h */
    public static final java.lang.ThreadLocal<java.lang.Long> f5638h = null;

    /* renamed from: i */
    public static final com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.b f5639i = null;

    /* renamed from: j */
    @androidx.annotation.RecentlyNonNull
    public static final com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b f5640j = null;

    /* renamed from: k */
    @androidx.annotation.RecentlyNonNull
    public static final com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b f5641k = null;

    /* renamed from: l */
    @androidx.annotation.RecentlyNonNull
    public static final com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b f5642l = null;

    /* renamed from: a */
    public final android.content.Context f5643a;

    @com.google.android.gms.common.util.DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @androidx.annotation.RecentlyNullable
        public static java.lang.ClassLoader sClassLoader;

        public DynamiteLoaderClassLoader() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C1102a extends java.lang.Exception {
        public C1102a(java.lang.String r1, java.lang.Throwable r2, p429y6.C7120a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C1102a(java.lang.String r1, p429y6.C7120a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface InterfaceC1103b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public static class a {

            /* renamed from: a */
            public int f5644a;

            /* renamed from: b */
            public int f5645b;

            /* renamed from: c */
            public int f5646c;

            public a() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.f5644a = r0
                    r1.f5645b = r0
                    r1.f5646c = r0
                    return
            }
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public interface b {
            /* renamed from: a */
            int mo3120a(android.content.Context r1, java.lang.String r2, boolean r3);

            /* renamed from: b */
            int mo3121b(android.content.Context r1, java.lang.String r2);
        }

        /* renamed from: a */
        com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.a mo3119a(android.content.Context r1, java.lang.String r2, com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.b r3);
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    public static class C1104c {

        /* renamed from: a */
        public android.database.Cursor f5647a;

        public C1104c() {
                r0 = this;
                r0.<init>()
                return
        }

        public C1104c(p429y6.C7120a r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    public static class C1105d implements com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.b {

        /* renamed from: a */
        public final int f5648a;

        public C1105d(int r1) {
                r0 = this;
                r0.<init>()
                r0.f5648a = r1
                return
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.b
        /* renamed from: a */
        public final int mo3120a(android.content.Context r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.b
        /* renamed from: b */
        public final int mo3121b(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                int r1 = r0.f5648a
                return r1
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.f5637g = r0
            y6.a r0 = new y6.a
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.dynamite.DynamiteModule.f5638h = r0
            com.google.android.gms.dynamite.a r0 = new com.google.android.gms.dynamite.a
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.f5639i = r0
            com.google.android.gms.dynamite.b r0 = new com.google.android.gms.dynamite.b
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.f5640j = r0
            com.google.android.gms.dynamite.d r0 = new com.google.android.gms.dynamite.d
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.f5641k = r0
            com.google.android.gms.dynamite.c r0 = new com.google.android.gms.dynamite.c
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.f5642l = r0
            return
    }

    public DynamiteModule(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f5643a = r2
            return
    }

    /* renamed from: a */
    public static int m3107a(@androidx.annotation.RecentlyNonNull android.content.Context r5, @androidx.annotation.RecentlyNonNull java.lang.String r6) {
            java.lang.String r0 = "DynamiteModule"
            r1 = 0
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            int r2 = r2.length()     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            int r2 = r2 + 61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            r3.<init>(r2)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r2 = "com.google.android.gms.dynamite.descriptors."
            r3.append(r2)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            r3.append(r6)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r2 = ".ModuleDescriptor"
            r3.append(r2)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.Class r5 = r5.loadClass(r2)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r2 = "MODULE_ID"
            java.lang.reflect.Field r2 = r5.getDeclaredField(r2)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r3 = "MODULE_VERSION"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r3)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            boolean r4 = p248o6.C4924o.m11074a(r4, r6)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            if (r4 != 0) goto L7f
            java.lang.Object r5 = r2.get(r3)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            int r2 = r5.length()     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            int r2 = r2 + 51
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            int r3 = r3.length()     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            r3.<init>(r2)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r2 = "Module descriptor id '"
            r3.append(r2)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            r3.append(r5)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r5 = "' didn't match expected id '"
            r3.append(r5)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            r3.append(r6)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r5 = "'"
            r3.append(r5)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            android.util.Log.e(r0, r5)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            return r1
        L7f:
            int r5 = r5.getInt(r3)     // Catch: java.lang.Exception -> L84 java.lang.ClassNotFoundException -> La3
            return r5
        L84:
            r5 = move-exception
            java.lang.String r6 = "Failed to load module descriptor class: "
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r2 = r5.length()
            if (r2 == 0) goto L9a
            java.lang.String r5 = r6.concat(r5)
            goto L9f
        L9a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L9f:
            android.util.Log.e(r0, r5)
            goto Lc2
        La3:
            r5 = 45
            int r5 = p064e.C1489c.m4038a(r6, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            java.lang.String r5 = "Local module descriptor class for "
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = " not found."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.w(r0, r5)
        Lc2:
            return r1
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: c */
    public static com.google.android.gms.dynamite.DynamiteModule m3108c(@androidx.annotation.RecentlyNonNull android.content.Context r18, @androidx.annotation.RecentlyNonNull com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b r19, @androidx.annotation.RecentlyNonNull java.lang.String r20) {
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r0 = ":"
            java.lang.String r4 = "DynamiteModule"
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r5 = com.google.android.gms.dynamite.DynamiteModule.f5637g
            java.lang.Object r6 = r5.get()
            com.google.android.gms.dynamite.DynamiteModule$c r6 = (com.google.android.gms.dynamite.DynamiteModule.C1104c) r6
            com.google.android.gms.dynamite.DynamiteModule$c r7 = new com.google.android.gms.dynamite.DynamiteModule$c
            r8 = 0
            r7.<init>(r8)
            r5.set(r7)
            java.lang.ThreadLocal<java.lang.Long> r9 = com.google.android.gms.dynamite.DynamiteModule.f5638h
            java.lang.Object r10 = r9.get()
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L16c
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L16c
            r9.set(r14)     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.dynamite.DynamiteModule$b$b r14 = com.google.android.gms.dynamite.DynamiteModule.f5639i     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.dynamite.DynamiteModule$b$a r14 = r2.mo3119a(r1, r3, r14)     // Catch: java.lang.Throwable -> L16c
            int r15 = r14.f5644a     // Catch: java.lang.Throwable -> L16c
            int r8 = r14.f5645b     // Catch: java.lang.Throwable -> L16c
            int r16 = r20.length()     // Catch: java.lang.Throwable -> L16c
            int r16 = r16 + 68
            int r17 = r20.length()     // Catch: java.lang.Throwable -> L16c
            int r12 = r16 + r17
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16c
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r12 = "Considering local module "
            r13.append(r12)     // Catch: java.lang.Throwable -> L16c
            r13.append(r3)     // Catch: java.lang.Throwable -> L16c
            r13.append(r0)     // Catch: java.lang.Throwable -> L16c
            r13.append(r15)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r12 = " and remote module "
            r13.append(r12)     // Catch: java.lang.Throwable -> L16c
            r13.append(r3)     // Catch: java.lang.Throwable -> L16c
            r13.append(r0)     // Catch: java.lang.Throwable -> L16c
            r13.append(r8)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L16c
            android.util.Log.i(r4, r0)     // Catch: java.lang.Throwable -> L16c
            int r0 = r14.f5646c     // Catch: java.lang.Throwable -> L16c
            if (r0 == 0) goto L141
            r8 = -1
            if (r0 != r8) goto L7b
            int r12 = r14.f5644a     // Catch: java.lang.Throwable -> L16c
            if (r12 == 0) goto L141
        L7b:
            r12 = 1
            if (r0 != r12) goto L82
            int r13 = r14.f5645b     // Catch: java.lang.Throwable -> L16c
            if (r13 == 0) goto L141
        L82:
            if (r0 != r8) goto La4
            com.google.android.gms.dynamite.DynamiteModule r0 = m3110e(r1, r3)     // Catch: java.lang.Throwable -> L16c
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L92
            r9.remove()
            goto L99
        L92:
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r9.set(r1)
        L99:
            android.database.Cursor r1 = r7.f5647a
            if (r1 == 0) goto La0
            r1.close()
        La0:
            r5.set(r6)
            return r0
        La4:
            if (r0 != r12) goto L125
            int r0 = r14.f5645b     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> Lc8 java.lang.Throwable -> L16c
            com.google.android.gms.dynamite.DynamiteModule r0 = m3111f(r1, r3, r0)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> Lc8 java.lang.Throwable -> L16c
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto Lb6
            r9.remove()
            goto Lbd
        Lb6:
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r9.set(r1)
        Lbd:
            android.database.Cursor r1 = r7.f5647a
            if (r1 == 0) goto Lc4
            r1.close()
        Lc4:
            r5.set(r6)
            return r0
        Lc8:
            r0 = move-exception
            java.lang.String r5 = "Failed to load remote module: "
            java.lang.String r9 = r0.getMessage()     // Catch: java.lang.Throwable -> L16c
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L16c
            int r12 = r9.length()     // Catch: java.lang.Throwable -> L16c
            if (r12 == 0) goto Lde
            java.lang.String r5 = r5.concat(r9)     // Catch: java.lang.Throwable -> L16c
            goto Le4
        Lde:
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L16c
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L16c
            r5 = r9
        Le4:
            android.util.Log.w(r4, r5)     // Catch: java.lang.Throwable -> L16c
            int r4 = r14.f5644a     // Catch: java.lang.Throwable -> L16c
            if (r4 == 0) goto L11c
            com.google.android.gms.dynamite.DynamiteModule$d r5 = new com.google.android.gms.dynamite.DynamiteModule$d     // Catch: java.lang.Throwable -> L16c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L16c
            com.google.android.gms.dynamite.DynamiteModule$b$a r2 = r2.mo3119a(r1, r3, r5)     // Catch: java.lang.Throwable -> L16c
            int r2 = r2.f5646c     // Catch: java.lang.Throwable -> L16c
            if (r2 != r8) goto L11c
            com.google.android.gms.dynamite.DynamiteModule r0 = m3110e(r1, r3)     // Catch: java.lang.Throwable -> L16c
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.f5638h
            if (r3 != 0) goto L108
            r1.remove()
            goto L10f
        L108:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r1.set(r2)
        L10f:
            android.database.Cursor r1 = r7.f5647a
            if (r1 == 0) goto L116
            r1.close()
        L116:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r1 = com.google.android.gms.dynamite.DynamiteModule.f5637g
            r1.set(r6)
            return r0
        L11c:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L16c
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L16c
            throw r1     // Catch: java.lang.Throwable -> L16c
        L125:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L16c
            int r1 = r14.f5646c     // Catch: java.lang.Throwable -> L16c
            r2 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r3.append(r2)     // Catch: java.lang.Throwable -> L16c
            r3.append(r1)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L16c
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L16c
            throw r0     // Catch: java.lang.Throwable -> L16c
        L141:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L16c
            int r1 = r14.f5644a     // Catch: java.lang.Throwable -> L16c
            int r2 = r14.f5645b     // Catch: java.lang.Throwable -> L16c
            r3 = 91
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r3 = "No acceptable module found. Local version is "
            r4.append(r3)     // Catch: java.lang.Throwable -> L16c
            r4.append(r1)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch: java.lang.Throwable -> L16c
            r4.append(r2)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r1 = "."
            r4.append(r1)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L16c
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L16c
            throw r0     // Catch: java.lang.Throwable -> L16c
        L16c:
            r0 = move-exception
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.f5638h
            if (r3 != 0) goto L179
            r1.remove()
            goto L180
        L179:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r1.set(r2)
        L180:
            android.database.Cursor r1 = r7.f5647a
            if (r1 == 0) goto L187
            r1.close()
        L187:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r1 = com.google.android.gms.dynamite.DynamiteModule.f5637g
            r1.set(r6)
            throw r0
    }

    /* renamed from: d */
    public static int m3109d(@androidx.annotation.RecentlyNonNull android.content.Context r8, @androidx.annotation.RecentlyNonNull java.lang.String r9, boolean r10) {
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L105
            java.lang.Boolean r1 = com.google.android.gms.dynamite.DynamiteModule.f5632b     // Catch: java.lang.Throwable -> L102
            if (r1 != 0) goto Lcf
            android.content.Context r1 = r8.getApplicationContext()     // Catch: java.lang.NoSuchFieldException -> La6 java.lang.IllegalAccessException -> La8 java.lang.ClassNotFoundException -> Laa java.lang.Throwable -> L102
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.NoSuchFieldException -> La6 java.lang.IllegalAccessException -> La8 java.lang.ClassNotFoundException -> Laa java.lang.Throwable -> L102
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.NoSuchFieldException -> La6 java.lang.IllegalAccessException -> La8 java.lang.ClassNotFoundException -> Laa java.lang.Throwable -> L102
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.NoSuchFieldException -> La6 java.lang.IllegalAccessException -> La8 java.lang.ClassNotFoundException -> Laa java.lang.Throwable -> L102
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> La6 java.lang.IllegalAccessException -> La8 java.lang.ClassNotFoundException -> Laa java.lang.Throwable -> L102
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch: java.lang.NoSuchFieldException -> La6 java.lang.IllegalAccessException -> La8 java.lang.ClassNotFoundException -> Laa java.lang.Throwable -> L102
            monitor-enter(r2)     // Catch: java.lang.NoSuchFieldException -> La6 java.lang.IllegalAccessException -> La8 java.lang.ClassNotFoundException -> Laa java.lang.Throwable -> L102
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> La3
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L3a
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> La3
            if (r4 != r1) goto L34
            goto L9f
        L34:
            m3113h(r4)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L37 java.lang.Throwable -> La3
        L37:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La3
            goto La1
        L3a:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> La3
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L52
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> La3
            r1.set(r3, r4)     // Catch: java.lang.Throwable -> La3
            goto L9f
        L52:
            int r4 = m3117l(r8, r9, r10)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            java.lang.String r5 = com.google.android.gms.dynamite.DynamiteModule.f5635e     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            if (r5 == 0) goto L95
            boolean r5 = r5.isEmpty()     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            if (r5 == 0) goto L61
            goto L95
        L61:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            r6 = 29
            if (r5 < r6) goto L78
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            java.lang.String r6 = com.google.android.gms.dynamite.DynamiteModule.f5635e     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r6, r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            r5.<init>(r6, r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            goto L88
        L78:
            y6.b r5 = new y6.b     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            java.lang.String r6 = com.google.android.gms.dynamite.DynamiteModule.f5635e     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r6, r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            r5.<init>(r6, r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
        L88:
            m3113h(r5)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            r1.set(r3, r5)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            com.google.android.gms.dynamite.DynamiteModule.f5632b = r5     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L98 java.lang.Throwable -> La3
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L102
            return r4
        L95:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L102
            return r4
        L98:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> La3
            r1.set(r3, r4)     // Catch: java.lang.Throwable -> La3
        L9f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> La3
        La1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            goto Lcd
        La3:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            throw r1     // Catch: java.lang.NoSuchFieldException -> La6 java.lang.IllegalAccessException -> La8 java.lang.ClassNotFoundException -> Laa java.lang.Throwable -> L102
        La6:
            r1 = move-exception
            goto Lab
        La8:
            r1 = move-exception
            goto Lab
        Laa:
            r1 = move-exception
        Lab:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L102
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L102
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L102
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L102
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch: java.lang.Throwable -> L102
            r4.append(r1)     // Catch: java.lang.Throwable -> L102
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L102
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L102
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L102
        Lcd:
            com.google.android.gms.dynamite.DynamiteModule.f5632b = r1     // Catch: java.lang.Throwable -> L102
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L102
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L105
            if (r0 == 0) goto Lfd
            int r8 = m3117l(r8, r9, r10)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ldb java.lang.Throwable -> L105
            return r8
        Ldb:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L105
            int r1 = r9.length()     // Catch: java.lang.Throwable -> L105
            if (r1 == 0) goto Lf3
            java.lang.String r9 = r0.concat(r9)     // Catch: java.lang.Throwable -> L105
            goto Lf8
        Lf3:
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L105
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L105
        Lf8:
            android.util.Log.w(r10, r9)     // Catch: java.lang.Throwable -> L105
            r8 = 0
            return r8
        Lfd:
            int r8 = m3115j(r8, r9, r10)     // Catch: java.lang.Throwable -> L105
            return r8
        L102:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L102
            throw r9     // Catch: java.lang.Throwable -> L105
        L105:
            r9 = move-exception
            java.lang.String r10 = "null reference"
            java.util.Objects.requireNonNull(r8, r10)     // Catch: java.lang.Exception -> L10c
            goto L114
        L10c:
            r8 = move-exception
            java.lang.String r10 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r10, r0, r8)
        L114:
            throw r9
    }

    /* renamed from: e */
    public static com.google.android.gms.dynamite.DynamiteModule m3110e(android.content.Context r2, java.lang.String r3) {
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "Selected local version of "
            if (r0 == 0) goto L11
            java.lang.String r3 = r1.concat(r3)
            goto L16
        L11:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L16:
            java.lang.String r0 = "DynamiteModule"
            android.util.Log.i(r0, r3)
            com.google.android.gms.dynamite.DynamiteModule r3 = new com.google.android.gms.dynamite.DynamiteModule
            android.content.Context r2 = r2.getApplicationContext()
            r3.<init>(r2)
            return r3
    }

    /* renamed from: f */
    public static com.google.android.gms.dynamite.DynamiteModule m3111f(android.content.Context r5, java.lang.String r6, int r7) {
            r0 = 0
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            java.lang.Boolean r2 = com.google.android.gms.dynamite.DynamiteModule.f5632b     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto Lb2
            boolean r1 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            if (r1 == 0) goto L14
            com.google.android.gms.dynamite.DynamiteModule r5 = m3116k(r5, r6, r7)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            return r5
        L14:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            int r2 = r2 + 51
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            java.lang.String r2 = "Selected remote version of "
            r3.append(r2)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            r3.append(r6)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            java.lang.String r2 = ", version >= "
            r3.append(r2)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            r3.append(r7)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            android.util.Log.i(r1, r2)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            y6.d r1 = m3112g(r5)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            if (r1 == 0) goto Laa
            int r2 = r1.mo14240b()     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            r3 = 3
            if (r2 < r3) goto L6c
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r2 = com.google.android.gms.dynamite.DynamiteModule.f5637g     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            com.google.android.gms.dynamite.DynamiteModule$c r2 = (com.google.android.gms.dynamite.DynamiteModule.C1104c) r2     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            if (r2 == 0) goto L64
            x6.b r3 = new x6.b     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            r3.<init>(r5)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            android.database.Cursor r2 = r2.f5647a     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            x6.b r4 = new x6.b     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            r4.<init>(r2)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            x6.a r6 = r1.mo14237C(r3, r6, r7, r4)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            goto L90
        L64:
            com.google.android.gms.dynamite.DynamiteModule$a r6 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            java.lang.String r7 = "No cached result cursor holder"
            r6.<init>(r7, r0)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            throw r6     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
        L6c:
            r3 = 2
            if (r2 != r3) goto L80
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r3 = "IDynamite loader version = 2"
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            x6.b r2 = new x6.b     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            x6.a r6 = r1.mo14236B1(r2, r6, r7)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            goto L90
        L80:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r3 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            x6.b r2 = new x6.b     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            x6.a r6 = r1.mo14239V0(r2, r6, r7)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
        L90:
            java.lang.Object r7 = p408x6.BinderC6958b.m14124H(r6)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            if (r7 == 0) goto La2
            com.google.android.gms.dynamite.DynamiteModule r7 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            java.lang.Object r6 = p408x6.BinderC6958b.m14124H(r6)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            return r7
        La2:
            com.google.android.gms.dynamite.DynamiteModule$a r6 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            java.lang.String r7 = "Failed to load remote module."
            r6.<init>(r7, r0)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            throw r6     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
        Laa:
            com.google.android.gms.dynamite.DynamiteModule$a r6 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            java.lang.String r7 = "Failed to create IDynamiteLoader."
            r6.<init>(r7, r0)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            throw r6     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
        Lb2:
            com.google.android.gms.dynamite.DynamiteModule$a r6 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            java.lang.String r7 = "Failed to determine which loading route to use."
            r6.<init>(r7, r0)     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
            throw r6     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
        Lba:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            throw r6     // Catch: java.lang.Throwable -> Lbd com.google.android.gms.dynamite.DynamiteModule.C1102a -> Ld4 android.os.RemoteException -> Ld6
        Lbd:
            r6 = move-exception
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r5, r7)     // Catch: java.lang.Exception -> Lc4
            goto Lcc
        Lc4:
            r5 = move-exception
            java.lang.String r7 = "CrashUtils"
            java.lang.String r1 = "Error adding exception to DropBox!"
            android.util.Log.e(r7, r1, r5)
        Lcc:
            com.google.android.gms.dynamite.DynamiteModule$a r5 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r7 = "Failed to load remote module."
            r5.<init>(r7, r6, r0)
            throw r5
        Ld4:
            r5 = move-exception
            throw r5
        Ld6:
            r5 = move-exception
            com.google.android.gms.dynamite.DynamiteModule$a r6 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r7 = "Failed to load remote module."
            r6.<init>(r7, r5, r0)
            throw r6
    }

    /* renamed from: g */
    public static p429y6.InterfaceC7123d m3112g(android.content.Context r5) {
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            y6.d r1 = com.google.android.gms.dynamite.DynamiteModule.f5633c     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return r1
        L9:
            r1 = 0
            java.lang.String r2 = "com.google.android.gms"
            r3 = 3
            android.content.Context r5 = r5.createPackageContext(r2, r3)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            java.lang.String r2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r5 = r5.loadClass(r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            if (r5 != 0) goto L25
            r2 = r1
            goto L37
        L25:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r5.queryLocalInterface(r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            boolean r3 = r2 instanceof p429y6.InterfaceC7123d     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            if (r3 == 0) goto L32
            y6.d r2 = (p429y6.InterfaceC7123d) r2     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            goto L37
        L32:
            y6.c r2 = new y6.c     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            r2.<init>(r5)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
        L37:
            if (r2 == 0) goto L5d
            com.google.android.gms.dynamite.DynamiteModule.f5633c = r2     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return r2
        L3d:
            r5 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r3 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L5f
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L55
            java.lang.String r5 = r3.concat(r5)     // Catch: java.lang.Throwable -> L5f
            goto L5a
        L55:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L5f
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L5f
        L5a:
            android.util.Log.e(r2, r5)     // Catch: java.lang.Throwable -> L5f
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return r1
        L5f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r5
    }

    /* renamed from: h */
    public static void m3113h(java.lang.ClassLoader r3) {
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            java.lang.reflect.Constructor r3 = r3.getConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            java.lang.Object r3 = r3.newInstance(r1)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            if (r3 != 0) goto L1a
            r1 = r0
            goto L2c
        L1a:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            boolean r2 = r1 instanceof p429y6.InterfaceC7125f     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            if (r2 == 0) goto L27
            y6.f r1 = (p429y6.InterfaceC7125f) r1     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            goto L2c
        L27:
            y6.e r1 = new y6.e     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            r1.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
        L2c:
            com.google.android.gms.dynamite.DynamiteModule.f5634d = r1     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            return
        L2f:
            r3 = move-exception
            goto L38
        L31:
            r3 = move-exception
            goto L38
        L33:
            r3 = move-exception
            goto L38
        L35:
            r3 = move-exception
            goto L38
        L37:
            r3 = move-exception
        L38:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r2 = "Failed to instantiate dynamite loader"
            r1.<init>(r2, r3, r0)
            throw r1
    }

    /* renamed from: i */
    public static boolean m3114i(android.database.Cursor r2) {
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r0 = com.google.android.gms.dynamite.DynamiteModule.f5637g
            java.lang.Object r0 = r0.get()
            com.google.android.gms.dynamite.DynamiteModule$c r0 = (com.google.android.gms.dynamite.DynamiteModule.C1104c) r0
            if (r0 == 0) goto L12
            android.database.Cursor r1 = r0.f5647a
            if (r1 != 0) goto L12
            r0.f5647a = r2
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    /* renamed from: j */
    public static int m3115j(android.content.Context r9, java.lang.String r10, boolean r11) {
            java.lang.String r0 = "DynamiteModule"
            y6.d r1 = m3112g(r9)
            r7 = 0
            if (r1 != 0) goto La
            return r7
        La:
            r8 = 0
            int r2 = r1.mo14240b()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            r3 = 3
            if (r2 < r3) goto L65
            x6.b r2 = new x6.b     // Catch: java.lang.Throwable -> L61 android.os.RemoteException -> L63
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L61 android.os.RemoteException -> L63
            java.lang.ThreadLocal<java.lang.Long> r9 = com.google.android.gms.dynamite.DynamiteModule.f5638h     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            long r5 = r9.longValue()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            r3 = r10
            r4 = r11
            x6.a r9 = r1.mo14241i1(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            java.lang.Object r9 = p408x6.BinderC6958b.m14124H(r9)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            android.database.Cursor r9 = (android.database.Cursor) r9     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            if (r9 == 0) goto L52
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L4f
            if (r10 != 0) goto L38
            goto L52
        L38:
            int r10 = r9.getInt(r7)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L4f
            if (r10 <= 0) goto L45
            boolean r11 = m3114i(r9)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L4f
            if (r11 == 0) goto L45
            goto L46
        L45:
            r8 = r9
        L46:
            if (r8 == 0) goto L4b
            r8.close()
        L4b:
            return r10
        L4c:
            r10 = move-exception
            r8 = r9
            goto Lad
        L4f:
            r10 = move-exception
            r8 = r9
            goto L89
        L52:
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r0, r10)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L4f
            if (r9 == 0) goto L5c
            r9.close()
        L5c:
            return r7
        L5d:
            r10 = r9
            goto Lad
        L5f:
            r10 = r9
            goto L89
        L61:
            r9 = move-exception
            goto L5d
        L63:
            r9 = move-exception
            goto L5f
        L65:
            r3 = 2
            if (r2 != r3) goto L77
            java.lang.String r2 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r2)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            x6.b r2 = new x6.b     // Catch: java.lang.Throwable -> L61 android.os.RemoteException -> L63
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L61 android.os.RemoteException -> L63
            int r9 = r1.mo14238P1(r2, r10, r11)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            return r9
        L77:
            java.lang.String r2 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r2)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            x6.b r2 = new x6.b     // Catch: java.lang.Throwable -> L61 android.os.RemoteException -> L63
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L61 android.os.RemoteException -> L63
            int r9 = r1.mo14242w1(r2, r10, r11)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            return r9
        L86:
            r10 = move-exception
            goto Lad
        L88:
            r10 = move-exception
        L89:
            java.lang.String r9 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L86
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L86
            int r11 = r10.length()     // Catch: java.lang.Throwable -> L86
            if (r11 == 0) goto L9e
            java.lang.String r9 = r9.concat(r10)     // Catch: java.lang.Throwable -> L86
            goto La4
        L9e:
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L86
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L86
            r9 = r10
        La4:
            android.util.Log.w(r0, r9)     // Catch: java.lang.Throwable -> L86
            if (r8 == 0) goto Lac
            r8.close()
        Lac:
            return r7
        Lad:
            if (r8 == 0) goto Lb2
            r8.close()
        Lb2:
            throw r10
    }

    /* renamed from: k */
    public static com.google.android.gms.dynamite.DynamiteModule m3116k(android.content.Context r6, java.lang.String r7, int r8) {
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            java.lang.String r1 = "DynamiteModule"
            r2 = 51
            int r2 = p064e.C1489c.m4038a(r7, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Selected remote version of "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = ", version >= "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            android.util.Log.i(r1, r2)
            monitor-enter(r0)
            y6.f r1 = com.google.android.gms.dynamite.DynamiteModule.f5634d     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            r2 = 0
            if (r1 == 0) goto La6
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r3 = com.google.android.gms.dynamite.DynamiteModule.f5637g
            java.lang.Object r3 = r3.get()
            com.google.android.gms.dynamite.DynamiteModule$c r3 = (com.google.android.gms.dynamite.DynamiteModule.C1104c) r3
            if (r3 == 0) goto L9e
            android.database.Cursor r4 = r3.f5647a
            if (r4 == 0) goto L9e
            android.content.Context r6 = r6.getApplicationContext()
            android.database.Cursor r3 = r3.f5647a
            x6.b r4 = new x6.b
            r4.<init>(r2)
            monitor-enter(r0)
            int r4 = com.google.android.gms.dynamite.DynamiteModule.f5636f     // Catch: java.lang.Throwable -> L9b
            r5 = 2
            if (r4 < r5) goto L4e
            r4 = 1
            goto L4f
        L4e:
            r4 = 0
        L4f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L70
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r0, r4)
            x6.b r0 = new x6.b
            r0.<init>(r6)
            x6.b r6 = new x6.b
            r6.<init>(r3)
            x6.a r6 = r1.mo14244f2(r0, r7, r8, r6)
            goto L85
        L70:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r0, r4)
            x6.b r0 = new x6.b
            r0.<init>(r6)
            x6.b r6 = new x6.b
            r6.<init>(r3)
            x6.a r6 = r1.mo14243C(r0, r7, r8, r6)
        L85:
            java.lang.Object r6 = p408x6.BinderC6958b.m14124H(r6)
            android.content.Context r6 = (android.content.Context) r6
            if (r6 == 0) goto L93
            com.google.android.gms.dynamite.DynamiteModule r7 = new com.google.android.gms.dynamite.DynamiteModule
            r7.<init>(r6)
            return r7
        L93:
            com.google.android.gms.dynamite.DynamiteModule$a r6 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r7 = "Failed to get module context"
            r6.<init>(r7, r2)
            throw r6
        L9b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r6
        L9e:
            com.google.android.gms.dynamite.DynamiteModule$a r6 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r7 = "No result cursor"
            r6.<init>(r7, r2)
            throw r6
        La6:
            com.google.android.gms.dynamite.DynamiteModule$a r6 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r7 = "DynamiteLoaderV2 was not cached."
            r6.<init>(r7, r2)
            throw r6
        Lae:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            throw r6
    }

    /* renamed from: l */
    public static int m3117l(android.content.Context r10, java.lang.String r11, boolean r12) {
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.f5638h     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            if (r12 == 0) goto L16
            java.lang.String r10 = "api_force_staging"
            goto L18
        L16:
            java.lang.String r10 = "api"
        L18:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            r12.<init>()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            if (r10 == 0) goto L80
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93
            if (r11 == 0) goto L80
            r11 = 0
            int r11 = r10.getInt(r11)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93
            if (r11 <= 0) goto L79
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r12 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93
            r1 = 2
            java.lang.String r1 = r10.getString(r1)     // Catch: java.lang.Throwable -> L76
            com.google.android.gms.dynamite.DynamiteModule.f5635e = r1     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "loaderVersion"
            int r1 = r10.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L76
            if (r1 < 0) goto L6e
            int r1 = r10.getInt(r1)     // Catch: java.lang.Throwable -> L76
            com.google.android.gms.dynamite.DynamiteModule.f5636f = r1     // Catch: java.lang.Throwable -> L76
        L6e:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L76
            boolean r12 = m3114i(r10)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93
            if (r12 == 0) goto L79
            goto L7a
        L76:
            r11 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L76
            throw r11     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93
        L79:
            r0 = r10
        L7a:
            if (r0 == 0) goto L7f
            r0.close()
        L7f:
            return r11
        L80:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93
            throw r11     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93
        L8f:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto Lab
        L93:
            r11 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto L9c
        L98:
            r10 = move-exception
            goto Lab
        L9a:
            r10 = move-exception
            r11 = r0
        L9c:
            boolean r12 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.C1102a     // Catch: java.lang.Throwable -> La9
            if (r12 == 0) goto La1
            throw r10     // Catch: java.lang.Throwable -> La9
        La1:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r10, r0)     // Catch: java.lang.Throwable -> La9
            throw r12     // Catch: java.lang.Throwable -> La9
        La9:
            r10 = move-exception
            r0 = r11
        Lab:
            if (r0 == 0) goto Lb0
            r0.close()
        Lb0:
            throw r10
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: b */
    public final android.os.IBinder m3118b(@androidx.annotation.RecentlyNonNull java.lang.String r5) {
            r4 = this;
            android.content.Context r0 = r4.f5643a     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Class r0 = r0.loadClass(r5)     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            return r0
        L11:
            r0 = move-exception
            goto L16
        L13:
            r0 = move-exception
            goto L16
        L15:
            r0 = move-exception
        L16:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r2 = "Failed to instantiate module class: "
            int r3 = r5.length()
            if (r3 == 0) goto L25
            java.lang.String r5 = r2.concat(r5)
            goto L2a
        L25:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L2a:
            r2 = 0
            r1.<init>(r5, r0, r2)
            throw r1
    }
}
