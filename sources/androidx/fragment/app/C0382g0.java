package androidx.fragment.app;

/* renamed from: androidx.fragment.app.g0 */
/* loaded from: classes.dex */
public final class C0382g0 extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: i */
    public static final androidx.lifecycle.InterfaceC0461p0 f2172i = null;

    /* renamed from: c */
    public final java.util.HashMap<java.lang.String, androidx.fragment.app.ComponentCallbacksC0395n> f2173c;

    /* renamed from: d */
    public final java.util.HashMap<java.lang.String, androidx.fragment.app.C0382g0> f2174d;

    /* renamed from: e */
    public final java.util.HashMap<java.lang.String, androidx.lifecycle.C0467s0> f2175e;

    /* renamed from: f */
    public final boolean f2176f;

    /* renamed from: g */
    public boolean f2177g;

    /* renamed from: h */
    public boolean f2178h;

    /* renamed from: androidx.fragment.app.g0$a */
    public class a implements androidx.lifecycle.InterfaceC0461p0 {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.InterfaceC0461p0
        /* renamed from: a */
        public <T extends androidx.lifecycle.AbstractC0457n0> T mo9a(java.lang.Class<T> r2) {
                r1 = this;
                androidx.fragment.app.g0 r2 = new androidx.fragment.app.g0
                r0 = 1
                r2.<init>(r0)
                return r2
        }
    }

    static {
            androidx.fragment.app.g0$a r0 = new androidx.fragment.app.g0$a
            r0.<init>()
            androidx.fragment.app.C0382g0.f2172i = r0
            return
    }

    public C0382g0(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2173c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2174d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2175e = r0
            r0 = 0
            r1.f2177g = r0
            r1.f2178h = r0
            r1.f2176f = r2
            return
    }

    @Override // androidx.lifecycle.AbstractC0457n0
    /* renamed from: b */
    public void mo8b() {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCleared called for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            r0 = 1
            r2.f2177g = r0
            return
    }

    /* renamed from: d */
    public void m1202d(androidx.fragment.app.ComponentCallbacksC0395n r5) {
            r4 = this;
            boolean r0 = r4.f2178h
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L13
            boolean r5 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
            if (r5 == 0) goto L12
            java.lang.String r5 = "Ignoring removeRetainedFragment as the state is already saved"
            android.util.Log.v(r1, r5)
        L12:
            return
        L13:
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r0 = r4.f2173c
            java.lang.String r3 = r5.f2281c0
            java.lang.Object r0 = r0.remove(r3)
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L3c
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
            if (r0 == 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Updating retained Fragments: Removed "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.v(r1, r5)
        L3c:
            return
    }

    /* renamed from: e */
    public boolean m1203e(androidx.fragment.app.ComponentCallbacksC0395n r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r0 = r1.f2173c
            java.lang.String r2 = r2.f2281c0
            boolean r2 = r0.containsKey(r2)
            r0 = 1
            if (r2 != 0) goto Lc
            return r0
        Lc:
            boolean r2 = r1.f2176f
            if (r2 == 0) goto L13
            boolean r2 = r1.f2177g
            return r2
        L13:
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.Class<androidx.fragment.app.g0> r2 = androidx.fragment.app.C0382g0.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L33
        L10:
            androidx.fragment.app.g0 r5 = (androidx.fragment.app.C0382g0) r5
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r2 = r4.f2173c
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r3 = r5.f2173c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap<java.lang.String, androidx.fragment.app.g0> r2 = r4.f2174d
            java.util.HashMap<java.lang.String, androidx.fragment.app.g0> r3 = r5.f2174d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap<java.lang.String, androidx.lifecycle.s0> r2 = r4.f2175e
            java.util.HashMap<java.lang.String, androidx.lifecycle.s0> r5 = r5.f2175e
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
        L33:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r0 = r2.f2173c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.HashMap<java.lang.String, androidx.fragment.app.g0> r1 = r2.f2174d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.HashMap<java.lang.String, androidx.lifecycle.s0> r0 = r2.f2175e
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentManagerViewModel{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} Fragments ("
            r0.append(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r1 = r4.f2173c
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = ", "
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            r0.append(r3)
            goto L21
        L3a:
            java.lang.String r1 = ") Child Non Config ("
            r0.append(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.g0> r1 = r4.f2174d
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            r0.append(r3)
            goto L49
        L62:
            java.lang.String r1 = ") ViewModelStores ("
            r0.append(r1)
            java.util.HashMap<java.lang.String, androidx.lifecycle.s0> r1 = r4.f2175e
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L71:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L71
            r0.append(r3)
            goto L71
        L8a:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
