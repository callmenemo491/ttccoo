package com.google.android.material.bottomappbar;

/* loaded from: classes.dex */
public class BottomAppBar extends androidx.appcompat.widget.Toolbar implements androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b {

    /* renamed from: W0 */
    public static final /* synthetic */ int f5801W0 = 0;

    /* renamed from: N0 */
    public android.animation.Animator f5802N0;

    /* renamed from: O0 */
    public android.animation.Animator f5803O0;

    /* renamed from: P0 */
    public int f5804P0;

    /* renamed from: Q0 */
    public int f5805Q0;

    /* renamed from: R0 */
    public boolean f5806R0;

    /* renamed from: S0 */
    public int f5807S0;

    /* renamed from: T0 */
    public int f5808T0;

    /* renamed from: U0 */
    public boolean f5809U0;

    /* renamed from: V0 */
    public com.google.android.material.bottomappbar.BottomAppBar.Behavior f5810V0;

    public static class Behavior extends com.google.android.material.behavior.HideBottomViewOnScrollBehavior<com.google.android.material.bottomappbar.BottomAppBar> {

        /* renamed from: e */
        public final android.graphics.Rect f5811e;

        /* renamed from: f */
        public java.lang.ref.WeakReference<com.google.android.material.bottomappbar.BottomAppBar> f5812f;

        /* renamed from: g */
        public int f5813g;

        /* renamed from: h */
        public final android.view.View.OnLayoutChangeListener f5814h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class ViewOnLayoutChangeListenerC1124a implements android.view.View.OnLayoutChangeListener {

            /* renamed from: a */
            public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar.Behavior f5815a;

            public ViewOnLayoutChangeListenerC1124a(com.google.android.material.bottomappbar.BottomAppBar.Behavior r1) {
                    r0 = this;
                    r0.f5815a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                    r0 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$Behavior r2 = r0.f5815a
                    java.lang.ref.WeakReference<com.google.android.material.bottomappbar.BottomAppBar> r2 = r2.f5812f
                    java.lang.Object r2 = r2.get()
                    com.google.android.material.bottomappbar.BottomAppBar r2 = (com.google.android.material.bottomappbar.BottomAppBar) r2
                    if (r2 == 0) goto L25
                    boolean r2 = r1 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
                    if (r2 != 0) goto L11
                    goto L25
                L11:
                    com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
                    com.google.android.material.bottomappbar.BottomAppBar$Behavior r2 = r0.f5815a
                    android.graphics.Rect r2 = r2.f5811e
                    int r3 = r1.getMeasuredWidth()
                    int r1 = r1.getMeasuredHeight()
                    r4 = 0
                    r2.set(r4, r4, r3, r1)
                    r1 = 0
                    throw r1
                L25:
                    r1.removeOnLayoutChangeListener(r0)
                    return
            }
        }

