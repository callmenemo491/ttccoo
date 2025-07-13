package androidx.swiperefreshlayout.widget;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends android.view.ViewGroup implements p227n0.InterfaceC4651j, p227n0.InterfaceC4650i, p227n0.InterfaceC4648g {

    /* renamed from: L0 */
    public static final int[] f3685L0 = null;

    /* renamed from: A0 */
    public android.view.animation.Animation f3686A0;

    /* renamed from: B0 */
    public android.view.animation.Animation f3687B0;

    /* renamed from: C0 */
    public android.view.animation.Animation f3688C0;

    /* renamed from: D0 */
    public android.view.animation.Animation f3689D0;

    /* renamed from: E0 */
    public boolean f3690E0;

    /* renamed from: F0 */
    public int f3691F0;

    /* renamed from: G0 */
    public androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0629g f3692G0;

    /* renamed from: H0 */
    public boolean f3693H0;

    /* renamed from: I0 */
    public android.view.animation.Animation.AnimationListener f3694I0;

    /* renamed from: J0 */
    public final android.view.animation.Animation f3695J0;

    /* renamed from: K0 */
    public final android.view.animation.Animation f3696K0;

    /* renamed from: a0 */
    public android.view.View f3697a0;

    /* renamed from: b0 */
    public androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0630h f3698b0;

    /* renamed from: c0 */
    public boolean f3699c0;

    /* renamed from: d0 */
    public int f3700d0;

    /* renamed from: e0 */
    public float f3701e0;

    /* renamed from: f0 */
    public float f3702f0;

    /* renamed from: g0 */
    public final p227n0.C4652k f3703g0;

    /* renamed from: h0 */
    public final p227n0.C4649h f3704h0;

    /* renamed from: i0 */
    public final int[] f3705i0;

    /* renamed from: j0 */
    public final int[] f3706j0;

    /* renamed from: k0 */
    public final int[] f3707k0;

    /* renamed from: l0 */
    public boolean f3708l0;

    /* renamed from: m0 */
    public int f3709m0;

    /* renamed from: n0 */
    public int f3710n0;

    /* renamed from: o0 */
    public float f3711o0;

    /* renamed from: p0 */
    public float f3712p0;

    /* renamed from: q0 */
    public boolean f3713q0;

    /* renamed from: r0 */
    public int f3714r0;

    /* renamed from: s0 */
    public final android.view.animation.DecelerateInterpolator f3715s0;

    /* renamed from: t0 */
    public p301r1.C5761a f3716t0;

    /* renamed from: u0 */
    public int f3717u0;

    /* renamed from: v0 */
    public int f3718v0;

    /* renamed from: w0 */
    public int f3719w0;

    /* renamed from: x0 */
    public int f3720x0;

    /* renamed from: y0 */
    public int f3721y0;

    /* renamed from: z0 */
    public p301r1.C5764d f3722z0;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class AnimationAnimationListenerC0623a implements android.view.animation.Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f3723a;

        public AnimationAnimationListenerC0623a(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1) {
                r0 = this;
                r0.f3723a = r1
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r2) {
                r1 = this;
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r1.f3723a
                boolean r0 = r2.f3699c0
                if (r0 == 0) goto L2c
                r1.d r2 = r2.f3722z0
                r0 = 255(0xff, float:3.57E-43)
                r2.setAlpha(r0)
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r1.f3723a
                r1.d r2 = r2.f3722z0
                r2.start()
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r1.f3723a
                boolean r0 = r2.f3690E0
                if (r0 == 0) goto L21
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h r2 = r2.f3698b0
                if (r2 == 0) goto L21
                r2.mo2174e()
            L21:
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r1.f3723a
                r1.a r0 = r2.f3716t0
                int r0 = r0.getTop()
                r2.f3710n0 = r0
                goto L2f
            L2c:
                r2.m2165k()
            L2f:
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation r1) {
                r0 = this;
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C0624b extends android.view.animation.Animation {

        /* renamed from: Y */
        public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f3724Y;

        public C0624b(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1) {
                r0 = this;
                r0.f3724Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float r2, android.view.animation.Transformation r3) {
                r1 = this;
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r3 = r1.f3724Y
                r0 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 - r2
                r3.setAnimationProgress(r0)
                return
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C0625c extends android.view.animation.Animation {

        /* renamed from: Y */
        public final /* synthetic */ int f3725Y;

        /* renamed from: Z */
        public final /* synthetic */ int f3726Z;

        /* renamed from: a0 */
        public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f3727a0;

        public C0625c(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1, int r2, int r3) {
                r0 = this;
                r0.f3727a0 = r1
                r0.f3725Y = r2
                r0.f3726Z = r3
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float r4, android.view.animation.Transformation r5) {
                r3 = this;
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r5 = r3.f3727a0
                r1.d r5 = r5.f3722z0
                int r0 = r3.f3725Y
                float r1 = (float) r0
                int r2 = r3.f3726Z
                int r2 = r2 - r0
                float r0 = (float) r2
                float r0 = r0 * r4
                float r0 = r0 + r1
                int r4 = (int) r0
                r5.setAlpha(r4)
                return
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class AnimationAnimationListenerC0626d implements android.view.animation.Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f3728a;

        public AnimationAnimationListenerC0626d(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1) {
                r0 = this;
                r0.f3728a = r1
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r2) {
                r1 = this;
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r1.f3728a
                java.util.Objects.requireNonNull(r2)
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r1.f3728a
                r0 = 0
                r2.m2169r(r0)
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation r1) {
                r0 = this;
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public class C0627e extends android.view.animation.Animation {

        /* renamed from: Y */
        public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f3729Y;

        public C0627e(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1) {
                r0 = this;
                r0.f3729Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float r3, android.view.animation.Transformation r4) {
                r2 = this;
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r2.f3729Y
                java.util.Objects.requireNonNull(r4)
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r2.f3729Y
                int r0 = r4.f3720x0
                int r4 = r4.f3719w0
                int r4 = java.lang.Math.abs(r4)
                int r0 = r0 - r4
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r2.f3729Y
                int r1 = r4.f3718v0
                int r0 = r0 - r1
                float r0 = (float) r0
                float r0 = r0 * r3
                int r0 = (int) r0
                int r1 = r1 + r0
                r1.a r4 = r4.f3716t0
                int r4 = r4.getTop()
                int r1 = r1 - r4
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r2.f3729Y
                r4.setTargetOffsetTopAndBottom(r1)
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r2.f3729Y
                r1.d r4 = r4.f3722z0
                r0 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 - r3
                r1.d$a r3 = r4.f22190Y
                float r1 = r3.f22211p
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 == 0) goto L37
                r3.f22211p = r0
            L37:
                r4.invalidateSelf()
                return
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public class C0628f extends android.view.animation.Animation {

        /* renamed from: Y */
        public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f3730Y;

        public C0628f(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1) {
                r0 = this;
                r0.f3730Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float r1, android.view.animation.Transformation r2) {
                r0 = this;
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r0.f3730Y
                r2.m2163g(r1)
                return
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    public interface InterfaceC0629g {
        /* renamed from: a */
        boolean m2173a(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1, android.view.View r2);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    public interface InterfaceC0630h {
        /* renamed from: e */
        void mo2174e();
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public static class C0631i extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C0631i> CREATOR = null;

        /* renamed from: Y */
        public final boolean f3731Y;

        /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i$a */
        public class a implements android.os.Parcelable.Creator<androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C0631i> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C0631i createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i r0 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C0631i[] newArray(int r1) {
                    r0 = this;
                    androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i[] r1 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C0631i[r1]
                    return r1
            }
        }

        static {
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i$a r0 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i$a
                r0.<init>()
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C0631i.CREATOR = r0
                return
        }

        public C0631i(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                byte r1 = r1.readByte()
                if (r1 == 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                r0.f3731Y = r1
                return
        }

        public C0631i(android.os.Parcelable r1, boolean r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f3731Y = r2
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.f3731Y
                r1.writeByte(r2)
                return
        }
    }

    static {
            java.lang.Class<androidx.swiperefreshlayout.widget.SwipeRefreshLayout> r0 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.class
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842766(0x101000e, float:2.3693597E-38)
            r0[r1] = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f3685L0 = r0
            return
    }

    public SwipeRefreshLayout(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r5.<init>(r6, r7)
            r0 = 0
            r5.f3699c0 = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.f3701e0 = r1
            r1 = 2
            int[] r2 = new int[r1]
            r5.f3705i0 = r2
            int[] r2 = new int[r1]
            r5.f3706j0 = r2
            int[] r1 = new int[r1]
            r5.f3707k0 = r1
            r1 = -1
            r5.f3714r0 = r1
            r5.f3717u0 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a r1 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a
            r1.<init>(r5)
            r5.f3694I0 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e r1 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e
            r1.<init>(r5)
            r5.f3695J0 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f r1 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f
            r1.<init>(r5)
            r5.f3696K0 = r1
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r6)
            int r1 = r1.getScaledTouchSlop()
            r5.f3700d0 = r1
            android.content.res.Resources r1 = r5.getResources()
            r2 = 17694721(0x10e0001, float:2.6081284E-38)
            int r1 = r1.getInteger(r2)
            r5.f3709m0 = r1
            r5.setWillNotDraw(r0)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2)
            r5.f3715s0 = r1
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r2 = r1.density
            r3 = 1109393408(0x42200000, float:40.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            r5.f3691F0 = r2
            r1.a r2 = new r1.a
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3)
            r5.f3716t0 = r2
            r1.d r2 = new r1.d
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3)
            r5.f3722z0 = r2
            r3 = 1
            r2.m12081e(r3)
            r1.a r2 = r5.f3716t0
            r1.d r4 = r5.f3722z0
            r2.setImageDrawable(r4)
            r1.a r2 = r5.f3716t0
            r4 = 8
            r2.setVisibility(r4)
            r1.a r2 = r5.f3716t0
            r5.addView(r2)
            r5.setChildrenDrawingOrderEnabled(r3)
            r2 = 1115684864(0x42800000, float:64.0)
            float r1 = r1.density
            float r1 = r1 * r2
            int r1 = (int) r1
            r5.f3720x0 = r1
            float r1 = (float) r1
            r5.f3701e0 = r1
            n0.k r1 = new n0.k
            r1.<init>()
            r5.f3703g0 = r1
            n0.h r1 = new n0.h
            r1.<init>(r5)
            r5.f3704h0 = r1
            r5.setNestedScrollingEnabled(r3)
            int r1 = r5.f3691F0
            int r1 = -r1
            r5.f3710n0 = r1
            r5.f3719w0 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r5.m2163g(r1)
            int[] r1 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f3685L0
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r1)
            boolean r7 = r6.getBoolean(r0, r3)
            r5.setEnabled(r7)
            r6.recycle()
            return
    }

    private void setColorViewAlpha(int r3) {
            r2 = this;
            r1.a r0 = r2.f3716t0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.setAlpha(r3)
            r1.d r0 = r2.f3722z0
            r1.d$a r1 = r0.f22190Y
            r1.f22215t = r3
            r0.invalidateSelf()
            return
    }

    /* renamed from: a */
    public boolean m2158a() {
            r3 = this;
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g r0 = r3.f3692G0
            if (r0 == 0) goto Lb
            android.view.View r1 = r3.f3697a0
            boolean r0 = r0.m2173a(r3, r1)
            return r0
        Lb:
            android.view.View r0 = r3.f3697a0
            boolean r1 = r0 instanceof android.widget.ListView
            r2 = -1
            if (r1 == 0) goto L19
            android.widget.ListView r0 = (android.widget.ListView) r0
            boolean r0 = r0.canScrollList(r2)
            return r0
        L19:
            boolean r0 = r0.canScrollVertically(r2)
            return r0
    }

    /* renamed from: b */
    public final void m2159b() {
            r3 = this;
            android.view.View r0 = r3.f3697a0
            if (r0 != 0) goto L1d
            r0 = 0
        L5:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1d
            android.view.View r1 = r3.getChildAt(r0)
            r1.a r2 = r3.f3716t0
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L1a
            r3.f3697a0 = r1
            goto L1d
        L1a:
            int r0 = r0 + 1
            goto L5
        L1d:
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: c */
    public void mo554c(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    /* renamed from: d */
    public final void m2160d(float r5) {
            r4 = this;
            float r0 = r4.f3701e0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto Lb
            r5 = 1
            r4.m2166l(r5, r5)
            goto L51
        Lb:
            r5 = 0
            r4.f3699c0 = r5
            r1.d r0 = r4.f3722z0
            r1.d$a r1 = r0.f22190Y
            r2 = 0
            r1.f22200e = r2
            r1.f22201f = r2
            r0.invalidateSelf()
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d r0 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d
            r0.<init>(r4)
            int r1 = r4.f3710n0
            r4.f3718v0 = r1
            android.view.animation.Animation r1 = r4.f3696K0
            r1.reset()
            android.view.animation.Animation r1 = r4.f3696K0
            r2 = 200(0xc8, double:9.9E-322)
            r1.setDuration(r2)
            android.view.animation.Animation r1 = r4.f3696K0
            android.view.animation.DecelerateInterpolator r2 = r4.f3715s0
            r1.setInterpolator(r2)
            r1.a r1 = r4.f3716t0
            r1.f22181a0 = r0
            r1.clearAnimation()
            r1.a r0 = r4.f3716t0
            android.view.animation.Animation r1 = r4.f3696K0
            r0.startAnimation(r1)
            r1.d r0 = r4.f3722z0
            r1.d$a r1 = r0.f22190Y
            boolean r2 = r1.f22209n
            if (r2 == 0) goto L4e
            r1.f22209n = r5
        L4e:
            r0.invalidateSelf()
        L51:
            return
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            n0.h r0 = r1.f3704h0
            boolean r2 = r0.m10503a(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            n0.h r0 = r1.f3704h0
            boolean r2 = r0.m10504b(r2, r3)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
            r1 = this;
            n0.h r0 = r1.f3704h0
            boolean r2 = r0.m10505c(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            n0.h r0 = r6.f3704h0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m10508f(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: e */
    public final boolean m2161e(android.view.animation.Animation r2) {
            r1 = this;
            if (r2 == 0) goto L10
            boolean r0 = r2.hasStarted()
            if (r0 == 0) goto L10
            boolean r2 = r2.hasEnded()
            if (r2 != 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    /* renamed from: f */
    public final void m2162f(float r12) {
            r11 = this;
            r1.d r0 = r11.f3722z0
            r1.d$a r1 = r0.f22190Y
            boolean r2 = r1.f22209n
            r3 = 1
            if (r2 == r3) goto Lb
            r1.f22209n = r3
        Lb:
            r0.invalidateSelf()
            float r0 = r11.f3701e0
            float r0 = r12 / r0
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r1, r0)
            double r2 = (double) r0
            r4 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r2 = r2 - r4
            r4 = 0
            double r2 = java.lang.Math.max(r2, r4)
            float r2 = (float) r2
            r3 = 1084227584(0x40a00000, float:5.0)
            float r2 = r2 * r3
            r3 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 / r3
            float r3 = java.lang.Math.abs(r12)
            float r4 = r11.f3701e0
            float r3 = r3 - r4
            int r4 = r11.f3721y0
            if (r4 <= 0) goto L3d
            goto L3f
        L3d:
            int r4 = r11.f3720x0
        L3f:
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r4 * r5
            float r3 = java.lang.Math.min(r3, r6)
            float r3 = r3 / r4
            r6 = 0
            float r3 = java.lang.Math.max(r6, r3)
            r7 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 / r7
            double r7 = (double) r3
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r9 = java.lang.Math.pow(r7, r9)
            double r7 = r7 - r9
            float r3 = (float) r7
            float r3 = r3 * r5
            float r7 = r4 * r3
            float r7 = r7 * r5
            int r8 = r11.f3719w0
            float r4 = r4 * r0
            float r4 = r4 + r7
            int r0 = (int) r4
            int r8 = r8 + r0
            r1.a r0 = r11.f3716t0
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L75
            r1.a r0 = r11.f3716t0
            r4 = 0
            r0.setVisibility(r4)
        L75:
            r1.a r0 = r11.f3716t0
            r0.setScaleX(r1)
            r1.a r0 = r11.f3716t0
            r0.setScaleY(r1)
            float r0 = r11.f3701e0
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 >= 0) goto La4
            r1.d r12 = r11.f3722z0
            r1.d$a r12 = r12.f22190Y
            int r12 = r12.f22215t
            r0 = 76
            if (r12 <= r0) goto Lc2
            android.view.animation.Animation r12 = r11.f3688C0
            boolean r12 = r11.m2161e(r12)
            if (r12 != 0) goto Lc2
            r1.d r12 = r11.f3722z0
            r1.d$a r12 = r12.f22190Y
            int r12 = r12.f22215t
            android.view.animation.Animation r12 = r11.m2167p(r12, r0)
            r11.f3688C0 = r12
            goto Lc2
        La4:
            r1.d r12 = r11.f3722z0
            r1.d$a r12 = r12.f22190Y
            int r12 = r12.f22215t
            r0 = 255(0xff, float:3.57E-43)
            if (r12 >= r0) goto Lc2
            android.view.animation.Animation r12 = r11.f3689D0
            boolean r12 = r11.m2161e(r12)
            if (r12 != 0) goto Lc2
            r1.d r12 = r11.f3722z0
            r1.d$a r12 = r12.f22190Y
            int r12 = r12.f22215t
            android.view.animation.Animation r12 = r11.m2167p(r12, r0)
            r11.f3689D0 = r12
        Lc2:
            r12 = 1061997773(0x3f4ccccd, float:0.8)
            float r0 = r2 * r12
            r1.d r4 = r11.f3722z0
            float r12 = java.lang.Math.min(r12, r0)
            r1.d$a r0 = r4.f22190Y
            r0.f22200e = r6
            r0.f22201f = r12
            r4.invalidateSelf()
            r1.d r12 = r11.f3722z0
            float r0 = java.lang.Math.min(r1, r2)
            r1.d$a r1 = r12.f22190Y
            float r4 = r1.f22211p
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto Le6
            r1.f22211p = r0
        Le6:
            r12.invalidateSelf()
            r12 = -1098907648(0xffffffffbe800000, float:-0.25)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            float r2 = r2 * r0
            float r2 = r2 + r12
            float r3 = r3 * r5
            float r3 = r3 + r2
            r12 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r12
            r1.d r12 = r11.f3722z0
            r1.d$a r0 = r12.f22190Y
            r0.f22202g = r3
            r12.invalidateSelf()
            int r12 = r11.f3710n0
            int r8 = r8 - r12
            r11.setTargetOffsetTopAndBottom(r8)
            return
    }

    /* renamed from: g */
    public void m2163g(float r3) {
            r2 = this;
            int r0 = r2.f3718v0
            int r1 = r2.f3719w0
            int r1 = r1 - r0
            float r1 = (float) r1
            float r1 = r1 * r3
            int r3 = (int) r1
            int r0 = r0 + r3
            r1.a r3 = r2.f3716t0
            int r3 = r3.getTop()
            int r0 = r0 - r3
            r2.setTargetOffsetTopAndBottom(r0)
            return
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int r2, int r3) {
            r1 = this;
            int r0 = r1.f3717u0
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r2 = r2 + (-1)
            if (r3 != r2) goto La
            return r0
        La:
            if (r3 < r0) goto Le
            int r3 = r3 + 1
        Le:
            return r3
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            n0.k r0 = r1.f3703g0
            int r0 = r0.m10516a()
            return r0
    }

    public int getProgressCircleDiameter() {
            r1 = this;
            int r0 = r1.f3691F0
            return r0
    }

    public int getProgressViewEndOffset() {
            r1 = this;
            int r0 = r1.f3720x0
            return r0
    }

    public int getProgressViewStartOffset() {
            r1 = this;
            int r0 = r1.f3719w0
            return r0
    }

    /* renamed from: h */
    public final void m2164h(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.f3714r0
            if (r1 != r2) goto L17
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            int r4 = r4.getPointerId(r0)
            r3.f3714r0 = r4
        L17:
            return
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
            r1 = this;
            n0.h r0 = r1.f3704h0
            boolean r0 = r0.m10511i()
            return r0
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: i */
    public void mo560i(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            n0.h r0 = r1.f3704h0
            boolean r0 = r0.f18561d
            return r0
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: j */
    public void mo561j(android.view.View r1, int r2, int r3, int[] r4, int r5) {
            r0 = this;
            if (r5 != 0) goto L5
            r0.onNestedPreScroll(r1, r2, r3, r4)
        L5:
            return
    }

    /* renamed from: k */
    public void m2165k() {
            r2 = this;
            r1.a r0 = r2.f3716t0
            r0.clearAnimation()
            r1.d r0 = r2.f3722z0
            r0.stop()
            r1.a r0 = r2.f3716t0
            r1 = 8
            r0.setVisibility(r1)
            r0 = 255(0xff, float:3.57E-43)
            r2.setColorViewAlpha(r0)
            int r0 = r2.f3719w0
            int r1 = r2.f3710n0
            int r0 = r0 - r1
            r2.setTargetOffsetTopAndBottom(r0)
            r1.a r0 = r2.f3716t0
            int r0 = r0.getTop()
            r2.f3710n0 = r0
            return
    }

    /* renamed from: l */
    public final void m2166l(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.f3699c0
            if (r0 == r3) goto L3e
            r2.f3690E0 = r4
            r2.m2159b()
            r2.f3699c0 = r3
            if (r3 == 0) goto L39
            int r3 = r2.f3710n0
            android.view.animation.Animation$AnimationListener r4 = r2.f3694I0
            r2.f3718v0 = r3
            android.view.animation.Animation r3 = r2.f3695J0
            r3.reset()
            android.view.animation.Animation r3 = r2.f3695J0
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            android.view.animation.Animation r3 = r2.f3695J0
            android.view.animation.DecelerateInterpolator r0 = r2.f3715s0
            r3.setInterpolator(r0)
            if (r4 == 0) goto L2c
            r1.a r3 = r2.f3716t0
            r3.f22181a0 = r4
        L2c:
            r1.a r3 = r2.f3716t0
            r3.clearAnimation()
            r1.a r3 = r2.f3716t0
            android.view.animation.Animation r4 = r2.f3695J0
            r3.startAnimation(r4)
            goto L3e
        L39:
            android.view.animation.Animation$AnimationListener r3 = r2.f3694I0
            r2.m2169r(r3)
        L3e:
            return
    }

    @Override // p227n0.InterfaceC4651j
    /* renamed from: m */
    public void mo564m(android.view.View r12, int r13, int r14, int r15, int r16, int r17, int[] r18) {
            r11 = this;
            r0 = r11
            if (r17 == 0) goto L4
            return
        L4:
            r9 = 1
            r10 = r18[r9]
            int[] r6 = r0.f3706j0
            if (r17 != 0) goto L19
            n0.h r1 = r0.f3704h0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r17
            r8 = r18
            r1.m10507e(r2, r3, r4, r5, r6, r7, r8)
        L19:
            r1 = r18[r9]
            int r1 = r1 - r10
            int r1 = r16 - r1
            if (r1 != 0) goto L27
            int[] r2 = r0.f3706j0
            r2 = r2[r9]
            int r2 = r16 + r2
            goto L28
        L27:
            r2 = r1
        L28:
            if (r2 >= 0) goto L42
            boolean r3 = r11.m2158a()
            if (r3 != 0) goto L42
            float r3 = r0.f3702f0
            int r2 = java.lang.Math.abs(r2)
            float r2 = (float) r2
            float r3 = r3 + r2
            r0.f3702f0 = r3
            r11.m2162f(r3)
            r2 = r18[r9]
            int r2 = r2 + r1
            r18[r9] = r2
        L42:
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: n */
    public void mo565n(android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            int[] r7 = r8.f3707k0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.mo564m(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: o */
    public boolean mo566o(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L7
            boolean r1 = r0.onStartNestedScroll(r1, r2, r3)
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.m2165k()
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            r4.m2159b()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.isEnabled()
            r2 = 0
            if (r1 == 0) goto L75
            boolean r1 = r4.m2158a()
            if (r1 != 0) goto L75
            boolean r1 = r4.f3699c0
            if (r1 != 0) goto L75
            boolean r1 = r4.f3708l0
            if (r1 == 0) goto L1d
            goto L75
        L1d:
            if (r0 == 0) goto L51
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L4c
            r1 = 2
            if (r0 == r1) goto L31
            r1 = 3
            if (r0 == r1) goto L4c
            r1 = 6
            if (r0 == r1) goto L2d
            goto L72
        L2d:
            r4.m2164h(r5)
            goto L72
        L31:
            int r0 = r4.f3714r0
            if (r0 != r3) goto L3d
            java.lang.String r5 = "SwipeRefreshLayout"
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L3d:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L44
            return r2
        L44:
            float r5 = r5.getY(r0)
            r4.m2168q(r5)
            goto L72
        L4c:
            r4.f3713q0 = r2
            r4.f3714r0 = r3
            goto L72
        L51:
            int r0 = r4.f3719w0
            r1.a r1 = r4.f3716t0
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.f3714r0 = r0
            r4.f3713q0 = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L6c
            return r2
        L6c:
            float r5 = r5.getY(r0)
            r4.f3712p0 = r5
        L72:
            boolean r5 = r4.f3713q0
            return r5
        L75:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r3 = r2.getMeasuredWidth()
            int r4 = r2.getMeasuredHeight()
            int r5 = r2.getChildCount()
            if (r5 != 0) goto Lf
            return
        Lf:
            android.view.View r5 = r2.f3697a0
            if (r5 != 0) goto L16
            r2.m2159b()
        L16:
            android.view.View r5 = r2.f3697a0
            if (r5 != 0) goto L1b
            return
        L1b:
            int r6 = r2.getPaddingLeft()
            int r7 = r2.getPaddingTop()
            int r0 = r2.getPaddingLeft()
            int r0 = r3 - r0
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r2.getPaddingTop()
            int r4 = r4 - r1
            int r1 = r2.getPaddingBottom()
            int r4 = r4 - r1
            int r0 = r0 + r6
            int r4 = r4 + r7
            r5.layout(r6, r7, r0, r4)
            r1.a r4 = r2.f3716t0
            int r4 = r4.getMeasuredWidth()
            r1.a r5 = r2.f3716t0
            int r5 = r5.getMeasuredHeight()
            r1.a r6 = r2.f3716t0
            int r3 = r3 / 2
            int r4 = r4 / 2
            int r7 = r3 - r4
            int r0 = r2.f3710n0
            int r3 = r3 + r4
            int r5 = r5 + r0
            r6.layout(r7, r0, r3, r5)
            return
    }

    @Override // android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f3697a0
            if (r4 != 0) goto La
            r3.m2159b()
        La:
            android.view.View r4 = r3.f3697a0
            if (r4 != 0) goto Lf
            return
        Lf:
            int r5 = r3.getMeasuredWidth()
            int r0 = r3.getPaddingLeft()
            int r5 = r5 - r0
            int r0 = r3.getPaddingRight()
            int r5 = r5 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            int r1 = r3.getMeasuredHeight()
            int r2 = r3.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r3.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r4.measure(r5, r1)
            r1.a r4 = r3.f3716t0
            int r5 = r3.f3691F0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            int r1 = r3.f3691F0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r4.measure(r5, r0)
            r4 = -1
            r3.f3717u0 = r4
            r4 = 0
        L4d:
            int r5 = r3.getChildCount()
            if (r4 >= r5) goto L61
            android.view.View r5 = r3.getChildAt(r4)
            r1.a r0 = r3.f3716t0
            if (r5 != r0) goto L5e
            r3.f3717u0 = r4
            goto L61
        L5e:
            int r4 = r4 + 1
            goto L4d
        L61:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            boolean r1 = r0.dispatchNestedFling(r2, r3, r4)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            boolean r1 = r0.dispatchNestedPreFling(r2, r3)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View r5, int r6, int r7, int[] r8) {
            r4 = this;
            r5 = 1
            if (r7 <= 0) goto L1f
            float r0 = r4.f3702f0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1f
            float r2 = (float) r7
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L15
            int r0 = (int) r0
            r8[r5] = r0
            r4.f3702f0 = r1
            goto L1a
        L15:
            float r0 = r0 - r2
            r4.f3702f0 = r0
            r8[r5] = r7
        L1a:
            float r0 = r4.f3702f0
            r4.m2162f(r0)
        L1f:
            int[] r0 = r4.f3705i0
            r1 = 0
            r2 = r8[r1]
            int r6 = r6 - r2
            r2 = r8[r5]
            int r7 = r7 - r2
            r2 = 0
            boolean r6 = r4.dispatchNestedPreScroll(r6, r7, r0, r2)
            if (r6 == 0) goto L3d
            r6 = r8[r1]
            r7 = r0[r1]
            int r6 = r6 + r7
            r8[r1] = r6
            r6 = r8[r5]
            r7 = r0[r5]
            int r6 = r6 + r7
            r8[r5] = r6
        L3d:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            int[] r7 = r8.f3707k0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.mo564m(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            n0.k r1 = r0.f3703g0
            r1.f18563a = r3
            r1 = r3 & 2
            r0.startNestedScroll(r1)
            r1 = 0
            r0.f3702f0 = r1
            r1 = 1
            r0.f3708l0 = r1
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i r2 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C0631i) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.f3731Y
            r1.setRefreshing(r2)
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i r1 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i
            boolean r2 = r3.f3699c0
            r1.<init>(r0, r2)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L10
            boolean r1 = r0.f3699c0
            if (r1 != 0) goto L10
            r1 = r3 & 2
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View r3) {
            r2 = this;
            n0.k r3 = r2.f3703g0
            r0 = 0
            r3.m10517b(r0)
            r2.f3708l0 = r0
            float r3 = r2.f3702f0
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L14
            r2.m2160d(r3)
            r2.f3702f0 = r0
        L14:
            r2.stopNestedScroll()
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getActionMasked()
            boolean r1 = r6.isEnabled()
            r2 = 0
            if (r1 == 0) goto La6
            boolean r1 = r6.m2158a()
            if (r1 != 0) goto La6
            boolean r1 = r6.f3699c0
            if (r1 != 0) goto La6
            boolean r1 = r6.f3708l0
            if (r1 == 0) goto L1b
            goto La6
        L1b:
            r1 = 1
            if (r0 == 0) goto L9d
            r3 = 1056964608(0x3f000000, float:0.5)
            java.lang.String r4 = "SwipeRefreshLayout"
            if (r0 == r1) goto L79
            r5 = 2
            if (r0 == r5) goto L4a
            r3 = 3
            if (r0 == r3) goto L49
            r3 = 5
            if (r0 == r3) goto L36
            r2 = 6
            if (r0 == r2) goto L32
            goto La5
        L32:
            r6.m2164h(r7)
            goto La5
        L36:
            int r0 = r7.getActionIndex()
            if (r0 >= 0) goto L42
            java.lang.String r7 = "Got ACTION_POINTER_DOWN event but have an invalid action index."
            android.util.Log.e(r4, r7)
            return r2
        L42:
            int r7 = r7.getPointerId(r0)
            r6.f3714r0 = r7
            goto La5
        L49:
            return r2
        L4a:
            int r0 = r6.f3714r0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L58
            java.lang.String r7 = "Got ACTION_MOVE event but have an invalid active pointer id."
            android.util.Log.e(r4, r7)
            return r2
        L58:
            float r7 = r7.getY(r0)
            r6.m2168q(r7)
            boolean r0 = r6.f3713q0
            if (r0 == 0) goto La5
            float r0 = r6.f3711o0
            float r7 = r7 - r0
            float r7 = r7 * r3
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L78
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            r6.m2162f(r7)
            goto La5
        L78:
            return r2
        L79:
            int r0 = r6.f3714r0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L87
            java.lang.String r7 = "Got ACTION_UP event but don't have an active pointer id."
            android.util.Log.e(r4, r7)
            return r2
        L87:
            boolean r1 = r6.f3713q0
            if (r1 == 0) goto L99
            float r7 = r7.getY(r0)
            float r0 = r6.f3711o0
            float r7 = r7 - r0
            float r7 = r7 * r3
            r6.f3713q0 = r2
            r6.m2160d(r7)
        L99:
            r7 = -1
            r6.f3714r0 = r7
            return r2
        L9d:
            int r7 = r7.getPointerId(r2)
            r6.f3714r0 = r7
            r6.f3713q0 = r2
        La5:
            return r1
        La6:
            return r2
    }

    /* renamed from: p */
    public final android.view.animation.Animation m2167p(int r2, int r3) {
            r1 = this;
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c r0 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c
            r0.<init>(r1, r2, r3)
            r2 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r2)
            r1.a r2 = r1.f3716t0
            r3 = 0
            r2.f22181a0 = r3
            r2.clearAnimation()
            r1.a r2 = r1.f3716t0
            r2.startAnimation(r0)
            return r0
    }

    /* renamed from: q */
    public final void m2168q(float r4) {
            r3 = this;
            float r0 = r3.f3712p0
            float r4 = r4 - r0
            int r1 = r3.f3700d0
            float r2 = (float) r1
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            boolean r4 = r3.f3713q0
            if (r4 != 0) goto L1c
            float r4 = (float) r1
            float r0 = r0 + r4
            r3.f3711o0 = r0
            r4 = 1
            r3.f3713q0 = r4
            r1.d r4 = r3.f3722z0
            r0 = 76
            r4.setAlpha(r0)
        L1c:
            return
    }

    /* renamed from: r */
    public void m2169r(android.view.animation.Animation.AnimationListener r4) {
            r3 = this;
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b r0 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b
            r0.<init>(r3)
            r3.f3687B0 = r0
            r1 = 150(0x96, double:7.4E-322)
            r0.setDuration(r1)
            r1.a r0 = r3.f3716t0
            r0.f22181a0 = r4
            r0.clearAnimation()
            r1.a r4 = r3.f3716t0
            android.view.animation.Animation r0 = r3.f3687B0
            r4.startAnimation(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r3) {
            r2 = this;
            android.view.View r0 = r2.f3697a0
            if (r0 == 0) goto L1b
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.h.m10611p(r0)
            if (r0 != 0) goto L1b
            boolean r0 = r2.f3693H0
            if (r0 == 0) goto L11
            goto L1e
        L11:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L1e
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L1e
        L1b:
            super.requestDisallowInterceptTouchEvent(r3)
        L1e:
            return
    }

    public void setAnimationProgress(float r2) {
            r1 = this;
            r1.a r0 = r1.f3716t0
            r0.setScaleX(r2)
            r1.a r0 = r1.f3716t0
            r0.setScaleY(r2)
            return
    }

    @java.lang.Deprecated
    public void setColorScheme(int... r1) {
            r0 = this;
            r0.setColorSchemeResources(r1)
            return
    }

    public void setColorSchemeColors(int... r2) {
            r1 = this;
            r1.m2159b()
            r1.d r0 = r1.f3722z0
            r0.m12078b(r2)
            return
    }

    public void setColorSchemeResources(int... r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int r1 = r5.length
            int[] r1 = new int[r1]
            r2 = 0
        L8:
            int r3 = r5.length
            if (r2 >= r3) goto L16
            r3 = r5[r2]
            int r3 = p046d0.C1259a.m3706b(r0, r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L8
        L16:
            r4.setColorSchemeColors(r1)
            return
    }

    public void setDistanceToTriggerSync(int r1) {
            r0 = this;
            float r1 = (float) r1
            r0.f3701e0 = r1
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            super.setEnabled(r1)
            if (r1 != 0) goto L8
            r0.m2165k()
        L8:
            return
    }

    @java.lang.Deprecated
    /* renamed from: setLegacyRequestDisallowInterceptTouchEventEnabled */
    public void m2170x3763a7c3(boolean r1) {
            r0 = this;
            r0.f3693H0 = r1
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r4) {
            r3 = this;
            n0.h r0 = r3.f3704h0
            boolean r1 = r0.f18561d
            if (r1 == 0) goto Ld
            android.view.View r1 = r0.f18560c
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.h.m10621z(r1)
        Ld:
            r0.f18561d = r4
            return
    }

    public void setOnChildScrollUpCallback(androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0629g r1) {
            r0 = this;
            r0.f3692G0 = r1
            return
    }

    public void setOnRefreshListener(androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0630h r1) {
            r0 = this;
            r0.f3698b0 = r1
            return
    }

    @java.lang.Deprecated
    public void setProgressBackgroundColor(int r1) {
            r0 = this;
            r0.m2172x92c6f499(r1)
            return
    }

    /* renamed from: setProgressBackgroundColorSchemeColor */
    public void m2171xe4c5c2b8(int r2) {
            r1 = this;
            r1.a r0 = r1.f3716t0
            r0.setBackgroundColor(r2)
            return
    }

    /* renamed from: setProgressBackgroundColorSchemeResource */
    public void m2172x92c6f499(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = p046d0.C1259a.m3706b(r0, r2)
            r1.m2171xe4c5c2b8(r2)
            return
    }

    public void setRefreshing(boolean r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L44
            boolean r1 = r3.f3699c0
            if (r1 == r4) goto L44
            r3.f3699c0 = r4
            int r4 = r3.f3720x0
            int r1 = r3.f3719w0
            int r4 = r4 + r1
            int r1 = r3.f3710n0
            int r4 = r4 - r1
            r3.setTargetOffsetTopAndBottom(r4)
            r3.f3690E0 = r0
            android.view.animation.Animation$AnimationListener r4 = r3.f3694I0
            r1.a r1 = r3.f3716t0
            r1.setVisibility(r0)
            r1.d r0 = r3.f3722z0
            r1 = 255(0xff, float:3.57E-43)
            r0.setAlpha(r1)
            r1.e r0 = new r1.e
            r0.<init>(r3)
            r3.f3686A0 = r0
            int r1 = r3.f3709m0
            long r1 = (long) r1
            r0.setDuration(r1)
            if (r4 == 0) goto L37
            r1.a r0 = r3.f3716t0
            r0.f22181a0 = r4
        L37:
            r1.a r4 = r3.f3716t0
            r4.clearAnimation()
            r1.a r4 = r3.f3716t0
            android.view.animation.Animation r0 = r3.f3686A0
            r4.startAnimation(r0)
            goto L47
        L44:
            r3.m2166l(r4, r0)
        L47:
            return
    }

    public void setSize(int r3) {
            r2 = this;
            if (r3 == 0) goto L6
            r0 = 1
            if (r3 == r0) goto L6
            return
        L6:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r3 != 0) goto L13
            r1 = 1113587712(0x42600000, float:56.0)
            goto L15
        L13:
            r1 = 1109393408(0x42200000, float:40.0)
        L15:
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.f3691F0 = r0
            r1.a r0 = r2.f3716t0
            r1 = 0
            r0.setImageDrawable(r1)
            r1.d r0 = r2.f3722z0
            r0.m12081e(r3)
            r1.a r3 = r2.f3716t0
            r1.d r0 = r2.f3722z0
            r3.setImageDrawable(r0)
            return
    }

    public void setSlingshotDistance(int r1) {
            r0 = this;
            r0.f3721y0 = r1
            return
    }

    public void setTargetOffsetTopAndBottom(int r2) {
            r1 = this;
            r1.a r0 = r1.f3716t0
            r0.bringToFront()
            r1.a r0 = r1.f3716t0
            p227n0.C4661t.m10539o(r0, r2)
            r1.a r2 = r1.f3716t0
            int r2 = r2.getTop()
            r1.f3710n0 = r2
            return
    }

    @Override // android.view.View
    public boolean startNestedScroll(int r3) {
            r2 = this;
            n0.h r0 = r2.f3704h0
            r1 = 0
            boolean r3 = r0.m10514l(r3, r1)
            return r3
    }

    @Override // android.view.View
    public void stopNestedScroll() {
            r2 = this;
            n0.h r0 = r2.f3704h0
            r1 = 0
            r0.m10515m(r1)
            return
    }
}
