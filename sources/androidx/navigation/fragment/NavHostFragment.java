package androidx.navigation.fragment;

/* loaded from: classes.dex */
public class NavHostFragment extends androidx.fragment.app.ComponentCallbacksC0395n {

    /* renamed from: Z0 */
    public static final /* synthetic */ int f2923Z0 = 0;

    /* renamed from: U0 */
    public androidx.navigation.C0522q f2924U0;

    /* renamed from: V0 */
    public java.lang.Boolean f2925V0;

    /* renamed from: W0 */
    public android.view.View f2926W0;

    /* renamed from: X0 */
    public int f2927X0;

    /* renamed from: Y0 */
    public boolean f2928Y0;

    public NavHostFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2925V0 = r0
            return
    }

    /* renamed from: D0 */
    public static androidx.navigation.NavController m1583D0(androidx.fragment.app.ComponentCallbacksC0395n r3) {
            r0 = r3
        L1:
            if (r0 == 0) goto L22
            boolean r1 = r0 instanceof androidx.navigation.fragment.NavHostFragment
            if (r1 == 0) goto Le
            androidx.navigation.fragment.NavHostFragment r0 = (androidx.navigation.fragment.NavHostFragment) r0
            androidx.navigation.NavController r3 = r0.m1584E0()
            return r3
        Le:
            androidx.fragment.app.d0 r1 = r0.m1300D()
            androidx.fragment.app.n r1 = r1.f2133u
            boolean r2 = r1 instanceof androidx.navigation.fragment.NavHostFragment
            if (r2 == 0) goto L1f
            androidx.navigation.fragment.NavHostFragment r1 = (androidx.navigation.fragment.NavHostFragment) r1
            androidx.navigation.NavController r3 = r1.m1584E0()
            return r3
        L1f:
            androidx.fragment.app.n r0 = r0.f2297s0
            goto L1
        L22:
            android.view.View r0 = r3.f2260C0
            if (r0 == 0) goto L2b
            androidx.navigation.NavController r3 = androidx.navigation.C0526u.m1609a(r0)
            return r3
        L2b:
            boolean r0 = r3 instanceof androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
            if (r0 == 0) goto L35
            r0 = r3
            androidx.fragment.app.l r0 = (androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l) r0
            android.app.Dialog r0 = r0.f2218f1
            goto L36
        L35:
            r0 = 0
        L36:
            if (r0 == 0) goto L4b
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L4b
            android.view.Window r3 = r0.getWindow()
            android.view.View r3 = r3.getDecorView()
            androidx.navigation.NavController r3 = androidx.navigation.C0526u.m1609a(r3)
            return r3
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " does not have a NavController set"
            java.lang.String r3 = androidx.fragment.app.C0393m.m1291a(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: E0 */
    public final androidx.navigation.NavController m1584E0() {
            r2 = this;
            androidx.navigation.q r0 = r2.f2924U0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NavController is not available before onCreate()"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: T */
    public void mo1230T(android.content.Context r2) {
            r1 = this;
            super.mo1230T(r2)
            boolean r2 = r1.f2928Y0
            if (r2 == 0) goto L16
            androidx.fragment.app.d0 r2 = r1.m1300D()
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            r0.<init>(r2)
            r0.m1087q(r1)
            r0.mo1075e()
        L16:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: U */
    public void mo1316U(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            androidx.navigation.q r0 = r3.f2924U0
            androidx.navigation.w r0 = r0.f2899k
            java.lang.Class<androidx.navigation.fragment.DialogFragmentNavigator> r1 = androidx.navigation.fragment.DialogFragmentNavigator.class
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = androidx.navigation.C0528w.m1610b(r1)
            androidx.navigation.v r0 = r0.m1613c(r1)
            androidx.navigation.fragment.DialogFragmentNavigator r0 = (androidx.navigation.fragment.DialogFragmentNavigator) r0
            java.util.HashSet<java.lang.String> r1 = r0.f2920d
            java.lang.String r2 = r4.f2300v0
            boolean r1 = r1.remove(r2)
            if (r1 == 0) goto L24
            androidx.lifecycle.w r4 = r4.f2269L0
            androidx.lifecycle.t r0 = r0.f2921e
            r4.mo1454a(r0)
        L24:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r10) {
            r9 = this;
            android.content.Context r0 = r9.m1334s0()
            androidx.navigation.q r1 = new androidx.navigation.q
            r1.<init>(r0)
            r9.f2924U0 = r1
            androidx.lifecycle.v r0 = r1.f2897i
            if (r9 != r0) goto L10
            goto L19
        L10:
            r1.f2897i = r9
            androidx.lifecycle.w r0 = r9.f2269L0
            androidx.lifecycle.u r1 = r1.f2901m
            r0.mo1454a(r1)
        L19:
            androidx.navigation.q r0 = r9.f2924U0
            androidx.fragment.app.s r1 = r9.m1330q0()
            androidx.activity.OnBackPressedDispatcher r1 = r1.f589d0
            androidx.lifecycle.v r2 = r0.f2897i
            if (r2 == 0) goto L12e
            androidx.activity.b r2 = r0.f2902n
            r2.m440b()
            androidx.lifecycle.v r2 = r0.f2897i
            androidx.activity.b r3 = r0.f2902n
            r1.m437a(r2, r3)
            androidx.lifecycle.v r1 = r0.f2897i
            androidx.lifecycle.o r1 = r1.mo428b()
            androidx.lifecycle.u r2 = r0.f2901m
            r1.mo1455b(r2)
            androidx.lifecycle.v r1 = r0.f2897i
            androidx.lifecycle.o r1 = r1.mo428b()
            androidx.lifecycle.u r0 = r0.f2901m
            r1.mo1454a(r0)
            androidx.navigation.q r0 = r9.f2924U0
            java.lang.Boolean r1 = r9.f2925V0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L57
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L57
            r1 = 1
            goto L58
        L57:
            r1 = 0
        L58:
            r0.f2903o = r1
            r0.m1573l()
            r0 = 0
            r9.f2925V0 = r0
            androidx.navigation.q r1 = r9.f2924U0
            androidx.lifecycle.s0 r4 = r9.mo432o()
            androidx.navigation.k r5 = r1.f2898j
            androidx.navigation.k r6 = androidx.navigation.C0516k.m1587d(r4)
            if (r5 != r6) goto L6f
            goto L7d
        L6f:
            java.util.Deque<androidx.navigation.i> r5 = r1.f2896h
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L126
            androidx.navigation.k r4 = androidx.navigation.C0516k.m1587d(r4)
            r1.f2898j = r4
        L7d:
            androidx.navigation.q r1 = r9.f2924U0
            androidx.navigation.w r4 = r1.f2899k
            androidx.navigation.fragment.DialogFragmentNavigator r5 = new androidx.navigation.fragment.DialogFragmentNavigator
            android.content.Context r6 = r9.m1334s0()
            androidx.fragment.app.d0 r7 = r9.m1337u()
            r5.<init>(r6, r7)
            r4.m1612a(r5)
            androidx.navigation.w r1 = r1.f2899k
            androidx.navigation.fragment.a r4 = new androidx.navigation.fragment.a
            android.content.Context r5 = r9.m1334s0()
            androidx.fragment.app.d0 r6 = r9.m1337u()
            int r7 = r9.f2298t0
            if (r7 == 0) goto La5
            r8 = -1
            if (r7 == r8) goto La5
            goto La8
        La5:
            r7 = 2131362446(0x7f0a028e, float:1.8344673E38)
        La8:
            r4.<init>(r5, r6, r7)
            r1.m1612a(r4)
            java.lang.String r1 = "android-support-nav:fragment:graphId"
            if (r10 == 0) goto Ld8
            java.lang.String r4 = "android-support-nav:fragment:navControllerState"
            android.os.Bundle r4 = r10.getBundle(r4)
            java.lang.String r5 = "android-support-nav:fragment:defaultHost"
            boolean r5 = r10.getBoolean(r5, r2)
            if (r5 == 0) goto Ld1
            r9.f2928Y0 = r3
            androidx.fragment.app.d0 r3 = r9.m1300D()
            androidx.fragment.app.a r5 = new androidx.fragment.app.a
            r5.<init>(r3)
            r5.m1087q(r9)
            r5.mo1075e()
        Ld1:
            int r3 = r10.getInt(r1)
            r9.f2927X0 = r3
            goto Ld9
        Ld8:
            r4 = r0
        Ld9:
            if (r4 == 0) goto L101
            androidx.navigation.q r3 = r9.f2924U0
            java.util.Objects.requireNonNull(r3)
            android.content.Context r5 = r3.f2889a
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r4.setClassLoader(r5)
            java.lang.String r5 = "android-support-nav:controller:navigatorState"
            android.os.Bundle r5 = r4.getBundle(r5)
            r3.f2893e = r5
            java.lang.String r5 = "android-support-nav:controller:backStack"
            android.os.Parcelable[] r5 = r4.getParcelableArray(r5)
            r3.f2894f = r5
            java.lang.String r5 = "android-support-nav:controller:deepLinkHandled"
            boolean r4 = r4.getBoolean(r5)
            r3.f2895g = r4
        L101:
            int r3 = r9.f2927X0
            if (r3 == 0) goto L10b
            androidx.navigation.q r1 = r9.f2924U0
            r1.m1572k(r3, r0)
            goto L122
        L10b:
            android.os.Bundle r3 = r9.f2282d0
            if (r3 == 0) goto L113
            int r2 = r3.getInt(r1)
        L113:
            if (r3 == 0) goto L11b
            java.lang.String r0 = "android-support-nav:fragment:startDestinationArgs"
            android.os.Bundle r0 = r3.getBundle(r0)
        L11b:
            if (r2 == 0) goto L122
            androidx.navigation.q r1 = r9.f2924U0
            r1.m1572k(r2, r0)
        L122:
            super.mo114V(r10)
            return
        L126:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "ViewModelStore should be set before setGraph call"
            r10.<init>(r0)
            throw r10
        L12e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()"
            r10.<init>(r0)
            throw r10
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: W */
    public android.view.View mo1317W(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            androidx.fragment.app.FragmentContainerView r2 = new androidx.fragment.app.FragmentContainerView
            android.content.Context r1 = r1.getContext()
            r2.<init>(r1)
            int r1 = r0.f2298t0
            if (r1 == 0) goto L11
            r3 = -1
            if (r1 == r3) goto L11
            goto L14
        L11:
            r1 = 2131362446(0x7f0a028e, float:1.8344673E38)
        L14:
            r2.setId(r1)
            return r2
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: Y */
    public void mo1231Y() {
            r3 = this;
            r0 = 1
            r3.f2258A0 = r0
            android.view.View r0 = r3.f2926W0
            r1 = 0
            if (r0 == 0) goto L18
            androidx.navigation.NavController r0 = androidx.navigation.C0526u.m1609a(r0)
            androidx.navigation.q r2 = r3.f2924U0
            if (r0 != r2) goto L18
            android.view.View r0 = r3.f2926W0
            r2 = 2131362442(0x7f0a028a, float:1.8344665E38)
            r0.setTag(r2, r1)
        L18:
            r3.f2926W0 = r1
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: b0 */
    public void mo1319b0(android.content.Context r3, android.util.AttributeSet r4, android.os.Bundle r5) {
            r2 = this;
            super.mo1319b0(r3, r4, r5)
            int[] r5 = androidx.navigation.C0529x.f3021b
            android.content.res.TypedArray r5 = r3.obtainStyledAttributes(r4, r5)
            r0 = 0
            int r1 = r5.getResourceId(r0, r0)
            if (r1 == 0) goto L12
            r2.f2927X0 = r1
        L12:
            r5.recycle()
            int[] r5 = androidx.navigation.fragment.C0511b.f2936c
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r5)
            boolean r4 = r3.getBoolean(r0, r0)
            if (r4 == 0) goto L24
            r4 = 1
            r2.f2928Y0 = r4
        L24:
            r3.recycle()
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: d0 */
    public void mo1321d0(boolean r2) {
            r1 = this;
            androidx.navigation.q r0 = r1.f2924U0
            if (r0 == 0) goto La
            r0.f2903o = r2
            r0.m1573l()
            goto L10
        La:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.f2925V0 = r2
        L10:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: f0 */
    public void mo1234f0(android.os.Bundle r9) {
            r8 = this;
            androidx.navigation.q r0 = r8.f2924U0
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            androidx.navigation.w r3 = r0.f2899k
            java.util.HashMap<java.lang.String, androidx.navigation.v<? extends androidx.navigation.m>> r3 = r3.f3019a
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            androidx.navigation.v r4 = (androidx.navigation.AbstractC0527v) r4
            android.os.Bundle r4 = r4.mo1582d()
            if (r4 == 0) goto L1b
            r1.add(r5)
            r2.putBundle(r5, r4)
            goto L1b
        L40:
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L56
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "android-support-nav:controller:navigatorState:names"
            r2.putStringArrayList(r4, r1)
            java.lang.String r1 = "android-support-nav:controller:navigatorState"
            r3.putBundle(r1, r2)
            goto L57
        L56:
            r3 = 0
        L57:
            java.util.Deque<androidx.navigation.i> r1 = r0.f2896h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L92
            if (r3 != 0) goto L67
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r3 = r1
        L67:
            java.util.Deque<androidx.navigation.i> r1 = r0.f2896h
            int r1 = r1.size()
            android.os.Parcelable[] r1 = new android.os.Parcelable[r1]
            r2 = 0
            java.util.Deque<androidx.navigation.i> r4 = r0.f2896h
            java.util.Iterator r4 = r4.iterator()
        L76:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r4.next()
            androidx.navigation.i r5 = (androidx.navigation.C0514i) r5
            int r6 = r2 + 1
            androidx.navigation.j r7 = new androidx.navigation.j
            r7.<init>(r5)
            r1[r2] = r7
            r2 = r6
            goto L76
        L8d:
            java.lang.String r2 = "android-support-nav:controller:backStack"
            r3.putParcelableArray(r2, r1)
        L92:
            boolean r1 = r0.f2895g
            if (r1 == 0) goto La5
            if (r3 != 0) goto L9e
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r3 = r1
        L9e:
            boolean r0 = r0.f2895g
            java.lang.String r1 = "android-support-nav:controller:deepLinkHandled"
            r3.putBoolean(r1, r0)
        La5:
            if (r3 == 0) goto Lac
            java.lang.String r0 = "android-support-nav:fragment:navControllerState"
            r9.putBundle(r0, r3)
        Lac:
            boolean r0 = r8.f2928Y0
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "android-support-nav:fragment:defaultHost"
            r1 = 1
            r9.putBoolean(r0, r1)
        Lb6:
            int r0 = r8.f2927X0
            if (r0 == 0) goto Lbf
            java.lang.String r1 = "android-support-nav:fragment:graphId"
            r9.putInt(r1, r0)
        Lbf:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: i0 */
    public void mo1323i0(android.view.View r3, android.os.Bundle r4) {
            r2 = this;
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L2a
            androidx.navigation.q r4 = r2.f2924U0
            r0 = 2131362442(0x7f0a028a, float:1.8344665E38)
            r3.setTag(r0, r4)
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L29
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            r2.f2926W0 = r3
            int r3 = r3.getId()
            int r4 = r2.f2298t0
            if (r3 != r4) goto L29
            android.view.View r3 = r2.f2926W0
            androidx.navigation.q r4 = r2.f2924U0
            r3.setTag(r0, r4)
        L29:
            return
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "created host view "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is not a ViewGroup"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }
}
