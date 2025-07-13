package p407x5;

/* renamed from: x5.k */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC6956k extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener, p407x5.C6949d.a {

    /* renamed from: Y */
    public final android.graphics.PointF f27196Y;

    /* renamed from: Z */
    public final android.graphics.PointF f27197Z;

    /* renamed from: a0 */
    public final p407x5.ViewOnTouchListenerC6956k.a f27198a0;

    /* renamed from: b0 */
    public final float f27199b0;

    /* renamed from: c0 */
    public final android.view.GestureDetector f27200c0;

    /* renamed from: d0 */
    public volatile float f27201d0;

    /* renamed from: x5.k$a */
    public interface a {
    }

    public ViewOnTouchListenerC6956k(android.content.Context r2, p407x5.ViewOnTouchListenerC6956k.a r3, float r4) {
            r1 = this;
            r1.<init>()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.f27196Y = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.f27197Z = r0
            r1.f27198a0 = r3
            r1.f27199b0 = r4
            android.view.GestureDetector r3 = new android.view.GestureDetector
            r3.<init>(r2, r1)
            r1.f27200c0 = r3
            r2 = 1078530011(0x40490fdb, float:3.1415927)
            r1.f27201d0 = r2
            return
    }

    @Override // p407x5.C6949d.a
    /* renamed from: a */
    public void mo14117a(float[] r1, float r2) {
            r0 = this;
            float r1 = -r2
            r0.f27201d0 = r1
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent r3) {
            r2 = this;
            android.graphics.PointF r0 = r2.f27196Y
            float r1 = r3.getX()
            float r3 = r3.getY()
            r0.set(r1, r3)
            r3 = 1
            return r3
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
            r6 = this;
            float r7 = r8.getX()
            android.graphics.PointF r9 = r6.f27196Y
            float r9 = r9.x
            float r7 = r7 - r9
            float r9 = r6.f27199b0
            float r7 = r7 / r9
            float r9 = r8.getY()
            android.graphics.PointF r10 = r6.f27196Y
            float r0 = r10.y
            float r9 = r9 - r0
            float r0 = r6.f27199b0
            float r9 = r9 / r0
            float r0 = r8.getX()
            float r8 = r8.getY()
            r10.set(r0, r8)
            float r8 = r6.f27201d0
            double r0 = (double) r8
            double r2 = java.lang.Math.cos(r0)
            float r8 = (float) r2
            double r0 = java.lang.Math.sin(r0)
            float r10 = (float) r0
            android.graphics.PointF r0 = r6.f27197Z
            float r1 = r0.x
            float r2 = r8 * r7
            float r3 = r10 * r9
            float r2 = r2 - r3
            float r1 = r1 - r2
            r0.x = r1
            float r1 = r0.y
            float r10 = r10 * r7
            float r8 = r8 * r9
            float r8 = r8 + r10
            float r8 = r8 + r1
            r0.y = r8
            r7 = 1110704128(0x42340000, float:45.0)
            float r7 = java.lang.Math.min(r7, r8)
            r8 = -1036779520(0xffffffffc2340000, float:-45.0)
            float r7 = java.lang.Math.max(r8, r7)
            r0.y = r7
            x5.k$a r7 = r6.f27198a0
            android.graphics.PointF r8 = r6.f27197Z
            x5.j$a r7 = (p407x5.C6955j.a) r7
            monitor-enter(r7)
            float r9 = r8.y     // Catch: java.lang.Throwable -> L72
            r7.f27191e0 = r9     // Catch: java.lang.Throwable -> L72
            r7.m14122b()     // Catch: java.lang.Throwable -> L72
            float[] r0 = r7.f27190d0     // Catch: java.lang.Throwable -> L72
            r1 = 0
            float r8 = r8.x     // Catch: java.lang.Throwable -> L72
            float r2 = -r8
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            android.opengl.Matrix.setRotateM(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r7)
            r7 = 1
            return r7
        L72:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent r1) {
            r0 = this;
            x5.k$a r1 = r0.f27198a0
            x5.j$a r1 = (p407x5.C6955j.a) r1
            x5.j r1 = r1.f27195i0
            boolean r1 = r1.performClick()
            return r1
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
            r0 = this;
            android.view.GestureDetector r1 = r0.f27200c0
            boolean r1 = r1.onTouchEvent(r2)
            return r1
    }
}
