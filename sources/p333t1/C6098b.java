package p333t1;

/* renamed from: t1.b */
/* loaded from: classes.dex */
public class C6098b extends p333t1.AbstractC6104h {

    /* renamed from: A0 */
    public static final android.util.Property<android.view.View, android.graphics.PointF> f23543A0 = null;

    /* renamed from: v0 */
    public static final java.lang.String[] f23544v0 = null;

    /* renamed from: w0 */
    public static final android.util.Property<p333t1.C6098b.i, android.graphics.PointF> f23545w0 = null;

    /* renamed from: x0 */
    public static final android.util.Property<p333t1.C6098b.i, android.graphics.PointF> f23546x0 = null;

    /* renamed from: y0 */
    public static final android.util.Property<android.view.View, android.graphics.PointF> f23547y0 = null;

    /* renamed from: z0 */
    public static final android.util.Property<android.view.View, android.graphics.PointF> f23548z0 = null;

    /* renamed from: t1.b$a */
    public static class a extends android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> {

        /* renamed from: a */
        public android.graphics.Rect f23549a;

        public a(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f23549a = r1
                return
        }

        @Override // android.util.Property
        public android.graphics.PointF get(android.graphics.drawable.Drawable r3) {
                r2 = this;
                android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
                android.graphics.Rect r0 = r2.f23549a
                r3.copyBounds(r0)
                android.graphics.PointF r3 = new android.graphics.PointF
                android.graphics.Rect r0 = r2.f23549a
                int r1 = r0.left
                float r1 = (float) r1
                int r0 = r0.top
                float r0 = (float) r0
                r3.<init>(r1, r0)
                return r3
        }

        @Override // android.util.Property
        public void set(android.graphics.drawable.Drawable r3, android.graphics.PointF r4) {
                r2 = this;
                android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
                android.graphics.PointF r4 = (android.graphics.PointF) r4
                android.graphics.Rect r0 = r2.f23549a
                r3.copyBounds(r0)
                android.graphics.Rect r0 = r2.f23549a
                float r1 = r4.x
                int r1 = java.lang.Math.round(r1)
                float r4 = r4.y
                int r4 = java.lang.Math.round(r4)
                r0.offsetTo(r1, r4)
                android.graphics.Rect r4 = r2.f23549a
                r3.setBounds(r4)
                return
        }
    }

    /* renamed from: t1.b$b */
    public static class b extends android.util.Property<p333t1.C6098b.i, android.graphics.PointF> {
        public b(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(p333t1.C6098b.i r1) {
                r0 = this;
                t1.b$i r1 = (p333t1.C6098b.i) r1
                r1 = 0
                return r1
        }

        @Override // android.util.Property
        public void set(p333t1.C6098b.i r5, android.graphics.PointF r6) {
                r4 = this;
                t1.b$i r5 = (p333t1.C6098b.i) r5
                android.graphics.PointF r6 = (android.graphics.PointF) r6
                java.util.Objects.requireNonNull(r5)
                float r0 = r6.x
                int r0 = java.lang.Math.round(r0)
                r5.f23552a = r0
                float r6 = r6.y
                int r6 = java.lang.Math.round(r6)
                r5.f23553b = r6
                int r0 = r5.f23557f
                int r0 = r0 + 1
                r5.f23557f = r0
                int r1 = r5.f23558g
                if (r0 != r1) goto L31
                android.view.View r0 = r5.f23556e
                int r1 = r5.f23552a
                int r2 = r5.f23554c
                int r3 = r5.f23555d
                p333t1.C6113q.m12640b(r0, r1, r6, r2, r3)
                r6 = 0
                r5.f23557f = r6
                r5.f23558g = r6
            L31:
                return
        }
    }

