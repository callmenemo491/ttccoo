package com.google.android.material.appbar;

/* loaded from: classes.dex */
public class AppBarLayout extends android.widget.LinearLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b {

    /* renamed from: a0 */
    public int f5743a0;

    /* renamed from: b0 */
    public int f5744b0;

    /* renamed from: c0 */
    public int f5745c0;

    /* renamed from: d0 */
    public int f5746d0;

    /* renamed from: e0 */
    public boolean f5747e0;

    /* renamed from: f0 */
    public int f5748f0;

    /* renamed from: g0 */
    public p227n0.C4642a0 f5749g0;

    /* renamed from: h0 */
    public boolean f5750h0;

    /* renamed from: i0 */
    public boolean f5751i0;

    /* renamed from: j0 */
    public boolean f5752j0;

    /* renamed from: k0 */
    public int f5753k0;

    /* renamed from: l0 */
    public java.lang.ref.WeakReference<android.view.View> f5754l0;

    /* renamed from: m0 */
    public android.animation.ValueAnimator f5755m0;

    /* renamed from: n0 */
    public int[] f5756n0;

    /* renamed from: o0 */
    public android.graphics.drawable.Drawable f5757o0;

    public static class BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> extends p373v7.AbstractC6580c<T> {

        /* renamed from: j */
        public int f5758j;

        /* renamed from: k */
        public int f5759k;

        /* renamed from: l */
        public android.animation.ValueAnimator f5760l;

        /* renamed from: m */
        public int f5761m;

        /* renamed from: n */
        public boolean f5762n;

        /* renamed from: o */
        public float f5763o;

        /* renamed from: p */
        public java.lang.ref.WeakReference<android.view.View> f5764p;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public static class C1116a extends p320s0.AbstractC5943a {
            public static final android.os.Parcelable.Creator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.C1116a> CREATOR = null;

            /* renamed from: a0 */
            public int f5765a0;

            /* renamed from: b0 */
            public float f5766b0;

            /* renamed from: c0 */
            public boolean f5767c0;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a */
            public static class a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.C1116a> {
                public a() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // android.os.Parcelable.Creator
                public java.lang.Object createFromParcel(android.os.Parcel r3) {
                        r2 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$a
                        r1 = 0
                        r0.<init>(r3, r1)
                        return r0
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public com.google.android.material.appbar.AppBarLayout.BaseBehavior.C1116a createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                        r1 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$a
                        r0.<init>(r2, r3)
                        return r0
                }

                @Override // android.os.Parcelable.Creator
                public java.lang.Object[] newArray(int r1) {
                        r0 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$a[] r1 = new com.google.android.material.appbar.AppBarLayout.BaseBehavior.C1116a[r1]
                        return r1
                }
            }

            static {
                    com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a
                    r0.<init>()
                    com.google.android.material.appbar.AppBarLayout.BaseBehavior.C1116a.CREATOR = r0
                    return
            }

            public C1116a(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    int r2 = r1.readInt()
                    r0.f5765a0 = r2
                    float r2 = r1.readFloat()
                    r0.f5766b0 = r2
                    byte r1 = r1.readByte()
                    if (r1 == 0) goto L17
                    r1 = 1
                    goto L18
                L17:
                    r1 = 0
                L18:
                    r0.f5767c0 = r1
                    return
            }

            public C1116a(android.os.Parcelable r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // p320s0.AbstractC5943a, android.os.Parcelable
            public void writeToParcel(android.os.Parcel r2, int r3) {
                    r1 = this;
                    android.os.Parcelable r0 = r1.f22819Y
                    r2.writeParcelable(r0, r3)
                    int r3 = r1.f5765a0
                    r2.writeInt(r3)
                    float r3 = r1.f5766b0
                    r2.writeFloat(r3)
                    boolean r3 = r1.f5767c0
                    byte r3 = (byte) r3
                    r2.writeByte(r3)
                    return
            }
        }

        public BaseBehavior() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f5761m = r0
                return
        }

        public BaseBehavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.f5761m = r1
                return
        }

        /* renamed from: A */
        public static boolean m3248A(int r0, int r1) {
                r0 = r0 & r1
                if (r0 != r1) goto L5
                r0 = 1
                goto L6
            L5:
                r0 = 0
            L6:
                return r0
        }

        /* renamed from: B */
        public final android.view.View m3249B(androidx.coordinatorlayout.widget.CoordinatorLayout r5) {
                r4 = this;
                int r0 = r5.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L1c
                android.view.View r2 = r5.getChildAt(r1)
                boolean r3 = r2 instanceof p227n0.InterfaceC4648g
                if (r3 != 0) goto L1b
                boolean r3 = r2 instanceof android.widget.ListView
                if (r3 != 0) goto L1b
                boolean r3 = r2 instanceof android.widget.ScrollView
                if (r3 == 0) goto L18
                goto L1b
            L18:
                int r1 = r1 + 1
                goto L5
            L1b:
                return r2
            L1c:
                r5 = 0
                return r5
        }

        /* renamed from: C */
        public void m3250C(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
                r8 = this;
                if (r12 == 0) goto L26
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
                r6 = r0
                r7 = r1
                goto L19
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                r6 = r0
                r7 = 0
            L19:
                if (r6 == r7) goto L26
                r0 = 1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r12
                int r9 = r2.m13448w(r3, r4, r5, r6, r7)
                r13[r0] = r9
            L26:
                boolean r9 = r10.f5752j0
                if (r9 == 0) goto L31
                boolean r9 = r10.m3244d(r11)
                r10.m3243c(r9)
            L31:
                return
        }

