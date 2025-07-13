package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.h0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0280h0 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: Y */
    public final float f1304Y;

    /* renamed from: Z */
    public final int f1305Z;

    /* renamed from: a0 */
    public final int f1306a0;

    /* renamed from: b0 */
    public final android.view.View f1307b0;

    /* renamed from: c0 */
    public java.lang.Runnable f1308c0;

    /* renamed from: d0 */
    public java.lang.Runnable f1309d0;

    /* renamed from: e0 */
    public boolean f1310e0;

    /* renamed from: f0 */
    public int f1311f0;

    /* renamed from: g0 */
    public final int[] f1312g0;

    /* renamed from: androidx.appcompat.widget.h0$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0 f1313Y;

        public a(androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0 r1) {
                r0 = this;
                r0.f1313Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.h0 r0 = r2.f1313Y
                android.view.View r0 = r0.f1307b0
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto Le
                r1 = 1
                r0.requestDisallowInterceptTouchEvent(r1)
            Le:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0 f1314Y;

        public b(androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0 r1) {
                r0 = this;
                r0.f1314Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r12 = this;
                androidx.appcompat.widget.h0 r0 = r12.f1314Y
                r0.m729a()
                android.view.View r1 = r0.f1307b0
                boolean r2 = r1.isEnabled()
                if (r2 == 0) goto L38
                boolean r2 = r1.isLongClickable()
                if (r2 == 0) goto L14
                goto L38
            L14:
                boolean r2 = r0.mo463c()
                if (r2 != 0) goto L1b
                goto L38
            L1b:
                android.view.ViewParent r2 = r1.getParent()
                r3 = 1
                r2.requestDisallowInterceptTouchEvent(r3)
                long r6 = android.os.SystemClock.uptimeMillis()
                r8 = 3
                r9 = 0
                r10 = 0
                r11 = 0
                r4 = r6
                android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
                r1.onTouchEvent(r2)
                r2.recycle()
                r0.f1310e0 = r3
            L38:
                return
        }
    }

    public AbstractViewOnTouchListenerC0280h0(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.f1312g0 = r1
            r2.f1307b0 = r3
            r1 = 1
            r3.setLongClickable(r1)
            r3.addOnAttachStateChangeListener(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            float r3 = (float) r3
            r2.f1304Y = r3
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            r2.f1305Z = r3
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r1 = r1 + r3
            int r1 = r1 / r0
            r2.f1306a0 = r1
            return
    }

    /* renamed from: a */
    public final void m729a() {
            r2 = this;
            java.lang.Runnable r0 = r2.f1309d0
            if (r0 == 0) goto L9
            android.view.View r1 = r2.f1307b0
            r1.removeCallbacks(r0)
        L9:
            java.lang.Runnable r0 = r2.f1308c0
            if (r0 == 0) goto L12
            android.view.View r1 = r2.f1307b0
            r1.removeCallbacks(r0)
        L12:
            return
    }

    /* renamed from: b */
    public abstract p194l.InterfaceC4155f mo462b();

    /* renamed from: c */
    public abstract boolean mo463c();

    /* renamed from: d */
    public boolean mo700d() {
            r2 = this;
            l.f r0 = r2.mo462b()
            if (r0 == 0) goto Lf
            boolean r1 = r0.mo473b()
            if (r1 == 0) goto Lf
            r0.dismiss()
        Lf:
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            r11 = this;
            boolean r12 = r11.f1310e0
            r0 = 3
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L71
            android.view.View r3 = r11.f1307b0
            l.f r4 = r11.mo462b()
            if (r4 == 0) goto L61
            boolean r5 = r4.mo473b()
            if (r5 != 0) goto L16
            goto L61
        L16:
            android.widget.ListView r4 = r4.mo477g()
            androidx.appcompat.widget.f0 r4 = (androidx.appcompat.widget.C0274f0) r4
            if (r4 == 0) goto L61
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L25
            goto L61
        L25:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.f1312g0
            r3.getLocationOnScreen(r6)
            r3 = r6[r1]
            float r3 = (float) r3
            r6 = r6[r2]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.f1312g0
            r4.getLocationOnScreen(r3)
            r6 = r3[r1]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r2]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.f1311f0
            boolean r3 = r4.m721b(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r2) goto L5a
            if (r13 == r0) goto L5a
            r13 = 1
            goto L5b
        L5a:
            r13 = 0
        L5b:
            if (r3 == 0) goto L61
            if (r13 == 0) goto L61
            r13 = 1
            goto L62
        L61:
            r13 = 0
        L62:
            if (r13 != 0) goto L6e
            boolean r13 = r11.mo700d()
            if (r13 != 0) goto L6b
            goto L6e
        L6b:
            r13 = 0
            goto L128
        L6e:
            r13 = 1
            goto L128
        L71:
            android.view.View r3 = r11.f1307b0
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L7c
        L79:
            r13 = 0
            goto L106
        L7c:
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto Ld8
            if (r4 == r2) goto Ld4
            r5 = 2
            if (r4 == r5) goto L8a
            if (r4 == r0) goto Ld4
            goto L79
        L8a:
            int r0 = r11.f1311f0
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L79
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.f1304Y
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto Lc5
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto Lc5
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto Lc5
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto Lc5
            r13 = 1
            goto Lc6
        Lc5:
            r13 = 0
        Lc6:
            if (r13 != 0) goto L79
            r11.m729a()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r2)
            r13 = 1
            goto L106
        Ld4:
            r11.m729a()
            goto L79
        Ld8:
            int r13 = r13.getPointerId(r1)
            r11.f1311f0 = r13
            java.lang.Runnable r13 = r11.f1308c0
            if (r13 != 0) goto Le9
            androidx.appcompat.widget.h0$a r13 = new androidx.appcompat.widget.h0$a
            r13.<init>(r11)
            r11.f1308c0 = r13
        Le9:
            java.lang.Runnable r13 = r11.f1308c0
            int r0 = r11.f1305Z
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            java.lang.Runnable r13 = r11.f1309d0
            if (r13 != 0) goto Lfc
            androidx.appcompat.widget.h0$b r13 = new androidx.appcompat.widget.h0$b
            r13.<init>(r11)
            r11.f1309d0 = r13
        Lfc:
            java.lang.Runnable r13 = r11.f1309d0
            int r0 = r11.f1306a0
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            goto L79
        L106:
            if (r13 == 0) goto L110
            boolean r13 = r11.mo463c()
            if (r13 == 0) goto L110
            r13 = 1
            goto L111
        L110:
            r13 = 0
        L111:
            if (r13 == 0) goto L128
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.f1307b0
            r3.onTouchEvent(r0)
            r0.recycle()
        L128:
            r11.f1310e0 = r13
            if (r13 != 0) goto L12e
            if (r12 == 0) goto L12f
        L12e:
            r1 = 1
        L12f:
            return r1
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            r2 = 0
            r1.f1310e0 = r2
            r2 = -1
            r1.f1311f0 = r2
            java.lang.Runnable r2 = r1.f1308c0
            if (r2 == 0) goto Lf
            android.view.View r0 = r1.f1307b0
            r0.removeCallbacks(r2)
        Lf:
            return
    }
}
