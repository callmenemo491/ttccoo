package com.google.android.material.tabs;

@p403x1.C6911b.a
/* loaded from: classes.dex */
public class TabLayout extends android.widget.HorizontalScrollView {

    /* renamed from: O0 */
    public static final p212m0.InterfaceC4313c<com.google.android.material.tabs.TabLayout.C1202f> f6264O0 = null;

    /* renamed from: A0 */
    public boolean f6265A0;

    /* renamed from: B0 */
    public boolean f6266B0;

    /* renamed from: C0 */
    public int f6267C0;

    /* renamed from: D0 */
    public boolean f6268D0;

    /* renamed from: E0 */
    public com.google.android.material.tabs.C1206a f6269E0;

    /* renamed from: F0 */
    public com.google.android.material.tabs.TabLayout.InterfaceC1199c f6270F0;

    /* renamed from: G0 */
    public final java.util.ArrayList<com.google.android.material.tabs.TabLayout.InterfaceC1199c> f6271G0;

    /* renamed from: H0 */
    public com.google.android.material.tabs.TabLayout.InterfaceC1199c f6272H0;

    /* renamed from: I0 */
    public android.animation.ValueAnimator f6273I0;

    /* renamed from: J0 */
    public p403x1.C6911b f6274J0;

    /* renamed from: K0 */
    public com.google.android.material.tabs.TabLayout.C1203g f6275K0;

    /* renamed from: L0 */
    public com.google.android.material.tabs.TabLayout.C1198b f6276L0;

    /* renamed from: M0 */
    public boolean f6277M0;

    /* renamed from: N0 */
    public final p212m0.InterfaceC4313c<com.google.android.material.tabs.TabLayout.C1204h> f6278N0;

    /* renamed from: a0 */
    public final java.util.ArrayList<com.google.android.material.tabs.TabLayout.C1202f> f6279a0;

    /* renamed from: b0 */
    public com.google.android.material.tabs.TabLayout.C1202f f6280b0;

    /* renamed from: c0 */
    public final com.google.android.material.tabs.TabLayout.C1201e f6281c0;

    /* renamed from: d0 */
    public int f6282d0;

    /* renamed from: e0 */
    public int f6283e0;

    /* renamed from: f0 */
    public int f6284f0;

    /* renamed from: g0 */
    public int f6285g0;

    /* renamed from: h0 */
    public int f6286h0;

    /* renamed from: i0 */
    public android.content.res.ColorStateList f6287i0;

    /* renamed from: j0 */
    public android.content.res.ColorStateList f6288j0;

    /* renamed from: k0 */
    public android.content.res.ColorStateList f6289k0;

    /* renamed from: l0 */
    public android.graphics.drawable.Drawable f6290l0;

    /* renamed from: m0 */
    public int f6291m0;

    /* renamed from: n0 */
    public android.graphics.PorterDuff.Mode f6292n0;

    /* renamed from: o0 */
    public float f6293o0;

    /* renamed from: p0 */
    public float f6294p0;

    /* renamed from: q0 */
    public final int f6295q0;

    /* renamed from: r0 */
    public int f6296r0;

    /* renamed from: s0 */
    public final int f6297s0;

    /* renamed from: t0 */
    public final int f6298t0;

    /* renamed from: u0 */
    public final int f6299u0;

    /* renamed from: v0 */
    public int f6300v0;

    /* renamed from: w0 */
    public int f6301w0;

    /* renamed from: x0 */
    public int f6302x0;

    /* renamed from: y0 */
    public int f6303y0;

    /* renamed from: z0 */
    public int f6304z0;

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C1197a implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.tabs.TabLayout f6305a;

