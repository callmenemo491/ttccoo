package p332t0;

/* renamed from: t0.c */
/* loaded from: classes.dex */
public class C6095c {

    /* renamed from: v */
    public static final android.view.animation.Interpolator f23520v = null;

    /* renamed from: a */
    public int f23521a;

    /* renamed from: b */
    public int f23522b;

    /* renamed from: c */
    public int f23523c;

    /* renamed from: d */
    public float[] f23524d;

    /* renamed from: e */
    public float[] f23525e;

    /* renamed from: f */
    public float[] f23526f;

    /* renamed from: g */
    public float[] f23527g;

    /* renamed from: h */
    public int[] f23528h;

    /* renamed from: i */
    public int[] f23529i;

    /* renamed from: j */
    public int[] f23530j;

    /* renamed from: k */
    public int f23531k;

    /* renamed from: l */
    public android.view.VelocityTracker f23532l;

    /* renamed from: m */
    public float f23533m;

    /* renamed from: n */
    public float f23534n;

    /* renamed from: o */
    public int f23535o;

    /* renamed from: p */
    public android.widget.OverScroller f23536p;

    /* renamed from: q */
    public final p332t0.C6095c.c f23537q;

    /* renamed from: r */
    public android.view.View f23538r;

    /* renamed from: s */
    public boolean f23539s;

    /* renamed from: t */
    public final android.view.ViewGroup f23540t;

    /* renamed from: u */
    public final java.lang.Runnable f23541u;

