package androidx.fragment.app;

/* renamed from: androidx.fragment.app.b1 */
/* loaded from: classes.dex */
public abstract class AbstractC0370b1 {

    /* renamed from: a */
    public final android.view.ViewGroup f2056a;

    /* renamed from: b */
    public final java.util.ArrayList<androidx.fragment.app.AbstractC0370b1.d> f2057b;

    /* renamed from: c */
    public final java.util.ArrayList<androidx.fragment.app.AbstractC0370b1.d> f2058c;

    /* renamed from: d */
    public boolean f2059d;

    /* renamed from: e */
    public boolean f2060e;

    /* renamed from: androidx.fragment.app.b1$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.AbstractC0370b1.c f2061Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.AbstractC0370b1 f2062Z;

        public a(androidx.fragment.app.AbstractC0370b1 r1, androidx.fragment.app.AbstractC0370b1.c r2) {
                r0 = this;
                r0.f2062Z = r1
                r0.f2061Y = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.fragment.app.b1 r0 = r2.f2062Z
                java.util.ArrayList<androidx.fragment.app.b1$d> r0 = r0.f2057b
                androidx.fragment.app.b1$c r1 = r2.f2061Y
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L17
                androidx.fragment.app.b1$c r0 = r2.f2061Y
                androidx.fragment.app.b1$d$c r1 = r0.f2066a
                androidx.fragment.app.n r0 = r0.f2068c
                android.view.View r0 = r0.f2260C0
                r1.m1109e(r0)
            L17:
                return
        }
    }

    /* renamed from: androidx.fragment.app.b1$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.AbstractC0370b1.c f2063Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.AbstractC0370b1 f2064Z;

        public b(androidx.fragment.app.AbstractC0370b1 r1, androidx.fragment.app.AbstractC0370b1.c r2) {
                r0 = this;
                r0.f2064Z = r1
                r0.f2063Y = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.fragment.app.b1 r0 = r2.f2064Z
                java.util.ArrayList<androidx.fragment.app.b1$d> r0 = r0.f2057b
                androidx.fragment.app.b1$c r1 = r2.f2063Y
                r0.remove(r1)
                androidx.fragment.app.b1 r0 = r2.f2064Z
                java.util.ArrayList<androidx.fragment.app.b1$d> r0 = r0.f2058c
                androidx.fragment.app.b1$c r1 = r2.f2063Y
                r0.remove(r1)
                return
        }
    }

    /* renamed from: androidx.fragment.app.b1$c */
    public static class c extends androidx.fragment.app.AbstractC0370b1.d {

        /* renamed from: h */
        public final androidx.fragment.app.C0388j0 f2065h;

        public c(androidx.fragment.app.AbstractC0370b1.d.c r2, androidx.fragment.app.AbstractC0370b1.d.b r3, androidx.fragment.app.C0388j0 r4, p158j0.C3380b r5) {
                r1 = this;
                androidx.fragment.app.n r0 = r4.f2202c
                r1.<init>(r2, r3, r0, r5)
                r1.f2065h = r4
                return
        }

        @Override // androidx.fragment.app.AbstractC0370b1.d
        /* renamed from: b */
        public void mo1102b() {
                r1 = this;
                super.mo1102b()
                androidx.fragment.app.j0 r0 = r1.f2065h
                r0.m1214k()
                return
        }

        @Override // androidx.fragment.app.AbstractC0370b1.d
        /* renamed from: d */
        public void mo1103d() {
                r4 = this;
                androidx.fragment.app.b1$d$b r0 = r4.f2067b
                androidx.fragment.app.b1$d$b r1 = androidx.fragment.app.AbstractC0370b1.d.b.f2075Z
                if (r0 != r1) goto L70
                androidx.fragment.app.j0 r0 = r4.f2065h
                androidx.fragment.app.n r0 = r0.f2202c
                android.view.View r1 = r0.f2260C0
                android.view.View r1 = r1.findFocus()
                if (r1 == 0) goto L3d
                androidx.fragment.app.n$d r2 = r0.m1331r()
                r2.f2321o = r1
                r2 = 2
                boolean r2 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
                if (r2 == 0) goto L3d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "requestFocus: Saved focused view "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " for Fragment "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "FragmentManager"
                android.util.Log.v(r2, r1)
            L3d:
                androidx.fragment.app.n r1 = r4.f2068c
                android.view.View r1 = r1.m1336t0()
                android.view.ViewParent r2 = r1.getParent()
                r3 = 0
                if (r2 != 0) goto L52
                androidx.fragment.app.j0 r2 = r4.f2065h
                r2.m1205b()
                r1.setAlpha(r3)
            L52:
                float r2 = r1.getAlpha()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L64
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L64
                r2 = 4
                r1.setVisibility(r2)
            L64:
                androidx.fragment.app.n$d r0 = r0.f2263F0
                if (r0 != 0) goto L6b
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L6d
            L6b:
                float r0 = r0.f2320n
            L6d:
                r1.setAlpha(r0)
            L70:
                return
        }
    }