        public Behavior() {
                r1 = this;
                r1.<init>()
                com.google.android.material.bottomappbar.BottomAppBar$Behavior$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior$a
                r0.<init>(r1)
                r1.f5814h = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f5811e = r0
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                com.google.android.material.bottomappbar.BottomAppBar$Behavior$a r1 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior$a
                r1.<init>(r0)
                r0.f5814h = r1
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f5811e = r1
                return
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: h */
        public boolean mo992h(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, int r5) {
                r2 = this;
                com.google.android.material.bottomappbar.BottomAppBar r4 = (com.google.android.material.bottomappbar.BottomAppBar) r4
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r4)
                r2.f5812f = r0
                int r0 = com.google.android.material.bottomappbar.BottomAppBar.f5801W0
                android.view.View r0 = r4.m3275y()
                if (r0 == 0) goto L45
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                boolean r1 = p227n0.C4661t.f.m10588c(r0)
                if (r1 != 0) goto L45
                android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r3
                r5 = 49
                r3.f1933d = r5
                int r3 = r3.bottomMargin
                r2.f5813g = r3
                boolean r3 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
                r5 = 0
                if (r3 == 0) goto L41
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
                android.view.View$OnLayoutChangeListener r3 = r2.f5814h
                r0.addOnLayoutChangeListener(r3)
                r0.m3451d(r5)
                y7.f r3 = new y7.f
                r3.<init>(r4)
                r0.m3452e(r3)
                r0.m3453f(r5)
            L41:
                r4.m3273C()
                throw r5
            L45:
                r3.m976r(r4, r5)
                android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
                int r4 = r4.getMeasuredHeight()
                int r3 = r3.bottomMargin
                int r4 = r4 + r3
                r2.f5783a = r4
                r3 = 0
                return r3
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: p */
        public boolean mo1000p(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.bottomappbar.BottomAppBar r2 = (com.google.android.material.bottomappbar.BottomAppBar) r2
                boolean r1 = r2.getHideOnScroll()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L13
                r1 = 2
                if (r5 != r1) goto Lf
                r1 = 1
                goto L10
            Lf:
                r1 = 0
            L10:
                if (r1 == 0) goto L13
                goto L14
            L13:
                r2 = 0
            L14:
                return r2
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public static class C1125a extends p320s0.AbstractC5943a {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomappbar.BottomAppBar.C1125a> CREATOR = null;

        /* renamed from: a0 */
        public int f5816a0;

        /* renamed from: b0 */
        public boolean f5817b0;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a */
        public static class a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.bottomappbar.BottomAppBar.C1125a> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.bottomappbar.BottomAppBar.C1125a createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$a[] r1 = new com.google.android.material.bottomappbar.BottomAppBar.C1125a[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.bottomappbar.BottomAppBar$a$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a$a
                r0.<init>()
                com.google.android.material.bottomappbar.BottomAppBar.C1125a.CREATOR = r0
                return
        }

        public C1125a(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r2 = r1.readInt()
                r0.f5816a0 = r2
                int r1 = r1.readInt()
                if (r1 == 0) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = 0
            L12:
                r0.f5817b0 = r1
                return
        }

        public C1125a(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p320s0.AbstractC5943a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                android.os.Parcelable r0 = r1.f22819Y
                r2.writeParcelable(r0, r3)
                int r3 = r1.f5816a0
                r2.writeInt(r3)
                boolean r3 = r1.f5817b0
                r2.writeInt(r3)
                return
        }
    }

    private androidx.appcompat.widget.ActionMenuView getActionMenuView() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L15
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.appcompat.widget.ActionMenuView
            if (r2 == 0) goto L12
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            return r1
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            r0 = 0
            return r0
    }

    private int getBottomInset() {
            r1 = this;
            r0 = 0
            return r0
    }

    private float getFabTranslationX() {
            r1 = this;
            int r0 = r1.f5804P0
            float r0 = r1.m3271A(r0)
            return r0
    }

    private float getFabTranslationY() {
            r1 = this;
            y7.g r0 = r1.getTopEdgeTreatment()
            float r0 = r0.f27552b0
            float r0 = -r0
            return r0
    }

    private int getLeftInset() {
            r1 = this;
            r0 = 0
            return r0
    }

    private int getRightInset() {
            r1 = this;
            r0 = 0
            return r0
    }

    private p430y7.C7132g getTopEdgeTreatment() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: w */
    public static void m3270w(com.google.android.material.bottomappbar.BottomAppBar r1) {
            int r0 = r1.f5807S0
            int r0 = r0 + (-1)
            r1.f5807S0 = r0
            return
    }

    /* renamed from: A */
    public final float m3271A(int r3) {
            r2 = this;
            boolean r0 = p220m8.C4430n.m9886d(r2)
            r1 = 1
            if (r3 != r1) goto L16
            int r3 = r2.getMeasuredWidth()
            int r3 = r3 / 2
            int r3 = r3 + 0
            if (r0 == 0) goto L12
            r1 = -1
        L12:
            int r3 = r3 * r1
            float r3 = (float) r3
            return r3
        L16:
            r3 = 0
            return r3
    }

    /* renamed from: B */
    public final boolean m3272B() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.m3274x()
            if (r0 == 0) goto Le
            boolean r0 = r0.m3459k()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* renamed from: C */
    public final void m3273C() {
            r2 = this;
            y7.g r0 = r2.getTopEdgeTreatment()
            float r1 = r2.getFabTranslationX()
            r0.f27553c0 = r1
            r2.m3275y()
            boolean r0 = r2.f5809U0
            if (r0 == 0) goto L15
            boolean r0 = r2.m3272B()
        L15:
            r0 = 0
            throw r0
    }

    public android.content.res.ColorStateList getBackgroundTint() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b
    public /* bridge */ /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c getBehavior() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b
    public com.google.android.material.bottomappbar.BottomAppBar.Behavior getBehavior() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.f5810V0
            if (r0 != 0) goto Lb
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior
            r0.<init>()
            r1.f5810V0 = r0
        Lb:
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.f5810V0
            return r0
    }

    public float getCradleVerticalOffset() {
            r1 = this;
            y7.g r0 = r1.getTopEdgeTreatment()
            float r0 = r0.f27552b0
            return r0
    }

    public int getFabAlignmentMode() {
            r1 = this;
            int r0 = r1.f5804P0
            return r0
    }

    public int getFabAnimationMode() {
            r1 = this;
            int r0 = r1.f5805Q0
            return r0
    }

