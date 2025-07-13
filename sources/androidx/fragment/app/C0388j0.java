package androidx.fragment.app;

/* renamed from: androidx.fragment.app.j0 */
/* loaded from: classes.dex */
public class C0388j0 {

    /* renamed from: a */
    public final androidx.fragment.app.C0372c0 f2200a;

    /* renamed from: b */
    public final androidx.fragment.app.C0392l0 f2201b;

    /* renamed from: c */
    public final androidx.fragment.app.ComponentCallbacksC0395n f2202c;

    /* renamed from: d */
    public boolean f2203d;

    /* renamed from: e */
    public int f2204e;

    /* renamed from: androidx.fragment.app.j0$a */
    public class a implements android.view.View.OnAttachStateChangeListener {

        /* renamed from: Y */
        public final /* synthetic */ android.view.View f2205Y;

        public a(androidx.fragment.app.C0388j0 r1, android.view.View r2) {
                r0 = this;
                r0.f2205Y = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r2) {
                r1 = this;
                android.view.View r2 = r1.f2205Y
                r2.removeOnAttachStateChangeListener(r1)
                android.view.View r2 = r1.f2205Y
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                p227n0.C4661t.g.m10595c(r2)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }
    }

    public C0388j0(androidx.fragment.app.C0372c0 r2, androidx.fragment.app.C0392l0 r3, androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2203d = r0
            r0 = -1
            r1.f2204e = r0
            r1.f2200a = r2
            r1.f2201b = r3
            r1.f2202c = r4
            return
    }

    public C0388j0(androidx.fragment.app.C0372c0 r3, androidx.fragment.app.C0392l0 r4, androidx.fragment.app.ComponentCallbacksC0395n r5, androidx.fragment.app.C0386i0 r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f2203d = r0
            r1 = -1
            r2.f2204e = r1
            r2.f2200a = r3
            r2.f2201b = r4
            r2.f2202c = r5
            r3 = 0
            r5.f2279a0 = r3
            r5.f2280b0 = r3
            r5.f2293o0 = r0
            r5.f2290l0 = r0
            r5.f2287i0 = r0
            androidx.fragment.app.n r4 = r5.f2283e0
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.f2281c0
            goto L22
        L21:
            r4 = r3
        L22:
            r5.f2284f0 = r4
            r5.f2283e0 = r3
            android.os.Bundle r3 = r6.f2198k0
            if (r3 == 0) goto L2b
            goto L30
        L2b:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L30:
            r5.f2278Z = r3
            return
    }

    public C0388j0(androidx.fragment.app.C0372c0 r2, androidx.fragment.app.C0392l0 r3, java.lang.ClassLoader r4, androidx.fragment.app.C0419z r5, androidx.fragment.app.C0386i0 r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2203d = r0
            r0 = -1
            r1.f2204e = r0
            r1.f2200a = r2
            r1.f2201b = r3
            java.lang.String r2 = r6.f2186Y
            androidx.fragment.app.n r2 = r5.mo1196a(r4, r2)
            r1.f2202c = r2
            android.os.Bundle r3 = r6.f2195h0
            if (r3 == 0) goto L1c
            r3.setClassLoader(r4)
        L1c:
            android.os.Bundle r3 = r6.f2195h0
            r2.m1344x0(r3)
            java.lang.String r3 = r6.f2187Z
            r2.f2281c0 = r3
            boolean r3 = r6.f2188a0
            r2.f2289k0 = r3
            r3 = 1
            r2.f2291m0 = r3
            int r3 = r6.f2189b0
            r2.f2298t0 = r3
            int r3 = r6.f2190c0
            r2.f2299u0 = r3
            java.lang.String r3 = r6.f2191d0
            r2.f2300v0 = r3
            boolean r3 = r6.f2192e0
            r2.f2303y0 = r3
            boolean r3 = r6.f2193f0
            r2.f2288j0 = r3
            boolean r3 = r6.f2194g0
            r2.f2302x0 = r3
            boolean r3 = r6.f2196i0
            r2.f2301w0 = r3
            androidx.lifecycle.o$c[] r3 = androidx.lifecycle.AbstractC0458o.c.values()
            int r4 = r6.f2197j0
            r3 = r3[r4]
            r2.f2268K0 = r3
            android.os.Bundle r3 = r6.f2198k0
            if (r3 == 0) goto L57
            goto L5c
        L57:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L5c:
            r2.f2278Z = r3
            r3 = 2
            boolean r3 = androidx.fragment.app.AbstractC0375d0.m1131O(r3)
            if (r3 == 0) goto L7b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Instantiated fragment "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L7b:
            return
    }

    /* renamed from: a */
    public void m1204a() {
            r6 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1b
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            androidx.fragment.app.n r3 = r6.f2202c
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1b:
            androidx.fragment.app.n r1 = r6.f2202c
            android.os.Bundle r3 = r1.f2278Z
            androidx.fragment.app.d0 r3 = r1.f2296r0
            r3.m1152V()
            r1.f2277Y = r0
            r3 = 0
            r1.f2258A0 = r3
            r4 = 1
            r1.f2258A0 = r4
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "moveto RESTORE_VIEW_STATE: "
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L46:
            android.view.View r0 = r1.f2260C0
            r2 = 0
            if (r0 == 0) goto L88
            android.os.Bundle r4 = r1.f2278Z
            android.util.SparseArray<android.os.Parcelable> r5 = r1.f2279a0
            if (r5 == 0) goto L56
            r0.restoreHierarchyState(r5)
            r1.f2279a0 = r2
        L56:
            android.view.View r0 = r1.f2260C0
            if (r0 == 0) goto L65
            androidx.fragment.app.y0 r0 = r1.f2270M0
            android.os.Bundle r5 = r1.f2280b0
            androidx.savedstate.b r0 = r0.f2423a0
            r0.m2156a(r5)
            r1.f2280b0 = r2
        L65:
            r1.f2258A0 = r3
            r1.mo1237j0(r4)
            boolean r0 = r1.f2258A0
            if (r0 == 0) goto L7a
            android.view.View r0 = r1.f2260C0
            if (r0 == 0) goto L88
            androidx.fragment.app.y0 r0 = r1.f2270M0
            androidx.lifecycle.o$b r4 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE
            r0.m1400a(r4)
            goto L88
        L7a:
            androidx.fragment.app.d1 r0 = new androidx.fragment.app.d1
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onViewStateRestored()"
            java.lang.String r1 = androidx.fragment.app.C0393m.m1291a(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L88:
            r1.f2278Z = r2
            androidx.fragment.app.d0 r0 = r1.f2296r0
            r0.f2103C = r3
            r0.f2104D = r3
            androidx.fragment.app.g0 r1 = r0.f2111K
            r1.f2178h = r3
            r1 = 4
            r0.m1190w(r1)
            androidx.fragment.app.c0 r0 = r6.f2200a
            androidx.fragment.app.n r1 = r6.f2202c
            android.os.Bundle r2 = r1.f2278Z
            r0.m1117a(r1, r2, r3)
            return
    }

    /* renamed from: b */
    public void m1205b() {
            r7 = this;
            androidx.fragment.app.l0 r0 = r7.f2201b
            androidx.fragment.app.n r1 = r7.f2202c
            java.util.Objects.requireNonNull(r0)
            android.view.ViewGroup r2 = r1.f2259B0
            r3 = -1
            if (r2 != 0) goto Ld
            goto L57
        Ld:
            java.util.ArrayList<androidx.fragment.app.n> r4 = r0.f2230Z
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r1 = r4.indexOf(r1)
            int r4 = r1 + (-1)
        L17:
            if (r4 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.n> r5 = r0.f2230Z
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.n r5 = (androidx.fragment.app.ComponentCallbacksC0395n) r5
            android.view.ViewGroup r6 = r5.f2259B0
            if (r6 != r2) goto L32
            android.view.View r5 = r5.f2260C0
            if (r5 == 0) goto L32
            int r0 = r2.indexOfChild(r5)
            int r3 = r0 + 1
            goto L57
        L32:
            int r4 = r4 + (-1)
            goto L17
        L35:
            int r1 = r1 + 1
            java.util.ArrayList<androidx.fragment.app.n> r4 = r0.f2230Z
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r1 >= r4) goto L57
            java.util.ArrayList<androidx.fragment.app.n> r4 = r0.f2230Z
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r1)
            androidx.fragment.app.n r4 = (androidx.fragment.app.ComponentCallbacksC0395n) r4
            android.view.ViewGroup r5 = r4.f2259B0
            if (r5 != r2) goto L35
            android.view.View r4 = r4.f2260C0
            if (r4 == 0) goto L35
            int r3 = r2.indexOfChild(r4)
        L57:
            androidx.fragment.app.n r0 = r7.f2202c
            android.view.ViewGroup r1 = r0.f2259B0
            android.view.View r0 = r0.f2260C0
            r1.addView(r0, r3)
            return
    }