        /* renamed from: D */
        public final void m3251D(androidx.coordinatorlayout.widget.CoordinatorLayout r11, T r12) {
                r10 = this;
                int r0 = r10.mo3254v()
                int r1 = r12.getChildCount()
                r2 = 0
                r3 = 0
            La:
                r4 = 32
                if (r3 >= r1) goto L37
                android.view.View r5 = r12.getChildAt(r3)
                int r6 = r5.getTop()
                int r7 = r5.getBottom()
                android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r5 = (com.google.android.material.appbar.AppBarLayout.C1117a) r5
                int r8 = r5.f5768a
                boolean r8 = m3248A(r8, r4)
                if (r8 == 0) goto L2e
                int r8 = r5.topMargin
                int r6 = r6 - r8
                int r5 = r5.bottomMargin
                int r7 = r7 + r5
            L2e:
                int r5 = -r0
                if (r6 > r5) goto L34
                if (r7 < r5) goto L34
                goto L38
            L34:
                int r3 = r3 + 1
                goto La
            L37:
                r3 = -1
            L38:
                if (r3 < 0) goto La4
                android.view.View r1 = r12.getChildAt(r3)
                android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r5 = (com.google.android.material.appbar.AppBarLayout.C1117a) r5
                int r6 = r5.f5768a
                r7 = r6 & 17
                r8 = 17
                if (r7 != r8) goto La4
                int r7 = r1.getTop()
                int r7 = -r7
                int r8 = r1.getBottom()
                int r8 = -r8
                int r9 = r12.getChildCount()
                int r9 = r9 + (-1)
                if (r3 != r9) goto L63
                int r3 = r12.getTopInset()
                int r8 = r8 + r3
            L63:
                r3 = 2
                boolean r9 = m3248A(r6, r3)
                if (r9 == 0) goto L72
                java.util.WeakHashMap<android.view.View, n0.w> r9 = p227n0.C4661t.f18570a
                int r1 = p227n0.C4661t.c.m10556d(r1)
                int r8 = r8 + r1
                goto L85
            L72:
                r9 = 5
                boolean r9 = m3248A(r6, r9)
                if (r9 == 0) goto L85
                java.util.WeakHashMap<android.view.View, n0.w> r9 = p227n0.C4661t.f18570a
                int r1 = p227n0.C4661t.c.m10556d(r1)
                int r1 = r1 + r8
                if (r0 >= r1) goto L84
                r7 = r1
                goto L85
            L84:
                r8 = r1
            L85:
                boolean r1 = m3248A(r6, r4)
                if (r1 == 0) goto L91
                int r1 = r5.topMargin
                int r7 = r7 + r1
                int r1 = r5.bottomMargin
                int r8 = r8 - r1
            L91:
                int r1 = r8 + r7
                int r1 = r1 / r3
                if (r0 >= r1) goto L97
                r7 = r8
            L97:
                int r0 = r12.getTotalScrollRange()
                int r0 = -r0
                int r0 = p064e.C1492f.m4042b(r7, r0, r2)
                r1 = 0
                r10.m3256z(r11, r12, r0, r1)
            La4:
                return
        }

