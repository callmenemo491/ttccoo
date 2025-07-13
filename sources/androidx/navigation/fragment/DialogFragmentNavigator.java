package androidx.navigation.fragment;

@androidx.navigation.AbstractC0527v.b("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends androidx.navigation.AbstractC0527v<androidx.navigation.fragment.DialogFragmentNavigator.C0509a> {

    /* renamed from: a */
    public final android.content.Context f2917a;

    /* renamed from: b */
    public final androidx.fragment.app.AbstractC0375d0 f2918b;

    /* renamed from: c */
    public int f2919c;

    /* renamed from: d */
    public final java.util.HashSet<java.lang.String> f2920d;

    /* renamed from: e */
    public androidx.lifecycle.InterfaceC0468t f2921e;


    /* renamed from: androidx.navigation.fragment.DialogFragmentNavigator$a */
    public static class C0509a extends androidx.navigation.C0518m implements androidx.navigation.InterfaceC0504c {

        /* renamed from: g0 */
        public java.lang.String f2922g0;

        public C0509a(androidx.navigation.AbstractC0527v<? extends androidx.navigation.fragment.DialogFragmentNavigator.C0509a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.C0518m
        /* renamed from: l */
        public void mo1580l(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                super.mo1580l(r2, r3)
                android.content.res.Resources r2 = r2.getResources()
                int[] r0 = androidx.navigation.fragment.C0511b.f2934a
                android.content.res.TypedArray r2 = r2.obtainAttributes(r3, r0)
                r3 = 0
                java.lang.String r3 = r2.getString(r3)
                if (r3 == 0) goto L16
                r1.f2922g0 = r3
            L16:
                r2.recycle()
                return
        }
    }

    public DialogFragmentNavigator(android.content.Context r2, androidx.fragment.app.AbstractC0375d0 r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2919c = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f2920d = r0
            androidx.navigation.fragment.DialogFragmentNavigator$1 r0 = new androidx.navigation.fragment.DialogFragmentNavigator$1
            r0.<init>(r1)
            r1.f2921e = r0
            r1.f2917a = r2
            r1.f2918b = r3
            return
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: a */
    public androidx.navigation.C0518m mo1577a() {
            r1 = this;
            androidx.navigation.fragment.DialogFragmentNavigator$a r0 = new androidx.navigation.fragment.DialogFragmentNavigator$a
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: b */
    public androidx.navigation.C0518m mo1578b(androidx.navigation.C0518m r3, android.os.Bundle r4, androidx.navigation.C0524s r5, androidx.navigation.AbstractC0527v.a r6) {
            r2 = this;
            androidx.navigation.fragment.DialogFragmentNavigator$a r3 = (androidx.navigation.fragment.DialogFragmentNavigator.C0509a) r3
            androidx.fragment.app.d0 r5 = r2.f2918b
            boolean r5 = r5.m1149S()
            if (r5 == 0) goto L14
            java.lang.String r3 = "DialogFragmentNavigator"
            java.lang.String r4 = "Ignoring navigate() call: FragmentManager has already saved its state"
            android.util.Log.i(r3, r4)
            r3 = 0
            goto L94
        L14:
            java.lang.String r5 = r3.f2922g0
            java.lang.String r6 = "DialogFragment class was not set"
            if (r5 == 0) goto L95
            r0 = 0
            char r0 = r5.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r2.f2917a
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L38:
            androidx.fragment.app.d0 r0 = r2.f2918b
            androidx.fragment.app.z r0 = r0.m1142K()
            android.content.Context r1 = r2.f2917a
            java.lang.ClassLoader r1 = r1.getClassLoader()
            androidx.fragment.app.n r5 = r0.mo1196a(r1, r5)
            java.lang.Class<androidx.fragment.app.l> r0 = androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l.class
            java.lang.Class r1 = r5.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L70
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Dialog destination "
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.String r3 = r3.f2922g0
            if (r3 == 0) goto L6a
            java.lang.String r6 = " is not an instance of DialogFragment"
            java.lang.String r3 = p346u.C6269n.m12888a(r5, r3, r6)
            r4.<init>(r3)
            throw r4
        L6a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r6)
            throw r3
        L70:
            androidx.fragment.app.l r5 = (androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l) r5
            r5.m1344x0(r4)
            androidx.lifecycle.w r4 = r5.f2269L0
            androidx.lifecycle.t r6 = r2.f2921e
            r4.mo1454a(r6)
            androidx.fragment.app.d0 r4 = r2.f2918b
            java.lang.String r6 = "androidx-nav-fragment:navigator:dialog:"
            java.lang.StringBuilder r6 = android.support.v4.media.C0144c.m256a(r6)
            int r0 = r2.f2919c
            int r1 = r0 + 1
            r2.f2919c = r1
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.mo1229K0(r4, r6)
        L94:
            return r3
        L95:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r6)
            throw r3
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: c */
    public void mo1581c(android.os.Bundle r4) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "androidx-nav-dialogfragment:navigator:count"
            int r4 = r4.getInt(r1, r0)
            r3.f2919c = r4
        L9:
            int r4 = r3.f2919c
            if (r0 >= r4) goto L47
            androidx.fragment.app.d0 r4 = r3.f2918b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "androidx-nav-fragment:navigator:dialog:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            androidx.fragment.app.n r4 = r4.m1140I(r1)
            androidx.fragment.app.l r4 = (androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l) r4
            if (r4 == 0) goto L30
            androidx.lifecycle.w r4 = r4.f2269L0
            androidx.lifecycle.t r1 = r3.f2921e
            r4.mo1454a(r1)
            goto L44
        L30:
            java.util.HashSet<java.lang.String> r4 = r3.f2920d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r4.add(r1)
        L44:
            int r0 = r0 + 1
            goto L9
        L47:
            return
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: d */
    public android.os.Bundle mo1582d() {
            r3 = this;
            int r0 = r3.f2919c
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.f2919c
            java.lang.String r2 = "androidx-nav-dialogfragment:navigator:count"
            r0.putInt(r2, r1)
            return r0
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: e */
    public boolean mo1579e() {
            r4 = this;
            int r0 = r4.f2919c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.fragment.app.d0 r0 = r4.f2918b
            boolean r0 = r0.m1149S()
            if (r0 == 0) goto L16
            java.lang.String r0 = "DialogFragmentNavigator"
            java.lang.String r2 = "Ignoring popBackStack() call: FragmentManager has already saved its state"
            android.util.Log.i(r0, r2)
            return r1
        L16:
            androidx.fragment.app.d0 r0 = r4.f2918b
            java.lang.String r1 = "androidx-nav-fragment:navigator:dialog:"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r4.f2919c
            r3 = 1
            int r2 = r2 - r3
            r4.f2919c = r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.fragment.app.n r0 = r0.m1140I(r1)
            if (r0 == 0) goto L3d
            androidx.lifecycle.w r1 = r0.f2269L0
            androidx.lifecycle.t r2 = r4.f2921e
            r1.mo1455b(r2)
            androidx.fragment.app.l r0 = (androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l) r0
            r0.mo1222D0()
        L3d:
            return r3
    }
}
