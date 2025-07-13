package androidx.viewpager2.widget;

/* loaded from: classes.dex */
public final class ViewPager2 extends android.view.ViewGroup {

    /* renamed from: a0 */
    public final android.graphics.Rect f3733a0;

    /* renamed from: b0 */
    public final android.graphics.Rect f3734b0;

    /* renamed from: c0 */
    public androidx.viewpager2.widget.C0646a f3735c0;

    /* renamed from: d0 */
    public int f3736d0;

    /* renamed from: e0 */
    public boolean f3737e0;

    /* renamed from: f0 */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0551g f3738f0;

    /* renamed from: g0 */
    public androidx.recyclerview.widget.LinearLayoutManager f3739g0;

    /* renamed from: h0 */
    public int f3740h0;

    /* renamed from: i0 */
    public android.os.Parcelable f3741i0;

    /* renamed from: j0 */
    public androidx.recyclerview.widget.RecyclerView f3742j0;

    /* renamed from: k0 */
    public androidx.recyclerview.widget.C0586e0 f3743k0;

    /* renamed from: l0 */
    public androidx.viewpager2.widget.C0648c f3744l0;

    /* renamed from: m0 */
    public androidx.viewpager2.widget.C0646a f3745m0;

    /* renamed from: n0 */
    public androidx.fragment.app.C0392l0 f3746n0;

    /* renamed from: o0 */
    public androidx.viewpager2.widget.C0647b f3747o0;

    /* renamed from: p0 */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0554j f3748p0;

    /* renamed from: q0 */
    public boolean f3749q0;

    /* renamed from: r0 */
    public boolean f3750r0;

    /* renamed from: s0 */
    public int f3751s0;