        /* renamed from: E */
        public final void m3252E(androidx.coordinatorlayout.widget.CoordinatorLayout r12, T r13) {
                r11 = this;
                o0.b$a r0 = p242o0.C4868b.a.f19341f
                int r1 = r0.m10999a()
                p227n0.C4661t.m10543s(r1, r12)
                r1 = 0
                p227n0.C4661t.m10537m(r12, r1)
                o0.b$a r2 = p242o0.C4868b.a.f19342g
                int r3 = r2.m10999a()
                p227n0.C4661t.m10543s(r3, r12)
                p227n0.C4661t.m10537m(r12, r1)
                android.view.View r8 = r11.m3249B(r12)
                if (r8 == 0) goto L77
                int r3 = r13.getTotalScrollRange()
                if (r3 != 0) goto L26
                goto L77
            L26:
                android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r3
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r3.f1930a
                boolean r3 = r3 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r3 != 0) goto L33
                return
            L33:
                int r3 = r11.mo3254v()
                int r4 = r13.getTotalScrollRange()
                int r4 = -r4
                r5 = 1
                r10 = 0
                if (r3 == r4) goto L4e
                boolean r3 = r8.canScrollVertically(r5)
                if (r3 == 0) goto L4e
                com.google.android.material.appbar.c r3 = new com.google.android.material.appbar.c
                r3.<init>(r11, r13, r1)
                p227n0.C4661t.m10544t(r12, r0, r10, r3)
            L4e:
                int r0 = r11.mo3254v()
                if (r0 == 0) goto L77
                r0 = -1
                boolean r0 = r8.canScrollVertically(r0)
                if (r0 == 0) goto L6f
                int r0 = r13.getDownNestedPreScrollRange()
                int r9 = -r0
                if (r9 == 0) goto L77
                com.google.android.material.appbar.b r0 = new com.google.android.material.appbar.b
                r4 = r0
                r5 = r11
                r6 = r12
                r7 = r13
                r4.<init>(r5, r6, r7, r8, r9)
                p227n0.C4661t.m10544t(r12, r2, r10, r0)
                goto L77
            L6f:
                com.google.android.material.appbar.c r0 = new com.google.android.material.appbar.c
                r0.<init>(r11, r13, r5)
                p227n0.C4661t.m10544t(r12, r2, r10, r0)
            L77:
                return
        }

        /* renamed from: F */
        public final void m3253F(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                if (r4 == 0) goto L9f
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r0 = (com.google.android.material.appbar.AppBarLayout.C1117a) r0
                int r0 = r0.f5768a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L5d
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                int r1 = p227n0.C4661t.c.m10556d(r4)
                if (r10 <= 0) goto L4a
                r10 = r0 & 12
                if (r10 == 0) goto L4a
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L5d
                goto L5b
            L4a:
                r10 = r0 & 2
                if (r10 == 0) goto L5d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L5d
            L5b:
                r9 = 1
                goto L5e
            L5d:
                r9 = 0
            L5e:
                boolean r10 = r8.f5752j0
                if (r10 == 0) goto L6a
                android.view.View r9 = r6.m3249B(r7)
                boolean r9 = r8.m3244d(r9)
            L6a:
                boolean r9 = r8.m3243c(r9)
                if (r11 != 0) goto L9c
                if (r9 == 0) goto L9f
                java.util.List r7 = r7.m969f(r8)
                int r9 = r7.size()
                r10 = 0
            L7b:
                if (r10 >= r9) goto L9a
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1930a
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L97
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f25747f
                if (r7 == 0) goto L9a
                r2 = 1
                goto L9a
            L97:
                int r10 = r10 + 1
                goto L7b
            L9a:
                if (r2 == 0) goto L9f
            L9c:
                r8.jumpDrawablesToCurrentState()
            L9f:
                return
        }

        @Override // p373v7.C6582e, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: h */
        public boolean mo992h(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10) {
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                super.mo992h(r8, r9, r10)
                int r10 = r9.getPendingAction()
                int r0 = r7.f5761m
                r6 = 1
                r1 = 0
                if (r0 < 0) goto L3e
                r2 = r10 & 8
                if (r2 != 0) goto L3e
                android.view.View r10 = r9.getChildAt(r0)
                int r0 = r10.getBottom()
                int r0 = -r0
                boolean r2 = r7.f5762n
                if (r2 == 0) goto L2b
                int r10 = p227n0.C4661t.c.m10556d(r10)
                int r2 = r9.getTopInset()
                int r2 = r2 + r10
                int r2 = r2 + r0
                goto L3a
            L2b:
                int r10 = r10.getHeight()
                float r10 = (float) r10
                float r2 = r7.f5763o
                float r10 = r10 * r2
                int r10 = java.lang.Math.round(r10)
                int r2 = r10 + r0
            L3a:
                r7.m13449x(r8, r9, r2)
                goto L67
            L3e:
                if (r10 == 0) goto L67
                r0 = r10 & 4
                if (r0 == 0) goto L46
                r0 = 1
                goto L47
            L46:
                r0 = 0
            L47:
                r2 = r10 & 2
                r3 = 0
                if (r2 == 0) goto L5b
                int r10 = r9.getUpNestedPreScrollRange()
                int r10 = -r10
                if (r0 == 0) goto L57
                r7.m3256z(r8, r9, r10, r3)
                goto L67
            L57:
                r7.m13449x(r8, r9, r10)
                goto L67
            L5b:
                r10 = r10 & r6
                if (r10 == 0) goto L67
                if (r0 == 0) goto L64
                r7.m3256z(r8, r9, r1, r3)
                goto L67
            L64:
                r7.m13449x(r8, r9, r1)
            L67:
                r9.f5748f0 = r1
                r10 = -1
                r7.f5761m = r10
                int r10 = r7.m13452s()
                int r0 = r9.getTotalScrollRange()
                int r0 = -r0
                int r10 = p064e.C1492f.m4042b(r10, r0, r1)
                r7.m13453u(r10)
                int r3 = r7.m13452s()
                r4 = 0
                r5 = 1
                r0 = r7
                r1 = r8
                r2 = r9
                r0.m3253F(r1, r2, r3, r4, r5)
                int r10 = r7.m13452s()
                r9.f5743a0 = r10
                boolean r10 = r9.willNotDraw()
                if (r10 != 0) goto L99
                java.util.WeakHashMap<android.view.View, n0.w> r10 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10563k(r9)
            L99:
                r7.m3252E(r8, r9)
                return r6
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: i */
        public boolean mo993i(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, int r9, int r10, int r11, int r12) {
                r6 = this;
                r1 = r8
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r8 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r8
                int r8 = r8.height
                r11 = 0
                r0 = -2
                if (r8 != r0) goto L1b
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r11)
                r0 = r7
                r2 = r9
                r3 = r10
                r5 = r12
                r0.m977s(r1, r2, r3, r4, r5)
                r11 = 1
            L1b:
                return r11
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: k */
        public /* bridge */ /* synthetic */ void mo995k(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
                r6 = this;
                r2 = r8
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0 = r6
                r1 = r7
                r3 = r9
                r4 = r11
                r5 = r12
                r0.m3250C(r1, r2, r3, r4, r5)
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: l */
        public void mo996l(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.View r9, int r10, int r11, int r12, int r13, int r14, int[] r15) {
                r6 = this;
                com.google.android.material.appbar.AppBarLayout r8 = (com.google.android.material.appbar.AppBarLayout) r8
                if (r13 >= 0) goto L15
                r9 = 1
                int r10 = r8.getDownNestedScrollRange()
                int r4 = -r10
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r13
                int r10 = r0.m13448w(r1, r2, r3, r4, r5)
                r15[r9] = r10
            L15:
                if (r13 != 0) goto L1a
                r6.m3252E(r7, r8)
            L1a:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: n */
        public void mo998n(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.os.Parcelable r3) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                boolean r1 = r3 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior.C1116a
                if (r1 == 0) goto L15
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r3 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior.C1116a) r3
                int r1 = r3.f5765a0
                r0.f5761m = r1
                float r1 = r3.f5766b0
                r0.f5763o = r1
                boolean r1 = r3.f5767c0
                r0.f5762n = r1
                goto L18
            L15:
                r1 = -1
                r0.f5761m = r1
            L18:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: o */
        public android.os.Parcelable mo999o(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9) {
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                android.view.AbsSavedState r8 = android.view.View.BaseSavedState.EMPTY_STATE
                int r0 = r7.m13452s()
                int r1 = r9.getChildCount()
                r2 = 0
                r3 = 0
            Le:
                if (r3 >= r1) goto L47
                android.view.View r4 = r9.getChildAt(r3)
                int r5 = r4.getBottom()
                int r5 = r5 + r0
                int r6 = r4.getTop()
                int r6 = r6 + r0
                if (r6 > 0) goto L44
                if (r5 < 0) goto L44
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$a
                r0.<init>(r8)
                r0.f5765a0 = r3
                java.util.WeakHashMap<android.view.View, n0.w> r8 = p227n0.C4661t.f18570a
                int r8 = p227n0.C4661t.c.m10556d(r4)
                int r9 = r9.getTopInset()
                int r9 = r9 + r8
                if (r5 != r9) goto L37
                r2 = 1
            L37:
                r0.f5767c0 = r2
                float r8 = (float) r5
                int r9 = r4.getHeight()
                float r9 = (float) r9
                float r8 = r8 / r9
                r0.f5766b0 = r8
                r8 = r0
                goto L47
            L44:
                int r3 = r3 + 1
                goto Le
            L47:
                return r8
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: p */
        public boolean mo1000p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.f5752j0
                if (r5 != 0) goto L2d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = 1
                goto L15
            L14:
                r5 = 0
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = 1
                goto L29
            L28:
                r2 = 0
            L29:
                if (r2 == 0) goto L2c
                goto L2d
            L2c:
                r6 = 0
            L2d:
                if (r6 == 0) goto L36
                android.animation.ValueAnimator r2 = r1.f5760l
                if (r2 == 0) goto L36
                r2.cancel()
            L36:
                r2 = 0
                r1.f5764p = r2
                r1.f5759k = r7
                return r6
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: q */
        public void mo1001q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, int r5) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                int r0 = r1.f5759k
                if (r0 == 0) goto L9
                r0 = 1
                if (r5 != r0) goto L17
            L9:
                r1.m3251D(r2, r3)
                boolean r2 = r3.f5752j0
                if (r2 == 0) goto L17
                boolean r2 = r3.m3244d(r4)
                r3.m3243c(r2)
            L17:
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r4)
                r1.f5764p = r2
                return
        }

        @Override // p373v7.AbstractC6580c
        /* renamed from: v */
        public int mo3254v() {
                r2 = this;
                int r0 = r2.m13452s()
                int r1 = r2.f5758j
                int r0 = r0 + r1
                return r0
        }

        @Override // p373v7.AbstractC6580c
        /* renamed from: y */
        public int mo3255y(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.mo3254v()
                r1 = 0
                if (r11 == 0) goto Led
                if (r0 < r11) goto Led
                if (r0 > r12) goto Led
                int r3 = p064e.C1492f.m4042b(r10, r11, r12)
                if (r0 == r3) goto Lef
                boolean r10 = r9.f5747e0
                if (r10 == 0) goto L8a
                int r10 = java.lang.Math.abs(r3)
                int r11 = r9.getChildCount()
                r12 = 0
            L20:
                if (r12 >= r11) goto L8a
                android.view.View r2 = r9.getChildAt(r12)
                android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.C1117a) r4
                android.view.animation.Interpolator r5 = r4.f5769b
                int r6 = r2.getTop()
                if (r10 < r6) goto L87
                int r6 = r2.getBottom()
                if (r10 > r6) goto L87
                if (r5 == 0) goto L8a
                int r11 = r4.f5768a
                r12 = r11 & 1
                if (r12 == 0) goto L59
                int r12 = r2.getHeight()
                int r6 = r4.topMargin
                int r12 = r12 + r6
                int r4 = r4.bottomMargin
                int r12 = r12 + r4
                int r12 = r12 + r1
                r11 = r11 & 2
                if (r11 == 0) goto L5a
                java.util.WeakHashMap<android.view.View, n0.w> r11 = p227n0.C4661t.f18570a
                int r11 = p227n0.C4661t.c.m10556d(r2)
                int r12 = r12 - r11
                goto L5a
            L59:
                r12 = 0
            L5a:
                java.util.WeakHashMap<android.view.View, n0.w> r11 = p227n0.C4661t.f18570a
                boolean r11 = p227n0.C4661t.c.m10554b(r2)
                if (r11 == 0) goto L67
                int r11 = r9.getTopInset()
                int r12 = r12 - r11
            L67:
                if (r12 <= 0) goto L8a
                int r11 = r2.getTop()
                int r10 = r10 - r11
                float r11 = (float) r12
                float r10 = (float) r10
                float r10 = r10 / r11
                float r10 = r5.getInterpolation(r10)
                float r10 = r10 * r11
                int r10 = java.lang.Math.round(r10)
                int r11 = java.lang.Integer.signum(r3)
                int r12 = r2.getTop()
                int r12 = r12 + r10
                int r12 = r12 * r11
                goto L8b
            L87:
                int r12 = r12 + 1
                goto L20
            L8a:
                r12 = r3
            L8b:
                boolean r10 = r7.m13453u(r12)
                int r11 = r0 - r3
                int r12 = r3 - r12
                r7.f5758j = r12
                if (r10 != 0) goto Lcc
                boolean r10 = r9.f5747e0
                if (r10 == 0) goto Lcc
                v.c r10 = r8.f1910b0
                v.e r10 = r10.f25076Z
                s.h r10 = (p319s.C5941h) r10
                r12 = 0
                java.lang.Object r10 = r10.getOrDefault(r9, r12)
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto Lcc
                boolean r12 = r10.isEmpty()
                if (r12 != 0) goto Lcc
            Lb0:
                int r12 = r10.size()
                if (r1 >= r12) goto Lcc
                java.lang.Object r12 = r10.get(r1)
                android.view.View r12 = (android.view.View) r12
                android.view.ViewGroup$LayoutParams r2 = r12.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r2
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.f1930a
                if (r2 == 0) goto Lc9
                r2.mo988d(r8, r12, r9)
            Lc9:
                int r1 = r1 + 1
                goto Lb0
            Lcc:
                int r10 = r7.m13452s()
                r9.f5743a0 = r10
                boolean r10 = r9.willNotDraw()
                if (r10 != 0) goto Ldd
                java.util.WeakHashMap<android.view.View, n0.w> r10 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10563k(r9)
            Ldd:
                if (r3 >= r0) goto Le2
                r10 = -1
                r4 = -1
                goto Le4
            Le2:
                r10 = 1
                r4 = 1
            Le4:
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r0.m3253F(r1, r2, r3, r4, r5)
                r1 = r11
                goto Lef
            Led:
                r7.f5758j = r1
            Lef:
                r7.m3252E(r8, r9)
                return r1
        }

        /* renamed from: z */
        public final void m3256z(androidx.coordinatorlayout.widget.CoordinatorLayout r4, T r5, int r6, float r7) {
                r3 = this;
                int r0 = r3.mo3254v()
                int r0 = r0 - r6
                int r0 = java.lang.Math.abs(r0)
                float r7 = java.lang.Math.abs(r7)
                r1 = 0
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 <= 0) goto L1f
                r1 = 1148846080(0x447a0000, float:1000.0)
                float r0 = (float) r0
                float r0 = r0 / r7
                float r0 = r0 * r1
                int r7 = java.lang.Math.round(r0)
                int r7 = r7 * 3
                goto L2e
            L1f:
                float r7 = (float) r0
                int r0 = r5.getHeight()
                float r0 = (float) r0
                float r7 = r7 / r0
                r0 = 1065353216(0x3f800000, float:1.0)
                float r7 = r7 + r0
                r0 = 1125515264(0x43160000, float:150.0)
                float r7 = r7 * r0
                int r7 = (int) r7
            L2e:
                int r0 = r3.mo3254v()
                if (r0 != r6) goto L44
                android.animation.ValueAnimator r4 = r3.f5760l
                if (r4 == 0) goto L81
                boolean r4 = r4.isRunning()
                if (r4 == 0) goto L81
                android.animation.ValueAnimator r4 = r3.f5760l
                r4.cancel()
                goto L81
            L44:
                android.animation.ValueAnimator r1 = r3.f5760l
                if (r1 != 0) goto L5f
                android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
                r1.<init>()
                r3.f5760l = r1
                android.animation.TimeInterpolator r2 = p354u7.C6350a.f24807e
                r1.setInterpolator(r2)
                android.animation.ValueAnimator r1 = r3.f5760l
                com.google.android.material.appbar.a r2 = new com.google.android.material.appbar.a
                r2.<init>(r3, r4, r5)
                r1.addUpdateListener(r2)
                goto L62
            L5f:
                r1.cancel()
            L62:
                android.animation.ValueAnimator r4 = r3.f5760l
                r5 = 600(0x258, float:8.41E-43)
                int r5 = java.lang.Math.min(r7, r5)
                long r1 = (long) r5
                r4.setDuration(r1)
                android.animation.ValueAnimator r4 = r3.f5760l
                r5 = 2
                int[] r5 = new int[r5]
                r7 = 0
                r5[r7] = r0
                r7 = 1
                r5[r7] = r6
                r4.setIntValues(r5)
                android.animation.ValueAnimator r4 = r3.f5760l
                r4.start()
            L81:
                return
        }
    }

    public static class Behavior extends com.google.android.material.appbar.AppBarLayout.BaseBehavior<com.google.android.material.appbar.AppBarLayout> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public static class ScrollingViewBehavior extends p373v7.AbstractC6581d {
        public ScrollingViewBehavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public ScrollingViewBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = p339t7.C6183a.f23994G
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                r3 = 0
                int r3 = r2.getDimensionPixelSize(r3, r3)
                r1.f25747f = r3
                r2.recycle()
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: b */
        public boolean mo986b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                boolean r1 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: d */
        public boolean mo988d(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r3
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r3.f1930a
                boolean r0 = r3 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
                if (r0 == 0) goto L25
                com.google.android.material.appbar.AppBarLayout$BaseBehavior r3 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r3
                int r0 = r5.getBottom()
                int r1 = r4.getTop()
                int r0 = r0 - r1
                int r3 = r3.f5758j
                int r0 = r0 + r3
                int r3 = r2.f25746e
                int r0 = r0 + r3
                int r3 = r2.m13451v(r5)
                int r0 = r0 - r3
                p227n0.C4661t.m10539o(r4, r0)
            L25:
                boolean r3 = r5 instanceof com.google.android.material.appbar.AppBarLayout
                if (r3 == 0) goto L36
                com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
                boolean r3 = r5.f5752j0
                if (r3 == 0) goto L36
                boolean r3 = r5.m3244d(r4)
                r5.m3243c(r3)
            L36:
                r3 = 0
                return r3
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: e */
        public void mo989e(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                boolean r2 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r2 == 0) goto L1d
                o0.b$a r2 = p242o0.C4868b.a.f19341f
                int r2 = r2.m10999a()
                p227n0.C4661t.m10543s(r2, r1)
                r2 = 0
                p227n0.C4661t.m10537m(r1, r2)
                o0.b$a r3 = p242o0.C4868b.a.f19342g
                int r3 = r3.m10999a()
                p227n0.C4661t.m10543s(r3, r1)
                p227n0.C4661t.m10537m(r1, r2)
            L1d:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: m */
        public boolean mo997m(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.graphics.Rect r6, boolean r7) {
                r3 = this;
                java.util.List r0 = r4.m968e(r5)
                com.google.android.material.appbar.AppBarLayout r0 = r3.m3257w(r0)
                r1 = 0
                if (r0 == 0) goto L30
                int r2 = r5.getLeft()
                int r5 = r5.getTop()
                r6.offset(r2, r5)
                android.graphics.Rect r5 = r3.f25744c
                int r2 = r4.getWidth()
                int r4 = r4.getHeight()
                r5.set(r1, r1, r2, r4)
                boolean r4 = r5.contains(r6)
                if (r4 != 0) goto L30
                r4 = 1
                r5 = r7 ^ 1
                r0.m3242b(r1, r5, r4)
                return r4
            L30:
                return r1
        }

        /* renamed from: w */
        public com.google.android.material.appbar.AppBarLayout m3257w(java.util.List<android.view.View> r5) {
                r4 = this;
                int r0 = r5.size()
                r1 = 0
            L5:
                if (r1 >= r0) goto L17
                java.lang.Object r2 = r5.get(r1)
                android.view.View r2 = (android.view.View) r2
                boolean r3 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                if (r3 == 0) goto L14
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                return r2
            L14:
                int r1 = r1 + 1
                goto L5
            L17:
                r5 = 0
                return r5
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public static class C1117a extends android.widget.LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f5768a;

        /* renamed from: b */
        public android.view.animation.Interpolator f5769b;

        public C1117a(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 1
                r0.f5768a = r1
                return
        }

        public C1117a(android.content.Context r4, android.util.AttributeSet r5) {
                r3 = this;
                r3.<init>(r4, r5)
                r0 = 1
                r3.f5768a = r0
                int[] r1 = p339t7.C6183a.f24005b
                android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1)
                r1 = 0
                int r2 = r5.getInt(r1, r1)
                r3.f5768a = r2
                boolean r2 = r5.hasValue(r0)
                if (r2 == 0) goto L23
                int r0 = r5.getResourceId(r0, r1)
                android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
                r3.f5769b = r4
            L23:
                r5.recycle()
                return
        }

        public C1117a(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.f5768a = r1
                return
        }

        public C1117a(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.f5768a = r1
                return
        }

        public C1117a(android.widget.LinearLayout.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.f5768a = r1
                return
        }
    }

    public AppBarLayout(android.content.Context r15, android.util.AttributeSet r16) {
            r14 = this;
            r1 = r14
            r0 = r16
            r2 = 2132017887(0x7f1402df, float:1.9674065E38)
            r3 = 2130968631(0x7f040037, float:1.7545921E38)
            r4 = r15
            android.content.Context r2 = p431y8.C7133a.m14245a(r15, r0, r3, r2)
            r14.<init>(r2, r0, r3)
            r8 = -1
            r1.f5744b0 = r8
            r1.f5745c0 = r8
            r1.f5746d0 = r8
            r9 = 0
            r1.f5748f0 = r9
            android.content.Context r10 = r14.getContext()
            r11 = 1
            r14.setOrientation(r11)
            int r12 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r2 = android.view.ViewOutlineProvider.BOUNDS
            r14.setOutlineProvider(r2)
            r6 = 2132017887(0x7f1402df, float:1.9674065E38)
            android.content.Context r13 = r14.getContext()
            int[] r4 = p373v7.C6584g.f25755a
            int[] r7 = new int[r9]
            r5 = 2130968631(0x7f040037, float:1.7545921E38)
            r2 = r13
            r3 = r16
            android.content.res.TypedArray r2 = p220m8.C4429m.m9881d(r2, r3, r4, r5, r6, r7)
            boolean r3 = r2.hasValue(r9)     // Catch: java.lang.Throwable -> Lf8
            if (r3 == 0) goto L50
            int r3 = r2.getResourceId(r9, r9)     // Catch: java.lang.Throwable -> Lf8
            android.animation.StateListAnimator r3 = android.animation.AnimatorInflater.loadStateListAnimator(r13, r3)     // Catch: java.lang.Throwable -> Lf8
            r14.setStateListAnimator(r3)     // Catch: java.lang.Throwable -> Lf8
        L50:
            r2.recycle()
            int[] r4 = p339t7.C6183a.f24004a
            r6 = 2132017887(0x7f1402df, float:1.9674065E38)
            int[] r7 = new int[r9]
            r5 = 2130968631(0x7f040037, float:1.7545921E38)
            r2 = r10
            r3 = r16
            android.content.res.TypedArray r0 = p220m8.C4429m.m9881d(r2, r3, r4, r5, r6, r7)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r9)
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r14, r2)
            android.graphics.drawable.Drawable r2 = r14.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L9a
            android.graphics.drawable.Drawable r2 = r14.getBackground()
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            t8.f r3 = new t8.f
            r3.<init>()
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r3.m12773q(r2)
            t8.f$b r2 = r3.f24036Y
            j8.a r4 = new j8.a
            r4.<init>(r10)
            r2.f24060b = r4
            r3.m12781y()
            p227n0.C4661t.c.m10569q(r14, r3)
        L9a:
            r2 = 4
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto La8
            boolean r2 = r0.getBoolean(r2, r9)
            r14.m3242b(r2, r9, r9)
        La8:
            r2 = 3
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto Lb7
            int r2 = r0.getDimensionPixelSize(r2, r9)
            float r2 = (float) r2
            p373v7.C6584g.m13455a(r14, r2)
        Lb7:
            r2 = 26
            if (r12 < r2) goto Ld6
            r2 = 2
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto Lc9
            boolean r2 = r0.getBoolean(r2, r9)
            r14.setKeyboardNavigationCluster(r2)
        Lc9:
            boolean r2 = r0.hasValue(r11)
            if (r2 == 0) goto Ld6
            boolean r2 = r0.getBoolean(r11, r9)
            r14.setTouchscreenBlocksFocus(r2)
        Ld6:
            r2 = 5
            boolean r2 = r0.getBoolean(r2, r9)
            r1.f5752j0 = r2
            r2 = 6
            int r2 = r0.getResourceId(r2, r8)
            r1.f5753k0 = r2
            r2 = 7
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r14.setStatusBarForeground(r2)
            r0.recycle()
            v7.a r0 = new v7.a
            r0.<init>(r14)
            p227n0.C4661t.h.m10616u(r14, r0)
            return
        Lf8:
            r0 = move-exception
            r2.recycle()
            throw r0
    }

    /* renamed from: a */
    public com.google.android.material.appbar.AppBarLayout.C1117a m3241a(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto Lc
            com.google.android.material.appbar.AppBarLayout$a r0 = new com.google.android.material.appbar.AppBarLayout$a
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            com.google.android.material.appbar.AppBarLayout$a r0 = new com.google.android.material.appbar.AppBarLayout$a
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L18:
            com.google.android.material.appbar.AppBarLayout$a r0 = new com.google.android.material.appbar.AppBarLayout$a
            r0.<init>(r2)
            return r0
    }

    /* renamed from: b */
    public final void m3242b(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            if (r2 == 0) goto L4
            r2 = 1
            goto L5
        L4:
            r2 = 2
        L5:
            r0 = 0
            if (r3 == 0) goto La
            r3 = 4
            goto Lb
        La:
            r3 = 0
        Lb:
            r2 = r2 | r3
            if (r4 == 0) goto L10
            r0 = 8
        L10:
            r2 = r2 | r0
            r1.f5748f0 = r2
            r1.requestLayout()
            return
    }

    /* renamed from: c */
    public boolean m3243c(boolean r7) {
            r6 = this;
            boolean r0 = r6.f5751i0
            r1 = 0
            if (r0 == r7) goto L6c
            r6.f5751i0 = r7
            r6.refreshDrawableState()
            boolean r0 = r6.f5752j0
            r2 = 1
            if (r0 == 0) goto L6b
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            boolean r0 = r0 instanceof p340t8.C6189f
            if (r0 == 0) goto L6b
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            t8.f r0 = (p340t8.C6189f) r0
            android.content.res.Resources r3 = r6.getResources()
            r4 = 2131165319(0x7f070087, float:1.7944852E38)
            float r3 = r3.getDimension(r4)
            r4 = 0
            if (r7 == 0) goto L2d
            r5 = 0
            goto L2e
        L2d:
            r5 = r3
        L2e:
            if (r7 == 0) goto L31
            goto L32
        L31:
            r3 = 0
        L32:
            android.animation.ValueAnimator r7 = r6.f5755m0
            if (r7 == 0) goto L39
            r7.cancel()
        L39:
            r7 = 2
            float[] r7 = new float[r7]
            r7[r1] = r5
            r7[r2] = r3
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r7)
            r6.f5755m0 = r7
            android.content.res.Resources r1 = r6.getResources()
            r3 = 2131427333(0x7f0b0005, float:1.847628E38)
            int r1 = r1.getInteger(r3)
            long r3 = (long) r1
            r7.setDuration(r3)
            android.animation.ValueAnimator r7 = r6.f5755m0
            android.animation.TimeInterpolator r1 = p354u7.C6350a.f24803a
            r7.setInterpolator(r1)
            android.animation.ValueAnimator r7 = r6.f5755m0
            v7.b r1 = new v7.b
            r1.<init>(r6, r0)
            r7.addUpdateListener(r1)
            android.animation.ValueAnimator r7 = r6.f5755m0
            r7.start()
        L6b:
            return r2
        L6c:
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.google.android.material.appbar.AppBarLayout.C1117a
            return r1
    }

    /* renamed from: d */
    public boolean m3244d(android.view.View r5) {
            r4 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f5754l0
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L31
            int r0 = r4.f5753k0
            if (r0 == r2) goto L31
            if (r5 == 0) goto L11
            android.view.View r0 = r5.findViewById(r0)
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 != 0) goto L28
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L28
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.f5753k0
            android.view.View r0 = r0.findViewById(r3)
        L28:
            if (r0 == 0) goto L31
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.f5754l0 = r3
        L31:
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f5754l0
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L3c:
            if (r1 != 0) goto L3f
            goto L40
        L3f:
            r5 = r1
        L40:
            if (r5 == 0) goto L50
            boolean r0 = r5.canScrollVertically(r2)
            if (r0 != 0) goto L4e
            int r5 = r5.getScrollY()
            if (r5 <= 0) goto L50
        L4e:
            r5 = 1
            goto L51
        L50:
            r5 = 0
        L51:
            return r5
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r4) {
            r3 = this;
            super.draw(r4)
            android.graphics.drawable.Drawable r0 = r3.f5757o0
            if (r0 == 0) goto Lf
            int r0 = r3.getTopInset()
            if (r0 <= 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L26
            int r0 = r4.save()
            r1 = 0
            int r2 = r3.f5743a0
            int r2 = -r2
            float r2 = (float) r2
            r4.translate(r1, r2)
            android.graphics.drawable.Drawable r1 = r3.f5757o0
            r1.draw(r4)
            r4.restoreToCount(r0)
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            int[] r0 = r3.getDrawableState()
            android.graphics.drawable.Drawable r1 = r3.f5757o0
            if (r1 == 0) goto L1a
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L1a
            boolean r0 = r1.setState(r0)
            if (r0 == 0) goto L1a
            r3.invalidateDrawable(r1)
        L1a:
            return
    }

    /* renamed from: e */
    public final boolean m3245e() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L1c
            android.view.View r0 = r4.getChildAt(r1)
            int r2 = r0.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1c
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.c.m10554b(r0)
            if (r0 != 0) goto L1c
            r1 = 1
        L1c:
            return r1
    }

    /* renamed from: f */
    public final void m3246f() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f5757o0
            r1 = 1
            if (r0 == 0) goto Ld
            int r0 = r2.getTopInset()
            if (r0 <= 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            r0 = r0 ^ r1
            r2.setWillNotDraw(r0)
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$a r0 = new com.google.android.material.appbar.AppBarLayout$a
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$a r0 = new com.google.android.material.appbar.AppBarLayout$a
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.google.android.material.appbar.AppBarLayout$a r0 = new com.google.android.material.appbar.AppBarLayout$a
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$a r1 = r0.m3241a(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.google.android.material.appbar.AppBarLayout$a r0 = new com.google.android.material.appbar.AppBarLayout$a
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$a r1 = r0.m3241a(r1)
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b
    public androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c<com.google.android.material.appbar.AppBarLayout> getBehavior() {
            r1 = this;
            com.google.android.material.appbar.AppBarLayout$Behavior r0 = new com.google.android.material.appbar.AppBarLayout$Behavior
            r0.<init>()
            return r0
    }

    public int getDownNestedPreScrollRange() {
            r9 = this;
            int r0 = r9.f5745c0
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        Le:
            if (r0 < 0) goto L60
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.C1117a) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f5768a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L5a
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L36
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            int r4 = p227n0.C4661t.c.m10556d(r3)
            int r7 = r7 + r4
            goto L45
        L36:
            r4 = r6 & 2
            if (r4 == 0) goto L44
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            int r4 = p227n0.C4661t.c.m10556d(r3)
            int r4 = r5 - r4
            int r7 = r7 + r4
            goto L45
        L44:
            int r7 = r7 + r5
        L45:
            if (r0 != 0) goto L58
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            boolean r3 = p227n0.C4661t.c.m10554b(r3)
            if (r3 == 0) goto L58
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r7 = java.lang.Math.min(r7, r5)
        L58:
            int r2 = r2 + r7
            goto L5d
        L5a:
            if (r2 <= 0) goto L5d
            goto L60
        L5d:
            int r0 = r0 + (-1)
            goto Le
        L60:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f5745c0 = r0
            return r0
    }

    public int getDownNestedScrollRange() {
            r9 = this;
            int r0 = r9.f5746d0
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        Ld:
            if (r2 >= r0) goto L39
            android.view.View r4 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$a r5 = (com.google.android.material.appbar.AppBarLayout.C1117a) r5
            int r6 = r4.getMeasuredHeight()
            int r7 = r5.topMargin
            int r8 = r5.bottomMargin
            int r7 = r7 + r8
            int r7 = r7 + r6
            int r5 = r5.f5768a
            r6 = r5 & 1
            if (r6 == 0) goto L39
            int r3 = r3 + r7
            r5 = r5 & 2
            if (r5 == 0) goto L36
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.c.m10556d(r4)
            int r3 = r3 - r0
            goto L39
        L36:
            int r2 = r2 + 1
            goto Ld
        L39:
            int r0 = java.lang.Math.max(r1, r3)
            r9.f5746d0 = r0
            return r0
    }

    public int getLiftOnScrollTargetViewId() {
            r1 = this;
            int r0 = r1.f5753k0
            return r0
    }

    /* renamed from: getMinimumHeightForVisibleOverlappingContent */
    public final int m3247xbdc95208() {
            r3 = this;
            int r0 = r3.getTopInset()
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.c.m10556d(r3)
            if (r1 == 0) goto L10
        Lc:
            int r1 = r1 * 2
            int r1 = r1 + r0
            return r1
        L10:
            int r1 = r3.getChildCount()
            r2 = 1
            if (r1 < r2) goto L21
            int r1 = r1 - r2
            android.view.View r1 = r3.getChildAt(r1)
            int r1 = p227n0.C4661t.c.m10556d(r1)
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L25
            goto Lc
        L25:
            int r0 = r3.getHeight()
            int r0 = r0 / 3
            return r0
    }

    public int getPendingAction() {
            r1 = this;
            int r0 = r1.f5748f0
            return r0
    }

    public android.graphics.drawable.Drawable getStatusBarForeground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f5757o0
            return r0
    }

    @java.lang.Deprecated
    public float getTargetElevation() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final int getTopInset() {
            r1 = this;
            n0.a0 r0 = r1.f5749g0
            if (r0 == 0) goto L9
            int r0 = r0.m10468d()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final int getTotalScrollRange() {
            r9 = this;
            int r0 = r9.f5744b0
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        Ld:
            if (r2 >= r0) goto L49
            android.view.View r4 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$a r5 = (com.google.android.material.appbar.AppBarLayout.C1117a) r5
            int r6 = r4.getMeasuredHeight()
            int r7 = r5.f5768a
            r8 = r7 & 1
            if (r8 == 0) goto L49
            int r8 = r5.topMargin
            int r6 = r6 + r8
            int r5 = r5.bottomMargin
            int r6 = r6 + r5
            int r6 = r6 + r3
            if (r2 != 0) goto L39
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            boolean r3 = p227n0.C4661t.c.m10554b(r4)
            if (r3 == 0) goto L39
            int r3 = r9.getTopInset()
            int r6 = r6 - r3
        L39:
            r3 = r6
            r5 = r7 & 2
            if (r5 == 0) goto L46
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.c.m10556d(r4)
            int r3 = r3 - r0
            goto L49
        L46:
            int r2 = r2 + 1
            goto Ld
        L49:
            int r0 = java.lang.Math.max(r1, r3)
            r9.f5744b0 = r0
            return r0
    }

    public int getUpNestedPreScrollRange() {
            r1 = this;
            int r0 = r1.getTotalScrollRange()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof p340t8.C6189f
            if (r1 == 0) goto L10
            t8.f r0 = (p340t8.C6189f) r0
            p185k7.C3828h5.m8575D(r2, r0)
        L10:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int r5) {
            r4 = this;
            int[] r0 = r4.f5756n0
            if (r0 != 0) goto L9
            r0 = 4
            int[] r0 = new int[r0]
            r4.f5756n0 = r0
        L9:
            int[] r0 = r4.f5756n0
            int r1 = r0.length
            int r5 = r5 + r1
            int[] r5 = super.onCreateDrawableState(r5)
            r1 = 0
            boolean r2 = r4.f5750h0
            if (r2 == 0) goto L1a
            r3 = 2130969481(0x7f040389, float:1.7547645E38)
            goto L1d
        L1a:
            r3 = -2130969481(0xffffffff80fbfc77, float:-2.3141277E-38)
        L1d:
            r0[r1] = r3
            r1 = 1
            if (r2 == 0) goto L2a
            boolean r3 = r4.f5751i0
            if (r3 == 0) goto L2a
            r3 = 2130969482(0x7f04038a, float:1.7547647E38)
            goto L2d
        L2a:
            r3 = -2130969482(0xffffffff80fbfc76, float:-2.3141275E-38)
        L2d:
            r0[r1] = r3
            r1 = 2
            if (r2 == 0) goto L36
            r3 = 2130969479(0x7f040387, float:1.7547641E38)
            goto L39
        L36:
            r3 = -2130969479(0xffffffff80fbfc79, float:-2.314128E-38)
        L39:
            r0[r1] = r3
            r1 = 3
            if (r2 == 0) goto L46
            boolean r2 = r4.f5751i0
            if (r2 == 0) goto L46
            r2 = 2130969478(0x7f040386, float:1.754764E38)
            goto L49
        L46:
            r2 = -2130969478(0xffffffff80fbfc7a, float:-2.3141281E-38)
        L49:
            r0[r1] = r2
            int[] r5 = android.widget.LinearLayout.mergeDrawableStates(r5, r0)
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f5754l0
            if (r0 == 0) goto La
            r0.clear()
        La:
            r0 = 0
            r1.f5754l0 = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            boolean r2 = p227n0.C4661t.c.m10554b(r1)
            r3 = 1
            if (r2 == 0) goto L27
            boolean r2 = r1.m3245e()
            if (r2 == 0) goto L27
            int r2 = r1.getTopInset()
            int r4 = r1.getChildCount()
            int r4 = r4 - r3
        L1b:
            if (r4 < 0) goto L27
            android.view.View r5 = r1.getChildAt(r4)
            p227n0.C4661t.m10539o(r5, r2)
            int r4 = r4 + (-1)
            goto L1b
        L27:
            r2 = -1
            r1.f5744b0 = r2
            r1.f5745c0 = r2
            r1.f5746d0 = r2
            r2 = 0
            r1.f5747e0 = r2
            int r4 = r1.getChildCount()
            r5 = 0
        L36:
            if (r5 >= r4) goto L4c
            android.view.View r6 = r1.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$a r6 = (com.google.android.material.appbar.AppBarLayout.C1117a) r6
            android.view.animation.Interpolator r6 = r6.f5769b
            if (r6 == 0) goto L49
            r1.f5747e0 = r3
            goto L4c
        L49:
            int r5 = r5 + 1
            goto L36
        L4c:
            android.graphics.drawable.Drawable r4 = r1.f5757o0
            if (r4 == 0) goto L5b
            int r5 = r1.getWidth()
            int r6 = r1.getTopInset()
            r4.setBounds(r2, r2, r5, r6)
        L5b:
            boolean r4 = r1.f5752j0
            if (r4 != 0) goto L89
            int r4 = r1.getChildCount()
            r5 = 0
        L64:
            if (r5 >= r4) goto L84
            android.view.View r6 = r1.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$a r6 = (com.google.android.material.appbar.AppBarLayout.C1117a) r6
            int r6 = r6.f5768a
            r0 = r6 & 1
            if (r0 != r3) goto L7c
            r6 = r6 & 10
            if (r6 == 0) goto L7c
            r6 = 1
            goto L7d
        L7c:
            r6 = 0
        L7d:
            if (r6 == 0) goto L81
            r4 = 1
            goto L85
        L81:
            int r5 = r5 + 1
            goto L64
        L84:
            r4 = 0
        L85:
            if (r4 == 0) goto L88
            goto L89
        L88:
            r3 = 0
        L89:
            boolean r2 = r1.f5750h0
            if (r2 == r3) goto L92
            r1.f5750h0 = r3
            r1.refreshDrawableState()
        L92:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            int r3 = android.view.View.MeasureSpec.getMode(r4)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 == r0) goto L43
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.c.m10554b(r2)
            if (r0 == 0) goto L43
            boolean r0 = r2.m3245e()
            if (r0 == 0) goto L43
            int r0 = r2.getMeasuredHeight()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r1) goto L2a
            if (r3 == 0) goto L24
            goto L3c
        L24:
            int r3 = r2.getTopInset()
            int r0 = r0 + r3
            goto L3c
        L2a:
            int r3 = r2.getMeasuredHeight()
            int r0 = r2.getTopInset()
            int r0 = r0 + r3
            r3 = 0
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = p064e.C1492f.m4042b(r0, r3, r4)
        L3c:
            int r3 = r2.getMeasuredWidth()
            r2.setMeasuredDimension(r3, r0)
        L43:
            r3 = -1
            r2.f5744b0 = r3
            r2.f5745c0 = r3
            r2.f5746d0 = r3
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            p185k7.C3828h5.m8574C(r0, r1)
            return
    }

    public void setExpanded(boolean r3) {
            r2 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10588c(r2)
            r1 = 1
            r2.m3242b(r3, r0, r1)
            return
    }

    public void setLiftOnScroll(boolean r1) {
            r0 = this;
            r0.f5752j0 = r1
            return
    }

    public void setLiftOnScrollTargetViewId(int r1) {
            r0 = this;
            r0.f5753k0 = r1
            java.lang.ref.WeakReference<android.view.View> r1 = r0.f5754l0
            if (r1 == 0) goto L9
            r1.clear()
        L9:
            r1 = 0
            r0.f5754l0 = r1
            return
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L7
            super.setOrientation(r2)
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "AppBarLayout is always vertical and does not support horizontal orientation"
            r2.<init>(r0)
            throw r2
    }

    public void setStatusBarForeground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f5757o0
            if (r0 == r3) goto L4a
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.f5757o0 = r1
            if (r1 == 0) goto L42
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r2.f5757o0
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L23:
            android.graphics.drawable.Drawable r3 = r2.f5757o0
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10575d(r2)
            p103g0.C2200a.m5787c(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.f5757o0
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.f5757o0
            r3.setCallback(r2)
        L42:
            r2.m3246f()
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r2)
        L4a:
            return
    }

    public void setStatusBarForegroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarForeground(r0)
            return
    }

    public void setStatusBarForegroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            r1.setStatusBarForeground(r2)
            return
    }

    @java.lang.Deprecated
    public void setTargetElevation(float r1) {
            r0 = this;
            p373v7.C6584g.m13455a(r0, r1)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            android.graphics.drawable.Drawable r1 = r2.f5757o0
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            return
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.f5757o0
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }
}
