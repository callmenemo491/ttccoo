package p093f9;

/* renamed from: f9.r */
/* loaded from: classes.dex */
public final class C2100r {

    /* renamed from: a */
    public static final java.util.logging.Logger f9524a = null;

    /* renamed from: b */
    public static final java.util.concurrent.ConcurrentMap<java.lang.String, p093f9.C2100r.a> f9525b = null;

    /* renamed from: c */
    public static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> f9526c = null;

    /* renamed from: d */
    public static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> f9527d = null;

    /* renamed from: e */
    public static final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, p093f9.InterfaceC2097o<?>> f9528e = null;

    /* renamed from: f9.r$a */
    public interface a {
        /* renamed from: a */
        <P> p093f9.InterfaceC2086d<P> mo5543a(java.lang.Class<P> r1);

        /* renamed from: b */
        p093f9.InterfaceC2086d<?> mo5544b();

        /* renamed from: c */
        java.lang.Class<?> mo5545c();

        /* renamed from: d */
        java.util.Set<java.lang.Class<?>> mo5546d();
    }

    static {
            java.lang.Class<f9.r> r0 = p093f9.C2100r.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p093f9.C2100r.f9524a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p093f9.C2100r.f9525b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p093f9.C2100r.f9526c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p093f9.C2100r.f9527d = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p093f9.C2100r.f9528e = r0
            return
    }

