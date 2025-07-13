package com.google.android.material.floatingactionbutton;

/* renamed from: com.google.android.material.floatingactionbutton.d */
/* loaded from: classes.dex */
public class C1193d {

    /* renamed from: A */
    public static final int[] f6178A = null;

    /* renamed from: B */
    public static final int[] f6179B = null;

    /* renamed from: C */
    public static final int[] f6180C = null;

    /* renamed from: D */
    public static final int[] f6181D = null;

    /* renamed from: x */
    public static final android.animation.TimeInterpolator f6182x = null;

    /* renamed from: y */
    public static final int[] f6183y = null;

    /* renamed from: z */
    public static final int[] f6184z = null;

    /* renamed from: a */
    public p340t8.C6192i f6185a;

    /* renamed from: b */
    public boolean f6186b;

    /* renamed from: c */
    public boolean f6187c;

    /* renamed from: d */
    public float f6188d;

    /* renamed from: e */
    public float f6189e;

    /* renamed from: f */
    public float f6190f;

    /* renamed from: g */
    public final p220m8.C4424h f6191g;

    /* renamed from: h */
    public p354u7.C6356g f6192h;

    /* renamed from: i */
    public p354u7.C6356g f6193i;

    /* renamed from: j */
    public android.animation.Animator f6194j;

    /* renamed from: k */
    public p354u7.C6356g f6195k;

    /* renamed from: l */
    public p354u7.C6356g f6196l;

    /* renamed from: m */
    public float f6197m;

    /* renamed from: n */
    public float f6198n;

    /* renamed from: o */
    public int f6199o;

    /* renamed from: p */
    public java.util.ArrayList<android.animation.Animator.AnimatorListener> f6200p;

    /* renamed from: q */
    public java.util.ArrayList<android.animation.Animator.AnimatorListener> f6201q;

    /* renamed from: r */
    public java.util.ArrayList<com.google.android.material.floatingactionbutton.C1193d.e> f6202r;

    /* renamed from: s */
    public final com.google.android.material.floatingactionbutton.FloatingActionButton f6203s;

    /* renamed from: t */
    public final p328s8.InterfaceC5996b f6204t;

    /* renamed from: u */
    public final android.graphics.Rect f6205u;

    /* renamed from: v */
    public final android.graphics.Matrix f6206v;