    /* renamed from: androidx.fragment.app.b1$d */
    public static class d {

        /* renamed from: a */
        public androidx.fragment.app.AbstractC0370b1.d.c f2066a;

        /* renamed from: b */
        public androidx.fragment.app.AbstractC0370b1.d.b f2067b;

        /* renamed from: c */
        public final androidx.fragment.app.ComponentCallbacksC0395n f2068c;

        /* renamed from: d */
        public final java.util.List<java.lang.Runnable> f2069d;

        /* renamed from: e */
        public final java.util.HashSet<p158j0.C3380b> f2070e;

        /* renamed from: f */
        public boolean f2071f;

        /* renamed from: g */
        public boolean f2072g;

        /* renamed from: androidx.fragment.app.b1$d$a */
        public class a implements p158j0.C3380b.a {

            /* renamed from: a */
            public final /* synthetic */ androidx.fragment.app.AbstractC0370b1.d f2073a;

            public a(androidx.fragment.app.AbstractC0370b1.d r1) {
                    r0 = this;
                    r0.f2073a = r1
                    r0.<init>()
                    return
            }

            @Override // p158j0.C3380b.a
            /* renamed from: a */
            public void mo1106a() {
                    r1 = this;
                    androidx.fragment.app.b1$d r0 = r1.f2073a
                    r0.m1104a()
                    return
            }
        }

        /* renamed from: androidx.fragment.app.b1$d$b */
        public enum b extends java.lang.Enum<androidx.fragment.app.AbstractC0370b1.d.b> {

            /* renamed from: Y */
            public static final androidx.fragment.app.AbstractC0370b1.d.b f2074Y = null;

            /* renamed from: Z */
            public static final androidx.fragment.app.AbstractC0370b1.d.b f2075Z = null;

            /* renamed from: a0 */
            public static final androidx.fragment.app.AbstractC0370b1.d.b f2076a0 = null;

            /* renamed from: b0 */
            public static final /* synthetic */ androidx.fragment.app.AbstractC0370b1.d.b[] f2077b0 = null;

            static {
                    androidx.fragment.app.b1$d$b r0 = new androidx.fragment.app.b1$d$b
                    java.lang.String r1 = "NONE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.AbstractC0370b1.d.b.f2074Y = r0
                    androidx.fragment.app.b1$d$b r1 = new androidx.fragment.app.b1$d$b
                    java.lang.String r3 = "ADDING"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.fragment.app.AbstractC0370b1.d.b.f2075Z = r1
                    androidx.fragment.app.b1$d$b r3 = new androidx.fragment.app.b1$d$b
                    java.lang.String r5 = "REMOVING"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.fragment.app.AbstractC0370b1.d.b.f2076a0 = r3
                    r5 = 3
                    androidx.fragment.app.b1$d$b[] r5 = new androidx.fragment.app.AbstractC0370b1.d.b[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    androidx.fragment.app.AbstractC0370b1.d.b.f2077b0 = r5
                    return
            }

            b(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.fragment.app.AbstractC0370b1.d.b valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.b1$d$b> r0 = androidx.fragment.app.AbstractC0370b1.d.b.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.b1$d$b r1 = (androidx.fragment.app.AbstractC0370b1.d.b) r1
                    return r1
            }

            public static androidx.fragment.app.AbstractC0370b1.d.b[] values() {
                    androidx.fragment.app.b1$d$b[] r0 = androidx.fragment.app.AbstractC0370b1.d.b.f2077b0
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.b1$d$b[] r0 = (androidx.fragment.app.AbstractC0370b1.d.b[]) r0
                    return r0
            }
        }

