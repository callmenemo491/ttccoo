package p175ji;

/* renamed from: ji.c */
/* loaded from: classes.dex */
public final class C3613c extends p175ji.C3615e {

    /* renamed from: d */
    public final java.lang.reflect.Method f15885d;

    /* renamed from: e */
    public final java.lang.reflect.Method f15886e;

    /* renamed from: f */
    public final java.lang.reflect.Method f15887f;

    /* renamed from: g */
    public final java.lang.Class<?> f15888g;

    /* renamed from: h */
    public final java.lang.Class<?> f15889h;

    /* renamed from: ji.c$a */
    public static final class a implements java.lang.reflect.InvocationHandler {

        /* renamed from: a */
        public boolean f15890a;

        /* renamed from: b */
        public java.lang.String f15891b;

        /* renamed from: c */
        public final java.util.List<java.lang.String> f15892c;

        public a(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.<init>()
                r0.f15892c = r1
                return
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
                r6 = this;
                java.lang.String r0 = "proxy"
                p214m2.C4339q.m9706k(r7, r0)
                java.lang.String r7 = "method"
                p214m2.C4339q.m9706k(r8, r7)
                r7 = 0
                if (r9 == 0) goto Le
                goto L10
            Le:
                java.lang.Object[] r9 = new java.lang.Object[r7]
            L10:
                java.lang.String r0 = r8.getName()
                java.lang.Class r1 = r8.getReturnType()
                java.lang.String r2 = "supports"
                boolean r2 = p214m2.C4339q.m9702c(r0, r2)
                if (r2 == 0) goto L2b
                java.lang.Class r2 = java.lang.Boolean.TYPE
                boolean r2 = p214m2.C4339q.m9702c(r2, r1)
                if (r2 == 0) goto L2b
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                return r7
            L2b:
                java.lang.String r2 = "unsupported"
                boolean r2 = p214m2.C4339q.m9702c(r0, r2)
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L40
                java.lang.Class r2 = java.lang.Void.TYPE
                boolean r2 = p214m2.C4339q.m9702c(r2, r1)
                if (r2 == 0) goto L40
                r6.f15890a = r4
                return r3
            L40:
                java.lang.String r2 = "protocols"
                boolean r2 = p214m2.C4339q.m9702c(r0, r2)
                if (r2 == 0) goto L53
                int r2 = r9.length
                if (r2 != 0) goto L4d
                r2 = 1
                goto L4e
            L4d:
                r2 = 0
            L4e:
                if (r2 == 0) goto L53
                java.util.List<java.lang.String> r7 = r6.f15892c
                return r7
            L53:
                java.lang.String r2 = "selectProtocol"
                boolean r2 = p214m2.C4339q.m9702c(r0, r2)
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
                if (r2 != 0) goto L65
                java.lang.String r2 = "select"
                boolean r2 = p214m2.C4339q.m9702c(r0, r2)
                if (r2 == 0) goto Laa
            L65:
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                boolean r1 = p214m2.C4339q.m9702c(r2, r1)
                if (r1 == 0) goto Laa
                int r1 = r9.length
                if (r1 != r4) goto Laa
                r1 = r9[r7]
                boolean r1 = r1 instanceof java.util.List
                if (r1 == 0) goto Laa
                r8 = r9[r7]
                java.lang.String r9 = "null cannot be cast to non-null type kotlin.collections.List<*>"
                java.util.Objects.requireNonNull(r8, r9)
                java.util.List r8 = (java.util.List) r8
                int r9 = r8.size()
                if (r9 < 0) goto L9f
                r0 = 0
            L86:
                java.lang.Object r1 = r8.get(r0)
                java.util.Objects.requireNonNull(r1, r5)
                java.lang.String r1 = (java.lang.String) r1
                java.util.List<java.lang.String> r2 = r6.f15892c
                boolean r2 = r2.contains(r1)
                if (r2 == 0) goto L9a
                r6.f15891b = r1
                return r1
            L9a:
                if (r0 == r9) goto L9f
                int r0 = r0 + 1
                goto L86
            L9f:
                java.util.List<java.lang.String> r8 = r6.f15892c
                java.lang.Object r7 = r8.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                r6.f15891b = r7
                return r7
            Laa:
                java.lang.String r1 = "protocolSelected"
                boolean r1 = p214m2.C4339q.m9702c(r0, r1)
                if (r1 != 0) goto Lba
                java.lang.String r1 = "selected"
                boolean r0 = p214m2.C4339q.m9702c(r0, r1)
                if (r0 == 0) goto Lc7
            Lba:
                int r0 = r9.length
                if (r0 != r4) goto Lc7
                r7 = r9[r7]
                java.util.Objects.requireNonNull(r7, r5)
                java.lang.String r7 = (java.lang.String) r7
                r6.f15891b = r7
                return r3
            Lc7:
                int r7 = r9.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r9, r7)
                java.lang.Object r7 = r8.invoke(r6, r7)
                return r7
        }
    }

    public C3613c(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
            r0 = this;
            r0.<init>()
            r0.f15885d = r1
            r0.f15886e = r2
            r0.f15887f = r3
            r0.f15888g = r4
            r0.f15889h = r5
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: a */
    public void mo8047a(javax.net.ssl.SSLSocket r6) {
            r5 = this;
            java.lang.String r0 = "failed to remove ALPN"
            java.lang.reflect.Method r1 = r5.f15887f     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L16
            r2 = 0
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L16
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L16
            r1.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L16
            return
        Lf:
            r6 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r6)
            throw r1
        L16:
            r6 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r6)
            throw r1
    }

    @Override // p175ji.C3615e
    /* renamed from: d */
    public void mo8039d(javax.net.ssl.SSLSocket r7, java.lang.String r8, java.util.List<? extends bi.EnumC0773b0> r9) {
            r6 = this;
            java.lang.String r8 = "failed to set ALPN"
            java.lang.String r0 = "protocols"
            p214m2.C4339q.m9706k(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L10:
            boolean r1 = r9.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r9.next()
            r4 = r1
            bi.b0 r4 = (bi.EnumC0773b0) r4
            bi.b0 r5 = bi.EnumC0773b0.f4184Z
            if (r4 == r5) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L10
            r0.add(r1)
            goto L10
        L2b:
            java.util.ArrayList r9 = new java.util.ArrayList
            r1 = 10
            int r1 = p062dh.C1469e.m3992D(r0, r1)
            r9.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            bi.b0 r1 = (bi.EnumC0773b0) r1
            java.lang.String r1 = r1.f4191Y
            r9.add(r1)
            goto L3a
        L4c:
            java.lang.Class<ji.e> r0 = p175ji.C3615e.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            r1 = 2
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            java.lang.Class<?> r5 = r6.f15888g     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            r4[r3] = r5     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            java.lang.Class<?> r5 = r6.f15889h     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            r4[r2] = r5     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            ji.c$a r5 = new ji.c$a     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            r5.<init>(r9)     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            java.lang.Object r9 = java.lang.reflect.Proxy.newProxyInstance(r0, r4, r5)     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            java.lang.reflect.Method r0 = r6.f15885d     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            r1[r3] = r7     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            r1[r2] = r9     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            r0.invoke(r4, r1)     // Catch: java.lang.IllegalAccessException -> L73 java.lang.reflect.InvocationTargetException -> L7a
            return
        L73:
            r7 = move-exception
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>(r8, r7)
            throw r9
        L7a:
            r7 = move-exception
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>(r8, r7)
            throw r9
    }

    @Override // p175ji.C3615e
    /* renamed from: f */
    public java.lang.String mo8040f(javax.net.ssl.SSLSocket r11) {
            r10 = this;
            java.lang.String r0 = "failed to get ALPN selected protocol"
            java.lang.reflect.Method r1 = r10.f15886e     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            r3 = 0
            r2[r3] = r11     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            r11 = 0
            java.lang.Object r1 = r1.invoke(r11, r2)     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r1)     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            if (r1 == 0) goto L30
            ji.c$a r1 = (p175ji.C3613c.a) r1     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            boolean r2 = r1.f15890a     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            if (r2 != 0) goto L2a
            java.lang.String r3 = r1.f15891b     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            if (r3 != 0) goto L2a
            java.lang.String r5 = "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?"
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r10
            p175ji.C3615e.m8048j(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            return r11
        L2a:
            if (r2 == 0) goto L2d
            goto L2f
        L2d:
            java.lang.String r11 = r1.f15891b     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
        L2f:
            return r11
        L30:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider"
            r11.<init>(r1)     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
            throw r11     // Catch: java.lang.IllegalAccessException -> L38 java.lang.reflect.InvocationTargetException -> L3f
        L38:
            r11 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r11)
            throw r1
        L3f:
            r11 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r11)
            throw r1
    }
}