    /* renamed from: t0.c$a */
    public class a implements android.view.animation.Interpolator {
        public a() {
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

    /* renamed from: t0.c$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p332t0.C6095c f23542Y;

        public b(p332t0.C6095c r1) {
                r0 = this;
                r0.f23542Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                t0.c r0 = r2.f23542Y
                r1 = 0
                r0.m12585s(r1)
                return
        }
    }

    /* renamed from: t0.c$c */
    public static abstract class c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract int mo3262a(android.view.View r1, int r2, int r3);

        /* renamed from: b */
        public abstract int mo3263b(android.view.View r1, int r2, int r3);

        /* renamed from: c */
        public int mo3264c(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: d */
        public int mo3301d(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: e */
        public void mo3265e(android.view.View r1, int r2) {
                r0 = this;
                return
        }

        /* renamed from: f */
        public abstract void mo3266f(int r1);

        /* renamed from: g */
        public abstract void mo3267g(android.view.View r1, int r2, int r3, int r4, int r5);

        /* renamed from: h */
        public abstract void mo3268h(android.view.View r1, float r2, float r3);

        /* renamed from: i */
        public abstract boolean mo3269i(android.view.View r1, int r2);
    }

    static {
            t0.c$a r0 = new t0.c$a
            r0.<init>()
            p332t0.C6095c.f23520v = r0
            return
    }

    public C6095c(android.content.Context r2, android.view.ViewGroup r3, p332t0.C6095c.c r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f23523c = r0
            t0.c$b r0 = new t0.c$b
            r0.<init>(r1)
            r1.f23541u = r0
            if (r4 == 0) goto L49
            r1.f23540t = r3
            r1.f23537q = r4
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r2)
            android.content.res.Resources r4 = r2.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r0 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r4 = (int) r4
            r1.f23535o = r4
            int r4 = r3.getScaledTouchSlop()
            r1.f23522b = r4
            int r4 = r3.getScaledMaximumFlingVelocity()
            float r4 = (float) r4
            r1.f23533m = r4
            int r3 = r3.getScaledMinimumFlingVelocity()
            float r3 = (float) r3
            r1.f23534n = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.view.animation.Interpolator r4 = p332t0.C6095c.f23520v
            r3.<init>(r2, r4)
            r1.f23536p = r3
            return
        L49:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Callback may not be null"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: a */
    public void m12567a() {
            r2 = this;
            r0 = -1
            r2.f23523c = r0
            float[] r0 = r2.f23524d
            if (r0 != 0) goto L8
            goto L2d
        L8:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.f23525e
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.f23526f
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.f23527g
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.f23528h
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.f23529i
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.f23530j
            java.util.Arrays.fill(r0, r1)
            r2.f23531k = r1
        L2d:
            android.view.VelocityTracker r0 = r2.f23532l
            if (r0 == 0) goto L37
            r0.recycle()
            r0 = 0
            r2.f23532l = r0
        L37:
            return
    }

    /* renamed from: b */
    public void m12568b(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            android.view.ViewGroup r1 = r2.f23540t
            if (r0 != r1) goto L16
            r2.f23538r = r3
            r2.f23523c = r4
            t0.c$c r0 = r2.f23537q
            r0.mo3265e(r3, r4)
            r3 = 1
            r2.m12585s(r3)
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            android.view.ViewGroup r0 = r2.f23540t
            r4.append(r0)
            java.lang.String r0 = ")"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: c */
    public final boolean m12569c(float r4, float r5, int r6, int r7) {
            r3 = this;
            float r4 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r5)
            int[] r0 = r3.f23528h
            r0 = r0[r6]
            r0 = r0 & r7
            r1 = 0
            if (r0 != r7) goto L4b
            r0 = r1 & r7
            if (r0 == 0) goto L4b
            int[] r0 = r3.f23530j
            r0 = r0[r6]
            r0 = r0 & r7
            if (r0 == r7) goto L4b
            int[] r0 = r3.f23529i
            r0 = r0[r6]
            r0 = r0 & r7
            if (r0 == r7) goto L4b
            int r0 = r3.f23522b
            float r2 = (float) r0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L2f
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L2f
            goto L4b
        L2f:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L3c
            t0.c$c r5 = r3.f23537q
            java.util.Objects.requireNonNull(r5)
        L3c:
            int[] r5 = r3.f23529i
            r5 = r5[r6]
            r5 = r5 & r7
            if (r5 != 0) goto L4b
            int r5 = r3.f23522b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L4b
            r1 = 1
        L4b:
            return r1
    }

    /* renamed from: d */
    public final boolean m12570d(android.view.View r5, float r6, float r7) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            t0.c$c r1 = r4.f23537q
            int r1 = r1.mo3264c(r5)
            r2 = 1
            if (r1 <= 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            t0.c$c r3 = r4.f23537q
            int r5 = r3.mo3301d(r5)
            if (r5 <= 0) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r1 == 0) goto L2f
            if (r5 == 0) goto L2f
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r7 = r7 + r6
            int r5 = r4.f23522b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2e
            r0 = 1
        L2e:
            return r0
        L2f:
            if (r1 == 0) goto L3e
            float r5 = java.lang.Math.abs(r6)
            int r6 = r4.f23522b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L3d
            r0 = 1
        L3d:
            return r0
        L3e:
            if (r5 == 0) goto L4c
            float r5 = java.lang.Math.abs(r7)
            int r6 = r4.f23522b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L4c
            r0 = 1
        L4c:
            return r0
    }

    /* renamed from: e */
    public final float m12571e(float r3, float r4, float r5) {
            r2 = this;
            float r0 = java.lang.Math.abs(r3)
            r1 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto La
            return r1
        La:
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L15
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L13
            goto L14
        L13:
            float r5 = -r5
        L14:
            return r5
        L15:
            return r3
    }

    /* renamed from: f */
    public final int m12572f(int r2, int r3, int r4) {
            r1 = this;
            int r0 = java.lang.Math.abs(r2)
            if (r0 >= r3) goto L8
            r2 = 0
            return r2
        L8:
            if (r0 <= r4) goto Lf
            if (r2 <= 0) goto Ld
            goto Le
        Ld:
            int r4 = -r4
        Le:
            return r4
        Lf:
            return r2
    }

    /* renamed from: g */
    public final void m12573g(int r7) {
            r6 = this;
            float[] r0 = r6.f23524d
            if (r0 == 0) goto L32
            int r1 = r6.f23531k
            r2 = 1
            int r3 = r2 << r7
            r4 = r3 & r1
            r5 = 0
            if (r4 == 0) goto Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 != 0) goto L13
            goto L32
        L13:
            r2 = 0
            r0[r7] = r2
            float[] r0 = r6.f23525e
            r0[r7] = r2
            float[] r0 = r6.f23526f
            r0[r7] = r2
            float[] r0 = r6.f23527g
            r0[r7] = r2
            int[] r0 = r6.f23528h
            r0[r7] = r5
            int[] r0 = r6.f23529i
            r0[r7] = r5
            int[] r0 = r6.f23530j
            r0[r7] = r5
            int r7 = ~r3
            r7 = r7 & r1
            r6.f23531k = r7
        L32:
            return
    }

