package p124h7;

/* renamed from: h7.h2 */
/* loaded from: classes.dex */
public final class C2650h2 {

    /* renamed from: a */
    public static final java.util.logging.Logger f11568a = null;

    /* renamed from: b */
    public static final java.util.concurrent.ConcurrentMap<java.lang.String, p124h7.InterfaceC2632g2> f11569b = null;

    /* renamed from: c */
    public static final java.util.concurrent.ConcurrentMap<java.lang.String, p083f.C1933t> f11570c = null;

    /* renamed from: d */
    public static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> f11571d = null;

    /* renamed from: e */
    public static final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, p124h7.InterfaceC2542b2<?, ?>> f11572e = null;

    /* renamed from: f */
    public static final java.util.concurrent.ConcurrentMap<java.lang.String, p124h7.C2793p1> f11573f = null;

    static {
            java.lang.Class<h7.h2> r0 = p124h7.C2650h2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p124h7.C2650h2.f11568a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p124h7.C2650h2.f11569b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p124h7.C2650h2.f11570c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p124h7.C2650h2.f11571d = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p124h7.C2650h2.f11572e = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p124h7.C2650h2.f11573f = r0
            return
    }

    public C2650h2() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static synchronized p124h7.C2690j6 m6770a(p124h7.C2744m6 r4) {
            java.lang.Class<h7.h2> r0 = p124h7.C2650h2.class
            monitor-enter(r0)
            java.lang.String r1 = r4.m6981x()     // Catch: java.lang.Throwable -> L4d
            h7.g2 r1 = m6777h(r1)     // Catch: java.lang.Throwable -> L4d
            h7.hd r1 = r1.mo6638b()     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r2 = p124h7.C2650h2.f11571d     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r4.m6981x()     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L2d
            h7.cg r4 = r4.m6980w()     // Catch: java.lang.Throwable -> L4d
            h7.j6 r4 = r1.m6804a(r4)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            return r4
        L2d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r4.m6981x()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "newKey-operation not permitted for key type "
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L44
            java.lang.String r4 = r2.concat(r4)     // Catch: java.lang.Throwable -> L4d
            goto L49
        L44:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L4d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L4d
        L49:
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4d
        L4d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: b */
    public static synchronized p124h7.InterfaceC2935x m6771b(p124h7.C2744m6 r4) {
            java.lang.Class<h7.h2> r0 = p124h7.C2650h2.class
            monitor-enter(r0)
            java.lang.String r1 = r4.m6981x()     // Catch: java.lang.Throwable -> L4d
            h7.g2 r1 = m6777h(r1)     // Catch: java.lang.Throwable -> L4d
            h7.hd r1 = r1.mo6638b()     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r2 = p124h7.C2650h2.f11571d     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r4.m6981x()     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L2d
            h7.cg r4 = r4.m6980w()     // Catch: java.lang.Throwable -> L4d
            h7.x r4 = r1.m6807f(r4)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            return r4
        L2d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r4.m6981x()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "newKey-operation not permitted for key type "
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L44
            java.lang.String r4 = r2.concat(r4)     // Catch: java.lang.Throwable -> L4d
            goto L49
        L44:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L4d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L4d
        L49:
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4d
        L4d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: c */
    public static <P> P m6772c(java.lang.String r2, p124h7.InterfaceC2935x r3, java.lang.Class<P> r4) {
            h7.hd r2 = m6776g(r2, r4)
            h7.id<ResultT, CallbackT> r4 = r2.f11589Z
            h7.s1 r4 = (p124h7.AbstractC2847s1) r4
            java.lang.Class<KeyProtoT extends h7.x> r4 = r4.f11902a
            java.lang.String r4 = r4.getName()
            int r0 = r4.length()
            java.lang.String r1 = "Expected proto of type "
            if (r0 == 0) goto L1b
            java.lang.String r4 = r1.concat(r4)
            goto L20
        L1b:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L20:
            h7.id<ResultT, CallbackT> r0 = r2.f11589Z
            h7.s1 r0 = (p124h7.AbstractC2847s1) r0
            java.lang.Class<KeyProtoT extends h7.x> r0 = r0.f11902a
            boolean r0 = r0.isInstance(r3)
            if (r0 == 0) goto L31
            java.lang.Object r2 = r2.m6811k(r3)
            return r2
        L31:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            r2.<init>(r4)
            throw r2
    }

    /* renamed from: d */
    public static <P> P m6773d(java.lang.String r2, byte[] r3, java.lang.Class<P> r4) {
            h7.cg r0 = p124h7.AbstractC2574cg.f11427Z
            int r0 = r3.length
            r1 = 0
            h7.cg r3 = p124h7.AbstractC2574cg.m6534A(r3, r1, r0)
            java.lang.Object r2 = m6778i(r2, r3, r4)
            return r2
    }

    /* renamed from: e */
    public static synchronized <KeyProtoT extends p124h7.InterfaceC2935x> void m6774e(p124h7.AbstractC2847s1<KeyProtoT> r4, boolean r5) {
            java.lang.Class<h7.h2> r5 = p124h7.C2650h2.class
            monitor-enter(r5)
            java.lang.String r0 = r4.mo6566e()     // Catch: java.lang.Throwable -> L4e
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L4e
            v0.c r2 = r4.mo6563a()     // Catch: java.lang.Throwable -> L4e
            java.util.Map r2 = r2.mo7015k()     // Catch: java.lang.Throwable -> L4e
            r3 = 1
            m6779j(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.ConcurrentMap<java.lang.String, h7.g2> r1 = p124h7.C2650h2.f11569b     // Catch: java.lang.Throwable -> L4e
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L43
            h7.e2 r2 = new h7.e2     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L4e
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.ConcurrentMap<java.lang.String, f.t> r1 = p124h7.C2650h2.f11570c     // Catch: java.lang.Throwable -> L4e
            f.t r2 = new f.t     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L4e
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L4e
            v0.c r4 = r4.mo6563a()     // Catch: java.lang.Throwable -> L4e
            java.util.Map r4 = r4.mo7015k()     // Catch: java.lang.Throwable -> L4e
            m6780k(r0, r4)     // Catch: java.lang.Throwable -> L4e
        L43:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r4 = p124h7.C2650h2.f11571d     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch: java.lang.Throwable -> L4e
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)
            return
        L4e:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
    }

    /* renamed from: f */
    public static synchronized <B, P> void m6775f(p124h7.InterfaceC2542b2<B, P> r8) {
            java.lang.Class<h7.h2> r0 = p124h7.C2650h2.class
            monitor-enter(r0)
            java.lang.Class r1 = r8.mo6478b()     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, h7.b2<?, ?>> r2 = p124h7.C2650h2.f11572e     // Catch: java.lang.Throwable -> L8b
            r3 = r2
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L8b
            boolean r3 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L84
            r3 = r2
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L8b
            h7.b2 r3 = (p124h7.InterfaceC2542b2) r3     // Catch: java.lang.Throwable -> L8b
            java.lang.Class r4 = r8.getClass()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L8b
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L8b
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L32
            goto L84
        L32:
            java.util.logging.Logger r2 = p124h7.C2650h2.f11568a     // Catch: java.lang.Throwable -> L8b
            java.util.logging.Level r4 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L8b
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            int r6 = r6 + 62
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "Attempted overwrite of a registered PrimitiveWrapper for type "
            r7.append(r6)     // Catch: java.lang.Throwable -> L8b
            r7.append(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = "com.google.crypto.tink.Registry"
            java.lang.String r6 = "registerPrimitiveWrapper"
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L8b
            r2.logp(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8b
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L8b
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L8b
            r5 = 0
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L8b
            r4[r5] = r1     // Catch: java.lang.Throwable -> L8b
            r1 = 1
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L8b
            r4[r1] = r3     // Catch: java.lang.Throwable -> L8b
            r1 = 2
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L8b
            r4[r1] = r8     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = "PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s"
            java.lang.String r8 = java.lang.String.format(r8, r4)     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L8b
            throw r2     // Catch: java.lang.Throwable -> L8b
        L84:
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L8b
            r2.put(r1, r8)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)
            return
        L8b:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
    }

    /* renamed from: g */
    public static <P> p124h7.C2661hd m6776g(java.lang.String r7, java.lang.Class<P> r8) {
            h7.g2 r7 = m6777h(r7)
            if (r8 != 0) goto Lb
            h7.hd r7 = r7.mo6638b()
            return r7
        Lb:
            java.util.Set r0 = r7.mo6640d()
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L1a
            h7.hd r7 = r7.mo6637a(r8)
            return r7
        L1a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r8 = r8.getName()
            java.lang.Class r1 = r7.mo6639c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.Set r7 = r7.mo6640d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
            r3 = 1
        L36:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L52
            java.lang.Object r4 = r7.next()
            java.lang.Class r4 = (java.lang.Class) r4
            if (r3 != 0) goto L49
            java.lang.String r3 = ", "
            r2.append(r3)
        L49:
            java.lang.String r3 = r4.getCanonicalName()
            r2.append(r3)
            r3 = 0
            goto L36
        L52:
            java.lang.String r7 = r2.toString()
            int r2 = r8.length()
            int r3 = r1.length()
            java.lang.String r4 = java.lang.String.valueOf(r7)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 77
            int r2 = androidx.appcompat.widget.C0267d.m705a(r2, r6, r3, r4)
            r5.<init>(r2)
            java.lang.String r2 = "Primitive type "
            java.lang.String r3 = " not supported by key manager of type "
            p179k1.C3661s.m8090a(r5, r2, r8, r3, r1)
            java.lang.String r8 = ", supported primitives: "
            java.lang.String r7 = p346u.C6269n.m12888a(r5, r8, r7)
            r0.<init>(r7)
            throw r0
    }

    /* renamed from: h */
    public static synchronized p124h7.InterfaceC2632g2 m6777h(java.lang.String r4) {
            java.lang.Class<h7.h2> r0 = p124h7.C2650h2.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, h7.g2> r1 = p124h7.C2650h2.f11569b     // Catch: java.lang.Throwable -> L34
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L34
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L2a
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "No key manager found for key type "
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L21
            java.lang.String r4 = r2.concat(r4)     // Catch: java.lang.Throwable -> L34
            goto L26
        L21:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L34
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L34
        L26:
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L34
            throw r1     // Catch: java.lang.Throwable -> L34
        L2a:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L34
            h7.g2 r4 = (p124h7.InterfaceC2632g2) r4     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)
            return r4
        L34:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: i */
    public static <P> P m6778i(java.lang.String r2, p124h7.AbstractC2574cg r3, java.lang.Class<P> r4) {
            h7.hd r2 = m6776g(r2, r4)
            java.util.Objects.requireNonNull(r2)
            h7.id<ResultT, CallbackT> r4 = r2.f11589Z     // Catch: p124h7.C2611f -> L14
            h7.s1 r4 = (p124h7.AbstractC2847s1) r4     // Catch: p124h7.C2611f -> L14
            h7.x r3 = r4.mo6565c(r3)     // Catch: p124h7.C2611f -> L14
            java.lang.Object r2 = r2.m6811k(r3)     // Catch: p124h7.C2611f -> L14
            return r2
        L14:
            r3 = move-exception
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            h7.id<ResultT, CallbackT> r2 = r2.f11589Z
            h7.s1 r2 = (p124h7.AbstractC2847s1) r2
            java.lang.Class<KeyProtoT extends h7.x> r2 = r2.f11902a
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "Failures parsing proto of type "
            int r1 = r2.length()
            if (r1 == 0) goto L2e
            java.lang.String r2 = r0.concat(r2)
            goto L33
        L2e:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
        L33:
            r4.<init>(r2, r3)
            throw r4
    }

    /* renamed from: j */
    public static synchronized <KeyProtoT extends p124h7.InterfaceC2935x, KeyFormatProtoT extends p124h7.InterfaceC2935x> void m6779j(java.lang.String r5, java.lang.Class r6, java.util.Map<java.lang.String, p124h7.C2811q1<KeyFormatProtoT>> r7, boolean r8) {
            java.lang.Class<h7.h2> r0 = p124h7.C2650h2.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, h7.g2> r1 = p124h7.C2650h2.f11569b     // Catch: java.lang.Throwable -> L134
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L134
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L134
            h7.g2 r2 = (p124h7.InterfaceC2632g2) r2     // Catch: java.lang.Throwable -> L134
            if (r2 == 0) goto L5c
            java.lang.Class r3 = r2.mo6639c()     // Catch: java.lang.Throwable -> L134
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L134
            if (r3 != 0) goto L5c
            java.util.logging.Logger r7 = p124h7.C2650h2.f11568a     // Catch: java.lang.Throwable -> L134
            java.util.logging.Level r8 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L134
            java.lang.String r1 = "Attempted overwrite of a registered key manager for key type "
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L134
            if (r3 == 0) goto L2b
            java.lang.String r1 = r1.concat(r5)     // Catch: java.lang.Throwable -> L134
            goto L31
        L2b:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L134
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L134
            r1 = r3
        L31:
            java.lang.String r3 = "com.google.crypto.tink.Registry"
            java.lang.String r4 = "ensureKeyManagerInsertable"
            r7.logp(r8, r3, r4, r1)     // Catch: java.lang.Throwable -> L134
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L134
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L134
            r1 = 0
            r8[r1] = r5     // Catch: java.lang.Throwable -> L134
            r5 = 1
            java.lang.Class r1 = r2.mo6639c()     // Catch: java.lang.Throwable -> L134
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L134
            r8[r5] = r1     // Catch: java.lang.Throwable -> L134
            r5 = 2
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L134
            r8[r5] = r6     // Catch: java.lang.Throwable -> L134
            java.lang.String r5 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r5 = java.lang.String.format(r5, r8)     // Catch: java.lang.Throwable -> L134
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L134
            throw r7     // Catch: java.lang.Throwable -> L134
        L5c:
            if (r8 == 0) goto L132
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r6 = p124h7.C2650h2.f11571d     // Catch: java.lang.Throwable -> L134
            r8 = r6
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8     // Catch: java.lang.Throwable -> L134
            boolean r8 = r8.containsKey(r5)     // Catch: java.lang.Throwable -> L134
            if (r8 == 0) goto L8f
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6     // Catch: java.lang.Throwable -> L134
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L134
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L134
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L134
            if (r6 != 0) goto L8f
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L134
            java.lang.String r7 = "New keys are already disallowed for key type "
            int r8 = r5.length()     // Catch: java.lang.Throwable -> L134
            if (r8 == 0) goto L86
            java.lang.String r5 = r7.concat(r5)     // Catch: java.lang.Throwable -> L134
            goto L8b
        L86:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L134
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L134
        L8b:
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L134
            throw r6     // Catch: java.lang.Throwable -> L134
        L8f:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L134
            boolean r6 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L134
            if (r6 == 0) goto Lee
            java.util.Set r6 = r7.entrySet()     // Catch: java.lang.Throwable -> L134
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L134
        L9f:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L134
            if (r7 == 0) goto L132
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L134
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L134
            java.util.concurrent.ConcurrentMap<java.lang.String, h7.p1> r8 = p124h7.C2650h2.f11573f     // Catch: java.lang.Throwable -> L134
            java.lang.Object r1 = r7.getKey()     // Catch: java.lang.Throwable -> L134
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8     // Catch: java.lang.Throwable -> L134
            boolean r8 = r8.containsKey(r1)     // Catch: java.lang.Throwable -> L134
            if (r8 == 0) goto Lba
            goto L9f
        Lba:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L134
            java.lang.Object r7 = r7.getKey()     // Catch: java.lang.Throwable -> L134
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L134
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L134
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L134
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L134
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L134
            int r8 = r8 + 79
            int r8 = r8 + r1
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L134
            java.lang.String r8 = "Attempted to register a new key template "
            r2.append(r8)     // Catch: java.lang.Throwable -> L134
            r2.append(r7)     // Catch: java.lang.Throwable -> L134
            java.lang.String r7 = " from an existing key manager of type "
            r2.append(r7)     // Catch: java.lang.Throwable -> L134
            r2.append(r5)     // Catch: java.lang.Throwable -> L134
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L134
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L134
            throw r6     // Catch: java.lang.Throwable -> L134
        Lee:
            java.util.Set r5 = r7.entrySet()     // Catch: java.lang.Throwable -> L134
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L134
        Lf6:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L134
            if (r6 == 0) goto L132
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L134
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L134
            java.util.concurrent.ConcurrentMap<java.lang.String, h7.p1> r7 = p124h7.C2650h2.f11573f     // Catch: java.lang.Throwable -> L134
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> L134
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7     // Catch: java.lang.Throwable -> L134
            boolean r7 = r7.containsKey(r8)     // Catch: java.lang.Throwable -> L134
            if (r7 == 0) goto Lf6
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L134
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L134
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L134
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L134
            java.lang.String r7 = "Attempted overwrite of a registered key template "
            int r8 = r6.length()     // Catch: java.lang.Throwable -> L134
            if (r8 == 0) goto L129
            java.lang.String r6 = r7.concat(r6)     // Catch: java.lang.Throwable -> L134
            goto L12e
        L129:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L134
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L134
        L12e:
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L134
            throw r5     // Catch: java.lang.Throwable -> L134
        L132:
            monitor-exit(r0)
            return
        L134:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    /* renamed from: k */
    public static <KeyFormatProtoT extends p124h7.InterfaceC2935x> void m6780k(java.lang.String r4, java.util.Map<java.lang.String, p124h7.C2811q1<KeyFormatProtoT>> r5) {
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.concurrent.ConcurrentMap<java.lang.String, h7.p1> r1 = p124h7.C2650h2.f11573f
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.getValue()
            h7.q1 r3 = (p124h7.C2811q1) r3
            KeyFormatProtoT r3 = r3.f11850a
            byte[] r3 = r3.mo7142p()
            java.lang.Object r0 = r0.getValue()
            h7.q1 r0 = (p124h7.C2811q1) r0
            int r0 = r0.f11851b
            h7.p1 r0 = p124h7.C2793p1.m7027a(r4, r3, r0)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r2, r0)
            goto L8
        L3a:
            return
    }
}
