package androidx.navigation;

/* renamed from: androidx.navigation.k */
/* loaded from: classes.dex */
public class C0516k extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: d */
    public static final androidx.lifecycle.InterfaceC0461p0 f2956d = null;

    /* renamed from: c */
    public final java.util.HashMap<java.util.UUID, androidx.lifecycle.C0467s0> f2957c;

    /* renamed from: androidx.navigation.k$a */
    public class a implements androidx.lifecycle.InterfaceC0461p0 {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.InterfaceC0461p0
        /* renamed from: a */
        public <T extends androidx.lifecycle.AbstractC0457n0> T mo9a(java.lang.Class<T> r1) {
                r0 = this;
                androidx.navigation.k r1 = new androidx.navigation.k
                r1.<init>()
                return r1
        }
    }

    static {
            androidx.navigation.k$a r0 = new androidx.navigation.k$a
            r0.<init>()
            androidx.navigation.C0516k.f2956d = r0
            return
    }

    public C0516k() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2957c = r0
            return
    }

    /* renamed from: d */
    public static androidx.navigation.C0516k m1587d(androidx.lifecycle.C0467s0 r5) {
            androidx.lifecycle.p0 r0 = androidx.navigation.C0516k.f2956d
            java.lang.Class<androidx.navigation.k> r1 = androidx.navigation.C0516k.class
            java.lang.String r2 = r1.getCanonicalName()
            if (r2 == 0) goto L48
            java.lang.String r3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r2 = p064e.C1493g.m4049a(r3, r2)
            java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r3 = r5.f2562a
            java.lang.Object r3 = r3.get(r2)
            androidx.lifecycle.n0 r3 = (androidx.lifecycle.AbstractC0457n0) r3
            boolean r4 = r1.isInstance(r3)
            if (r4 == 0) goto L28
            boolean r5 = r0 instanceof androidx.lifecycle.C0465r0
            if (r5 == 0) goto L45
            androidx.lifecycle.r0 r0 = (androidx.lifecycle.C0465r0) r0
            r0.mo1425b(r3)
            goto L45
        L28:
            boolean r3 = r0 instanceof androidx.lifecycle.AbstractC0463q0
            if (r3 == 0) goto L33
            androidx.lifecycle.q0 r0 = (androidx.lifecycle.AbstractC0463q0) r0
            androidx.lifecycle.n0 r0 = r0.mo1426c(r2, r1)
            goto L37
        L33:
            androidx.lifecycle.n0 r0 = r0.mo9a(r1)
        L37:
            r3 = r0
            java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r5 = r5.f2562a
            java.lang.Object r5 = r5.put(r2, r3)
            androidx.lifecycle.n0 r5 = (androidx.lifecycle.AbstractC0457n0) r5
            if (r5 == 0) goto L45
            r5.mo8b()
        L45:
            androidx.navigation.k r3 = (androidx.navigation.C0516k) r3
            return r3
        L48:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r0)
            throw r5
    }

    @Override // androidx.lifecycle.AbstractC0457n0
    /* renamed from: b */
    public void mo8b() {
            r2 = this;
            java.util.HashMap<java.util.UUID, androidx.lifecycle.s0> r0 = r2.f2957c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.lifecycle.s0 r1 = (androidx.lifecycle.C0467s0) r1
            r1.m1458a()
            goto La
        L1a:
            java.util.HashMap<java.util.UUID, androidx.lifecycle.s0> r0 = r2.f2957c
            r0.clear()
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NavControllerViewModel{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} ViewModelStores ("
            r0.append(r1)
            java.util.HashMap<java.util.UUID, androidx.lifecycle.s0> r1 = r3.f2957c
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.String r2 = ", "
            r0.append(r2)
            goto L21
        L3a:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