    /* renamed from: h */
    public final int m12574h(int r5, int r6, int r7) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            android.view.ViewGroup r0 = r4.f23540t
            int r0 = r0.getWidth()
            int r1 = r0 / 2
            int r2 = java.lang.Math.abs(r5)
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r0, r2)
            float r1 = (float) r1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 - r3
            r3 = 1055999547(0x3ef1463b, float:0.47123894)
            float r2 = r2 * r3
            double r2 = (double) r2
            double r2 = java.lang.Math.sin(r2)
            float r2 = (float) r2
            float r2 = r2 * r1
            float r2 = r2 + r1
            int r6 = java.lang.Math.abs(r6)
            if (r6 <= 0) goto L42
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r6 = (float) r6
            float r2 = r2 / r6
            float r6 = java.lang.Math.abs(r2)
            float r6 = r6 * r5
            int r5 = java.lang.Math.round(r6)
            int r5 = r5 * 4
            goto L4f
        L42:
            int r5 = java.lang.Math.abs(r5)
            float r5 = (float) r5
            float r6 = (float) r7
            float r5 = r5 / r6
            float r5 = r5 + r0
            r6 = 1132462080(0x43800000, float:256.0)
            float r5 = r5 * r6
            int r5 = (int) r5
        L4f:
            r6 = 600(0x258, float:8.41E-43)
            int r5 = java.lang.Math.min(r5, r6)
            return r5
    }

    /* renamed from: i */
    public boolean m12575i(boolean r12) {
            r11 = this;
            int r0 = r11.f23521a
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L6a
            android.widget.OverScroller r0 = r11.f23536p
            boolean r0 = r0.computeScrollOffset()
            android.widget.OverScroller r3 = r11.f23536p
            int r3 = r3.getCurrX()
            android.widget.OverScroller r4 = r11.f23536p
            int r10 = r4.getCurrY()
            android.view.View r4 = r11.f23538r
            int r4 = r4.getLeft()
            int r8 = r3 - r4
            android.view.View r4 = r11.f23538r
            int r4 = r4.getTop()
            int r9 = r10 - r4
            if (r8 == 0) goto L2f
            android.view.View r4 = r11.f23538r
            p227n0.C4661t.m10538n(r4, r8)
        L2f:
            if (r9 == 0) goto L36
            android.view.View r4 = r11.f23538r
            p227n0.C4661t.m10539o(r4, r9)
        L36:
            if (r8 != 0) goto L3a
            if (r9 == 0) goto L43
        L3a:
            t0.c$c r4 = r11.f23537q
            android.view.View r5 = r11.f23538r
            r6 = r3
            r7 = r10
            r4.mo3267g(r5, r6, r7, r8, r9)
        L43:
            if (r0 == 0) goto L5b
            android.widget.OverScroller r4 = r11.f23536p
            int r4 = r4.getFinalX()
            if (r3 != r4) goto L5b
            android.widget.OverScroller r3 = r11.f23536p
            int r3 = r3.getFinalY()
            if (r10 != r3) goto L5b
            android.widget.OverScroller r0 = r11.f23536p
            r0.abortAnimation()
            r0 = 0
        L5b:
            if (r0 != 0) goto L6a
            if (r12 == 0) goto L67
            android.view.ViewGroup r12 = r11.f23540t
            java.lang.Runnable r0 = r11.f23541u
            r12.post(r0)
            goto L6a
        L67:
            r11.m12585s(r2)
        L6a:
            int r12 = r11.f23521a
            if (r12 != r1) goto L6f
            r2 = 1
        L6f:
            return r2
    }

    /* renamed from: j */
    public final void m12576j(float r4, float r5) {
            r3 = this;
            r0 = 1
            r3.f23539s = r0
            t0.c$c r1 = r3.f23537q
            android.view.View r2 = r3.f23538r
            r1.mo3268h(r2, r4, r5)
            r4 = 0
            r3.f23539s = r4
            int r5 = r3.f23521a
            if (r5 != r0) goto L14
            r3.m12585s(r4)
        L14:
            return
    }

    /* renamed from: k */
    public android.view.View m12577k(int r4, int r5) {
            r3 = this;
            android.view.ViewGroup r0 = r3.f23540t
            int r0 = r0.getChildCount()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L31
            android.view.ViewGroup r1 = r3.f23540t
            t0.c$c r2 = r3.f23537q
            java.util.Objects.requireNonNull(r2)
            android.view.View r1 = r1.getChildAt(r0)
            int r2 = r1.getLeft()
            if (r4 < r2) goto L2e
            int r2 = r1.getRight()
            if (r4 >= r2) goto L2e
            int r2 = r1.getTop()
            if (r5 < r2) goto L2e
            int r2 = r1.getBottom()
            if (r5 >= r2) goto L2e
            return r1
        L2e:
            int r0 = r0 + (-1)
            goto L8
        L31:
            r4 = 0
            return r4
    }

    /* renamed from: l */
    public final boolean m12578l(int r10, int r11, int r12, int r13) {
            r9 = this;
            android.view.View r0 = r9.f23538r
            int r2 = r0.getLeft()
            android.view.View r0 = r9.f23538r
            int r3 = r0.getTop()
            int r4 = r10 - r2
            int r5 = r11 - r3
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            android.widget.OverScroller r10 = r9.f23536p
            r10.abortAnimation()
            r10 = 0
            r9.m12585s(r10)
            return r10
        L1e:
            android.view.View r10 = r9.f23538r
            float r11 = r9.f23534n
            int r11 = (int) r11
            float r0 = r9.f23533m
            int r0 = (int) r0
            int r11 = r9.m12572f(r12, r11, r0)
            float r12 = r9.f23534n
            int r12 = (int) r12
            float r0 = r9.f23533m
            int r0 = (int) r0
            int r12 = r9.m12572f(r13, r12, r0)
            int r13 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r1 = java.lang.Math.abs(r11)
            int r6 = java.lang.Math.abs(r12)
            int r7 = r1 + r6
            int r8 = r13 + r0
            if (r11 == 0) goto L4d
            float r13 = (float) r1
            float r1 = (float) r7
            goto L4f
        L4d:
            float r13 = (float) r13
            float r1 = (float) r8
        L4f:
            float r13 = r13 / r1
            if (r12 == 0) goto L55
            float r0 = (float) r6
            float r1 = (float) r7
            goto L57
        L55:
            float r0 = (float) r0
            float r1 = (float) r8
        L57:
            float r0 = r0 / r1
            t0.c$c r1 = r9.f23537q
            int r1 = r1.mo3264c(r10)
            int r11 = r9.m12574h(r4, r11, r1)
            t0.c$c r1 = r9.f23537q
            int r10 = r1.mo3301d(r10)
            int r10 = r9.m12574h(r5, r12, r10)
            float r11 = (float) r11
            float r11 = r11 * r13
            float r10 = (float) r10
            float r10 = r10 * r0
            float r10 = r10 + r11
            int r6 = (int) r10
            android.widget.OverScroller r1 = r9.f23536p
            r1.startScroll(r2, r3, r4, r5, r6)
            r10 = 2
            r9.m12585s(r10)
            r10 = 1
            return r10
    }

    /* renamed from: m */
    public final boolean m12579m(int r4) {
            r3 = this;
            int r0 = r3.f23531k
            r1 = 1
            int r2 = r1 << r4
            r0 = r0 & r2
            r2 = 0
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring pointerId="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ViewDragHelper"
            android.util.Log.e(r0, r4)
            return r2
        L2a:
            return r1
    }

    /* renamed from: n */
    public void m12580n(android.view.MotionEvent r15) {
            r14 = this;
            int r0 = r15.getActionMasked()
            int r1 = r15.getActionIndex()
            if (r0 != 0) goto Ld
            r14.m12567a()
        Ld:
            android.view.VelocityTracker r2 = r14.f23532l
            if (r2 != 0) goto L17
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r14.f23532l = r2
        L17:
            android.view.VelocityTracker r2 = r14.f23532l
            r2.addMovement(r15)
            r2 = 0
            if (r0 == 0) goto L197
            r3 = 1
            if (r0 == r3) goto L18c
            r4 = 2
            if (r0 == r4) goto Lcd
            r4 = 3
            if (r0 == r4) goto Lc3
            r4 = 5
            if (r0 == r4) goto L75
            r4 = 6
            if (r0 == r4) goto L30
            goto L1bb
        L30:
            int r0 = r15.getPointerId(r1)
            int r1 = r14.f23521a
            if (r1 != r3) goto L70
            int r1 = r14.f23523c
            if (r0 != r1) goto L70
            int r1 = r15.getPointerCount()
        L40:
            r3 = -1
            if (r2 >= r1) goto L6a
            int r4 = r15.getPointerId(r2)
            int r5 = r14.f23523c
            if (r4 != r5) goto L4c
            goto L67
        L4c:
            float r5 = r15.getX(r2)
            float r6 = r15.getY(r2)
            int r5 = (int) r5
            int r6 = (int) r6
            android.view.View r5 = r14.m12577k(r5, r6)
            android.view.View r6 = r14.f23538r
            if (r5 != r6) goto L67
            boolean r4 = r14.m12588v(r6, r4)
            if (r4 == 0) goto L67
            int r15 = r14.f23523c
            goto L6b
        L67:
            int r2 = r2 + 1
            goto L40
        L6a:
            r15 = -1
        L6b:
            if (r15 != r3) goto L70
            r14.m12581o()
        L70:
            r14.m12573g(r0)
            goto L1bb
        L75:
            int r0 = r15.getPointerId(r1)
            float r4 = r15.getX(r1)
            float r15 = r15.getY(r1)
            r14.m12583q(r4, r15, r0)
            int r1 = r14.f23521a
            if (r1 != 0) goto L9a
            int r1 = (int) r4
            int r15 = (int) r15
            android.view.View r15 = r14.m12577k(r1, r15)
            r14.m12588v(r15, r0)
            int[] r15 = r14.f23528h
            r15 = r15[r0]
            r15 = r15 & r2
            if (r15 == 0) goto L1bb
            goto L1b6
        L9a:
            int r1 = (int) r4
            int r15 = (int) r15
            android.view.View r4 = r14.f23538r
            if (r4 != 0) goto La1
            goto Lba
        La1:
            int r5 = r4.getLeft()
            if (r1 < r5) goto Lba
            int r5 = r4.getRight()
            if (r1 >= r5) goto Lba
            int r1 = r4.getTop()
            if (r15 < r1) goto Lba
            int r1 = r4.getBottom()
            if (r15 >= r1) goto Lba
            r2 = 1
        Lba:
            if (r2 == 0) goto L1bb
            android.view.View r15 = r14.f23538r
            r14.m12588v(r15, r0)
            goto L1bb
        Lc3:
            int r15 = r14.f23521a
            if (r15 != r3) goto L193
            r15 = 0
            r14.m12576j(r15, r15)
            goto L193
        Lcd:
            int r0 = r14.f23521a
            if (r0 != r3) goto L149
            int r0 = r14.f23523c
            boolean r0 = r14.m12579m(r0)
            if (r0 != 0) goto Ldb
            goto L1bb
        Ldb:
            int r0 = r14.f23523c
            int r0 = r15.findPointerIndex(r0)
            float r1 = r15.getX(r0)
            float r0 = r15.getY(r0)
            float[] r2 = r14.f23526f
            int r3 = r14.f23523c
            r2 = r2[r3]
            float r1 = r1 - r2
            int r1 = (int) r1
            float[] r2 = r14.f23527g
            r2 = r2[r3]
            float r0 = r0 - r2
            int r0 = (int) r0
            android.view.View r2 = r14.f23538r
            int r2 = r2.getLeft()
            int r2 = r2 + r1
            android.view.View r3 = r14.f23538r
            int r3 = r3.getTop()
            int r3 = r3 + r0
            android.view.View r4 = r14.f23538r
            int r4 = r4.getLeft()
            android.view.View r5 = r14.f23538r
            int r5 = r5.getTop()
            if (r1 == 0) goto L122
            t0.c$c r6 = r14.f23537q
            android.view.View r7 = r14.f23538r
            int r2 = r6.mo3262a(r7, r2, r1)
            android.view.View r6 = r14.f23538r
            int r7 = r2 - r4
            p227n0.C4661t.m10538n(r6, r7)
        L122:
            r10 = r2
            if (r0 == 0) goto L134
            t0.c$c r2 = r14.f23537q
            android.view.View r6 = r14.f23538r
            int r3 = r2.mo3263b(r6, r3, r0)
            android.view.View r2 = r14.f23538r
            int r6 = r3 - r5
            p227n0.C4661t.m10539o(r2, r6)
        L134:
            r11 = r3
            if (r1 != 0) goto L139
            if (r0 == 0) goto L144
        L139:
            int r12 = r10 - r4
            int r13 = r11 - r5
            t0.c$c r8 = r14.f23537q
            android.view.View r9 = r14.f23538r
            r8.mo3267g(r9, r10, r11, r12, r13)
        L144:
            r14.m12584r(r15)
            goto L1bb
        L149:
            int r0 = r15.getPointerCount()
        L14d:
            if (r2 >= r0) goto L144
            int r1 = r15.getPointerId(r2)
            boolean r4 = r14.m12579m(r1)
            if (r4 != 0) goto L15a
            goto L189
        L15a:
            float r4 = r15.getX(r2)
            float r5 = r15.getY(r2)
            float[] r6 = r14.f23524d
            r6 = r6[r1]
            float r6 = r4 - r6
            float[] r7 = r14.f23525e
            r7 = r7[r1]
            float r7 = r5 - r7
            r14.m12582p(r6, r7, r1)
            int r8 = r14.f23521a
            if (r8 != r3) goto L176
            goto L144
        L176:
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r14.m12577k(r4, r5)
            boolean r5 = r14.m12570d(r4, r6, r7)
            if (r5 == 0) goto L189
            boolean r1 = r14.m12588v(r4, r1)
            if (r1 == 0) goto L189
            goto L144
        L189:
            int r2 = r2 + 1
            goto L14d
        L18c:
            int r15 = r14.f23521a
            if (r15 != r3) goto L193
            r14.m12581o()
        L193:
            r14.m12567a()
            goto L1bb
        L197:
            float r0 = r15.getX()
            float r1 = r15.getY()
            int r15 = r15.getPointerId(r2)
            int r3 = (int) r0
            int r4 = (int) r1
            android.view.View r3 = r14.m12577k(r3, r4)
            r14.m12583q(r0, r1, r15)
            r14.m12588v(r3, r15)
            int[] r0 = r14.f23528h
            r15 = r0[r15]
            r15 = r15 & r2
            if (r15 == 0) goto L1bb
        L1b6:
            t0.c$c r15 = r14.f23537q
            java.util.Objects.requireNonNull(r15)
        L1bb:
            return
    }

    /* renamed from: o */
    public final void m12581o() {
            r4 = this;
            android.view.VelocityTracker r0 = r4.f23532l
            float r1 = r4.f23533m
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            android.view.VelocityTracker r0 = r4.f23532l
            int r1 = r4.f23523c
            float r0 = r0.getXVelocity(r1)
            float r1 = r4.f23534n
            float r2 = r4.f23533m
            float r0 = r4.m12571e(r0, r1, r2)
            android.view.VelocityTracker r1 = r4.f23532l
            int r2 = r4.f23523c
            float r1 = r1.getYVelocity(r2)
            float r2 = r4.f23534n
            float r3 = r4.f23533m
            float r1 = r4.m12571e(r1, r2, r3)
            r4.m12576j(r0, r1)
            return
    }

    /* renamed from: p */
    public final void m12582p(float r3, float r4, int r5) {
            r2 = this;
            r0 = 1
            boolean r0 = r2.m12569c(r3, r4, r5, r0)
            r1 = 4
            boolean r1 = r2.m12569c(r4, r3, r5, r1)
            if (r1 == 0) goto Le
            r0 = r0 | 4
        Le:
            r1 = 2
            boolean r1 = r2.m12569c(r3, r4, r5, r1)
            if (r1 == 0) goto L17
            r0 = r0 | 2
        L17:
            r1 = 8
            boolean r3 = r2.m12569c(r4, r3, r5, r1)
            if (r3 == 0) goto L21
            r0 = r0 | 8
        L21:
            if (r0 == 0) goto L2f
            int[] r3 = r2.f23529i
            r4 = r3[r5]
            r4 = r4 | r0
            r3[r5] = r4
            t0.c$c r3 = r2.f23537q
            java.util.Objects.requireNonNull(r3)
        L2f:
            return
    }

    /* renamed from: q */
    public final void m12583q(float r11, float r12, int r13) {
            r10 = this;
            float[] r0 = r10.f23524d
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r13) goto L50
        L8:
            int r2 = r13 + 1
            float[] r3 = new float[r2]
            float[] r4 = new float[r2]
            float[] r5 = new float[r2]
            float[] r6 = new float[r2]
            int[] r7 = new int[r2]
            int[] r8 = new int[r2]
            int[] r2 = new int[r2]
            if (r0 == 0) goto L42
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r3, r1, r9)
            float[] r0 = r10.f23525e
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r4, r1, r9)
            float[] r0 = r10.f23526f
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r5, r1, r9)
            float[] r0 = r10.f23527g
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r6, r1, r9)
            int[] r0 = r10.f23528h
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r7, r1, r9)
            int[] r0 = r10.f23529i
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r8, r1, r9)
            int[] r0 = r10.f23530j
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r9)
        L42:
            r10.f23524d = r3
            r10.f23525e = r4
            r10.f23526f = r5
            r10.f23527g = r6
            r10.f23528h = r7
            r10.f23529i = r8
            r10.f23530j = r2
        L50:
            float[] r0 = r10.f23524d
            float[] r2 = r10.f23526f
            r2[r13] = r11
            r0[r13] = r11
            float[] r0 = r10.f23525e
            float[] r2 = r10.f23527g
            r2[r13] = r12
            r0[r13] = r12
            int[] r0 = r10.f23528h
            int r11 = (int) r11
            int r12 = (int) r12
            android.view.ViewGroup r2 = r10.f23540t
            int r2 = r2.getLeft()
            int r3 = r10.f23535o
            int r2 = r2 + r3
            r3 = 1
            if (r11 >= r2) goto L71
            r1 = 1
        L71:
            android.view.ViewGroup r2 = r10.f23540t
            int r2 = r2.getTop()
            int r4 = r10.f23535o
            int r2 = r2 + r4
            if (r12 >= r2) goto L7e
            r1 = r1 | 4
        L7e:
            android.view.ViewGroup r2 = r10.f23540t
            int r2 = r2.getRight()
            int r4 = r10.f23535o
            int r2 = r2 - r4
            if (r11 <= r2) goto L8b
            r1 = r1 | 2
        L8b:
            android.view.ViewGroup r11 = r10.f23540t
            int r11 = r11.getBottom()
            int r2 = r10.f23535o
            int r11 = r11 - r2
            if (r12 <= r11) goto L98
            r1 = r1 | 8
        L98:
            r0[r13] = r1
            int r11 = r10.f23531k
            int r12 = r3 << r13
            r11 = r11 | r12
            r10.f23531k = r11
            return
    }

    /* renamed from: r */
    public final void m12584r(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getPointerCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L25
            int r2 = r7.getPointerId(r1)
            boolean r3 = r6.m12579m(r2)
            if (r3 != 0) goto L12
            goto L22
        L12:
            float r3 = r7.getX(r1)
            float r4 = r7.getY(r1)
            float[] r5 = r6.f23526f
            r5[r2] = r3
            float[] r3 = r6.f23527g
            r3[r2] = r4
        L22:
            int r1 = r1 + 1
            goto L5
        L25:
            return
    }

    /* renamed from: s */
    public void m12585s(int r3) {
            r2 = this;
            android.view.ViewGroup r0 = r2.f23540t
            java.lang.Runnable r1 = r2.f23541u
            r0.removeCallbacks(r1)
            int r0 = r2.f23521a
            if (r0 == r3) goto L19
            r2.f23521a = r3
            t0.c$c r0 = r2.f23537q
            r0.mo3266f(r3)
            int r3 = r2.f23521a
            if (r3 != 0) goto L19
            r3 = 0
            r2.f23538r = r3
        L19:
            return
    }

    /* renamed from: t */
    public boolean m12586t(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.f23539s
            if (r0 == 0) goto L1b
            android.view.VelocityTracker r0 = r3.f23532l
            int r1 = r3.f23523c
            float r0 = r0.getXVelocity(r1)
            int r0 = (int) r0
            android.view.VelocityTracker r1 = r3.f23532l
            int r2 = r3.f23523c
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            boolean r4 = r3.m12578l(r4, r5, r0, r1)
            return r4
        L1b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: u */
    public boolean m12587u(android.view.MotionEvent r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L11
            r16.m12567a()
        L11:
            android.view.VelocityTracker r4 = r0.f23532l
            if (r4 != 0) goto L1b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f23532l = r4
        L1b:
            android.view.VelocityTracker r4 = r0.f23532l
            r4.addMovement(r1)
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L104
            if (r2 == r5) goto Lff
            if (r2 == r4) goto L6f
            r7 = 3
            if (r2 == r7) goto Lff
            r7 = 5
            if (r2 == r7) goto L3d
            r4 = 6
            if (r2 == r4) goto L34
            goto L102
        L34:
            int r1 = r1.getPointerId(r3)
            r0.m12573g(r1)
            goto L102
        L3d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m12583q(r7, r1, r2)
            int r3 = r0.f23521a
            if (r3 != 0) goto L5e
            int[] r1 = r0.f23528h
            r1 = r1[r2]
            r1 = r1 & r6
            if (r1 == 0) goto L102
            t0.c$c r1 = r0.f23537q
            java.util.Objects.requireNonNull(r1)
            goto L102
        L5e:
            if (r3 != r4) goto L102
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.m12577k(r3, r1)
            android.view.View r3 = r0.f23538r
            if (r1 != r3) goto L102
            r0.m12588v(r1, r2)
            goto L102
        L6f:
            float[] r2 = r0.f23524d
            if (r2 == 0) goto L102
            float[] r2 = r0.f23525e
            if (r2 != 0) goto L79
            goto L102
        L79:
            int r2 = r17.getPointerCount()
            r3 = 0
        L7e:
            if (r3 >= r2) goto Lfb
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m12579m(r4)
            if (r7 != 0) goto L8c
            goto Lf7
        L8c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f23524d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f23525e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.m12577k(r7, r8)
            if (r7 == 0) goto Lb0
            boolean r8 = r0.m12570d(r7, r9, r10)
            if (r8 == 0) goto Lb0
            r8 = 1
            goto Lb1
        Lb0:
            r8 = 0
        Lb1:
            if (r8 == 0) goto Le6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            t0.c$c r14 = r0.f23537q
            int r12 = r14.mo3262a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            t0.c$c r6 = r0.f23537q
            int r6 = r6.mo3263b(r7, r15, r14)
            t0.c$c r14 = r0.f23537q
            int r14 = r14.mo3264c(r7)
            t0.c$c r15 = r0.f23537q
            int r15 = r15.mo3301d(r7)
            if (r14 == 0) goto Ldf
            if (r14 <= 0) goto Le6
            if (r12 != r11) goto Le6
        Ldf:
            if (r15 == 0) goto Lfb
            if (r15 <= 0) goto Le6
            if (r6 != r13) goto Le6
            goto Lfb
        Le6:
            r0.m12582p(r9, r10, r4)
            int r6 = r0.f23521a
            if (r6 != r5) goto Lee
            goto Lfb
        Lee:
            if (r8 == 0) goto Lf7
            boolean r4 = r0.m12588v(r7, r4)
            if (r4 == 0) goto Lf7
            goto Lfb
        Lf7:
            int r3 = r3 + 1
            r6 = 0
            goto L7e
        Lfb:
            r16.m12584r(r17)
            goto L102
        Lff:
            r16.m12567a()
        L102:
            r2 = 0
            goto L132
        L104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.m12583q(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.m12577k(r2, r3)
            android.view.View r3 = r0.f23538r
            if (r2 != r3) goto L125
            int r3 = r0.f23521a
            if (r3 != r4) goto L125
            r0.m12588v(r2, r1)
        L125:
            int[] r2 = r0.f23528h
            r1 = r2[r1]
            r2 = 0
            r1 = r1 & r2
            if (r1 == 0) goto L132
            t0.c$c r1 = r0.f23537q
            java.util.Objects.requireNonNull(r1)
        L132:
            int r1 = r0.f23521a
            if (r1 != r5) goto L137
            goto L138
        L137:
            r5 = 0
        L138:
            return r5
    }

    /* renamed from: v */
    public boolean m12588v(android.view.View r3, int r4) {
            r2 = this;
            android.view.View r0 = r2.f23538r
            r1 = 1
            if (r3 != r0) goto La
            int r0 = r2.f23523c
            if (r0 != r4) goto La
            return r1
        La:
            if (r3 == 0) goto L1a
            t0.c$c r0 = r2.f23537q
            boolean r0 = r0.mo3269i(r3, r4)
            if (r0 == 0) goto L1a
            r2.f23523c = r4
            r2.m12568b(r3, r4)
            return r1
        L1a:
            r3 = 0
            return r3
    }
}