    /* renamed from: c */
    public void m1206c() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto ATTACHED: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r1 = r6.f2202c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.n r0 = r6.f2202c
            androidx.fragment.app.n r1 = r0.f2283e0
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r3 = " declared target fragment "
            r4 = 0
            java.lang.String r5 = "Fragment "
            if (r1 == 0) goto L5e
            androidx.fragment.app.l0 r0 = r6.f2201b
            java.lang.String r1 = r1.f2281c0
            androidx.fragment.app.j0 r0 = r0.m1290z(r1)
            if (r0 == 0) goto L3e
            androidx.fragment.app.n r1 = r6.f2202c
            androidx.fragment.app.n r2 = r1.f2283e0
            java.lang.String r2 = r2.f2281c0
            r1.f2284f0 = r2
            r1.f2283e0 = r4
            r4 = r0
            goto L85
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r5)
            androidx.fragment.app.n r4 = r6.f2202c
            r1.append(r4)
            r1.append(r3)
            androidx.fragment.app.n r3 = r6.f2202c
            androidx.fragment.app.n r3 = r3.f2283e0
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            java.lang.String r0 = r0.f2284f0
            if (r0 == 0) goto L85
            androidx.fragment.app.l0 r1 = r6.f2201b
            androidx.fragment.app.j0 r4 = r1.m1290z(r0)
            if (r4 == 0) goto L6b
            goto L85
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r5)
            androidx.fragment.app.n r4 = r6.f2202c
            r1.append(r4)
            r1.append(r3)
            androidx.fragment.app.n r3 = r6.f2202c
            java.lang.String r3 = r3.f2284f0
            java.lang.String r1 = p346u.C6269n.m12888a(r1, r3, r2)
            r0.<init>(r1)
            throw r0
        L85:
            if (r4 == 0) goto L8a
            r4.m1214k()
        L8a:
            androidx.fragment.app.n r0 = r6.f2202c
            androidx.fragment.app.d0 r1 = r0.f2294p0
            androidx.fragment.app.a0<?> r2 = r1.f2130r
            r0.f2295q0 = r2
            androidx.fragment.app.n r1 = r1.f2132t
            r0.f2297s0 = r1
            androidx.fragment.app.c0 r1 = r6.f2200a
            r2 = 0
            r1.m1123g(r0, r2)
            androidx.fragment.app.n r0 = r6.f2202c
            java.util.ArrayList<androidx.fragment.app.n$f> r1 = r0.f2276S0
            java.util.Iterator r1 = r1.iterator()
        La4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb4
            java.lang.Object r3 = r1.next()
            androidx.fragment.app.n$f r3 = (androidx.fragment.app.ComponentCallbacksC0395n.f) r3
            r3.mo1349a()
            goto La4
        Lb4:
            java.util.ArrayList<androidx.fragment.app.n$f> r1 = r0.f2276S0
            r1.clear()
            androidx.fragment.app.d0 r1 = r0.f2296r0
            androidx.fragment.app.a0<?> r3 = r0.f2295q0
            androidx.fragment.app.x r4 = r0.mo1239p()
            r1.m1159b(r3, r4, r0)
            r0.f2277Y = r2
            r0.f2258A0 = r2
            androidx.fragment.app.a0<?> r1 = r0.f2295q0
            android.content.Context r1 = r1.f2034Z
            r0.mo1230T(r1)
            boolean r1 = r0.f2258A0
            if (r1 == 0) goto L100
            androidx.fragment.app.d0 r1 = r0.f2294p0
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.h0> r3 = r1.f2128p
            java.util.Iterator r3 = r3.iterator()
        Ldb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Leb
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.h0 r4 = (androidx.fragment.app.InterfaceC0384h0) r4
            r4.mo1197a(r1, r0)
            goto Ldb
        Leb:
            androidx.fragment.app.d0 r0 = r0.f2296r0
            r0.f2103C = r2
            r0.f2104D = r2
            androidx.fragment.app.g0 r1 = r0.f2111K
            r1.f2178h = r2
            r0.m1190w(r2)
            androidx.fragment.app.c0 r0 = r6.f2200a
            androidx.fragment.app.n r1 = r6.f2202c
            r0.m1118b(r1, r2)
            return
        L100:
            androidx.fragment.app.d1 r1 = new androidx.fragment.app.d1
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.String r0 = androidx.fragment.app.C0393m.m1291a(r5, r0, r2)
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: d */
    public int m1207d() {
            r12 = this;
            androidx.fragment.app.n r0 = r12.f2202c
            androidx.fragment.app.d0 r1 = r0.f2294p0
            if (r1 != 0) goto L9
            int r0 = r0.f2277Y
            return r0
        L9:
            int r1 = r12.f2204e
            androidx.lifecycle.o$c r0 = r0.f2268K0
            int r0 = r0.ordinal()
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L2e
            if (r0 == r6) goto L29
            if (r0 == r4) goto L24
            if (r0 == r5) goto L33
            int r1 = java.lang.Math.min(r1, r2)
            goto L33
        L24:
            int r1 = java.lang.Math.min(r1, r3)
            goto L33
        L29:
            int r1 = java.lang.Math.min(r1, r7)
            goto L33
        L2e:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
        L33:
            androidx.fragment.app.n r0 = r12.f2202c
            boolean r8 = r0.f2289k0
            if (r8 == 0) goto L63
            boolean r8 = r0.f2290l0
            if (r8 == 0) goto L54
            int r0 = r12.f2204e
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.n r0 = r12.f2202c
            android.view.View r0 = r0.f2260C0
            if (r0 == 0) goto L63
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L63
            int r1 = java.lang.Math.min(r1, r6)
            goto L63
        L54:
            int r8 = r12.f2204e
            if (r8 >= r5) goto L5f
            int r0 = r0.f2277Y
            int r1 = java.lang.Math.min(r1, r0)
            goto L63
        L5f:
            int r1 = java.lang.Math.min(r1, r7)
        L63:
            androidx.fragment.app.n r0 = r12.f2202c
            boolean r0 = r0.f2287i0
            if (r0 != 0) goto L6d
            int r1 = java.lang.Math.min(r1, r7)
        L6d:
            androidx.fragment.app.n r0 = r12.f2202c
            android.view.ViewGroup r8 = r0.f2259B0
            r9 = 0
            if (r8 == 0) goto Lb6
            androidx.fragment.app.d0 r0 = r0.m1300D()
            androidx.fragment.app.c1 r0 = r0.m1144M()
            androidx.fragment.app.b1 r0 = androidx.fragment.app.AbstractC0370b1.m1094g(r8, r0)
            java.util.Objects.requireNonNull(r0)
            androidx.fragment.app.n r8 = r12.f2202c
            androidx.fragment.app.b1$d r8 = r0.m1098d(r8)
            if (r8 == 0) goto L8f
            androidx.fragment.app.b1$d$b r0 = r8.f2067b
        L8d:
            r9 = r0
            goto Lb6
        L8f:
            androidx.fragment.app.n r8 = r12.f2202c
            java.util.ArrayList<androidx.fragment.app.b1$d> r0 = r0.f2058c
            java.util.Iterator r0 = r0.iterator()
        L97:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto Lb0
            java.lang.Object r10 = r0.next()
            androidx.fragment.app.b1$d r10 = (androidx.fragment.app.AbstractC0370b1.d) r10
            androidx.fragment.app.n r11 = r10.f2068c
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L97
            boolean r11 = r10.f2071f
            if (r11 != 0) goto L97
            goto Lb1
        Lb0:
            r10 = r9
        Lb1:
            if (r10 == 0) goto Lb6
            androidx.fragment.app.b1$d$b r0 = r10.f2067b
            goto L8d
        Lb6:
            androidx.fragment.app.b1$d$b r0 = androidx.fragment.app.AbstractC0370b1.d.b.f2075Z
            if (r9 != r0) goto Lc0
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto Lde
        Lc0:
            androidx.fragment.app.b1$d$b r0 = androidx.fragment.app.AbstractC0370b1.d.b.f2076a0
            if (r9 != r0) goto Lc9
            int r1 = java.lang.Math.max(r1, r4)
            goto Lde
        Lc9:
            androidx.fragment.app.n r0 = r12.f2202c
            boolean r4 = r0.f2288j0
            if (r4 == 0) goto Lde
            boolean r0 = r0.m1312P()
            if (r0 == 0) goto Lda
            int r1 = java.lang.Math.min(r1, r7)
            goto Lde
        Lda:
            int r1 = java.lang.Math.min(r1, r2)
        Lde:
            androidx.fragment.app.n r0 = r12.f2202c
            boolean r2 = r0.f2261D0
            if (r2 == 0) goto Lec
            int r0 = r0.f2277Y
            if (r0 >= r3) goto Lec
            int r1 = java.lang.Math.min(r1, r5)
        Lec:
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r6)
            if (r0 == 0) goto L108
            java.lang.String r0 = "computeExpectedState() of "
            java.lang.String r2 = " for "
            java.lang.StringBuilder r0 = androidx.appcompat.widget.C0300r0.m777a(r0, r1, r2)
            androidx.fragment.app.n r2 = r12.f2202c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        L108:
            return r1
    }

    /* renamed from: e */
    public void m1208e() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto CREATED: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r1 = r6.f2202c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.n r0 = r6.f2202c
            boolean r1 = r0.f2267J0
            r2 = 1
            if (r1 != 0) goto L6e
            androidx.fragment.app.c0 r1 = r6.f2200a
            android.os.Bundle r3 = r0.f2278Z
            r4 = 0
            r1.m1124h(r0, r3, r4)
            androidx.fragment.app.n r0 = r6.f2202c
            android.os.Bundle r1 = r0.f2278Z
            androidx.fragment.app.d0 r3 = r0.f2296r0
            r3.m1152V()
            r0.f2277Y = r2
            r0.f2258A0 = r4
            androidx.lifecycle.w r3 = r0.f2269L0
            androidx.fragment.app.Fragment$5 r5 = new androidx.fragment.app.Fragment$5
            r5.<init>(r0)
            r3.mo1454a(r5)
            androidx.savedstate.b r3 = r0.f2273P0
            r3.m2156a(r1)
            r0.mo114V(r1)
            r0.f2267J0 = r2
            boolean r1 = r0.f2258A0
            if (r1 == 0) goto L60
            androidx.lifecycle.w r0 = r0.f2269L0
            androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE
            r0.m1462e(r1)
            androidx.fragment.app.c0 r0 = r6.f2200a
            androidx.fragment.app.n r1 = r6.f2202c
            android.os.Bundle r2 = r1.f2278Z
            r0.m1119c(r1, r2, r4)
            goto L88
        L60:
            androidx.fragment.app.d1 r1 = new androidx.fragment.app.d1
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onCreate()"
            java.lang.String r0 = androidx.fragment.app.C0393m.m1291a(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L6e:
            android.os.Bundle r1 = r0.f2278Z
            if (r1 == 0) goto L84
            java.lang.String r3 = "android:support:fragments"
            android.os.Parcelable r1 = r1.getParcelable(r3)
            if (r1 == 0) goto L84
            androidx.fragment.app.d0 r3 = r0.f2296r0
            r3.m1160b0(r1)
            androidx.fragment.app.d0 r0 = r0.f2296r0
            r0.m1180m()
        L84:
            androidx.fragment.app.n r0 = r6.f2202c
            r0.f2277Y = r2
        L88:
            return
    }

    /* renamed from: f */
    public void m1209f() {
            r7 = this;
            androidx.fragment.app.n r0 = r7.f2202c
            boolean r0 = r0.f2289k0
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L22
            java.lang.String r0 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r2 = r7.f2202c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L22:
            androidx.fragment.app.n r0 = r7.f2202c
            android.os.Bundle r2 = r0.f2278Z
            android.view.LayoutInflater r0 = r0.m1325m0(r2)
            r2 = 0
            androidx.fragment.app.n r3 = r7.f2202c
            android.view.ViewGroup r4 = r3.f2259B0
            if (r4 == 0) goto L33
            r2 = r4
            goto La3
        L33:
            int r4 = r3.f2299u0
            if (r4 == 0) goto La3
            r2 = -1
            if (r4 == r2) goto L89
            androidx.fragment.app.d0 r2 = r3.f2294p0
            androidx.fragment.app.x r2 = r2.f2131s
            android.view.View r2 = r2.mo1240c(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto La3
            androidx.fragment.app.n r3 = r7.f2202c
            boolean r4 = r3.f2291m0
            if (r4 == 0) goto L4d
            goto La3
        L4d:
            android.content.res.Resources r0 = r3.m1305I()     // Catch: android.content.res.Resources.NotFoundException -> L5a
            androidx.fragment.app.n r1 = r7.f2202c     // Catch: android.content.res.Resources.NotFoundException -> L5a
            int r1 = r1.f2299u0     // Catch: android.content.res.Resources.NotFoundException -> L5a
            java.lang.String r0 = r0.getResourceName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L5a
            goto L5c
        L5a:
            java.lang.String r0 = "unknown"
        L5c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No view found for id 0x"
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            androidx.fragment.app.n r3 = r7.f2202c
            int r3 = r3.f2299u0
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            androidx.fragment.app.n r0 = r7.f2202c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L89:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot create fragment "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            androidx.fragment.app.n r2 = r7.f2202c
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La3:
            androidx.fragment.app.n r3 = r7.f2202c
            r3.f2259B0 = r2
            android.os.Bundle r4 = r3.f2278Z
            r3.mo1238k0(r0, r2, r4)
            androidx.fragment.app.n r0 = r7.f2202c
            android.view.View r0 = r0.f2260C0
            r3 = 2
            if (r0 == 0) goto L168
            r4 = 0
            r0.setSaveFromParentEnabled(r4)
            androidx.fragment.app.n r0 = r7.f2202c
            android.view.View r5 = r0.f2260C0
            r6 = 2131362208(0x7f0a01a0, float:1.834419E38)
            r5.setTag(r6, r0)
            if (r2 == 0) goto Lc6
            r7.m1205b()
        Lc6:
            androidx.fragment.app.n r0 = r7.f2202c
            boolean r2 = r0.f2301w0
            if (r2 == 0) goto Ld3
            android.view.View r0 = r0.f2260C0
            r2 = 8
            r0.setVisibility(r2)
        Ld3:
            androidx.fragment.app.n r0 = r7.f2202c
            android.view.View r0 = r0.f2260C0
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10587b(r0)
            if (r0 == 0) goto Le7
            androidx.fragment.app.n r0 = r7.f2202c
            android.view.View r0 = r0.f2260C0
            p227n0.C4661t.g.m10595c(r0)
            goto Lf3
        Le7:
            androidx.fragment.app.n r0 = r7.f2202c
            android.view.View r0 = r0.f2260C0
            androidx.fragment.app.j0$a r2 = new androidx.fragment.app.j0$a
            r2.<init>(r7, r0)
            r0.addOnAttachStateChangeListener(r2)
        Lf3:
            androidx.fragment.app.n r0 = r7.f2202c
            android.view.View r2 = r0.f2260C0
            android.os.Bundle r5 = r0.f2278Z
            r0.mo1323i0(r2, r5)
            androidx.fragment.app.d0 r0 = r0.f2296r0
            r0.m1190w(r3)
            androidx.fragment.app.c0 r0 = r7.f2200a
            androidx.fragment.app.n r2 = r7.f2202c
            android.view.View r5 = r2.f2260C0
            android.os.Bundle r6 = r2.f2278Z
            r0.m1129m(r2, r5, r6, r4)
            androidx.fragment.app.n r0 = r7.f2202c
            android.view.View r0 = r0.f2260C0
            int r0 = r0.getVisibility()
            androidx.fragment.app.n r2 = r7.f2202c
            android.view.View r2 = r2.f2260C0
            float r2 = r2.getAlpha()
            androidx.fragment.app.n r4 = r7.f2202c
            androidx.fragment.app.n$d r4 = r4.m1331r()
            r4.f2320n = r2
            androidx.fragment.app.n r2 = r7.f2202c
            android.view.ViewGroup r4 = r2.f2259B0
            if (r4 == 0) goto L168
            if (r0 != 0) goto L168
            android.view.View r0 = r2.f2260C0
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L160
            androidx.fragment.app.n r2 = r7.f2202c
            androidx.fragment.app.n$d r2 = r2.m1331r()
            r2.f2321o = r0
            boolean r2 = androidx.fragment.app.AbstractC0375d0.m1131O(r3)
            if (r2 == 0) goto L160
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "requestFocus: Saved focused view "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = " for Fragment "
            r2.append(r0)
            androidx.fragment.app.n r0 = r7.f2202c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r1, r0)
        L160:
            androidx.fragment.app.n r0 = r7.f2202c
            android.view.View r0 = r0.f2260C0
            r1 = 0
            r0.setAlpha(r1)
        L168:
            androidx.fragment.app.n r0 = r7.f2202c
            r0.f2277Y = r3
            return
    }

    /* renamed from: g */
    public void m1210g() {
            r7 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1b
            java.lang.String r1 = "movefrom CREATED: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            androidx.fragment.app.n r3 = r7.f2202c
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1b:
            androidx.fragment.app.n r1 = r7.f2202c
            boolean r3 = r1.f2288j0
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L2b
            boolean r1 = r1.m1312P()
            if (r1 != 0) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 != 0) goto L3f
            androidx.fragment.app.l0 r3 = r7.f2201b
            java.lang.Object r3 = r3.f2232b0
            androidx.fragment.app.g0 r3 = (androidx.fragment.app.C0382g0) r3
            androidx.fragment.app.n r6 = r7.f2202c
            boolean r3 = r3.m1203e(r6)
            if (r3 == 0) goto L3d
            goto L3f
        L3d:
            r3 = 0
            goto L40
        L3f:
            r3 = 1
        L40:
            if (r3 == 0) goto L129
            androidx.fragment.app.n r3 = r7.f2202c
            androidx.fragment.app.a0<?> r3 = r3.f2295q0
            boolean r6 = r3 instanceof androidx.lifecycle.InterfaceC0469t0
            if (r6 == 0) goto L53
            androidx.fragment.app.l0 r3 = r7.f2201b
            java.lang.Object r3 = r3.f2232b0
            androidx.fragment.app.g0 r3 = (androidx.fragment.app.C0382g0) r3
            boolean r4 = r3.f2177g
            goto L60
        L53:
            android.content.Context r3 = r3.f2034Z
            boolean r6 = r3 instanceof android.app.Activity
            if (r6 == 0) goto L60
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r3 = r3.isChangingConfigurations()
            r4 = r4 ^ r3
        L60:
            if (r1 != 0) goto L64
            if (r4 == 0) goto Lb5
        L64:
            androidx.fragment.app.l0 r1 = r7.f2201b
            java.lang.Object r1 = r1.f2232b0
            androidx.fragment.app.g0 r1 = (androidx.fragment.app.C0382g0) r1
            androidx.fragment.app.n r3 = r7.f2202c
            java.util.Objects.requireNonNull(r1)
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L89
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Clearing non-config state for "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L89:
            java.util.HashMap<java.lang.String, androidx.fragment.app.g0> r0 = r1.f2174d
            java.lang.String r2 = r3.f2281c0
            java.lang.Object r0 = r0.get(r2)
            androidx.fragment.app.g0 r0 = (androidx.fragment.app.C0382g0) r0
            if (r0 == 0) goto L9f
            r0.mo8b()
            java.util.HashMap<java.lang.String, androidx.fragment.app.g0> r0 = r1.f2174d
            java.lang.String r2 = r3.f2281c0
            r0.remove(r2)
        L9f:
            java.util.HashMap<java.lang.String, androidx.lifecycle.s0> r0 = r1.f2175e
            java.lang.String r2 = r3.f2281c0
            java.lang.Object r0 = r0.get(r2)
            androidx.lifecycle.s0 r0 = (androidx.lifecycle.C0467s0) r0
            if (r0 == 0) goto Lb5
            r0.m1458a()
            java.util.HashMap<java.lang.String, androidx.lifecycle.s0> r0 = r1.f2175e
            java.lang.String r1 = r3.f2281c0
            r0.remove(r1)
        Lb5:
            androidx.fragment.app.n r0 = r7.f2202c
            androidx.fragment.app.d0 r1 = r0.f2296r0
            r1.m1182o()
            androidx.lifecycle.w r1 = r0.f2269L0
            androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY
            r1.m1462e(r2)
            r0.f2277Y = r5
            r0.f2258A0 = r5
            r0.f2267J0 = r5
            r0.mo1318X()
            boolean r1 = r0.f2258A0
            if (r1 == 0) goto L11b
            androidx.fragment.app.c0 r0 = r7.f2200a
            androidx.fragment.app.n r1 = r7.f2202c
            r0.m1120d(r1, r5)
            androidx.fragment.app.l0 r0 = r7.f2201b
            java.util.List r0 = r0.m1287w()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Le3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L107
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.j0 r1 = (androidx.fragment.app.C0388j0) r1
            if (r1 == 0) goto Le3
            androidx.fragment.app.n r1 = r1.f2202c
            androidx.fragment.app.n r2 = r7.f2202c
            java.lang.String r2 = r2.f2281c0
            java.lang.String r3 = r1.f2284f0
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Le3
            androidx.fragment.app.n r2 = r7.f2202c
            r1.f2283e0 = r2
            r2 = 0
            r1.f2284f0 = r2
            goto Le3
        L107:
            androidx.fragment.app.n r0 = r7.f2202c
            java.lang.String r1 = r0.f2284f0
            if (r1 == 0) goto L115
            androidx.fragment.app.l0 r2 = r7.f2201b
            androidx.fragment.app.n r1 = r2.m1285u(r1)
            r0.f2283e0 = r1
        L115:
            androidx.fragment.app.l0 r0 = r7.f2201b
            r0.m1255M(r7)
            goto L143
        L11b:
            androidx.fragment.app.d1 r1 = new androidx.fragment.app.d1
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onDestroy()"
            java.lang.String r0 = androidx.fragment.app.C0393m.m1291a(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L129:
            androidx.fragment.app.n r0 = r7.f2202c
            java.lang.String r0 = r0.f2284f0
            if (r0 == 0) goto L13f
            androidx.fragment.app.l0 r1 = r7.f2201b
            androidx.fragment.app.n r0 = r1.m1285u(r0)
            if (r0 == 0) goto L13f
            boolean r1 = r0.f2303y0
            if (r1 == 0) goto L13f
            androidx.fragment.app.n r1 = r7.f2202c
            r1.f2283e0 = r0
        L13f:
            androidx.fragment.app.n r0 = r7.f2202c
            r0.f2277Y = r5
        L143:
            return
    }

    /* renamed from: h */
    public void m1211h() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "movefrom CREATE_VIEW: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r1 = r3.f2202c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.n r0 = r3.f2202c
            android.view.ViewGroup r1 = r0.f2259B0
            if (r1 == 0) goto L28
            android.view.View r0 = r0.f2260C0
            if (r0 == 0) goto L28
            r1.removeView(r0)
        L28:
            androidx.fragment.app.n r0 = r3.f2202c
            r0.m1324l0()
            androidx.fragment.app.c0 r0 = r3.f2200a
            androidx.fragment.app.n r1 = r3.f2202c
            r2 = 0
            r0.m1130n(r1, r2)
            androidx.fragment.app.n r0 = r3.f2202c
            r1 = 0
            r0.f2259B0 = r1
            r0.f2260C0 = r1
            r0.f2270M0 = r1
            androidx.lifecycle.d0<androidx.lifecycle.v> r0 = r0.f2271N0
            r0.mo7l(r1)
            androidx.fragment.app.n r0 = r3.f2202c
            r0.f2290l0 = r2
            return
    }

    /* renamed from: i */
    public void m1212i() {
            r8 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1b
            java.lang.String r1 = "movefrom ATTACHED: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            androidx.fragment.app.n r3 = r8.f2202c
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1b:
            androidx.fragment.app.n r1 = r8.f2202c
            r3 = -1
            r1.f2277Y = r3
            r4 = 0
            r1.f2258A0 = r4
            r1.mo1232Z()
            r5 = 0
            r1.f2266I0 = r5
            boolean r6 = r1.f2258A0
            if (r6 == 0) goto Lc4
            androidx.fragment.app.d0 r6 = r1.f2296r0
            boolean r7 = r6.f2105E
            if (r7 != 0) goto L3d
            r6.m1182o()
            androidx.fragment.app.e0 r6 = new androidx.fragment.app.e0
            r6.<init>()
            r1.f2296r0 = r6
        L3d:
            androidx.fragment.app.c0 r1 = r8.f2200a
            androidx.fragment.app.n r6 = r8.f2202c
            r1.m1121e(r6, r4)
            androidx.fragment.app.n r1 = r8.f2202c
            r1.f2277Y = r3
            r1.f2295q0 = r5
            r1.f2297s0 = r5
            r1.f2294p0 = r5
            boolean r3 = r1.f2288j0
            if (r3 == 0) goto L5a
            boolean r1 = r1.m1312P()
            if (r1 != 0) goto L5a
            r1 = 1
            goto L5b
        L5a:
            r1 = 0
        L5b:
            if (r1 != 0) goto L6b
            androidx.fragment.app.l0 r1 = r8.f2201b
            java.lang.Object r1 = r1.f2232b0
            androidx.fragment.app.g0 r1 = (androidx.fragment.app.C0382g0) r1
            androidx.fragment.app.n r3 = r8.f2202c
            boolean r1 = r1.m1203e(r3)
            if (r1 == 0) goto Lc3
        L6b:
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L83
            java.lang.String r0 = "initState called for fragment: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r1 = r8.f2202c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L83:
            androidx.fragment.app.n r0 = r8.f2202c
            java.util.Objects.requireNonNull(r0)
            androidx.lifecycle.w r1 = new androidx.lifecycle.w
            r1.<init>(r0)
            r0.f2269L0 = r1
            androidx.savedstate.b r1 = new androidx.savedstate.b
            r1.<init>(r0)
            r0.f2273P0 = r1
            r0.f2272O0 = r5
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.f2281c0 = r1
            r0.f2287i0 = r4
            r0.f2288j0 = r4
            r0.f2289k0 = r4
            r0.f2290l0 = r4
            r0.f2291m0 = r4
            r0.f2293o0 = r4
            r0.f2294p0 = r5
            androidx.fragment.app.e0 r1 = new androidx.fragment.app.e0
            r1.<init>()
            r0.f2296r0 = r1
            r0.f2295q0 = r5
            r0.f2298t0 = r4
            r0.f2299u0 = r4
            r0.f2300v0 = r5
            r0.f2301w0 = r4
            r0.f2302x0 = r4
        Lc3:
            return
        Lc4:
            androidx.fragment.app.d1 r0 = new androidx.fragment.app.d1
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onDetach()"
            java.lang.String r1 = androidx.fragment.app.C0393m.m1291a(r2, r1, r3)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: j */
    public void m1213j() {
            r6 = this;
            androidx.fragment.app.n r0 = r6.f2202c
            boolean r1 = r0.f2289k0
            if (r1 == 0) goto L78
            boolean r1 = r0.f2290l0
            if (r1 == 0) goto L78
            boolean r0 = r0.f2292n0
            if (r0 != 0) goto L78
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r1 = r6.f2202c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L29:
            androidx.fragment.app.n r0 = r6.f2202c
            android.os.Bundle r1 = r0.f2278Z
            android.view.LayoutInflater r1 = r0.m1325m0(r1)
            r2 = 0
            androidx.fragment.app.n r3 = r6.f2202c
            android.os.Bundle r3 = r3.f2278Z
            r0.mo1238k0(r1, r2, r3)
            androidx.fragment.app.n r0 = r6.f2202c
            android.view.View r0 = r0.f2260C0
            if (r0 == 0) goto L78
            r1 = 0
            r0.setSaveFromParentEnabled(r1)
            androidx.fragment.app.n r0 = r6.f2202c
            android.view.View r2 = r0.f2260C0
            r3 = 2131362208(0x7f0a01a0, float:1.834419E38)
            r2.setTag(r3, r0)
            androidx.fragment.app.n r0 = r6.f2202c
            boolean r2 = r0.f2301w0
            if (r2 == 0) goto L5a
            android.view.View r0 = r0.f2260C0
            r2 = 8
            r0.setVisibility(r2)
        L5a:
            androidx.fragment.app.n r0 = r6.f2202c
            android.view.View r2 = r0.f2260C0
            android.os.Bundle r3 = r0.f2278Z
            r0.mo1323i0(r2, r3)
            androidx.fragment.app.d0 r0 = r0.f2296r0
            r2 = 2
            r0.m1190w(r2)
            androidx.fragment.app.c0 r0 = r6.f2200a
            androidx.fragment.app.n r3 = r6.f2202c
            android.view.View r4 = r3.f2260C0
            android.os.Bundle r5 = r3.f2278Z
            r0.m1129m(r3, r4, r5, r1)
            androidx.fragment.app.n r0 = r6.f2202c
            r0.f2277Y = r2
        L78:
            return
    }

    /* renamed from: k */
    public void m1214k() {
            r9 = this;
            androidx.fragment.app.b1$d$b r0 = androidx.fragment.app.AbstractC0370b1.d.b.f2074Y
            boolean r1 = r9.f2203d
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            if (r1 == 0) goto L22
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r3)
            if (r0 == 0) goto L21
            java.lang.String r0 = "Ignoring re-entrant call to moveToExpectedState() for "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r1 = r9.f2202c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L21:
            return
        L22:
            r1 = 0
            r4 = 1
            r9.f2203d = r4     // Catch: java.lang.Throwable -> L1bc
        L26:
            int r5 = r9.m1207d()     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.n r6 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            int r7 = r6.f2277Y     // Catch: java.lang.Throwable -> L1bc
            if (r5 == r7) goto L13c
            if (r5 <= r7) goto La1
            int r7 = r7 + 1
            switch(r7) {
                case 0: goto L9d;
                case 1: goto L99;
                case 2: goto L92;
                case 3: goto L8e;
                case 4: goto L44;
                case 5: goto L40;
                case 6: goto L3c;
                case 7: goto L38;
                default: goto L37;
            }     // Catch: java.lang.Throwable -> L1bc
        L37:
            goto L26
        L38:
            r9.m1217n()     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L3c:
            r5 = 6
            r6.f2277Y = r5     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L40:
            r9.m1219p()     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L44:
            android.view.View r5 = r6.f2260C0     // Catch: java.lang.Throwable -> L1bc
            if (r5 == 0) goto L88
            android.view.ViewGroup r5 = r6.f2259B0     // Catch: java.lang.Throwable -> L1bc
            if (r5 == 0) goto L88
            androidx.fragment.app.d0 r6 = r6.m1300D()     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.c1 r6 = r6.m1144M()     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.b1 r5 = androidx.fragment.app.AbstractC0370b1.m1094g(r5, r6)     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.n r6 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            android.view.View r6 = r6.f2260C0     // Catch: java.lang.Throwable -> L1bc
            int r6 = r6.getVisibility()     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.b1$d$c r6 = androidx.fragment.app.AbstractC0370b1.d.c.m1107g(r6)     // Catch: java.lang.Throwable -> L1bc
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> L1bc
            boolean r7 = androidx.fragment.app.AbstractC0375d0.m1131O(r3)     // Catch: java.lang.Throwable -> L1bc
            if (r7 == 0) goto L83
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bc
            r7.<init>()     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r8 = "SpecialEffectsController: Enqueuing add operation for fragment "
            r7.append(r8)     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.n r8 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            r7.append(r8)     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1bc
            android.util.Log.v(r2, r7)     // Catch: java.lang.Throwable -> L1bc
        L83:
            androidx.fragment.app.b1$d$b r7 = androidx.fragment.app.AbstractC0370b1.d.b.f2075Z     // Catch: java.lang.Throwable -> L1bc
            r5.m1095a(r6, r7, r9)     // Catch: java.lang.Throwable -> L1bc
        L88:
            androidx.fragment.app.n r5 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            r6 = 4
            r5.f2277Y = r6     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L8e:
            r9.m1204a()     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L92:
            r9.m1213j()     // Catch: java.lang.Throwable -> L1bc
            r9.m1209f()     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L99:
            r9.m1208e()     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L9d:
            r9.m1206c()     // Catch: java.lang.Throwable -> L1bc
            goto L26
        La1:
            int r7 = r7 + (-1)
            switch(r7) {
                case -1: goto L137;
                case 0: goto L132;
                case 1: goto L129;
                case 2: goto L123;
                case 3: goto Lb7;
                case 4: goto Lb2;
                case 5: goto Lad;
                case 6: goto La8;
                default: goto La6;
            }     // Catch: java.lang.Throwable -> L1bc
        La6:
            goto L26
        La8:
            r9.m1215l()     // Catch: java.lang.Throwable -> L1bc
            goto L26
        Lad:
            r5 = 5
            r6.f2277Y = r5     // Catch: java.lang.Throwable -> L1bc
            goto L26
        Lb2:
            r9.m1220q()     // Catch: java.lang.Throwable -> L1bc
            goto L26
        Lb7:
            r5 = 3
            boolean r6 = androidx.fragment.app.AbstractC0375d0.m1131O(r5)     // Catch: java.lang.Throwable -> L1bc
            if (r6 == 0) goto Ld4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bc
            r6.<init>()     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.n r7 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            r6.append(r7)     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1bc
            android.util.Log.d(r2, r6)     // Catch: java.lang.Throwable -> L1bc
        Ld4:
            androidx.fragment.app.n r6 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            android.view.View r7 = r6.f2260C0     // Catch: java.lang.Throwable -> L1bc
            if (r7 == 0) goto Le1
            android.util.SparseArray<android.os.Parcelable> r6 = r6.f2279a0     // Catch: java.lang.Throwable -> L1bc
            if (r6 != 0) goto Le1
            r9.m1218o()     // Catch: java.lang.Throwable -> L1bc
        Le1:
            androidx.fragment.app.n r6 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            android.view.View r7 = r6.f2260C0     // Catch: java.lang.Throwable -> L1bc
            if (r7 == 0) goto L11d
            android.view.ViewGroup r7 = r6.f2259B0     // Catch: java.lang.Throwable -> L1bc
            if (r7 == 0) goto L11d
            androidx.fragment.app.d0 r6 = r6.m1300D()     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.c1 r6 = r6.m1144M()     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.b1 r6 = androidx.fragment.app.AbstractC0370b1.m1094g(r7, r6)     // Catch: java.lang.Throwable -> L1bc
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L1bc
            boolean r7 = androidx.fragment.app.AbstractC0375d0.m1131O(r3)     // Catch: java.lang.Throwable -> L1bc
            if (r7 == 0) goto L116
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bc
            r7.<init>()     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r8 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            r7.append(r8)     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.n r8 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            r7.append(r8)     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1bc
            android.util.Log.v(r2, r7)     // Catch: java.lang.Throwable -> L1bc
        L116:
            androidx.fragment.app.b1$d$c r7 = androidx.fragment.app.AbstractC0370b1.d.c.f2078Y     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.b1$d$b r8 = androidx.fragment.app.AbstractC0370b1.d.b.f2076a0     // Catch: java.lang.Throwable -> L1bc
            r6.m1095a(r7, r8, r9)     // Catch: java.lang.Throwable -> L1bc
        L11d:
            androidx.fragment.app.n r6 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            r6.f2277Y = r5     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L123:
            r6.f2290l0 = r1     // Catch: java.lang.Throwable -> L1bc
            r6.f2277Y = r3     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L129:
            r9.m1211h()     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.n r5 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            r5.f2277Y = r4     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L132:
            r9.m1210g()     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L137:
            r9.m1212i()     // Catch: java.lang.Throwable -> L1bc
            goto L26
        L13c:
            boolean r5 = r6.f2264G0     // Catch: java.lang.Throwable -> L1bc
            if (r5 == 0) goto L1b9
            android.view.View r5 = r6.f2260C0     // Catch: java.lang.Throwable -> L1bc
            if (r5 == 0) goto L1a3
            android.view.ViewGroup r5 = r6.f2259B0     // Catch: java.lang.Throwable -> L1bc
            if (r5 == 0) goto L1a3
            androidx.fragment.app.d0 r6 = r6.m1300D()     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.c1 r6 = r6.m1144M()     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.b1 r5 = androidx.fragment.app.AbstractC0370b1.m1094g(r5, r6)     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.n r6 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            boolean r6 = r6.f2301w0     // Catch: java.lang.Throwable -> L1bc
            if (r6 == 0) goto L17f
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> L1bc
            boolean r3 = androidx.fragment.app.AbstractC0375d0.m1131O(r3)     // Catch: java.lang.Throwable -> L1bc
            if (r3 == 0) goto L179
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bc
            r3.<init>()     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r6 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            r3.append(r6)     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.n r6 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            r3.append(r6)     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1bc
            android.util.Log.v(r2, r3)     // Catch: java.lang.Throwable -> L1bc
        L179:
            androidx.fragment.app.b1$d$c r2 = androidx.fragment.app.AbstractC0370b1.d.c.f2080a0     // Catch: java.lang.Throwable -> L1bc
            r5.m1095a(r2, r0, r9)     // Catch: java.lang.Throwable -> L1bc
            goto L1a3
        L17f:
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> L1bc
            boolean r3 = androidx.fragment.app.AbstractC0375d0.m1131O(r3)     // Catch: java.lang.Throwable -> L1bc
            if (r3 == 0) goto L19e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bc
            r3.<init>()     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r6 = "SpecialEffectsController: Enqueuing show operation for fragment "
            r3.append(r6)     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.n r6 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            r3.append(r6)     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1bc
            android.util.Log.v(r2, r3)     // Catch: java.lang.Throwable -> L1bc
        L19e:
            androidx.fragment.app.b1$d$c r2 = androidx.fragment.app.AbstractC0370b1.d.c.f2079Z     // Catch: java.lang.Throwable -> L1bc
            r5.m1095a(r2, r0, r9)     // Catch: java.lang.Throwable -> L1bc
        L1a3:
            androidx.fragment.app.n r0 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            androidx.fragment.app.d0 r2 = r0.f2294p0     // Catch: java.lang.Throwable -> L1bc
            if (r2 == 0) goto L1b5
            boolean r3 = r0.f2287i0     // Catch: java.lang.Throwable -> L1bc
            if (r3 == 0) goto L1b5
            boolean r0 = r2.m1146P(r0)     // Catch: java.lang.Throwable -> L1bc
            if (r0 == 0) goto L1b5
            r2.f2102B = r4     // Catch: java.lang.Throwable -> L1bc
        L1b5:
            androidx.fragment.app.n r0 = r9.f2202c     // Catch: java.lang.Throwable -> L1bc
            r0.f2264G0 = r1     // Catch: java.lang.Throwable -> L1bc
        L1b9:
            r9.f2203d = r1
            return
        L1bc:
            r0 = move-exception
            r9.f2203d = r1
            throw r0
    }

    /* renamed from: l */
    public void m1215l() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "movefrom RESUMED: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r1 = r4.f2202c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.n r0 = r4.f2202c
            androidx.fragment.app.d0 r1 = r0.f2296r0
            r2 = 5
            r1.m1190w(r2)
            android.view.View r1 = r0.f2260C0
            if (r1 == 0) goto L2e
            androidx.fragment.app.y0 r1 = r0.f2270M0
            androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_PAUSE
            r1.m1400a(r2)
        L2e:
            androidx.lifecycle.w r1 = r0.f2269L0
            androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_PAUSE
            r1.m1462e(r2)
            r1 = 6
            r0.f2277Y = r1
            r1 = 0
            r0.f2258A0 = r1
            r0.mo1320c0()
            boolean r2 = r0.f2258A0
            if (r2 == 0) goto L4a
            androidx.fragment.app.c0 r0 = r4.f2200a
            androidx.fragment.app.n r2 = r4.f2202c
            r0.m1122f(r2, r1)
            return
        L4a:
            androidx.fragment.app.d1 r1 = new androidx.fragment.app.d1
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onPause()"
            java.lang.String r0 = androidx.fragment.app.C0393m.m1291a(r2, r0, r3)
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: m */
    public void m1216m(java.lang.ClassLoader r4) {
            r3 = this;
            androidx.fragment.app.n r0 = r3.f2202c
            android.os.Bundle r0 = r0.f2278Z
            if (r0 != 0) goto L7
            return
        L7:
            r0.setClassLoader(r4)
            androidx.fragment.app.n r4 = r3.f2202c
            android.os.Bundle r0 = r4.f2278Z
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r4.f2279a0 = r0
            androidx.fragment.app.n r4 = r3.f2202c
            android.os.Bundle r0 = r4.f2278Z
            java.lang.String r1 = "android:view_registry_state"
            android.os.Bundle r0 = r0.getBundle(r1)
            r4.f2280b0 = r0
            androidx.fragment.app.n r4 = r3.f2202c
            android.os.Bundle r0 = r4.f2278Z
            java.lang.String r1 = "android:target_state"
            java.lang.String r0 = r0.getString(r1)
            r4.f2284f0 = r0
            androidx.fragment.app.n r4 = r3.f2202c
            java.lang.String r0 = r4.f2284f0
            if (r0 == 0) goto L3f
            android.os.Bundle r0 = r4.f2278Z
            r1 = 0
            java.lang.String r2 = "android:target_req_state"
            int r0 = r0.getInt(r2, r1)
            r4.f2285g0 = r0
        L3f:
            androidx.fragment.app.n r4 = r3.f2202c
            java.util.Objects.requireNonNull(r4)
            r0 = 1
            android.os.Bundle r1 = r4.f2278Z
            java.lang.String r2 = "android:user_visible_hint"
            boolean r1 = r1.getBoolean(r2, r0)
            r4.f2262E0 = r1
            androidx.fragment.app.n r4 = r3.f2202c
            boolean r1 = r4.f2262E0
            if (r1 != 0) goto L57
            r4.f2261D0 = r0
        L57:
            return
    }

    /* renamed from: n */
    public void m1217n() {
            r8 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto RESUMED: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r2 = r8.f2202c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.n r0 = r8.f2202c
            androidx.fragment.app.n$d r2 = r0.f2263F0
            r3 = 0
            if (r2 != 0) goto L24
            r2 = r3
            goto L26
        L24:
            android.view.View r2 = r2.f2321o
        L26:
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L8d
            android.view.View r0 = r0.f2260C0
            if (r2 != r0) goto L2f
            goto L3b
        L2f:
            android.view.ViewParent r0 = r2.getParent()
        L33:
            if (r0 == 0) goto L42
            androidx.fragment.app.n r6 = r8.f2202c
            android.view.View r6 = r6.f2260C0
            if (r0 != r6) goto L3d
        L3b:
            r0 = 1
            goto L43
        L3d:
            android.view.ViewParent r0 = r0.getParent()
            goto L33
        L42:
            r0 = 0
        L43:
            if (r0 == 0) goto L8d
            boolean r0 = r2.requestFocus()
            r6 = 2
            boolean r6 = androidx.fragment.app.AbstractC0375d0.m1131O(r6)
            if (r6 == 0) goto L8d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "requestFocus: Restoring focused view "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " "
            r6.append(r2)
            if (r0 == 0) goto L67
            java.lang.String r0 = "succeeded"
            goto L69
        L67:
            java.lang.String r0 = "failed"
        L69:
            r6.append(r0)
            java.lang.String r0 = " on Fragment "
            r6.append(r0)
            androidx.fragment.app.n r0 = r8.f2202c
            r6.append(r0)
            java.lang.String r0 = " resulting in focused view "
            r6.append(r0)
            androidx.fragment.app.n r0 = r8.f2202c
            android.view.View r0 = r0.f2260C0
            android.view.View r0 = r0.findFocus()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.v(r1, r0)
        L8d:
            androidx.fragment.app.n r0 = r8.f2202c
            r0.m1346y0(r3)
            androidx.fragment.app.n r0 = r8.f2202c
            androidx.fragment.app.d0 r1 = r0.f2296r0
            r1.m1152V()
            androidx.fragment.app.d0 r1 = r0.f2296r0
            r1.m1134C(r4)
            r1 = 7
            r0.f2277Y = r1
            r0.f2258A0 = r5
            r0.mo1322e0()
            boolean r2 = r0.f2258A0
            if (r2 == 0) goto Ld7
            androidx.lifecycle.w r2 = r0.f2269L0
            androidx.lifecycle.o$b r4 = androidx.lifecycle.AbstractC0458o.b.ON_RESUME
            r2.m1462e(r4)
            android.view.View r2 = r0.f2260C0
            if (r2 == 0) goto Lba
            androidx.fragment.app.y0 r2 = r0.f2270M0
            r2.m1400a(r4)
        Lba:
            androidx.fragment.app.d0 r0 = r0.f2296r0
            r0.f2103C = r5
            r0.f2104D = r5
            androidx.fragment.app.g0 r2 = r0.f2111K
            r2.f2178h = r5
            r0.m1190w(r1)
            androidx.fragment.app.c0 r0 = r8.f2200a
            androidx.fragment.app.n r1 = r8.f2202c
            r0.m1125i(r1, r5)
            androidx.fragment.app.n r0 = r8.f2202c
            r0.f2278Z = r3
            r0.f2279a0 = r3
            r0.f2280b0 = r3
            return
        Ld7:
            androidx.fragment.app.d1 r1 = new androidx.fragment.app.d1
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r0 = androidx.fragment.app.C0393m.m1291a(r2, r0, r3)
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: o */
    public void m1218o() {
            r2 = this;
            androidx.fragment.app.n r0 = r2.f2202c
            android.view.View r0 = r0.f2260C0
            if (r0 != 0) goto L7
            return
        L7:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.fragment.app.n r1 = r2.f2202c
            android.view.View r1 = r1.f2260C0
            r1.saveHierarchyState(r0)
            int r1 = r0.size()
            if (r1 <= 0) goto L1d
            androidx.fragment.app.n r1 = r2.f2202c
            r1.f2279a0 = r0
        L1d:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.n r1 = r2.f2202c
            androidx.fragment.app.y0 r1 = r1.f2270M0
            androidx.savedstate.b r1 = r1.f2423a0
            r1.m2157b(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L35
            androidx.fragment.app.n r1 = r2.f2202c
            r1.f2280b0 = r0
        L35:
            return
    }

    /* renamed from: p */
    public void m1219p() {
            r5 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto STARTED: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r1 = r5.f2202c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.n r0 = r5.f2202c
            androidx.fragment.app.d0 r1 = r0.f2296r0
            r1.m1152V()
            androidx.fragment.app.d0 r1 = r0.f2296r0
            r2 = 1
            r1.m1134C(r2)
            r1 = 5
            r0.f2277Y = r1
            r2 = 0
            r0.f2258A0 = r2
            r0.mo1235g0()
            boolean r3 = r0.f2258A0
            if (r3 == 0) goto L5a
            androidx.lifecycle.w r3 = r0.f2269L0
            androidx.lifecycle.o$b r4 = androidx.lifecycle.AbstractC0458o.b.ON_START
            r3.m1462e(r4)
            android.view.View r3 = r0.f2260C0
            if (r3 == 0) goto L45
            androidx.fragment.app.y0 r3 = r0.f2270M0
            r3.m1400a(r4)
        L45:
            androidx.fragment.app.d0 r0 = r0.f2296r0
            r0.f2103C = r2
            r0.f2104D = r2
            androidx.fragment.app.g0 r3 = r0.f2111K
            r3.f2178h = r2
            r0.m1190w(r1)
            androidx.fragment.app.c0 r0 = r5.f2200a
            androidx.fragment.app.n r1 = r5.f2202c
            r0.m1127k(r1, r2)
            return
        L5a:
            androidx.fragment.app.d1 r1 = new androidx.fragment.app.d1
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onStart()"
            java.lang.String r0 = androidx.fragment.app.C0393m.m1291a(r2, r0, r3)
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: q */
    public void m1220q() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "movefrom STARTED: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.fragment.app.n r1 = r4.f2202c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.n r0 = r4.f2202c
            androidx.fragment.app.d0 r1 = r0.f2296r0
            r2 = 1
            r1.f2104D = r2
            androidx.fragment.app.g0 r3 = r1.f2111K
            r3.f2178h = r2
            r2 = 4
            r1.m1190w(r2)
            android.view.View r1 = r0.f2260C0
            if (r1 == 0) goto L35
            androidx.fragment.app.y0 r1 = r0.f2270M0
            androidx.lifecycle.o$b r3 = androidx.lifecycle.AbstractC0458o.b.ON_STOP
            r1.m1400a(r3)
        L35:
            androidx.lifecycle.w r1 = r0.f2269L0
            androidx.lifecycle.o$b r3 = androidx.lifecycle.AbstractC0458o.b.ON_STOP
            r1.m1462e(r3)
            r0.f2277Y = r2
            r1 = 0
            r0.f2258A0 = r1
            r0.mo1236h0()
            boolean r2 = r0.f2258A0
            if (r2 == 0) goto L50
            androidx.fragment.app.c0 r0 = r4.f2200a
            androidx.fragment.app.n r2 = r4.f2202c
            r0.m1128l(r2, r1)
            return
        L50:
            androidx.fragment.app.d1 r1 = new androidx.fragment.app.d1
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onStop()"
            java.lang.String r0 = androidx.fragment.app.C0393m.m1291a(r2, r0, r3)
            r1.<init>(r0)
            throw r1
    }
}