        /* renamed from: androidx.fragment.app.b1$d$c */
        public enum c extends java.lang.Enum<androidx.fragment.app.AbstractC0370b1.d.c> {

            /* renamed from: Y */
            public static final androidx.fragment.app.AbstractC0370b1.d.c f2078Y = null;

            /* renamed from: Z */
            public static final androidx.fragment.app.AbstractC0370b1.d.c f2079Z = null;

            /* renamed from: a0 */
            public static final androidx.fragment.app.AbstractC0370b1.d.c f2080a0 = null;

            /* renamed from: b0 */
            public static final androidx.fragment.app.AbstractC0370b1.d.c f2081b0 = null;

            /* renamed from: c0 */
            public static final /* synthetic */ androidx.fragment.app.AbstractC0370b1.d.c[] f2082c0 = null;

            static {
                    androidx.fragment.app.b1$d$c r0 = new androidx.fragment.app.b1$d$c
                    java.lang.String r1 = "REMOVED"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.AbstractC0370b1.d.c.f2078Y = r0
                    androidx.fragment.app.b1$d$c r1 = new androidx.fragment.app.b1$d$c
                    java.lang.String r3 = "VISIBLE"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.fragment.app.AbstractC0370b1.d.c.f2079Z = r1
                    androidx.fragment.app.b1$d$c r3 = new androidx.fragment.app.b1$d$c
                    java.lang.String r5 = "GONE"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.fragment.app.AbstractC0370b1.d.c.f2080a0 = r3
                    androidx.fragment.app.b1$d$c r5 = new androidx.fragment.app.b1$d$c
                    java.lang.String r7 = "INVISIBLE"
                    r8 = 3
                    r5.<init>(r7, r8)
                    androidx.fragment.app.AbstractC0370b1.d.c.f2081b0 = r5
                    r7 = 4
                    androidx.fragment.app.b1$d$c[] r7 = new androidx.fragment.app.AbstractC0370b1.d.c[r7]
                    r7[r2] = r0
                    r7[r4] = r1
                    r7[r6] = r3
                    r7[r8] = r5
                    androidx.fragment.app.AbstractC0370b1.d.c.f2082c0 = r7
                    return
            }

            c(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* renamed from: g */
            public static androidx.fragment.app.AbstractC0370b1.d.c m1107g(int r2) {
                    if (r2 == 0) goto L1b
                    r0 = 4
                    if (r2 == r0) goto L18
                    r0 = 8
                    if (r2 != r0) goto Lc
                    androidx.fragment.app.b1$d$c r2 = androidx.fragment.app.AbstractC0370b1.d.c.f2080a0
                    return r2
                Lc:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Unknown visibility "
                    java.lang.String r2 = android.support.v4.media.C0142a.m254a(r1, r2)
                    r0.<init>(r2)
                    throw r0
                L18:
                    androidx.fragment.app.b1$d$c r2 = androidx.fragment.app.AbstractC0370b1.d.c.f2081b0
                    return r2
                L1b:
                    androidx.fragment.app.b1$d$c r2 = androidx.fragment.app.AbstractC0370b1.d.c.f2079Z
                    return r2
            }

            /* renamed from: h */
            public static androidx.fragment.app.AbstractC0370b1.d.c m1108h(android.view.View r2) {
                    float r0 = r2.getAlpha()
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L12
                    int r0 = r2.getVisibility()
                    if (r0 != 0) goto L12
                    androidx.fragment.app.b1$d$c r2 = androidx.fragment.app.AbstractC0370b1.d.c.f2081b0
                    return r2
                L12:
                    int r2 = r2.getVisibility()
                    androidx.fragment.app.b1$d$c r2 = m1107g(r2)
                    return r2
            }

            public static androidx.fragment.app.AbstractC0370b1.d.c valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.b1$d$c> r0 = androidx.fragment.app.AbstractC0370b1.d.c.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.b1$d$c r1 = (androidx.fragment.app.AbstractC0370b1.d.c) r1
                    return r1
            }