    /* renamed from: w */
    public android.view.ViewTreeObserver.OnPreDrawListener f6207w;

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    public class a extends p354u7.C6355f {

        /* renamed from: d */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.C1193d f6208d;

        public a(com.google.android.material.floatingactionbutton.C1193d r1) {
                r0 = this;
                r0.f6208d = r1
                r0.<init>()
                return
        }

        @Override // android.animation.TypeEvaluator
        public android.graphics.Matrix evaluate(float r4, android.graphics.Matrix r5, android.graphics.Matrix r6) {
                r3 = this;
                android.graphics.Matrix r5 = (android.graphics.Matrix) r5
                android.graphics.Matrix r6 = (android.graphics.Matrix) r6
                com.google.android.material.floatingactionbutton.d r0 = r3.f6208d
                r0.f6198n = r4
                float[] r0 = r3.f24812a
                r5.getValues(r0)
                float[] r5 = r3.f24813b
                r6.getValues(r5)
                r5 = 0
            L13:
                r6 = 9
                if (r5 >= r6) goto L2a
                float[] r6 = r3.f24813b
                r0 = r6[r5]
                float[] r1 = r3.f24812a
                r2 = r1[r5]
                float r0 = r0 - r2
                r1 = r1[r5]
                float r0 = r0 * r4
                float r0 = r0 + r1
                r6[r5] = r0
                int r5 = r5 + 1
                goto L13
            L2a:
                android.graphics.Matrix r4 = r3.f24814c
                float[] r5 = r3.f24813b
                r4.setValues(r5)
                android.graphics.Matrix r4 = r3.f24814c
                return r4
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    public class b extends com.google.android.material.floatingactionbutton.C1193d.h {
        public b(com.google.android.material.floatingactionbutton.C1193d r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.C1193d.h
        /* renamed from: a */
        public float mo3491a() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    public class c extends com.google.android.material.floatingactionbutton.C1193d.h {

        /* renamed from: c */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.C1193d f6209c;

        public c(com.google.android.material.floatingactionbutton.C1193d r2) {
                r1 = this;
                r1.f6209c = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.C1193d.h
        /* renamed from: a */
        public float mo3491a() {
                r2 = this;
                com.google.android.material.floatingactionbutton.d r0 = r2.f6209c
                float r1 = r0.f6188d
                float r0 = r0.f6189e
                float r1 = r1 + r0
                return r1
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    public class d extends com.google.android.material.floatingactionbutton.C1193d.h {

        /* renamed from: c */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.C1193d f6210c;

        public d(com.google.android.material.floatingactionbutton.C1193d r2) {
                r1 = this;
                r1.f6210c = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.C1193d.h
        /* renamed from: a */
        public float mo3491a() {
                r2 = this;
                com.google.android.material.floatingactionbutton.d r0 = r2.f6210c
                float r1 = r0.f6188d
                float r0 = r0.f6190f
                float r1 = r1 + r0
                return r1
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    public interface e {
        /* renamed from: a */
        void mo3470a();

        /* renamed from: b */
        void mo3471b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    public interface f {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    public class g extends com.google.android.material.floatingactionbutton.C1193d.h {

        /* renamed from: c */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.C1193d f6211c;

        public g(com.google.android.material.floatingactionbutton.C1193d r2) {
                r1 = this;
                r1.f6211c = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.C1193d.h
        /* renamed from: a */
        public float mo3491a() {
                r1 = this;
                com.google.android.material.floatingactionbutton.d r0 = r1.f6211c
                float r0 = r0.f6188d
                return r0
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    public abstract class h extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f6212a;

        /* renamed from: b */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.C1193d f6213b;

        public h(com.google.android.material.floatingactionbutton.C1193d r1, com.google.android.material.floatingactionbutton.C1191b r2) {
                r0 = this;
                r0.f6213b = r1
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract float mo3491a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                com.google.android.material.floatingactionbutton.d r1 = r0.f6213b
                java.util.Objects.requireNonNull(r1)
                r1 = 0
                r0.f6212a = r1
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                boolean r0 = r1.f6212a
                if (r0 != 0) goto Lf
                com.google.android.material.floatingactionbutton.d r0 = r1.f6213b
                java.util.Objects.requireNonNull(r0)
                r1.mo3491a()
                r0 = 1
                r1.f6212a = r0
            Lf:
                com.google.android.material.floatingactionbutton.d r0 = r1.f6213b
                r2.getAnimatedFraction()
                java.util.Objects.requireNonNull(r0)
                return
        }
    }

    static {
            android.animation.TimeInterpolator r0 = p354u7.C6350a.f24805c
            com.google.android.material.floatingactionbutton.C1193d.f6182x = r0
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {x0032: FILL_ARRAY_DATA , data: [16842919, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.C1193d.f6183y = r1
            r1 = 3
            int[] r1 = new int[r1]
            r1 = {x003a: FILL_ARRAY_DATA , data: [16843623, 16842908, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.C1193d.f6184z = r1
            int[] r1 = new int[r0]
            r1 = {x0044: FILL_ARRAY_DATA , data: [16842908, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.C1193d.f6178A = r1
            int[] r0 = new int[r0]
            r0 = {x004c: FILL_ARRAY_DATA , data: [16843623, 16842910} // fill-array
            com.google.android.material.floatingactionbutton.C1193d.f6179B = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 16842910(0x101009e, float:2.3694E-38)
            r2 = 0
            r0[r2] = r1
            com.google.android.material.floatingactionbutton.C1193d.f6180C = r0
            int[] r0 = new int[r2]
            com.google.android.material.floatingactionbutton.C1193d.f6181D = r0
            return
    }

    public C1193d(com.google.android.material.floatingactionbutton.FloatingActionButton r3, p328s8.InterfaceC5996b r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f6187c = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.f6198n = r0
            r0 = 0
            r2.f6199o = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f6205u = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f6206v = r0
            r2.f6203s = r3
            r2.f6204t = r4
            m8.h r4 = new m8.h
            r4.<init>()
            r2.f6191g = r4
            int[] r0 = com.google.android.material.floatingactionbutton.C1193d.f6183y
            com.google.android.material.floatingactionbutton.d$d r1 = new com.google.android.material.floatingactionbutton.d$d
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.m3473b(r1)
            r4.m9870a(r0, r1)
            int[] r0 = com.google.android.material.floatingactionbutton.C1193d.f6184z
            com.google.android.material.floatingactionbutton.d$c r1 = new com.google.android.material.floatingactionbutton.d$c
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.m3473b(r1)
            r4.m9870a(r0, r1)
            int[] r0 = com.google.android.material.floatingactionbutton.C1193d.f6178A
            com.google.android.material.floatingactionbutton.d$c r1 = new com.google.android.material.floatingactionbutton.d$c
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.m3473b(r1)
            r4.m9870a(r0, r1)
            int[] r0 = com.google.android.material.floatingactionbutton.C1193d.f6179B
            com.google.android.material.floatingactionbutton.d$c r1 = new com.google.android.material.floatingactionbutton.d$c
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.m3473b(r1)
            r4.m9870a(r0, r1)
            int[] r0 = com.google.android.material.floatingactionbutton.C1193d.f6180C
            com.google.android.material.floatingactionbutton.d$g r1 = new com.google.android.material.floatingactionbutton.d$g
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.m3473b(r1)
            r4.m9870a(r0, r1)
            int[] r0 = com.google.android.material.floatingactionbutton.C1193d.f6181D
            com.google.android.material.floatingactionbutton.d$b r1 = new com.google.android.material.floatingactionbutton.d$b
            r1.<init>(r2)
            android.animation.ValueAnimator r1 = r2.m3473b(r1)
            r4.m9870a(r0, r1)
            float r3 = r3.getRotation()
            r2.f6197m = r3
            return
    }

    /* renamed from: a */
    public final android.animation.AnimatorSet m3472a(p354u7.C6356g r8, float r9, float r10, float r11) {
            r7 = this;
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r7.f6203s
            android.util.Property r1 = android.view.View.ALPHA
            r2 = 1
            float[] r3 = new float[r2]
            r4 = 0
            r3[r4] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r0, r1, r3)
            java.lang.String r0 = "opacity"
            u7.h r0 = r8.m13009d(r0)
            r0.m13010a(r9)
            r11.add(r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r7.f6203s
            android.util.Property r0 = android.view.View.SCALE_X
            float[] r1 = new float[r2]
            r1[r4] = r10
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r0, r1)
            java.lang.String r0 = "scale"
            u7.h r1 = r8.m13009d(r0)
            r1.m13010a(r9)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 == r3) goto L3b
            goto L43
        L3b:
            l8.a r5 = new l8.a
            r5.<init>(r7)
            r9.setEvaluator(r5)
        L43:
            r11.add(r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r7.f6203s
            android.util.Property r5 = android.view.View.SCALE_Y
            float[] r6 = new float[r2]
            r6[r4] = r10
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r5, r6)
            u7.h r10 = r8.m13009d(r0)
            r10.m13010a(r9)
            if (r1 == r3) goto L5c
            goto L64
        L5c:
            l8.a r10 = new l8.a
            r10.<init>(r7)
            r9.setEvaluator(r10)
        L64:
            r11.add(r9)
            android.graphics.Matrix r9 = r7.f6206v
            r9.reset()
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r7.f6203s
            r9.getDrawable()
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r7.f6203s
            u7.e r10 = new u7.e
            r10.<init>()
            com.google.android.material.floatingactionbutton.d$a r0 = new com.google.android.material.floatingactionbutton.d$a
            r0.<init>(r7)
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r2]
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r3 = r7.f6206v
            r2.<init>(r3)
            r1[r4] = r2
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofObject(r9, r10, r0, r1)
            java.lang.String r10 = "iconScale"
            u7.h r8 = r8.m13009d(r10)
            r8.m13010a(r9)
            r11.add(r9)
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            p185k7.C3836i.m8628m(r8, r11)
            return r8
    }

    /* renamed from: b */
    public final android.animation.ValueAnimator m3473b(com.google.android.material.floatingactionbutton.C1193d.h r4) {
            r3 = this;
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r1 = com.google.android.material.floatingactionbutton.C1193d.f6182x
            r0.setInterpolator(r1)
            r1 = 100
            r0.setDuration(r1)
            r0.addListener(r4)
            r0.addUpdateListener(r4)
            r4 = 2
            float[] r4 = new float[r4]
            r4 = {x0020: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r0.setFloatValues(r4)
            return r0
    }

    /* renamed from: c */
    public float mo3474c() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: d */
    public void mo3475d(android.graphics.Rect r6) {
            r5 = this;
            boolean r0 = r5.f6186b
            r1 = 0
            if (r0 == 0) goto Le
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r5.f6203s
            int r0 = r0.getSizeDimension()
            int r1 = r1 - r0
            int r1 = r1 / 2
        Le:
            boolean r0 = r5.f6187c
            if (r0 == 0) goto L1a
            float r0 = r5.mo3474c()
            float r2 = r5.f6190f
            float r0 = r0 + r2
            goto L1b
        L1a:
            r0 = 0
        L1b:
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            int r2 = java.lang.Math.max(r1, r2)
            r3 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 * r3
            double r3 = (double) r0
            double r3 = java.lang.Math.ceil(r3)
            int r0 = (int) r3
            int r0 = java.lang.Math.max(r1, r0)
            r6.set(r2, r0, r2, r0)
            return
    }

    /* renamed from: e */
    public boolean m3476e() {
            r4 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r4.f6203s
            int r0 = r0.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            int r0 = r4.f6199o
            if (r0 != r2) goto Lf
            r1 = 1
        Lf:
            return r1
        L10:
            int r0 = r4.f6199o
            r3 = 2
            if (r0 == r3) goto L16
            r1 = 1
        L16:
            return r1
    }

    /* renamed from: f */
    public boolean m3477f() {
            r4 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r4.f6203s
            int r0 = r0.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            int r0 = r4.f6199o
            r3 = 2
            if (r0 != r3) goto L10
            r1 = 1
        L10:
            return r1
        L11:
            int r0 = r4.f6199o
            if (r0 == r2) goto L16
            r1 = 1
        L16:
            return r1
    }

    /* renamed from: g */
    public void mo3478g() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: h */
    public void mo3479h() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: i */
    public void mo3480i(int[] r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: j */
    public void mo3481j(float r1, float r2, float r3) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: k */
    public void m3482k() {
            r2 = this;
            java.util.ArrayList<com.google.android.material.floatingactionbutton.d$e> r0 = r2.f6202r
            if (r0 == 0) goto L18
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.material.floatingactionbutton.d$e r1 = (com.google.android.material.floatingactionbutton.C1193d.e) r1
            r1.mo3471b()
            goto L8
        L18:
            return
    }

    /* renamed from: l */
    public void m3483l() {
            r2 = this;
            java.util.ArrayList<com.google.android.material.floatingactionbutton.d$e> r0 = r2.f6202r
            if (r0 == 0) goto L18
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.material.floatingactionbutton.d$e r1 = (com.google.android.material.floatingactionbutton.C1193d.e) r1
            r1.mo3470a()
            goto L8
        L18:
            return
    }

    /* renamed from: m */
    public final void m3484m(float r2) {
            r1 = this;
            r1.f6198n = r2
            android.graphics.Matrix r2 = r1.f6206v
            r2.reset()
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.f6203s
            r0.getDrawable()
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.f6203s
            r0.setImageMatrix(r2)
            return
    }

    /* renamed from: n */
    public void mo3485n(android.content.res.ColorStateList r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: o */
    public boolean mo3486o() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: p */
    public final boolean m3487p() {
            r2 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f6203s
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10588c(r0)
            if (r0 == 0) goto L14
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f6203s
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    /* renamed from: q */
    public final boolean m3488q() {
            r1 = this;
            boolean r0 = r1.f6186b
            if (r0 == 0) goto Lf
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.f6203s
            int r0 = r0.getSizeDimension()
            if (r0 < 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    /* renamed from: r */
    public void mo3489r() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: s */
    public final void m3490s() {
            r9 = this;
            android.graphics.Rect r0 = r9.f6205u
            r9.mo3475d(r0)
            r1 = 0
            java.lang.String r2 = "Didn't initialize content background"
            p064e.C1487a.m4027e(r1, r2)
            boolean r2 = r9.mo3486o()
            if (r2 == 0) goto L2d
            android.graphics.drawable.InsetDrawable r2 = new android.graphics.drawable.InsetDrawable
            r4 = 0
            int r5 = r0.left
            int r6 = r0.top
            int r7 = r0.right
            int r8 = r0.bottom
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            s8.b r3 = r9.f6204t
            com.google.android.material.floatingactionbutton.FloatingActionButton$b r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton.C1188b) r3
            java.util.Objects.requireNonNull(r3)
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r3.f6166a
            com.google.android.material.floatingactionbutton.FloatingActionButton.m3449c(r3, r2)
            goto L34
        L2d:
            s8.b r2 = r9.f6204t
            com.google.android.material.floatingactionbutton.FloatingActionButton$b r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton.C1188b) r2
            java.util.Objects.requireNonNull(r2)
        L34:
            s8.b r2 = r9.f6204t
            int r0 = r0.left
            com.google.android.material.floatingactionbutton.FloatingActionButton$b r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton.C1188b) r2
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f6166a
            java.util.Objects.requireNonNull(r0)
            throw r1
    }
}