        public C1197a(com.google.android.material.tabs.TabLayout r1) {
                r0 = this;
                r0.f6305a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                com.google.android.material.tabs.TabLayout r0 = r2.f6305a
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1 = 0
                r0.scrollTo(r3, r1)
                return
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C1198b implements p403x1.C6911b.c {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.tabs.TabLayout f6306a;

        public C1198b(com.google.android.material.tabs.TabLayout r1) {
                r0 = this;
                r0.f6306a = r1
                r0.<init>()
                return
        }

        @Override // p403x1.C6911b.c
        /* renamed from: a */
        public void mo3515a(p403x1.C6911b r1, p403x1.AbstractC6910a r2, p403x1.AbstractC6910a r3) {
                r0 = this;
                com.google.android.material.tabs.TabLayout r2 = r0.f6306a
                x1.b r3 = r2.f6274J0
                if (r3 != r1) goto L9
                r2.m3508i()
            L9:
                return
        }
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface InterfaceC1199c<T extends com.google.android.material.tabs.TabLayout.C1202f> {
        /* renamed from: a */
        void mo3516a(T r1);

        /* renamed from: b */
        void mo3517b(T r1);

        /* renamed from: c */
        void mo3518c(T r1);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface InterfaceC1200d extends com.google.android.material.tabs.TabLayout.InterfaceC1199c<com.google.android.material.tabs.TabLayout.C1202f> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C1201e extends android.widget.LinearLayout {

        /* renamed from: a0 */
        public android.animation.ValueAnimator f6307a0;

        /* renamed from: b0 */
        public int f6308b0;

        /* renamed from: c0 */
        public float f6309c0;

        /* renamed from: d0 */
        public int f6310d0;

        /* renamed from: e0 */
        public final /* synthetic */ com.google.android.material.tabs.TabLayout f6311e0;

        /* renamed from: com.google.android.material.tabs.TabLayout$e$a */
        public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ android.view.View f6312a;

            /* renamed from: b */
            public final /* synthetic */ android.view.View f6313b;

            /* renamed from: c */
            public final /* synthetic */ com.google.android.material.tabs.TabLayout.C1201e f6314c;

            public a(com.google.android.material.tabs.TabLayout.C1201e r1, android.view.View r2, android.view.View r3) {
                    r0 = this;
                    r0.f6314c = r1
                    r0.f6312a = r2
                    r0.f6313b = r3
                    r0.<init>()
                    return
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator r4) {
                    r3 = this;
                    com.google.android.material.tabs.TabLayout$e r0 = r3.f6314c
                    android.view.View r1 = r3.f6312a
                    android.view.View r2 = r3.f6313b
                    float r4 = r4.getAnimatedFraction()
                    r0.m3521c(r1, r2, r4)
                    return
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$e$b */
        public class b extends android.animation.AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ int f6315a;

            /* renamed from: b */
            public final /* synthetic */ com.google.android.material.tabs.TabLayout.C1201e f6316b;

            public b(com.google.android.material.tabs.TabLayout.C1201e r1, int r2) {
                    r0 = this;
                    r0.f6316b = r1
                    r0.f6315a = r2
                    r0.<init>()
                    return
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator r2) {
                    r1 = this;
                    com.google.android.material.tabs.TabLayout$e r2 = r1.f6316b
                    int r0 = r1.f6315a
                    r2.f6308b0 = r0
                    return
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator r2) {
                    r1 = this;
                    com.google.android.material.tabs.TabLayout$e r2 = r1.f6316b
                    int r0 = r1.f6315a
                    r2.f6308b0 = r0
                    return
            }
        }

        public C1201e(com.google.android.material.tabs.TabLayout r1, android.content.Context r2) {
                r0 = this;
                r0.f6311e0 = r1
                r0.<init>(r2)
                r1 = -1
                r0.f6308b0 = r1
                r0.f6310d0 = r1
                r1 = 0
                r0.setWillNotDraw(r1)
                return
        }

        /* renamed from: a */
        public final void m3519a() {
                r5 = this;
                int r0 = r5.f6308b0
                android.view.View r0 = r5.getChildAt(r0)
                com.google.android.material.tabs.TabLayout r1 = r5.f6311e0
                com.google.android.material.tabs.a r2 = r1.f6269E0
                android.graphics.drawable.Drawable r3 = r1.f6290l0
                java.util.Objects.requireNonNull(r2)
                android.graphics.RectF r0 = com.google.android.material.tabs.C1206a.m3537a(r1, r0)
                float r1 = r0.left
                int r1 = (int) r1
                android.graphics.Rect r2 = r3.getBounds()
                int r2 = r2.top
                float r0 = r0.right
                int r0 = (int) r0
                android.graphics.Rect r4 = r3.getBounds()
                int r4 = r4.bottom
                r3.setBounds(r1, r2, r0, r4)
                return
        }

        /* renamed from: b */
        public void m3520b(int r5) {
                r4 = this;
                com.google.android.material.tabs.TabLayout r0 = r4.f6311e0
                android.graphics.drawable.Drawable r0 = r0.f6290l0
                android.graphics.Rect r0 = r0.getBounds()
                com.google.android.material.tabs.TabLayout r1 = r4.f6311e0
                android.graphics.drawable.Drawable r1 = r1.f6290l0
                int r2 = r0.left
                int r0 = r0.right
                r3 = 0
                r1.setBounds(r2, r3, r0, r5)
                r4.requestLayout()
                return
        }

        /* renamed from: c */
        public final void m3521c(android.view.View r8, android.view.View r9, float r10) {
                r7 = this;
                if (r8 == 0) goto La
                int r0 = r8.getWidth()
                if (r0 <= 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout r2 = r7.f6311e0
                com.google.android.material.tabs.a r1 = r2.f6269E0
                android.graphics.drawable.Drawable r6 = r2.f6290l0
                r3 = r8
                r4 = r9
                r5 = r10
                r1.mo3538b(r2, r3, r4, r5, r6)
                goto L32
            L1a:
                com.google.android.material.tabs.TabLayout r8 = r7.f6311e0
                android.graphics.drawable.Drawable r8 = r8.f6290l0
                android.graphics.Rect r9 = r8.getBounds()
                int r9 = r9.top
                com.google.android.material.tabs.TabLayout r10 = r7.f6311e0
                android.graphics.drawable.Drawable r10 = r10.f6290l0
                android.graphics.Rect r10 = r10.getBounds()
                int r10 = r10.bottom
                r0 = -1
                r8.setBounds(r0, r9, r0, r10)
            L32:
                java.util.WeakHashMap<android.view.View, n0.w> r8 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10563k(r7)
                return
        }

        /* renamed from: d */
        public final void m3522d(boolean r4, int r5, int r6) {
                r3 = this;
                int r0 = r3.f6308b0
                android.view.View r0 = r3.getChildAt(r0)
                android.view.View r1 = r3.getChildAt(r5)
                if (r1 != 0) goto L10
                r3.m3519a()
                return
            L10:
                com.google.android.material.tabs.TabLayout$e$a r2 = new com.google.android.material.tabs.TabLayout$e$a
                r2.<init>(r3, r0, r1)
                if (r4 == 0) goto L3f
                android.animation.ValueAnimator r4 = new android.animation.ValueAnimator
                r4.<init>()
                r3.f6307a0 = r4
                android.animation.TimeInterpolator r0 = p354u7.C6350a.f24804b
                r4.setInterpolator(r0)
                long r0 = (long) r6
                r4.setDuration(r0)
                r6 = 2
                float[] r6 = new float[r6]
                r6 = {x004a: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                r4.setFloatValues(r6)
                r4.addUpdateListener(r2)
                com.google.android.material.tabs.TabLayout$e$b r6 = new com.google.android.material.tabs.TabLayout$e$b
                r6.<init>(r3, r5)
                r4.addListener(r6)
                r4.start()
                goto L49
            L3f:
                android.animation.ValueAnimator r4 = r3.f6307a0
                r4.removeAllUpdateListeners()
                android.animation.ValueAnimator r4 = r3.f6307a0
                r4.addUpdateListener(r2)
            L49:
                return
        }

        @Override // android.view.View
        public void draw(android.graphics.Canvas r6) {
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = r5.f6311e0
                android.graphics.drawable.Drawable r0 = r0.f6290l0
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.height()
                if (r0 >= 0) goto L16
                com.google.android.material.tabs.TabLayout r0 = r5.f6311e0
                android.graphics.drawable.Drawable r0 = r0.f6290l0
                int r0 = r0.getIntrinsicHeight()
            L16:
                com.google.android.material.tabs.TabLayout r1 = r5.f6311e0
                int r1 = r1.f6303y0
                r2 = 0
                if (r1 == 0) goto L37
                r3 = 1
                r4 = 2
                if (r1 == r3) goto L28
                if (r1 == r4) goto L41
                r0 = 3
                if (r1 == r0) goto L3d
                r0 = 0
                goto L41
            L28:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r2 = r1 / 2
                int r1 = r5.getHeight()
                int r1 = r1 + r0
                int r0 = r1 / 2
                goto L41
            L37:
                int r1 = r5.getHeight()
                int r2 = r1 - r0
            L3d:
                int r0 = r5.getHeight()
            L41:
                com.google.android.material.tabs.TabLayout r1 = r5.f6311e0
                android.graphics.drawable.Drawable r1 = r1.f6290l0
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.width()
                if (r1 <= 0) goto L88
                com.google.android.material.tabs.TabLayout r1 = r5.f6311e0
                android.graphics.drawable.Drawable r1 = r1.f6290l0
                android.graphics.Rect r1 = r1.getBounds()
                com.google.android.material.tabs.TabLayout r3 = r5.f6311e0
                android.graphics.drawable.Drawable r3 = r3.f6290l0
                int r4 = r1.left
                int r1 = r1.right
                r3.setBounds(r4, r2, r1, r0)
                com.google.android.material.tabs.TabLayout r0 = r5.f6311e0
                android.graphics.drawable.Drawable r1 = r0.f6290l0
                int r0 = r0.f6291m0
                if (r0 == 0) goto L85
                android.graphics.drawable.Drawable r1 = p103g0.C2200a.m5792h(r1)
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r0 != r2) goto L7e
                com.google.android.material.tabs.TabLayout r0 = r5.f6311e0
                int r0 = r0.f6291m0
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
                r1.setColorFilter(r0, r2)
                goto L85
            L7e:
                com.google.android.material.tabs.TabLayout r0 = r5.f6311e0
                int r0 = r0.f6291m0
                r1.setTint(r0)
            L85:
                r1.draw(r6)
            L88:
                super.draw(r6)
                return
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                super.onLayout(r1, r2, r3, r4, r5)
                android.animation.ValueAnimator r1 = r0.f6307a0
                if (r1 == 0) goto L15
                boolean r1 = r1.isRunning()
                if (r1 == 0) goto L15
                r1 = 0
                int r2 = r0.f6308b0
                r3 = -1
                r0.m3522d(r1, r2, r3)
                goto L18
            L15:
                r0.m3519a()
            L18:
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r9, int r10) {
                r8 = this;
                super.onMeasure(r9, r10)
                int r0 = android.view.View.MeasureSpec.getMode(r9)
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 == r1) goto Lc
                return
            Lc:
                com.google.android.material.tabs.TabLayout r0 = r8.f6311e0
                int r1 = r0.f6301w0
                r2 = 2
                r3 = 1
                if (r1 == r3) goto L18
                int r0 = r0.f6304z0
                if (r0 != r2) goto L7d
            L18:
                int r0 = r8.getChildCount()
                r1 = 0
                r4 = 0
                r5 = 0
            L1f:
                if (r4 >= r0) goto L36
                android.view.View r6 = r8.getChildAt(r4)
                int r7 = r6.getVisibility()
                if (r7 != 0) goto L33
                int r6 = r6.getMeasuredWidth()
                int r5 = java.lang.Math.max(r5, r6)
            L33:
                int r4 = r4 + 1
                goto L1f
            L36:
                if (r5 > 0) goto L39
                return
            L39:
                android.content.Context r4 = r8.getContext()
                r6 = 16
                float r4 = p220m8.C4430n.m9884b(r4, r6)
                int r4 = (int) r4
                int r6 = r5 * r0
                int r7 = r8.getMeasuredWidth()
                int r4 = r4 * 2
                int r7 = r7 - r4
                if (r6 > r7) goto L71
                r2 = 0
            L50:
                if (r1 >= r0) goto L6f
                android.view.View r4 = r8.getChildAt(r1)
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
                int r6 = r4.width
                r7 = 0
                if (r6 != r5) goto L67
                float r6 = r4.weight
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 == 0) goto L6c
            L67:
                r4.width = r5
                r4.weight = r7
                r2 = 1
            L6c:
                int r1 = r1 + 1
                goto L50
            L6f:
                r3 = r2
                goto L78
            L71:
                com.google.android.material.tabs.TabLayout r0 = r8.f6311e0
                r0.f6301w0 = r1
                r0.m3514o(r1)
            L78:
                if (r3 == 0) goto L7d
                super.onMeasure(r9, r10)
            L7d:
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int r3) {
                r2 = this;
                super.onRtlPropertiesChanged(r3)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 >= r1) goto L12
                int r0 = r2.f6310d0
                if (r0 == r3) goto L12
                r2.requestLayout()
                r2.f6310d0 = r3
            L12:
                return
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public static class C1202f {

        /* renamed from: a */
        public android.graphics.drawable.Drawable f6317a;

        /* renamed from: b */
        public java.lang.CharSequence f6318b;

        /* renamed from: c */
        public java.lang.CharSequence f6319c;

        /* renamed from: d */
        public int f6320d;

        /* renamed from: e */
        public android.view.View f6321e;

        /* renamed from: f */
        public com.google.android.material.tabs.TabLayout f6322f;

        /* renamed from: g */
        public com.google.android.material.tabs.TabLayout.C1204h f6323g;

        /* renamed from: h */
        public int f6324h;

        public C1202f() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f6320d = r0
                r1.f6324h = r0
                return
        }

        /* renamed from: a */
        public com.google.android.material.tabs.TabLayout.C1202f m3523a(int r4) {
                r3 = this;
                com.google.android.material.tabs.TabLayout$h r0 = r3.f6323g
                android.content.Context r0 = r0.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                com.google.android.material.tabs.TabLayout$h r1 = r3.f6323g
                r2 = 0
                android.view.View r4 = r0.inflate(r4, r1, r2)
                r3.f6321e = r4
                r3.m3527e()
                return r3
        }

        /* renamed from: b */
        public com.google.android.material.tabs.TabLayout.C1202f m3524b(int r2) {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.f6322f
                if (r0 == 0) goto L10
                android.content.Context r0 = r0.getContext()
                android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
                r1.m3525c(r2)
                return r1
            L10:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Tab not attached to a TabLayout"
                r2.<init>(r0)
                throw r2
        }

        /* renamed from: c */
        public com.google.android.material.tabs.TabLayout.C1202f m3525c(android.graphics.drawable.Drawable r4) {
                r3 = this;
                r3.f6317a = r4
                com.google.android.material.tabs.TabLayout r4 = r3.f6322f
                int r0 = r4.f6301w0
                r1 = 1
                if (r0 == r1) goto Le
                int r0 = r4.f6304z0
                r2 = 2
                if (r0 != r2) goto L11
            Le:
                r4.m3514o(r1)
            L11:
                r3.m3527e()
                return r3
        }

        /* renamed from: d */
        public com.google.android.material.tabs.TabLayout.C1202f m3526d(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = r1.f6319c
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L13
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L13
                com.google.android.material.tabs.TabLayout$h r0 = r1.f6323g
                r0.setContentDescription(r2)
            L13:
                r1.f6318b = r2
                r1.m3527e()
                return r1
        }

        /* renamed from: e */
        public void m3527e() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$h r0 = r1.f6323g
                if (r0 == 0) goto L7
                r0.m3534f()
            L7:
                return
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C1203g implements p403x1.C6911b.d {

        /* renamed from: a */
        public final java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> f6325a;

        /* renamed from: b */
        public int f6326b;

        /* renamed from: c */
        public int f6327c;

        public C1203g(com.google.android.material.tabs.TabLayout r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f6325a = r0
                return
        }

        @Override // p403x1.C6911b.d
        /* renamed from: a */
        public void mo3528a(int r2) {
                r1 = this;
                int r0 = r1.f6327c
                r1.f6326b = r0
                r1.f6327c = r2
                return
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public final class C1204h extends android.widget.LinearLayout {

        /* renamed from: l0 */
        public static final /* synthetic */ int f6328l0 = 0;

        /* renamed from: a0 */
        public com.google.android.material.tabs.TabLayout.C1202f f6329a0;

        /* renamed from: b0 */
        public android.widget.TextView f6330b0;

        /* renamed from: c0 */
        public android.widget.ImageView f6331c0;

        /* renamed from: d0 */
        public android.view.View f6332d0;

        /* renamed from: e0 */
        public p389w7.C6817a f6333e0;

        /* renamed from: f0 */
        public android.view.View f6334f0;

        /* renamed from: g0 */
        public android.widget.TextView f6335g0;

        /* renamed from: h0 */
        public android.widget.ImageView f6336h0;

        /* renamed from: i0 */
        public android.graphics.drawable.Drawable f6337i0;

        /* renamed from: j0 */
        public int f6338j0;

        /* renamed from: k0 */
        public final /* synthetic */ com.google.android.material.tabs.TabLayout f6339k0;

        public C1204h(com.google.android.material.tabs.TabLayout r5, android.content.Context r6) {
                r4 = this;
                r4.f6339k0 = r5
                r4.<init>(r6)
                r0 = 2
                r4.f6338j0 = r0
                r4.m3535g(r6)
                int r6 = r5.f6282d0
                int r0 = r5.f6283e0
                int r1 = r5.f6284f0
                int r2 = r5.f6285g0
                java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
                p227n0.C4661t.d.m10582k(r4, r6, r0, r1, r2)
                r6 = 17
                r4.setGravity(r6)
                boolean r5 = r5.f6265A0
                r6 = 1
                r5 = r5 ^ r6
                r4.setOrientation(r5)
                r4.setClickable(r6)
                android.content.Context r5 = r4.getContext()
                r6 = 1002(0x3ea, float:1.404E-42)
                n0.p r5 = p227n0.C4657p.m10521a(r5, r6)
                p227n0.C4661t.m10547w(r4, r5)
                return
        }

        private p389w7.C6817a getBadge() {
                r1 = this;
                w7.a r0 = r1.f6333e0
                return r0
        }

        private p389w7.C6817a getOrCreateBadge() {
                r13 = this;
                w7.a r0 = r13.f6333e0
                if (r0 != 0) goto L87
                android.content.Context r0 = r13.getContext()
                w7.a r7 = new w7.a
                r7.<init>(r0)
                int[] r8 = p339t7.C6183a.f24006c
                r9 = 0
                int[] r6 = new int[r9]
                r10 = 0
                r11 = 2130968658(0x7f040052, float:1.7545976E38)
                r12 = 2132017909(0x7f1402f5, float:1.967411E38)
                p220m8.C4429m.m9878a(r0, r10, r11, r12)
                r2 = 0
                r4 = 2130968658(0x7f040052, float:1.7545976E38)
                r5 = 2132017909(0x7f1402f5, float:1.967411E38)
                r1 = r0
                r3 = r8
                p220m8.C4429m.m9879b(r1, r2, r3, r4, r5, r6)
                android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r10, r8, r11, r12)
                r2 = 4
                int r2 = r1.getInt(r2, r2)
                r7.m13896j(r2)
                r2 = 5
                boolean r3 = r1.hasValue(r2)
                if (r3 == 0) goto L42
                int r2 = r1.getInt(r2, r9)
                r7.m13897k(r2)
            L42:
                android.content.res.ColorStateList r2 = p288q8.C5599c.m11875a(r0, r1, r9)
                int r2 = r2.getDefaultColor()
                r7.m13893g(r2)
                r2 = 2
                boolean r3 = r1.hasValue(r2)
                if (r3 == 0) goto L5f
                android.content.res.ColorStateList r0 = p288q8.C5599c.m11875a(r0, r1, r2)
                int r0 = r0.getDefaultColor()
                r7.m13895i(r0)
            L5f:
                r0 = 1
                r2 = 8388661(0x800035, float:1.1755018E-38)
                int r0 = r1.getInt(r0, r2)
                r7.m13894h(r0)
                r0 = 3
                int r0 = r1.getDimensionPixelOffset(r0, r9)
                w7.a$a r2 = r7.f26535f0
                r2.f26554i0 = r0
                r7.m13899m()
                r0 = 6
                int r0 = r1.getDimensionPixelOffset(r0, r9)
                w7.a$a r2 = r7.f26535f0
                r2.f26555j0 = r0
                r7.m13899m()
                r1.recycle()
                r13.f6333e0 = r7
            L87:
                r13.m3532d()
                w7.a r0 = r13.f6333e0
                if (r0 == 0) goto L8f
                return r0
            L8f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Unable to create badge"
                r0.<init>(r1)
                throw r0
        }

        /* renamed from: a */
        public final boolean m3529a() {
                r1 = this;
                w7.a r0 = r1.f6333e0
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        /* renamed from: b */
        public final void m3530b(android.view.View r3) {
                r2 = this;
                boolean r0 = r2.m3529a()
                if (r0 != 0) goto L7
                return
            L7:
                if (r3 == 0) goto L26
                r0 = 0
                r2.setClipChildren(r0)
                r2.setClipToPadding(r0)
                android.view.ViewParent r1 = r2.getParent()
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                if (r1 == 0) goto L1e
                r1.setClipChildren(r0)
                r1.setClipToPadding(r0)
            L1e:
                w7.a r0 = r2.f6333e0
                r1 = 0
                p389w7.C6818b.m13900a(r0, r3, r1)
                r2.f6332d0 = r3
            L26:
                return
        }

        /* renamed from: c */
        public final void m3531c() {
                r2 = this;
                boolean r0 = r2.m3529a()
                if (r0 != 0) goto L7
                return
            L7:
                r0 = 1
                r2.setClipChildren(r0)
                r2.setClipToPadding(r0)
                android.view.ViewParent r1 = r2.getParent()
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                if (r1 == 0) goto L1c
                r1.setClipChildren(r0)
                r1.setClipToPadding(r0)
            L1c:
                android.view.View r0 = r2.f6332d0
                if (r0 == 0) goto L28
                w7.a r1 = r2.f6333e0
                p389w7.C6818b.m13901b(r1, r0)
                r0 = 0
                r2.f6332d0 = r0
            L28:
                return
        }

        /* renamed from: d */
        public final void m3532d() {
                r2 = this;
                boolean r0 = r2.m3529a()
                if (r0 != 0) goto L7
                return
            L7:
                android.view.View r0 = r2.f6334f0
                if (r0 == 0) goto Lf
            Lb:
                r2.m3531c()
                goto L46
            Lf:
                android.widget.ImageView r0 = r2.f6331c0
                if (r0 == 0) goto L2c
                com.google.android.material.tabs.TabLayout$f r1 = r2.f6329a0
                if (r1 == 0) goto L2c
                android.graphics.drawable.Drawable r1 = r1.f6317a
                if (r1 == 0) goto L2c
                android.view.View r1 = r2.f6332d0
                if (r1 == r0) goto L28
                r2.m3531c()
                android.widget.ImageView r0 = r2.f6331c0
            L24:
                r2.m3530b(r0)
                goto L46
            L28:
                r2.m3533e(r0)
                goto L46
            L2c:
                android.widget.TextView r0 = r2.f6330b0
                if (r0 == 0) goto Lb
                com.google.android.material.tabs.TabLayout$f r0 = r2.f6329a0
                if (r0 == 0) goto Lb
                java.util.Objects.requireNonNull(r0)
                android.view.View r0 = r2.f6332d0
                android.widget.TextView r1 = r2.f6330b0
                if (r0 == r1) goto L43
                r2.m3531c()
                android.widget.TextView r0 = r2.f6330b0
                goto L24
            L43:
                r2.m3533e(r1)
            L46:
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
                r3 = this;
                super.drawableStateChanged()
                int[] r0 = r3.getDrawableState()
                android.graphics.drawable.Drawable r1 = r3.f6337i0
                r2 = 0
                if (r1 == 0) goto L19
                boolean r1 = r1.isStateful()
                if (r1 == 0) goto L19
                android.graphics.drawable.Drawable r1 = r3.f6337i0
                boolean r0 = r1.setState(r0)
                r2 = r2 | r0
            L19:
                if (r2 == 0) goto L23
                r3.invalidate()
                com.google.android.material.tabs.TabLayout r0 = r3.f6339k0
                r0.invalidate()
            L23:
                return
        }

        /* renamed from: e */
        public final void m3533e(android.view.View r3) {
                r2 = this;
                boolean r0 = r2.m3529a()
                if (r0 == 0) goto L10
                android.view.View r0 = r2.f6332d0
                if (r3 != r0) goto L10
                w7.a r0 = r2.f6333e0
                r1 = 0
                p389w7.C6818b.m13902c(r0, r3, r1)
            L10:
                return
        }

        /* renamed from: f */
        public final void m3534f() {
                r5 = this;
                com.google.android.material.tabs.TabLayout$f r0 = r5.f6329a0
                r1 = 0
                if (r0 == 0) goto L8
                android.view.View r2 = r0.f6321e
                goto L9
            L8:
                r2 = r1
            L9:
                if (r2 == 0) goto L51
                android.view.ViewParent r3 = r2.getParent()
                if (r3 == r5) goto L1b
                if (r3 == 0) goto L18
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r3.removeView(r2)
            L18:
                r5.addView(r2)
            L1b:
                r5.f6334f0 = r2
                android.widget.TextView r3 = r5.f6330b0
                r4 = 8
                if (r3 == 0) goto L26
                r3.setVisibility(r4)
            L26:
                android.widget.ImageView r3 = r5.f6331c0
                if (r3 == 0) goto L32
                r3.setVisibility(r4)
                android.widget.ImageView r3 = r5.f6331c0
                r3.setImageDrawable(r1)
            L32:
                r3 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r3 = r2.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r5.f6335g0 = r3
                if (r3 == 0) goto L45
                int r3 = r3.getMaxLines()
                r5.f6338j0 = r3
            L45:
                r3 = 16908294(0x1020006, float:2.3877246E-38)
                android.view.View r2 = r2.findViewById(r3)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r5.f6336h0 = r2
                goto L5e
            L51:
                android.view.View r2 = r5.f6334f0
                if (r2 == 0) goto L5a
                r5.removeView(r2)
                r5.f6334f0 = r1
            L5a:
                r5.f6335g0 = r1
                r5.f6336h0 = r1
            L5e:
                android.view.View r2 = r5.f6334f0
                r3 = 0
                if (r2 != 0) goto Lf8
                android.widget.ImageView r2 = r5.f6331c0
                if (r2 != 0) goto L7d
                android.content.Context r2 = r5.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                r4 = 2131558452(0x7f0d0034, float:1.874222E38)
                android.view.View r2 = r2.inflate(r4, r5, r3)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r5.f6331c0 = r2
                r5.addView(r2, r3)
            L7d:
                if (r0 == 0) goto L8b
                android.graphics.drawable.Drawable r2 = r0.f6317a
                if (r2 == 0) goto L8b
                android.graphics.drawable.Drawable r1 = p103g0.C2200a.m5792h(r2)
                android.graphics.drawable.Drawable r1 = r1.mutate()
            L8b:
                if (r1 == 0) goto L9d
                com.google.android.material.tabs.TabLayout r2 = r5.f6339k0
                android.content.res.ColorStateList r2 = r2.f6288j0
                r1.setTintList(r2)
                com.google.android.material.tabs.TabLayout r2 = r5.f6339k0
                android.graphics.PorterDuff$Mode r2 = r2.f6292n0
                if (r2 == 0) goto L9d
                r1.setTintMode(r2)
            L9d:
                android.widget.TextView r1 = r5.f6330b0
                if (r1 != 0) goto Lbf
                android.content.Context r1 = r5.getContext()
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r2 = 2131558453(0x7f0d0035, float:1.8742222E38)
                android.view.View r1 = r1.inflate(r2, r5, r3)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r5.f6330b0 = r1
                r5.addView(r1)
                android.widget.TextView r1 = r5.f6330b0
                int r1 = r1.getMaxLines()
                r5.f6338j0 = r1
            Lbf:
                android.widget.TextView r1 = r5.f6330b0
                com.google.android.material.tabs.TabLayout r2 = r5.f6339k0
                int r2 = r2.f6286h0
                p280q0.C5540g.m11822f(r1, r2)
                com.google.android.material.tabs.TabLayout r1 = r5.f6339k0
                android.content.res.ColorStateList r1 = r1.f6287i0
                if (r1 == 0) goto Ld3
                android.widget.TextView r2 = r5.f6330b0
                r2.setTextColor(r1)
            Ld3:
                android.widget.TextView r1 = r5.f6330b0
                android.widget.ImageView r2 = r5.f6331c0
                r5.m3536h(r1, r2)
                r5.m3532d()
                android.widget.ImageView r1 = r5.f6331c0
                if (r1 != 0) goto Le2
                goto Lea
            Le2:
                com.google.android.material.tabs.b r2 = new com.google.android.material.tabs.b
                r2.<init>(r5, r1)
                r1.addOnLayoutChangeListener(r2)
            Lea:
                android.widget.TextView r1 = r5.f6330b0
                if (r1 != 0) goto Lef
                goto L105
            Lef:
                com.google.android.material.tabs.b r2 = new com.google.android.material.tabs.b
                r2.<init>(r5, r1)
                r1.addOnLayoutChangeListener(r2)
                goto L105
            Lf8:
                android.widget.TextView r1 = r5.f6335g0
                if (r1 != 0) goto L100
                android.widget.ImageView r2 = r5.f6336h0
                if (r2 == 0) goto L105
            L100:
                android.widget.ImageView r2 = r5.f6336h0
                r5.m3536h(r1, r2)
            L105:
                if (r0 == 0) goto L114
                java.lang.CharSequence r1 = r0.f6319c
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L114
                java.lang.CharSequence r1 = r0.f6319c
                r5.setContentDescription(r1)
            L114:
                r1 = 1
                if (r0 == 0) goto L132
                com.google.android.material.tabs.TabLayout r2 = r0.f6322f
                if (r2 == 0) goto L12a
                int r2 = r2.getSelectedTabPosition()
                int r0 = r0.f6320d
                if (r2 != r0) goto L125
                r0 = 1
                goto L126
            L125:
                r0 = 0
            L126:
                if (r0 == 0) goto L132
                r3 = 1
                goto L132
            L12a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
            L132:
                r5.setSelected(r3)
                return
        }

        /* renamed from: g */
        public final void m3535g(android.content.Context r6) {
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = r5.f6339k0
                int r0 = r0.f6295q0
                r1 = 0
                if (r0 == 0) goto L1f
                android.graphics.drawable.Drawable r6 = p102g.C2199a.m5784b(r6, r0)
                r5.f6337i0 = r6
                if (r6 == 0) goto L21
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L21
                android.graphics.drawable.Drawable r6 = r5.f6337i0
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L21
            L1f:
                r5.f6337i0 = r1
            L21:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = r5.f6339k0
                android.content.res.ColorStateList r0 = r0.f6289k0
                if (r0 == 0) goto L58
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = r5.f6339k0
                android.content.res.ColorStateList r2 = r2.f6289k0
                android.content.res.ColorStateList r2 = p308r8.C5799a.m12169a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = r5.f6339k0
                boolean r4 = r4.f6268D0
                if (r4 == 0) goto L50
                r6 = r1
            L50:
                if (r4 == 0) goto L53
                goto L54
            L53:
                r1 = r0
            L54:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L58:
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10569q(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = r5.f6339k0
                r6.invalidate()
                return
        }

        public int getContentHeight() {
                r9 = this;
                r0 = 3
                android.view.View[] r1 = new android.view.View[r0]
                android.widget.TextView r2 = r9.f6330b0
                r3 = 0
                r1[r3] = r2
                android.widget.ImageView r2 = r9.f6331c0
                r4 = 1
                r1[r4] = r2
                android.view.View r2 = r9.f6334f0
                r5 = 2
                r1[r5] = r2
                r2 = 0
                r5 = 0
                r6 = 0
            L15:
                if (r3 >= r0) goto L43
                r7 = r1[r3]
                if (r7 == 0) goto L40
                int r8 = r7.getVisibility()
                if (r8 != 0) goto L40
                if (r6 == 0) goto L2c
                int r8 = r7.getTop()
                int r5 = java.lang.Math.min(r5, r8)
                goto L30
            L2c:
                int r5 = r7.getTop()
            L30:
                if (r6 == 0) goto L3b
                int r6 = r7.getBottom()
                int r2 = java.lang.Math.max(r2, r6)
                goto L3f
            L3b:
                int r2 = r7.getBottom()
            L3f:
                r6 = 1
            L40:
                int r3 = r3 + 1
                goto L15
            L43:
                int r2 = r2 - r5
                return r2
        }

        public int getContentWidth() {
                r9 = this;
                r0 = 3
                android.view.View[] r1 = new android.view.View[r0]
                android.widget.TextView r2 = r9.f6330b0
                r3 = 0
                r1[r3] = r2
                android.widget.ImageView r2 = r9.f6331c0
                r4 = 1
                r1[r4] = r2
                android.view.View r2 = r9.f6334f0
                r5 = 2
                r1[r5] = r2
                r2 = 0
                r5 = 0
                r6 = 0
            L15:
                if (r3 >= r0) goto L43
                r7 = r1[r3]
                if (r7 == 0) goto L40
                int r8 = r7.getVisibility()
                if (r8 != 0) goto L40
                if (r6 == 0) goto L2c
                int r8 = r7.getLeft()
                int r5 = java.lang.Math.min(r5, r8)
                goto L30
            L2c:
                int r5 = r7.getLeft()
            L30:
                if (r6 == 0) goto L3b
                int r6 = r7.getRight()
                int r2 = java.lang.Math.max(r2, r6)
                goto L3f
            L3b:
                int r2 = r7.getRight()
            L3f:
                r6 = 1
            L40:
                int r3 = r3 + 1
                goto L15
            L43:
                int r2 = r2 - r5
                return r2
        }

        public com.google.android.material.tabs.TabLayout.C1202f getTab() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$f r0 = r1.f6329a0
                return r0
        }

        /* renamed from: h */
        public final void m3536h(android.widget.TextView r7, android.widget.ImageView r8) {
                r6 = this;
                com.google.android.material.tabs.TabLayout$f r0 = r6.f6329a0
                r1 = 0
                if (r0 == 0) goto L12
                android.graphics.drawable.Drawable r0 = r0.f6317a
                if (r0 == 0) goto L12
                android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5792h(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L13
            L12:
                r0 = r1
            L13:
                com.google.android.material.tabs.TabLayout$f r2 = r6.f6329a0
                if (r2 == 0) goto L1a
                java.lang.CharSequence r2 = r2.f6318b
                goto L1b
            L1a:
                r2 = r1
            L1b:
                r3 = 8
                r4 = 0
                if (r8 == 0) goto L32
                if (r0 == 0) goto L2c
                r8.setImageDrawable(r0)
                r8.setVisibility(r4)
                r6.setVisibility(r4)
                goto L32
            L2c:
                r8.setVisibility(r3)
                r8.setImageDrawable(r1)
            L32:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                r0 = r0 ^ 1
                if (r7 == 0) goto L51
                if (r0 == 0) goto L4b
                r7.setText(r2)
                com.google.android.material.tabs.TabLayout$f r5 = r6.f6329a0
                java.util.Objects.requireNonNull(r5)
                r7.setVisibility(r4)
                r6.setVisibility(r4)
                goto L51
            L4b:
                r7.setVisibility(r3)
                r7.setText(r1)
            L51:
                if (r8 == 0) goto L8d
                android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
                if (r0 == 0) goto L6b
                int r5 = r8.getVisibility()
                if (r5 != 0) goto L6b
                android.content.Context r5 = r6.getContext()
                float r3 = p220m8.C4430n.m9884b(r5, r3)
                int r3 = (int) r3
                goto L6c
            L6b:
                r3 = 0
            L6c:
                com.google.android.material.tabs.TabLayout r5 = r6.f6339k0
                boolean r5 = r5.f6265A0
                if (r5 == 0) goto L7e
                int r5 = r7.getMarginEnd()
                if (r3 == r5) goto L8d
                r7.setMarginEnd(r3)
                r7.bottomMargin = r4
                goto L87
            L7e:
                int r5 = r7.bottomMargin
                if (r3 == r5) goto L8d
                r7.bottomMargin = r3
                r7.setMarginEnd(r4)
            L87:
                r8.setLayoutParams(r7)
                r8.requestLayout()
            L8d:
                com.google.android.material.tabs.TabLayout$f r7 = r6.f6329a0
                if (r7 == 0) goto L93
                java.lang.CharSequence r1 = r7.f6319c
            L93:
                int r7 = android.os.Build.VERSION.SDK_INT
                r8 = 23
                if (r7 <= r8) goto La0
                if (r0 == 0) goto L9c
                goto L9d
            L9c:
                r2 = r1
            L9d:
                androidx.appcompat.widget.C0263b1.m693a(r6, r2)
            La0:
                return
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r8) {
                r7 = this;
                super.onInitializeAccessibilityNodeInfo(r8)
                w7.a r0 = r7.f6333e0
                if (r0 == 0) goto L2e
                boolean r0 = r0.isVisible()
                if (r0 == 0) goto L2e
                java.lang.CharSequence r0 = r7.getContentDescription()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = ", "
                r1.append(r0)
                w7.a r0 = r7.f6333e0
                java.lang.CharSequence r0 = r0.m13889c()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r8.setContentDescription(r0)
            L2e:
                r1 = 0
                r2 = 1
                com.google.android.material.tabs.TabLayout$f r0 = r7.f6329a0
                int r3 = r0.f6320d
                r4 = 1
                r5 = 0
                boolean r6 = r7.isSelected()
                o0.b$c r0 = p242o0.C4868b.c.m11002a(r1, r2, r3, r4, r5, r6)
                java.lang.Object r0 = r0.f19353a
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                r8.setCollectionItemInfo(r0)
                boolean r0 = r7.isSelected()
                if (r0 == 0) goto L58
                r0 = 0
                r8.setClickable(r0)
                o0.b$a r0 = p242o0.C4868b.a.f19340e
                java.lang.Object r0 = r0.f19348a
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
                r8.removeAction(r0)
            L58:
                android.content.res.Resources r0 = r7.getResources()
                r1 = 2131951842(0x7f1300e2, float:1.954011E38)
                java.lang.String r0 = r0.getString(r1)
                android.os.Bundle r8 = r8.getExtras()
                java.lang.String r1 = "AccessibilityNodeInfo.roleDescription"
                r8.putCharSequence(r1, r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r8, int r9) {
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = r7.f6339k0
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L1e
                if (r1 == 0) goto L14
                if (r0 <= r2) goto L1e
            L14:
                com.google.android.material.tabs.TabLayout r8 = r7.f6339k0
                int r8 = r8.f6296r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L1e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f6330b0
                if (r0 == 0) goto La6
                com.google.android.material.tabs.TabLayout r0 = r7.f6339k0
                float r0 = r0.f6293o0
                int r1 = r7.f6338j0
                android.widget.ImageView r2 = r7.f6331c0
                r3 = 1
                if (r2 == 0) goto L38
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L38
                r1 = 1
                goto L46
            L38:
                android.widget.TextView r2 = r7.f6330b0
                if (r2 == 0) goto L46
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L46
                com.google.android.material.tabs.TabLayout r0 = r7.f6339k0
                float r0 = r0.f6294p0
            L46:
                android.widget.TextView r2 = r7.f6330b0
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.f6330b0
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.f6330b0
                int r5 = r5.getMaxLines()
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L60
                if (r5 < 0) goto La6
                if (r1 == r5) goto La6
            L60:
                com.google.android.material.tabs.TabLayout r5 = r7.f6339k0
                int r5 = r5.f6304z0
                r6 = 0
                if (r5 != r3) goto L97
                if (r2 <= 0) goto L97
                if (r4 != r3) goto L97
                android.widget.TextView r2 = r7.f6330b0
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L96
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L97
            L96:
                r3 = 0
            L97:
                if (r3 == 0) goto La6
                android.widget.TextView r2 = r7.f6330b0
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f6330b0
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            La6:
                return
        }

        @Override // android.view.View
        public boolean performClick() {
                r3 = this;
                boolean r0 = super.performClick()
                com.google.android.material.tabs.TabLayout$f r1 = r3.f6329a0
                if (r1 == 0) goto L21
                if (r0 != 0) goto Le
                r0 = 0
                r3.playSoundEffect(r0)
            Le:
                com.google.android.material.tabs.TabLayout$f r0 = r3.f6329a0
                com.google.android.material.tabs.TabLayout r1 = r0.f6322f
                if (r1 == 0) goto L19
                r2 = 1
                r1.m3509j(r0, r2)
                return r2
            L19:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
            L21:
                return r0
        }

        @Override // android.view.View
        public void setSelected(boolean r2) {
                r1 = this;
                boolean r0 = r1.isSelected()
                if (r0 == r2) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                super.setSelected(r2)
                android.widget.TextView r0 = r1.f6330b0
                if (r0 == 0) goto L13
                r0.setSelected(r2)
            L13:
                android.widget.ImageView r0 = r1.f6331c0
                if (r0 == 0) goto L1a
                r0.setSelected(r2)
            L1a:
                android.view.View r0 = r1.f6334f0
                if (r0 == 0) goto L21
                r0.setSelected(r2)
            L21:
                return
        }

        public void setTab(com.google.android.material.tabs.TabLayout.C1202f r2) {
                r1 = this;
                com.google.android.material.tabs.TabLayout$f r0 = r1.f6329a0
                if (r2 == r0) goto L9
                r1.f6329a0 = r2
                r1.m3534f()
            L9:
                return
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public static class C1205i implements com.google.android.material.tabs.TabLayout.InterfaceC1200d {

        /* renamed from: a */
        public final p403x1.C6911b f6340a;

        public C1205i(p403x1.C6911b r1) {
                r0 = this;
                r0.<init>()
                r0.f6340a = r1
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1199c
        /* renamed from: a */
        public void mo3516a(com.google.android.material.tabs.TabLayout.C1202f r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1199c
        /* renamed from: b */
        public void mo3517b(com.google.android.material.tabs.TabLayout.C1202f r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1199c
        /* renamed from: c */
        public void mo3518c(com.google.android.material.tabs.TabLayout.C1202f r2) {
                r1 = this;
                x1.b r0 = r1.f6340a
                int r2 = r2.f6320d
                r0.setCurrentItem(r2)
                return
        }
    }

    static {
            m0.d r0 = new m0.d
            r1 = 16
            r0.<init>(r1)
            com.google.android.material.tabs.TabLayout.f6264O0 = r0
            return
    }

    public TabLayout(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            r0 = 2132017895(0x7f1402e7, float:1.9674081E38)
            r1 = 2130969535(0x7f0403bf, float:1.7547755E38)
            android.content.Context r13 = p431y8.C7133a.m14245a(r13, r14, r1, r0)
            r12.<init>(r13, r14, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r12.f6279a0 = r13
            android.graphics.drawable.GradientDrawable r13 = new android.graphics.drawable.GradientDrawable
            r13.<init>()
            r12.f6290l0 = r13
            r13 = 0
            r12.f6291m0 = r13
            r0 = 2147483647(0x7fffffff, float:NaN)
            r12.f6296r0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f6271G0 = r0
            v.e r0 = new v.e
            r1 = 12
            r2 = 1
            r0.<init>(r1, r2)
            r12.f6278N0 = r0
            android.content.Context r0 = r12.getContext()
            r12.setHorizontalScrollBarEnabled(r13)
            com.google.android.material.tabs.TabLayout$e r9 = new com.google.android.material.tabs.TabLayout$e
            r9.<init>(r12, r0)
            r12.f6281c0 = r9
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -2
            r10 = -1
            r3.<init>(r4, r10)
            super.addView(r9, r13, r3)
            int[] r5 = p339t7.C6183a.f23999L
            int[] r8 = new int[r2]
            r11 = 23
            r8[r13] = r11
            r7 = 2132017895(0x7f1402e7, float:1.9674081E38)
            r6 = 2130969535(0x7f0403bf, float:1.7547755E38)
            r3 = r0
            r4 = r14
            android.content.res.TypedArray r14 = p220m8.C4429m.m9881d(r3, r4, r5, r6, r7, r8)
            android.graphics.drawable.Drawable r3 = r12.getBackground()
            boolean r3 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r3 == 0) goto L96
            android.graphics.drawable.Drawable r3 = r12.getBackground()
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            t8.f r4 = new t8.f
            r4.<init>()
            int r3 = r3.getColor()
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r4.m12773q(r3)
            t8.f$b r3 = r4.f24036Y
            j8.a r5 = new j8.a
            r5.<init>(r0)
            r3.f24060b = r5
            r4.m12781y()
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            float r3 = p227n0.C4661t.h.m10604i(r12)
            r4.m12772p(r3)
            p227n0.C4661t.c.m10569q(r12, r4)
        L96:
            r3 = 5
            android.graphics.drawable.Drawable r3 = p288q8.C5599c.m11878d(r0, r14, r3)
            r12.setSelectedTabIndicator(r3)
            r3 = 8
            int r3 = r14.getColor(r3, r13)
            r12.setSelectedTabIndicatorColor(r3)
            r3 = 11
            int r3 = r14.getDimensionPixelSize(r3, r10)
            r9.m3520b(r3)
            r3 = 10
            int r3 = r14.getInt(r3, r13)
            r12.setSelectedTabIndicatorGravity(r3)
            r3 = 9
            boolean r3 = r14.getBoolean(r3, r2)
            r12.setTabIndicatorFullWidth(r3)
            r3 = 7
            int r3 = r14.getInt(r3, r13)
            r12.setTabIndicatorAnimationMode(r3)
            r3 = 16
            int r3 = r14.getDimensionPixelSize(r3, r13)
            r12.f6285g0 = r3
            r12.f6284f0 = r3
            r12.f6283e0 = r3
            r12.f6282d0 = r3
            r4 = 19
            int r3 = r14.getDimensionPixelSize(r4, r3)
            r12.f6282d0 = r3
            r3 = 20
            int r4 = r12.f6283e0
            int r3 = r14.getDimensionPixelSize(r3, r4)
            r12.f6283e0 = r3
            r3 = 18
            int r4 = r12.f6284f0
            int r3 = r14.getDimensionPixelSize(r3, r4)
            r12.f6284f0 = r3
            r3 = 17
            int r4 = r12.f6285g0
            int r3 = r14.getDimensionPixelSize(r3, r4)
            r12.f6285g0 = r3
            r3 = 2132017644(0x7f1401ec, float:1.9673572E38)
            int r3 = r14.getResourceId(r11, r3)
            r12.f6286h0 = r3
            int[] r4 = p064e.C1495i.f7280w
            android.content.res.TypedArray r3 = r0.obtainStyledAttributes(r3, r4)
            int r4 = r3.getDimensionPixelSize(r13, r13)     // Catch: java.lang.Throwable -> L1cf
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L1cf
            r12.f6293o0 = r4     // Catch: java.lang.Throwable -> L1cf
            r4 = 3
            android.content.res.ColorStateList r5 = p288q8.C5599c.m11875a(r0, r3, r4)     // Catch: java.lang.Throwable -> L1cf
            r12.f6287i0 = r5     // Catch: java.lang.Throwable -> L1cf
            r3.recycle()
            r3 = 24
            boolean r5 = r14.hasValue(r3)
            if (r5 == 0) goto L12c
            android.content.res.ColorStateList r3 = p288q8.C5599c.m11875a(r0, r14, r3)
            r12.f6287i0 = r3
        L12c:
            r3 = 22
            boolean r5 = r14.hasValue(r3)
            r6 = 2
            if (r5 == 0) goto L156
            int r3 = r14.getColor(r3, r13)
            android.content.res.ColorStateList r5 = r12.f6287i0
            int r5 = r5.getDefaultColor()
            int[][] r7 = new int[r6][]
            int[] r8 = new int[r6]
            int[] r9 = android.widget.HorizontalScrollView.SELECTED_STATE_SET
            r7[r13] = r9
            r8[r13] = r3
            int[] r3 = android.widget.HorizontalScrollView.EMPTY_STATE_SET
            r7[r2] = r3
            r8[r2] = r5
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r3.<init>(r7, r8)
            r12.f6287i0 = r3
        L156:
            android.content.res.ColorStateList r3 = p288q8.C5599c.m11875a(r0, r14, r4)
            r12.f6288j0 = r3
            r3 = 4
            int r3 = r14.getInt(r3, r10)
            r4 = 0
            android.graphics.PorterDuff$Mode r3 = p220m8.C4430n.m9887e(r3, r4)
            r12.f6292n0 = r3
            r3 = 21
            android.content.res.ColorStateList r0 = p288q8.C5599c.m11875a(r0, r14, r3)
            r12.f6289k0 = r0
            r0 = 6
            r3 = 300(0x12c, float:4.2E-43)
            int r0 = r14.getInt(r0, r3)
            r12.f6302x0 = r0
            r0 = 14
            int r0 = r14.getDimensionPixelSize(r0, r10)
            r12.f6297s0 = r0
            r0 = 13
            int r0 = r14.getDimensionPixelSize(r0, r10)
            r12.f6298t0 = r0
            int r0 = r14.getResourceId(r13, r13)
            r12.f6295q0 = r0
            int r0 = r14.getDimensionPixelSize(r2, r13)
            r12.f6300v0 = r0
            r0 = 15
            int r0 = r14.getInt(r0, r2)
            r12.f6304z0 = r0
            int r0 = r14.getInt(r6, r13)
            r12.f6301w0 = r0
            boolean r0 = r14.getBoolean(r1, r13)
            r12.f6265A0 = r0
            r0 = 25
            boolean r13 = r14.getBoolean(r0, r13)
            r12.f6268D0 = r13
            r14.recycle()
            android.content.res.Resources r13 = r12.getResources()
            r14 = 2131165364(0x7f0700b4, float:1.7944943E38)
            int r14 = r13.getDimensionPixelSize(r14)
            float r14 = (float) r14
            r12.f6294p0 = r14
            r14 = 2131165362(0x7f0700b2, float:1.7944939E38)
            int r13 = r13.getDimensionPixelSize(r14)
            r12.f6299u0 = r13
            r12.m3503d()
            return
        L1cf:
            r13 = move-exception
            r3.recycle()
            throw r13
    }

    private int getDefaultHeight() {
            r5 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r0 = r5.f6279a0
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L25
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r3 = r5.f6279a0
            java.lang.Object r3 = r3.get(r2)
            com.google.android.material.tabs.TabLayout$f r3 = (com.google.android.material.tabs.TabLayout.C1202f) r3
            if (r3 == 0) goto L22
            android.graphics.drawable.Drawable r4 = r3.f6317a
            if (r4 == 0) goto L22
            java.lang.CharSequence r3 = r3.f6318b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L22
            r1 = 1
            goto L25
        L22:
            int r2 = r2 + 1
            goto L8
        L25:
            if (r1 == 0) goto L2e
            boolean r0 = r5.f6265A0
            if (r0 != 0) goto L2e
            r0 = 72
            goto L30
        L2e:
            r0 = 48
        L30:
            return r0
    }

    private int getTabMinWidth() {
            r2 = this;
            int r0 = r2.f6297s0
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r2.f6304z0
            if (r0 == 0) goto L10
            r1 = 2
            if (r0 != r1) goto Le
            goto L10
        Le:
            r0 = 0
            goto L12
        L10:
            int r0 = r2.f6299u0
        L12:
            return r0
    }

    private int getTabScrollRange() {
            r2 = this;
            com.google.android.material.tabs.TabLayout$e r0 = r2.f6281c0
            int r0 = r0.getWidth()
            int r1 = r2.getWidth()
            int r0 = r0 - r1
            int r1 = r2.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private void setSelectedTabView(int r7) {
            r6 = this;
            com.google.android.material.tabs.TabLayout$e r0 = r6.f6281c0
            int r0 = r0.getChildCount()
            if (r7 >= r0) goto L25
            r1 = 0
            r2 = 0
        La:
            if (r2 >= r0) goto L25
            com.google.android.material.tabs.TabLayout$e r3 = r6.f6281c0
            android.view.View r3 = r3.getChildAt(r2)
            r4 = 1
            if (r2 != r7) goto L17
            r5 = 1
            goto L18
        L17:
            r5 = 0
        L18:
            r3.setSelected(r5)
            if (r2 != r7) goto L1e
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r3.setActivated(r4)
            int r2 = r2 + 1
            goto La
        L25:
            return
    }

    /* renamed from: a */
    public void m3500a(com.google.android.material.tabs.TabLayout.C1202f r8, boolean r9) {
            r7 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r0 = r7.f6279a0
            int r0 = r0.size()
            com.google.android.material.tabs.TabLayout r1 = r8.f6322f
            if (r1 != r7) goto L53
            r8.f6320d = r0
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r1 = r7.f6279a0
            r1.add(r0, r8)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r1 = r7.f6279a0
            int r1 = r1.size()
        L17:
            r2 = 1
            int r0 = r0 + r2
            if (r0 >= r1) goto L26
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r2 = r7.f6279a0
            java.lang.Object r2 = r2.get(r0)
            com.google.android.material.tabs.TabLayout$f r2 = (com.google.android.material.tabs.TabLayout.C1202f) r2
            r2.f6320d = r0
            goto L17
        L26:
            com.google.android.material.tabs.TabLayout$h r0 = r8.f6323g
            r1 = 0
            r0.setSelected(r1)
            r0.setActivated(r1)
            com.google.android.material.tabs.TabLayout$e r1 = r7.f6281c0
            int r3 = r8.f6320d
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = -1
            r4.<init>(r5, r6)
            r7.m3513n(r4)
            r1.addView(r0, r3, r4)
            if (r9 == 0) goto L52
            com.google.android.material.tabs.TabLayout r9 = r8.f6322f
            if (r9 == 0) goto L4a
            r9.m3509j(r8, r2)
            goto L52
        L4a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Tab not attached to a TabLayout"
            r8.<init>(r9)
            throw r8
        L52:
            return
        L53:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Tab belongs to a different TabLayout."
            r8.<init>(r9)
            throw r8
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View r1) {
            r0 = this;
            r0.m3501b(r1)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View r1, int r2) {
            r0 = this;
            r0.m3501b(r1)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            r0.m3501b(r1)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.m3501b(r1)
            return
    }

    /* renamed from: b */
    public final void m3501b(android.view.View r3) {
            r2 = this;
            boolean r0 = r3 instanceof p390w8.C6820b
            if (r0 == 0) goto L2a
            w8.b r3 = (p390w8.C6820b) r3
            com.google.android.material.tabs.TabLayout$f r0 = r2.m3507h()
            java.util.Objects.requireNonNull(r3)
            java.lang.CharSequence r1 = r3.getContentDescription()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L20
            java.lang.CharSequence r3 = r3.getContentDescription()
            r0.f6319c = r3
            r0.m3527e()
        L20:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r3 = r2.f6279a0
            boolean r3 = r3.isEmpty()
            r2.m3500a(r0, r3)
            return
        L2a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only TabItem instances can be added to TabLayout"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: c */
    public final void m3502c(int r8) {
            r7 = this;
            r0 = -1
            if (r8 != r0) goto L4
            return
        L4:
            android.os.IBinder r0 = r7.getWindowToken()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L66
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10588c(r7)
            if (r0 == 0) goto L66
            com.google.android.material.tabs.TabLayout$e r0 = r7.f6281c0
            int r3 = r0.getChildCount()
            r4 = 0
            r5 = 0
        L1c:
            if (r5 >= r3) goto L2d
            android.view.View r6 = r0.getChildAt(r5)
            int r6 = r6.getWidth()
            if (r6 > 0) goto L2a
            r0 = 1
            goto L2e
        L2a:
            int r5 = r5 + 1
            goto L1c
        L2d:
            r0 = 0
        L2e:
            if (r0 == 0) goto L31
            goto L66
        L31:
            int r0 = r7.getScrollX()
            int r1 = r7.m3504e(r8, r1)
            if (r0 == r1) goto L4f
            r7.m3505f()
            android.animation.ValueAnimator r3 = r7.f6273I0
            r5 = 2
            int[] r5 = new int[r5]
            r5[r4] = r0
            r5[r2] = r1
            r3.setIntValues(r5)
            android.animation.ValueAnimator r0 = r7.f6273I0
            r0.start()
        L4f:
            com.google.android.material.tabs.TabLayout$e r0 = r7.f6281c0
            int r1 = r7.f6302x0
            android.animation.ValueAnimator r3 = r0.f6307a0
            if (r3 == 0) goto L62
            boolean r3 = r3.isRunning()
            if (r3 == 0) goto L62
            android.animation.ValueAnimator r3 = r0.f6307a0
            r3.cancel()
        L62:
            r0.m3522d(r2, r8, r1)
            return
        L66:
            r7.m3510k(r8, r1, r2, r2)
            return
    }

    /* renamed from: d */
    public final void m3503d() {
            r5 = this;
            int r0 = r5.f6304z0
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L14
        Lb:
            int r0 = r5.f6300v0
            int r3 = r5.f6282d0
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            com.google.android.material.tabs.TabLayout$e r3 = r5.f6281c0
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            p227n0.C4661t.d.m10582k(r3, r0, r2, r2, r2)
            int r0 = r5.f6304z0
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 == r3) goto L27
            if (r0 == r1) goto L27
            goto L50
        L27:
            int r0 = r5.f6301w0
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            com.google.android.material.tabs.TabLayout$e r0 = r5.f6281c0
            r0.setGravity(r3)
            goto L50
        L36:
            int r0 = r5.f6301w0
            if (r0 == 0) goto L43
            if (r0 == r3) goto L3f
            if (r0 == r1) goto L48
            goto L50
        L3f:
            com.google.android.material.tabs.TabLayout$e r0 = r5.f6281c0
            r1 = 1
            goto L4d
        L43:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L48:
            com.google.android.material.tabs.TabLayout$e r0 = r5.f6281c0
            r1 = 8388611(0x800003, float:1.1754948E-38)
        L4d:
            r0.setGravity(r1)
        L50:
            r5.m3514o(r3)
            return
    }

    /* renamed from: e */
    public final int m3504e(int r5, float r6) {
            r4 = this;
            int r0 = r4.f6304z0
            r1 = 0
            r2 = 2
            if (r0 == 0) goto La
            if (r0 != r2) goto L9
            goto La
        L9:
            return r1
        La:
            com.google.android.material.tabs.TabLayout$e r0 = r4.f6281c0
            android.view.View r0 = r0.getChildAt(r5)
            int r5 = r5 + 1
            com.google.android.material.tabs.TabLayout$e r3 = r4.f6281c0
            int r3 = r3.getChildCount()
            if (r5 >= r3) goto L21
            com.google.android.material.tabs.TabLayout$e r3 = r4.f6281c0
            android.view.View r5 = r3.getChildAt(r5)
            goto L22
        L21:
            r5 = 0
        L22:
            if (r0 == 0) goto L29
            int r3 = r0.getWidth()
            goto L2a
        L29:
            r3 = 0
        L2a:
            if (r5 == 0) goto L30
            int r1 = r5.getWidth()
        L30:
            int r5 = r0.getLeft()
            int r0 = r3 / 2
            int r0 = r0 + r5
            int r5 = r4.getWidth()
            int r5 = r5 / r2
            int r0 = r0 - r5
            int r3 = r3 + r1
            float r5 = (float) r3
            r1 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r1
            float r5 = r5 * r6
            int r5 = (int) r5
            java.util.WeakHashMap<android.view.View, n0.w> r6 = p227n0.C4661t.f18570a
            int r6 = p227n0.C4661t.d.m10575d(r4)
            if (r6 != 0) goto L50
            int r0 = r0 + r5
            goto L51
        L50:
            int r0 = r0 - r5
        L51:
            return r0
    }

    /* renamed from: f */
    public final void m3505f() {
            r3 = this;
            android.animation.ValueAnimator r0 = r3.f6273I0
            if (r0 != 0) goto L22
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r3.f6273I0 = r0
            android.animation.TimeInterpolator r1 = p354u7.C6350a.f24804b
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.f6273I0
            int r1 = r3.f6302x0
            long r1 = (long) r1
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.f6273I0
            com.google.android.material.tabs.TabLayout$a r1 = new com.google.android.material.tabs.TabLayout$a
            r1.<init>(r3)
            r0.addUpdateListener(r1)
        L22:
            return
    }

    /* renamed from: g */
    public com.google.android.material.tabs.TabLayout.C1202f m3506g(int r2) {
            r1 = this;
            if (r2 < 0) goto L12
            int r0 = r1.getTabCount()
            if (r2 < r0) goto L9
            goto L12
        L9:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r0 = r1.f6279a0
            java.lang.Object r2 = r0.get(r2)
            com.google.android.material.tabs.TabLayout$f r2 = (com.google.android.material.tabs.TabLayout.C1202f) r2
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.widget.FrameLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.widget.FrameLayout$LayoutParams r1 = r0.generateDefaultLayoutParams()
            return r1
    }

    public int getSelectedTabPosition() {
            r1 = this;
            com.google.android.material.tabs.TabLayout$f r0 = r1.f6280b0
            if (r0 == 0) goto L7
            int r0 = r0.f6320d
            goto L8
        L7:
            r0 = -1
        L8:
            return r0
    }

    public int getTabCount() {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r0 = r1.f6279a0
            int r0 = r0.size()
            return r0
    }

    public int getTabGravity() {
            r1 = this;
            int r0 = r1.f6301w0
            return r0
    }

    public android.content.res.ColorStateList getTabIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6288j0
            return r0
    }

    public int getTabIndicatorAnimationMode() {
            r1 = this;
            int r0 = r1.f6267C0
            return r0
    }

    public int getTabIndicatorGravity() {
            r1 = this;
            int r0 = r1.f6303y0
            return r0
    }

    public int getTabMaxWidth() {
            r1 = this;
            int r0 = r1.f6296r0
            return r0
    }

    public int getTabMode() {
            r1 = this;
            int r0 = r1.f6304z0
            return r0
    }

    public android.content.res.ColorStateList getTabRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6289k0
            return r0
    }

    public android.graphics.drawable.Drawable getTabSelectedIndicator() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6290l0
            return r0
    }

    public android.content.res.ColorStateList getTabTextColors() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6287i0
            return r0
    }

    /* renamed from: h */
    public com.google.android.material.tabs.TabLayout.C1202f m3507h() {
            r4 = this;
            m0.c<com.google.android.material.tabs.TabLayout$f> r0 = com.google.android.material.tabs.TabLayout.f6264O0
            m0.d r0 = (p212m0.C4314d) r0
            java.lang.Object r0 = r0.mo6231b()
            com.google.android.material.tabs.TabLayout$f r0 = (com.google.android.material.tabs.TabLayout.C1202f) r0
            if (r0 != 0) goto L11
            com.google.android.material.tabs.TabLayout$f r0 = new com.google.android.material.tabs.TabLayout$f
            r0.<init>()
        L11:
            r0.f6322f = r4
            m0.c<com.google.android.material.tabs.TabLayout$h> r1 = r4.f6278N0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r1.mo6231b()
            com.google.android.material.tabs.TabLayout$h r1 = (com.google.android.material.tabs.TabLayout.C1204h) r1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 != 0) goto L2a
            com.google.android.material.tabs.TabLayout$h r1 = new com.google.android.material.tabs.TabLayout$h
            android.content.Context r2 = r4.getContext()
            r1.<init>(r4, r2)
        L2a:
            r1.setTab(r0)
            r2 = 1
            r1.setFocusable(r2)
            int r2 = r4.getTabMinWidth()
            r1.setMinimumWidth(r2)
            java.lang.CharSequence r2 = r0.f6319c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L43
            java.lang.CharSequence r2 = r0.f6318b
            goto L45
        L43:
            java.lang.CharSequence r2 = r0.f6319c
        L45:
            r1.setContentDescription(r2)
            r0.f6323g = r1
            int r2 = r0.f6324h
            r3 = -1
            if (r2 == r3) goto L52
            r1.setId(r2)
        L52:
            return r0
    }

    /* renamed from: i */
    public void m3508i() {
            r4 = this;
            com.google.android.material.tabs.TabLayout$e r0 = r4.f6281c0
            int r0 = r0.getChildCount()
            int r0 = r0 + (-1)
        L8:
            r1 = 0
            if (r0 < 0) goto L2c
            com.google.android.material.tabs.TabLayout$e r2 = r4.f6281c0
            android.view.View r2 = r2.getChildAt(r0)
            com.google.android.material.tabs.TabLayout$h r2 = (com.google.android.material.tabs.TabLayout.C1204h) r2
            com.google.android.material.tabs.TabLayout$e r3 = r4.f6281c0
            r3.removeViewAt(r0)
            if (r2 == 0) goto L26
            r2.setTab(r1)
            r1 = 0
            r2.setSelected(r1)
            m0.c<com.google.android.material.tabs.TabLayout$h> r1 = r4.f6278N0
            r1.mo6230a(r2)
        L26:
            r4.requestLayout()
            int r0 = r0 + (-1)
            goto L8
        L2c:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r0 = r4.f6279a0
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r0.next()
            com.google.android.material.tabs.TabLayout$f r2 = (com.google.android.material.tabs.TabLayout.C1202f) r2
            r0.remove()
            r2.f6322f = r1
            r2.f6323g = r1
            r2.f6317a = r1
            r3 = -1
            r2.f6324h = r3
            r2.f6318b = r1
            r2.f6319c = r1
            r2.f6320d = r3
            r2.f6321e = r1
            m0.c<com.google.android.material.tabs.TabLayout$f> r3 = com.google.android.material.tabs.TabLayout.f6264O0
            m0.d r3 = (p212m0.C4314d) r3
            r3.mo6230a(r2)
            goto L32
        L5a:
            r4.f6280b0 = r1
            return
    }

    /* renamed from: j */
    public void m3509j(com.google.android.material.tabs.TabLayout.C1202f r5, boolean r6) {
            r4 = this;
            com.google.android.material.tabs.TabLayout$f r0 = r4.f6280b0
            r1 = -1
            if (r0 != r5) goto L24
            if (r0 == 0) goto L76
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r6 = r4.f6271G0
            int r6 = r6.size()
            int r6 = r6 + r1
        Le:
            if (r6 < 0) goto L1e
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r0 = r4.f6271G0
            java.lang.Object r0 = r0.get(r6)
            com.google.android.material.tabs.TabLayout$c r0 = (com.google.android.material.tabs.TabLayout.InterfaceC1199c) r0
            r0.mo3516a(r5)
            int r6 = r6 + (-1)
            goto Le
        L1e:
            int r5 = r5.f6320d
            r4.m3502c(r5)
            goto L76
        L24:
            if (r5 == 0) goto L29
            int r2 = r5.f6320d
            goto L2a
        L29:
            r2 = -1
        L2a:
            if (r6 == 0) goto L42
            if (r0 == 0) goto L32
            int r6 = r0.f6320d
            if (r6 != r1) goto L3a
        L32:
            if (r2 == r1) goto L3a
            r6 = 0
            r3 = 1
            r4.m3510k(r2, r6, r3, r3)
            goto L3d
        L3a:
            r4.m3502c(r2)
        L3d:
            if (r2 == r1) goto L42
            r4.setSelectedTabView(r2)
        L42:
            r4.f6280b0 = r5
            if (r0 == 0) goto L5d
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r6 = r4.f6271G0
            int r6 = r6.size()
            int r6 = r6 + r1
        L4d:
            if (r6 < 0) goto L5d
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r2 = r4.f6271G0
            java.lang.Object r2 = r2.get(r6)
            com.google.android.material.tabs.TabLayout$c r2 = (com.google.android.material.tabs.TabLayout.InterfaceC1199c) r2
            r2.mo3517b(r0)
            int r6 = r6 + (-1)
            goto L4d
        L5d:
            if (r5 == 0) goto L76
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r6 = r4.f6271G0
            int r6 = r6.size()
            int r6 = r6 + r1
        L66:
            if (r6 < 0) goto L76
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r0 = r4.f6271G0
            java.lang.Object r0 = r0.get(r6)
            com.google.android.material.tabs.TabLayout$c r0 = (com.google.android.material.tabs.TabLayout.InterfaceC1199c) r0
            r0.mo3518c(r5)
            int r6 = r6 + (-1)
            goto L66
        L76:
            return
    }

    /* renamed from: k */
    public void m3510k(int r5, float r6, boolean r7, boolean r8) {
            r4 = this;
            float r0 = (float) r5
            float r0 = r0 + r6
            int r0 = java.lang.Math.round(r0)
            if (r0 < 0) goto L55
            com.google.android.material.tabs.TabLayout$e r1 = r4.f6281c0
            int r1 = r1.getChildCount()
            if (r0 < r1) goto L11
            goto L55
        L11:
            if (r8 == 0) goto L39
            com.google.android.material.tabs.TabLayout$e r8 = r4.f6281c0
            android.animation.ValueAnimator r1 = r8.f6307a0
            if (r1 == 0) goto L24
            boolean r1 = r1.isRunning()
            if (r1 == 0) goto L24
            android.animation.ValueAnimator r1 = r8.f6307a0
            r1.cancel()
        L24:
            r8.f6308b0 = r5
            r8.f6309c0 = r6
            android.view.View r1 = r8.getChildAt(r5)
            int r2 = r8.f6308b0
            int r2 = r2 + 1
            android.view.View r2 = r8.getChildAt(r2)
            float r3 = r8.f6309c0
            r8.m3521c(r1, r2, r3)
        L39:
            android.animation.ValueAnimator r8 = r4.f6273I0
            if (r8 == 0) goto L48
            boolean r8 = r8.isRunning()
            if (r8 == 0) goto L48
            android.animation.ValueAnimator r8 = r4.f6273I0
            r8.cancel()
        L48:
            int r5 = r4.m3504e(r5, r6)
            r6 = 0
            r4.scrollTo(r5, r6)
            if (r7 == 0) goto L55
            r4.setSelectedTabView(r0)
        L55:
            return
    }

    /* renamed from: l */
    public final void m3511l(p403x1.C6911b r3, boolean r4, boolean r5) {
            r2 = this;
            x1.b r4 = r2.f6274J0
            if (r4 == 0) goto L1c
            com.google.android.material.tabs.TabLayout$g r0 = r2.f6275K0
            if (r0 == 0) goto Lf
            java.util.List<x1.b$d> r4 = r4.f26884r0
            if (r4 == 0) goto Lf
            r4.remove(r0)
        Lf:
            com.google.android.material.tabs.TabLayout$b r4 = r2.f6276L0
            if (r4 == 0) goto L1c
            x1.b r0 = r2.f6274J0
            java.util.List<x1.b$c> r0 = r0.f26886t0
            if (r0 == 0) goto L1c
            r0.remove(r4)
        L1c:
            com.google.android.material.tabs.TabLayout$c r4 = r2.f6272H0
            r0 = 0
            if (r4 == 0) goto L28
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r1 = r2.f6271G0
            r1.remove(r4)
            r2.f6272H0 = r0
        L28:
            if (r3 == 0) goto L8f
            r2.f6274J0 = r3
            com.google.android.material.tabs.TabLayout$g r4 = r2.f6275K0
            if (r4 != 0) goto L37
            com.google.android.material.tabs.TabLayout$g r4 = new com.google.android.material.tabs.TabLayout$g
            r4.<init>(r2)
            r2.f6275K0 = r4
        L37:
            com.google.android.material.tabs.TabLayout$g r4 = r2.f6275K0
            r0 = 0
            r4.f6327c = r0
            r4.f6326b = r0
            java.util.List<x1.b$d> r0 = r3.f26884r0
            if (r0 != 0) goto L49
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f26884r0 = r0
        L49:
            java.util.List<x1.b$d> r0 = r3.f26884r0
            r0.add(r4)
            com.google.android.material.tabs.TabLayout$i r4 = new com.google.android.material.tabs.TabLayout$i
            r4.<init>(r3)
            r2.f6272H0 = r4
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r0 = r2.f6271G0
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L62
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r0 = r2.f6271G0
            r0.add(r4)
        L62:
            r3.getAdapter()
            com.google.android.material.tabs.TabLayout$b r4 = r2.f6276L0
            if (r4 != 0) goto L70
            com.google.android.material.tabs.TabLayout$b r4 = new com.google.android.material.tabs.TabLayout$b
            r4.<init>(r2)
            r2.f6276L0 = r4
        L70:
            com.google.android.material.tabs.TabLayout$b r4 = r2.f6276L0
            java.util.Objects.requireNonNull(r4)
            java.util.List<x1.b$c> r0 = r3.f26886t0
            if (r0 != 0) goto L80
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f26886t0 = r0
        L80:
            java.util.List<x1.b$c> r0 = r3.f26886t0
            r0.add(r4)
            int r3 = r3.getCurrentItem()
            r4 = 0
            r0 = 1
            r2.m3510k(r3, r4, r0, r0)
            goto L94
        L8f:
            r2.f6274J0 = r0
            r2.m3508i()
        L94:
            r2.f6277M0 = r5
            return
    }

    /* renamed from: m */
    public final void m3512m() {
            r3 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r0 = r3.f6279a0
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r2 = r3.f6279a0
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.tabs.TabLayout$f r2 = (com.google.android.material.tabs.TabLayout.C1202f) r2
            r2.m3527e()
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    /* renamed from: n */
    public final void m3513n(android.widget.LinearLayout.LayoutParams r3) {
            r2 = this;
            int r0 = r2.f6304z0
            r1 = 1
            if (r0 != r1) goto Lf
            int r0 = r2.f6301w0
            if (r0 != 0) goto Lf
            r0 = 0
            r3.width = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L13
        Lf:
            r0 = -2
            r3.width = r0
            r0 = 0
        L13:
            r3.weight = r0
            return
    }

    /* renamed from: o */
    public void m3514o(boolean r4) {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.material.tabs.TabLayout$e r1 = r3.f6281c0
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L27
            com.google.android.material.tabs.TabLayout$e r1 = r3.f6281c0
            android.view.View r1 = r1.getChildAt(r0)
            int r2 = r3.getTabMinWidth()
            r1.setMinimumWidth(r2)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r3.m3513n(r2)
            if (r4 == 0) goto L24
            r1.requestLayout()
        L24:
            int r0 = r0 + 1
            goto L1
        L27:
            return
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
            x1.b r0 = r2.f6274J0
            if (r0 != 0) goto L22
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof p403x1.C6911b
            if (r1 == 0) goto L22
            x1.b r0 = (p403x1.C6911b) r0
            r1 = 1
            r2.m3511l(r0, r1, r1)
        L22:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            boolean r0 = r1.f6277M0
            if (r0 == 0) goto Le
            r0 = 0
            r1.setupWithViewPager(r0)
            r0 = 0
            r1.f6277M0 = r0
        Le:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            r0 = 0
        L1:
            com.google.android.material.tabs.TabLayout$e r1 = r7.f6281c0
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L34
            com.google.android.material.tabs.TabLayout$e r1 = r7.f6281c0
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.C1204h
            if (r2 == 0) goto L31
            com.google.android.material.tabs.TabLayout$h r1 = (com.google.android.material.tabs.TabLayout.C1204h) r1
            android.graphics.drawable.Drawable r2 = r1.f6337i0
            if (r2 == 0) goto L31
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.f6337i0
            r1.draw(r8)
        L31:
            int r0 = r0 + 1
            goto L1
        L34:
            super.onDraw(r8)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            int r0 = r3.getTabCount()
            r1 = 0
            r2 = 1
            o0.b$b r0 = p242o0.C4868b.b.m11001a(r2, r0, r1, r2)
            java.lang.Object r0 = r0.f19352a
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
            r4.setCollectionInfo(r0)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = p220m8.C4430n.m9884b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f6298t0
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = p220m8.C4430n.m9884b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f6296r0 = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f6304z0
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            p185k7.C3828h5.m8574C(r0, r1)
            return
    }

    public void setInlineLabel(boolean r4) {
            r3 = this;
            boolean r0 = r3.f6265A0
            if (r0 == r4) goto L3d
            r3.f6265A0 = r4
            r4 = 0
        L7:
            com.google.android.material.tabs.TabLayout$e r0 = r3.f6281c0
            int r0 = r0.getChildCount()
            if (r4 >= r0) goto L3a
            com.google.android.material.tabs.TabLayout$e r0 = r3.f6281c0
            android.view.View r0 = r0.getChildAt(r4)
            boolean r1 = r0 instanceof com.google.android.material.tabs.TabLayout.C1204h
            if (r1 == 0) goto L37
            com.google.android.material.tabs.TabLayout$h r0 = (com.google.android.material.tabs.TabLayout.C1204h) r0
            com.google.android.material.tabs.TabLayout r1 = r0.f6339k0
            boolean r1 = r1.f6265A0
            r1 = r1 ^ 1
            r0.setOrientation(r1)
            android.widget.TextView r1 = r0.f6335g0
            if (r1 != 0) goto L32
            android.widget.ImageView r2 = r0.f6336h0
            if (r2 == 0) goto L2d
            goto L32
        L2d:
            android.widget.TextView r1 = r0.f6330b0
            android.widget.ImageView r2 = r0.f6331c0
            goto L34
        L32:
            android.widget.ImageView r2 = r0.f6336h0
        L34:
            r0.m3536h(r1, r2)
        L37:
            int r4 = r4 + 1
            goto L7
        L3a:
            r3.m3503d()
        L3d:
            return
    }

    public void setInlineLabelResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setInlineLabel(r2)
            return
    }

    @java.lang.Deprecated
    public void setOnTabSelectedListener(com.google.android.material.tabs.TabLayout.InterfaceC1199c r3) {
            r2 = this;
            com.google.android.material.tabs.TabLayout$c r0 = r2.f6270F0
            if (r0 == 0) goto L9
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r1 = r2.f6271G0
            r1.remove(r0)
        L9:
            r2.f6270F0 = r3
            if (r3 == 0) goto L1a
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r0 = r2.f6271G0
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L1a
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r0 = r2.f6271G0
            r0.add(r3)
        L1a:
            return
    }

    @java.lang.Deprecated
    public void setOnTabSelectedListener(com.google.android.material.tabs.TabLayout.InterfaceC1200d r1) {
            r0 = this;
            r0.setOnTabSelectedListener(r1)
            return
    }

    public void setScrollAnimatorListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            r1.m3505f()
            android.animation.ValueAnimator r0 = r1.f6273I0
            r0.addListener(r2)
            return
    }

    public void setSelectedTabIndicator(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setSelectedTabIndicator(r2)
            return
    }

    public void setSelectedTabIndicator(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6290l0
            if (r0 == r2) goto Le
            if (r2 == 0) goto L7
            goto Lc
        L7:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
        Lc:
            r1.f6290l0 = r2
        Le:
            return
    }

    public void setSelectedTabIndicatorColor(int r1) {
            r0 = this;
            r0.f6291m0 = r1
            return
    }

    public void setSelectedTabIndicatorGravity(int r2) {
            r1 = this;
            int r0 = r1.f6303y0
            if (r0 == r2) goto Ld
            r1.f6303y0 = r2
            com.google.android.material.tabs.TabLayout$e r2 = r1.f6281c0
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r2)
        Ld:
            return
    }

    @java.lang.Deprecated
    public void setSelectedTabIndicatorHeight(int r2) {
            r1 = this;
            com.google.android.material.tabs.TabLayout$e r0 = r1.f6281c0
            r0.m3520b(r2)
            return
    }

    public void setTabGravity(int r2) {
            r1 = this;
            int r0 = r1.f6301w0
            if (r0 == r2) goto L9
            r1.f6301w0 = r2
            r1.m3503d()
        L9:
            return
    }

    public void setTabIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6288j0
            if (r0 == r2) goto L9
            r1.f6288j0 = r2
            r1.m3512m()
        L9:
            return
    }

    public void setTabIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = p102g.C2199a.m5783a(r0, r2)
            r1.setTabIconTint(r2)
            return
    }

    public void setTabIndicatorAnimationMode(int r3) {
            r2 = this;
            r2.f6267C0 = r3
            if (r3 == 0) goto L24
            r0 = 1
            if (r3 != r0) goto Ld
            w8.a r3 = new w8.a
            r3.<init>()
            goto L29
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " is not a valid TabIndicatorAnimationMode"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L24:
            com.google.android.material.tabs.a r3 = new com.google.android.material.tabs.a
            r3.<init>()
        L29:
            r2.f6269E0 = r3
            return
    }

    public void setTabIndicatorFullWidth(boolean r2) {
            r1 = this;
            r1.f6266B0 = r2
            com.google.android.material.tabs.TabLayout$e r2 = r1.f6281c0
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r2)
            return
    }

    public void setTabMode(int r2) {
            r1 = this;
            int r0 = r1.f6304z0
            if (r2 == r0) goto L9
            r1.f6304z0 = r2
            r1.m3503d()
        L9:
            return
    }

    public void setTabRippleColor(android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f6289k0
            if (r0 == r4) goto L27
            r3.f6289k0 = r4
            r4 = 0
        L7:
            com.google.android.material.tabs.TabLayout$e r0 = r3.f6281c0
            int r0 = r0.getChildCount()
            if (r4 >= r0) goto L27
            com.google.android.material.tabs.TabLayout$e r0 = r3.f6281c0
            android.view.View r0 = r0.getChildAt(r4)
            boolean r1 = r0 instanceof com.google.android.material.tabs.TabLayout.C1204h
            if (r1 == 0) goto L24
            com.google.android.material.tabs.TabLayout$h r0 = (com.google.android.material.tabs.TabLayout.C1204h) r0
            android.content.Context r1 = r3.getContext()
            int r2 = com.google.android.material.tabs.TabLayout.C1204h.f6328l0
            r0.m3535g(r1)
        L24:
            int r4 = r4 + 1
            goto L7
        L27:
            return
    }

    public void setTabRippleColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = p102g.C2199a.m5783a(r0, r2)
            r1.setTabRippleColor(r2)
            return
    }

    public void setTabTextColors(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6287i0
            if (r0 == r2) goto L9
            r1.f6287i0 = r2
            r1.m3512m()
        L9:
            return
    }

    @java.lang.Deprecated
    public void setTabsFromPagerAdapter(p403x1.AbstractC6910a r1) {
            r0 = this;
            r0.m3508i()
            return
    }

    public void setUnboundedRipple(boolean r4) {
            r3 = this;
            boolean r0 = r3.f6268D0
            if (r0 == r4) goto L27
            r3.f6268D0 = r4
            r4 = 0
        L7:
            com.google.android.material.tabs.TabLayout$e r0 = r3.f6281c0
            int r0 = r0.getChildCount()
            if (r4 >= r0) goto L27
            com.google.android.material.tabs.TabLayout$e r0 = r3.f6281c0
            android.view.View r0 = r0.getChildAt(r4)
            boolean r1 = r0 instanceof com.google.android.material.tabs.TabLayout.C1204h
            if (r1 == 0) goto L24
            com.google.android.material.tabs.TabLayout$h r0 = (com.google.android.material.tabs.TabLayout.C1204h) r0
            android.content.Context r1 = r3.getContext()
            int r2 = com.google.android.material.tabs.TabLayout.C1204h.f6328l0
            r0.m3535g(r1)
        L24:
            int r4 = r4 + 1
            goto L7
        L27:
            return
    }

    public void setUnboundedRippleResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setUnboundedRipple(r2)
            return
    }

    public void setupWithViewPager(p403x1.C6911b r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.m3511l(r3, r1, r0)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            int r0 = r1.getTabScrollRange()
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