            public static androidx.fragment.app.AbstractC0370b1.d.c[] values() {
                    androidx.fragment.app.b1$d$c[] r0 = androidx.fragment.app.AbstractC0370b1.d.c.f2082c0
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.b1$d$c[] r0 = (androidx.fragment.app.AbstractC0370b1.d.c[]) r0
                    return r0
            }

            /* renamed from: e */
            public void m1109e(android.view.View r6) {
                    r5 = this;
                    int r0 = r5.ordinal()
                    java.lang.String r1 = "FragmentManager"
                    r2 = 2
                    if (r0 == 0) goto L76
                    r3 = 1
                    java.lang.String r4 = "SpecialEffectsController: Setting view "
                    if (r0 == r3) goto L54
                    if (r0 == r2) goto L34
                    r3 = 3
                    if (r0 == r3) goto L15
                    goto La3
                L15:
                    boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
                    if (r0 == 0) goto L32
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r4)
                    r0.append(r6)
                    java.lang.String r2 = " to INVISIBLE"
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r1, r0)
                L32:
                    r0 = 4
                    goto L72
                L34:
                    boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
                    if (r0 == 0) goto L51
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r4)
                    r0.append(r6)
                    java.lang.String r2 = " to GONE"
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r1, r0)
                L51:
                    r0 = 8
                    goto L72
                L54:
                    boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
                    if (r0 == 0) goto L71
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r4)
                    r0.append(r6)
                    java.lang.String r2 = " to VISIBLE"
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r1, r0)
                L71:
                    r0 = 0
                L72:
                    r6.setVisibility(r0)
                    goto La3
                L76:
                    android.view.ViewParent r0 = r6.getParent()
                    android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                    if (r0 == 0) goto La3
                    boolean r2 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
                    if (r2 == 0) goto La0
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "SpecialEffectsController: Removing view "
                    r2.append(r3)
                    r2.append(r6)
                    java.lang.String r3 = " from container "
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r2 = r2.toString()
                    android.util.Log.v(r1, r2)
                La0:
                    r0.removeView(r6)
                La3:
                    return
            }
        }

        public d(androidx.fragment.app.AbstractC0370b1.d.c r2, androidx.fragment.app.AbstractC0370b1.d.b r3, androidx.fragment.app.ComponentCallbacksC0395n r4, p158j0.C3380b r5) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f2069d = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.f2070e = r0
                r0 = 0
                r1.f2071f = r0
                r1.f2072g = r0
                r1.f2066a = r2
                r1.f2067b = r3
                r1.f2068c = r4
                androidx.fragment.app.b1$d$a r2 = new androidx.fragment.app.b1$d$a
                r2.<init>(r1)
                r5.m7756b(r2)
                return
        }

        /* renamed from: a */
        public final void m1104a() {
                r2 = this;
                boolean r0 = r2.f2071f
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.f2071f = r0
                java.util.HashSet<j0.b> r0 = r2.f2070e
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L14
                r2.mo1102b()
                goto L2f
            L14:
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.HashSet<j0.b> r1 = r2.f2070e
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L1f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r0.next()
                j0.b r1 = (p158j0.C3380b) r1
                r1.m7755a()
                goto L1f
            L2f:
                return
        }

        /* renamed from: b */
        public void mo1102b() {
                r2 = this;
                boolean r0 = r2.f2072g
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 2
                boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
                if (r0 == 0) goto L27
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SpecialEffectsController: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = " has called complete."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L27:
                r0 = 1
                r2.f2072g = r0
                java.util.List<java.lang.Runnable> r0 = r2.f2069d
                java.util.Iterator r0 = r0.iterator()
            L30:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L40
                java.lang.Object r1 = r0.next()
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r1.run()
                goto L30
            L40:
                return
        }

        /* renamed from: c */
        public final void m1105c(androidx.fragment.app.AbstractC0370b1.d.c r6, androidx.fragment.app.AbstractC0370b1.d.b r7) {
                r5 = this;
                androidx.fragment.app.b1$d$c r0 = androidx.fragment.app.AbstractC0370b1.d.c.f2078Y
                int r7 = r7.ordinal()
                java.lang.String r1 = " mFinalState = "
                java.lang.String r2 = "SpecialEffectsController: For fragment "
                java.lang.String r3 = "FragmentManager"
                r4 = 2
                if (r7 == 0) goto L7a
                r6 = 1
                if (r7 == r6) goto L48
                if (r7 == r4) goto L16
                goto Lab
            L16:
                boolean r6 = androidx.fragment.app.AbstractC0375d0.m1131O(r4)
                if (r6 == 0) goto L43
                java.lang.StringBuilder r6 = android.support.v4.media.C0144c.m256a(r2)
                androidx.fragment.app.n r7 = r5.f2068c
                r6.append(r7)
                r6.append(r1)
                androidx.fragment.app.b1$d$c r7 = r5.f2066a
                r6.append(r7)
                java.lang.String r7 = " -> REMOVED. mLifecycleImpact  = "
                r6.append(r7)
                androidx.fragment.app.b1$d$b r7 = r5.f2067b
                r6.append(r7)
                java.lang.String r7 = " to REMOVING."
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.util.Log.v(r3, r6)
            L43:
                r5.f2066a = r0
                androidx.fragment.app.b1$d$b r6 = androidx.fragment.app.AbstractC0370b1.d.b.f2076a0
                goto L77
            L48:
                androidx.fragment.app.b1$d$c r6 = r5.f2066a
                if (r6 != r0) goto Lab
                boolean r6 = androidx.fragment.app.AbstractC0375d0.m1131O(r4)
                if (r6 == 0) goto L71
                java.lang.StringBuilder r6 = android.support.v4.media.C0144c.m256a(r2)
                androidx.fragment.app.n r7 = r5.f2068c
                r6.append(r7)
                java.lang.String r7 = " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = "
                r6.append(r7)
                androidx.fragment.app.b1$d$b r7 = r5.f2067b
                r6.append(r7)
                java.lang.String r7 = " to ADDING."
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.util.Log.v(r3, r6)
            L71:
                androidx.fragment.app.b1$d$c r6 = androidx.fragment.app.AbstractC0370b1.d.c.f2079Z
                r5.f2066a = r6
                androidx.fragment.app.b1$d$b r6 = androidx.fragment.app.AbstractC0370b1.d.b.f2075Z
            L77:
                r5.f2067b = r6
                goto Lab
            L7a:
                androidx.fragment.app.b1$d$c r7 = r5.f2066a
                if (r7 == r0) goto Lab
                boolean r7 = androidx.fragment.app.AbstractC0375d0.m1131O(r4)
                if (r7 == 0) goto La9
                java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r2)
                androidx.fragment.app.n r0 = r5.f2068c
                r7.append(r0)
                r7.append(r1)
                androidx.fragment.app.b1$d$c r0 = r5.f2066a
                r7.append(r0)
                java.lang.String r0 = " -> "
                r7.append(r0)
                r7.append(r6)
                java.lang.String r0 = ". "
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                android.util.Log.v(r3, r7)
            La9:
                r5.f2066a = r6
            Lab:
                return
        }

        /* renamed from: d */
        public void mo1103d() {
                r0 = this;
                return
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.String r0 = "Operation "
                java.lang.String r1 = "{"
                java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r1)
                int r2 = java.lang.System.identityHashCode(r4)
                java.lang.String r2 = java.lang.Integer.toHexString(r2)
                r0.append(r2)
                java.lang.String r2 = "} "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r3 = "mFinalState = "
                r0.append(r3)
                androidx.fragment.app.b1$d$c r3 = r4.f2066a
                r0.append(r3)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r3 = "mLifecycleImpact = "
                r0.append(r3)
                androidx.fragment.app.b1$d$b r3 = r4.f2067b
                r0.append(r3)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "mFragment = "
                r0.append(r1)
                androidx.fragment.app.n r1 = r4.f2068c
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public AbstractC0370b1(android.view.ViewGroup r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2057b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2058c = r0
            r0 = 0
            r1.f2059d = r0
            r1.f2060e = r0
            r1.f2056a = r2
            return
    }

    /* renamed from: f */
    public static androidx.fragment.app.AbstractC0370b1 m1093f(android.view.ViewGroup r0, androidx.fragment.app.AbstractC0375d0 r1) {
            androidx.fragment.app.c1 r1 = r1.m1144M()
            androidx.fragment.app.b1 r0 = m1094g(r0, r1)
            return r0
    }

    /* renamed from: g */
    public static androidx.fragment.app.AbstractC0370b1 m1094g(android.view.ViewGroup r3, androidx.fragment.app.InterfaceC0373c1 r4) {
            r0 = 2131362607(0x7f0a032f, float:1.8345E38)
            java.lang.Object r1 = r3.getTag(r0)
            boolean r2 = r1 instanceof androidx.fragment.app.AbstractC0370b1
            if (r2 == 0) goto Le
            androidx.fragment.app.b1 r1 = (androidx.fragment.app.AbstractC0370b1) r1
            return r1
        Le:
            androidx.fragment.app.d0$f r4 = (androidx.fragment.app.AbstractC0375d0.f) r4
            java.util.Objects.requireNonNull(r4)
            androidx.fragment.app.c r4 = new androidx.fragment.app.c
            r4.<init>(r3)
            r3.setTag(r0, r4)
            return r4
    }

    /* renamed from: a */
    public final void m1095a(androidx.fragment.app.AbstractC0370b1.d.c r4, androidx.fragment.app.AbstractC0370b1.d.b r5, androidx.fragment.app.C0388j0 r6) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.b1$d> r0 = r3.f2057b
            monitor-enter(r0)
            j0.b r1 = new j0.b     // Catch: java.lang.Throwable -> L35
            r1.<init>()     // Catch: java.lang.Throwable -> L35
            androidx.fragment.app.n r2 = r6.f2202c     // Catch: java.lang.Throwable -> L35
            androidx.fragment.app.b1$d r2 = r3.m1098d(r2)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L15
            r2.m1105c(r4, r5)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return
        L15:
            androidx.fragment.app.b1$c r2 = new androidx.fragment.app.b1$c     // Catch: java.lang.Throwable -> L35
            r2.<init>(r4, r5, r6, r1)     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList<androidx.fragment.app.b1$d> r4 = r3.f2057b     // Catch: java.lang.Throwable -> L35
            r4.add(r2)     // Catch: java.lang.Throwable -> L35
            androidx.fragment.app.b1$a r4 = new androidx.fragment.app.b1$a     // Catch: java.lang.Throwable -> L35
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L35
            java.util.List<java.lang.Runnable> r5 = r2.f2069d     // Catch: java.lang.Throwable -> L35
            r5.add(r4)     // Catch: java.lang.Throwable -> L35
            androidx.fragment.app.b1$b r4 = new androidx.fragment.app.b1$b     // Catch: java.lang.Throwable -> L35
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L35
            java.util.List<java.lang.Runnable> r5 = r2.f2069d     // Catch: java.lang.Throwable -> L35
            r5.add(r4)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r4
    }

    /* renamed from: b */
    public abstract void mo1096b(java.util.List<androidx.fragment.app.AbstractC0370b1.d> r1, boolean r2);

    /* renamed from: c */
    public void m1097c() {
            r7 = this;
            boolean r0 = r7.f2060e
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r7.f2056a
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10587b(r0)
            r1 = 0
            if (r0 != 0) goto L16
            r7.m1099e()
            r7.f2059d = r1
            return
        L16:
            java.util.ArrayList<androidx.fragment.app.b1$d> r0 = r7.f2057b
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.b1$d> r2 = r7.f2057b     // Catch: java.lang.Throwable -> L98
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L96
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList<androidx.fragment.app.b1$d> r3 = r7.f2058c     // Catch: java.lang.Throwable -> L98
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList<androidx.fragment.app.b1$d> r3 = r7.f2058c     // Catch: java.lang.Throwable -> L98
            r3.clear()     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L98
        L31:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L67
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L98
            androidx.fragment.app.b1$d r3 = (androidx.fragment.app.AbstractC0370b1.d) r3     // Catch: java.lang.Throwable -> L98
            r4 = 2
            boolean r4 = androidx.fragment.app.AbstractC0375d0.m1131O(r4)     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L5a
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r5.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "SpecialEffectsController: Cancelling operation "
            r5.append(r6)     // Catch: java.lang.Throwable -> L98
            r5.append(r3)     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L98
            android.util.Log.v(r4, r5)     // Catch: java.lang.Throwable -> L98
        L5a:
            r3.m1104a()     // Catch: java.lang.Throwable -> L98
            boolean r4 = r3.f2072g     // Catch: java.lang.Throwable -> L98
            if (r4 != 0) goto L31
            java.util.ArrayList<androidx.fragment.app.b1$d> r4 = r7.f2058c     // Catch: java.lang.Throwable -> L98
            r4.add(r3)     // Catch: java.lang.Throwable -> L98
            goto L31
        L67:
            r7.m1101i()     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList<androidx.fragment.app.b1$d> r3 = r7.f2057b     // Catch: java.lang.Throwable -> L98
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList<androidx.fragment.app.b1$d> r3 = r7.f2057b     // Catch: java.lang.Throwable -> L98
            r3.clear()     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList<androidx.fragment.app.b1$d> r3 = r7.f2058c     // Catch: java.lang.Throwable -> L98
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L98
        L7f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L8f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L98
            androidx.fragment.app.b1$d r4 = (androidx.fragment.app.AbstractC0370b1.d) r4     // Catch: java.lang.Throwable -> L98
            r4.mo1103d()     // Catch: java.lang.Throwable -> L98
            goto L7f
        L8f:
            boolean r3 = r7.f2059d     // Catch: java.lang.Throwable -> L98
            r7.mo1096b(r2, r3)     // Catch: java.lang.Throwable -> L98
            r7.f2059d = r1     // Catch: java.lang.Throwable -> L98
        L96:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
            return
        L98:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
            throw r1
    }

    /* renamed from: d */
    public final androidx.fragment.app.AbstractC0370b1.d m1098d(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.b1$d> r0 = r3.f2057b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b1$d r1 = (androidx.fragment.app.AbstractC0370b1.d) r1
            androidx.fragment.app.n r2 = r1.f2068c
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            boolean r2 = r1.f2071f
            if (r2 != 0) goto L6
            return r1
        L1f:
            r4 = 0
            return r4
    }

    /* renamed from: e */
    public void m1099e() {
            r9 = this;
            android.view.ViewGroup r0 = r9.f2056a
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10587b(r0)
            java.util.ArrayList<androidx.fragment.app.b1$d> r1 = r9.f2057b
            monitor-enter(r1)
            r9.m1101i()     // Catch: java.lang.Throwable -> Ldf
            java.util.ArrayList<androidx.fragment.app.b1$d> r2 = r9.f2057b     // Catch: java.lang.Throwable -> Ldf
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ldf
        L14:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Ldf
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Ldf
            androidx.fragment.app.b1$d r3 = (androidx.fragment.app.AbstractC0370b1.d) r3     // Catch: java.lang.Throwable -> Ldf
            r3.mo1103d()     // Catch: java.lang.Throwable -> Ldf
            goto L14
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldf
            java.util.ArrayList<androidx.fragment.app.b1$d> r3 = r9.f2058c     // Catch: java.lang.Throwable -> Ldf
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ldf
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ldf
        L2f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Ldf
            r4 = 2
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Ldf
            androidx.fragment.app.b1$d r3 = (androidx.fragment.app.AbstractC0370b1.d) r3     // Catch: java.lang.Throwable -> Ldf
            boolean r4 = androidx.fragment.app.AbstractC0375d0.m1131O(r4)     // Catch: java.lang.Throwable -> Ldf
            if (r4 == 0) goto L7d
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldf
            r5.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r6 = "SpecialEffectsController: "
            r5.append(r6)     // Catch: java.lang.Throwable -> Ldf
            if (r0 == 0) goto L53
            java.lang.String r6 = ""
            goto L6b
        L53:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldf
            r6.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r7 = "Container "
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldf
            android.view.ViewGroup r7 = r9.f2056a     // Catch: java.lang.Throwable -> Ldf
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r7 = " is not attached to window. "
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ldf
        L6b:
            r5.append(r6)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r6 = "Cancelling running operation "
            r5.append(r6)     // Catch: java.lang.Throwable -> Ldf
            r5.append(r3)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Ldf
            android.util.Log.v(r4, r5)     // Catch: java.lang.Throwable -> Ldf
        L7d:
            r3.m1104a()     // Catch: java.lang.Throwable -> Ldf
            goto L2f
        L81:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldf
            java.util.ArrayList<androidx.fragment.app.b1$d> r3 = r9.f2057b     // Catch: java.lang.Throwable -> Ldf
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ldf
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ldf
        L8c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Ldf
            if (r3 == 0) goto Ldd
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Ldf
            androidx.fragment.app.b1$d r3 = (androidx.fragment.app.AbstractC0370b1.d) r3     // Catch: java.lang.Throwable -> Ldf
            boolean r5 = androidx.fragment.app.AbstractC0375d0.m1131O(r4)     // Catch: java.lang.Throwable -> Ldf
            if (r5 == 0) goto Ld9
            java.lang.String r5 = "FragmentManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldf
            r6.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r7 = "SpecialEffectsController: "
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldf
            if (r0 == 0) goto Laf
            java.lang.String r7 = ""
            goto Lc7
        Laf:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldf
            r7.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r8 = "Container "
            r7.append(r8)     // Catch: java.lang.Throwable -> Ldf
            android.view.ViewGroup r8 = r9.f2056a     // Catch: java.lang.Throwable -> Ldf
            r7.append(r8)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r8 = " is not attached to window. "
            r7.append(r8)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Ldf
        Lc7:
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r7 = "Cancelling pending operation "
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldf
            r6.append(r3)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ldf
            android.util.Log.v(r5, r6)     // Catch: java.lang.Throwable -> Ldf
        Ld9:
            r3.m1104a()     // Catch: java.lang.Throwable -> Ldf
            goto L8c
        Ldd:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ldf
            return
        Ldf:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ldf
            throw r0
    }

    /* renamed from: h */
    public void m1100h() {
            r6 = this;
            java.util.ArrayList<androidx.fragment.app.b1$d> r0 = r6.f2057b
            monitor-enter(r0)
            r6.m1101i()     // Catch: java.lang.Throwable -> L39
            r1 = 0
            r6.f2060e = r1     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList<androidx.fragment.app.b1$d> r1 = r6.f2057b     // Catch: java.lang.Throwable -> L39
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L39
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L37
            java.util.ArrayList<androidx.fragment.app.b1$d> r2 = r6.f2057b     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L39
            androidx.fragment.app.b1$d r2 = (androidx.fragment.app.AbstractC0370b1.d) r2     // Catch: java.lang.Throwable -> L39
            androidx.fragment.app.n r3 = r2.f2068c     // Catch: java.lang.Throwable -> L39
            android.view.View r3 = r3.f2260C0     // Catch: java.lang.Throwable -> L39
            androidx.fragment.app.b1$d$c r3 = androidx.fragment.app.AbstractC0370b1.d.c.m1108h(r3)     // Catch: java.lang.Throwable -> L39
            androidx.fragment.app.b1$d$c r4 = r2.f2066a     // Catch: java.lang.Throwable -> L39
            androidx.fragment.app.b1$d$c r5 = androidx.fragment.app.AbstractC0370b1.d.c.f2079Z     // Catch: java.lang.Throwable -> L39
            if (r4 != r5) goto L34
            if (r3 == r5) goto L34
            androidx.fragment.app.n r1 = r2.f2068c     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.m1313Q()     // Catch: java.lang.Throwable -> L39
            r6.f2060e = r1     // Catch: java.lang.Throwable -> L39
            goto L37
        L34:
            int r1 = r1 + (-1)
            goto L11
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
    }

    /* renamed from: i */
    public final void m1101i() {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.b1$d> r0 = r4.f2057b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b1$d r1 = (androidx.fragment.app.AbstractC0370b1.d) r1
            androidx.fragment.app.b1$d$b r2 = r1.f2067b
            androidx.fragment.app.b1$d$b r3 = androidx.fragment.app.AbstractC0370b1.d.b.f2075Z
            if (r2 != r3) goto L6
            androidx.fragment.app.n r2 = r1.f2068c
            android.view.View r2 = r2.m1336t0()
            int r2 = r2.getVisibility()
            androidx.fragment.app.b1$d$c r2 = androidx.fragment.app.AbstractC0370b1.d.c.m1107g(r2)
            androidx.fragment.app.b1$d$b r3 = androidx.fragment.app.AbstractC0370b1.d.b.f2074Y
            r1.m1105c(r2, r3)
            goto L6
        L2c:
            return
    }
}