    public float getFabCradleMargin() {
            r1 = this;
            y7.g r0 = r1.getTopEdgeTreatment()
            float r0 = r0.f27551a0
            return r0
    }

    public float getFabCradleRoundedCornerRadius() {
            r1 = this;
            y7.g r0 = r1.getTopEdgeTreatment()
            float r0 = r0.f27550Z
            return r0
    }

    public boolean getHideOnScroll() {
            r1 = this;
            boolean r0 = r1.f5806R0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            p185k7.C3828h5.m8575D(r1, r0)
            throw r0
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L18
            android.animation.Animator r1 = r0.f5803O0
            if (r1 == 0) goto Lc
            r1.cancel()
        Lc:
            android.animation.Animator r1 = r0.f5802N0
            if (r1 == 0) goto L13
            r1.cancel()
        L13:
            r0.m3273C()
            r1 = 0
            throw r1
        L18:
            androidx.appcompat.widget.ActionMenuView r1 = r0.getActionMenuView()
            if (r1 == 0) goto L3f
            android.animation.Animator r2 = r0.f5803O0
            if (r2 != 0) goto L3f
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            boolean r2 = r0.m3272B()
            if (r2 != 0) goto L33
            r2 = 0
            int r2 = r0.m3276z(r1, r2, r2)
            goto L3b
        L33:
            int r2 = r0.f5804P0
            boolean r3 = r0.f5809U0
            int r2 = r0.m3276z(r1, r2, r3)
        L3b:
            float r2 = (float) r2
            r1.setTranslationX(r2)
        L3f:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.bottomappbar.BottomAppBar.C1125a
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.bottomappbar.BottomAppBar$a r2 = (com.google.android.material.bottomappbar.BottomAppBar.C1125a) r2
            android.os.Parcelable r0 = r2.f22819Y
            super.onRestoreInstanceState(r0)
            int r0 = r2.f5816a0
            r1.f5804P0 = r0
            boolean r2 = r2.f5817b0
            r1.f5809U0 = r2
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.bottomappbar.BottomAppBar$a r1 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r1.<init>(r0)
            int r0 = r2.f5804P0
            r1.f5816a0 = r0
            boolean r0 = r2.f5809U0
            r1.f5817b0 = r0
            return r1
    }