    /* renamed from: t1.b$c */
    public static class c extends android.util.Property<p333t1.C6098b.i, android.graphics.PointF> {
        public c(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(p333t1.C6098b.i r1) {
                r0 = this;
                t1.b$i r1 = (p333t1.C6098b.i) r1
                r1 = 0
                return r1
        }

        @Override // android.util.Property
        public void set(p333t1.C6098b.i r5, android.graphics.PointF r6) {
                r4 = this;
                t1.b$i r5 = (p333t1.C6098b.i) r5
                android.graphics.PointF r6 = (android.graphics.PointF) r6
                java.util.Objects.requireNonNull(r5)
                float r0 = r6.x
                int r0 = java.lang.Math.round(r0)
                r5.f23554c = r0
                float r6 = r6.y
                int r6 = java.lang.Math.round(r6)
                r5.f23555d = r6
                int r0 = r5.f23558g
                int r0 = r0 + 1
                r5.f23558g = r0
                int r1 = r5.f23557f
                if (r1 != r0) goto L31
                android.view.View r0 = r5.f23556e
                int r1 = r5.f23552a
                int r2 = r5.f23553b
                int r3 = r5.f23554c
                p333t1.C6113q.m12640b(r0, r1, r2, r3, r6)
                r6 = 0
                r5.f23557f = r6
                r5.f23558g = r6
            L31:
                return
        }
    }

    /* renamed from: t1.b$d */
    public static class d extends android.util.Property<android.view.View, android.graphics.PointF> {
        public d(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                r1 = 0
                return r1
        }

        @Override // android.util.Property
        public void set(android.view.View r4, android.graphics.PointF r5) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                android.graphics.PointF r5 = (android.graphics.PointF) r5
                int r0 = r4.getLeft()
                int r1 = r4.getTop()
                float r2 = r5.x
                int r2 = java.lang.Math.round(r2)
                float r5 = r5.y
                int r5 = java.lang.Math.round(r5)
                p333t1.C6113q.m12640b(r4, r0, r1, r2, r5)
                return
        }
    }

    /* renamed from: t1.b$e */
    public static class e extends android.util.Property<android.view.View, android.graphics.PointF> {
        public e(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                r1 = 0
                return r1
        }

        @Override // android.util.Property
        public void set(android.view.View r4, android.graphics.PointF r5) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                android.graphics.PointF r5 = (android.graphics.PointF) r5
                float r0 = r5.x
                int r0 = java.lang.Math.round(r0)
                float r5 = r5.y
                int r5 = java.lang.Math.round(r5)
                int r1 = r4.getRight()
                int r2 = r4.getBottom()
                p333t1.C6113q.m12640b(r4, r0, r5, r1, r2)
                return
        }
    }

    /* renamed from: t1.b$f */
    public static class f extends android.util.Property<android.view.View, android.graphics.PointF> {
        public f(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                r1 = 0
                return r1
        }

