package io.tacocrypto.app.utils.view;

/* loaded from: classes.dex */
public final class BlockParentScrollLayout extends android.widget.FrameLayout implements p227n0.InterfaceC4648g {

    /* renamed from: a0 */
    public p227n0.C4649h f14532a0;

    public BlockParentScrollLayout(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r3, r0)
            r2.<init>(r3, r4)
            n0.h r3 = r2.getScrollingChildHelper()
            r4 = 1
            r3.m10513k(r4)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            cg.k r4 = new cg.k
            r4.<init>(r2)
            r0 = 4000(0xfa0, double:1.9763E-320)
            r3.postDelayed(r4, r0)
            return
    }

    /* renamed from: a */
    public static void m7753a(io.tacocrypto.app.utils.view.BlockParentScrollLayout r1) {
            java.lang.String r0 = "this$0"
            p214m2.C4339q.m9706k(r1, r0)
            n0.h r1 = r1.getScrollingChildHelper()
            r0 = 1
            r1.m10513k(r0)
            return
    }

    private final p227n0.C4649h getScrollingChildHelper() {
            r1 = this;
            n0.h r0 = r1.f14532a0
            if (r0 != 0) goto Lb
            n0.h r0 = new n0.h
            r0.<init>(r1)
            r1.f14532a0 = r0
        Lb:
            n0.h r0 = r1.f14532a0
            p214m2.C4339q.m9704i(r0)
            return r0
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            n0.h r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m10503a(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            n0.h r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m10504b(r2, r3)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
            r1 = this;
            n0.h r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m10505c(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            n0.h r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m10508f(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
            r1 = this;
            n0.h r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.m10511i()
            return r0
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            n0.h r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.f18561d
            return r0
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            java.lang.String r0 = "event"
            p214m2.C4339q.m9706k(r3, r0)
            int r3 = r3.getActionMasked()
            r0 = 0
            if (r3 != 0) goto L14
            r3 = 1
            n0.h r1 = r2.getScrollingChildHelper()
            r1.m10514l(r3, r0)
        L14:
            return r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            java.lang.String r0 = "event"
            p214m2.C4339q.m9706k(r4, r0)
            int r0 = r4.getActionMasked()
            r1 = 0
            if (r0 == 0) goto L18
            r2 = 3
            if (r0 == r2) goto L10
            goto L20
        L10:
            n0.h r0 = r3.getScrollingChildHelper()
            r0.m10515m(r1)
            goto L20
        L18:
            r0 = 1
            n0.h r2 = r3.getScrollingChildHelper()
            r2.m10514l(r0, r1)
        L20:
            boolean r4 = super.onTouchEvent(r4)
            return r4
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r4) {
            r3 = this;
            n0.h r0 = r3.getScrollingChildHelper()
            boolean r1 = r0.f18561d
            if (r1 == 0) goto Lf
            android.view.View r1 = r0.f18560c
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.h.m10621z(r1)
        Lf:
            r0.f18561d = r4
            return
    }

    @Override // android.view.View
    public boolean startNestedScroll(int r3) {
            r2 = this;
            n0.h r0 = r2.getScrollingChildHelper()
            r1 = 0
            boolean r3 = r0.m10514l(r3, r1)
            return r3
    }

    @Override // android.view.View
    public void stopNestedScroll() {
            r2 = this;
            n0.h r0 = r2.getScrollingChildHelper()
            r1 = 0
            r0.m10515m(r1)
            return
    }
}