    public void setBackgroundTint(android.content.res.ColorStateList r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setCradleVerticalOffset(float r3) {
            r2 = this;
            float r0 = r2.getCradleVerticalOffset()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L20
            y7.g r0 = r2.getTopEdgeTreatment()
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L18
            r0.f27552b0 = r3
            r3 = 0
            throw r3
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cradleVerticalOffset must be positive."
            r3.<init>(r0)
            throw r3
        L20:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setFabAlignmentMode(int r12) {
            r11 = this;
            r0 = 0
            r11.f5808T0 = r0
            boolean r1 = r11.f5809U0
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            boolean r2 = p227n0.C4661t.f.m10588c(r11)
            r3 = 1
            if (r2 != 0) goto L20
            int r1 = r11.f5808T0
            if (r1 == 0) goto La6
            r11.f5808T0 = r0
            android.view.Menu r2 = r11.getMenu()
            r2.clear()
            r11.m636n(r1)
            goto La6
        L20:
            android.animation.Animator r2 = r11.f5803O0
            if (r2 == 0) goto L27
            r2.cancel()
        L27:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r4 = r11.m3272B()
            if (r4 != 0) goto L35
            r1 = 0
            r4 = 0
            goto L36
        L35:
            r4 = r12
        L36:
            androidx.appcompat.widget.ActionMenuView r5 = r11.getActionMenuView()
            if (r5 != 0) goto L3d
            goto L8f
        L3d:
            float[] r6 = new float[r3]
            r7 = 1065353216(0x3f800000, float:1.0)
            r6[r0] = r7
            java.lang.String r8 = "alpha"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r5, r8, r6)
            float r9 = r5.getTranslationX()
            int r10 = r11.m3276z(r5, r4, r1)
            float r10 = (float) r10
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 <= 0) goto L84
            float[] r7 = new float[r3]
            r9 = 0
            r7[r0] = r9
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r5, r8, r7)
            y7.d r8 = new y7.d
            r8.<init>(r11, r5, r4, r1)
            r7.addListener(r8)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r4 = 150(0x96, double:7.4E-322)
            r1.setDuration(r4)
            r4 = 2
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r4[r0] = r7
            r4[r3] = r6
            r1.playSequentially(r4)
            r2.add(r1)
            goto L8f
        L84:
            float r1 = r5.getAlpha()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L8f
            r2.add(r6)
        L8f:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r1.playTogether(r2)
            r11.f5803O0 = r1
            y7.c r2 = new y7.c
            r2.<init>(r11)
            r1.addListener(r2)
            android.animation.Animator r1 = r11.f5803O0
            r1.start()
        La6:
            int r1 = r11.f5804P0
            if (r1 == r12) goto L10d
            boolean r1 = p227n0.C4661t.f.m10588c(r11)
            if (r1 != 0) goto Lb1
            goto L10d
        Lb1:
            android.animation.Animator r1 = r11.f5802N0
            if (r1 == 0) goto Lb8
            r1.cancel()
        Lb8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r11.f5805Q0
            if (r2 != r3) goto Ldc
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r11.m3274x()
            float[] r3 = new float[r3]
            float r4 = r11.m3271A(r12)
            r3[r0] = r4
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r2, r0, r3)
            r2 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r2)
            r1.add(r0)
            goto Lf6
        Ldc:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r11.m3274x()
            if (r0 == 0) goto Lf6
            boolean r2 = r0.m3458j()
            if (r2 == 0) goto Le9
            goto Lf6
        Le9:
            int r2 = r11.f5807S0
            int r2 = r2 + r3
            r11.f5807S0 = r2
            y7.b r2 = new y7.b
            r2.<init>(r11, r12)
            r0.m3457i(r2, r3)
        Lf6:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r0.playTogether(r1)
            r11.f5802N0 = r0
            y7.a r1 = new y7.a
            r1.<init>(r11)
            r0.addListener(r1)
            android.animation.Animator r0 = r11.f5802N0
            r0.start()
        L10d:
            r11.f5804P0 = r12
            return
    }

    public void setFabAnimationMode(int r1) {
            r0 = this;
            r0.f5805Q0 = r1
            return
    }

    public void setFabCornerSize(float r2) {
            r1 = this;
            y7.g r0 = r1.getTopEdgeTreatment()
            float r0 = r0.f27554d0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Lb
            return
        Lb:
            y7.g r0 = r1.getTopEdgeTreatment()
            r0.f27554d0 = r2
            r2 = 0
            throw r2
    }

    public void setFabCradleMargin(float r2) {
            r1 = this;
            float r0 = r1.getFabCradleMargin()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            return
        L9:
            y7.g r0 = r1.getTopEdgeTreatment()
            r0.f27551a0 = r2
            r2 = 0
            throw r2
    }

    public void setFabCradleRoundedCornerRadius(float r2) {
            r1 = this;
            float r0 = r1.getFabCradleRoundedCornerRadius()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            return
        L9:
            y7.g r0 = r1.getTopEdgeTreatment()
            r0.f27550Z = r2
            r2 = 0
            throw r2
    }

    public void setHideOnScroll(boolean r1) {
            r0 = this;
            r0.f5806R0 = r1
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    /* renamed from: x */
    public final com.google.android.material.floatingactionbutton.FloatingActionButton m3274x() {
            r2 = this;
            android.view.View r0 = r2.m3275y()
            boolean r1 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r1 == 0) goto Lb
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    /* renamed from: y */
    public final android.view.View m3275y() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m969f(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
    }

    /* renamed from: z */
    public int m3276z(androidx.appcompat.widget.ActionMenuView r7, int r8, boolean r9) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r8 != r0) goto L60
            if (r9 != 0) goto L7
            goto L60
        L7:
            boolean r8 = p220m8.C4430n.m9886d(r6)
            if (r8 == 0) goto L12
            int r9 = r6.getMeasuredWidth()
            goto L13
        L12:
            r9 = 0
        L13:
            r2 = 0
        L14:
            int r3 = r6.getChildCount()
            if (r2 >= r3) goto L52
            android.view.View r3 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            boolean r4 = r4 instanceof androidx.appcompat.widget.Toolbar.C0254e
            if (r4 == 0) goto L39
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0254e) r4
            int r4 = r4.f8308a
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 != r5) goto L39
            r4 = 1
            goto L3a
        L39:
            r4 = 0
        L3a:
            if (r4 == 0) goto L4f
            if (r8 == 0) goto L47
            int r3 = r3.getLeft()
            int r9 = java.lang.Math.min(r9, r3)
            goto L4f
        L47:
            int r3 = r3.getRight()
            int r9 = java.lang.Math.max(r9, r3)
        L4f:
            int r2 = r2 + 1
            goto L14
        L52:
            if (r8 == 0) goto L59
            int r7 = r7.getRight()
            goto L5d
        L59:
            int r7 = r7.getLeft()
        L5d:
            int r7 = r7 + r1
            int r9 = r9 - r7
            return r9
        L60:
            return r1
    }
}
