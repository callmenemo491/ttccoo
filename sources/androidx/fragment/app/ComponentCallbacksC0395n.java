package androidx.fragment.app;

/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public class ComponentCallbacksC0395n implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.InterfaceC0471v, androidx.lifecycle.InterfaceC0469t0, androidx.savedstate.InterfaceC0622c {

    /* renamed from: T0 */
    public static final java.lang.Object f2257T0 = null;

    /* renamed from: A0 */
    public boolean f2258A0;

    /* renamed from: B0 */
    public android.view.ViewGroup f2259B0;

    /* renamed from: C0 */
    public android.view.View f2260C0;

    /* renamed from: D0 */
    public boolean f2261D0;

    /* renamed from: E0 */
    public boolean f2262E0;

    /* renamed from: F0 */
    public androidx.fragment.app.ComponentCallbacksC0395n.d f2263F0;

    /* renamed from: G0 */
    public boolean f2264G0;

    /* renamed from: H0 */
    public float f2265H0;

    /* renamed from: I0 */
    public android.view.LayoutInflater f2266I0;

    /* renamed from: J0 */
    public boolean f2267J0;

    /* renamed from: K0 */
    public androidx.lifecycle.AbstractC0458o.c f2268K0;

    /* renamed from: L0 */
    public androidx.lifecycle.C0472w f2269L0;

    /* renamed from: M0 */
    public androidx.fragment.app.C0418y0 f2270M0;

    /* renamed from: N0 */
    public androidx.lifecycle.C0437d0<androidx.lifecycle.InterfaceC0471v> f2271N0;

    /* renamed from: O0 */
    public androidx.lifecycle.InterfaceC0461p0 f2272O0;

    /* renamed from: P0 */
    public androidx.savedstate.C0621b f2273P0;

    /* renamed from: Q0 */
    public int f2274Q0;

    /* renamed from: R0 */
    public final java.util.concurrent.atomic.AtomicInteger f2275R0;

    /* renamed from: S0 */
    public final java.util.ArrayList<androidx.fragment.app.ComponentCallbacksC0395n.f> f2276S0;

    /* renamed from: Y */
    public int f2277Y;

    /* renamed from: Z */
    public android.os.Bundle f2278Z;

    /* renamed from: a0 */
    public android.util.SparseArray<android.os.Parcelable> f2279a0;

    /* renamed from: b0 */
    public android.os.Bundle f2280b0;

    /* renamed from: c0 */
    public java.lang.String f2281c0;

    /* renamed from: d0 */
    public android.os.Bundle f2282d0;

    /* renamed from: e0 */
    public androidx.fragment.app.ComponentCallbacksC0395n f2283e0;

    /* renamed from: f0 */
    public java.lang.String f2284f0;

    /* renamed from: g0 */
    public int f2285g0;

    /* renamed from: h0 */
    public java.lang.Boolean f2286h0;

    /* renamed from: i0 */
    public boolean f2287i0;

    /* renamed from: j0 */
    public boolean f2288j0;

    /* renamed from: k0 */
    public boolean f2289k0;

    /* renamed from: l0 */
    public boolean f2290l0;

    /* renamed from: m0 */
    public boolean f2291m0;

    /* renamed from: n0 */
    public boolean f2292n0;

    /* renamed from: o0 */
    public int f2293o0;

    /* renamed from: p0 */
    public androidx.fragment.app.AbstractC0375d0 f2294p0;

    /* renamed from: q0 */
    public androidx.fragment.app.AbstractC0366a0<?> f2295q0;

    /* renamed from: r0 */
    public androidx.fragment.app.AbstractC0375d0 f2296r0;

    /* renamed from: s0 */
    public androidx.fragment.app.ComponentCallbacksC0395n f2297s0;

    /* renamed from: t0 */
    public int f2298t0;

    /* renamed from: u0 */
    public int f2299u0;

    /* renamed from: v0 */
    public java.lang.String f2300v0;

    /* renamed from: w0 */
    public boolean f2301w0;

    /* renamed from: x0 */
    public boolean f2302x0;

    /* renamed from: y0 */
    public boolean f2303y0;

    /* renamed from: z0 */
    public boolean f2304z0;

    /* renamed from: androidx.fragment.app.n$a */
    public class a implements java.lang.Runnable {
    }

    /* renamed from: androidx.fragment.app.n$b */
    public class b extends androidx.fragment.app.AbstractC0415x {

        /* renamed from: a */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2305a;

        public b(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f2305a = r1
                r0.<init>()
                return
        }

        @Override // androidx.fragment.app.AbstractC0415x
        /* renamed from: c */
        public android.view.View mo1240c(int r3) {
                r2 = this;
                androidx.fragment.app.n r0 = r2.f2305a
                android.view.View r0 = r0.f2260C0
                if (r0 == 0) goto Lb
                android.view.View r3 = r0.findViewById(r3)
                return r3
            Lb:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "Fragment "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                androidx.fragment.app.n r1 = r2.f2305a
                r0.append(r1)
                java.lang.String r1 = " does not have a view"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // androidx.fragment.app.AbstractC0415x
        /* renamed from: d */
        public boolean mo1241d() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f2305a
                android.view.View r0 = r0.f2260C0
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    /* renamed from: androidx.fragment.app.n$c */
    public class c implements p241o.InterfaceC4866a<java.lang.Void, androidx.activity.result.ActivityResultRegistry> {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2306Y;

        public c(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f2306Y = r1
                r0.<init>()
                return
        }

        @Override // p241o.InterfaceC4866a
        public androidx.activity.result.ActivityResultRegistry apply(java.lang.Void r3) {
                r2 = this;
                java.lang.Void r3 = (java.lang.Void) r3
                androidx.fragment.app.n r3 = r2.f2306Y
                androidx.fragment.app.a0<?> r0 = r3.f2295q0
                boolean r1 = r0 instanceof androidx.activity.result.InterfaceC0197e
                if (r1 == 0) goto L11
                androidx.activity.result.e r0 = (androidx.activity.result.InterfaceC0197e) r0
                androidx.activity.result.ActivityResultRegistry r3 = r0.mo431m()
                goto L17
            L11:
                androidx.fragment.app.s r3 = r3.m1330q0()
                androidx.activity.result.ActivityResultRegistry r3 = r3.f590e0
            L17:
                return r3
        }
    }

    /* renamed from: androidx.fragment.app.n$d */
    public static class d {

        /* renamed from: a */
        public android.view.View f2307a;

        /* renamed from: b */
        public android.animation.Animator f2308b;

        /* renamed from: c */
        public boolean f2309c;

        /* renamed from: d */
        public int f2310d;

        /* renamed from: e */
        public int f2311e;

        /* renamed from: f */
        public int f2312f;

        /* renamed from: g */
        public int f2313g;

        /* renamed from: h */
        public int f2314h;

        /* renamed from: i */
        public java.util.ArrayList<java.lang.String> f2315i;

        /* renamed from: j */
        public java.util.ArrayList<java.lang.String> f2316j;

        /* renamed from: k */
        public java.lang.Object f2317k;

        /* renamed from: l */
        public java.lang.Object f2318l;

        /* renamed from: m */
        public java.lang.Object f2319m;

        /* renamed from: n */
        public float f2320n;

        /* renamed from: o */
        public android.view.View f2321o;

        /* renamed from: p */
        public androidx.fragment.app.ComponentCallbacksC0395n.g f2322p;

        /* renamed from: q */
        public boolean f2323q;

        public d() {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = androidx.fragment.app.ComponentCallbacksC0395n.f2257T0
                r1.f2317k = r0
                r1.f2318l = r0
                r1.f2319m = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.f2320n = r0
                r0 = 0
                r1.f2321o = r0
                return
        }
    }

    /* renamed from: androidx.fragment.app.n$e */
    public static class e extends java.lang.RuntimeException {
        public e(java.lang.String r1, java.lang.Exception r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* renamed from: androidx.fragment.app.n$f */
    public static abstract class f {
        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        public f(androidx.fragment.app.ComponentCallbacksC0395n.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract void mo1349a();
    }

    /* renamed from: androidx.fragment.app.n$g */
    public interface g {
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.fragment.app.ComponentCallbacksC0395n.f2257T0 = r0
            return
    }

    public ComponentCallbacksC0395n() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f2277Y = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r2.f2281c0 = r0
            r0 = 0
            r2.f2284f0 = r0
            r2.f2286h0 = r0
            androidx.fragment.app.e0 r1 = new androidx.fragment.app.e0
            r1.<init>()
            r2.f2296r0 = r1
            r1 = 1
            r2.f2304z0 = r1
            r2.f2262E0 = r1
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2550c0
            r2.f2268K0 = r1
            androidx.lifecycle.d0 r1 = new androidx.lifecycle.d0
            r1.<init>()
            r2.f2271N0 = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r2.f2275R0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f2276S0 = r1
            androidx.lifecycle.w r1 = new androidx.lifecycle.w
            r1.<init>(r2)
            r2.f2269L0 = r1
            androidx.savedstate.b r1 = new androidx.savedstate.b
            r1.<init>(r2)
            r2.f2273P0 = r1
            r2.f2272O0 = r0
            return
    }

    public ComponentCallbacksC0395n(int r1) {
            r0 = this;
            r0.<init>()
            r0.f2274Q0 = r1
            return
    }

    /* renamed from: A */
    public java.lang.Object m1294A() {
            r2 = this;
            androidx.fragment.app.n$d r0 = r2.f2263F0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Objects.requireNonNull(r0)
            return r1
    }

    /* renamed from: A0 */
    public void m1295A0(androidx.fragment.app.ComponentCallbacksC0395n.g r3) {
            r2 = this;
            r2.m1331r()
            androidx.fragment.app.n$d r0 = r2.f2263F0
            androidx.fragment.app.n$g r0 = r0.f2322p
            if (r3 != r0) goto La
            return
        La:
            if (r3 == 0) goto L26
            if (r0 != 0) goto Lf
            goto L26
        Lf:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Trying to set a replacement startPostponedEnterTransition on "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L26:
            if (r3 == 0) goto L30
            androidx.fragment.app.d0$p r3 = (androidx.fragment.app.AbstractC0375d0.p) r3
            int r0 = r3.f2155c
            int r0 = r0 + 1
            r3.f2155c = r0
        L30:
            return
    }

    /* renamed from: B */
    public void m1296B() {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Objects.requireNonNull(r0)
            return
    }

    /* renamed from: B0 */
    public void m1297B0(boolean r2) {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto L5
            return
        L5:
            androidx.fragment.app.n$d r0 = r1.m1331r()
            r0.f2309c = r2
            return
    }

    /* renamed from: C */
    public final int m1298C() {
            r2 = this;
            androidx.lifecycle.o$c r0 = r2.f2268K0
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2547Z
            if (r0 == r1) goto L1a
            androidx.fragment.app.n r1 = r2.f2297s0
            if (r1 != 0) goto Lb
            goto L1a
        Lb:
            int r0 = r0.ordinal()
            androidx.fragment.app.n r1 = r2.f2297s0
            int r1 = r1.m1298C()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L1a:
            int r0 = r0.ordinal()
            return r0
    }

    /* renamed from: C0 */
    public void m1299C0() {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 == 0) goto Lb
            androidx.fragment.app.n$d r0 = r1.m1331r()
            java.util.Objects.requireNonNull(r0)
        Lb:
            return
    }

    /* renamed from: D */
    public final androidx.fragment.app.AbstractC0375d0 m1300D() {
            r3 = this;
            androidx.fragment.app.d0 r0 = r3.f2294p0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " not associated with a fragment manager."
            java.lang.String r1 = androidx.fragment.app.C0393m.m1291a(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: E */
    public boolean m1301E() {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.f2309c
            return r0
    }

    /* renamed from: F */
    public int m1302F() {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f2312f
            return r0
    }

    /* renamed from: G */
    public int m1303G() {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f2313g
            return r0
    }

    /* renamed from: H */
    public java.lang.Object m1304H() {
            r3 = this;
            androidx.fragment.app.n$d r0 = r3.f2263F0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r0.f2318l
            java.lang.Object r2 = androidx.fragment.app.ComponentCallbacksC0395n.f2257T0
            if (r0 != r2) goto L10
            r3.m1294A()
            goto L11
        L10:
            r1 = r0
        L11:
            return r1
    }

    /* renamed from: I */
    public final android.content.res.Resources m1305I() {
            r1 = this;
            android.content.Context r0 = r1.m1334s0()
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    /* renamed from: J */
    public java.lang.Object m1306J() {
            r3 = this;
            androidx.fragment.app.n$d r0 = r3.f2263F0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r0.f2317k
            java.lang.Object r2 = androidx.fragment.app.ComponentCallbacksC0395n.f2257T0
            if (r0 != r2) goto L10
            r3.m1343x()
            goto L11
        L10:
            r1 = r0
        L11:
            return r1
    }

    /* renamed from: K */
    public java.lang.Object m1307K() {
            r2 = this;
            androidx.fragment.app.n$d r0 = r2.f2263F0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Objects.requireNonNull(r0)
            return r1
    }

    /* renamed from: L */
    public java.lang.Object m1308L() {
            r3 = this;
            androidx.fragment.app.n$d r0 = r3.f2263F0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r0.f2319m
            java.lang.Object r2 = androidx.fragment.app.ComponentCallbacksC0395n.f2257T0
            if (r0 != r2) goto L10
            r3.m1307K()
            goto L11
        L10:
            r1 = r0
        L11:
            return r1
    }

    /* renamed from: M */
    public final java.lang.String m1309M(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.m1305I()
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    /* renamed from: N */
    public final java.lang.String m1310N(int r2, java.lang.Object... r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.m1305I()
            java.lang.String r2 = r0.getString(r2, r3)
            return r2
    }

    /* renamed from: O */
    public androidx.lifecycle.InterfaceC0471v m1311O() {
            r2 = this;
            androidx.fragment.app.y0 r0 = r2.f2270M0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: P */
    public final boolean m1312P() {
            r1 = this;
            int r0 = r1.f2293o0
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: Q */
    public boolean m1313Q() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: R */
    public final boolean m1314R() {
            r2 = this;
            androidx.fragment.app.n r0 = r2.f2297s0
            if (r0 == 0) goto L10
            boolean r1 = r0.f2288j0
            if (r1 != 0) goto Le
            boolean r0 = r0.m1314R()
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: S */
    public void m1315S(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " received the following in onActivityResult(): requestCode: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " resultCode: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " data: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L35:
            return
    }

    /* renamed from: T */
    public void mo1230T(android.content.Context r2) {
            r1 = this;
            r2 = 1
            r1.f2258A0 = r2
            androidx.fragment.app.a0<?> r0 = r1.f2295q0
            if (r0 != 0) goto L9
            r0 = 0
            goto Lb
        L9:
            android.app.Activity r0 = r0.f2033Y
        Lb:
            if (r0 == 0) goto L12
            r0 = 0
            r1.f2258A0 = r0
            r1.f2258A0 = r2
        L12:
            return
    }

    @java.lang.Deprecated
    /* renamed from: U */
    public void mo1316U(androidx.fragment.app.ComponentCallbacksC0395n r1) {
            r0 = this;
            return
    }

    /* renamed from: V */
    public void mo114V(android.os.Bundle r3) {
            r2 = this;
            r0 = 1
            r2.f2258A0 = r0
            if (r3 == 0) goto L17
            java.lang.String r1 = "android:support:fragments"
            android.os.Parcelable r3 = r3.getParcelable(r1)
            if (r3 == 0) goto L17
            androidx.fragment.app.d0 r1 = r2.f2296r0
            r1.m1160b0(r3)
            androidx.fragment.app.d0 r3 = r2.f2296r0
            r3.m1180m()
        L17:
            androidx.fragment.app.d0 r3 = r2.f2296r0
            int r1 = r3.f2129q
            if (r1 < r0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 != 0) goto L24
            r3.m1180m()
        L24:
            return
    }

    /* renamed from: W */
    public android.view.View mo1317W(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            int r4 = r1.f2274Q0
            if (r4 == 0) goto La
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            return r2
        La:
            r2 = 0
            return r2
    }

    /* renamed from: X */
    public void mo1318X() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            return
    }

    /* renamed from: Y */
    public void mo1231Y() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            return
    }

    /* renamed from: Z */
    public void mo1232Z() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            return
    }

    /* renamed from: a0 */
    public android.view.LayoutInflater mo1233a0(android.os.Bundle r2) {
            r1 = this;
            androidx.fragment.app.a0<?> r2 = r1.f2295q0
            if (r2 == 0) goto L10
            android.view.LayoutInflater r2 = r2.mo1089h()
            androidx.fragment.app.d0 r0 = r1.f2296r0
            androidx.fragment.app.b0 r0 = r0.f2118f
            r2.setFactory2(r0)
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.lifecycle.InterfaceC0471v
    /* renamed from: b */
    public androidx.lifecycle.AbstractC0458o mo428b() {
            r1 = this;
            androidx.lifecycle.w r0 = r1.f2269L0
            return r0
    }

    /* renamed from: b0 */
    public void mo1319b0(android.content.Context r1, android.util.AttributeSet r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 1
            r0.f2258A0 = r1
            androidx.fragment.app.a0<?> r2 = r0.f2295q0
            if (r2 != 0) goto L9
            r2 = 0
            goto Lb
        L9:
            android.app.Activity r2 = r2.f2033Y
        Lb:
            if (r2 == 0) goto L12
            r2 = 0
            r0.f2258A0 = r2
            r0.f2258A0 = r1
        L12:
            return
    }

    /* renamed from: c0 */
    public void mo1320c0() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            return
    }

    /* renamed from: d0 */
    public void mo1321d0(boolean r1) {
            r0 = this;
            return
    }

    /* renamed from: e0 */
    public void mo1322e0() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            return
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // androidx.savedstate.InterfaceC0622c
    /* renamed from: f */
    public final androidx.savedstate.C0620a mo430f() {
            r1 = this;
            androidx.savedstate.b r0 = r1.f2273P0
            androidx.savedstate.a r0 = r0.f3684b
            return r0
    }

    /* renamed from: f0 */
    public void mo1234f0(android.os.Bundle r1) {
            r0 = this;
            return
    }

    /* renamed from: g0 */
    public void mo1235g0() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            return
    }

    /* renamed from: h0 */
    public void mo1236h0() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    /* renamed from: i0 */
    public void mo1323i0(android.view.View r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    /* renamed from: j0 */
    public void mo1237j0(android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.f2258A0 = r1
            return
    }

    /* renamed from: k0 */
    public void mo1238k0(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            androidx.fragment.app.d0 r0 = r3.f2296r0
            r0.m1152V()
            r0 = 1
            r3.f2292n0 = r0
            androidx.fragment.app.y0 r1 = new androidx.fragment.app.y0
            androidx.lifecycle.s0 r2 = r3.mo432o()
            r1.<init>(r3, r2)
            r3.f2270M0 = r1
            android.view.View r4 = r3.mo1317W(r4, r5, r6)
            r3.f2260C0 = r4
            if (r4 == 0) goto L46
            androidx.fragment.app.y0 r4 = r3.f2270M0
            r4.m1401c()
            android.view.View r4 = r3.f2260C0
            androidx.fragment.app.y0 r5 = r3.f2270M0
            r6 = 2131362755(0x7f0a03c3, float:1.83453E38)
            r4.setTag(r6, r5)
            android.view.View r4 = r3.f2260C0
            androidx.fragment.app.y0 r5 = r3.f2270M0
            r6 = 2131362757(0x7f0a03c5, float:1.8345304E38)
            r4.setTag(r6, r5)
            android.view.View r4 = r3.f2260C0
            androidx.fragment.app.y0 r5 = r3.f2270M0
            r6 = 2131362756(0x7f0a03c4, float:1.8345302E38)
            r4.setTag(r6, r5)
            androidx.lifecycle.d0<androidx.lifecycle.v> r4 = r3.f2271N0
            androidx.fragment.app.y0 r5 = r3.f2270M0
            r4.mo7l(r5)
            goto L53
        L46:
            androidx.fragment.app.y0 r4 = r3.f2270M0
            androidx.lifecycle.w r4 = r4.f2422Z
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 != 0) goto L54
            r4 = 0
            r3.f2270M0 = r4
        L53:
            return
        L54:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Called getViewLifecycleOwner() but onCreateView() returned null"
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: l0 */
    public void m1324l0() {
            r5 = this;
            androidx.fragment.app.d0 r0 = r5.f2296r0
            r1 = 1
            r0.m1190w(r1)
            android.view.View r0 = r5.f2260C0
            r2 = 0
            if (r0 == 0) goto L28
            androidx.fragment.app.y0 r0 = r5.f2270M0
            r0.m1401c()
            androidx.lifecycle.w r0 = r0.f2422Z
            androidx.lifecycle.o$c r0 = r0.f2564c
            androidx.lifecycle.o$c r3 = androidx.lifecycle.AbstractC0458o.c.f2548a0
            int r0 = r0.compareTo(r3)
            if (r0 < 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L28
            androidx.fragment.app.y0 r0 = r5.f2270M0
            androidx.lifecycle.o$b r3 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY
            r0.m1400a(r3)
        L28:
            r5.f2277Y = r1
            r5.f2258A0 = r2
            r5.mo1231Y()
            boolean r0 = r5.f2258A0
            if (r0 == 0) goto L55
            a1.a r0 = p002a1.AbstractC0002a.m2b(r5)
            a1.b r0 = (p002a1.C0003b) r0
            a1.b$b r0 = r0.f5b
            s.i<a1.b$a> r1 = r0.f7c
            int r1 = r1.m12352j()
            r3 = 0
        L42:
            if (r3 >= r1) goto L52
            s.i<a1.b$a> r4 = r0.f7c
            java.lang.Object r4 = r4.m12353k(r3)
            a1.b$a r4 = (p002a1.C0003b.a) r4
            java.util.Objects.requireNonNull(r4)
            int r3 = r3 + 1
            goto L42
        L52:
            r5.f2292n0 = r2
            return
        L55:
            androidx.fragment.app.d1 r0 = new androidx.fragment.app.d1
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onDestroyView()"
            java.lang.String r1 = androidx.fragment.app.C0393m.m1291a(r1, r5, r2)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: m0 */
    public android.view.LayoutInflater m1325m0(android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.mo1233a0(r1)
            r0.f2266I0 = r1
            return r1
    }

    /* renamed from: n0 */
    public void m1326n0() {
            r1 = this;
            r1.onLowMemory()
            androidx.fragment.app.d0 r0 = r1.f2296r0
            r0.m1183p()
            return
    }

    @Override // androidx.lifecycle.InterfaceC0469t0
    /* renamed from: o */
    public androidx.lifecycle.C0467s0 mo432o() {
            r3 = this;
            androidx.fragment.app.d0 r0 = r3.f2294p0
            if (r0 == 0) goto L30
            int r0 = r3.m1298C()
            r1 = 1
            if (r0 == r1) goto L28
            androidx.fragment.app.d0 r0 = r3.f2294p0
            androidx.fragment.app.g0 r0 = r0.f2111K
            java.util.HashMap<java.lang.String, androidx.lifecycle.s0> r1 = r0.f2175e
            java.lang.String r2 = r3.f2281c0
            java.lang.Object r1 = r1.get(r2)
            androidx.lifecycle.s0 r1 = (androidx.lifecycle.C0467s0) r1
            if (r1 != 0) goto L27
            androidx.lifecycle.s0 r1 = new androidx.lifecycle.s0
            r1.<init>()
            java.util.HashMap<java.lang.String, androidx.lifecycle.s0> r0 = r0.f2175e
            java.lang.String r2 = r3.f2281c0
            r0.put(r2, r1)
        L27:
            return r1
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"
            r0.<init>(r1)
            throw r0
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: o0 */
    public boolean m1327o0(android.view.Menu r3) {
            r2 = this;
            boolean r0 = r2.f2301w0
            r1 = 0
            if (r0 != 0) goto Lc
            androidx.fragment.app.d0 r0 = r2.f2296r0
            boolean r3 = r0.m1189v(r3)
            r1 = r1 | r3
        Lc:
            return r1
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            r1 = 1
            r0.f2258A0 = r1
            return
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            androidx.fragment.app.s r0 = r1.m1330q0()
            r0.onCreateContextMenu(r2, r3, r4)
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            return
    }

    /* renamed from: p */
    public androidx.fragment.app.AbstractC0415x mo1239p() {
            r1 = this;
            androidx.fragment.app.n$b r0 = new androidx.fragment.app.n$b
            r0.<init>(r1)
            return r0
    }

    /* renamed from: p0 */
    public final <I, O> androidx.activity.result.AbstractC0195c<I> m1328p0(p045d.AbstractC1255a<I, O> r9, androidx.activity.result.InterfaceC0194b<O> r10) {
            r8 = this;
            androidx.fragment.app.n$c r2 = new androidx.fragment.app.n$c
            r2.<init>(r8)
            int r0 = r8.f2277Y
            r1 = 1
            if (r0 > r1) goto L2c
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference
            r6.<init>()
            androidx.fragment.app.o r7 = new androidx.fragment.app.o
            r0 = r7
            r1 = r8
            r3 = r6
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            int r10 = r8.f2277Y
            if (r10 < 0) goto L21
            r7.mo1349a()
            goto L26
        L21:
            java.util.ArrayList<androidx.fragment.app.n$f> r10 = r8.f2276S0
            r10.add(r7)
        L26:
            androidx.fragment.app.p r10 = new androidx.fragment.app.p
            r10.<init>(r8, r6, r9)
            return r10
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Fragment "
            java.lang.String r0 = " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."
            java.lang.String r10 = androidx.fragment.app.C0393m.m1291a(r10, r8, r0)
            r9.<init>(r10)
            throw r9
    }

    /* renamed from: q */
    public void m1329q(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
            r2 = this;
            r5.print(r3)
            java.lang.String r0 = "mFragmentId=#"
            r5.print(r0)
            int r0 = r2.f2298t0
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r5.print(r0)
            int r0 = r2.f2299u0
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mTag="
            r5.print(r0)
            java.lang.String r0 = r2.f2300v0
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mState="
            r5.print(r0)
            int r0 = r2.f2277Y
            r5.print(r0)
            java.lang.String r0 = " mWho="
            r5.print(r0)
            java.lang.String r0 = r2.f2281c0
            r5.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r5.print(r0)
            int r0 = r2.f2293o0
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mAdded="
            r5.print(r0)
            boolean r0 = r2.f2287i0
            r5.print(r0)
            java.lang.String r0 = " mRemoving="
            r5.print(r0)
            boolean r0 = r2.f2288j0
            r5.print(r0)
            java.lang.String r0 = " mFromLayout="
            r5.print(r0)
            boolean r0 = r2.f2289k0
            r5.print(r0)
            java.lang.String r0 = " mInLayout="
            r5.print(r0)
            boolean r0 = r2.f2290l0
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mHidden="
            r5.print(r0)
            boolean r0 = r2.f2301w0
            r5.print(r0)
            java.lang.String r0 = " mDetached="
            r5.print(r0)
            boolean r0 = r2.f2302x0
            r5.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r5.print(r0)
            boolean r0 = r2.f2304z0
            r5.print(r0)
            java.lang.String r0 = " mHasMenu="
            r5.print(r0)
            r0 = 0
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mRetainInstance="
            r5.print(r0)
            boolean r0 = r2.f2303y0
            r5.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r5.print(r0)
            boolean r0 = r2.f2262E0
            r5.println(r0)
            androidx.fragment.app.d0 r0 = r2.f2294p0
            if (r0 == 0) goto Lc7
            r5.print(r3)
            java.lang.String r0 = "mFragmentManager="
            r5.print(r0)
            androidx.fragment.app.d0 r0 = r2.f2294p0
            r5.println(r0)
        Lc7:
            androidx.fragment.app.a0<?> r0 = r2.f2295q0
            if (r0 == 0) goto Ld8
            r5.print(r3)
            java.lang.String r0 = "mHost="
            r5.print(r0)
            androidx.fragment.app.a0<?> r0 = r2.f2295q0
            r5.println(r0)
        Ld8:
            androidx.fragment.app.n r0 = r2.f2297s0
            if (r0 == 0) goto Le9
            r5.print(r3)
            java.lang.String r0 = "mParentFragment="
            r5.print(r0)
            androidx.fragment.app.n r0 = r2.f2297s0
            r5.println(r0)
        Le9:
            android.os.Bundle r0 = r2.f2282d0
            if (r0 == 0) goto Lfa
            r5.print(r3)
            java.lang.String r0 = "mArguments="
            r5.print(r0)
            android.os.Bundle r0 = r2.f2282d0
            r5.println(r0)
        Lfa:
            android.os.Bundle r0 = r2.f2278Z
            if (r0 == 0) goto L10b
            r5.print(r3)
            java.lang.String r0 = "mSavedFragmentState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f2278Z
            r5.println(r0)
        L10b:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f2279a0
            if (r0 == 0) goto L11c
            r5.print(r3)
            java.lang.String r0 = "mSavedViewState="
            r5.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f2279a0
            r5.println(r0)
        L11c:
            android.os.Bundle r0 = r2.f2280b0
            if (r0 == 0) goto L12d
            r5.print(r3)
            java.lang.String r0 = "mSavedViewRegistryState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f2280b0
            r5.println(r0)
        L12d:
            androidx.fragment.app.n r0 = r2.f2283e0
            if (r0 == 0) goto L132
            goto L142
        L132:
            androidx.fragment.app.d0 r0 = r2.f2294p0
            if (r0 == 0) goto L141
            java.lang.String r1 = r2.f2284f0
            if (r1 == 0) goto L141
            androidx.fragment.app.l0 r0 = r0.f2115c
            androidx.fragment.app.n r0 = r0.m1285u(r1)
            goto L142
        L141:
            r0 = 0
        L142:
            if (r0 == 0) goto L159
            r5.print(r3)
            java.lang.String r1 = "mTarget="
            r5.print(r1)
            r5.print(r0)
            java.lang.String r0 = " mTargetRequestCode="
            r5.print(r0)
            int r0 = r2.f2285g0
            r5.println(r0)
        L159:
            r5.print(r3)
            java.lang.String r0 = "mPopDirection="
            r5.print(r0)
            boolean r0 = r2.m1301E()
            r5.println(r0)
            int r0 = r2.m1341w()
            if (r0 == 0) goto L17d
            r5.print(r3)
            java.lang.String r0 = "getEnterAnim="
            r5.print(r0)
            int r0 = r2.m1341w()
            r5.println(r0)
        L17d:
            int r0 = r2.m1347z()
            if (r0 == 0) goto L192
            r5.print(r3)
            java.lang.String r0 = "getExitAnim="
            r5.print(r0)
            int r0 = r2.m1347z()
            r5.println(r0)
        L192:
            int r0 = r2.m1302F()
            if (r0 == 0) goto L1a7
            r5.print(r3)
            java.lang.String r0 = "getPopEnterAnim="
            r5.print(r0)
            int r0 = r2.m1302F()
            r5.println(r0)
        L1a7:
            int r0 = r2.m1303G()
            if (r0 == 0) goto L1bc
            r5.print(r3)
            java.lang.String r0 = "getPopExitAnim="
            r5.print(r0)
            int r0 = r2.m1303G()
            r5.println(r0)
        L1bc:
            android.view.ViewGroup r0 = r2.f2259B0
            if (r0 == 0) goto L1cd
            r5.print(r3)
            java.lang.String r0 = "mContainer="
            r5.print(r0)
            android.view.ViewGroup r0 = r2.f2259B0
            r5.println(r0)
        L1cd:
            android.view.View r0 = r2.f2260C0
            if (r0 == 0) goto L1de
            r5.print(r3)
            java.lang.String r0 = "mView="
            r5.print(r0)
            android.view.View r0 = r2.f2260C0
            r5.println(r0)
        L1de:
            android.view.View r0 = r2.m1335t()
            if (r0 == 0) goto L1f3
            r5.print(r3)
            java.lang.String r0 = "mAnimatingAway="
            r5.print(r0)
            android.view.View r0 = r2.m1335t()
            r5.println(r0)
        L1f3:
            android.content.Context r0 = r2.m1339v()
            if (r0 == 0) goto L200
            a1.a r0 = p002a1.AbstractC0002a.m2b(r2)
            r0.mo3a(r3, r4, r5, r6)
        L200:
            r5.print(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Child "
            r0.append(r1)
            androidx.fragment.app.d0 r1 = r2.f2296r0
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            androidx.fragment.app.d0 r0 = r2.f2296r0
            java.lang.String r1 = "  "
            java.lang.String r3 = p064e.C1493g.m4049a(r3, r1)
            r0.m1192y(r3, r4, r5, r6)
            return
    }

    /* renamed from: q0 */
    public final androidx.fragment.app.ActivityC0405s m1330q0() {
            r3 = this;
            androidx.fragment.app.s r0 = r3.m1333s()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " not attached to an activity."
            java.lang.String r1 = androidx.fragment.app.C0393m.m1291a(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: r */
    public final androidx.fragment.app.ComponentCallbacksC0395n.d m1331r() {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto Lb
            androidx.fragment.app.n$d r0 = new androidx.fragment.app.n$d
            r0.<init>()
            r1.f2263F0 = r0
        Lb:
            androidx.fragment.app.n$d r0 = r1.f2263F0
            return r0
    }

    /* renamed from: r0 */
    public final android.os.Bundle m1332r0() {
            r3 = this;
            android.os.Bundle r0 = r3.f2282d0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " does not have any arguments."
            java.lang.String r1 = androidx.fragment.app.C0393m.m1291a(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: s */
    public final androidx.fragment.app.ActivityC0405s m1333s() {
            r1 = this;
            androidx.fragment.app.a0<?> r0 = r1.f2295q0
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            android.app.Activity r0 = r0.f2033Y
            androidx.fragment.app.s r0 = (androidx.fragment.app.ActivityC0405s) r0
        La:
            return r0
    }

    /* renamed from: s0 */
    public final android.content.Context m1334s0() {
            r3 = this;
            android.content.Context r0 = r3.m1339v()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " not attached to a context."
            java.lang.String r1 = androidx.fragment.app.C0393m.m1291a(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: t */
    public android.view.View m1335t() {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.f2307a
            return r0
    }

    /* renamed from: t0 */
    public final android.view.View m1336t0() {
            r3 = this;
            android.view.View r0 = r3.f2260C0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not return a View from onCreateView() or this was called before onCreateView()."
            java.lang.String r1 = androidx.fragment.app.C0393m.m1291a(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r2.f2281c0
            r0.append(r1)
            int r1 = r2.f2298t0
            if (r1 == 0) goto L43
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.f2298t0
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L43:
            java.lang.String r1 = r2.f2300v0
            if (r1 == 0) goto L51
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r1 = r2.f2300v0
            r0.append(r1)
        L51:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    public final androidx.fragment.app.AbstractC0375d0 m1337u() {
            r3 = this;
            androidx.fragment.app.a0<?> r0 = r3.f2295q0
            if (r0 == 0) goto L7
            androidx.fragment.app.d0 r0 = r3.f2296r0
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " has not been attached yet."
            java.lang.String r1 = androidx.fragment.app.C0393m.m1291a(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: u0 */
    public void m1338u0(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.m1331r()
            r0.f2307a = r2
            return
    }

    /* renamed from: v */
    public android.content.Context m1339v() {
            r1 = this;
            androidx.fragment.app.a0<?> r0 = r1.f2295q0
            if (r0 != 0) goto L6
            r0 = 0
            goto L8
        L6:
            android.content.Context r0 = r0.f2034Z
        L8:
            return r0
    }

    /* renamed from: v0 */
    public void m1340v0(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            if (r3 != 0) goto Ld
            if (r4 != 0) goto Ld
            if (r5 != 0) goto Ld
            return
        Ld:
            androidx.fragment.app.n$d r0 = r1.m1331r()
            r0.f2310d = r2
            androidx.fragment.app.n$d r2 = r1.m1331r()
            r2.f2311e = r3
            androidx.fragment.app.n$d r2 = r1.m1331r()
            r2.f2312f = r4
            androidx.fragment.app.n$d r2 = r1.m1331r()
            r2.f2313g = r5
            return
    }

    /* renamed from: w */
    public int m1341w() {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f2310d
            return r0
    }

    /* renamed from: w0 */
    public void m1342w0(android.animation.Animator r2) {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.m1331r()
            r0.f2308b = r2
            return
    }

    /* renamed from: x */
    public java.lang.Object m1343x() {
            r2 = this;
            androidx.fragment.app.n$d r0 = r2.f2263F0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Objects.requireNonNull(r0)
            return r1
    }

    /* renamed from: x0 */
    public void m1344x0(android.os.Bundle r2) {
            r1 = this;
            androidx.fragment.app.d0 r0 = r1.f2294p0
            if (r0 == 0) goto L17
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            boolean r0 = r0.m1149S()
        Lc:
            if (r0 != 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added and state has been saved"
            r2.<init>(r0)
            throw r2
        L17:
            r1.f2282d0 = r2
            return
    }

    /* renamed from: y */
    public void m1345y() {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Objects.requireNonNull(r0)
            return
    }

    /* renamed from: y0 */
    public void m1346y0(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.n$d r2 = r1.m1331r()
            r0 = 0
            r2.f2321o = r0
            return
    }

    /* renamed from: z */
    public int m1347z() {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.f2263F0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f2311e
            return r0
    }

    /* renamed from: z0 */
    public void m1348z0(boolean r2) {
            r1 = this;
            androidx.fragment.app.n$d r0 = r1.m1331r()
            r0.f2323q = r2
            return
    }
}