    public C2100r() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static synchronized void m5547a(java.lang.String r5, java.lang.Class<?> r6, boolean r7) {
            java.lang.Class<f9.r> r0 = p093f9.C2100r.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, f9.r$a> r1 = p093f9.C2100r.f9525b     // Catch: java.lang.Throwable -> L88
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L88
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L88
            if (r2 != 0) goto L10
            monitor-exit(r0)
            return
        L10:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L88
            f9.r$a r1 = (p093f9.C2100r.a) r1     // Catch: java.lang.Throwable -> L88
            java.lang.Class r2 = r1.mo5545c()     // Catch: java.lang.Throwable -> L88
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L4e
            if (r7 == 0) goto L4c
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r6 = p093f9.C2100r.f9527d     // Catch: java.lang.Throwable -> L88
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6     // Catch: java.lang.Throwable -> L88
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L88
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L35
            goto L4c
        L35:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r7.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "New keys are already disallowed for key type "
            r7.append(r1)     // Catch: java.lang.Throwable -> L88
            r7.append(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L88
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L88
            throw r6     // Catch: java.lang.Throwable -> L88
        L4c:
            monitor-exit(r0)
            return
        L4e:
            java.util.logging.Logger r7 = p093f9.C2100r.f9524a     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r2.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch: java.lang.Throwable -> L88
            r2.append(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L88
            r7.warning(r2)     // Catch: java.lang.Throwable -> L88
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L88
            r4 = 0
            r3[r4] = r5     // Catch: java.lang.Throwable -> L88
            r5 = 1
            java.lang.Class r1 = r1.mo5545c()     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L88
            r3[r5] = r1     // Catch: java.lang.Throwable -> L88
            r5 = 2
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L88
            r3[r5] = r6     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L88
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L88
            throw r7     // Catch: java.lang.Throwable -> L88
        L88:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    /* renamed from: b */
    public static synchronized p093f9.C2100r.a m5548b(java.lang.String r4) {
            java.lang.Class<f9.r> r0 = p093f9.C2100r.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, f9.r$a> r1 = p093f9.C2100r.f9525b     // Catch: java.lang.Throwable -> L2f
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L18
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L2f
            f9.r$a r4 = (p093f9.C2100r.a) r4     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            return r4
        L18:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "No key manager found for key type "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2f
            r2.append(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            throw r1     // Catch: java.lang.Throwable -> L2f
        L2f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: c */
    public static <P> P m5549c(java.lang.String r2, byte[] r3, java.lang.Class<P> r4) {
            m9.h r0 = p221m9.AbstractC4454h.f18139Z
            int r0 = r3.length
            r1 = 0
            m9.h r3 = p221m9.AbstractC4454h.m10054i(r3, r1, r0)
            java.lang.Object r2 = m5550d(r2, r3, r4)
            return r2
    }

    /* renamed from: d */
    public static <P> P m5550d(java.lang.String r3, p221m9.AbstractC4454h r4, java.lang.Class<P> r5) {
            f9.r$a r3 = m5548b(r3)
            if (r5 != 0) goto Lb
            f9.d r3 = r3.mo5544b()
            goto L19
        Lb:
            java.util.Set r0 = r3.mo5546d()
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L20
            f9.d r3 = r3.mo5543a(r5)
        L19:
            f9.e r3 = (p093f9.C2087e) r3
            java.lang.Object r3 = r3.m5510a(r4)
            return r3
        L20:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Primitive type "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = " not supported by key manager of type "
            r0.append(r5)
            java.lang.Class r5 = r3.mo5545c()
            r0.append(r5)
            java.lang.String r5 = ", supported primitives: "
            r0.append(r5)
            java.util.Set r3 = r3.mo5546d()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
            r1 = 1
        L4e:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r3.next()
            java.lang.Class r2 = (java.lang.Class) r2
            if (r1 != 0) goto L61
            java.lang.String r1 = ", "
            r5.append(r1)
        L61:
            java.lang.String r1 = r2.getCanonicalName()
            r5.append(r1)
            r1 = 0
            goto L4e
        L6a:
            java.lang.String r3 = r5.toString()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: e */
    public static synchronized p204l9.C4229w m5551e(p204l9.C4231y r4) {
            java.lang.Class<f9.r> r0 = p093f9.C2100r.class
            monitor-enter(r0)
            java.lang.String r1 = r4.m9539C()     // Catch: java.lang.Throwable -> L4a
            f9.r$a r1 = m5548b(r1)     // Catch: java.lang.Throwable -> L4a
            f9.d r1 = r1.mo5544b()     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r2 = p093f9.C2100r.f9527d     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = r4.m9539C()     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L2f
            m9.h r4 = r4.m9540D()     // Catch: java.lang.Throwable -> L4a
            f9.e r1 = (p093f9.C2087e) r1     // Catch: java.lang.Throwable -> L4a
            l9.w r4 = r1.m5512c(r4)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            return r4
        L2f:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r2.<init>()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "newKey-operation not permitted for key type "
            r2.append(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r4.m9539C()     // Catch: java.lang.Throwable -> L4a
            r2.append(r4)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4a
            throw r1     // Catch: java.lang.Throwable -> L4a
        L4a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: f */
    public static synchronized <KeyProtoT extends p221m9.InterfaceC4482q0> void m5552f(p093f9.AbstractC2089g<KeyProtoT> r4, boolean r5) {
            java.lang.Class<f9.r> r0 = p093f9.C2100r.class
            monitor-enter(r0)
            java.lang.String r1 = r4.mo5514a()     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Throwable -> L3c
            m5547a(r1, r2, r5)     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.ConcurrentMap<java.lang.String, f9.r$a> r2 = p093f9.C2100r.f9525b     // Catch: java.lang.Throwable -> L3c
            r3 = r2
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L3c
            boolean r3 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L2f
            f9.p r3 = new f9.p     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L3c
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> r2 = p093f9.C2100r.f9526c     // Catch: java.lang.Throwable -> L3c
            f9.q r3 = new f9.q     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L3c
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L3c
        L2f:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r4 = p093f9.C2100r.f9527d     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch: java.lang.Throwable -> L3c
            r4.put(r1, r5)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            return
        L3c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: g */
    public static synchronized <P> void m5553g(p093f9.InterfaceC2097o<P> r7) {
            java.lang.Class<f9.r> r0 = p093f9.C2100r.class
            monitor-enter(r0)
            java.lang.Class r1 = r7.mo5542b()     // Catch: java.lang.Throwable -> L73
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, f9.o<?>> r2 = p093f9.C2100r.f9528e     // Catch: java.lang.Throwable -> L73
            r3 = r2
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L73
            boolean r3 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L6c
            r3 = r2
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L73
            f9.o r3 = (p093f9.InterfaceC2097o) r3     // Catch: java.lang.Throwable -> L73
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.Throwable -> L73
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L73
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L2a
            goto L6c
        L2a:
            java.util.logging.Logger r2 = p093f9.C2100r.f9524a     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = "Attempted overwrite of a registered SetWrapper for type "
            r4.append(r5)     // Catch: java.lang.Throwable -> L73
            r4.append(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L73
            r2.warning(r4)     // Catch: java.lang.Throwable -> L73
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L73
            r6 = 0
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L73
            r5[r6] = r1     // Catch: java.lang.Throwable -> L73
            r1 = 1
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L73
            r5[r1] = r3     // Catch: java.lang.Throwable -> L73
            r1 = 2
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L73
            r5[r1] = r7     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L73
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L73
            throw r2     // Catch: java.lang.Throwable -> L73
        L6c:
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L73
            r2.put(r1, r7)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r0)
            return
        L73:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }
}
