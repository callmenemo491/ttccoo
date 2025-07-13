package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.t */
/* loaded from: classes.dex */
public class C0609t extends androidx.recyclerview.widget.RecyclerView.AbstractC0556l implements androidx.recyclerview.widget.RecyclerView.InterfaceC0559o {

    /* renamed from: A */
    public android.graphics.Rect f3566A;

    /* renamed from: B */
    public long f3567B;

    /* renamed from: a */
    public final java.util.List<android.view.View> f3568a;

    /* renamed from: b */
    public final float[] f3569b;

    /* renamed from: c */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 f3570c;

    /* renamed from: d */
    public float f3571d;

    /* renamed from: e */
    public float f3572e;

    /* renamed from: f */
    public float f3573f;

    /* renamed from: g */
    public float f3574g;

    /* renamed from: h */
    public float f3575h;

    /* renamed from: i */
    public float f3576i;

    /* renamed from: j */
    public float f3577j;

    /* renamed from: k */
    public float f3578k;

    /* renamed from: l */
    public int f3579l;

    /* renamed from: m */
    public androidx.recyclerview.widget.C0609t.d f3580m;

    /* renamed from: n */
    public int f3581n;

    /* renamed from: o */
    public int f3582o;

    /* renamed from: p */
    public java.util.List<androidx.recyclerview.widget.C0609t.f> f3583p;

    /* renamed from: q */
    public int f3584q;

    /* renamed from: r */
    public androidx.recyclerview.widget.RecyclerView f3585r;

    /* renamed from: s */
    public final java.lang.Runnable f3586s;

    /* renamed from: t */
    public android.view.VelocityTracker f3587t;

    /* renamed from: u */
    public java.util.List<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> f3588u;

    /* renamed from: v */
    public java.util.List<java.lang.Integer> f3589v;

    /* renamed from: w */
    public android.view.View f3590w;

    /* renamed from: x */
    public p227n0.C4646e f3591x;

    /* renamed from: y */
    public androidx.recyclerview.widget.C0609t.e f3592y;

    /* renamed from: z */
    public final androidx.recyclerview.widget.RecyclerView.InterfaceC0561q f3593z;

    /* renamed from: androidx.recyclerview.widget.t$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.recyclerview.widget.C0609t f3594Y;

        public a(androidx.recyclerview.widget.C0609t r1) {
                r0 = this;
                r0.f3594Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r16 = this;
                r0 = r16
                androidx.recyclerview.widget.t r1 = r0.f3594Y
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.f3570c
                if (r2 == 0) goto L12f
                r3 = -9223372036854775808
                r5 = 0
                if (r2 != 0) goto L11
            Ld:
                r1.f3567B = r3
                goto L112
            L11:
                long r6 = java.lang.System.currentTimeMillis()
                long r8 = r1.f3567B
                int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r2 != 0) goto L1e
                r8 = 0
                goto L20
            L1e:
                long r8 = r6 - r8
            L20:
                androidx.recyclerview.widget.RecyclerView r2 = r1.f3585r
                androidx.recyclerview.widget.RecyclerView$m r2 = r2.getLayoutManager()
                android.graphics.Rect r10 = r1.f3566A
                if (r10 != 0) goto L31
                android.graphics.Rect r10 = new android.graphics.Rect
                r10.<init>()
                r1.f3566A = r10
            L31:
                androidx.recyclerview.widget.RecyclerView$b0 r10 = r1.f3570c
                android.view.View r10 = r10.f3208a
                android.graphics.Rect r11 = r1.f3566A
                r2.m1877f(r10, r11)
                boolean r10 = r2.mo1687g()
                r11 = 0
                if (r10 == 0) goto L81
                float r10 = r1.f3577j
                float r12 = r1.f3575h
                float r10 = r10 + r12
                int r10 = (int) r10
                android.graphics.Rect r12 = r1.f3566A
                int r12 = r12.left
                int r12 = r10 - r12
                androidx.recyclerview.widget.RecyclerView r13 = r1.f3585r
                int r13 = r13.getPaddingLeft()
                int r12 = r12 - r13
                float r13 = r1.f3575h
                int r14 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r14 >= 0) goto L5d
                if (r12 >= 0) goto L5d
                goto L7f
            L5d:
                int r12 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r12 <= 0) goto L81
                androidx.recyclerview.widget.RecyclerView$b0 r12 = r1.f3570c
                android.view.View r12 = r12.f3208a
                int r12 = r12.getWidth()
                int r12 = r12 + r10
                android.graphics.Rect r10 = r1.f3566A
                int r10 = r10.right
                int r12 = r12 + r10
                androidx.recyclerview.widget.RecyclerView r10 = r1.f3585r
                int r10 = r10.getWidth()
                androidx.recyclerview.widget.RecyclerView r13 = r1.f3585r
                int r13 = r13.getPaddingRight()
                int r10 = r10 - r13
                int r12 = r12 - r10
                if (r12 <= 0) goto L81
            L7f:
                r13 = r12
                goto L82
            L81:
                r13 = 0
            L82:
                boolean r2 = r2.mo1689h()
                if (r2 == 0) goto Lc8
                float r2 = r1.f3578k
                float r10 = r1.f3576i
                float r2 = r2 + r10
                int r2 = (int) r2
                android.graphics.Rect r10 = r1.f3566A
                int r10 = r10.top
                int r10 = r2 - r10
                androidx.recyclerview.widget.RecyclerView r12 = r1.f3585r
                int r12 = r12.getPaddingTop()
                int r10 = r10 - r12
                float r12 = r1.f3576i
                int r14 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r14 >= 0) goto La4
                if (r10 >= 0) goto La4
                goto Lc6
            La4:
                int r10 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r10 <= 0) goto Lc8
                androidx.recyclerview.widget.RecyclerView$b0 r10 = r1.f3570c
                android.view.View r10 = r10.f3208a
                int r10 = r10.getHeight()
                int r10 = r10 + r2
                android.graphics.Rect r2 = r1.f3566A
                int r2 = r2.bottom
                int r10 = r10 + r2
                androidx.recyclerview.widget.RecyclerView r2 = r1.f3585r
                int r2 = r2.getHeight()
                androidx.recyclerview.widget.RecyclerView r11 = r1.f3585r
                int r11 = r11.getPaddingBottom()
                int r2 = r2 - r11
                int r10 = r10 - r2
                if (r10 <= 0) goto Lc8
            Lc6:
                r2 = r10
                goto Lc9
            Lc8:
                r2 = 0
            Lc9:
                if (r13 == 0) goto Le1
                androidx.recyclerview.widget.t$d r10 = r1.f3580m
                androidx.recyclerview.widget.RecyclerView r11 = r1.f3585r
                androidx.recyclerview.widget.RecyclerView$b0 r12 = r1.f3570c
                android.view.View r12 = r12.f3208a
                int r12 = r12.getWidth()
                androidx.recyclerview.widget.RecyclerView r14 = r1.f3585r
                r14.getWidth()
                r14 = r8
                int r13 = r10.m2134f(r11, r12, r13, r14)
            Le1:
                r14 = r13
                if (r2 == 0) goto Lff
                androidx.recyclerview.widget.t$d r10 = r1.f3580m
                androidx.recyclerview.widget.RecyclerView r11 = r1.f3585r
                androidx.recyclerview.widget.RecyclerView$b0 r12 = r1.f3570c
                android.view.View r12 = r12.f3208a
                int r12 = r12.getHeight()
                androidx.recyclerview.widget.RecyclerView r13 = r1.f3585r
                r13.getHeight()
                r13 = r2
                r2 = r14
                r14 = r8
                int r8 = r10.m2134f(r11, r12, r13, r14)
                r13 = r2
                r2 = r8
                goto L100
            Lff:
                r13 = r14
            L100:
                if (r13 != 0) goto L104
                if (r2 == 0) goto Ld
            L104:
                long r8 = r1.f3567B
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 != 0) goto L10c
                r1.f3567B = r6
            L10c:
                androidx.recyclerview.widget.RecyclerView r1 = r1.f3585r
                r1.scrollBy(r13, r2)
                r5 = 1
            L112:
                if (r5 == 0) goto L12f
                androidx.recyclerview.widget.t r1 = r0.f3594Y
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.f3570c
                if (r2 == 0) goto L11d
                r1.m2125p(r2)
            L11d:
                androidx.recyclerview.widget.t r1 = r0.f3594Y
                androidx.recyclerview.widget.RecyclerView r2 = r1.f3585r
                java.lang.Runnable r1 = r1.f3586s
                r2.removeCallbacks(r1)
                androidx.recyclerview.widget.t r1 = r0.f3594Y
                androidx.recyclerview.widget.RecyclerView r1 = r1.f3585r
                java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10565m(r1, r0)
            L12f:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$b */
    public class b implements androidx.recyclerview.widget.RecyclerView.InterfaceC0561q {

        /* renamed from: a */
        public final /* synthetic */ androidx.recyclerview.widget.C0609t f3595a;

