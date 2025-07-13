package p280q0;

/* renamed from: q0.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC5534a implements android.view.View.OnTouchListener {

    /* renamed from: o0 */
    public static final int f21539o0 = 0;

    /* renamed from: Y */
    public final p280q0.AbstractViewOnTouchListenerC5534a.a f21540Y;

    /* renamed from: Z */
    public final android.view.animation.Interpolator f21541Z;

    /* renamed from: a0 */
    public final android.view.View f21542a0;

    /* renamed from: b0 */
    public java.lang.Runnable f21543b0;

    /* renamed from: c0 */
    public float[] f21544c0;

    /* renamed from: d0 */
    public float[] f21545d0;

    /* renamed from: e0 */
    public int f21546e0;

    /* renamed from: f0 */
    public int f21547f0;

    /* renamed from: g0 */
    public float[] f21548g0;

    /* renamed from: h0 */
    public float[] f21549h0;

    /* renamed from: i0 */
    public float[] f21550i0;

    /* renamed from: j0 */
    public boolean f21551j0;

    /* renamed from: k0 */
    public boolean f21552k0;

    /* renamed from: l0 */
    public boolean f21553l0;

    /* renamed from: m0 */
    public boolean f21554m0;

    /* renamed from: n0 */
    public boolean f21555n0;

    /* renamed from: q0.a$a */
    public static class a {

        /* renamed from: a */
        public int f21556a;

        /* renamed from: b */
        public int f21557b;

        /* renamed from: c */
        public float f21558c;

        /* renamed from: d */
        public float f21559d;

        /* renamed from: e */
        public long f21560e;

        /* renamed from: f */
        public long f21561f;

        /* renamed from: g */
        public int f21562g;

        /* renamed from: h */
        public int f21563h;

        /* renamed from: i */
        public long f21564i;

        /* renamed from: j */
        public float f21565j;

        /* renamed from: k */
        public int f21566k;

        public a() {
                r2 = this;
                r2.<init>()
                r0 = -9223372036854775808
                r2.f21560e = r0
                r0 = -1
                r2.f21564i = r0
                r0 = 0
                r2.f21561f = r0
                r0 = 0
                r2.f21562g = r0
                r2.f21563h = r0
                return
        }

        /* renamed from: a */
        public final float m11803a(long r10) {
                r9 = this;
                long r0 = r9.f21560e
                r2 = 0
                int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r3 >= 0) goto L8
                return r2
            L8:
                long r3 = r9.f21564i
                r5 = 0
                r7 = 1065353216(0x3f800000, float:1.0)
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 < 0) goto L29
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 >= 0) goto L17
                goto L29
            L17:
                long r10 = r10 - r3
                float r0 = r9.f21565j
                float r1 = r7 - r0
                float r10 = (float) r10
                int r11 = r9.f21566k
                float r11 = (float) r11
                float r10 = r10 / r11
                float r10 = p280q0.AbstractViewOnTouchListenerC5534a.m11798b(r10, r2, r7)
                float r10 = r10 * r0
                float r10 = r10 + r1
                return r10
            L29:
                long r10 = r10 - r0
                r0 = 1056964608(0x3f000000, float:0.5)
                float r10 = (float) r10
                int r11 = r9.f21556a
                float r11 = (float) r11
                float r10 = r10 / r11
                float r10 = p280q0.AbstractViewOnTouchListenerC5534a.m11798b(r10, r2, r7)
                float r10 = r10 * r0
                return r10
        }
    }

    /* renamed from: q0.a$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p280q0.AbstractViewOnTouchListenerC5534a f21567Y;

        public b(p280q0.AbstractViewOnTouchListenerC5534a r1) {
                r0 = this;
                r0.f21567Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r15 = this;
                q0.a r0 = r15.f21567Y
                boolean r1 = r0.f21554m0
                if (r1 != 0) goto L7
                return
            L7:
                boolean r1 = r0.f21552k0
                r2 = 0
                if (r1 == 0) goto L27
                r0.f21552k0 = r2
                q0.a$a r0 = r0.f21540Y
                java.util.Objects.requireNonNull(r0)
                long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                r0.f21560e = r3
                r5 = -1
                r0.f21564i = r5
                r0.f21561f = r3
                r1 = 1056964608(0x3f000000, float:0.5)
                r0.f21565j = r1
                r0.f21562g = r2
                r0.f21563h = r2
            L27:
                q0.a r0 = r15.f21567Y
                q0.a$a r0 = r0.f21540Y
                long r3 = r0.f21564i
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L43
                long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r7 = r0.f21564i
                int r1 = r0.f21566k
                long r9 = (long) r1
                long r7 = r7 + r9
                int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r1 <= 0) goto L43
                r1 = 1
                goto L44
            L43:
                r1 = 0
            L44:
                if (r1 != 0) goto Lba
                q0.a r1 = r15.f21567Y
                boolean r1 = r1.m11802e()
                if (r1 != 0) goto L4f
                goto Lba
            L4f:
                q0.a r1 = r15.f21567Y
                boolean r3 = r1.f21553l0
                if (r3 == 0) goto L6f
                r1.f21553l0 = r2
                java.util.Objects.requireNonNull(r1)
                long r9 = android.os.SystemClock.uptimeMillis()
                r11 = 3
                r12 = 0
                r13 = 0
                r14 = 0
                r7 = r9
                android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r7, r9, r11, r12, r13, r14)
                android.view.View r1 = r1.f21542a0
                r1.onTouchEvent(r2)
                r2.recycle()
            L6f:
                long r1 = r0.f21561f
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 == 0) goto Lb2
                long r1 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                float r3 = r0.m11803a(r1)
                r4 = -1065353216(0xffffffffc0800000, float:-4.0)
                float r4 = r4 * r3
                float r4 = r4 * r3
                r5 = 1082130432(0x40800000, float:4.0)
                float r3 = r3 * r5
                float r3 = r3 + r4
                long r4 = r0.f21561f
                long r4 = r1 - r4
                r0.f21561f = r1
                float r1 = (float) r4
                float r1 = r1 * r3
                float r2 = r0.f21558c
                float r2 = r2 * r1
                int r2 = (int) r2
                r0.f21562g = r2
                float r2 = r0.f21559d
                float r1 = r1 * r2
                int r1 = (int) r1
                r0.f21563h = r1
                q0.a r0 = r15.f21567Y
                q0.e r0 = (p280q0.C5538e) r0
                android.widget.ListView r0 = r0.f21571p0
                r0.scrollListBy(r1)
                q0.a r0 = r15.f21567Y
                android.view.View r0 = r0.f21542a0
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10565m(r0, r15)
                return
            Lb2:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Cannot compute scroll delta before calling start()"
                r0.<init>(r1)
                throw r0
            Lba:
                q0.a r0 = r15.f21567Y
                r0.f21554m0 = r2
                return
        }
    }

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            p280q0.AbstractViewOnTouchListenerC5534a.f21539o0 = r0
            return
    }

    public AbstractViewOnTouchListenerC5534a(android.view.View r7) {
            r6 = this;
            r6.<init>()
            q0.a$a r0 = new q0.a$a
            r0.<init>()
            r6.f21540Y = r0
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            r6.f21541Z = r1
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x008e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r6.f21544c0 = r2
            float[] r2 = new float[r1]
            r2 = {x0096: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r6.f21545d0 = r2
            float[] r2 = new float[r1]
            r2 = {x009e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r6.f21548g0 = r2
            float[] r2 = new float[r1]
            r2 = {x00a6: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r6.f21549h0 = r2
            float[] r1 = new float[r1]
            r1 = {x00ae: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r6.f21550i0 = r1
            r6.f21542a0 = r7
            android.content.res.Resources r7 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            r1 = 1153753088(0x44c4e000, float:1575.0)
            float r1 = r1 * r7
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r3 = 1134395392(0x439d8000, float:315.0)
            float r7 = r7 * r3
            float r7 = r7 + r2
            int r7 = (int) r7
            float r1 = (float) r1
            float[] r2 = r6.f21550i0
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r3
            r4 = 0
            r2[r4] = r1
            r5 = 1
            r2[r5] = r1
            float r7 = (float) r7
            float[] r1 = r6.f21549h0
            float r7 = r7 / r3
            r1[r4] = r7
            r1[r5] = r7
            r6.f21546e0 = r5
            float[] r7 = r6.f21545d0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7[r4] = r1
            r7[r5] = r1
            float[] r7 = r6.f21544c0
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r7[r4] = r1
            r7[r5] = r1
            float[] r7 = r6.f21548g0
            r1 = 981668463(0x3a83126f, float:0.001)
            r7[r4] = r1
            r7[r5] = r1
            int r7 = p280q0.AbstractViewOnTouchListenerC5534a.f21539o0
            r6.f21547f0 = r7
            r7 = 500(0x1f4, float:7.0E-43)
            r0.f21556a = r7
            r0.f21557b = r7
            return
    }

    /* renamed from: b */
    public static float m11798b(float r1, float r2, float r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto La
            return r2
        La:
            return r1
    }

    /* renamed from: a */
    public final float m11799a(int r4, float r5, float r6, float r7) {
            r3 = this;
            float[] r0 = r3.f21544c0
            r0 = r0[r4]
            float[] r1 = r3.f21545d0
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m11798b(r0, r2, r1)
            float r1 = r3.m11800c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m11800c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L26
            android.view.animation.Interpolator r6 = r3.f21541Z
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L30
        L26:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L39
            android.view.animation.Interpolator r6 = r3.f21541Z
            float r5 = r6.getInterpolation(r5)
        L30:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m11798b(r5, r6, r0)
            goto L3a
        L39:
            r5 = 0
        L3a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3f
            return r2
        L3f:
            float[] r0 = r3.f21548g0
            r0 = r0[r4]
            float[] r1 = r3.f21549h0
            r1 = r1[r4]
            float[] r2 = r3.f21550i0
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L56
            float r5 = r5 * r0
            float r4 = m11798b(r5, r1, r4)
            return r4
        L56:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m11798b(r5, r1, r4)
            float r4 = -r4
            return r4
    }

    /* renamed from: c */
    public final float m11800c(float r6, float r7) {
            r5 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            return r0
        L6:
            int r1 = r5.f21546e0
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto L18
            r2 = 2
            if (r1 == r2) goto L11
            goto L2c
        L11:
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L2c
            float r7 = -r7
            float r6 = r6 / r7
            return r6
        L18:
            int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r3 >= 0) goto L2c
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 < 0) goto L25
            float r6 = r6 / r7
            float r3 = r3 - r6
            return r3
        L25:
            boolean r6 = r5.f21554m0
            if (r6 == 0) goto L2c
            if (r1 != r2) goto L2c
            return r3
        L2c:
            return r0
    }

    /* renamed from: d */
    public final void m11801d() {
            r6 = this;
            boolean r0 = r6.f21552k0
            r1 = 0
            if (r0 == 0) goto L8
            r6.f21554m0 = r1
            goto L2a
        L8:
            q0.a$a r0 = r6.f21540Y
            java.util.Objects.requireNonNull(r0)
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r4 = r0.f21560e
            long r4 = r2 - r4
            int r5 = (int) r4
            int r4 = r0.f21557b
            if (r5 <= r4) goto L1c
            r1 = r4
            goto L20
        L1c:
            if (r5 >= 0) goto L1f
            goto L20
        L1f:
            r1 = r5
        L20:
            r0.f21566k = r1
            float r1 = r0.m11803a(r2)
            r0.f21565j = r1
            r0.f21564i = r2
        L2a:
            return
    }

    /* renamed from: e */
    public boolean m11802e() {
            r9 = this;
            q0.a$a r0 = r9.f21540Y
            float r1 = r0.f21559d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f21558c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            q0.e r4 = (p280q0.C5538e) r4
            android.widget.ListView r4 = r4.f21571p0
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = 0
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L54
        L53:
            r2 = 0
        L54:
            return r2
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            boolean r0 = r5.f21555n0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7f
        L16:
            r5.m11801d()
            goto L7f
        L1a:
            r5.f21553l0 = r2
            r5.f21551j0 = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f21542a0
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m11799a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f21542a0
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m11799a(r2, r7, r6, r3)
            q0.a$a r7 = r5.f21540Y
            r7.f21558c = r0
            r7.f21559d = r6
            boolean r6 = r5.f21554m0
            if (r6 != 0) goto L7f
            boolean r6 = r5.m11802e()
            if (r6 == 0) goto L7f
            java.lang.Runnable r6 = r5.f21543b0
            if (r6 != 0) goto L61
            q0.a$b r6 = new q0.a$b
            r6.<init>(r5)
            r5.f21543b0 = r6
        L61:
            r5.f21554m0 = r2
            r5.f21552k0 = r2
            boolean r6 = r5.f21551j0
            if (r6 != 0) goto L78
            int r6 = r5.f21547f0
            if (r6 <= 0) goto L78
            android.view.View r7 = r5.f21542a0
            java.lang.Runnable r0 = r5.f21543b0
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, n0.w> r6 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10566n(r7, r0, r3)
            goto L7d
        L78:
            java.lang.Runnable r6 = r5.f21543b0
            r6.run()
        L7d:
            r5.f21551j0 = r2
        L7f:
            return r1
    }
}