        @Override // android.util.Property
        public void set(android.view.View r4, android.graphics.PointF r5) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                android.graphics.PointF r5 = (android.graphics.PointF) r5
                float r0 = r5.x
                int r0 = java.lang.Math.round(r0)
                float r5 = r5.y
                int r5 = java.lang.Math.round(r5)
                int r1 = r4.getWidth()
                int r1 = r1 + r0
                int r2 = r4.getHeight()
                int r2 = r2 + r5
                p333t1.C6113q.m12640b(r4, r0, r5, r1, r2)
                return
        }
    }

    /* renamed from: t1.b$g */
    public class g extends android.animation.AnimatorListenerAdapter {
        private p333t1.C6098b.i mViewBounds;

        public g(p333t1.C6098b r1, p333t1.C6098b.i r2) {
                r0 = this;
                r0.<init>()
                r0.mViewBounds = r2
                return
        }
    }

    /* renamed from: t1.b$h */
    public class h extends p333t1.C6107k {

        /* renamed from: a */
        public boolean f23550a;

        /* renamed from: b */
        public final /* synthetic */ android.view.ViewGroup f23551b;

        public h(p333t1.C6098b r1, android.view.ViewGroup r2) {
                r0 = this;
                r0.f23551b = r2
                r0.<init>()
                r1 = 0
                r0.f23550a = r1
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: a */
        public void mo12591a(p333t1.AbstractC6104h r3) {
                r2 = this;
                boolean r0 = r2.f23550a
                if (r0 != 0) goto La
                android.view.ViewGroup r0 = r2.f23551b
                r1 = 0
                p333t1.C6112p.m12638a(r0, r1)
            La:
                r3.mo12630z(r2)
                return
        }

        @Override // p333t1.C6107k, p333t1.AbstractC6104h.d
        /* renamed from: c */
        public void mo12592c(p333t1.AbstractC6104h r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.f23551b
                r0 = 0
                p333t1.C6112p.m12638a(r2, r0)
                r2 = 1
                r1.f23550a = r2
                return
        }

        @Override // p333t1.C6107k, p333t1.AbstractC6104h.d
        /* renamed from: d */
        public void mo12593d(p333t1.AbstractC6104h r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.f23551b
                r0 = 0
                p333t1.C6112p.m12638a(r2, r0)
                return
        }

        @Override // p333t1.C6107k, p333t1.AbstractC6104h.d
        /* renamed from: e */
        public void mo12594e(p333t1.AbstractC6104h r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.f23551b
                r0 = 1
                p333t1.C6112p.m12638a(r2, r0)
                return
        }
    }

    /* renamed from: t1.b$i */
    public static class i {

        /* renamed from: a */
        public int f23552a;

        /* renamed from: b */
        public int f23553b;

        /* renamed from: c */
        public int f23554c;

        /* renamed from: d */
        public int f23555d;

        /* renamed from: e */
        public android.view.View f23556e;

        /* renamed from: f */
        public int f23557f;

        /* renamed from: g */
        public int f23558g;

        public i(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.f23556e = r1
                return
        }
    }

    static {
            java.lang.String r0 = "android:changeBounds:bounds"
            java.lang.String r1 = "android:changeBounds:clip"
            java.lang.String r2 = "android:changeBounds:parent"
            java.lang.String r3 = "android:changeBounds:windowX"
            java.lang.String r4 = "android:changeBounds:windowY"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            p333t1.C6098b.f23544v0 = r0
            t1.b$a r0 = new t1.b$a
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "boundsOrigin"
            r0.<init>(r1, r2)
            t1.b$b r0 = new t1.b$b
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "topLeft"
            r0.<init>(r1, r2)
            p333t1.C6098b.f23545w0 = r0
            t1.b$c r0 = new t1.b$c
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r3 = "bottomRight"
            r0.<init>(r1, r3)
            p333t1.C6098b.f23546x0 = r0
            t1.b$d r0 = new t1.b$d
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1, r3)
            p333t1.C6098b.f23547y0 = r0
            t1.b$e r0 = new t1.b$e
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1, r2)
            p333t1.C6098b.f23548z0 = r0
            t1.b$f r0 = new t1.b$f
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "position"
            r0.<init>(r1, r2)
            p333t1.C6098b.f23543A0 = r0
            return
    }

    public C6098b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: M */
    public final void m12589M(p333t1.C6111o r7) {
            r6 = this;
            android.view.View r0 = r7.f23622b
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            boolean r1 = p227n0.C4661t.f.m10588c(r0)
            if (r1 != 0) goto L16
            int r1 = r0.getWidth()
            if (r1 != 0) goto L16
            int r1 = r0.getHeight()
            if (r1 == 0) goto L3f
        L16:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f23621a
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r0.getLeft()
            int r4 = r0.getTop()
            int r5 = r0.getRight()
            int r0 = r0.getBottom()
            r2.<init>(r3, r4, r5, r0)
            java.lang.String r0 = "android:changeBounds:bounds"
            r1.put(r0, r2)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f23621a
            android.view.View r7 = r7.f23622b
            android.view.ViewParent r7 = r7.getParent()
            java.lang.String r1 = "android:changeBounds:parent"
            r0.put(r1, r7)
        L3f:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: d */
    public void mo9875d(p333t1.C6111o r1) {
            r0 = this;
            r0.m12589M(r1)
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: g */
    public void mo9876g(p333t1.C6111o r1) {
            r0 = this;
            r0.m12589M(r1)
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: o */
    public android.animation.Animator mo9877o(android.view.ViewGroup r19, p333t1.C6111o r20, p333t1.C6111o r21) {
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L12c
            if (r2 != 0) goto Lc
            goto L12c
        Lc:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f23621a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f23621a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L12a
            if (r5 != 0) goto L24
            goto L12a
        L24:
            android.view.View r4 = r2.f23622b
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f23621a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f23621a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r8 = r6.left
            int r9 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r6 = r6.bottom
            int r13 = r11 - r7
            int r14 = r5 - r9
            int r15 = r12 - r8
            int r3 = r6 - r10
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f23621a
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f23621a
            java.lang.Object r0 = r2.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r2 = 1
            if (r13 == 0) goto L67
            if (r14 != 0) goto L6b
        L67:
            if (r15 == 0) goto L7c
            if (r3 == 0) goto L7c
        L6b:
            if (r7 != r8) goto L73
            if (r9 == r10) goto L70
            goto L73
        L70:
            r16 = 0
            goto L75
        L73:
            r16 = 1
        L75:
            if (r11 != r12) goto L79
            if (r5 == r6) goto L7e
        L79:
            int r16 = r16 + 1
            goto L7e
        L7c:
            r16 = 0
        L7e:
            if (r1 == 0) goto L86
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L8a
        L86:
            if (r1 != 0) goto L8c
            if (r0 == 0) goto L8c
        L8a:
            int r16 = r16 + 1
        L8c:
            r0 = r16
            if (r0 <= 0) goto L126
            p333t1.C6113q.m12640b(r4, r7, r9, r11, r5)
            r1 = 2
            if (r0 != r1) goto Le8
            if (r13 != r15) goto La9
            if (r14 != r3) goto La9
            r0 = r18
            t1.f r1 = r0.f23595r0
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.mo12601e(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = p333t1.C6098b.f23543A0
            goto L108
        La9:
            r0 = r18
            t1.b$i r3 = new t1.b$i
            r3.<init>(r4)
            t1.f r13 = r0.f23595r0
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.mo12601e(r7, r9, r8, r10)
            android.util.Property<t1.b$i, android.graphics.PointF> r8 = p333t1.C6098b.f23545w0
            android.animation.ObjectAnimator r7 = p333t1.C6101e.m12599a(r3, r8, r7)
            t1.f r8 = r0.f23595r0
            float r9 = (float) r11
            float r5 = (float) r5
            float r10 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r5 = r8.mo12601e(r9, r5, r10, r6)
            android.util.Property<t1.b$i, android.graphics.PointF> r6 = p333t1.C6098b.f23546x0
            android.animation.ObjectAnimator r5 = p333t1.C6101e.m12599a(r3, r6, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r8 = 0
            r1[r8] = r7
            r1[r2] = r5
            r6.playTogether(r1)
            t1.b$g r1 = new t1.b$g
            r1.<init>(r0, r3)
            r6.addListener(r1)
            goto L10c
        Le8:
            r0 = r18
            if (r7 != r8) goto Lfc
            if (r9 == r10) goto Lef
            goto Lfc
        Lef:
            t1.f r1 = r0.f23595r0
            float r3 = (float) r11
            float r5 = (float) r5
            float r7 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r1 = r1.mo12601e(r3, r5, r7, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = p333t1.C6098b.f23547y0
            goto L108
        Lfc:
            t1.f r1 = r0.f23595r0
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.mo12601e(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = p333t1.C6098b.f23548z0
        L108:
            android.animation.ObjectAnimator r6 = p333t1.C6101e.m12599a(r4, r3, r1)
        L10c:
            android.view.ViewParent r1 = r4.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L125
            android.view.ViewParent r1 = r4.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            p333t1.C6112p.m12638a(r1, r2)
            t1.b$h r2 = new t1.b$h
            r2.<init>(r0, r1)
            r0.mo12616a(r2)
        L125:
            return r6
        L126:
            r0 = r18
            r1 = 0
            return r1
        L12a:
            r1 = 0
            return r1
        L12c:
            r1 = 0
            return r1
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: t */
    public java.lang.String[] mo12590t() {
            r1 = this;
            java.lang.String[] r0 = p333t1.C6098b.f23544v0
            return r0
    }
}
