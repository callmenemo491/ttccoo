package ki;

/* renamed from: ki.f */
/* loaded from: classes.dex */
public class C4133f implements ki.InterfaceC4138k {

    /* renamed from: f */
    public static final ki.C4137j.a f17149f = null;

    /* renamed from: g */
    public static final ki.C4133f.a f17150g = null;

    /* renamed from: a */
    public final java.lang.reflect.Method f17151a;

    /* renamed from: b */
    public final java.lang.reflect.Method f17152b;

    /* renamed from: c */
    public final java.lang.reflect.Method f17153c;

    /* renamed from: d */
    public final java.lang.reflect.Method f17154d;

    /* renamed from: e */
    public final java.lang.Class<? super javax.net.ssl.SSLSocket> f17155e;

    /* renamed from: ki.f$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            ki.f$a r0 = new ki.f$a
            r1 = 0
            r0.<init>(r1)
            ki.C4133f.f17150g = r0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "com.google.android.gms.org.conscrypt"
            java.lang.String r1 = "packageName"
            p214m2.C4339q.m9706k(r0, r1)
            ki.e r1 = new ki.e
            r1.<init>(r0)
            ki.C4133f.f17149f = r1
            return
    }

    public C4133f(java.lang.Class<? super javax.net.ssl.SSLSocket> r5) {
            r4 = this;
            r4.<init>()
            r4.f17155e = r5
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "setUseSessionTickets"
            java.lang.reflect.Method r1 = r5.getDeclaredMethod(r2, r1)
            java.lang.String r2 = "sslSocketClass.getDeclar\u2026:class.javaPrimitiveType)"
            p214m2.C4339q.m9705j(r1, r2)
            r4.f17151a = r1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r3] = r2
            java.lang.String r2 = "setHostname"
            java.lang.reflect.Method r1 = r5.getMethod(r2, r1)
            r4.f17152b = r1
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.String r2 = "getAlpnSelectedProtocol"
            java.lang.reflect.Method r1 = r5.getMethod(r2, r1)
            r4.f17153c = r1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r3] = r1
            java.lang.String r1 = "setAlpnProtocols"
            java.lang.reflect.Method r5 = r5.getMethod(r1, r0)
            r4.f17154d = r5
            return
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: a */
    public boolean mo9187a(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.Class<? super javax.net.ssl.SSLSocket> r0 = r1.f17155e
            boolean r2 = r0.isInstance(r2)
            return r2
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: b */
    public java.lang.String mo9188b(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            boolean r0 = r3.mo9187a(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.reflect.Method r0 = r3.f17153c     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a java.lang.NullPointerException -> L31
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a java.lang.NullPointerException -> L31
            java.lang.Object r4 = r0.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a java.lang.NullPointerException -> L31
            byte[] r4 = (byte[]) r4     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a java.lang.NullPointerException -> L31
            if (r4 == 0) goto L3e
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a java.lang.NullPointerException -> L31
            java.lang.String r2 = "StandardCharsets.UTF_8"
            p214m2.C4339q.m9705j(r0, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a java.lang.NullPointerException -> L31
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a java.lang.NullPointerException -> L31
            r2.<init>(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a java.lang.NullPointerException -> L31
            r1 = r2
            goto L3e
        L23:
            r4 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
        L2a:
            r4 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
        L31:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            java.lang.String r2 = "ssl == null"
            boolean r0 = p214m2.C4339q.m9702c(r0, r2)
            if (r0 == 0) goto L3f
        L3e:
            return r1
        L3f:
            throw r4
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: c */
    public boolean mo9189c() {
            r1 = this;
            ji.b$a r0 = p175ji.C3612b.f15880g
            boolean r0 = p175ji.C3612b.f15879f
            return r0
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: d */
    public void mo9190d(javax.net.ssl.SSLSocket r6, java.lang.String r7, java.util.List<? extends bi.EnumC0773b0> r8) {
            r5 = this;
            boolean r0 = r5.mo9187a(r6)
            if (r0 == 0) goto L3c
            java.lang.reflect.Method r0 = r5.f17151a     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            r0.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            if (r7 == 0) goto L1e
            java.lang.reflect.Method r0 = r5.f17152b     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            r2[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            r0.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
        L1e:
            java.lang.reflect.Method r7 = r5.f17154d     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            ji.e$a r1 = p175ji.C3615e.f15897c     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            byte[] r8 = r1.m8054b(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            r0[r4] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            r7.invoke(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L35
            goto L3c
        L2e:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L35:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L3c:
            return
    }
}