    /* renamed from: t0 */
    public androidx.viewpager2.widget.ViewPager2.AbstractC0636b f3752t0;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C0635a extends androidx.viewpager2.widget.ViewPager2.AbstractC0637c {

        /* renamed from: a */
        public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 f3753a;

        public C0635a(androidx.viewpager2.widget.ViewPager2 r1) {
                r0 = this;
                r0.f3753a = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: a */
        public void mo1819a() {
                r2 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r2.f3753a
                r1 = 1
                r0.f3737e0 = r1
                androidx.viewpager2.widget.c r0 = r0.f3744l0
                r0.f3783l = r1
                return
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public abstract class AbstractC0636b {
        public AbstractC0636b(androidx.viewpager2.widget.ViewPager2 r1, androidx.viewpager2.widget.ViewPager2.C0635a r2) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract void mo2182a(androidx.viewpager2.widget.C0646a r1, androidx.recyclerview.widget.RecyclerView r2);

        /* renamed from: b */
        public abstract void mo2183b();
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public static abstract class AbstractC0637c extends androidx.recyclerview.widget.RecyclerView.AbstractC0551g {
        public AbstractC0637c(androidx.viewpager2.widget.ViewPager2.C0635a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: b */
        public final void mo1820b(int r1, int r2) {
                r0 = this;
                r0.mo1819a()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: c */
        public final void mo1821c(int r1, int r2, java.lang.Object r3) {
                r0 = this;
                r0.mo1819a()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: d */
        public final void mo1822d(int r1, int r2) {
                r0 = this;
                r0.mo1819a()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: e */
        public final void mo1823e(int r1, int r2, int r3) {
                r0 = this;
                r0.mo1819a()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
        /* renamed from: f */
        public final void mo1824f(int r1, int r2) {
                r0 = this;
                r0.mo1819a()
                return
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C0638d extends androidx.recyclerview.widget.LinearLayoutManager {

        /* renamed from: E */
        public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 f3754E;

        public C0638d(androidx.viewpager2.widget.ViewPager2 r1, android.content.Context r2) {
                r0 = this;
                r0.f3754E = r1
                r1 = 1
                r2 = 0
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: N0 */
        public void mo1664N0(androidx.recyclerview.widget.RecyclerView.C0569y r3, int[] r4) {
                r2 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r2.f3754E
                int r0 = r0.getOffscreenPageLimit()
                r1 = -1
                if (r0 != r1) goto Ld
                super.mo1664N0(r3, r4)
                return
            Ld:
                androidx.viewpager2.widget.ViewPager2 r3 = r2.f3754E
                int r3 = r3.getPageSize()
                int r3 = r3 * r0
                r0 = 0
                r4[r0] = r3
                r0 = 1
                r4[r0] = r3
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
        /* renamed from: e0 */
        public void mo1876e0(androidx.recyclerview.widget.RecyclerView.C0564t r1, androidx.recyclerview.widget.RecyclerView.C0569y r2, p242o0.C4868b r3) {
                r0 = this;
                super.mo1876e0(r1, r2, r3)
                androidx.viewpager2.widget.ViewPager2 r1 = r0.f3754E
                androidx.viewpager2.widget.ViewPager2$b r1 = r1.f3752t0
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
        /* renamed from: r0 */
        public boolean mo1880r0(androidx.recyclerview.widget.RecyclerView.C0564t r2, androidx.recyclerview.widget.RecyclerView.C0569y r3, int r4, android.os.Bundle r5) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.f3754E
                androidx.viewpager2.widget.ViewPager2$b r0 = r0.f3752t0
                java.util.Objects.requireNonNull(r0)
                boolean r2 = super.mo1880r0(r2, r3, r4, r5)
                return r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
        /* renamed from: x0 */
        public boolean mo1888x0(androidx.recyclerview.widget.RecyclerView r1, android.view.View r2, android.graphics.Rect r3, boolean r4, boolean r5) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public static abstract class AbstractC0639e {
        public AbstractC0639e() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void mo2184a(int r1) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public void mo2185b(int r1, float r2, int r3) {
                r0 = this;
                return
        }

        /* renamed from: c */
        public void mo2186c(int r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C0640f extends androidx.viewpager2.widget.ViewPager2.AbstractC0636b {

        /* renamed from: a */
        public final p242o0.InterfaceC4870d f3755a;

        /* renamed from: b */
        public final p242o0.InterfaceC4870d f3756b;

        /* renamed from: c */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0551g f3757c;

        /* renamed from: d */
        public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 f3758d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$f$a */
        public class a implements p242o0.InterfaceC4870d {

            /* renamed from: a */
            public final /* synthetic */ androidx.viewpager2.widget.ViewPager2.C0640f f3759a;

            public a(androidx.viewpager2.widget.ViewPager2.C0640f r1) {
                    r0 = this;
                    r0.f3759a = r1
                    r0.<init>()
                    return
            }

            @Override // p242o0.InterfaceC4870d
            /* renamed from: a */
            public boolean mo36a(android.view.View r2, p242o0.InterfaceC4870d.a r3) {
                    r1 = this;
                    androidx.viewpager2.widget.ViewPager2 r2 = (androidx.viewpager2.widget.ViewPager2) r2
                    androidx.viewpager2.widget.ViewPager2$f r3 = r1.f3759a
                    int r2 = r2.getCurrentItem()
                    r0 = 1
                    int r2 = r2 + r0
                    r3.m2187c(r2)
                    return r0
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$f$b */
        public class b implements p242o0.InterfaceC4870d {

            /* renamed from: a */
            public final /* synthetic */ androidx.viewpager2.widget.ViewPager2.C0640f f3760a;

            public b(androidx.viewpager2.widget.ViewPager2.C0640f r1) {
                    r0 = this;
                    r0.f3760a = r1
                    r0.<init>()
                    return
            }

            @Override // p242o0.InterfaceC4870d
            /* renamed from: a */
            public boolean mo36a(android.view.View r2, p242o0.InterfaceC4870d.a r3) {
                    r1 = this;
                    androidx.viewpager2.widget.ViewPager2 r2 = (androidx.viewpager2.widget.ViewPager2) r2
                    androidx.viewpager2.widget.ViewPager2$f r3 = r1.f3760a
                    int r2 = r2.getCurrentItem()
                    r0 = 1
                    int r2 = r2 - r0
                    r3.m2187c(r2)
                    return r0
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$f$c */
        public class c extends androidx.viewpager2.widget.ViewPager2.AbstractC0637c {

            /* renamed from: a */
            public final /* synthetic */ androidx.viewpager2.widget.ViewPager2.C0640f f3761a;

            public c(androidx.viewpager2.widget.ViewPager2.C0640f r1) {
                    r0 = this;
                    r0.f3761a = r1
                    r1 = 0
                    r0.<init>(r1)
                    return
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0551g
            /* renamed from: a */
            public void mo1819a() {
                    r1 = this;
                    androidx.viewpager2.widget.ViewPager2$f r0 = r1.f3761a
                    r0.m2188d()
                    return
            }
        }

        public C0640f(androidx.viewpager2.widget.ViewPager2 r2) {
                r1 = this;
                r1.f3758d = r2
                r0 = 0
                r1.<init>(r2, r0)
                androidx.viewpager2.widget.ViewPager2$f$a r2 = new androidx.viewpager2.widget.ViewPager2$f$a
                r2.<init>(r1)
                r1.f3755a = r2
                androidx.viewpager2.widget.ViewPager2$f$b r2 = new androidx.viewpager2.widget.ViewPager2$f$b
                r2.<init>(r1)
                r1.f3756b = r2
                return
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0636b
        /* renamed from: a */
        public void mo2182a(androidx.viewpager2.widget.C0646a r1, androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                r1 = 2
                p227n0.C4661t.c.m10571s(r2, r1)
                androidx.viewpager2.widget.ViewPager2$f$c r1 = new androidx.viewpager2.widget.ViewPager2$f$c
                r1.<init>(r0)
                r0.f3757c = r1
                androidx.viewpager2.widget.ViewPager2 r1 = r0.f3758d
                int r1 = p227n0.C4661t.c.m10555c(r1)
                if (r1 != 0) goto L1b
                androidx.viewpager2.widget.ViewPager2 r1 = r0.f3758d
                r2 = 1
                p227n0.C4661t.c.m10571s(r1, r2)
            L1b:
                return
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0636b
        /* renamed from: b */
        public void mo2183b() {
                r0 = this;
                r0.m2188d()
                return
        }

        /* renamed from: c */
        public void m2187c(int r3) {
                r2 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r2.f3758d
                boolean r1 = r0.f3750r0
                if (r1 == 0) goto La
                r1 = 1
                r0.m2180d(r3, r1)
            La:
                return
        }

        /* renamed from: d */
        public void m2188d() {
                r8 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r8.f3758d
                r1 = 16908360(0x1020048, float:2.387743E-38)
                p227n0.C4661t.m10542r(r0, r1)
                r2 = 16908361(0x1020049, float:2.3877434E-38)
                p227n0.C4661t.m10543s(r2, r0)
                r3 = 0
                p227n0.C4661t.m10537m(r0, r3)
                r4 = 16908358(0x1020046, float:2.3877425E-38)
                p227n0.C4661t.m10543s(r4, r0)
                p227n0.C4661t.m10537m(r0, r3)
                r5 = 16908359(0x1020047, float:2.3877428E-38)
                p227n0.C4661t.m10543s(r5, r0)
                p227n0.C4661t.m10537m(r0, r3)
                androidx.viewpager2.widget.ViewPager2 r3 = r8.f3758d
                androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
                if (r3 != 0) goto L2d
                return
            L2d:
                androidx.viewpager2.widget.ViewPager2 r3 = r8.f3758d
                androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
                int r3 = r3.mo1521b()
                if (r3 != 0) goto L3a
                return
            L3a:
                androidx.viewpager2.widget.ViewPager2 r6 = r8.f3758d
                boolean r7 = r6.f3750r0
                if (r7 != 0) goto L41
                return
            L41:
                int r6 = r6.getOrientation()
                r7 = 0
                if (r6 != 0) goto L7f
                androidx.viewpager2.widget.ViewPager2 r4 = r8.f3758d
                boolean r4 = r4.m2177a()
                if (r4 == 0) goto L54
                r5 = 16908360(0x1020048, float:2.387743E-38)
                goto L57
            L54:
                r5 = 16908361(0x1020049, float:2.3877434E-38)
            L57:
                if (r4 == 0) goto L5c
                r1 = 16908361(0x1020049, float:2.3877434E-38)
            L5c:
                androidx.viewpager2.widget.ViewPager2 r2 = r8.f3758d
                int r2 = r2.f3736d0
                int r3 = r3 + (-1)
                if (r2 >= r3) goto L6e
                o0.b$a r2 = new o0.b$a
                r2.<init>(r5, r7)
                o0.d r3 = r8.f3755a
                p227n0.C4661t.m10544t(r0, r2, r7, r3)
            L6e:
                androidx.viewpager2.widget.ViewPager2 r2 = r8.f3758d
                int r2 = r2.f3736d0
                if (r2 <= 0) goto La1
                o0.b$a r2 = new o0.b$a
                r2.<init>(r1, r7)
                o0.d r1 = r8.f3756b
                p227n0.C4661t.m10544t(r0, r2, r7, r1)
                goto La1
            L7f:
                androidx.viewpager2.widget.ViewPager2 r1 = r8.f3758d
                int r1 = r1.f3736d0
                int r3 = r3 + (-1)
                if (r1 >= r3) goto L91
                o0.b$a r1 = new o0.b$a
                r1.<init>(r5, r7)
                o0.d r2 = r8.f3755a
                p227n0.C4661t.m10544t(r0, r1, r7, r2)
            L91:
                androidx.viewpager2.widget.ViewPager2 r1 = r8.f3758d
                int r1 = r1.f3736d0
                if (r1 <= 0) goto La1
                o0.b$a r1 = new o0.b$a
                r1.<init>(r4, r7)
                o0.d r2 = r8.f3756b
                p227n0.C4661t.m10544t(r0, r1, r7, r2)
            La1:
                return
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public interface InterfaceC0641g {
        /* renamed from: a */
        void m2189a(android.view.View r1, float r2);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C0642h extends androidx.recyclerview.widget.C0586e0 {

        /* renamed from: e */
        public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 f3762e;

        public C0642h(androidx.viewpager2.widget.ViewPager2 r1) {
                r0 = this;
                r0.f3762e = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0586e0, androidx.recyclerview.widget.AbstractC0598k0
        /* renamed from: c */
        public android.view.View mo2027c(androidx.recyclerview.widget.RecyclerView.AbstractC0557m r2) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.f3762e
                androidx.fragment.app.l0 r0 = r0.f3746n0
                java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r0.f2231a0
                androidx.viewpager2.widget.c r0 = (androidx.viewpager2.widget.C0648c) r0
                boolean r0 = r0.f3784m
                if (r0 == 0) goto Le
                r2 = 0
                goto L12
            Le:
                android.view.View r2 = super.mo2027c(r2)
            L12:
                return r2
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public class C0643i extends androidx.recyclerview.widget.RecyclerView {

        /* renamed from: E1 */
        public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 f3763E1;

        public C0643i(androidx.viewpager2.widget.ViewPager2 r1, android.content.Context r2) {
                r0 = this;
                r0.f3763E1 = r1
                r1 = 0
                r0.<init>(r2, r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public java.lang.CharSequence getAccessibilityClassName() {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.f3763E1
                androidx.viewpager2.widget.ViewPager2$b r0 = r0.f3752t0
                java.util.Objects.requireNonNull(r0)
                java.lang.CharSequence r0 = super.getAccessibilityClassName()
                return r0
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2)
                androidx.viewpager2.widget.ViewPager2 r0 = r1.f3763E1
                int r0 = r0.f3736d0
                r2.setFromIndex(r0)
                androidx.viewpager2.widget.ViewPager2 r0 = r1.f3763E1
                int r0 = r0.f3736d0
                r2.setToIndex(r0)
                androidx.viewpager2.widget.ViewPager2 r0 = r1.f3763E1
                androidx.viewpager2.widget.ViewPager2$b r0 = r0.f3752t0
                androidx.viewpager2.widget.ViewPager2$f r0 = (androidx.viewpager2.widget.ViewPager2.C0640f) r0
                androidx.viewpager2.widget.ViewPager2 r0 = r0.f3758d
                r2.setSource(r0)
                java.lang.String r0 = "androidx.viewpager.widget.ViewPager"
                r2.setClassName(r0)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.f3763E1
                boolean r0 = r0.f3750r0
                if (r0 == 0) goto Le
                boolean r2 = super.onInterceptTouchEvent(r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @android.annotation.SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(android.view.MotionEvent r2) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.f3763E1
                boolean r0 = r0.f3750r0
                if (r0 == 0) goto Le
                boolean r2 = super.onTouchEvent(r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public static class C0644j extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.viewpager2.widget.ViewPager2.C0644j> CREATOR = null;

        /* renamed from: Y */
        public int f3764Y;

        /* renamed from: Z */
        public int f3765Z;

        /* renamed from: a0 */
        public android.os.Parcelable f3766a0;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        public static class a implements android.os.Parcelable.ClassLoaderCreator<androidx.viewpager2.widget.ViewPager2.C0644j> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 24
                    if (r0 < r1) goto Ld
                    androidx.viewpager2.widget.ViewPager2$j r0 = new androidx.viewpager2.widget.ViewPager2$j
                    r1 = 0
                    r0.<init>(r3, r1)
                    goto L12
                Ld:
                    androidx.viewpager2.widget.ViewPager2$j r0 = new androidx.viewpager2.widget.ViewPager2$j
                    r0.<init>(r3)
                L12:
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.viewpager2.widget.ViewPager2.C0644j createFromParcel(android.os.Parcel r3, java.lang.ClassLoader r4) {
                    r2 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 24
                    if (r0 < r1) goto Lc
                    androidx.viewpager2.widget.ViewPager2$j r0 = new androidx.viewpager2.widget.ViewPager2$j
                    r0.<init>(r3, r4)
                    goto L11
                Lc:
                    androidx.viewpager2.widget.ViewPager2$j r0 = new androidx.viewpager2.widget.ViewPager2$j
                    r0.<init>(r3)
                L11:
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.viewpager2.widget.ViewPager2$j[] r1 = new androidx.viewpager2.widget.ViewPager2.C0644j[r1]
                    return r1
            }
        }

        static {
                androidx.viewpager2.widget.ViewPager2$j$a r0 = new androidx.viewpager2.widget.ViewPager2$j$a
                r0.<init>()
                androidx.viewpager2.widget.ViewPager2.C0644j.CREATOR = r0
                return
        }

        public C0644j(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                int r0 = r2.readInt()
                r1.f3764Y = r0
                int r0 = r2.readInt()
                r1.f3765Z = r0
                r0 = 0
                android.os.Parcelable r2 = r2.readParcelable(r0)
                r1.f3766a0 = r2
                return
        }

        public C0644j(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int r0 = r2.readInt()
                r1.f3764Y = r0
                int r0 = r2.readInt()
                r1.f3765Z = r0
                android.os.Parcelable r2 = r2.readParcelable(r3)
                r1.f3766a0 = r2
                return
        }

        public C0644j(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                int r0 = r1.f3764Y
                r2.writeInt(r0)
                int r0 = r1.f3765Z
                r2.writeInt(r0)
                android.os.Parcelable r0 = r1.f3766a0
                r2.writeParcelable(r0, r3)
                return
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public static class RunnableC0645k implements java.lang.Runnable {

        /* renamed from: Y */
        public final int f3767Y;

        /* renamed from: Z */
        public final androidx.recyclerview.widget.RecyclerView f3768Z;

        public RunnableC0645k(int r1, androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                r0.<init>()
                r0.f3767Y = r1
                r0.f3768Z = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f3768Z
                int r1 = r2.f3767Y
                r0.m1760j0(r1)
                return
        }
    }

    public ViewPager2(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            r12.<init>(r13, r14)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.f3733a0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.f3734b0 = r0
            androidx.viewpager2.widget.a r0 = new androidx.viewpager2.widget.a
            r1 = 3
            r0.<init>(r1)
            r12.f3735c0 = r0
            r0 = 0
            r12.f3737e0 = r0
            androidx.viewpager2.widget.ViewPager2$a r2 = new androidx.viewpager2.widget.ViewPager2$a
            r2.<init>(r12)
            r12.f3738f0 = r2
            r2 = -1
            r12.f3740h0 = r2
            r3 = 0
            r12.f3748p0 = r3
            r12.f3749q0 = r0
            r3 = 1
            r12.f3750r0 = r3
            r12.f3751s0 = r2
            androidx.viewpager2.widget.ViewPager2$f r4 = new androidx.viewpager2.widget.ViewPager2$f
            r4.<init>(r12)
            r12.f3752t0 = r4
            androidx.viewpager2.widget.ViewPager2$i r4 = new androidx.viewpager2.widget.ViewPager2$i
            r4.<init>(r12, r13)
            r12.f3742j0 = r4
            java.util.WeakHashMap<android.view.View, n0.w> r5 = p227n0.C4661t.f18570a
            int r5 = p227n0.C4661t.d.m10572a()
            r4.setId(r5)
            androidx.recyclerview.widget.RecyclerView r4 = r12.f3742j0
            r5 = 131072(0x20000, float:1.83671E-40)
            r4.setDescendantFocusability(r5)
            androidx.viewpager2.widget.ViewPager2$d r4 = new androidx.viewpager2.widget.ViewPager2$d
            r4.<init>(r12, r13)
            r12.f3739g0 = r4
            androidx.recyclerview.widget.RecyclerView r5 = r12.f3742j0
            r5.setLayoutManager(r4)
            androidx.recyclerview.widget.RecyclerView r4 = r12.f3742j0
            r4.setScrollingTouchSlop(r3)
            int[] r7 = p424y1.C7103a.f27494a
            android.content.res.TypedArray r3 = r13.obtainStyledAttributes(r14, r7)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L74
            r10 = 0
            r11 = 0
            r5 = r12
            r6 = r13
            r8 = r14
            r9 = r3
            r5.saveAttributeDataForStyleable(r6, r7, r8, r9, r10, r11)
        L74:
            int r13 = r3.getInt(r0, r0)     // Catch: java.lang.Throwable -> L10f
            r12.setOrientation(r13)     // Catch: java.lang.Throwable -> L10f
            r3.recycle()
            androidx.recyclerview.widget.RecyclerView r13 = r12.f3742j0
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r2, r2)
            r13.setLayoutParams(r14)
            androidx.recyclerview.widget.RecyclerView r13 = r12.f3742j0
            z1.c r14 = new z1.c
            r14.<init>(r12)
            java.util.List<androidx.recyclerview.widget.RecyclerView$o> r2 = r13.f3124C0
            if (r2 != 0) goto L9a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r13.f3124C0 = r2
        L9a:
            java.util.List<androidx.recyclerview.widget.RecyclerView$o> r13 = r13.f3124C0
            r13.add(r14)
            androidx.viewpager2.widget.c r13 = new androidx.viewpager2.widget.c
            r13.<init>(r12)
            r12.f3744l0 = r13
            androidx.fragment.app.l0 r14 = new androidx.fragment.app.l0
            androidx.recyclerview.widget.RecyclerView r2 = r12.f3742j0
            r14.<init>(r12, r13, r2)
            r12.f3746n0 = r14
            androidx.viewpager2.widget.ViewPager2$h r13 = new androidx.viewpager2.widget.ViewPager2$h
            r13.<init>(r12)
            r12.f3743k0 = r13
            androidx.recyclerview.widget.RecyclerView r14 = r12.f3742j0
            r13.m2081a(r14)
            androidx.recyclerview.widget.RecyclerView r13 = r12.f3742j0
            androidx.viewpager2.widget.c r14 = r12.f3744l0
            r13.m1756h(r14)
            androidx.viewpager2.widget.a r13 = new androidx.viewpager2.widget.a
            r13.<init>(r1)
            r12.f3745m0 = r13
            androidx.viewpager2.widget.c r14 = r12.f3744l0
            r14.f3772a = r13
            androidx.viewpager2.widget.d r14 = new androidx.viewpager2.widget.d
            r14.<init>(r12)
            androidx.viewpager2.widget.e r1 = new androidx.viewpager2.widget.e
            r1.<init>(r12)
            java.util.List<androidx.viewpager2.widget.ViewPager2$e> r13 = r13.f3769a
            r13.add(r14)
            androidx.viewpager2.widget.a r13 = r12.f3745m0
            java.util.List<androidx.viewpager2.widget.ViewPager2$e> r13 = r13.f3769a
            r13.add(r1)
            androidx.viewpager2.widget.ViewPager2$b r13 = r12.f3752t0
            androidx.viewpager2.widget.a r14 = r12.f3745m0
            androidx.recyclerview.widget.RecyclerView r1 = r12.f3742j0
            r13.mo2182a(r14, r1)
            androidx.viewpager2.widget.a r13 = r12.f3745m0
            androidx.viewpager2.widget.a r14 = r12.f3735c0
            java.util.List<androidx.viewpager2.widget.ViewPager2$e> r13 = r13.f3769a
            r13.add(r14)
            androidx.viewpager2.widget.b r13 = new androidx.viewpager2.widget.b
            androidx.recyclerview.widget.LinearLayoutManager r14 = r12.f3739g0
            r13.<init>(r14)
            r12.f3747o0 = r13
            androidx.viewpager2.widget.a r14 = r12.f3745m0
            java.util.List<androidx.viewpager2.widget.ViewPager2$e> r14 = r14.f3769a
            r14.add(r13)
            androidx.recyclerview.widget.RecyclerView r13 = r12.f3742j0
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            r12.attachViewToParent(r13, r0, r14)
            return
        L10f:
            r13 = move-exception
            r3.recycle()
            throw r13
    }

    /* renamed from: a */
    public boolean m2177a() {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r2.f3739g0
            int r0 = r0.m1860K()
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    /* renamed from: b */
    public final void m2178b() {
            r4 = this;
            int r0 = r4.f3740h0
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            androidx.recyclerview.widget.RecyclerView$e r0 = r4.getAdapter()
            if (r0 != 0) goto Ld
            return
        Ld:
            android.os.Parcelable r2 = r4.f3741i0
            if (r2 == 0) goto L1e
            boolean r3 = r0 instanceof androidx.viewpager2.adapter.InterfaceC0634a
            if (r3 == 0) goto L1b
            r3 = r0
            androidx.viewpager2.adapter.a r3 = (androidx.viewpager2.adapter.InterfaceC0634a) r3
            r3.m2176b(r2)
        L1b:
            r2 = 0
            r4.f3741i0 = r2
        L1e:
            r2 = 0
            int r3 = r4.f3740h0
            int r0 = r0.mo1521b()
            int r0 = r0 + (-1)
            int r0 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r2, r0)
            r4.f3736d0 = r0
            r4.f3740h0 = r1
            androidx.recyclerview.widget.RecyclerView r1 = r4.f3742j0
            r1.m1755g0(r0)
            androidx.viewpager2.widget.ViewPager2$b r0 = r4.f3752t0
            androidx.viewpager2.widget.ViewPager2$f r0 = (androidx.viewpager2.widget.ViewPager2.C0640f) r0
            r0.m2188d()
            return
    }

    /* renamed from: c */
    public void m2179c(int r2, boolean r3) {
            r1 = this;
            androidx.fragment.app.l0 r0 = r1.f3746n0
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r0.f2231a0
            androidx.viewpager2.widget.c r0 = (androidx.viewpager2.widget.C0648c) r0
            boolean r0 = r0.f3784m
            if (r0 != 0) goto Le
            r1.m2180d(r2, r3)
            return
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Cannot change current item when ViewPager2 is fake dragging"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f3742j0
            boolean r2 = r0.canScrollHorizontally(r2)
            return r2
    }

    @Override // android.view.View
    public boolean canScrollVertically(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f3742j0
            boolean r2 = r0.canScrollVertically(r2)
            return r2
    }

    /* renamed from: d */
    public void m2180d(int r10, boolean r11) {
            r9 = this;
            androidx.recyclerview.widget.RecyclerView$e r0 = r9.getAdapter()
            r1 = 0
            if (r0 != 0) goto L13
            int r11 = r9.f3740h0
            r0 = -1
            if (r11 == r0) goto L12
            int r10 = java.lang.Math.max(r10, r1)
            r9.f3740h0 = r10
        L12:
            return
        L13:
            int r2 = r0.mo1521b()
            if (r2 > 0) goto L1a
            return
        L1a:
            int r10 = java.lang.Math.max(r10, r1)
            int r0 = r0.mo1521b()
            r2 = 1
            int r0 = r0 - r2
            int r10 = java.lang.Math.min(r10, r0)
            int r0 = r9.f3736d0
            if (r10 != r0) goto L38
            androidx.viewpager2.widget.c r3 = r9.f3744l0
            int r3 = r3.f3777f
            if (r3 != 0) goto L34
            r3 = 1
            goto L35
        L34:
            r3 = 0
        L35:
            if (r3 == 0) goto L38
            return
        L38:
            if (r10 != r0) goto L3d
            if (r11 == 0) goto L3d
            return
        L3d:
            double r3 = (double) r0
            r9.f3736d0 = r10
            androidx.viewpager2.widget.ViewPager2$b r0 = r9.f3752t0
            androidx.viewpager2.widget.ViewPager2$f r0 = (androidx.viewpager2.widget.ViewPager2.C0640f) r0
            r0.m2188d()
            androidx.viewpager2.widget.c r0 = r9.f3744l0
            int r5 = r0.f3777f
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            if (r5 != 0) goto L5e
            r0.m2194f()
            androidx.viewpager2.widget.c$a r0 = r0.f3778g
            int r3 = r0.f3785a
            double r3 = (double) r3
            float r0 = r0.f3786b
            double r5 = (double) r0
            double r3 = r3 + r5
        L5e:
            androidx.viewpager2.widget.c r0 = r9.f3744l0
            r5 = 2
            if (r11 == 0) goto L65
            r6 = 2
            goto L66
        L65:
            r6 = 3
        L66:
            r0.f3776e = r6
            r0.f3784m = r1
            int r6 = r0.f3780i
            if (r6 == r10) goto L6f
            r1 = 1
        L6f:
            r0.f3780i = r10
            r0.m2192d(r5)
            if (r1 == 0) goto L79
            r0.m2191c(r10)
        L79:
            if (r11 != 0) goto L81
            androidx.recyclerview.widget.RecyclerView r11 = r9.f3742j0
            r11.m1755g0(r10)
            return
        L81:
            double r0 = (double) r10
            double r5 = r0 - r3
            double r5 = java.lang.Math.abs(r5)
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto La7
            androidx.recyclerview.widget.RecyclerView r11 = r9.f3742j0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L97
            int r0 = r10 + (-3)
            goto L99
        L97:
            int r0 = r10 + 3
        L99:
            r11.m1755g0(r0)
            androidx.recyclerview.widget.RecyclerView r11 = r9.f3742j0
            androidx.viewpager2.widget.ViewPager2$k r0 = new androidx.viewpager2.widget.ViewPager2$k
            r0.<init>(r10, r11)
            r11.post(r0)
            goto Lac
        La7:
            androidx.recyclerview.widget.RecyclerView r11 = r9.f3742j0
            r11.m1760j0(r10)
        Lac:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r4) {
            r3 = this;
            int r0 = r3.getId()
            java.lang.Object r0 = r4.get(r0)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2.C0644j
            if (r1 == 0) goto L22
            androidx.viewpager2.widget.ViewPager2$j r0 = (androidx.viewpager2.widget.ViewPager2.C0644j) r0
            int r0 = r0.f3764Y
            androidx.recyclerview.widget.RecyclerView r1 = r3.f3742j0
            int r1 = r1.getId()
            java.lang.Object r2 = r4.get(r0)
            r4.put(r1, r2)
            r4.remove(r0)
        L22:
            super.dispatchRestoreInstanceState(r4)
            r3.m2178b()
            return
    }

    /* renamed from: e */
    public void m2181e() {
            r2 = this;
            androidx.recyclerview.widget.e0 r0 = r2.f3743k0
            if (r0 == 0) goto L26
            androidx.recyclerview.widget.LinearLayoutManager r1 = r2.f3739g0
            android.view.View r0 = r0.mo2027c(r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            androidx.recyclerview.widget.LinearLayoutManager r1 = r2.f3739g0
            int r0 = r1.m1868R(r0)
            int r1 = r2.f3736d0
            if (r0 == r1) goto L22
            int r1 = r2.getScrollState()
            if (r1 != 0) goto L22
            androidx.viewpager2.widget.a r1 = r2.f3745m0
            r1.mo2186c(r0)
        L22:
            r0 = 0
            r2.f3737e0 = r0
            return
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Design assumption violated."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$b r0 = r1.f3752t0
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0 instanceof androidx.viewpager2.widget.ViewPager2.C0640f
            if (r0 == 0) goto L11
            androidx.viewpager2.widget.ViewPager2$b r0 = r1.f3752t0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "androidx.viewpager.widget.ViewPager"
            return r0
        L11:
            java.lang.CharSequence r0 = super.getAccessibilityClassName()
            return r0
    }

    public androidx.recyclerview.widget.RecyclerView.AbstractC0549e getAdapter() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f3742j0
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            return r0
    }

    public int getCurrentItem() {
            r1 = this;
            int r0 = r1.f3736d0
            return r0
    }

    public int getItemDecorationCount() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f3742j0
            int r0 = r0.getItemDecorationCount()
            return r0
    }

    public int getOffscreenPageLimit() {
            r1 = this;
            int r0 = r1.f3751s0
            return r0
    }

    public int getOrientation() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.f3739g0
            int r0 = r0.f3081p
            return r0
    }

    public int getPageSize() {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.f3742j0
            int r1 = r3.getOrientation()
            if (r1 != 0) goto L16
            int r1 = r0.getWidth()
            int r2 = r0.getPaddingLeft()
            int r1 = r1 - r2
            int r0 = r0.getPaddingRight()
            goto L23
        L16:
            int r1 = r0.getHeight()
            int r2 = r0.getPaddingTop()
            int r1 = r1 - r2
            int r0 = r0.getPaddingBottom()
        L23:
            int r1 = r1 - r0
            return r1
    }

    public int getScrollState() {
            r1 = this;
            androidx.viewpager2.widget.c r0 = r1.f3744l0
            int r0 = r0.f3777f
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
            r5 = this;
            super.onInitializeAccessibilityNodeInfo(r6)
            androidx.viewpager2.widget.ViewPager2$b r0 = r5.f3752t0
            androidx.viewpager2.widget.ViewPager2$f r0 = (androidx.viewpager2.widget.ViewPager2.C0640f) r0
            androidx.viewpager2.widget.ViewPager2 r1 = r0.f3758d
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L31
            androidx.viewpager2.widget.ViewPager2 r1 = r0.f3758d
            int r1 = r1.getOrientation()
            if (r1 != r2) goto L24
            androidx.viewpager2.widget.ViewPager2 r1 = r0.f3758d
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            int r1 = r1.mo1521b()
            goto L32
        L24:
            androidx.viewpager2.widget.ViewPager2 r1 = r0.f3758d
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            int r1 = r1.mo1521b()
            r4 = r1
            r1 = 0
            goto L33
        L31:
            r1 = 0
        L32:
            r4 = 0
        L33:
            o0.b$b r1 = p242o0.C4868b.b.m11001a(r1, r4, r3, r3)
            java.lang.Object r1 = r1.f19352a
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r1
            r6.setCollectionInfo(r1)
            androidx.viewpager2.widget.ViewPager2 r1 = r0.f3758d
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 != 0) goto L47
            goto L6c
        L47:
            int r1 = r1.mo1521b()
            if (r1 == 0) goto L6c
            androidx.viewpager2.widget.ViewPager2 r3 = r0.f3758d
            boolean r4 = r3.f3750r0
            if (r4 != 0) goto L54
            goto L6c
        L54:
            int r3 = r3.f3736d0
            if (r3 <= 0) goto L5d
            r3 = 8192(0x2000, float:1.148E-41)
            r6.addAction(r3)
        L5d:
            androidx.viewpager2.widget.ViewPager2 r0 = r0.f3758d
            int r0 = r0.f3736d0
            int r1 = r1 - r2
            if (r0 >= r1) goto L69
            r0 = 4096(0x1000, float:5.74E-42)
            r6.addAction(r0)
        L69:
            r6.setScrollable(r2)
        L6c:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r4 = r3.f3742j0
            int r4 = r4.getMeasuredWidth()
            androidx.recyclerview.widget.RecyclerView r0 = r3.f3742j0
            int r0 = r0.getMeasuredHeight()
            android.graphics.Rect r1 = r3.f3733a0
            int r2 = r3.getPaddingLeft()
            r1.left = r2
            android.graphics.Rect r1 = r3.f3733a0
            int r7 = r7 - r5
            int r5 = r3.getPaddingRight()
            int r7 = r7 - r5
            r1.right = r7
            android.graphics.Rect r5 = r3.f3733a0
            int r7 = r3.getPaddingTop()
            r5.top = r7
            android.graphics.Rect r5 = r3.f3733a0
            int r8 = r8 - r6
            int r6 = r3.getPaddingBottom()
            int r8 = r8 - r6
            r5.bottom = r8
            android.graphics.Rect r5 = r3.f3733a0
            android.graphics.Rect r6 = r3.f3734b0
            r7 = 8388659(0x800033, float:1.1755015E-38)
            android.view.Gravity.apply(r7, r4, r0, r5, r6)
            androidx.recyclerview.widget.RecyclerView r4 = r3.f3742j0
            android.graphics.Rect r5 = r3.f3734b0
            int r6 = r5.left
            int r7 = r5.top
            int r8 = r5.right
            int r5 = r5.bottom
            r4.layout(r6, r7, r8, r5)
            boolean r4 = r3.f3737e0
            if (r4 == 0) goto L50
            r3.m2181e()
        L50:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r6, int r7) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.f3742j0
            r5.measureChild(r0, r6, r7)
            androidx.recyclerview.widget.RecyclerView r0 = r5.f3742j0
            int r0 = r0.getMeasuredWidth()
            androidx.recyclerview.widget.RecyclerView r1 = r5.f3742j0
            int r1 = r1.getMeasuredHeight()
            androidx.recyclerview.widget.RecyclerView r2 = r5.f3742j0
            int r2 = r2.getMeasuredState()
            int r3 = r5.getPaddingLeft()
            int r4 = r5.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r0
            int r0 = r5.getPaddingTop()
            int r3 = r5.getPaddingBottom()
            int r3 = r3 + r0
            int r3 = r3 + r1
            int r0 = r5.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r4, r0)
            int r1 = r5.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r3, r1)
            int r6 = android.view.ViewGroup.resolveSizeAndState(r0, r6, r2)
            int r0 = r2 << 16
            int r7 = android.view.ViewGroup.resolveSizeAndState(r1, r7, r0)
            r5.setMeasuredDimension(r6, r7)
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.viewpager2.widget.ViewPager2.C0644j
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.viewpager2.widget.ViewPager2$j r2 = (androidx.viewpager2.widget.ViewPager2.C0644j) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            int r0 = r2.f3765Z
            r1.f3740h0 = r0
            android.os.Parcelable r2 = r2.f3766a0
            r1.f3741i0 = r2
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.viewpager2.widget.ViewPager2$j r1 = new androidx.viewpager2.widget.ViewPager2$j
            r1.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.f3742j0
            int r0 = r0.getId()
            r1.f3764Y = r0
            int r0 = r3.f3740h0
            r2 = -1
            if (r0 != r2) goto L18
            int r0 = r3.f3736d0
        L18:
            r1.f3765Z = r0
            android.os.Parcelable r0 = r3.f3741i0
            if (r0 == 0) goto L21
        L1e:
            r1.f3766a0 = r0
            goto L32
        L21:
            androidx.recyclerview.widget.RecyclerView r0 = r3.f3742j0
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            boolean r2 = r0 instanceof androidx.viewpager2.adapter.InterfaceC0634a
            if (r2 == 0) goto L32
            androidx.viewpager2.adapter.a r0 = (androidx.viewpager2.adapter.InterfaceC0634a) r0
            android.os.Parcelable r0 = r0.m2175a()
            goto L1e
        L32:
            return r1
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.Class<androidx.viewpager2.widget.ViewPager2> r0 = androidx.viewpager2.widget.ViewPager2.class
            java.lang.String r0 = "ViewPager2 does not support direct child views"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int r6, android.os.Bundle r7) {
            r5 = this;
            androidx.viewpager2.widget.ViewPager2$b r0 = r5.f3752t0
            androidx.viewpager2.widget.ViewPager2$f r0 = (androidx.viewpager2.widget.ViewPager2.C0640f) r0
            java.util.Objects.requireNonNull(r0)
            r0 = 0
            r1 = 1
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 8192(0x2000, float:1.148E-41)
            if (r6 == r3) goto L14
            if (r6 != r2) goto L12
            goto L14
        L12:
            r4 = 0
            goto L15
        L14:
            r4 = 1
        L15:
            if (r4 == 0) goto L40
            androidx.viewpager2.widget.ViewPager2$b r7 = r5.f3752t0
            androidx.viewpager2.widget.ViewPager2$f r7 = (androidx.viewpager2.widget.ViewPager2.C0640f) r7
            java.util.Objects.requireNonNull(r7)
            if (r6 == r3) goto L22
            if (r6 != r2) goto L23
        L22:
            r0 = 1
        L23:
            if (r0 == 0) goto L3a
            if (r6 != r3) goto L2f
            androidx.viewpager2.widget.ViewPager2 r6 = r7.f3758d
            int r6 = r6.getCurrentItem()
            int r6 = r6 - r1
            goto L36
        L2f:
            androidx.viewpager2.widget.ViewPager2 r6 = r7.f3758d
            int r6 = r6.getCurrentItem()
            int r6 = r6 + r1
        L36:
            r7.m2187c(r6)
            return r1
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L40:
            boolean r6 = super.performAccessibilityAction(r6, r7)
            return r6
    }

    public void setAdapter(androidx.recyclerview.widget.RecyclerView.AbstractC0549e r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.f3742j0
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            androidx.viewpager2.widget.ViewPager2$b r1 = r3.f3752t0
            androidx.viewpager2.widget.ViewPager2$f r1 = (androidx.viewpager2.widget.ViewPager2.C0640f) r1
            java.util.Objects.requireNonNull(r1)
            if (r0 == 0) goto L16
            androidx.recyclerview.widget.RecyclerView$g r1 = r1.f3757c
            androidx.recyclerview.widget.RecyclerView$f r2 = r0.f3228a
            r2.unregisterObserver(r1)
        L16:
            if (r0 == 0) goto L1f
            androidx.recyclerview.widget.RecyclerView$g r1 = r3.f3738f0
            androidx.recyclerview.widget.RecyclerView$f r0 = r0.f3228a
            r0.unregisterObserver(r1)
        L1f:
            androidx.recyclerview.widget.RecyclerView r0 = r3.f3742j0
            r0.setAdapter(r4)
            r0 = 0
            r3.f3736d0 = r0
            r3.m2178b()
            androidx.viewpager2.widget.ViewPager2$b r0 = r3.f3752t0
            androidx.viewpager2.widget.ViewPager2$f r0 = (androidx.viewpager2.widget.ViewPager2.C0640f) r0
            r0.m2188d()
            if (r4 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$g r0 = r0.f3757c
            androidx.recyclerview.widget.RecyclerView$f r1 = r4.f3228a
            r1.registerObserver(r0)
        L3a:
            if (r4 == 0) goto L43
            androidx.recyclerview.widget.RecyclerView$g r0 = r3.f3738f0
            androidx.recyclerview.widget.RecyclerView$f r4 = r4.f3228a
            r4.registerObserver(r0)
        L43:
            return
    }

    public void setCurrentItem(int r2) {
            r1 = this;
            r0 = 1
            r1.m2179c(r2, r0)
            return
    }

    @Override // android.view.View
    public void setLayoutDirection(int r1) {
            r0 = this;
            super.setLayoutDirection(r1)
            androidx.viewpager2.widget.ViewPager2$b r1 = r0.f3752t0
            androidx.viewpager2.widget.ViewPager2$f r1 = (androidx.viewpager2.widget.ViewPager2.C0640f) r1
            r1.m2188d()
            return
    }

    public void setOffscreenPageLimit(int r2) {
            r1 = this;
            r0 = 1
            if (r2 >= r0) goto Lf
            r0 = -1
            if (r2 != r0) goto L7
            goto Lf
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0"
            r2.<init>(r0)
            throw r2
        Lf:
            r1.f3751s0 = r2
            androidx.recyclerview.widget.RecyclerView r2 = r1.f3742j0
            r2.requestLayout()
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.f3739g0
            r0.m1702p1(r2)
            androidx.viewpager2.widget.ViewPager2$b r2 = r1.f3752t0
            androidx.viewpager2.widget.ViewPager2$f r2 = (androidx.viewpager2.widget.ViewPager2.C0640f) r2
            r2.m2188d()
            return
    }

    public void setPageTransformer(androidx.viewpager2.widget.ViewPager2.InterfaceC0641g r5) {
            r4 = this;
            boolean r0 = r4.f3749q0
            r1 = 0
            if (r5 == 0) goto L18
            if (r0 != 0) goto L12
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3742j0
            androidx.recyclerview.widget.RecyclerView$j r0 = r0.getItemAnimator()
            r4.f3748p0 = r0
            r0 = 1
            r4.f3749q0 = r0
        L12:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3742j0
            r0.setItemAnimator(r1)
            goto L26
        L18:
            if (r0 == 0) goto L26
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3742j0
            androidx.recyclerview.widget.RecyclerView$j r2 = r4.f3748p0
            r0.setItemAnimator(r2)
            r4.f3748p0 = r1
            r0 = 0
            r4.f3749q0 = r0
        L26:
            androidx.viewpager2.widget.b r0 = r4.f3747o0
            androidx.viewpager2.widget.ViewPager2$g r1 = r0.f3771b
            if (r5 != r1) goto L2d
            return
        L2d:
            r0.f3771b = r5
            if (r5 != 0) goto L32
            goto L54
        L32:
            androidx.viewpager2.widget.c r5 = r4.f3744l0
            r5.m2194f()
            androidx.viewpager2.widget.c$a r5 = r5.f3778g
            int r0 = r5.f3785a
            double r0 = (double) r0
            float r5 = r5.f3786b
            double r2 = (double) r5
            double r0 = r0 + r2
            int r5 = (int) r0
            double r2 = (double) r5
            double r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r4.getPageSize()
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            androidx.viewpager2.widget.b r2 = r4.f3747o0
            r2.mo2185b(r5, r0, r1)
        L54:
            return
    }

    public void setUserInputEnabled(boolean r1) {
            r0 = this;
            r0.f3750r0 = r1
            androidx.viewpager2.widget.ViewPager2$b r1 = r0.f3752t0
            androidx.viewpager2.widget.ViewPager2$f r1 = (androidx.viewpager2.widget.ViewPager2.C0640f) r1
            r1.m2188d()
            return
    }
}