        public b(androidx.recyclerview.widget.C0609t r1) {
                r0 = this;
                r0.f3595a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0561q
        /* renamed from: a */
        public boolean mo1902a(androidx.recyclerview.widget.RecyclerView r8, android.view.MotionEvent r9) {
                r7 = this;
                androidx.recyclerview.widget.t r8 = r7.f3595a
                n0.e r8 = r8.f3591x
                n0.e$a r8 = r8.f18552a
                n0.e$b r8 = (p227n0.C4646e.b) r8
                android.view.GestureDetector r8 = r8.f18553a
                r8.onTouchEvent(r9)
                int r8 = r9.getActionMasked()
                r0 = 0
                r1 = -1
                r2 = 0
                r3 = 1
                if (r8 != 0) goto Lae
                androidx.recyclerview.widget.t r8 = r7.f3595a
                int r4 = r9.getPointerId(r0)
                r8.f3579l = r4
                androidx.recyclerview.widget.t r8 = r7.f3595a
                float r4 = r9.getX()
                r8.f3571d = r4
                androidx.recyclerview.widget.t r8 = r7.f3595a
                float r4 = r9.getY()
                r8.f3572e = r4
                androidx.recyclerview.widget.t r8 = r7.f3595a
                android.view.VelocityTracker r4 = r8.f3587t
                if (r4 == 0) goto L38
                r4.recycle()
            L38:
                android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
                r8.f3587t = r4
                androidx.recyclerview.widget.t r8 = r7.f3595a
                androidx.recyclerview.widget.RecyclerView$b0 r4 = r8.f3570c
                if (r4 != 0) goto Lcd
                java.util.List<androidx.recyclerview.widget.t$f> r4 = r8.f3583p
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L4d
                goto L6d
            L4d:
                android.view.View r4 = r8.m2123m(r9)
                java.util.List<androidx.recyclerview.widget.t$f> r5 = r8.f3583p
                int r5 = r5.size()
                int r5 = r5 + r1
            L58:
                if (r5 < 0) goto L6d
                java.util.List<androidx.recyclerview.widget.t$f> r1 = r8.f3583p
                java.lang.Object r1 = r1.get(r5)
                androidx.recyclerview.widget.t$f r1 = (androidx.recyclerview.widget.C0609t.f) r1
                androidx.recyclerview.widget.RecyclerView$b0 r6 = r1.f3608e
                android.view.View r6 = r6.f3208a
                if (r6 != r4) goto L6a
                r2 = r1
                goto L6d
            L6a:
                int r5 = r5 + (-1)
                goto L58
            L6d:
                if (r2 == 0) goto Lcd
                androidx.recyclerview.widget.t r8 = r7.f3595a
                float r1 = r8.f3571d
                float r4 = r2.f3612i
                float r1 = r1 - r4
                r8.f3571d = r1
                float r1 = r8.f3572e
                float r4 = r2.f3613j
                float r1 = r1 - r4
                r8.f3572e = r1
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r2.f3608e
                r8.m2122l(r1, r3)
                androidx.recyclerview.widget.t r8 = r7.f3595a
                java.util.List<android.view.View> r8 = r8.f3568a
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r2.f3608e
                android.view.View r1 = r1.f3208a
                boolean r8 = r8.remove(r1)
                if (r8 == 0) goto L9d
                androidx.recyclerview.widget.t r8 = r7.f3595a
                androidx.recyclerview.widget.t$d r1 = r8.f3580m
                androidx.recyclerview.widget.RecyclerView r8 = r8.f3585r
                androidx.recyclerview.widget.RecyclerView$b0 r4 = r2.f3608e
                r1.mo2130a(r8, r4)
            L9d:
                androidx.recyclerview.widget.t r8 = r7.f3595a
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r2.f3608e
                int r2 = r2.f3609f
                r8.m2127r(r1, r2)
                androidx.recyclerview.widget.t r8 = r7.f3595a
                int r1 = r8.f3582o
                r8.m2128s(r9, r1, r0)
                goto Lcd
            Lae:
                r4 = 3
                if (r8 == r4) goto Lc6
                if (r8 != r3) goto Lb4
                goto Lc6
            Lb4:
                androidx.recyclerview.widget.t r2 = r7.f3595a
                int r2 = r2.f3579l
                if (r2 == r1) goto Lcd
                int r1 = r9.findPointerIndex(r2)
                if (r1 < 0) goto Lcd
                androidx.recyclerview.widget.t r2 = r7.f3595a
                r2.m2120j(r8, r9, r1)
                goto Lcd
            Lc6:
                androidx.recyclerview.widget.t r8 = r7.f3595a
                r8.f3579l = r1
                r8.m2127r(r2, r0)
            Lcd:
                androidx.recyclerview.widget.t r8 = r7.f3595a
                android.view.VelocityTracker r8 = r8.f3587t
                if (r8 == 0) goto Ld6
                r8.addMovement(r9)
            Ld6:
                androidx.recyclerview.widget.t r8 = r7.f3595a
                androidx.recyclerview.widget.RecyclerView$b0 r8 = r8.f3570c
                if (r8 == 0) goto Ldd
                r0 = 1
            Ldd:
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0561q
        /* renamed from: c */
        public void mo1903c(androidx.recyclerview.widget.RecyclerView r8, android.view.MotionEvent r9) {
                r7 = this;
                androidx.recyclerview.widget.t r8 = r7.f3595a
                n0.e r8 = r8.f3591x
                n0.e$a r8 = r8.f18552a
                n0.e$b r8 = (p227n0.C4646e.b) r8
                android.view.GestureDetector r8 = r8.f18553a
                r8.onTouchEvent(r9)
                androidx.recyclerview.widget.t r8 = r7.f3595a
                android.view.VelocityTracker r8 = r8.f3587t
                if (r8 == 0) goto L16
                r8.addMovement(r9)
            L16:
                androidx.recyclerview.widget.t r8 = r7.f3595a
                int r8 = r8.f3579l
                r0 = -1
                if (r8 != r0) goto L1e
                return
            L1e:
                int r8 = r9.getActionMasked()
                androidx.recyclerview.widget.t r1 = r7.f3595a
                int r1 = r1.f3579l
                int r1 = r9.findPointerIndex(r1)
                if (r1 < 0) goto L31
                androidx.recyclerview.widget.t r2 = r7.f3595a
                r2.m2120j(r8, r9, r1)
            L31:
                androidx.recyclerview.widget.t r2 = r7.f3595a
                androidx.recyclerview.widget.RecyclerView$b0 r3 = r2.f3570c
                if (r3 != 0) goto L38
                return
            L38:
                r4 = 0
                r5 = 1
                if (r8 == r5) goto L91
                r6 = 2
                if (r8 == r6) goto L6d
                r1 = 3
                if (r8 == r1) goto L65
                r0 = 6
                if (r8 == r0) goto L46
                goto L9b
            L46:
                int r8 = r9.getActionIndex()
                int r0 = r9.getPointerId(r8)
                androidx.recyclerview.widget.t r1 = r7.f3595a
                int r2 = r1.f3579l
                if (r0 != r2) goto L9b
                if (r8 != 0) goto L57
                r4 = 1
            L57:
                int r0 = r9.getPointerId(r4)
                r1.f3579l = r0
                androidx.recyclerview.widget.t r0 = r7.f3595a
                int r1 = r0.f3582o
                r0.m2128s(r9, r1, r8)
                goto L9b
            L65:
                android.view.VelocityTracker r8 = r2.f3587t
                if (r8 == 0) goto L91
                r8.clear()
                goto L91
            L6d:
                if (r1 < 0) goto L9b
                int r8 = r2.f3582o
                r2.m2128s(r9, r8, r1)
                androidx.recyclerview.widget.t r8 = r7.f3595a
                r8.m2125p(r3)
                androidx.recyclerview.widget.t r8 = r7.f3595a
                androidx.recyclerview.widget.RecyclerView r9 = r8.f3585r
                java.lang.Runnable r8 = r8.f3586s
                r9.removeCallbacks(r8)
                androidx.recyclerview.widget.t r8 = r7.f3595a
                java.lang.Runnable r8 = r8.f3586s
                r8.run()
                androidx.recyclerview.widget.t r8 = r7.f3595a
                androidx.recyclerview.widget.RecyclerView r8 = r8.f3585r
                r8.invalidate()
                goto L9b
            L91:
                androidx.recyclerview.widget.t r8 = r7.f3595a
                r9 = 0
                r8.m2127r(r9, r4)
                androidx.recyclerview.widget.t r8 = r7.f3595a
                r8.f3579l = r0
            L9b:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0561q
        /* renamed from: e */
        public void mo1904e(boolean r3) {
                r2 = this;
                if (r3 != 0) goto L3
                return
            L3:
                androidx.recyclerview.widget.t r3 = r2.f3595a
                r0 = 0
                r1 = 0
                r3.m2127r(r0, r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$c */
    public class c extends androidx.recyclerview.widget.C0609t.f {

        /* renamed from: n */
        public final /* synthetic */ int f3596n;

        /* renamed from: o */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 f3597o;

        /* renamed from: p */
        public final /* synthetic */ androidx.recyclerview.widget.C0609t f3598p;

        public c(androidx.recyclerview.widget.C0609t r10, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r11, int r12, int r13, float r14, float r15, float r16, float r17, int r18, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r19) {
                r9 = this;
                r8 = r9
                r0 = r10
                r8.f3598p = r0
                r0 = r18
                r8.f3596n = r0
                r0 = r19
                r8.f3597o = r0
                r0 = r9
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        @Override // androidx.recyclerview.widget.C0609t.f, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r4) {
                r3 = this;
                boolean r4 = r3.f3615l
                r0 = 1
                if (r4 != 0) goto La
                androidx.recyclerview.widget.RecyclerView$b0 r4 = r3.f3608e
                r4.m1804u(r0)
            La:
                r3.f3615l = r0
                boolean r4 = r3.f3614k
                if (r4 == 0) goto L11
                return
            L11:
                int r4 = r3.f3596n
                if (r4 > 0) goto L21
                androidx.recyclerview.widget.t r4 = r3.f3598p
                androidx.recyclerview.widget.t$d r0 = r4.f3580m
                androidx.recyclerview.widget.RecyclerView r4 = r4.f3585r
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r3.f3597o
                r0.mo2130a(r4, r1)
                goto L3e
            L21:
                androidx.recyclerview.widget.t r4 = r3.f3598p
                java.util.List<android.view.View> r4 = r4.f3568a
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r3.f3597o
                android.view.View r1 = r1.f3208a
                r4.add(r1)
                r3.f3611h = r0
                int r4 = r3.f3596n
                if (r4 <= 0) goto L3e
                androidx.recyclerview.widget.t r0 = r3.f3598p
                androidx.recyclerview.widget.RecyclerView r1 = r0.f3585r
                androidx.recyclerview.widget.u r2 = new androidx.recyclerview.widget.u
                r2.<init>(r0, r3, r4)
                r1.post(r2)
            L3e:
                androidx.recyclerview.widget.t r4 = r3.f3598p
                android.view.View r0 = r4.f3590w
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r3.f3597o
                android.view.View r1 = r1.f3208a
                if (r0 != r1) goto L4b
                r4.m2126q(r1)
            L4b:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$d */
    public static abstract class d {

        /* renamed from: b */
        public static final android.view.animation.Interpolator f3599b = null;

        /* renamed from: c */
        public static final android.view.animation.Interpolator f3600c = null;

        /* renamed from: a */
        public int f3601a;

        /* renamed from: androidx.recyclerview.widget.t$d$a */
        public class a implements android.view.animation.Interpolator {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float r2) {
                    r1 = this;
                    float r0 = r2 * r2
                    float r0 = r0 * r2
                    float r0 = r0 * r2
                    float r0 = r0 * r2
                    return r0
            }
        }

        /* renamed from: androidx.recyclerview.widget.t$d$b */
        public class b implements android.view.animation.Interpolator {
            public b() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float r3) {
                    r2 = this;
                    r0 = 1065353216(0x3f800000, float:1.0)
                    float r3 = r3 - r0
                    float r1 = r3 * r3
                    float r1 = r1 * r3
                    float r1 = r1 * r3
                    float r1 = r1 * r3
                    float r1 = r1 + r0
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.t$d$a r0 = new androidx.recyclerview.widget.t$d$a
                r0.<init>()
                androidx.recyclerview.widget.C0609t.d.f3599b = r0
                androidx.recyclerview.widget.t$d$b r0 = new androidx.recyclerview.widget.t$d$b
                r0.<init>()
                androidx.recyclerview.widget.C0609t.d.f3600c = r0
                return
        }

        public d() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f3601a = r0
                return
        }

        /* renamed from: c */
        public static int m2129c(int r3, int r4) {
                r0 = 789516(0xc0c0c, float:1.106348E-39)
                r1 = r3 & r0
                if (r1 != 0) goto L8
                return r3
            L8:
                int r2 = ~r1
                r3 = r3 & r2
                if (r4 != 0) goto L10
                int r4 = r1 << 2
            Le:
                r3 = r3 | r4
                return r3
            L10:
                int r4 = r1 << 1
                r1 = -789517(0xfffffffffff3f3f3, float:NaN)
                r1 = r1 & r4
                r3 = r3 | r1
                r4 = r4 & r0
                int r4 = r4 << 2
                goto Le
        }

        /* renamed from: a */
        public void mo2130a(androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r4) {
                r2 = this;
                android.view.View r3 = r4.f3208a
                r4 = 2131362279(0x7f0a01e7, float:1.8344334E38)
                java.lang.Object r0 = r3.getTag(r4)
                boolean r1 = r0 instanceof java.lang.Float
                if (r1 == 0) goto L18
                java.lang.Float r0 = (java.lang.Float) r0
                float r0 = r0.floatValue()
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                p227n0.C4661t.h.m10614s(r3, r0)
            L18:
                r0 = 0
                r3.setTag(r4, r0)
                r4 = 0
                r3.setTranslationX(r4)
                r3.setTranslationY(r4)
                return
        }

        /* renamed from: b */
        public int m2131b(int r4, int r5) {
                r3 = this;
                r0 = 3158064(0x303030, float:4.42539E-39)
                r1 = r4 & r0
                if (r1 != 0) goto L8
                return r4
            L8:
                int r2 = ~r1
                r4 = r4 & r2
                if (r5 != 0) goto L10
                int r5 = r1 >> 2
            Le:
                r4 = r4 | r5
                return r4
            L10:
                int r5 = r1 >> 1
                r1 = -3158065(0xffffffffffcfcfcf, float:NaN)
                r1 = r1 & r5
                r4 = r4 | r1
                r5 = r5 & r0
                int r5 = r5 >> 2
                goto Le
        }

        /* renamed from: d */
        public final int m2132d(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3) {
                r1 = this;
                int r3 = r1.mo2133e(r2, r3)
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                int r2 = p227n0.C4661t.d.m10575d(r2)
                int r2 = r1.m2131b(r3, r2)
                return r2
        }

        /* renamed from: e */
        public abstract int mo2133e(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2);

        /* renamed from: f */
        public int m2134f(androidx.recyclerview.widget.RecyclerView r7, int r8, int r9, long r10) {
                r6 = this;
                int r0 = r6.f3601a
                r1 = -1
                if (r0 != r1) goto L12
                android.content.res.Resources r7 = r7.getResources()
                r0 = 2131165413(0x7f0700e5, float:1.7945042E38)
                int r7 = r7.getDimensionPixelSize(r0)
                r6.f3601a = r7
            L12:
                int r7 = r6.f3601a
                int r0 = java.lang.Math.abs(r9)
                float r2 = (float) r9
                float r2 = java.lang.Math.signum(r2)
                int r2 = (int) r2
                float r0 = (float) r0
                r3 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 * r3
                float r8 = (float) r8
                float r0 = r0 / r8
                float r8 = java.lang.Math.min(r3, r0)
                int r2 = r2 * r7
                float r7 = (float) r2
                android.view.animation.Interpolator r0 = androidx.recyclerview.widget.C0609t.d.f3600c
                androidx.recyclerview.widget.t$d$b r0 = (androidx.recyclerview.widget.C0609t.d.b) r0
                float r8 = r0.getInterpolation(r8)
                float r8 = r8 * r7
                int r7 = (int) r8
                r4 = 2000(0x7d0, double:9.88E-321)
                int r8 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r8 <= 0) goto L3e
                goto L43
            L3e:
                float r8 = (float) r10
                r10 = 1157234688(0x44fa0000, float:2000.0)
                float r3 = r8 / r10
            L43:
                float r7 = (float) r7
                android.view.animation.Interpolator r8 = androidx.recyclerview.widget.C0609t.d.f3599b
                androidx.recyclerview.widget.t$d$a r8 = (androidx.recyclerview.widget.C0609t.d.a) r8
                float r8 = r8.getInterpolation(r3)
                float r8 = r8 * r7
                int r7 = (int) r8
                if (r7 != 0) goto L55
                if (r9 <= 0) goto L54
                r1 = 1
            L54:
                return r1
            L55:
                return r7
        }

        /* renamed from: g */
        public void m2135g(android.graphics.Canvas r6, androidx.recyclerview.widget.RecyclerView r7, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r8, float r9, float r10, int r11, boolean r12) {
                r5 = this;
                android.view.View r6 = r8.f3208a
                if (r12 == 0) goto L3d
                r8 = 2131362279(0x7f0a01e7, float:1.8344334E38)
                java.lang.Object r11 = r6.getTag(r8)
                if (r11 != 0) goto L3d
                java.util.WeakHashMap<android.view.View, n0.w> r11 = p227n0.C4661t.f18570a
                float r11 = p227n0.C4661t.h.m10604i(r6)
                java.lang.Float r11 = java.lang.Float.valueOf(r11)
                r12 = 1065353216(0x3f800000, float:1.0)
                int r0 = r7.getChildCount()
                r1 = 0
                r2 = 0
            L1f:
                if (r2 >= r0) goto L36
                android.view.View r3 = r7.getChildAt(r2)
                if (r3 != r6) goto L28
                goto L33
            L28:
                java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
                float r3 = p227n0.C4661t.h.m10604i(r3)
                int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r4 <= 0) goto L33
                r1 = r3
            L33:
                int r2 = r2 + 1
                goto L1f
            L36:
                float r1 = r1 + r12
                p227n0.C4661t.h.m10614s(r6, r1)
                r6.setTag(r8, r11)
            L3d:
                r6.setTranslationX(r9)
                r6.setTranslationY(r10)
                return
        }

        /* renamed from: h */
        public abstract boolean mo2136h(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3);

        /* renamed from: i */
        public abstract void mo2137i(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1, int r2);

        /* renamed from: j */
        public abstract void mo2138j(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1, int r2);
    }

    /* renamed from: androidx.recyclerview.widget.t$e */
    public class e extends android.view.GestureDetector.SimpleOnGestureListener {

        /* renamed from: Y */
        public boolean f3602Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.recyclerview.widget.C0609t f3603Z;

        public e(androidx.recyclerview.widget.C0609t r1) {
                r0 = this;
                r0.f3603Z = r1
                r0.<init>()
                r1 = 1
                r0.f3602Y = r1
                return
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(android.view.MotionEvent r4) {
                r3 = this;
                boolean r0 = r3.f3602Y
                if (r0 != 0) goto L5
                return
            L5:
                androidx.recyclerview.widget.t r0 = r3.f3603Z
                android.view.View r0 = r0.m2123m(r4)
                if (r0 == 0) goto L59
                androidx.recyclerview.widget.t r1 = r3.f3603Z
                androidx.recyclerview.widget.RecyclerView r1 = r1.f3585r
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r1.m1733J(r0)
                if (r0 == 0) goto L59
                androidx.recyclerview.widget.t r1 = r3.f3603Z
                androidx.recyclerview.widget.t$d r2 = r1.f3580m
                androidx.recyclerview.widget.RecyclerView r1 = r1.f3585r
                int r1 = r2.m2132d(r1, r0)
                r2 = 16711680(0xff0000, float:2.3418052E-38)
                r1 = r1 & r2
                r2 = 0
                if (r1 == 0) goto L29
                r1 = 1
                goto L2a
            L29:
                r1 = 0
            L2a:
                if (r1 != 0) goto L2d
                return
            L2d:
                int r1 = r4.getPointerId(r2)
                androidx.recyclerview.widget.t r2 = r3.f3603Z
                int r2 = r2.f3579l
                if (r1 != r2) goto L59
                int r1 = r4.findPointerIndex(r2)
                float r2 = r4.getX(r1)
                float r4 = r4.getY(r1)
                androidx.recyclerview.widget.t r1 = r3.f3603Z
                r1.f3571d = r2
                r1.f3572e = r4
                r4 = 0
                r1.f3576i = r4
                r1.f3575h = r4
                androidx.recyclerview.widget.t$d r4 = r1.f3580m
                java.util.Objects.requireNonNull(r4)
                androidx.recyclerview.widget.t r4 = r3.f3603Z
                r1 = 2
                r4.m2127r(r0, r1)
            L59:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$f */
    public static class f implements android.animation.Animator.AnimatorListener {

        /* renamed from: a */
        public final float f3604a;

        /* renamed from: b */
        public final float f3605b;

        /* renamed from: c */
        public final float f3606c;

        /* renamed from: d */
        public final float f3607d;

        /* renamed from: e */
        public final androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 f3608e;

        /* renamed from: f */
        public final int f3609f;

        /* renamed from: g */
        public final android.animation.ValueAnimator f3610g;

        /* renamed from: h */
        public boolean f3611h;

        /* renamed from: i */
        public float f3612i;

        /* renamed from: j */
        public float f3613j;

        /* renamed from: k */
        public boolean f3614k;

        /* renamed from: l */
        public boolean f3615l;

        /* renamed from: m */
        public float f3616m;

        /* renamed from: androidx.recyclerview.widget.t$f$a */
        public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ androidx.recyclerview.widget.C0609t.f f3617a;

            public a(androidx.recyclerview.widget.C0609t.f r1) {
                    r0 = this;
                    r0.f3617a = r1
                    r0.<init>()
                    return
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                    r1 = this;
                    androidx.recyclerview.widget.t$f r0 = r1.f3617a
                    float r2 = r2.getAnimatedFraction()
                    r0.f3616m = r2
                    return
            }
        }

        public f(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1, int r2, int r3, float r4, float r5, float r6, float r7) {
                r0 = this;
                r0.<init>()
                r2 = 0
                r0.f3614k = r2
                r0.f3615l = r2
                r0.f3609f = r3
                r0.f3608e = r1
                r0.f3604a = r4
                r0.f3605b = r5
                r0.f3606c = r6
                r0.f3607d = r7
                r2 = 2
                float[] r2 = new float[r2]
                r2 = {x0034: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
                r0.f3610g = r2
                androidx.recyclerview.widget.t$f$a r3 = new androidx.recyclerview.widget.t$f$a
                r3.<init>(r0)
                r2.addUpdateListener(r3)
                android.view.View r1 = r1.f3208a
                r2.setTarget(r1)
                r2.addListener(r0)
                r1 = 0
                r0.f3616m = r1
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.f3616m = r1
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f3615l
                r0 = 1
                if (r2 != 0) goto La
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.f3608e
                r2.m1804u(r0)
            La:
                r1.f3615l = r0
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$g */
    public static abstract class g extends androidx.recyclerview.widget.C0609t.d {

        /* renamed from: d */
        public int f3618d;

        /* renamed from: e */
        public int f3619e;

        public g(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f3618d = r2
                r0.f3619e = r1
                return
        }

        @Override // androidx.recyclerview.widget.C0609t.d
        /* renamed from: e */
        public int mo2133e(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3) {
                r1 = this;
                int r2 = r1.f3619e
                int r3 = r1.f3618d
                r0 = r3 | r2
                int r0 = r0 << 0
                int r3 = r3 << 8
                r3 = r3 | r0
                int r2 = r2 << 16
                r2 = r2 | r3
                return r2
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$h */
    public interface h {
        /* renamed from: b */
        void mo1679b(android.view.View r1, android.view.View r2, int r3, int r4);
    }

    public C0609t(androidx.recyclerview.widget.C0609t.d r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f3568a = r0
            r0 = 2
            float[] r0 = new float[r0]
            r2.f3569b = r0
            r0 = 0
            r2.f3570c = r0
            r1 = -1
            r2.f3579l = r1
            r1 = 0
            r2.f3581n = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f3583p = r1
            androidx.recyclerview.widget.t$a r1 = new androidx.recyclerview.widget.t$a
            r1.<init>(r2)
            r2.f3586s = r1
            r2.f3590w = r0
            androidx.recyclerview.widget.t$b r0 = new androidx.recyclerview.widget.t$b
            r0.<init>(r2)
            r2.f3593z = r0
            r2.f3580m = r3
            return
    }

    /* renamed from: o */
    public static boolean m2118o(android.view.View r1, float r2, float r3, float r4, float r5) {
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L1e
            int r0 = r1.getWidth()
            float r0 = (float) r0
            float r4 = r4 + r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L1e
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L1e
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r5 = r5 + r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0559o
    /* renamed from: b */
    public void mo1900b(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0559o
    /* renamed from: d */
    public void mo1901d(android.view.View r3) {
            r2 = this;
            r2.m2126q(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r2.f3585r
            androidx.recyclerview.widget.RecyclerView$b0 r3 = r0.m1733J(r3)
            if (r3 != 0) goto Lc
            return
        Lc:
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r2.f3570c
            r1 = 0
            if (r0 == 0) goto L18
            if (r3 != r0) goto L18
            r3 = 0
            r2.m2127r(r3, r1)
            goto L2c
        L18:
            r2.m2122l(r3, r1)
            java.util.List<android.view.View> r0 = r2.f3568a
            android.view.View r1 = r3.f3208a
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L2c
            androidx.recyclerview.widget.t$d r0 = r2.f3580m
            androidx.recyclerview.widget.RecyclerView r1 = r2.f3585r
            r0.mo2130a(r1, r3)
        L2c:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0556l
    /* renamed from: f */
    public void mo1839f(android.graphics.Rect r1, android.view.View r2, androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.C0569y r4) {
            r0 = this;
            r1.setEmpty()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0556l
    /* renamed from: g */
    public void mo1840g(android.graphics.Canvas r21, androidx.recyclerview.widget.RecyclerView r22, androidx.recyclerview.widget.RecyclerView.C0569y r23) {
            r20 = this;
            r0 = r20
            r9 = r21
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r0.f3570c
            r2 = 0
            if (r1 == 0) goto L18
            float[] r1 = r0.f3569b
            r0.m2124n(r1)
            float[] r1 = r0.f3569b
            r2 = r1[r2]
            r3 = 1
            r1 = r1[r3]
            r11 = r1
            r10 = r2
            goto L1c
        L18:
            r1 = 0
            r2 = 0
            r10 = 0
            r11 = 0
        L1c:
            androidx.recyclerview.widget.t$d r12 = r0.f3580m
            androidx.recyclerview.widget.RecyclerView$b0 r13 = r0.f3570c
            java.util.List<androidx.recyclerview.widget.t$f> r14 = r0.f3583p
            int r15 = r0.f3581n
            java.util.Objects.requireNonNull(r12)
            int r8 = r14.size()
            r1 = 0
            r7 = 0
        L2d:
            if (r7 >= r8) goto L97
            java.lang.Object r1 = r14.get(r7)
            androidx.recyclerview.widget.t$f r1 = (androidx.recyclerview.widget.C0609t.f) r1
            float r2 = r1.f3604a
            float r3 = r1.f3606c
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 != 0) goto L46
            androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.f3608e
            android.view.View r2 = r2.f3208a
            float r2 = r2.getTranslationX()
            goto L4c
        L46:
            float r4 = r1.f3616m
            float r2 = p346u.C6268m.m12887a(r3, r2, r4, r2)
        L4c:
            r1.f3612i = r2
            float r2 = r1.f3605b
            float r3 = r1.f3607d
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 != 0) goto L5f
            androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.f3608e
            android.view.View r2 = r2.f3208a
            float r2 = r2.getTranslationY()
            goto L65
        L5f:
            float r4 = r1.f3616m
            float r2 = p346u.C6268m.m12887a(r3, r2, r4, r2)
        L65:
            r1.f3613j = r2
            int r6 = r21.save()
            androidx.recyclerview.widget.RecyclerView$b0 r4 = r1.f3608e
            float r5 = r1.f3612i
            float r3 = r1.f3613j
            int r2 = r1.f3609f
            r16 = 0
            r1 = r12
            r17 = r2
            r2 = r21
            r18 = r3
            r3 = r22
            r19 = r6
            r6 = r18
            r18 = r7
            r7 = r17
            r17 = r8
            r8 = r16
            r1.m2135g(r2, r3, r4, r5, r6, r7, r8)
            r1 = r19
            r9.restoreToCount(r1)
            int r7 = r18 + 1
            r8 = r17
            goto L2d
        L97:
            if (r13 == 0) goto Lad
            int r14 = r21.save()
            r8 = 1
            r1 = r12
            r2 = r21
            r3 = r22
            r4 = r13
            r5 = r10
            r6 = r11
            r7 = r15
            r1.m2135g(r2, r3, r4, r5, r6, r7, r8)
            r9.restoreToCount(r14)
        Lad:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0556l
    /* renamed from: h */
    public void mo1841h(android.graphics.Canvas r8, androidx.recyclerview.widget.RecyclerView r9, androidx.recyclerview.widget.RecyclerView.C0569y r10) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$b0 r10 = r7.f3570c
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L11
            float[] r10 = r7.f3569b
            r7.m2124n(r10)
            float[] r10 = r7.f3569b
            r2 = r10[r0]
            r10 = r10[r1]
        L11:
            androidx.recyclerview.widget.t$d r10 = r7.f3580m
            androidx.recyclerview.widget.RecyclerView$b0 r2 = r7.f3570c
            java.util.List<androidx.recyclerview.widget.t$f> r3 = r7.f3583p
            java.util.Objects.requireNonNull(r10)
            int r10 = r3.size()
            r4 = 0
        L1f:
            if (r4 >= r10) goto L35
            java.lang.Object r5 = r3.get(r4)
            androidx.recyclerview.widget.t$f r5 = (androidx.recyclerview.widget.C0609t.f) r5
            int r6 = r8.save()
            androidx.recyclerview.widget.RecyclerView$b0 r5 = r5.f3608e
            android.view.View r5 = r5.f3208a
            r8.restoreToCount(r6)
            int r4 = r4 + 1
            goto L1f
        L35:
            if (r2 == 0) goto L3e
            int r2 = r8.save()
            r8.restoreToCount(r2)
        L3e:
            int r10 = r10 - r1
        L3f:
            if (r10 < 0) goto L59
            java.lang.Object r8 = r3.get(r10)
            androidx.recyclerview.widget.t$f r8 = (androidx.recyclerview.widget.C0609t.f) r8
            boolean r2 = r8.f3615l
            if (r2 == 0) goto L53
            boolean r8 = r8.f3611h
            if (r8 != 0) goto L53
            r3.remove(r10)
            goto L56
        L53:
            if (r2 != 0) goto L56
            r0 = 1
        L56:
            int r10 = r10 + (-1)
            goto L3f
        L59:
            if (r0 == 0) goto L5e
            r9.invalidate()
        L5e:
            return
    }

    /* renamed from: i */
    public final int m2119i(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r8, int r9) {
            r7 = this;
            r8 = r9 & 12
            if (r8 == 0) goto L79
            float r8 = r7.f3575h
            r0 = 0
            r1 = 4
            r2 = 8
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L11
            r8 = 8
            goto L12
        L11:
            r8 = 4
        L12:
            android.view.VelocityTracker r3 = r7.f3587t
            if (r3 == 0) goto L5b
            int r4 = r7.f3579l
            r5 = -1
            if (r4 <= r5) goto L5b
            r4 = 1000(0x3e8, float:1.401E-42)
            androidx.recyclerview.widget.t$d r5 = r7.f3580m
            float r6 = r7.f3574g
            java.util.Objects.requireNonNull(r5)
            r3.computeCurrentVelocity(r4, r6)
            android.view.VelocityTracker r3 = r7.f3587t
            int r4 = r7.f3579l
            float r3 = r3.getXVelocity(r4)
            android.view.VelocityTracker r4 = r7.f3587t
            int r5 = r7.f3579l
            float r4 = r4.getYVelocity(r5)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3d
            r1 = 8
        L3d:
            float r0 = java.lang.Math.abs(r3)
            r2 = r1 & r9
            if (r2 == 0) goto L5b
            if (r8 != r1) goto L5b
            androidx.recyclerview.widget.t$d r2 = r7.f3580m
            float r3 = r7.f3573f
            java.util.Objects.requireNonNull(r2)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L5b
            float r2 = java.lang.Math.abs(r4)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5b
            return r1
        L5b:
            androidx.recyclerview.widget.RecyclerView r0 = r7.f3585r
            int r0 = r0.getWidth()
            float r0 = (float) r0
            androidx.recyclerview.widget.t$d r1 = r7.f3580m
            java.util.Objects.requireNonNull(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            r9 = r9 & r8
            if (r9 == 0) goto L79
            float r9 = r7.f3575h
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L79
            return r8
        L79:
            r8 = 0
            return r8
    }

    /* renamed from: j */
    public void m2120j(int r9, android.view.MotionEvent r10, int r11) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r8.f3570c
            if (r0 != 0) goto Ldc
            r0 = 2
            if (r9 != r0) goto Ldc
            int r9 = r8.f3581n
            if (r9 == r0) goto Ldc
            androidx.recyclerview.widget.t$d r9 = r8.f3580m
            java.util.Objects.requireNonNull(r9)
            androidx.recyclerview.widget.RecyclerView r9 = r8.f3585r
            int r9 = r9.getScrollState()
            r1 = 1
            if (r9 != r1) goto L1a
            return
        L1a:
            androidx.recyclerview.widget.RecyclerView r9 = r8.f3585r
            androidx.recyclerview.widget.RecyclerView$m r9 = r9.getLayoutManager()
            int r2 = r8.f3579l
            r3 = 0
            r4 = -1
            if (r2 != r4) goto L27
            goto L70
        L27:
            int r2 = r10.findPointerIndex(r2)
            float r4 = r10.getX(r2)
            float r5 = r8.f3571d
            float r4 = r4 - r5
            float r2 = r10.getY(r2)
            float r5 = r8.f3572e
            float r2 = r2 - r5
            float r4 = java.lang.Math.abs(r4)
            float r2 = java.lang.Math.abs(r2)
            int r5 = r8.f3584q
            float r5 = (float) r5
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L4d
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4d
            goto L70
        L4d:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L58
            boolean r5 = r9.mo1687g()
            if (r5 == 0) goto L58
            goto L70
        L58:
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L63
            boolean r9 = r9.mo1689h()
            if (r9 == 0) goto L63
            goto L70
        L63:
            android.view.View r9 = r8.m2123m(r10)
            if (r9 != 0) goto L6a
            goto L70
        L6a:
            androidx.recyclerview.widget.RecyclerView r2 = r8.f3585r
            androidx.recyclerview.widget.RecyclerView$b0 r3 = r2.m1733J(r9)
        L70:
            if (r3 != 0) goto L73
            return
        L73:
            androidx.recyclerview.widget.t$d r9 = r8.f3580m
            androidx.recyclerview.widget.RecyclerView r2 = r8.f3585r
            int r9 = r9.m2132d(r2, r3)
            r2 = 65280(0xff00, float:9.1477E-41)
            r9 = r9 & r2
            int r9 = r9 >> 8
            if (r9 != 0) goto L84
            return
        L84:
            float r2 = r10.getX(r11)
            float r11 = r10.getY(r11)
            float r4 = r8.f3571d
            float r2 = r2 - r4
            float r4 = r8.f3572e
            float r11 = r11 - r4
            float r4 = java.lang.Math.abs(r2)
            float r5 = java.lang.Math.abs(r11)
            int r6 = r8.f3584q
            float r6 = (float) r6
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 >= 0) goto La6
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto La6
            return
        La6:
            r6 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lbd
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto Lb4
            r11 = r9 & 4
            if (r11 != 0) goto Lb4
            return
        Lb4:
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 <= 0) goto Lce
            r9 = r9 & 8
            if (r9 != 0) goto Lce
            return
        Lbd:
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 >= 0) goto Lc6
            r2 = r9 & 1
            if (r2 != 0) goto Lc6
            return
        Lc6:
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 <= 0) goto Lce
            r9 = r9 & r0
            if (r9 != 0) goto Lce
            return
        Lce:
            r8.f3576i = r6
            r8.f3575h = r6
            r9 = 0
            int r9 = r10.getPointerId(r9)
            r8.f3579l = r9
            r8.m2127r(r3, r1)
        Ldc:
            return
    }

    /* renamed from: k */
    public final int m2121k(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r8, int r9) {
            r7 = this;
            r8 = r9 & 3
            if (r8 == 0) goto L76
            float r8 = r7.f3576i
            r0 = 0
            r1 = 1
            r2 = 2
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto Lf
            r8 = 2
            goto L10
        Lf:
            r8 = 1
        L10:
            android.view.VelocityTracker r3 = r7.f3587t
            if (r3 == 0) goto L58
            int r4 = r7.f3579l
            r5 = -1
            if (r4 <= r5) goto L58
            r4 = 1000(0x3e8, float:1.401E-42)
            androidx.recyclerview.widget.t$d r5 = r7.f3580m
            float r6 = r7.f3574g
            java.util.Objects.requireNonNull(r5)
            r3.computeCurrentVelocity(r4, r6)
            android.view.VelocityTracker r3 = r7.f3587t
            int r4 = r7.f3579l
            float r3 = r3.getXVelocity(r4)
            android.view.VelocityTracker r4 = r7.f3587t
            int r5 = r7.f3579l
            float r4 = r4.getYVelocity(r5)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r1 = 2
        L3a:
            float r0 = java.lang.Math.abs(r4)
            r2 = r1 & r9
            if (r2 == 0) goto L58
            if (r1 != r8) goto L58
            androidx.recyclerview.widget.t$d r2 = r7.f3580m
            float r4 = r7.f3573f
            java.util.Objects.requireNonNull(r2)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L58
            float r2 = java.lang.Math.abs(r3)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L58
            return r1
        L58:
            androidx.recyclerview.widget.RecyclerView r0 = r7.f3585r
            int r0 = r0.getHeight()
            float r0 = (float) r0
            androidx.recyclerview.widget.t$d r1 = r7.f3580m
            java.util.Objects.requireNonNull(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            r9 = r9 & r8
            if (r9 == 0) goto L76
            float r9 = r7.f3576i
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L76
            return r8
        L76:
            r8 = 0
            return r8
    }

    /* renamed from: l */
    public void m2122l(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r4, boolean r5) {
            r3 = this;
            java.util.List<androidx.recyclerview.widget.t$f> r0 = r3.f3583p
            int r0 = r0.size()
        L6:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L29
            java.util.List<androidx.recyclerview.widget.t$f> r1 = r3.f3583p
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.t$f r1 = (androidx.recyclerview.widget.C0609t.f) r1
            androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.f3608e
            if (r2 != r4) goto L6
            boolean r4 = r1.f3614k
            r4 = r4 | r5
            r1.f3614k = r4
            boolean r4 = r1.f3615l
            if (r4 != 0) goto L24
            android.animation.ValueAnimator r4 = r1.f3610g
            r4.cancel()
        L24:
            java.util.List<androidx.recyclerview.widget.t$f> r4 = r3.f3583p
            r4.remove(r0)
        L29:
            return
    }

    /* renamed from: m */
    public android.view.View m2123m(android.view.MotionEvent r8) {
            r7 = this;
            float r0 = r8.getX()
            float r8 = r8.getY()
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r7.f3570c
            if (r1 == 0) goto L1f
            android.view.View r1 = r1.f3208a
            float r2 = r7.f3577j
            float r3 = r7.f3575h
            float r2 = r2 + r3
            float r3 = r7.f3578k
            float r4 = r7.f3576i
            float r3 = r3 + r4
            boolean r2 = m2118o(r1, r0, r8, r2, r3)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            java.util.List<androidx.recyclerview.widget.t$f> r1 = r7.f3583p
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L27:
            if (r1 < 0) goto L43
            java.util.List<androidx.recyclerview.widget.t$f> r2 = r7.f3583p
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.t$f r2 = (androidx.recyclerview.widget.C0609t.f) r2
            androidx.recyclerview.widget.RecyclerView$b0 r3 = r2.f3608e
            android.view.View r3 = r3.f3208a
            float r4 = r2.f3612i
            float r2 = r2.f3613j
            boolean r2 = m2118o(r3, r0, r8, r4, r2)
            if (r2 == 0) goto L40
            return r3
        L40:
            int r1 = r1 + (-1)
            goto L27
        L43:
            androidx.recyclerview.widget.RecyclerView r1 = r7.f3585r
            androidx.recyclerview.widget.h r2 = r1.f3156e0
            int r2 = r2.m2046e()
        L4b:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L86
            androidx.recyclerview.widget.h r3 = r1.f3156e0
            android.view.View r3 = r3.m2045d(r2)
            float r4 = r3.getTranslationX()
            float r5 = r3.getTranslationY()
            int r6 = r3.getLeft()
            float r6 = (float) r6
            float r6 = r6 + r4
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L4b
            int r6 = r3.getRight()
            float r6 = (float) r6
            float r6 = r6 + r4
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 > 0) goto L4b
            int r4 = r3.getTop()
            float r4 = (float) r4
            float r4 = r4 + r5
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 < 0) goto L4b
            int r4 = r3.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r5
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 > 0) goto L4b
            goto L87
        L86:
            r3 = 0
        L87:
            return r3
    }

    /* renamed from: n */
    public final void m2124n(float[] r4) {
            r3 = this;
            int r0 = r3.f3582o
            r0 = r0 & 12
            r1 = 0
            if (r0 == 0) goto L19
            float r0 = r3.f3577j
            float r2 = r3.f3575h
            float r0 = r0 + r2
            androidx.recyclerview.widget.RecyclerView$b0 r2 = r3.f3570c
            android.view.View r2 = r2.f3208a
            int r2 = r2.getLeft()
            float r2 = (float) r2
            float r0 = r0 - r2
            r4[r1] = r0
            goto L23
        L19:
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r3.f3570c
            android.view.View r0 = r0.f3208a
            float r0 = r0.getTranslationX()
            r4[r1] = r0
        L23:
            int r0 = r3.f3582o
            r0 = r0 & 3
            r1 = 1
            if (r0 == 0) goto L3c
            float r0 = r3.f3578k
            float r2 = r3.f3576i
            float r0 = r0 + r2
            androidx.recyclerview.widget.RecyclerView$b0 r2 = r3.f3570c
            android.view.View r2 = r2.f3208a
            int r2 = r2.getTop()
            float r2 = (float) r2
            float r0 = r0 - r2
            r4[r1] = r0
            goto L46
        L3c:
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r3.f3570c
            android.view.View r0 = r0.f3208a
            float r0 = r0.getTranslationY()
            r4[r1] = r0
        L46:
            return
    }

    /* renamed from: p */
    public void m2125p(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            androidx.recyclerview.widget.RecyclerView r2 = r0.f3585r
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto Ld
            return
        Ld:
            int r2 = r0.f3581n
            r3 = 2
            if (r2 == r3) goto L13
            return
        L13:
            androidx.recyclerview.widget.t$d r2 = r0.f3580m
            java.util.Objects.requireNonNull(r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r4 = r0.f3577j
            float r5 = r0.f3575h
            float r4 = r4 + r5
            int r4 = (int) r4
            float r5 = r0.f3578k
            float r6 = r0.f3576i
            float r5 = r5 + r6
            int r5 = (int) r5
            android.view.View r6 = r1.f3208a
            int r6 = r6.getTop()
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            float r6 = (float) r6
            android.view.View r7 = r1.f3208a
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r7 = r7 * r2
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L5b
            android.view.View r6 = r1.f3208a
            int r6 = r6.getLeft()
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            float r6 = (float) r6
            android.view.View r7 = r1.f3208a
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r2
            int r2 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r2 >= 0) goto L5b
            return
        L5b:
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r2 = r0.f3588u
            if (r2 != 0) goto L6e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f3588u = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f3589v = r2
            goto L76
        L6e:
            r2.clear()
            java.util.List<java.lang.Integer> r2 = r0.f3589v
            r2.clear()
        L76:
            androidx.recyclerview.widget.t$d r2 = r0.f3580m
            java.util.Objects.requireNonNull(r2)
            float r2 = r0.f3577j
            float r6 = r0.f3575h
            float r2 = r2 + r6
            int r2 = java.lang.Math.round(r2)
            r6 = 0
            int r2 = r2 - r6
            float r7 = r0.f3578k
            float r8 = r0.f3576i
            float r7 = r7 + r8
            int r7 = java.lang.Math.round(r7)
            int r7 = r7 - r6
            android.view.View r8 = r1.f3208a
            int r8 = r8.getWidth()
            int r8 = r8 + r2
            int r8 = r8 + r6
            android.view.View r9 = r1.f3208a
            int r9 = r9.getHeight()
            int r9 = r9 + r7
            int r9 = r9 + r6
            int r10 = r2 + r8
            int r10 = r10 / r3
            int r11 = r7 + r9
            int r11 = r11 / r3
            androidx.recyclerview.widget.RecyclerView r12 = r0.f3585r
            androidx.recyclerview.widget.RecyclerView$m r12 = r12.getLayoutManager()
            int r13 = r12.m1891z()
            r14 = 0
        Lb1:
            if (r14 >= r13) goto L14d
            android.view.View r15 = r12.m1889y(r14)
            android.view.View r6 = r1.f3208a
            if (r15 != r6) goto Lbd
            goto L13f
        Lbd:
            int r6 = r15.getBottom()
            if (r6 < r7) goto L13f
            int r6 = r15.getTop()
            if (r6 > r9) goto L13f
            int r6 = r15.getRight()
            if (r6 < r2) goto L13f
            int r6 = r15.getLeft()
            if (r6 <= r8) goto Ld6
            goto L13f
        Ld6:
            androidx.recyclerview.widget.RecyclerView r6 = r0.f3585r
            androidx.recyclerview.widget.RecyclerView$b0 r6 = r6.m1733J(r15)
            androidx.recyclerview.widget.t$d r3 = r0.f3580m
            java.util.Objects.requireNonNull(r3)
            int r3 = r15.getLeft()
            int r18 = r15.getRight()
            int r18 = r18 + r3
            r3 = 2
            int r18 = r18 / 2
            int r17 = r10 - r18
            int r17 = java.lang.Math.abs(r17)
            int r18 = r15.getTop()
            int r15 = r15.getBottom()
            int r15 = r15 + r18
            int r15 = r15 / r3
            int r15 = r11 - r15
            int r15 = java.lang.Math.abs(r15)
            int r17 = r17 * r17
            int r15 = r15 * r15
            int r15 = r15 + r17
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r3 = r0.f3588u
            int r3 = r3.size()
            r18 = r2
            r19 = r7
            r2 = 0
            r7 = 0
        L117:
            if (r2 >= r3) goto L130
            r20 = r3
            java.util.List<java.lang.Integer> r3 = r0.f3589v
            java.lang.Object r3 = r3.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r15 <= r3) goto L130
            int r7 = r7 + 1
            int r2 = r2 + 1
            r3 = r20
            goto L117
        L130:
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r2 = r0.f3588u
            r2.add(r7, r6)
            java.util.List<java.lang.Integer> r2 = r0.f3589v
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r2.add(r7, r3)
            goto L143
        L13f:
            r18 = r2
            r19 = r7
        L143:
            int r14 = r14 + 1
            r2 = r18
            r7 = r19
            r3 = 2
            r6 = 0
            goto Lb1
        L14d:
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r2 = r0.f3588u
            int r3 = r2.size()
            if (r3 != 0) goto L156
            return
        L156:
            androidx.recyclerview.widget.t$d r3 = r0.f3580m
            java.util.Objects.requireNonNull(r3)
            android.view.View r3 = r1.f3208a
            int r3 = r3.getWidth()
            int r3 = r3 + r4
            android.view.View r6 = r1.f3208a
            int r6 = r6.getHeight()
            int r6 = r6 + r5
            android.view.View r7 = r1.f3208a
            int r7 = r7.getLeft()
            int r7 = r4 - r7
            android.view.View r8 = r1.f3208a
            int r8 = r8.getTop()
            int r8 = r5 - r8
            int r9 = r2.size()
            r10 = 0
            r11 = -1
            r11 = r10
            r10 = 0
            r12 = -1
        L182:
            if (r10 >= r9) goto L219
            java.lang.Object r13 = r2.get(r10)
            androidx.recyclerview.widget.RecyclerView$b0 r13 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r13
            if (r7 <= 0) goto L1ae
            android.view.View r14 = r13.f3208a
            int r14 = r14.getRight()
            int r14 = r14 - r3
            if (r14 >= 0) goto L1ae
            android.view.View r15 = r13.f3208a
            int r15 = r15.getRight()
            r16 = r2
            android.view.View r2 = r1.f3208a
            int r2 = r2.getRight()
            if (r15 <= r2) goto L1b0
            int r2 = java.lang.Math.abs(r14)
            if (r2 <= r12) goto L1b0
            r12 = r2
            r11 = r13
            goto L1b0
        L1ae:
            r16 = r2
        L1b0:
            if (r7 >= 0) goto L1d1
            android.view.View r2 = r13.f3208a
            int r2 = r2.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L1d1
            android.view.View r14 = r13.f3208a
            int r14 = r14.getLeft()
            android.view.View r15 = r1.f3208a
            int r15 = r15.getLeft()
            if (r14 >= r15) goto L1d1
            int r2 = java.lang.Math.abs(r2)
            if (r2 <= r12) goto L1d1
            r12 = r2
            r11 = r13
        L1d1:
            if (r8 >= 0) goto L1f2
            android.view.View r2 = r13.f3208a
            int r2 = r2.getTop()
            int r2 = r2 - r5
            if (r2 <= 0) goto L1f2
            android.view.View r14 = r13.f3208a
            int r14 = r14.getTop()
            android.view.View r15 = r1.f3208a
            int r15 = r15.getTop()
            if (r14 >= r15) goto L1f2
            int r2 = java.lang.Math.abs(r2)
            if (r2 <= r12) goto L1f2
            r12 = r2
            r11 = r13
        L1f2:
            if (r8 <= 0) goto L213
            android.view.View r2 = r13.f3208a
            int r2 = r2.getBottom()
            int r2 = r2 - r6
            if (r2 >= 0) goto L213
            android.view.View r14 = r13.f3208a
            int r14 = r14.getBottom()
            android.view.View r15 = r1.f3208a
            int r15 = r15.getBottom()
            if (r14 <= r15) goto L213
            int r2 = java.lang.Math.abs(r2)
            if (r2 <= r12) goto L213
            r12 = r2
            r11 = r13
        L213:
            int r10 = r10 + 1
            r2 = r16
            goto L182
        L219:
            if (r11 != 0) goto L226
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r1 = r0.f3588u
            r1.clear()
            java.util.List<java.lang.Integer> r1 = r0.f3589v
            r1.clear()
            return
        L226:
            int r2 = r11.m1788e()
            r22.m1788e()
            androidx.recyclerview.widget.t$d r3 = r0.f3580m
            androidx.recyclerview.widget.RecyclerView r6 = r0.f3585r
            boolean r3 = r3.mo2136h(r6, r1, r11)
            if (r3 == 0) goto L2a2
            androidx.recyclerview.widget.t$d r3 = r0.f3580m
            androidx.recyclerview.widget.RecyclerView r6 = r0.f3585r
            java.util.Objects.requireNonNull(r3)
            androidx.recyclerview.widget.RecyclerView$m r3 = r6.getLayoutManager()
            boolean r7 = r3 instanceof androidx.recyclerview.widget.C0609t.h
            if (r7 == 0) goto L250
            androidx.recyclerview.widget.t$h r3 = (androidx.recyclerview.widget.C0609t.h) r3
            android.view.View r1 = r1.f3208a
            android.view.View r2 = r11.f3208a
            r3.mo1679b(r1, r2, r4, r5)
            goto L2a2
        L250:
            boolean r1 = r3.mo1687g()
            if (r1 == 0) goto L279
            android.view.View r1 = r11.f3208a
            int r1 = r3.m1848D(r1)
            int r4 = r6.getPaddingLeft()
            if (r1 > r4) goto L265
            r6.m1755g0(r2)
        L265:
            android.view.View r1 = r11.f3208a
            int r1 = r3.m1853G(r1)
            int r4 = r6.getWidth()
            int r5 = r6.getPaddingRight()
            int r4 = r4 - r5
            if (r1 < r4) goto L279
            r6.m1755g0(r2)
        L279:
            boolean r1 = r3.mo1689h()
            if (r1 == 0) goto L2a2
            android.view.View r1 = r11.f3208a
            int r1 = r3.m1855H(r1)
            int r4 = r6.getPaddingTop()
            if (r1 > r4) goto L28e
            r6.m1755g0(r2)
        L28e:
            android.view.View r1 = r11.f3208a
            int r1 = r3.m1846C(r1)
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r1 < r3) goto L2a2
            r6.m1755g0(r2)
        L2a2:
            return
    }

    /* renamed from: q */
    public void m2126q(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.f3590w
            if (r2 != r0) goto L7
            r2 = 0
            r1.f3590w = r2
        L7:
            return
    }

    /* renamed from: r */
    public void m2127r(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r22, int r23) {
            r21 = this;
            r11 = r21
            r12 = r22
            r13 = r23
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r11.f3570c
            if (r12 != r0) goto Lf
            int r0 = r11.f3581n
            if (r13 != r0) goto Lf
            return
        Lf:
            r0 = -9223372036854775808
            r11.f3567B = r0
            int r4 = r11.f3581n
            r14 = 1
            r11.m2122l(r12, r14)
            r11.f3581n = r13
            r15 = 2
            if (r13 != r15) goto L2d
            if (r12 == 0) goto L25
            android.view.View r0 = r12.f3208a
            r11.f3590w = r0
            goto L2d
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L2d:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + (-1)
            androidx.recyclerview.widget.RecyclerView$b0 r9 = r11.f3570c
            r8 = 0
            if (r9 == 0) goto L16c
            android.view.View r0 = r9.f3208a
            android.view.ViewParent r0 = r0.getParent()
            r7 = 0
            if (r0 == 0) goto L158
            if (r4 != r15) goto L48
            r6 = 0
            goto Lab
        L48:
            int r0 = r11.f3581n
            if (r0 != r15) goto L4d
            goto La9
        L4d:
            androidx.recyclerview.widget.t$d r0 = r11.f3580m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f3585r
            int r0 = r0.mo2133e(r1, r9)
            androidx.recyclerview.widget.t$d r1 = r11.f3580m
            androidx.recyclerview.widget.RecyclerView r2 = r11.f3585r
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            int r2 = p227n0.C4661t.d.m10575d(r2)
            int r1 = r1.m2131b(r0, r2)
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 >> r10
            if (r1 != 0) goto L6b
            goto La9
        L6b:
            r0 = r0 & r2
            int r0 = r0 >> r10
            float r2 = r11.f3575h
            float r2 = java.lang.Math.abs(r2)
            float r3 = r11.f3576i
            float r3 = java.lang.Math.abs(r3)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L98
            int r2 = r11.m2119i(r9, r1)
            if (r2 <= 0) goto L91
            r0 = r0 & r2
            if (r0 != 0) goto Laa
        L86:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3585r
            int r0 = p227n0.C4661t.d.m10575d(r0)
            int r2 = androidx.recyclerview.widget.C0609t.d.m2129c(r2, r0)
            goto Laa
        L91:
            int r2 = r11.m2121k(r9, r1)
            if (r2 <= 0) goto La9
            goto Laa
        L98:
            int r2 = r11.m2121k(r9, r1)
            if (r2 <= 0) goto L9f
            goto Laa
        L9f:
            int r2 = r11.m2119i(r9, r1)
            if (r2 <= 0) goto La9
            r0 = r0 & r2
            if (r0 != 0) goto Laa
            goto L86
        La9:
            r2 = 0
        Laa:
            r6 = r2
        Lab:
            android.view.VelocityTracker r0 = r11.f3587t
            if (r0 == 0) goto Lb4
            r0.recycle()
            r11.f3587t = r7
        Lb4:
            r0 = 4
            r1 = 0
            if (r6 == r14) goto Ldc
            if (r6 == r15) goto Ldc
            if (r6 == r0) goto Lc8
            if (r6 == r10) goto Lc8
            r2 = 16
            if (r6 == r2) goto Lc8
            r2 = 32
            if (r6 == r2) goto Lc8
            r2 = 0
            goto Ld7
        Lc8:
            float r2 = r11.f3575h
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f3585r
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
        Ld7:
            r17 = r2
            r18 = 0
            goto Lef
        Ldc:
            float r2 = r11.f3576i
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f3585r
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r2
            r17 = 0
        Lef:
            if (r4 != r15) goto Lf4
            r5 = 8
            goto Lf9
        Lf4:
            if (r6 <= 0) goto Lf8
            r5 = 2
            goto Lf9
        Lf8:
            r5 = 4
        Lf9:
            float[] r0 = r11.f3569b
            r11.m2124n(r0)
            float[] r0 = r11.f3569b
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.t$c r3 = new androidx.recyclerview.widget.t$c
            r0 = r3
            r1 = r21
            r2 = r9
            r14 = r3
            r3 = r5
            r15 = r5
            r5 = r19
            r19 = r6
            r6 = r20
            r13 = r7
            r7 = r17
            r13 = 0
            r8 = r18
            r18 = r9
            r9 = r19
            r13 = 8
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.t$d r0 = r11.f3580m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f3585r
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.RecyclerView$j r0 = r1.getItemAnimator()
            if (r0 != 0) goto L139
            if (r15 != r13) goto L136
            r0 = 200(0xc8, double:9.9E-322)
            goto L140
        L136:
            r0 = 250(0xfa, double:1.235E-321)
            goto L140
        L139:
            if (r15 != r13) goto L13e
            long r0 = r0.f3235e
            goto L140
        L13e:
            long r0 = r0.f3234d
        L140:
            android.animation.ValueAnimator r2 = r14.f3610g
            r2.setDuration(r0)
            java.util.List<androidx.recyclerview.widget.t$f> r0 = r11.f3583p
            r0.add(r14)
            r0 = r18
            r1 = 0
            r0.m1804u(r1)
            android.animation.ValueAnimator r0 = r14.f3610g
            r0.start()
            r0 = 0
            r8 = 1
            goto L169
        L158:
            r0 = r9
            r13 = 8
            android.view.View r1 = r0.f3208a
            r11.m2126q(r1)
            androidx.recyclerview.widget.t$d r1 = r11.f3580m
            androidx.recyclerview.widget.RecyclerView r2 = r11.f3585r
            r1.mo2130a(r2, r0)
            r0 = 0
            r8 = 0
        L169:
            r11.f3570c = r0
            goto L16f
        L16c:
            r13 = 8
            r8 = 0
        L16f:
            if (r12 == 0) goto L1a2
            androidx.recyclerview.widget.t$d r0 = r11.f3580m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f3585r
            int r0 = r0.m2132d(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f3581n
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f3582o = r0
            android.view.View r0 = r12.f3208a
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f3577j = r0
            android.view.View r0 = r12.f3208a
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f3578k = r0
            r11.f3570c = r12
            r0 = r23
            r1 = 2
            if (r0 != r1) goto L1a2
            android.view.View r0 = r12.f3208a
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L1a3
        L1a2:
            r1 = 0
        L1a3:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3585r
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L1b3
            androidx.recyclerview.widget.RecyclerView$b0 r2 = r11.f3570c
            if (r2 == 0) goto L1b0
            r1 = 1
        L1b0:
            r0.requestDisallowInterceptTouchEvent(r1)
        L1b3:
            if (r8 != 0) goto L1be
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3585r
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            r1 = 1
            r0.f3245f = r1
        L1be:
            androidx.recyclerview.widget.t$d r0 = r11.f3580m
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r11.f3570c
            int r2 = r11.f3581n
            r0.mo2137i(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3585r
            r0.invalidate()
            return
    }

    /* renamed from: s */
    public void m2128s(android.view.MotionEvent r2, int r3, int r4) {
            r1 = this;
            float r0 = r2.getX(r4)
            float r2 = r2.getY(r4)
            float r4 = r1.f3571d
            float r0 = r0 - r4
            r1.f3575h = r0
            float r4 = r1.f3572e
            float r2 = r2 - r4
            r1.f3576i = r2
            r2 = r3 & 4
            r4 = 0
            if (r2 != 0) goto L1d
            float r2 = java.lang.Math.max(r4, r0)
            r1.f3575h = r2
        L1d:
            r2 = r3 & 8
            if (r2 != 0) goto L29
            float r2 = r1.f3575h
            float r2 = java.lang.Math.min(r4, r2)
            r1.f3575h = r2
        L29:
            r2 = r3 & 1
            if (r2 != 0) goto L35
            float r2 = r1.f3576i
            float r2 = java.lang.Math.max(r4, r2)
            r1.f3576i = r2
        L35:
            r2 = r3 & 2
            if (r2 != 0) goto L41
            float r2 = r1.f3576i
            float r2 = java.lang.Math.min(r4, r2)
            r1.f3576i = r2
        L41:
            return
    }
}
